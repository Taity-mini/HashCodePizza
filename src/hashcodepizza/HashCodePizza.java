/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodepizza;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class HashCodePizza {

    private static final String FILENAME = "C:\\Users\\user\\OneDrive\\RGU\\CM4 Computing (Application Software Development)\\HashCode\\HashCodePizza\\small.in";

    /**
     * @param path
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        readFiles(FILENAME);
    }

    public static void readFiles(String FILENAME) {
        BufferedReader br = null;
        FileReader fr = null;

        try {

            Pizza p = null;
            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            String line = br.readLine();
            String bits[] = line.split(" ");

            //Set variables
            p.setRows(Integer.parseInt(bits[0]));
            p.setColumns(Integer.parseInt(bits[1]));
            p.setMinIngredients(Integer.parseInt(bits[2]));
            p.setMaxNumCells(Integer.parseInt(bits[3]));

            for (int i = 0; i <= Integer.parseInt(bits[0]); i++) {
                line = br.readLine();
                for (int j = 0; j <= Integer.parseInt(bits[1]); j++) {
                    p.getMatrix()[i][j] = line.charAt(j);
                }
            }

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
