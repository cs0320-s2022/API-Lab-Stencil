package edu.brown.cs.student.core;

import edu.brown.cs.student.client.ApiClient;
import edu.brown.cs.student.client.ClientRequestGenerator;
import joptsimple.OptionParser;
import joptsimple.OptionSet;


/**
 * The Main class of our project. This is where execution begins.
 */
public final class Main {

  /**
   * The initial method called when execution begins.
   *
   * @param args An array of command line arguments
   */
  public static void main(String[] args) {
    ApiClient client = new ApiClient();
	OptionParser parser = new OptionParser();
	parser.accepts("basicGet");
	parser.accepts("keyedGet");
	parser.accepts("keyedPost").withOptionalArg().ofType(String.class).defaultsTo("");
	parser.accepts("getHoroscopes").withOptionalArg().ofType(String.class).defaultsTo("");
	parser.accepts("addHoroscope");
    parser.accepts("name").requiredIf("addHoroscope").withRequiredArg();
    parser.accepts("horoscope").requiredIf("addHoroscope").withRequiredArg();
	
	OptionSet options = parser.parse(args);
	
	// ./run --basicGet --keyedGet --keyedPost=Gary --getHoroscopes=Tim

	if (options.has("basicGet")){
		System.out.println("Running basicGet");
		client.makeRequest(ClientRequestGenerator.getIntroGetRequest());
		System.out.println("");
	}
	
	if (options.has("keyedGet")){
		System.out.println("Running keyedGet");
		client.makeRequest(ClientRequestGenerator.getSecuredGetRequest());
		System.out.println("");
	}
	
	if (options.has("keyedPost")){
		String param = options.valueOf("keyedPost").toString();
		System.out.println("Running keyedPost with param: "+ param);
		client.makeRequest(ClientRequestGenerator.getSecuredPostRequest(param));
		System.out.println("");
	}
	
	if (options.has("addHoroscope")){		
		String name = options.valueOf("name").toString();
		String horoscope = options.valueOf("horoscope").toString();
		System.out.println("Running addHoroscope with name: "+ name +", horoscope: "+horoscope);
		client.makeRequest(ClientRequestGenerator.addYourHoroscope(name, horoscope));
		System.out.println("");
	}
	
	if (options.has("getHoroscopes")){		
		String param = options.valueOf("getHoroscopes").toString();
		System.out.println("Running getHorscopes with param: "+ param);
		client.makeRequest(ClientRequestGenerator.getHoroscopeGetRequest(param));
		System.out.println("");
	}

  }
}
