package com.miaguila.test.configuration;


@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
  
    @Override
    protected String getDatabaseName() {
        return "test";
    }
  
    @Override
    public MongoClient mongoClient() {
        return new MongoClient("mongodb://andres:andres@miaguila-shard-00-00-0czxg.mongodb.net", 27017);
    }
  
    @Override
    protected String getMappingBasePackage() {
        return "com.miaguila.test.model";
    }
}