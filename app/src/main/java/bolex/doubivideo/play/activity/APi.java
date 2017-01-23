package bolex.doubivideo.play.activity;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APi {

    @GET("geturl")
    Call<ResponseBody> getNews(@Query("vid") String vid, @Query("otype")String otype, @Query("platform")String platform, @Query("ran")String ran);
}