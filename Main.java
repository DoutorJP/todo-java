package todo;

import java.io.File;
import java.io.IOException;
import todo.Todo;

public class Main{ 
  public static void main(String[] args){ 
    try {
      File f = new File("tasks"); 
      if(f.createNewFile()){
        System.out.println("arquivo criado");
      }
      else {
        System.out.println("arquivo existe");
      }

    Todo t = new Todo("texto");

    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
