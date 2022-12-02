package com.example.demo.enums;

/**
 * 性別
 */
public enum Gender {
    None(0, ""), Man(1, "男"), Woman(2, "女");

    private int cd;
    private String nm;

    private Gender(int cd, String nm) {
        this.cd = cd;
        this.nm = nm;
    }

    public int getCd() {
        return this.cd;
    }

    public String getNm() {
        return this.nm;
    }
}
