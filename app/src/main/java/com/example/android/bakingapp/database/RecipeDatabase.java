package com.example.android.bakingapp.database;

import com.example.android.bakingapp.model.IngredientColumns;
import com.example.android.bakingapp.model.RecipeColumns;
import com.example.android.bakingapp.model.StepColumns;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
 * Created by Kshitij on 02-07-2018.
 */

@Database(version = RecipeDatabase.VERSION,
        packageName = "com.example.android.bakingapp.provider")
public class RecipeDatabase {

    public static final int VERSION = 1;

    @Table(IngredientColumns.class)
    public static final String INGREDIENTS = "ingredients";

    @Table(RecipeColumns.class)
    public static final String RECIPES = "recipes";

    @Table(StepColumns.class)
    public static final String STEPS = "steps";
}