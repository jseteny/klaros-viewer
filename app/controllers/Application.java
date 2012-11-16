package controllers;

import models.k.tc.Step;
import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;


public class Application extends Controller {

    public static Result index() {
        DataSource ds = DB.getDataSource();
        Connection connection = DB.getConnection();

        List<Step> steps = Step.find.all();

        return ok(
                "Ennyi Step van: " + steps.size()
                        + "\n"
                        + "\n"
                        + "Ez az első: " + steps.get(0)
        );
    }

}