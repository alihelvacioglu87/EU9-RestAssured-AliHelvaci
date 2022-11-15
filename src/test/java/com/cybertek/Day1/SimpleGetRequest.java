package com.cybertek.Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequest {

    String URL = "http://34.207.245.164:8000/api/spartans";

    @Test
    public void test1(){

        Response response = RestAssured.get(URL);
        System.out.println(response.statusCode());

        response.prettyPrint();


    }


}
