package test;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import test.PMF;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import com.google.appengine.api.datastore.Entity;
import javax.jdo.Query;

public class User_RegServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();

        // We have one entity group per Guestbook with all Greetings residing
        // in the same entity group as the Guestbook to which they belong.
        // This lets us run a transactional ancestor query to retrieve all
        // Greetings for a given Guestbook.  However, the write rate to each
        // Guestbook should be limited to ~1/second.

        //String guestbookName = req.getParameter("guestbookName");
        //Key guestbookKey = KeyFactory.createKey("Guestbook", guestbookName);
        //String content = req.getParameter("content");
/*        int i = 1;
        String test = "test"+i;
        String id = test;
        String name = test;
        String stu_num = test;
        String pw = test;
        int phNum = i;
        String phid = "";
        String carNum = "";
        String carType = "";*/
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String stu_num = req.getParameter("stu_num");
        String pw = req.getParameter("pw");
        String phNum = req.getParameter("phNum");
        String phid = req.getParameter("phid");
        String carNum = req.getParameter("carNum");
        String carType = req.getParameter("carType");

        Date date = new Date();
        
        Entity User = new Entity("User", id);
        User.setProperty("name", "isthis");
        User.setProperty("stu_num", stu_num);
        User.setProperty("pw", pw);
        User.setProperty("phNum", phNum);
        User.setProperty("phid", phid);
        User.setProperty("carNum", carNum);
        User.setProperty("carType", carType);
        User.setProperty("date", date);

        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        datastore.put(User);

       // resp.sendRedirect("/user_reg.jsp?id="+id+"&stu_num="+stu_num);
      	PersistenceManager pm = PMF.get().getPersistenceManager();
      	//Query query = pm.newQuery("select * from User where id ="+id+" and stu_num="+stu_num);
      	Query query = pm.newQuery("select * from User where id ='ft' and stu_num='52'");
//        	pm.close();
        List<User> users = (List<User>) query.execute();
        
        resp.sendRedirect("/user_reg.jsp?id="+id+"&stu_num="+stu_num+"&list="+users);

        	//out.println(query);
//        	out.println("success");

    }
}