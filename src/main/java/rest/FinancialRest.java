package rest;

import entity.FinancialQuote;
import registrator.FinancialRegistrator;
import repository.FinancialRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
@Path("/quote")
public class FinancialRest {

    @Inject
    private Logger logger;

    @Inject
    private FinancialRepository financialRepository;

    @Inject
    private FinancialRegistrator financialRegistrator;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<FinancialQuote> getListAll(){
        logger.info("Get all financial quote");
        return financialRepository.getAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public FinancialQuote getById (@PathParam("id") long id){
        return financialRepository.getById(id);
    }
}
