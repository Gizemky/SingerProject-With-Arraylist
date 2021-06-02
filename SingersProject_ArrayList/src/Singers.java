import java.util.ArrayList;

public class Singers {
	
	private ArrayList<String> singer_list = new ArrayList<String> ();

	
	
public void show_singers() {
		
		
	System.out.println("Number of singers in the singer list : " + singer_list .size());
	
	  for (int i = 0 ; i< singer_list.size(); i++) {
	
	     System.out.println((i+1) + singer_list.get(i));
	
	  }
}

public void add_singer (String name) {
	
	singer_list.add(name);
	
	System.out.println("Singer list updated");
	
	  
}  
public void update_singer (String new_name, int index) {
	
	singer_list.set(index, new_name);
	
	System.out.println("Singer list updated");
	 
	 
}

public void deleted_singer (int index ) {
	
	String name = singer_list.get(index);
	singer_list.remove(index);
	
	System.out.println(name + ": Singer Deleted");
	
}

public void find_singer (String name) {
	
	int index = singer_list.indexOf(name);
	
	if (index >= 0) {
     
		System.out.println("The singer is on the list");
		
		System.out.println ("Singer's sequence number : " +(index+1));
	}
	
	else {
		
		System.out.println("The singer is not listed.");
		
		
	}
	
	
}
}


