package bolex.doubivideo.play.activity.entity;

import java.util.List;

/**
 * author：LiuShenEn on 2017/1/23 17:24
 */
public class ItemNew {
    /**
     * br : 62332.015625
     * s : o
     * sf : 0
     * sp : 0
     * sr : 0
     * vd : {"nt":1,"vi":[{"br":60,"ch":0,"dt":2,"dur":"207.31","fmd5":"5a8da522b6d01dccd25c3407401d39d8","fs":12922050,"keyid":"s0369xgwte6.2","level":40,"lnk":"s0369xgwte6","st":2,"type":9,"url":"http://175.6.26.24/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","urlbk":{"ui":[{"dt":2,"url":"http://175.6.26.22/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":200},{"dt":2,"url":"http://175.6.26.12/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":200},{"dt":2,"url":"http://video.dispatch.tc.qq.com/68857386/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":0}]},"videotype":3,"vt":200}]}
     */

    private double br;
    private String s;
    private int sf;
    private int sp;
    private int sr;
    private VdBean vd;

    public double getBr() {
        return br;
    }

    public void setBr(double br) {
        this.br = br;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getSf() {
        return sf;
    }

    public void setSf(int sf) {
        this.sf = sf;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getSr() {
        return sr;
    }

    public void setSr(int sr) {
        this.sr = sr;
    }

    public VdBean getVd() {
        return vd;
    }

    public void setVd(VdBean vd) {
        this.vd = vd;
    }

    public static class VdBean {
        /**
         * nt : 1
         * vi : [{"br":60,"ch":0,"dt":2,"dur":"207.31","fmd5":"5a8da522b6d01dccd25c3407401d39d8","fs":12922050,"keyid":"s0369xgwte6.2","level":40,"lnk":"s0369xgwte6","st":2,"type":9,"url":"http://175.6.26.24/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","urlbk":{"ui":[{"dt":2,"url":"http://175.6.26.22/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":200},{"dt":2,"url":"http://175.6.26.12/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":200},{"dt":2,"url":"http://video.dispatch.tc.qq.com/68857386/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":0}]},"videotype":3,"vt":200}]
         */

        private int nt;
        private List<ViBean> vi;

        public int getNt() {
            return nt;
        }

        public void setNt(int nt) {
            this.nt = nt;
        }

        public List<ViBean> getVi() {
            return vi;
        }

        public void setVi(List<ViBean> vi) {
            this.vi = vi;
        }

        public static class ViBean {
            /**
             * br : 60
             * ch : 0
             * dt : 2
             * dur : 207.31
             * fmd5 : 5a8da522b6d01dccd25c3407401d39d8
             * fs : 12922050
             * keyid : s0369xgwte6.2
             * level : 40
             * lnk : s0369xgwte6
             * st : 2
             * type : 9
             * url : http://175.6.26.24/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4
             * urlbk : {"ui":[{"dt":2,"url":"http://175.6.26.22/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":200},{"dt":2,"url":"http://175.6.26.12/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":200},{"dt":2,"url":"http://video.dispatch.tc.qq.com/68857386/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4","vt":0}]}
             * videotype : 3
             * vt : 200
             */

            private int br;
            private int ch;
            private int dt;
            private String dur;
            private String fmd5;
            private int fs;
            private String keyid;
            private int level;
            private String lnk;
            private int st;
            private int type;
            private String url;
            private UrlbkBean urlbk;
            private int videotype;
            private int vt;

            public int getBr() {
                return br;
            }

            public void setBr(int br) {
                this.br = br;
            }

            public int getCh() {
                return ch;
            }

            public void setCh(int ch) {
                this.ch = ch;
            }

            public int getDt() {
                return dt;
            }

            public void setDt(int dt) {
                this.dt = dt;
            }

            public String getDur() {
                return dur;
            }

            public void setDur(String dur) {
                this.dur = dur;
            }

            public String getFmd5() {
                return fmd5;
            }

            public void setFmd5(String fmd5) {
                this.fmd5 = fmd5;
            }

            public int getFs() {
                return fs;
            }

            public void setFs(int fs) {
                this.fs = fs;
            }

            public String getKeyid() {
                return keyid;
            }

            public void setKeyid(String keyid) {
                this.keyid = keyid;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getLnk() {
                return lnk;
            }

            public void setLnk(String lnk) {
                this.lnk = lnk;
            }

            public int getSt() {
                return st;
            }

            public void setSt(int st) {
                this.st = st;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public UrlbkBean getUrlbk() {
                return urlbk;
            }

            public void setUrlbk(UrlbkBean urlbk) {
                this.urlbk = urlbk;
            }

            public int getVideotype() {
                return videotype;
            }

            public void setVideotype(int videotype) {
                this.videotype = videotype;
            }

            public int getVt() {
                return vt;
            }

            public void setVt(int vt) {
                this.vt = vt;
            }

            public static class UrlbkBean {
                private List<UiBean> ui;

                public List<UiBean> getUi() {
                    return ui;
                }

                public void setUi(List<UiBean> ui) {
                    this.ui = ui;
                }

                public static class UiBean {
                    /**
                     * dt : 2
                     * url : http://175.6.26.22/vhot2.qqvideo.tc.qq.com/s0369xgwte6.mp4?vkey=DEF1FD3C65560622157DECE9526957018A2309158270699D324E590A596EFC03F1F523F0C9F3673A6F098BDFC96674350F4993F81B1C79683ADA673B70F0E38A87882F0E961890ECCC73F62E1B6E5DD28D3F8A8CE368C2D3E0CC27CCF14D6322&br=62332&platform=1&fmt=mp4&level=0&type=mp4
                     * vt : 200
                     */

                    private int dt;
                    private String url;
                    private int vt;

                    public int getDt() {
                        return dt;
                    }

                    public void setDt(int dt) {
                        this.dt = dt;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getVt() {
                        return vt;
                    }

                    public void setVt(int vt) {
                        this.vt = vt;
                    }
                }
            }
        }
    }
}
