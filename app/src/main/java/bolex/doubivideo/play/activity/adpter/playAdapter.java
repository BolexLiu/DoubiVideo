package bolex.doubivideo.play.activity.adpter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.pili.pldroid.player.widget.PLVideoTextureView;

import java.util.List;

import bolex.doubivideo.MediaController;
import bolex.doubivideo.R;
import bolex.doubivideo.main.entity.NewItem;
import io.github.luckyandyzhang.cleverrecyclerview.CleverRecyclerView;

import static bolex.doubivideo.R.id.PLVtv;

public class PlayAdapter extends BaseQuickAdapter<NewItem, BaseViewHolder> implements CleverRecyclerView.OnPageChangedListener {


    private PLVideoTextureView mVideoView;

    public PlayAdapter(List<NewItem> items) {
        super(R.layout.play_item, items);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, final NewItem item) {
        mVideoView = viewHolder.getView(PLVtv);
        MediaController  iMediaController = new MediaController(mContext);
        mVideoView.setMediaController(iMediaController);
        mVideoView.setVideoPath(item.getUrl());
    }


    @Override
    public void onPageChanged(final int i) {
        mVideoView.setVideoPath(getItem(i).getUrl());
    }
}