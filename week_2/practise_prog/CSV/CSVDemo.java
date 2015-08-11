//CSV practice program 
import java.util.*;
import java.io.*;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;

class CSVDemo{
	public static void main(String[] args)throws Exception{
		
		File f1 = new File("/home/cb-archit/work/java_prac/week_2/practise_prog/CSV/Import_User_Sample_en.csv");
		//CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);
		CSVParser parser = new CSVParser(new FileReader(f1),CSVFormat.DEFAULT.withHeader());
		
		for(CSVRecord record:parser){
			System.out.println(record.get("User Name"));
		}
		parser.close();
	}
}
        //CSVParser parser = new CSVParser(new FileReader("countries.csv"), CSVFormat.DEFAULT.withHeader());
