/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmap1;
import java .math.*;
import java.util.*;

public class Bitmap1 {
    Scanner in = new Scanner(System.in);
    byte []btm=new byte[40];
    int x=0,y,flag,no;
    file []file;
    String fileName;
    double no2;
    Bitmap1(){
    System.out.print("enter how many file you have : ");
        file=new file[in.nextInt()];
        for (int i = 0; i < file.length; i++) {
            file[i]=new file();
            file[i].file1();
            x=0;
            flag=0;
            for (int j = 0; j < btm .length; j++) {
                if((btm.length-j)>file[i].numOfCluster ){
                    y=x=j;
                    for (int k = 0; k < file[i].numOfCluster; k++) {
                        if(btm[y]==0)
                            flag=0;
                        else{
                            flag=1;
                             
                            break;
                        }
                        y++;
                    }
                     
                    if(flag==0){
                        file[i].index=x;
                        for (int k = 0; k < file[i].numOfCluster; k++) {
                            btm[x]=1;
                            x++;
                        }
                        break;
                    }
                   
                        
                     
                    if(flag==1){
                          delete();
                    }                        
                   
                } else{
                    System.out.println("no space!!!");  
                    break;
               }
               
                
                              }
          
            
             
                     
                    
           
        }
      
       

       
       
    }
    public void delete(){
        if(flag==1)
            System.out.println("enter the name of file you want deleted ");
        fileName=in.next() ;
        if(btm.equals(fileName)){
          
        for (int j = 0; j < btm .length; j++){
        file[j].index=j;
                        for (int k = 0; k < file[j].numOfCluster; k++) {
                          btm[x]=0;
                          
                        }
    }
    }
    }


   
}