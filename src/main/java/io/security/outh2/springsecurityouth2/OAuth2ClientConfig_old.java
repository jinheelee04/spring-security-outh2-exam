package io.security.outh2.springsecurityouth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.ClientRegistrations;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

@Configuration
public class OAuth2ClientConfig_old {
//    @Bean
//    public ClientRegistrationRepository clientRegistration(){
//        return new InMemoryClientRegistrationRepository(keycloakClientRegistration());
//    }
//
//    private ClientRegistration keycloakClientRegistration(){
//        return ClientRegistrations.fromIssuerLocation("http://localhost:8080/realms/oauth2")
//                .registrationId("keycloak")
//                .clientId("oauth2-client-app")
//                .clientSecret("waGTTGSX7HDhKR6Nf3DCXMQRfLT5Ixvg")
//                .redirectUri("http://localhost:8081/login/oauth2/code/keycloak")
////                .issuerUri()
//                .build()
//                ;
//    }
}
