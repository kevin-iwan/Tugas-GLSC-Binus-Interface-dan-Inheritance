package main;

public class AnyAbility3 extends BaseCharacter implements IDriver {

	public AnyAbility3() {
		name = "Person No. 6";
		description = "Driver";
	}

	@Override
	public void Drive() {
		System.out.println(name + " can drive!");
	}
	
}
