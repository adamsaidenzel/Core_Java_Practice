//  WAP to print number of words in a given string.     
   class String1  
{  
    public static void main(String[] args){   
  String str="welcome to bitLabs";

    String words[]=str.split(" ");
       System.out.println("number of words: "+words.length);
      for(int i=words.length-1;i>=0;i--){
      System.out.print(words[i]+" ");
      }
}
}
  