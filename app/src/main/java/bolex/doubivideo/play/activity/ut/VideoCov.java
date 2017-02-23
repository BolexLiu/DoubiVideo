package bolex.doubivideo.play.activity.ut;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bolex.doubivideo.main.entity.NewItem;
import bolex.doubivideo.play.activity.APi;
import bolex.doubivideo.play.activity.entity.ItemNew;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * author：LiuShenEn on 2017/2/6 18:16
 */
public class VideoCov {
    private String baseUrl = "http://vv.video.qq.com/";

    public List<NewItem> convertVidioUrl(List<NewItem> list) {
        for (NewItem item: list) {
            String url = item.getUrl();
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
            try {
                Response<ResponseBody> response = news.execute();// 同步
                String responseJs = response.body().string();
                ItemNew itemNew = new Gson().fromJson(responseJs.replace("QZOutputJson=", "").replace(";", ""), ItemNew.class);
                item.setUrl(itemNew.getVd().getVi().get(0).getUrl());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
