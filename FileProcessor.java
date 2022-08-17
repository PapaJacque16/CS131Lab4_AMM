import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList = new ArrayList<String>();
	private Scanner input;

	public FileProcessor(String fileName, int stringLength) {
	setFileName(fileName);
	setStringLength(stringLength);
	}//end empty constructor

	public void processFile() {

		@SuppressWarnings("unused")
		StringTooLongException StringLength = new StringTooLongException();
		try {
			input = new Scanner(new File(fileName)); 
		while(input.hasNext())
			{
			String value = input.next(); // read string 
			if(value.length() > stringLength) // read the string length and throw an exception
				stringList.add(value); 
			}
		} catch (FileNotFoundException fp) {
			System.out.println(fp);
		}
}//end processFile

public String getFileName() {
	return fileName;
	}//end getFileName

public void setFileName(String fileName) {
	this.fileName = fileName;
	}//end setFileName

public int getStringLength() {
	return stringLength;
	}//end getStringLength

public void setStringLength(int stringLength) {
	if(stringLength >= 10) 
		this.stringLength = stringLength;
	else // else set
		this.stringLength = 10;
}//end setStringLength

public int getArrayListSize() {
return stringList.size();
}//end getArrayListSize

@Override
public String toString() {
	return "FileProcessor [fileName=" + fileName + ", stringLength=" + stringLength + ", stringList=" + stringList
			+ ", input=" + input + ", getFileName()=" + getFileName() + ", getStringLength()=" + getStringLength()
			+ ", getArrayListSize()=" + getArrayListSize() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
	}//end toString

} // end class