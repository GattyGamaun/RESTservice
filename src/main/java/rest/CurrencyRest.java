package rest;

import entity.Currency;
import registrator.CurrencyRegistrator;
import repository.CurrencyRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

@RequestScoped
@Path("/currency")
public class CurrencyRest {
    @Inject
    private Logger logger;

    @Inject
    private CurrencyRegistrator registrator;

    @Inject
    private CurrencyRepository repository;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getAll(){
        logger.info("Get full currency");
        return repository.getAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Currency getById(long id){
        logger.info("Get currency by id " + id);
        return repository.getById(id);
    }
}
