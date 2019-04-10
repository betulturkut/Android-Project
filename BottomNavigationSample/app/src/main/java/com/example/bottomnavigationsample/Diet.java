package com.example.bottomnavigationsample;

public class Diet {
    int foodPicture;
    String foodName;
    String totalCalorite;

    public Diet(int foodPicture, String foodName, String totalCalorite){
        this.foodPicture = foodPicture;
        this.foodName = foodName;
        this.totalCalorite = totalCalorite;
    }

    public int getFoodPicture() {
        return foodPicture;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getTotalCalorite() {
        return totalCalorite;
    }
}
