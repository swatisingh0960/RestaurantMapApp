package comswatisingh0960.httpsgithub.restaurantmap.utils;

import java.util.ArrayList;

import comswatisingh0960.httpsgithub.restaurantmap.models.Restaurant;

/**
 * Created by Swati on 11/29/2016.
 */

public class SavedListHolder {

    private static SavedListHolder instance = null;
    private static ArrayList<Restaurant> savedList;

    public static SavedListHolder getInstance() {
        if (instance == null) {
            savedList = new ArrayList<>();
            instance = new SavedListHolder();
        }

        return instance;
    }

    public ArrayList<Restaurant> getSavedList() {
        return savedList;
    }

    public void setSavedList(ArrayList<Restaurant> list) {
        savedList = list;
    }
}
