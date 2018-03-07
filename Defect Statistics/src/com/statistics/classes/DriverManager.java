package com.statistics.classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DriverManager {
	
	static DecimalFormat df = new DecimalFormat("#.###");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the program. Here we will find the statistics for the defects for you");
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nChoose an option to select the defect size to get the statistics: \n1. Visible 100 Defects \n2. All Defects\n");
		
		String userInput = input.nextLine();
		
		if(userInput.trim().equals("1") || userInput.trim().equals("Visible 100 Defects")) {
			
			ArrayList<Defect> userViewdefectList = new ArrayList<Defect>();
			//get the list of defects that user is viewing 
			//Assumed to be fetched from an API or a function which displays the defects to the user
			
			if(userViewdefectList.size() > 0) {
				
				DefectPolarityStatistics getPolarityStat = new DefectPolarityStatistics();
				System.out.println("The mean polarity of 100 defects is: " + df.format(getPolarityStat.getMean(userViewdefectList, 100)) + " and standard deiation is: " + df.format(getPolarityStat.getStdDeviation(userViewdefectList, 100)));
				
				DefectRoughnessStatistics getRoughnessStat = new DefectRoughnessStatistics();
				System.out.println("The mean roughness of 100 defects is: " + getRoughnessStat.getMean(userViewdefectList, 100) + " and standard deiation is: " + df.format(getRoughnessStat.getStdDeviation(userViewdefectList, 100)));
				
				DefectSizeStatistics getSizeStat = new DefectSizeStatistics();
				System.out.println("The mean size of 100 defects is: " + getSizeStat.getMean(userViewdefectList, 100) + " and standard deiation is: " + df.format(getSizeStat.getStdDeviation(userViewdefectList, 100)));		
				
			}		
			
		}
		if(userInput.trim().equals("2") || userInput.trim().equals("All Defects")) {
			
			ArrayList<Defect> allDefectList = new ArrayList<Defect>();
			//Assuming that this arraylist is stored in the program - information from an API which gets us the list
			//of all the defects in the wafer.
			
			if(allDefectList.size() > 0) {
				DefectPolarityStatistics getPolarityStat = new DefectPolarityStatistics();
				System.out.println("The mean polarity of all defects is: " + df.format(getPolarityStat.getMean(allDefectList, allDefectList.size())) + " and standard deiation is: " + df.format(getPolarityStat.getStdDeviation(allDefectList, allDefectList.size())));
				
				DefectRoughnessStatistics getRoughnessStat = new DefectRoughnessStatistics();
				System.out.println("The mean roughness of all defects is: " + df.format(getRoughnessStat.getMean(allDefectList, allDefectList.size())) + " and standard deiation is: " + df.format(getRoughnessStat.getStdDeviation(allDefectList, allDefectList.size())));
				
				DefectSizeStatistics getSizeStat = new DefectSizeStatistics();
				System.out.println("The mean size of all defects is: " + df.format(getSizeStat.getMean(allDefectList, allDefectList.size())) + " and standard deiation is: " + df.format(getSizeStat.getStdDeviation(allDefectList, allDefectList.size())));		
			}
			else
				System.out.println("There are no defects to determine the statistics");
						
		}
		else {
			System.out.println("Invalid output");
		}
		
	}

}
