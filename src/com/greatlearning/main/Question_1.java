package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.ConstructionProcessAlgo;

public class Question_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no of floors in the building");
		
		//process input
		int N = scanner.nextInt();
		int floorSizes[] = new int[N];
		for(int i = 1; i <= N; i++) {
			System.out.println("enter the floor size given on day : " + i);
			floorSizes[i-1] = scanner.nextInt(); 
		}
		scanner.close();
		
		//run algorithm
		ConstructionProcessAlgo constructionProcessAlgo = new ConstructionProcessAlgo();
		constructionProcessAlgo.runAlgo(N, floorSizes);
		constructionProcessAlgo.displayBuildingPlan();
	}
}