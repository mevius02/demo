package com.example.demo.enums;

/**
 * ユーザー権限
 */
public enum DeletedFlg {
    Deleted("true", "削除済"),
    UnDeleted("false", "未削除");

    private String cd;
    private String nm;

    private DeletedFlg(String cd, String nm) {
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
