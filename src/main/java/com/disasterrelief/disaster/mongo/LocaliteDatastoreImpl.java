package com.disasterrelief.disaster.mongo;

import org.mongodb.morphia.DatastoreImpl;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;

public class LocaliteDatastoreImpl extends DatastoreImpl{

	public LocaliteDatastoreImpl(Morphia morphia,  MongoClient mongoClient, String dbName) {
		super(morphia, morphia.getMapper(), mongoClient, dbName);
	}

}
