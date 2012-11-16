package controllers;

import models.k.tc.Step;
import play.mvc.*;

import play.db.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;


public class Application extends Controller {
  
  public static Result index() {
      DataSource ds=DB.getDataSource();
      Connection connection = DB.getConnection();

      List<Step> steps = Step.find.all();

      return ok("Ennyi Step van: " + steps.size());
  }
  
}