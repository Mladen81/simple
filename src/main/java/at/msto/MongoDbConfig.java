package at.msto;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by mladenstojanovic on 13.06.16.
 */
@Configuration
@EnableMongoRepositories
public class MongoDbConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "simple";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.oreilly.springdata.mongodb";
    }

}
