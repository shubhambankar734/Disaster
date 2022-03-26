package com.disasterrelief.disaster.mongo;
import org.mongodb.morphia.Datastore;

public class LocaliteMongoConfig {
	private static LocaliteDatastoreImpl dataStore;
	
	public static Datastore getMongo() {
		if(dataStore== null) {
			dataStore= initializeMongo();
		}
		return dataStore;
	}

	private static LocaliteDatastoreImpl initializeMongo() {
		// TODO Auto-generated method stub
		return DatabaseConfiguration.initalizeMongo("127.0.0.1", "27017", "com.localite.core", "dm-support");
	}
}
