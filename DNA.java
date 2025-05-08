/* 
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
*/

public class DNA {

  public static void main(String[] args) {

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    int startIdx = dna.indexOf("ATG");
    int stopIdx  = (startIdx != -1) ? dna.indexOf("TGA", startIdx + 3) : -1;
    if (startIdx != -1 && stopIdx  != -1 && (stopIdx - startIdx) % 3 == 0) {
    String protein = dna.substring(startIdx, stopIdx + 3);
    System.out.println("Protein: " + protein);
    } 
    else {
    System.out.println("Protein: Not found");
    }

  }

}
