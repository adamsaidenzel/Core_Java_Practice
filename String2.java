//7. WAP to print frequency of each word in a given string.
  
class String2
{  
     public static void main(String[] args) {  
        String str = "bit labs";  
        int[] freq = new int[str.length()];  
        int i, j;  
          
        
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                   
                    string[j] = '0';  
                }  
            }  
        }  
          
          
        System.out.println("Frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);  
        }  
    }  
}  