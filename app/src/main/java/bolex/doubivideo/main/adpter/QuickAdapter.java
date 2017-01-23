package bolex.doubivideo.main.adpter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import bolex.doubivideo.R;
import bolex.doubivideo.main.entity.NewItem;
import bolex.doubivideo.play.activity.PlayActivity;

public class QuickAdapter extends BaseQuickAdapter<NewItem, BaseViewHolder> {
    public QuickAdapter(List<NewItem> items) {
        super(R.layout.news_item, items);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, final NewItem item) {
        viewHolder.setText(R.id.news_title, item.getTitle()).setText(R.id.news_time, item.getTimeLength()).setText(R.id.news_playNum, item.getPlayNum());
        Glide.with(mContext).load(item.getImgUrl()).crossFade().override(120, 90).into((ImageView) viewHolder.getView(R.id.news_img));
        viewHolder.getView(R.id.view_diffuse_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PlayActivity.class);
                intent.putExtra("url", item.getUrl());
                intent.putExtra("title", item.getTitle());
                if (Build.VERSION.SDK_INT >= 21) {
                    // 使用api11 新加 api的方法
                    String transitionName = view.getContext().getString(R.string.breakP);
                    ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) view.getContext(), view, transitionName);
                    view.getContext().startActivity(intent, transitionActivityOptions.toBundle());
                } else {
                    view.getContext().startActivity(intent);
                }
            }
        });
    }
}