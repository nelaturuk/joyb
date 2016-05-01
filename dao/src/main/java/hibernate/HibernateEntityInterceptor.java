package hibernate;

import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class HibernateEntityInterceptor extends EmptyInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

		// log delete events
		System.out.println("Delete event");
	}

	// called when a Student gets updated.
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		return false;
	}

	// called on load events
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

		// log loading events
		System.out.println("Load Operation");
		return true;
	}

	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		return false;
	}

	// called before commit into database
	public void preFlush(Iterator iterator) {
		System.out.println("Before commiting");
	}

	// called after committed into database
	public void postFlush(Iterator iterator) {
		System.out.println("After commiting");
	}

}
