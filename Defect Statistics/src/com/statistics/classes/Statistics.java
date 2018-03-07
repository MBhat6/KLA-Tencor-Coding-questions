package com.statistics.classes;

import java.util.ArrayList;

public abstract class Statistics {
	
	abstract public double getMean(ArrayList<Defect> defectList, int size);
	
	abstract public double getStdDeviation(ArrayList<Defect> defectList, int size);

}
