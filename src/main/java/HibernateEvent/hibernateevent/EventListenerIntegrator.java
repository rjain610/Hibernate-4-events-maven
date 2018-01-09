package HibernateEvent.hibernateevent;

import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.integrator.spi.Integrator;
import org.hibernate.metamodel.source.MetadataImplementor;
import org.hibernate.service.spi.SessionFactoryServiceRegistry;


public class EventListenerIntegrator implements Integrator	 {

	public void disintegrate(SessionFactoryImplementor arg0, SessionFactoryServiceRegistry arg1) {
		
	}

	public void integrate(Configuration arg0, SessionFactoryImplementor arg1, SessionFactoryServiceRegistry arg2) {
		EventListenerRegistry eventListenerRegistry = 
				arg2.getService(EventListenerRegistry.class);
		
		MyEventListener ls = new MyEventListener();
	      eventListenerRegistry.appendListeners(EventType.PRE_UPDATE, ls );
      eventListenerRegistry.appendListeners(EventType.POST_UPDATE, ls );
      eventListenerRegistry.appendListeners(EventType.SAVE, ls );
  
		
	}

	public void integrate(MetadataImplementor arg0, SessionFactoryImplementor arg1,
			SessionFactoryServiceRegistry arg2) {
		
		
	}

	

	

}
