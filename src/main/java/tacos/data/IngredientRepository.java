package tacos.data;

import tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findByID(String id);
    Ingredient save(Ingredient ingredient);
}
