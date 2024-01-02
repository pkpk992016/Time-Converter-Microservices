package com.time.converter.converter.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(
        info = @Info(
                title = "Time API",
                description = "API for Time Conversion",
                version = "1.0.0",
                license = @io.swagger.v3.oas.annotations.info.License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"
                ),
                contact = @Contact(
                        name = "Pranab Barik",
                        email = "pranab992021@gmail.com",
                        url = "https://github.com/pkpk992016/"
                )
        ),
        servers = {
                @Server(url = "http://localhost:8081", description = "Local Development Server"),

        }

)
//http://localhost:8081/swagger-ui.html

public class OpenApiConfig  {


}