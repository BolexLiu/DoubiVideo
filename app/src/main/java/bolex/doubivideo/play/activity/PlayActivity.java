package bolex.doubivideo.play.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.pili.pldroid.player.widget.PLVideoTextureView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bolex.doubivideo.MediaController;
import bolex.doubivideo.R;
import bolex.doubivideo.play.activity.entity.ItemNew;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PlayActivity extends AppCompatActivity {

    private String url;
    private String baseUrl = "http://vv.video.qq.com/";
    private PLVideoTextureView mVideoView;
    private String title;
    private TextView titleView;
    private MediaController mMediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        mVideoView = (PLVideoTextureView) findViewById(R.id.PLVtv);
        titleView = (TextView) findViewById(R.id.titleView);
        mMediaController = new MediaController(PlayActivity.this);
        mVideoView.setMediaController(mMediaController);
        getInUrl();
    }

    private void getInUrl() {
        url = getIntent().getStringExtra("url");
        title = getIntent().getStringExtra("title");
        titleView.setText(title);
        Pattern pattern = Pattern.compile("[^/]*$");
        Matcher m = pattern.matcher(url);
        m.find();
        String[] split = m.group(0).split("\\.");
        url = split[0];
        Retrofit retrofit = new Retrofit.Builder()
                //使用自定义的mGsonConverterFactory
                .baseUrl(baseUrl)
                .build();
        APi mApi = retrofit.create(APi.class);
        Call<ResponseBody> news = mApi.getNews(url, "json", "1", "0%2E9652906153351068");
        news.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String responseJs = response.body().string();
                    ItemNew itemNew = new Gson().fromJson(responseJs.replace("QZOutputJson=", "").replace(";", ""), ItemNew.class);
                    mVideoView.setVideoPath(itemNew.getVd().getVi().get(0).getUrl());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mVideoView.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mVideoView.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mVideoView.stopPlayback();
    }
}
