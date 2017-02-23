package bolex.doubivideo.play.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.pili.pldroid.player.widget.PLVideoTextureView;

import java.util.List;

import bolex.doubivideo.MediaController;
import bolex.doubivideo.R;
import bolex.doubivideo.app.MyApp;
import bolex.doubivideo.main.entity.NewItem;
import bolex.doubivideo.play.activity.adpter.PlayAdapter;
import io.github.luckyandyzhang.cleverrecyclerview.CleverRecyclerView;

public class PlayActivity extends AppCompatActivity {

    private String url;
    private String baseUrl = "http://vv.video.qq.com/";
    private String title;
    private TextView titleView;
    private MediaController mMediaController;
    private CleverRecyclerView palyRV;
    private PLVideoTextureView plVtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        titleView = (TextView) findViewById(R.id.titleView);
        plVtv = (PLVideoTextureView) findViewById(R.id.PLVtv);
        getInUrl();


//        urlTodetalUrl();
    }

    private void urlTodetalUrl() {
//        palyRV = (CleverRecyclerView) findViewById(R.id.palyRV);
        final List<NewItem> palyDatas = MyApp.getApp().getPalyDatas();
        PlayAdapter playAdapter = new PlayAdapter(palyDatas);
        palyRV.setAdapter(playAdapter);
        palyRV.setScrollAnimationDuration(600);
        palyRV.setOrientation(RecyclerView.HORIZONTAL);
        palyRV.setVisibleChildCount(1);
        palyRV.setSlidingThreshold(0.1f);
        palyRV.setOnPageChangedListener(playAdapter);
        palyRV.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() {
            @Override
            public void onChildViewAttachedToWindow(View view) {
                PLVideoTextureView PLVtv = (PLVideoTextureView) view.findViewById(R.id.PLVtv);
                PLVtv.setVideoPath(palyDatas.get((int) PLVtv.getCurrentPosition()).getUrl());
            }

            @Override
            public void onChildViewDetachedFromWindow(View view) {
                PLVideoTextureView PLVtv = (PLVideoTextureView) view.findViewById(R.id.PLVtv);
                PLVtv.pause();
            }
        });

    }

    private void getInUrl() {
        url = getIntent().getStringExtra("url");
        title = getIntent().getStringExtra("title");
        titleView.setText(title);
        MediaController iMediaController = new MediaController(PlayActivity.this);
        plVtv.setMediaController(iMediaController);
        plVtv.setVideoPath(url);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        plVtv.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        plVtv.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        plVtv.stopPlayback();
        finish();
    }
}
