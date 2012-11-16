package models.k.tc;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "k_tc_step")
public class Step extends Model {

    @Column(columnDefinition = "KL__ID CHAR(36) NOT NULL")
    public String KL__ID;

    @Column(columnDefinition = "PRE_CONDITION LONGTEXT")
    public String PRE_CONDITION;

    @Column(columnDefinition = "ACTION LONGTEXT")
    public String ACTION;

    @Column(columnDefinition = "POST_CONDITION LONGTEXT")
    public String POST_CONDITION;

    @Column(columnDefinition = "EXPECTED_RESULT LONGTEXT")
    public String EXPECTED_RESULT;

    public static Finder<Long, Step> find = new Finder<Long, Step>(
            Long.class, Step.class
    );
}
