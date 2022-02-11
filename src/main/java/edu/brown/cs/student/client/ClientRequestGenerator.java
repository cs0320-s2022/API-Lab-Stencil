package edu.brown.cs.student.client;

import edu.brown.cs.student.client.ClientAuth;

import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;

/**
 * This class generates the HttpRequests that are then used to make requests from the ApiClient.
 */
public class ClientRequestGenerator {

  /**
   * The basic introductory GET request. You should fill it out so it calls our server at the given URL.
   *
   * @return an HttpRequest object for accessing the introductory resource.
   */
  public static HttpRequest getIntroGetRequest() {
    // The resource we want is hosted at https://cq2gahtw4j.execute-api.us-east-1.amazonaws.com/.
    String reqUri = "https://cs32apilab.herokuapp.com/introResource";
    // TODO build and return a new GET HttpRequest.
    // See https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpRequest.html and
    // https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpRequest.Builder.html
    // (Tip: notice in the documentation that the default request method is actually GET)
    return null;
  }

  /**
   * Similar to the introductory GET request, but restricted to api key holders only. Try calling it without the API
   * Key configured and see what happens!
   *
   * @return an HttpRequest object for accessing the secured resource.
   */
  public static HttpRequest getSecuredGetRequest() {
    String reqUri = "https://cs32apilab.herokuapp.com/securedResource";
    // TODO get the secret API key by using the ClientAuth class.
    String apiKey = null;
    // TODO build and return a new GET HttpRequest with an api key header.
    // Hint: .header("x-api-key", apiKey)
    return null;
  }

  /**
   * Similar to the secured GET request, but is a POST request instead.
   *
   * @param param - the body of the POST request. This should be your name, passed in from the REPL.
   * @return an HttpRequest object for accessing and posting to the secured resource.
   */
  public static HttpRequest getSecuredPostRequest(String param) {
    String reqUri = "https://cs32apilab.herokuapp.com/securedResource";
    String apiKey = null;
    // TODO build and return a new POST HttpRequest with an api key header, and the param in the body.
    // Hint: the POST param should be: HttpRequest.BodyPublishers.ofString("{\"name\":\"" + param + "\"}")
    return null;
  }

  /**
   * This is another secured GET request that has an optional string parameter in the URL. Find out what the staff's
   * horoscopes are!
   *
   * @param param - the name of the staff member whose horoscope you want to find; an empty string here will indicate
   *              that the server should return a list of all staff members instead.
   * @return an HttpRequest object for accessing and posting to the secured resource.
   */
  public static HttpRequest getHoroscopeGetRequest(String param) {
    // Our taName parameter can either be empty, or some name, in which case it takes the format "?taName=name".
    // If you tried this in the web browser URL you might see something like
    
    String taName = null;
    // TODO set the taName. It should either be empty "" if the param is empty, or else of the format "?name=param"
    String reqUri = "https://cs32apilab.herokuapp.com/horoscopeResource" + taName;
    // TODO get the secret API key by using the ClientAuth class.
    String apiKey = null;
    System.out.println("Getting star sign for " + param);
    // TODO build and return a new GET request with the api key header.
    return null;
  }
  
  /**
   * Using a POST request, add your own name and horoscope to see how POST requests should work.
   * This will be deleted in a short amount of time. If you are uncomfortable with publishing your own info,
   * then you can use a fake name and horoscope. 
   *
   * @param param - the body of the POST request. This should be your name, passed in from the REPL.
   * @return an HttpRequest object for accessing and posting your name and horoscope.
   */
  public static HttpRequest addYourHoroscope(String name, String horoscope) {
    String reqUri = "https://cs32apilab.herokuapp.com/addHoroscope";
    String apiKey = null;
    // TODO build and return a new POST HttpRequest with an api key header, and the name and horoscope in the body.
    // Hint: the POST param should be: 
    // HttpRequest.BodyPublishers.ofString("{\"name\":\"" + name + "\", \"horoscope\": \""+ horoscope+ "\"}")

    return null;
  }
  
}
