const { MongoClient } = require('mongodb');
const dbConfig = require('./config');

let db;

const connectDB = async () => {
  try {
    const client = await MongoClient.connect(dbConfig.url, dbConfig.options);
    db = client.db(client.s.options.dbName);
    console.log("MongoDB Connected");
  } catch (err) {
    console.error("Could not connect to MongoDB", err);
    process.exit(1);
  }
};

const getDb = () => {
  if (!db) {
    throw Error('MongoDB not initialized');
  }
  return db;
};

module.exports = { connectDB, getDb };
