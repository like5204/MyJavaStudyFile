class Plate{
	public Plate(int i){
		System.out.println("Plate constructor");
		}
	}

class DinnerPlate extends Plate{
	public DinnerPlate(int i){
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil{
	Utensil(int i){
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil{
	public Spoon(int i){
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil{
	public Fork(int i){
		super(i);
		System.out.println("Fork constructor");
	}
}
class Knife extends Utensil{
	public Knife(int i){
		super(i);
		System.out.println("Knife constructor");
	}
}

class Custom{
	public Custom(int i){
		System.out.println("Custom constructor");
	}
}

public class PlaceSetting extends Custom{
	Spoon sp;
	Fork frk;
	Knife kn;
	DinnerPlate pl;
	public PlaceSetting(int i){
		super(i+1);
		sp = new Spoon(i+2);
		frk = new Fork(i+3);
		pl = new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor");
	}

	public static void main(String[] args)
	{

		PlaceSetting x = new PlaceSetting(9);
	}
}
