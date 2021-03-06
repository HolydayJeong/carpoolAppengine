package test;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class PMF {
    private static PersistenceManagerFactory pmfInstance =
        JDOHelper.getPersistenceManagerFactory("transactions-optional");

    private PMF() {}

    public static PersistenceManagerFactory get() {
    	 if(pmfInstance == null)  {
    	        pmfInstance = JDOHelper.getPersistenceManagerFactory(
    	              "transactions-optional");
    	    }
    	
        return pmfInstance;
    }
}