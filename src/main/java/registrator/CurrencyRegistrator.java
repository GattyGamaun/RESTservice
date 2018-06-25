package registrator;


import entity.Currency;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

@Stateless
public class CurrencyRegistrator {

    @Inject
    private Logger logger;

    @Inject
    private EntityManager entityManager;

    public void create(Currency currency) {
        logger.info("Created currency" + currency);
        entityManager.merge(currency);
    }

    public void update(Currency currency) {
        logger.info("Updated currency" + currency);
        entityManager.merge(currency);
    }

    public void delete(Currency currency) {
        logger.info("Deleted currency" + currency);
        entityManager.remove(currency);
    }
}
