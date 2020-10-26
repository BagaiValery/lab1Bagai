package Menu;

import java.util.*;
import java.lang.reflect.Constructor;

@SuppressWarnings("unused")
public class Menu {

	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) 
	{
		Food[] breakfast = new Food[20];
		int i=0;
		for (String arg: args) { 
				String[] parts = arg.split("/");
				if (parts[0].equals("Tea")) {
					 breakfast[i] = new Tea(parts[1]);
					} else
				if (parts[0].equals("Apple")) {
					 breakfast[i] = new Apple(parts[1]);
					 }
					if (parts[0].equals("Cheese")) {
						 breakfast[i] = new Cheese();
					}
					i++;
				if (parts[0].equals("-sort"))
					 {    Arrays.sort(breakfast, new Comparator<Object>() {public int compare(Object o1,Object o2) {
					    if (o1 == null || ((Food)o1).name.length() > ((Food)o2).name.length())
					    return 1;
					    if (o2 == null || ((Food)o1).name.length() < ((Food)o2).name.length())
					        return -1;
					    else return 0;}
					});
					 System.out.println("Съедено на завтрак:");
			            for (Food item : breakfast)
			            {
			                if (item != null)
			                {
			                    if (item.calculateCalories()==0.0)
			                        continue;
			                    item.consume();
			                    System.out.println(" " + item.calculateCalories());
			                }
			                else
			                    break;
			            }
			        }
				if (parts[0].equals("-calories"))
				{                            
		            double CaloriesCounter = 0.0;
		            for (Food item : breakfast)
		            {
		                if (item != null)
		                    CaloriesCounter += item.calculateCalories();
		                else
		                    break;
		            }
		            System.out.println("Общее количество калорий: " + CaloriesCounter);

		        }
			}
			
	
		for (int j=0; j<breakfast.length; j++)
			 if (breakfast[j]!=null)
			 breakfast[j].consume();
			 else break;
	}
}
