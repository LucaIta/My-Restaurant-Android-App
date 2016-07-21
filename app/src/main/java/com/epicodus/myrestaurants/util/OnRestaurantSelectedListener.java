package com.epicodus.myrestaurants.util;

import com.epicodus.myrestaurants.models.Restaurant;

import java.util.ArrayList;
import java.util.StringTokenizer;

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants, String source);
}
