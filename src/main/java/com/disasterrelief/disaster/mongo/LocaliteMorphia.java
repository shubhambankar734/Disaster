package com.disasterrelief.disaster.mongo;

import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class LocaliteMorphia extends Morphia{
	public LocaliteDatastoreImpl createDatastore(final MongoClient client, final String dbName) {
		return new LocaliteDatastoreImpl(this, client, dbName);
	}
}
