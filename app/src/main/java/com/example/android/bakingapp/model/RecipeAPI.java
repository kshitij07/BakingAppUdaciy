package com.example.android.bakingapp.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kshitij on 02-07-2018.
 */

public interface RecipeAPI {
    String BASE_URL = "https://d17h27t6h515a5.cloudfront.net";

    @GET("topher/2017/May/59121517_baking/baking.json")
    Call<List<Recipe>> getRecipes();
}
