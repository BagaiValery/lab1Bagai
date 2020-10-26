package Menu;

import java.util.*;
import java.lang.reflect.Constructor;

@SuppressWarnings("unused")
public class Menu {

//	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) 
	{
		Food[] breakfast = new Food[20];
		boolean sor=false, cal=false; 
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
					 sor = true;
				if (parts[0].equals("-calories"))
				cal = true;
			          }
			
		if (cal)
			{                            
	            double CaloriesCounter = 0.0;
	            for (Food item : breakfast)
	            {
	                if (item != null)
	                    CaloriesCounter += item.calculateCalories();
	                else
	                    break;
	            }
	            System.out.println("ќбщее количество калорий: " + CaloriesCounter);
			}
	if (sor)
	 {    Arrays.sort(breakfast, new Comparator<Object>() {public int compare(Object o1,Object o2) {
		    if (o1 == null || ((Food)o1).name.length() > ((Food)o2).name.length())
		    return 1;
		    if (o2 == null || ((Food)o1).name.length() < ((Food)o2).name.length())
		        return -1;
		    else return 0;}
		});
	 } 
	int apple1, apple2, apple3, eatcheese, tea1, tea2, tea3;
     apple1=apple2=apple3=eatcheese=tea1=tea2=tea3=0;
     for(Food item: breakfast)                            
     {   
    	 if(item == null)
             break;
    	 if(item.name.equals("Apple"))
         {
             if(item.dop.equals("Little"))
                 apple1++;
             else if(item.dop.equals("Middle"))
                 apple2++;
             else if(item.dop.equals("Big"))
                apple3++;
         }
         if(item.name.equals("Cheese"))
             eatcheese++;
         if(item.name.equals("Tea"))
         {
        	 if(item.dop.equals("Black"))
                 tea1++;
             else if(item.dop.equals("Red"))
                 tea2++;
             else if(item.dop.equals("Green"))
                tea3++;
         }
      
     }
	 System.out.println("—ъедено на завтрак:");
     for (Food item : breakfast)
     {
         if (item != null)
         {
             item.consume();
             System.out.println(" " + item.calculateCalories());
            
         }
         else
             break;
     } 
     System.out.println("¬сего съедено: " + apple1 + " маленьких €блок; " +  apple2 + " средних €блок;" + apple3 + " больших €блок;");
             System.out.println("—ыра -" + eatcheese);
             System.out.println("¬ыпито ча€: " + tea1 + " чЄрного; " +  tea2 + " красного;" + tea3 + " зелЄного;");
	}
}
