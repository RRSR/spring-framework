package raj.spring.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import raj.spring.didemo.examplebeans.FakeDataSource;
import raj.spring.didemo.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

  @Value("${raj.username}")
  String username;

  @Value("${raj.password}")
  String password;

  @Value("${raj.url}")
  String url;

  @Value("${raj.jms.username}")
  String jmsUsername;

  @Value("${raj.jms.password}")
  String jmsPassword;

  @Value("${raj.jms.url}")
  String jmsUrl;


  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUsername(username);
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker(){
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUsername(jmsUsername);
    fakeJmsBroker.setPassword(jmsPassword);
    fakeJmsBroker.setUrl(jmsUrl);
    return fakeJmsBroker;
  }

}
