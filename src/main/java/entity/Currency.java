package entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cur_id")

    private int curId;

    @NotNull    @Column(name = "cur_abbreviation")
    private String curAbbreviation;


    @Column(name = "cur_name")
    private String curName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCurId() {
        return curId;
    }

    public void setCurId(int curId) {
        this.curId = curId;
    }

    public String getCurAbbreviation() {
        return curAbbreviation;
    }

    public void setCurAbbreviation(String curAbbreviation) {
        this.curAbbreviation = curAbbreviation;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "curId=" + curId +
                ", curAbbreviation='" + curAbbreviation + '\'' +
                ", curName='" + curName + '\'' +
                '}';
    }
}
