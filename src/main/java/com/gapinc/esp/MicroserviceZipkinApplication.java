package com.gapinc.esp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;


@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
//@EnableZipkinStreamServer
public class MicroserviceZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZipkinApplication.class, args);
	}
}
