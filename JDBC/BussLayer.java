package com.jdbc.example;

public class BussLayer {
	
	private DBManager db;
	
	public BussLayer() {
		db = new DBManager();
	
	}
	public void selectData() {
		db.selectRecords();
	}
	
	//Insert Data
	
	public void insertData(int Sid, String Sname, String Sregd, String Smob) {
		String cmd = "insert into student(Sid,Sname,Sregd,Smob) values('"+Sid+"','"+Sname+"','"+Sregd+"','"+Smob+"')";
		if(db.ReccordManipulation(cmd))
		   System.out.println("Recod has been succesfully saved !!");
		else
			 System.out.println("Recod has been not succesfully saved !!");
		
	}
	
	//Update Data
	

	public void updateData(int Sid, String Sname) {
		String cmd = "update student set Sname='"+Sname+"' where Sid='"+Sid+"'";
		if(db.ReccordManipulation(cmd))
		   System.out.println("Recod has been succesfully updated !!");
		else
			 System.out.println("Recod has been not succesfully updated !!");
		
	}
	
	//Delete Data
	
	public void deleteData(int Sid) {
		String cmd = "delete from student where Sid='"+Sid+"'";
		if(db.ReccordManipulation(cmd))
		   System.out.println("Recod has been succesfully deleted !!");
		else
			 System.out.println("Recod has been not succesfully deleted !!");
		
	}

}
