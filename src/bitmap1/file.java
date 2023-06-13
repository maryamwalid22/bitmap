/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmap1;
import java.util.*;


public class file {
String fileName;
    int fileSize;
    byte clusterSize=4;
    double numOfCluster;
    int index;
    Scanner in = new Scanner(System.in);
    void file1(){
        System.out.print("enter name of file : ");
        fileName=in.next();
        System.out.print("\nenter size of file : ");
        fileSize=in.nextInt();
        System.out.println("");
        numOfCluster=Math.ceil(fileSize/(double)clusterSize);
        
        
       
    }
    
    
}
