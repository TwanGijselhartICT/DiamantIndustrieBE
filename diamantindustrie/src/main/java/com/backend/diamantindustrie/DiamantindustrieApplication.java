package com.backend.diamantindustrie;

import com.backend.diamantindustrie.repository.PointOfInterestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.*;

@SpringBootApplication
public class DiamantindustrieApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiamantindustrieApplication.class, args);
	}


}
