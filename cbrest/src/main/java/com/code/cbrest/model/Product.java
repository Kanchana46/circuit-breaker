package com.code.cbrest.model;

public class Product {

    private int id;
    private String title;
    private double price;
    private String description;
    private Rating rating;

    public static class Rating {
        private double rate;
        private int count;

        public void setCount(int count) {
            this.count = count;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }

        public int getCount() {
            return count;
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Rating getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
