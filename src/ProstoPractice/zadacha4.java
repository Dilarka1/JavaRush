package ProstoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadacha4 {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String a = str.substring(str.indexOf("?") + 1);
        String b = "&";
        String[] word = a.split(b);
    }
}

//        for (int i = 0; i <= word.length; i++) {
//            if (word[i].contains("=")) {
//                word[i].substring(0, word[i].indexOf("=")).equals("obj") && i;
//            }
//            word[i].substring(word[i].indexOf("="), b);


//                if(word[i].contains("=")) {
//                    if (word[i].substring(0, word[i].indexOf("=")).equals("obj") && isDouble(word[i])) {
//                        alert(Double.parseDouble(word[i].substring(word[i].indexOf("=") + 1)));
//                    } else if (word[i].substring(0, word[i].indexOf("=")).equals("obj") && word[i].contains("=")) {
//                        alert(word[i].substring(word[i].indexOf("=") + 1));
//                    }



//                // int index3 = str.indexOf('=');
//                String word = str.substring(index1 + 1, index3);
//                System.out.println(word);
//            }
//            if (str.contains("&")) {
                //  int index2 = str.indexOf('&');
//                String word2 = str.substring(index2 + 1, index3);
//                System.out.println(word2);
//            }
//
//
//
//
//            for (int i = 0; i < word.length; i++){
//                if(word[i].contains("=")) {
//                    if (word[i].substring(0, word[i].indexOf("=")).equals("obj") && isDouble(word[i])) {
//                        alert(Double.parseDouble(word[i].substring(word[i].indexOf("=") + 1)));
//                    } else if (word[i].substring(0, word[i].indexOf("=")).equals("obj") && word[i].contains("=")) {
//                        alert(word[i].substring(word[i].indexOf("=") + 1));
//                    }
//                }
//            }  }