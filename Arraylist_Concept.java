import java.util.ArrayList;

public class Arraylist_Concept {

	public static void main(String[] args) {
		
		ArrayList<String>food = new ArrayList<String>();
		
		//To add elements in ArrayList:
		food.add("pizza");
		food.add("burger");
		food.add("apple juice");

//		food.set(0,"cake"); //To initalize the item at perticular index:
							//Now, "pizza" will get replaced by "cake".
		//Now,
		//item at index 2 will be removed i.e pizza.
//		food.remove(2);
		
//		food.clear();//This function is to clear ArrayList.
		
		for(int i=0; i<food.size(); i++) {
			
		  System.out.println(food.get(i)); //{get(i)} for print the ArrayList
	   }
		
			  System.out.println(food);
	}

}
/*======output=====
 	pizza
	burger
	apple juice
	[pizza, burger, apple juice]

  */
