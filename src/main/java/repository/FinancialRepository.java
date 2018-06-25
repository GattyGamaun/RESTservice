package repository;

import entity.FinancialQuote;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class FinancialRepository {

    @Inject
    private Logger logger;

    @Inject
    private EntityManager entityManager;

    public FinancialQuote getById(long id) {
        logger.info("Get quote by id" + id);
        return entityManager.find(FinancialQuote.class, id);
    }

    public List<FinancialQuote> getAll(){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<FinancialQuote> criteriaQuery = criteriaBuilder.createQuery(FinancialQuote.class);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
