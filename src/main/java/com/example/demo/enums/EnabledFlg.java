package com.example.demo.enums;

/**
 * ユーザー権限
 */
public enum EnabledFlg {
    Enabled("true", "有効"),
    Disabled("false", "無効");

    private String cd;
    private String nm;

    private EnabledFlg(String cd, String nm) {
        this.cd = cd;
        this.nm = nm;
    }

    public String getCd() {
        return this.cd;
    }

    public String getNm() {
        return this.nm;
    }
}
