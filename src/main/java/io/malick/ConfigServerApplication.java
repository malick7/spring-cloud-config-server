package io.malick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient //Added later - 4.8 lesson
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
	/*
	 * Discovery server, then config server then config client app - start order
	 */
	/*
	 http://localhost:9999/config-client-app/default
	 http://localhost:9999/config-client-app/prod
	 
	 {
		name: "config-client-app",
		profiles: [
			"prod"
		],
		label: null,
		version: "1cb37c9ba1fa4c17d2ae7489c2e592eba1688547",
		state: null,
		propertySources: [
			{
				name: "https://github.com/malick7/scf-config-repository.git/config-client-app-prod.properties",
				source: {
					some.other.property: "profile specific value",
					some.property: "profile specific value"
				}
			},
			{
				name: "https://github.com/malick7/scf-config-repository.git/config-client-app.properties",
				source: {
					some.property: "app specific overridden value"
				}
			},
			{
				name: "https://github.com/malick7/scf-config-repository.git/application.properties",
				source: {
					some.other.property: "global",
					some.property: "global"
				}
			}
		]
	}
	 */

}

