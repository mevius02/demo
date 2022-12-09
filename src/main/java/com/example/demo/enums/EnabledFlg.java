package com.example.demo.enums;

import org.thymeleaf.util.StringUtils;

/**
 * ユーザー有効フラグ
 */
public enum EnabledFlg {
    Enabled(true, "有効"),
    Disabled(false, "無効");

    private boolean cd;
    private String nm;

    private EnabledFlg(boolean cd, String nm) {
        this.cd = cd;
        this.nm = nm;
    }

    public boolean getCd() {
        return this.cd;
    }

    public String getNm() {
        return this.nm;
    }

    public static Boolean getCd(String nm) {
        for (EnabledFlg enabledFlg : EnabledFlg.values()) {
            if (StringUtils.equals(nm, enabledFlg.getNm())) {
                return enabledFlg.cd;
            }
        }
        return null;
    }

    public static String getNm(boolean cd) {
        for (EnabledFlg enabledFlg : EnabledFlg.values()) {
            if (cd == enabledFlg.getCd()) {
                return enabledFlg.nm;
            }
        }
        return null;
    }
}
