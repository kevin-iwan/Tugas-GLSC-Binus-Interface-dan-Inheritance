package main;

public class OneAbility extends BaseCharacter implements IChef {

	public OneAbility() {
		name = "Person No. 2";
		description = "Chef";
	}

	@Override
	public void Cook() {
		System.out.println(name + " can cook!");
	}
	
}
