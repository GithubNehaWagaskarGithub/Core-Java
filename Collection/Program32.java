package Collection;

import java.io.*;

public class Program32 {
    public static void main(String[] args) {
        String path="C:\\Users\\WAGASKAR\\Desktop\\Core Java\\_1CCM27\\Sample.txt";
        File file=new File(path);
        boolean status=false;
        try {
            status=file.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
        if(status)
        {
            System.out.println("File created Successfully");
        }
        else {
            System.out.println("File Not Created");
        }

        System.out.println("File Name :"+file.getName());
        System.out.println("File Path :"+file.getAbsolutePath());

        //write inside a file
        try {
            FileWriter writer=new FileWriter(file.getAbsolutePath());
            String text="This Is Best Core Java Batch";
            writer.write(text);
            writer.close();
            System.out.println("File Updated Successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //read a file
        try {
            FileReader reader=new FileReader(file.getAbsolutePath());
            int a;
            while((a=reader.read())!=-1)
            {
                System.out.println((char)a);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Delete from a file
       /* File deleteFile=new File(file.getAbsolutePath());
        System.out.println(deleteFile.delete());*/

    }
}
