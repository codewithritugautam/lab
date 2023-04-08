package thurdylab;
	import java.io.ByteArrayOutputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class ByteArray { //main class
	public static void main(String[] args) throws IOException{ 
		FileOutputStream f= new FileOutputStream("E:\\4119.text");
		ByteArrayOutputStream bt= new ByteArrayOutputStream ();
		//one message  send into multiple stream
		bt.write(65);//ASCII value 65 is A
		bt.write(66);//ASCII value 65 is B
		bt.write(67);//ASCII value 65 is C
		bt.write(68);//ASCII value 65 is D
		bt.writeTo(f); //write to file ABCD
		bt.flush();
		bt.close();
		System.out.println("done"); //output is done
	}
	}

