package main;

public class AnyAbility1 extends BaseCharacter implements IChef, IDriver {

	public AnyAbility1() {
		name = "Person No. 4";
		description = "Chef, Driver";
	}

	@Override
	public void Cook() {
		System.out.println(name + " can cook!");
	}

	@Override
	public void Drive() {
		System.out.println(name + " can drive!");
	}

}
