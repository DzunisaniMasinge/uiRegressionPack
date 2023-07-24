import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class apiTest {

    int potID ;
    String name,  email,  date;
    @Test
   public void postRequest()
   {
       RestAssured.baseURI = "http://jsonplaceholder.typicode.com";

       RequestSpecification requestSpecification = RestAssured.given();

       Date date = new Date();
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
       String todayDate = formatter.format(date);


       String requestBody = "{\"potID\":\1\", \"name\":\"Dzunisani\" ,\"email\":\"Dzunisani.Masinge7@gmail.com\", \"date\":"+ todayDate+"\" }";
       requestSpecification.body(requestBody);

       Response response = requestSpecification.post("/post");

       String responseBody = response.getBody().asString();
       System.out.println("The response body for the request is :"+responseBody);

       int checkStatusCode = response.getStatusCode();

       Assert.assertEquals(200 , checkStatusCode);

   }

}
