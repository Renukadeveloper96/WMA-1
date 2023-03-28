package oops;

public abstract class AbstractionRecipe {

	public void excecut() {
		prepareIngredient();
		cookieRecipe();
		cleanUp();
		
	}
	abstract void prepareIngredient();
	abstract void cookieRecipe();
	abstract void cleanUp();
	
}
