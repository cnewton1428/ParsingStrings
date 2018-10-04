package com.company;

public class Main {

    public static void main(String[] args) {
	// Parsing Strings

        String word = "Curriculum";
        String[] splittedPhrase = word.split("");//"" puts into string array

        for (int index = 0; index < splittedPhrase.length; index++) {
            if (splittedPhrase[index].equals("c") || splittedPhrase[index].equals("u")) {
                System.out.println("_");
            } else {
                System.out.println(splittedPhrase[index] + "");
            }
        }

        // Or create another array 


//            System.out.println(splittedPhrase[index]);
//        }
//        System.out.println();

//        String word2 = "Curriculum";
//        String[] placeWord2= word2.replaceAll("[C, u]", "_");
//
//        for (int index =0; index <placeWord2.length(); index++) {
//            System.out.println(placeWord2[index]);
//        }
//        System.out.println();
//


        }
    }

