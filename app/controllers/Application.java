package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import play.db.*;

import javax.sql.DataSource;
import java.sql.Connection;


public class Application extends Controller {
  
  public static Result index() {
      DataSource ds=DB.getDataSource();
      Connection connection = DB.getConnection();
      return ok("olaf");
  }
  
}