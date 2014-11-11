package webapp.foo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "foo" path)
 */
@Path("foo")
public class FooResource {
   	EntityManagerFactory emf = Persistence.createEntityManagerFactory("fooUnit");
   	EntityManager em = emf.createEntityManager();
   	
    /**
     * returns foo records
     *
     * @return records from foo
     */
	@GET
    @Consumes(MediaType.APPLICATION_JSON + "; charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")
    public List getIt() {
    	return em.createNativeQuery("select * from foo", Foo.class).getResultList();
    }
}