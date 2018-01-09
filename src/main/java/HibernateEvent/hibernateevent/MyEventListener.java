package HibernateEvent.hibernateevent;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.event.spi.SaveOrUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;

public class MyEventListener
		implements PostUpdateEventListener, PreUpdateEventListener, SaveOrUpdateEventListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void onSaveOrUpdate(SaveOrUpdateEvent arg0) throws HibernateException {

		// Add your logic here
		UserDetails ud = (UserDetails) arg0.getEntity();
		System.out.println("Save " +  ud.toString());

	}

	public boolean onPreUpdate(PreUpdateEvent arg0) {
		// Add your logic here
		UserDetails ud = (UserDetails) arg0.getEntity();
		System.out.println("Pre update " + ud.toString());

		return false;
	}

	public void onPostUpdate(PostUpdateEvent arg0) {
		// Add your logic here
		UserDetails ud = (UserDetails) arg0.getEntity();
		System.out.println("Post Update " + ud.toString());

	}

	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
