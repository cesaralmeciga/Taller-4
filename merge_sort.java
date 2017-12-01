import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/**
*@Author Cesar Almeciga
*@date 29-11-17
*@Version 2
*program that orders digits by the marge method
*/
public class metodos {
	
	 public static void imprimeArray(int[] array){ //print the array
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("[" + array[i] + "]");
	        }
	    }

	 
	  public static void ordenacionMergeSort(int vec[]){ //Sort method by merge
          if(vec.length<=1) return;
          int mitad= vec.length/2;
          int izq[]=Arrays.copyOfRange(vec, 0, mitad);
          int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
          ordenacionMergeSort(izq);
          ordenacionMergeSort(der);       
          combinarVector(vec, izq, der);
  }
  
  public static void combinarVector(int v[], int izq[],int der[]){ //method that combines vectors
          int i=0;
          int j=0;
          for(int k=0;k<v.length;k++){
                  if(i>=izq.length){
                          v[k]=der[j];
                          j++;
                          continue;
                  }
                  if(j>=der.length){
                          v[k]=izq[i];
                          i++;
                          continue;
                  }
                  if(izq[i]<der[j]){
                          v[k]=izq[i];
                          i++;
                  }else{
                          v[k]=der[j];
                          j++;
                  }
          }
  }
  public static void main(String[] args) throws IOException { // main method
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	metodos c = new metodos() ;
		
	bw.write("escriba el tamaño del arreglo");
	bw.flush();	
	int T = Integer.parseInt(br.readLine());
		
	bw.write("escriba los numeros del arreglo, recuerde que deben ir separados por comas (,) \n");
	bw.flush();
	String Arreglo= br.readLine();
		String [] Particion = Arreglo.split(",");
		int array [] = new int [T]; 
	
		for (int i = 0; i < array.length; i++) {
			  array[i]=Integer.parseInt(Particion[i]);
			}
		
		c.imprimeArray(array);
		System.out.println("\n"+"Merge Sort");
		c.ordenacionMergeSort(array);
		c.imprimeArray(array);
		

	
  }

}
