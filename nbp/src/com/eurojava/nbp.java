/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Dorota
 */
public class nbp {

    //xxx
    private FileReader _filereader;
    private String _zmienna;
    private BufferedReader _br;

    public nbp() {
    }

    public void loadFile(String fileName) {
        try {
            _filereader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(String.format("Nie znaleziono pliku: {0}", e.getMessage()));
        }
    }

    public void readFile() {
        try {
            _br = new BufferedReader(_filereader);
            String linia;
            while ((linia = _br.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (Exception e) {
            System.err.println(String.format("Error: {0}", e.getMessage()));
        }
    }

    public String getZmienna() {
        return _zmienna;
    }

    public void setZmienna(String _zmienna) {
        this._zmienna = _zmienna;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nbp oNbp = new nbp();
        oNbp.setZmienna("D:\\projects\\JavaSzkolenie\\JavaRepoTest1\\plik.txt");
        oNbp.loadFile(oNbp.getZmienna());
        oNbp.readFile();
    }
}
