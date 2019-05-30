package main;

public class AnyAbility2 extends BaseCharacter implements IWorker, IArtist {

	public AnyAbility2() {
		name = "Person No. 5";
		description = "Worker, Artist";
	}

	@Override
	public void Work() {
		System.out.println(name + " can work!");
	}

	@Override
	public void Paint() {
		System.out.println(name + " can paint!");
	}

}
