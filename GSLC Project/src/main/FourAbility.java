package main;

public class FourAbility extends BaseCharacter implements IChef, IDriver, IWorker, IArtist {

	public FourAbility() {
		name = "Person No. 3";
		description = "Chef, Driver, Worker, Artist";
	}

	@Override
	public void Paint() {
		System.out.println(name + " can paint!");
	}

	@Override
	public void Work() {
		System.out.println(name + " can work!");
	}

	@Override
	public void Drive() {
		System.out.println(name + " can drive!");
	}

	@Override
	public void Cook() {
		System.out.println(name + " can cook!");
	}

}
