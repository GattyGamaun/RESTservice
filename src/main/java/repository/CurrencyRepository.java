package repository;

import entity.Currency;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class CurrencyRepository {

    @Inject
    private EntityManager entityManager;

    @Inject
    private Logger logger;

    public List<Currency> getAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Currency> criteriaQuery = criteriaBuilder.createQuery(Currency.class);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public Currency getById(long id) {
        logger.info("Get currency by id" + id);
        return entityManager.find(Currency.class, id);
    }

}
