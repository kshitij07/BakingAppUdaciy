package com.example.android.bakingapp.api;

import com.example.android.bakingapp.model.Recipe;
import com.example.android.bakingapp.model.RecipeAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kshitij on 02-07-2018.
 */

public class RecipeAPIClient {
    private static RecipeAPIClient client = new RecipeAPIClient();

    private RecipeAPI api;

    private RecipeAPIClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RecipeAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(RecipeAPI.class);
    }

    public static RecipeAPIClient getInstance() {
        return client;
    }

    public Call<List<Recipe>> getRecipes() {
        return api.getRecipes();
    }
}

