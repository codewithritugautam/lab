package thurdylab;
	import java.io.Serializable;
	import java.io.*;
	//transient keyword is used with data member of class in order to avoid serialization
	class Assignment implements Serializable{
		transient int rollno;       
		String name;
		public Assignment (int i, String n) {//perameterize con
			this.rollno=i;
			this.name=n;
		}}
	public class Use_of_Transient { //main class
public static void main(String[] args) throws Exception{
	System.out.println("Write in the file");
			Assignment obj=new Assignment(1,"Ritu Gautam"); //print 0 Ritu Gautam
			//serialization
			FileOutputStream f=new FileOutputStream("E:\\4119.text"); //file write
			ObjectOutputStream ob=new ObjectOutputStream(f); 
			ob.writeObject(obj); //object into byte stream
			ob.flush();//flush the data of one stream and send it into another	
			ob.close();
			f.close();
			FileInputStream e=new FileInputStream("E:\\4119.text"); //file read 
			ObjectInputStream in=new ObjectInputStream(e);
			Assignment obj1=(Assignment)in.readObject();
			in.close();
			System.out.println(obj1.rollno+" "+obj1.name);
	}}

