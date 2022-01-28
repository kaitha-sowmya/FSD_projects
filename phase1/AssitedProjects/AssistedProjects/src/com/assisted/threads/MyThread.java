package com.assisted.threads;

public class MyThread {


		public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	    }
	 	public static void main( String args[] )
	 	{
	  		MyThread mt = new  MyThread();
	  		mt.run();
	 	}

	}


