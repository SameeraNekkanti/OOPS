package labEvalTwo;
import java.util.Scanner;

abstract class Animal{
	String name;
	String type;
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public abstract double getDiet();
	
	public void printDiet() {
		System.out.println(name + " (" + type + ") requires " + getDiet() + " calories.");
		
	}
	
}
class Predator extends Animal{
	private double weight;

	public Predator(String name,double weight) {
		super(name, "Predator");
		this.weight = weight;
	}
	@Override
    public double getDiet() {
        return weight * 1.5;
	}
	
}
class Prey extends Animal {
    public Prey(String name) {
        super(name, "Prey");
    }

    @Override
    public double getDiet() {
        return 2000.0;
    }
}
public class ConservationCenter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.nextLine();
		Animal[] animals=new Animal[n];
		for (int i = 0; i < n; i++) {
			String type = sc.next();

            switch (type) {
                case "Predator":
                    String nameP = sc.next();
                    double weight = sc.nextDouble();
                    animals[i] = new Predator(nameP, weight);
                    break;

                case "Prey":
                    String namePr = sc.next();
                    animals[i] = new Prey(namePr);
                    break;
            }
		}
	
		for(Animal a: animals) {
			a.printDiet();
		}
		sc.close();
	}
}
