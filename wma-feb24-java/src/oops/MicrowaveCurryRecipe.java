package oops;

public class MicrowaveCurryRecipe extends AbstractionRecipe{

	@Override
	void prepareIngredient() {
		System.out.println("microwave getting vegetables");
		
	}

	@Override
	void cookieRecipe() {
		System.out.println("microwave stream and dry foods");
		
	}

	@Override
	void cleanUp() {
		System.out.println("microwave Discard unused vegetable");
		
	}

}
