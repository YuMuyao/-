package com.fanxiaoyudemo.myapplication.JavaBean;

import android.graphics.drawable.Drawable;

import cn.bmob.v3.BmobObject;

public class Goods extends BmobObject {
    private String goods_name;
    private String category;
    private float price;

    private String seller_name;
    private String seller_id;
    private String buyer_name;
    private String buyer_id="nobody";
    private String release_time;

    private Drawable photo;
    private String details;


    public Goods(){

    }

    public Goods( String goods_name, String category, float price, String seller_name, String seller_id, String buyer_name, String buyer_id, String release_time, Drawable photo, String details) {
        this.goods_name = goods_name;
        this.category = category;
        this.price = price;
        this.seller_name = seller_name;
        this.seller_id = seller_id;
        this.buyer_name = buyer_name;
        this.buyer_id = buyer_id;
        this.release_time = release_time;
        //this.photo = photo;
        this.details = details;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPriceString(){
        return String.valueOf(price);
    }
}
