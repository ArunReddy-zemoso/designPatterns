package bridgeDesign;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CRUD operations=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user");
        String user=scanner.nextLine();
        if( user.equals("arun")){
            operations = new CRUDOnDatabase();
        }
        else if( user.equals("kumar")){
            operations = new CRUDOnFile();
        }
        operations.create();
        operations.read();
        operations.update();
        operations.delete();
    }
}
