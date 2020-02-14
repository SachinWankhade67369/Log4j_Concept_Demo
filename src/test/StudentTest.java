package test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StudentTest {

		static Logger log;
	public static void main(String[] args) {
		
		// Logger log= Logger.getLogger(StudentTest.class);
		log= Logger.getLogger(StudentTest.class);
		//PropertyConfigurator is used to configure logger from properties file.
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Entering into the main method..");//will write into file.
		//System.out.println(1);//will print on console.
		log.info("Hello,welcome to the main method.");
		//System.out.println(2);
		log.info("Class name: StudentTest.java");
		log.info("Method name: Main method");
		log.info("Changing the password:");//informative massage
		log.info("Password:123464");
		log.info("IP Address:198.98.67.17");
		
		//for debugging information(like logic)
		log.debug("Log4j appender configuration is successful.");
		log.debug("Addition of two integer no. is done");
		
		//For warning information.
		log.warn("@Warning Static member should be called through class name instead of creating object of class");
		
		//for more critical information
		log.fatal("Exception should be handled otherwise program will not run sucessfully");
		
		//for error information
		log.error("Unriched code/dead code due to exception");
		
		
		log.info("Existing from main method.");
		

	}

}
