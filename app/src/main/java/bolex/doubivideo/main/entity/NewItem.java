package bolex.doubivideo.main.entity;

/**
 * author：LiuShenEn on 2017/1/23 13:52
 */
public class NewItem {
    private String title;
    private String url;
    private String imgUrl;
    private String timeLength;
    private String playNum;
    private String uploadTime;

    public NewItem(String title, String url, String imgUrl, String timeLength, String playNum, String uploadTime) {
        this.title = title;
        this.url = url;
        this.imgUrl = imgUrl;
        this.timeLength = timeLength;
        this.playNum = playNum;
        this.uploadTime = uploadTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    public String getPlayNum() {
        return playNum;
    }

    public void setPlayNum(String playNum) {
        this.playNum = playNum;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
}
