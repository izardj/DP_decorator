package metier;

public class Chocoloat extends DecoratorIngredient {

	public Chocoloat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + ", Chocolat";
	}

	@Override
	public double cout() {
		return 0.20 + boisson.cout();
	}

}
