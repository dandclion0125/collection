package kr.jhta.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * Properties객체는 ~.properties 파일을 읽어올 수 있다.
		 * Properties객체는 지정된 ~.properties파일을 읽어서 그 내용을 
		 * key-value로 저장한다.
		 * 
		 * Properties객체에 저장된 key-value정보는 getProperty(String key) 메소드를 이용해서 
		 * 값을 조회할 수 있다.
		 * 
		 * Properties파일의 내용 예
		 * mail.host=smtp.gmail.com
		 * mail.port=587
		 * mail.username=admin
		 * mail.password=zxcv1234
		 * 
		 */
		
		//properties 파일의 설정정보를 읽어 올수 있다.
		
		Properties prop = new Properties();
		prop.load(new FileReader("src/kr/jhta/properties/config.properties"));
		
		String value = prop.getProperty("mail.host");
		System.out.println(value);
		
		// key(mail.port)에 대한 value값이 null인 경우 111이 대체된다.
		String port = prop.getProperty("mail.port", "111");
		System.out.println(port);
	}
}
