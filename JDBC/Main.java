package com.jdbc.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BussLayer buss = new BussLayer();
		buss.selectData();
		
//		buss.insertData(5, "Amarendra", "76", "7504526090");
//		buss.selectData();
		
//		buss.updateData(5, "DJ");
//		buss.selectData();
		
		buss.deleteData(5);
		buss.selectData();
		

	}

}
