import java.util.Scanner;

public class Test {
	
    private static Singers singers = new Singers();   //Objemizi özellik olarak tanýmladýk baþka metodlarýn için de de kullanabilmek için.
    
    private static Scanner scanner = new Scanner (System.in);
	
    public static void show_transactions() {
    	
    	System.out.println("\t 0 : Show Transactions ");
    	System.out.println("\t 1 : Show Singers ");
    	System.out.println("\t 2 : Add Singer ");
    	System.out.println("\t 3 : Update Singer ");
    	System.out.println("\t 4 : Delete Singer ");
    	System.out.println("\t 5 : Find a Singer ");
    	System.out.println("\t 6 : Exit ");
    	
    	
    }
    
	public static void show_singers() {
		singers.show_singers();
		
	}
	
	public static void add_singer() {
		System.out.println("Please enter the name of the singer you want to add:");
	    
		String name = scanner.nextLine();
		singers.add_singer(name);
		
	}
	
    public static void update_singer() {
		System.out.println("Please enter the index number of the singer you want to update : ");
	    
		int index = scanner.nextInt();
		scanner.nextLine();
		
		String new_name = scanner.nextLine();
		singers.update_singer(new_name, index-1);
		
	}
    
    public static void deleted_singer() {
		
    	System.out.println("Please enter the index number of the singer you want to delete : ");
		
    	int index = scanner.nextInt();
    	scanner.nextLine();
    	singers.deleted_singer(index-1);
	}
    
    public static void find_singer() {
    	

    System.out.println("Please enter the name of the artist you want to find: ");
    String name = scanner.nextLine();
		
	singers.find_singer(name);
	}
    
    public static void main(String[] args) {
    	
    	
    	System.out.println("\t Welcome to the singer app!");
    	
    	System.out.println("*******************************************");
    	
    	show_transactions();
    	
    	System.out.println("*******************************************");
    	
    	boolean exit = false;
    	
    	int transactions;
    	

    	
    	while (!exit) {           //çýkýþ false deðeriy di not exit true deðeri oluyor.
    		
        	System.out.println("Choose transactions : ");
        	transactions = scanner.nextInt();
        	scanner.nextLine();
        	
    		switch (transactions) {
    			
    		  
    		case 0:
    		  
    		show_transactions();
    			
    		break;
    			
    		
    		
    		case 1:
    			
    		show_singers();
    		
    		break;
    		
    		
    		case 2:
    			
    	    add_singer();
    	    
    	    break;
    	    
    	    
    		case 3:
    			
    	    update_singer ();
    	    
    	    break;
    	    
    		case 4:
    			
    	    deleted_singer	();
    	    
    	    break;
    	    
    		case 5:
    			
    		find_singer ();
    		
    		break;
    		
    		case 6:
    			
    		exit = true;
    			
    		System.out.println("Exiting the application!");
    			
    		break;
    		}
    	}
		

	}
	
	


}
