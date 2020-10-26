package Menu;

public class Tea extends Food {
	
	private String color;
	public String getColor() {
		return color;
		}
		public void setColor(String color) {
		this.color = color;
		}
	
		public Tea(String color) {
		super("Tea");
		dop=color;
		this.color=color;
	}
	
		public String toString() {
			return super.toString() + " цветa " + dop.toUpperCase() + " ";
			}
	public void consume() {
		System.out.println(this + " съедено");
	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Tea)) return false;
		return dop.equals(((Tea)arg0).dop);
		} else
		return false;
		}

	public Double calculateCalories()       //подсчет калорий
    {
        if(color.equals("Green"))
        {
            calories = 35.0;
        }
        else if(color.equals("Black"))
        {
            calories = 50.0;
        }
        else if(color.equals("Red"))
        {
            calories = 40.0;
        }
        else return 0.0;
        return calories;
    }
}
