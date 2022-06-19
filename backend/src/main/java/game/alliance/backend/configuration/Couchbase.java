package game.alliance.backend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.convert.CustomConversions;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class Couchbase extends AbstractCouchbaseConfiguration {
    @Override
    public String getConnectionString() {
        return "couchbase://127.0.0.1";
    }

    @Override
    public String getUserName() {
        return "Administrator";
    }

    @Override
    public String getPassword() {
        return "updatelater";
    }

    @Override
    public String getBucketName() {
        return "users";
    }

    // Telling Couchbase to use it's customConversions to not conflict with Redis
    @Bean
    public CustomConversions customConversions() {
        return super.customConversions();
    }
}
