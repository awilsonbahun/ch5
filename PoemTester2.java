import java.io.*;
public class PoemTester {
    public static void main(String[]args)  {
        try{
            FileWriter mywriter= new FileWriter("poems.txt");
            Poem poem1= new Poem();
            poem1.setName("We Real Cool");
            poem1.setPoet("Gwendolyn Brooks");

            Poem poem2= new Poem();
            poem2.setName("I know why the Caged Bird Sings");
            poem2.setPoet("Maya Angelou");

            Poem poem3= new Poem();
            poem3.setName("The Road Not Taken");
            poem3.setPoet("Robert Frost");


            mywriter.write(poem1.getName()+"\n");
            mywriter.write(poem1.getPoet()+"\n");

            mywriter.write(poem2.getName()+"\n");
            mywriter.write(poem2.getPoet()+"\n");

            mywriter.write(poem3.getName()+"\n");
            mywriter.write(poem3.getPoet()+"\n");
            mywriter.close();
        }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
