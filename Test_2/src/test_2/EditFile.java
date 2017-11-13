/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_2;

import java.io.*;

public class EditFile {

public static void main(String[] args) {

    try{
        String verify, putData;
        File file = new File("1.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("abcd");
        bw.flush();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while( (verify=br.readLine()) != null )
        { 
            if(verify != null)
            {
                putData = verify.replaceAll("here", "there");
                bw.write(putData);
            }
        }
        br.close();
        bw.close();

    }catch(IOException e){
    e.printStackTrace();
    }
    File oldfile =new File("1.txt");
        File newfile =new File("1_add.txt");

        if(oldfile.renameTo(newfile)){
            System.out.println("File renamed");
        }else{
            System.out.println("Sorry! the file can't be renamed");
        }
    
}
}