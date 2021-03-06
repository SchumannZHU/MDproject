package com.ssadamune.modular;

import java.util.HashSet;

public class Estate {
    private int id;
    private int areaCode;
    private int todofukenCode;
    private int shikugunCode;
    private int price10K;
    private String madori;
    private float totalArea;
    //完成時期(築年月) e.g. 197610
    private String completeDate;
    //入居時期(年月) 即入居可は 000000
    private String moveInDate;
    private byte direction;

    private HashSet<Integer> features = new HashSet<>();

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
    public int getTodofukenCode() {
        return todofukenCode;
    }
    public void setTodofukenCode(int todofukenCode) {
        this.todofukenCode = todofukenCode;
    }
    public int getShikugunCode() {
        return shikugunCode;
    }
    public void setShikugunCode(int shikugunCode) {
        this.shikugunCode = shikugunCode;
    }
    public int getPrice() {
        return price10K;
    }
    public void setPrice(int price) {
        this.price10K = price;
    }
    public String getMadori() {
        return madori;
    }
    public void setMadori(String madori) {
        this.madori = madori;
    }
    public float getTotalArea() {
        return totalArea;
    }
    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }
    public String getCompleteDate() {
        return completeDate;
    }
    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate;
    }
    public String getMoveInDate() {
        return moveInDate;
    }
    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }
    public byte getDirection() {
        return direction;
    }
    public void setDirection(byte direction) {
        this.direction = direction;
    }
    public void addFeature(int featureCode) {
        this.features.add(featureCode);
    }

    @Override
    public String toString() {
        return "物件 [ ID：" + this.id
                + ", 地域コード：" + areaCode
                + ", 都道府県コード：" + todofukenCode
                + ", 市区郡コード：" + shikugunCode
                + ", 価格：" + price10K + "万円"
                + ", 間取り：" + madori
                + ", 専用面積：" + totalArea
                + ", 完成時期：" + completeDate
                + ", 向き：" + direction
                + " ]\n"
                + "特徴 " + features
                + "\n";
    }

}
