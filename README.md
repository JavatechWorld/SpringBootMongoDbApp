# SpringBootMongoDbApp
 In this Project we have connected s Springboot application with Mongo DB Atlas and tried saving data to DB.
 
 
 EXECEPTIONS AND FIXES I DID


1. Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

FIX:
So , I was running older version of Java 8 which did not have a SSL certificate in its truststore which caused the above issue some of you might not face it if you have latest version of Java 8/11/17 . So , I decided to move to a higher version of Java and Now running my code on Java 11 . That solved this Exception 


2.	com.mongodb.MongoSocketReadException: Prematurely reached end of stream
FIX:
So ,  for me what worked is that I IP was not configured in MongoDB Atlas 

3.	com.mongodb.MongoCommandException: Command failed with error 8000 (AtlasError): 'bad auth : authentication failed' on server

FIX:
created a new user, gave the user admin role, set the password etc, and then used that new user and password (same dbname) for the connection and it worked. Use the New USER and PASSWORD in the URL in application.properties




