package com.disasterrelief.disaster.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

public class DatabaseConfiguration {
	private static MongoClient client;
	
	public static LocaliteDatastoreImpl initalizeMongo(String host , String port, String daoPackage, String dbName) {
		LocaliteDatastoreImpl dataStore;
		final LocaliteMorphia morphia= new LocaliteMorphia();
		morphia.getMapper().getOptions().setStoreEmpties(true);
		dataStore= morphia.createDatastore(makeConnection(host, port),  dbName);		
		morphia.mapPackage(daoPackage);
		dataStore.ensureIndexes();
		return dataStore;

	}

	private static MongoClient makeConnection(String host, String port) {
		if(client!= null) {
			return client;
		}else {
			client= makePrivateConnection(host, port);
			return client;
		}
		
	}

	private static MongoClient makePrivateConnection(String host, String port) {
		MongoClient mongoClient;
		if(MongoConfig.replication) {
			MongoClientOptions options= new MongoClientOptions.Builder()
					.connectionsPerHost(10).maxConnectionIdleTime(60000).readPreference(ReadPreference.primaryPreferred()).socketKeepAlive(true).build();
			mongoClient= new MongoClient(new ServerAddress(host, Integer.parseInt(port.trim())), options);
		}else {
			MongoClientOptions options= new MongoClientOptions.Builder()
					.connectionsPerHost(10).maxConnectionIdleTime(60000).socketKeepAlive(true).build();
			mongoClient= new MongoClient(new ServerAddress(host, Integer.parseInt(port.trim())), options);
		}
		return mongoClient;
	}

	
}
