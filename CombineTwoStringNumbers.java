import java.util.*; 
import java.io.*;

class Main {

  public static String ArrayChallenge(String[] strArr) {
    // code goes here  
    String str1 = strArr[0];
    String str2 = strArr[1];

    String[] arrstr1 = str1.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
    String[] arrstr2 = str2.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
    
    int size1 = arrstr1.length;
    int size2 = arrstr2.length;

    int[] ntf1 = new int[size1];
    int[] ntf2 = new int[size2];

    for(int i = 0; i < size1; i++){
      try{
      ntf1[i] = Integer.parseInt(arrstr1[i]);
      //System.out.print(ntf1[i]);
      }
      catch(NumberFormatException nfe){

      }
    }

    for(int i = 0; i < size2; i++){
      try{
      ntf2[i] = Integer.parseInt(arrstr2[i]);
      }
      catch(NumberFormatException nfe){

      }
    }

    String strresult = "";
    int resultsize = 0;

    if(size1 > size2){
      resultsize = size1;
    }
    else{
      resultsize = size2;
    }

    int[] result = new int[resultsize];
    
    if(size1 > size2){
      for(int i = 0; i < size1; i++){
          if(i < size2){
            result[i] = ntf1[i]+ntf2[i];
          }
          else{
            result[i] = ntf1[i];
          }
      }
    }
    else{
      for(int i = 0; i < size2; i++){
          if(i < size1){
            result[i] = ntf2[i]+ntf1[i];
          }
          else{
            result[i] = ntf2[i];
          }
      }
    }

    strresult = Arrays.toString(result);
    //String arrstr3 = strresult.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

    //String strresult1 = Arrays.toString(arrstr3);
    //return Arrays.toString(result);
    char ch = '-';

    //strresult = strresult.replace(' ',ch);
    strresult = strresult.replaceAll("\\[", "");
    strresult = strresult.replaceAll("\\]", "");
    strresult = strresult.replaceAll("\\s", "");
    strresult = strresult.replace(',',ch);
    return strresult;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}
