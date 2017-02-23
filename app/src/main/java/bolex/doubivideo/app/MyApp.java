package bolex.doubivideo.app;

import android.app.Application;

import java.util.List;

import bolex.doubivideo.main.entity.NewItem;

/**
 * author：LiuShenEn on 2017/2/6 14:57
 */
public class MyApp extends Application {
    static MyApp app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = MyApp.this;
    }

    public static MyApp getApp() {
        return app;
    }

    List<NewItem> palyDatas;

    public List<NewItem> getPalyDatas() {
        return palyDatas;
    }

    public void setPalyDatas(List<NewItem> palyDatas) {
        this.palyDatas = palyDatas;
    }


}
