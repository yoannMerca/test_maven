package MyFirstProject.fr_dta;

import utils.MyStringUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
  	
    	System.out.println( MyStringUtils.isNullOrEmpty("chaine"));
    	System.out.println( MyStringUtils.isNullOrEmpty(null));
    	System.out.println( MyStringUtils.isNullOrEmpty(""));

    	
    }
}
