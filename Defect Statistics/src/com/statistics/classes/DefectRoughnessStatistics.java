package com.statistics.classes;

import java.util.ArrayList;

public class DefectRoughnessStatistics extends Statistics{
	
	private double mean = 0.0;
	private double sum = 0.0;
	private double num = 0.0;
	private double stdVal = 0.0;
	
	public double getMean(ArrayList<Defect> defectList, int size) {
			
		for(Defect obj : defectList) {
			
			sum += obj.getRoughness();
		}
		mean = sum/size;
		
		return mean;
	}
	
	public double getStdDeviation(ArrayList<Defect> defectList, int size) {
			
		for(Defect obj : defectList) {
			stdVal = Math.pow((obj.getRoughness()- mean), 2);
			num += stdVal;
		}
		return Math.sqrt(num/size);
	}

}
