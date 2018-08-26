package com.io.wallet.bean;

import com.io.wallet.utils.StringUtils;

/**
 * Created by hwj on 2018/8/24.
 */

public class Xpub {
    private String alias;
    private String xpub;
    private String file;

    public Xpub(String xpub, String alias, String file) {
        this.alias = alias;
        this.xpub = xpub;
        this.file = file;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getXpub() {
        return xpub;
    }

    public void setXpub(String xpub) {
        this.xpub = xpub;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public static Xpub getXpubObj(String xpub) {
        return StringUtils.serializer.fromJson(xpub, Xpub.class);
    }

    public String toJson() {
        return StringUtils.serializer.toJson(this);
    }
}
