package entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.math.BigDecimal;

@Entity
@Table(name = "financial_quote")
public class FinancialQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cur_abbreviation")

    private String curAbbreviation;

    @Column(name = "date")

    private Timestamp date;

    @Column(name = "cur_rate")

    private BigDecimal curRate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCurAbbreviation() {
        return curAbbreviation;
    }

    public void setCurAbbreviation(String curAbbreviation) {
        this.curAbbreviation = curAbbreviation;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public BigDecimal getCurRate() {
        return curRate;
    }

    public void setCurRate(BigDecimal curRate) {
        this.curRate = curRate;
    }

    @Override
    public String toString() {
        return "FinancialRegistrator{" +
                "curAbbreviation='" + curAbbreviation + '\'' +
                ", date=" + date +
                ", curRate=" + curRate +
                '}';
    }
}
