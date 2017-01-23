package bolex.doubivideo.main.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Slide;
import android.view.View;

import com.balysv.materialmenu.MaterialMenuDrawable;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bolex.doubivideo.R;
import bolex.doubivideo.main.adpter.QuickAdapter;
import bolex.doubivideo.main.entity.NewItem;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private RecyclerView my_content;
    private Toolbar mToolbar;
    private MaterialMenuDrawable materialMenu;
    private DrawerLayout drawerLayout;
    boolean isDrawerOpened;
    private Subscription subscribe;
    private QuickAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_content = (RecyclerView) findViewById(R.id.my_content);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        initToolBar();
        initRecycler();
        setupWindowAnimations();
    }

    private void initToolBar() {
        mToolbar.setTitle("主页");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }

            }
        });
        materialMenu = new MaterialMenuDrawable(this, Color.WHITE, MaterialMenuDrawable.Stroke.REGULAR);
        mToolbar.setNavigationIcon(materialMenu);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                materialMenu.setTransformationOffset(
                        MaterialMenuDrawable.AnimationState.BURGER_ARROW,
                        isDrawerOpened ? 2 - slideOffset : slideOffset
                );
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                isDrawerOpened = true;
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                isDrawerOpened = false;
            }
        });
    }

    private void initRecycler() {
        GridLayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 2);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        my_content.setLayoutManager(layoutManager);
        getMeiziFromServer();
    }


    private void setupWindowAnimations() {
        Slide slide = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            slide = new Slide();
            slide.setDuration(700);
            getWindow().setExitTransition(slide);
        }
    }

    private void getMeiziFromServer() {
        String url = "http://v.qq.com/vplus/xiaotaijiong/videos";
        subscribe = Observable.just(url).subscribeOn(Schedulers.io()).map(new Func1<String, List<NewItem>>() {
            @Override
            public List<NewItem> call(String url) {
                ArrayList<NewItem> is = new ArrayList<>();
                try {
                    Document doc = Jsoup.connect(url).timeout(10000).get();
                    Element total = doc.getElementById("videolst_cont");
                    Elements items = total.select("li");
                    for (Element element : items) {
                        Elements a = element.getElementsByTag("a");
                        String title = a.attr("title");
                        String pUrl = a.attr("href");
                        String imgUrl = a.select("img").attr("src");
                        String timeLength = a.select("span").select("em").text();
                        String playNum = element.getElementsByClass("info_inner").text();
                        String uploadTime = element.getElementsByClass("figure_info_time").text();
                        NewItem item = new NewItem(title, pUrl, imgUrl, timeLength, playNum, uploadTime);
                        is.add(item);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return is;
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<NewItem>>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<NewItem> items) {
                adapter = new QuickAdapter(items);
                adapter.openLoadAnimation();
                my_content.setAdapter(adapter);
            }
        });
    }
}
