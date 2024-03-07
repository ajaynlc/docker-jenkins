package com.docker.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("docker-jenkins");
		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

}
