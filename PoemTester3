import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PoemTester1 {
    public static void main(String[]args){
        ArrayList<Poem>poets= new ArrayList<Poem>();
        try{
            File myfile= new File("poem2.txt");
            Scanner input= new Scanner(myfile);
            while(input.hasNextLine()){
                String name= input.nextLine();
                String poet=input.nextLine();
                Poem p = new Poem();
                p.setName(name);
                p.setPoet(poet);
                poets.add(p);
            }
            input.close();



        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        for(int i=0;i<poets.size();i++){
            poets.get(i).toString();
            System.out.println();
        }
    }
}
