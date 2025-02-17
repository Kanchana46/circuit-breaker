package com.code.cb.dto;

public class Product {

    private int id;
    private String title;
    private double price;
    private String description;
    private Rating rating;

    public static class Rating {
        private double rate;
        private int count;

       public double getRate() {
           return rate;
       }

       public void setRate(double rate) {
           this.rate = rate;
       }

       public int getCount() {
           return count;
       }

       public void setCount(int count) {
           this.count = count;
       }
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

}
