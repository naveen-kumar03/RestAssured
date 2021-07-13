package com.crm.order.utils;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class FakerUtils {

    public static String externalRefId(){
        Faker faker = new Faker();
        return faker.bothify("0010o0000###2r1???");
      
    }
    
    public static String panNumber(){
        Faker faker = new Faker();
        String pancardNumber= faker.regexify("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        return pancardNumber;
    }
    public static String gstIN(){
        Faker faker = new Faker();
        return faker.bothify("07"+panNumber()+"#??");
        //return "07"+panNumber()+faker.regexify("[0-9]{1}[A-Z]{2}");
    }
    public static String entityName(){
        Faker faker = new Faker();
        return faker.numerify("TestUser###");
    }
    
    public static String address(){
        Faker faker = new Faker();
        return faker.address().fullAddress();
    }

    public static String mobilenumber() {
    	Faker faker = new Faker();
        return faker.bothify("94########");
    
    }
    public static String email() {
    	Faker faker = new Faker();
        return faker.bothify("testuser??###@gmail.com");
    
    }
    
    public static String pincode() {
    	Faker faker = new Faker();
        return faker.bothify("1#####");
    
    }
    
    public static String randomnumber() {
    	Faker faker = new Faker();
        return faker.regexify("[2-9]{5}");
    
    }
    
    public static String randomdate() {
    	Faker faker = new Faker();
        return faker.bothify("202#-0#-2#");
    
    }
    
}
