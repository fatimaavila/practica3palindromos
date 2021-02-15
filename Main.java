import java.util.Scanner;
import java.util.Arrays; 

class Main {
  public static void main(String[] args) {
    String palabras;
    
     Scanner sc=new Scanner(System.in);
        System.out.print("::Ingrese las palabras que quiere comprobar si son palíndromas o no. En una lista separada por comas::\n"+"\u001B[33m"+"EJEMPLO: hola,people,que,lol,oops,reloj\n\t"+"\u001B[0m"); 
        
        palabras=sc.nextLine();
        String[] words = palabras.split(",");
        //System.out.println(Arrays.toString(words));
        System.out.println("\n");
        
        for(int k=0; k < words.length; k++) {
               char[] palindroma = words[k].toCharArray();
              // System.out.println(Arrays.toString(palindroma));
               char[] reversa = new char[palindroma.length];
               int l = 0;
            //   System.out.println(palindroma.length);
        for (int i = palindroma.length-1; i >= 0; i--){
           //System.out.println(i+" "+ palindroma[i]);
            reversa[l] = palindroma[i];
            l++;

          
    } // for palindroma
    //System.out.println(Arrays.toString(reversa));
     
     String pali = new String(reversa);
      String mensaje = "";
     if(pali.equals(words[k])){
      mensaje = "\u001B[36m"+"Palabra palíndroma"+"\u001B[0m";
     }

           System.out.println(words[k]+" → " + pali+" " + mensaje);
  
           
    }// end for 

  } // metodo main
} // main class