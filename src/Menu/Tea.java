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
		this.color=color;
	}
	
		public String toString() {
			return super.toString() + " ����a " + color.toUpperCase() + " ";
			}
	public void consume() {
		System.out.println(this + " �������");
	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Tea)) return false;
		return color.equals(((Tea)arg0).color);
		} else
		return false;
		}

	public Double calculateCalories()       //������� �������
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
