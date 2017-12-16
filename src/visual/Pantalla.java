package visual;

import java.util.Scanner;


public class Pantalla {
    
    public Pantalla(){
        Scanner sc = new Scanner(System.in);
        int nota1,nota2,nota3,promed;
       
        
        System.out.println("Ingrese La Primera Nota Del Alumno:");
        nota1 = sc.nextInt();
        System.out.println("Ingrese La Segunda Nota Del Alumno:");
        nota2 = sc.nextInt();
        System.out.println("Ingrese La Tercera Nota Del Alumno:");
        nota3 = sc.nextInt();
        
        
        promed = promedio(nota1,nota2,nota3);
       
        System.out.println("El Promedio Del Alumno Es:");
        System.out.println(promed);
        
    }
    
    int promedio(int nota1, int nota2, int nota3){  
        int pro1=0,pro2=0,pro3=0,prome=0,suma=0;
        
        
        if (nota1>nota2 || nota1>nota3){
          pro1 = nota1;
          System.out.println("Nota1");
          System.out.println(pro1);
        }
        if (nota2>nota1 || nota2>nota3){
          pro2 = nota2;
          System.out.println("Nota2");
          System.out.println(pro2);
        }  
        if (nota3>nota1 || nota3>nota2){
          pro3 = nota3;
          System.out.println("Nota3");
          System.out.println(pro3);
        }
            
            
        suma =(pro1 + pro2 + pro3);
        prome= (suma/2);
         
         
        return prome;
          
        
    }
        
}
    
    

