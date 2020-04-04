package com.shasu19p.main;

/**
 * JMS messaging learning
 * 
 * JMS - Implementation (Active MQ)
 * 
 * Download ActiveMQ and start from bin directory.
 * 
 * http://localhost:8161/admin/queues.jsp
 * default credentials: admin/admin
 * 
 * ConnectionFactory
 *       |
 *       creates
 *   Connection
 *   
 *     
 *       Connection creates
 *           - session 
 *           - message
 *           - destination 
 *           	  - Queue
 *           	  - Topic
 *           - message producer
 *           - message consumer
 * 
 **/