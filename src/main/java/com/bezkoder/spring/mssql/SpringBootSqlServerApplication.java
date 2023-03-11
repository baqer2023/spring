package com.bezkoder.spring.mssql;

import com.bezkoder.spring.mssql.model.myClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSqlServerApplication {

	public static void main(String[] args) {
		myClass cls = new myClass();
		cls.Save();
		cls.Edit();

		SpringApplication.run(SpringBootSqlServerApplication.class, args);
	}

}
