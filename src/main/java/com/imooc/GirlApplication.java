package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {

		//SpringApplication.run(GirlApplication.class, args);
		//System.out.println(getValue(2));

		System.out.println(test1());
	}
	public static String test1(){
		String s= "";
		try {
			s = "try";
			Integer.parseInt(s);
			return s;
		}catch (Exception e){
			s = "catch";
			return s;
		} finally {
			s = "finaly";
		}
	}

	public static  int getValue(int i){
		int result = 0;
		switch (i){
			case 1:
				result = result + i;
			case 2:
				result = result + i*2;
			case 3:
				result = result + i*3;
		}
		return  result;
	}
}
