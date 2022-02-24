package colletionframework;

public class ArrayList {
public static void main(String[] args) {
		
		  ArrayList obj= new ArrayList();
		   obj.add("Vasu");
		   obj.add("Sharma");
		   obj.add(11800297);
		   obj.add(0, "vasu");
		   obj.remove(Integer.valueOf(11800297));     
		  // obj.clear();
		   System.out.println(obj);
		   
		   
		   ArrayList obj2 = new ArrayList();
		   obj2.add("Anuj");
		   obj2.add("Bhandari");
		   obj2.add(11700170);
		   
		   System.out.println(obj2);
		   
		   
		   obj.addAll(obj2);
		   System.out.println(obj);


			}

		}

	}

}
