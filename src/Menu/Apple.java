package Menu;

public class Apple extends Food {

	private String size;
	public String getSize() {
		return size;
		}
	public void setSize(String size) {
		this.size = size;
		}

	public Apple(String size) {
		super("Apple");
		this.size = size;
	}
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
		}
	public void consume() {
		System.out.println(this + " съедено");
		}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Apple)) return false;
		return size.equals(((Apple)arg0).size);
		} else
		return false;
		}
	
	public Double calculateCalories()       //подсчет калорий
    {
        if(size.equals("маленькое"))
        {
            calories = 10.0;
        }
        else if(size.equals("среднее"))
        {
            calories = 61.0;
        }
        else if(size.equals("большое"))
        {
            calories = 129.0;
        }
        else return 0.0;
        return calories;
    }
}
