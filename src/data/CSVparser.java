package data;

import java.io.*;
import java.util.ArrayList;

public class CSVparser { // zczytuje liczby z danego pliku csv do ArrayListy 
						// reads numbers from the given csv file to an ArrayList
	
  
	private String csvFileName;
	private ArrayList<Integer> fileData;
	
	public CSVparser() {
		csvFileName = "z2data1.csv";
		fileData = new ArrayList<Integer>();
	}
	
	public CSVparser(String csvFileName) {
		this.csvFileName = csvFileName;
		fileData = new ArrayList<Integer>();
	}
	
	
    public ArrayList<Integer> getFileData() {
		return fileData;
	}

	public void setFileData(ArrayList<Integer> fileData) {
		this.fileData = fileData;
	}

	public void read() {
       
        File myCSVfile = new File(csvFileName);
        String line = "";
        String CSVsplitter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(myCSVfile))) {

            while ((line = br.readLine()) != null) {

                String[] lineTokens = line.split(CSVsplitter);
                for (String singleToken : lineTokens) {
                  fileData.add(Integer.parseInt(singleToken));
                }
         
            }

        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}