package com.test;

import com.test.first.SayHello;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class SayHelloTest {

    @Test
    public void testSayHello() throws IOException{
          System.out.println("Testing SayHello ");
          SayHello.main(new String[]{"en"});
    }
    
}
