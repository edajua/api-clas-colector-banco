package hn.gob.sefin.services.clas.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Component;

import hn.gob.sefin.services.clas.mock.ColectorMocker;
import hn.gob.sefin.services.clas.pojo.Colector;
import hn.gob.sefin.services.clas.pojo.ColectorWrapper;

@Path("/clasificador/colector")
@Component
public class ServiceEndpoint {

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public ColectorWrapper getBanco(@QueryParam("codigoColector")  String codigoColector) {
        return ColectorMocker.addColectorWrapper();
    }

    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ColectorWrapper postBanco(Colector colector) {
        return ColectorMocker.addColectorWrapper();
    }
    
    @DELETE
    @Consumes("application/json")
    @Produces("application/json")
    public ColectorWrapper deleteBanco(Colector colector) {
        return ColectorMocker.addColectorWrapper();
    }
    
    
    
    @PATCH
    @Consumes("application/json")
    @Produces("application/json")
    public ColectorWrapper patchBanco(Colector colector) {
        return ColectorMocker.addColectorWrapper();
    }
}
