package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//We don't need the PropertySource annotation if we use application.properties
@Configuration
public class PropertyConfig {

    @Value("${guru.username}")
    private String username;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.dburl}")
    private String dbUrl;

    @Value("${guru.jms.username}")
    private String jmsUsername;

    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Value("${guru.jms.url}")
    private String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(dbUrl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    // Isn't needed anymore. Spring is automatically doing this.
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer property() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
