package Menu;

public class Cheese extends Food {
	
	public Cheese() {
		super("Cheese");
	}

	public String toString() {
		return super.toString();
		}
	public void consume() {
		System.out.println(this + " съедено");
		}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Cheese)) return false;
		return true;
		} else
		return false;
		}
	public Double calculateCalories()       //подсчет калорий
    {
        calories = 289.0;
        return calories;
    }
}
