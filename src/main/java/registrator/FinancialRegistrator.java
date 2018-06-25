package registrator;

import entity.FinancialQuote;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

@Stateless
public class FinancialRegistrator {

    @Inject
    private Logger logger;

    @Inject
    private EntityManager entityManager;

    public void create(FinancialQuote quote) {
        logger.info("Created quote" + quote);
        entityManager.merge(quote);
    }

    public void update(FinancialQuote quote) {
        logger.info("Updated quote" + quote);
        entityManager.merge(quote);
    }

    public void delete(FinancialQuote quote) {
        logger.info("Deleted quote" + quote);
        entityManager.remove(quote);
    }

}
