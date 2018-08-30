package com.io.wallet.bean;

import com.io.wallet.utils.StringUtils;

import java.util.List;

public class Account {
    private String id;
    private String alias;
    private String type;
    private List xpubs;
    private int quorum;
    private int key_index;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List getXpubs() {
        return xpubs;
    }

    public int getQuorum() {
        return quorum;
    }

    public void setQuorum(int quorum) {
        this.quorum = quorum;
    }

    public void setXpubs(List xpubs) {
        this.xpubs = xpubs;
    }

    public int getKey_index() {
        return key_index;
    }

    public void setKey_index(int key_index) {
        this.key_index = key_index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String toJson() {
        return StringUtils.serializer.toJson(this);
    }
}
