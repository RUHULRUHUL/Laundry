package com.example.laundry.models;

public class Itemlist {
    private int image;
    private String imagename;
    private double imageprice;

    public Itemlist() {
    }

    public int getImage() {
        return image;
    }

    public String getImagename() {
        return imagename;
    }

    public double getImageprice() {
        return imageprice;
    }

    public Itemlist(int image, String imagename, double imageprice) {
        this.image = image;
        this.imagename = imagename;
        this.imageprice = imageprice;
    }



}
