package oops;

public class CurryRecipe extends AbstractionRecipe {
	
	public CurryRecipe() {
		System.out.println("curry recipes");
	}

	@Override
	void prepareIngredient() {
		System.out.println("get vegtable");
		
	}

	@Override
	void cookieRecipe() {
		System.out.println("stream and dry foods");
		
	}

	@Override
	void cleanUp() {
System.out.println("Discard unused vegetable");		
	}

	
}
