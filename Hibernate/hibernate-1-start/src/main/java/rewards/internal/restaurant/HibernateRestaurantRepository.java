package rewards.internal.restaurant;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Finds restaurants using the Hibernate API.
 */
public class HibernateRestaurantRepository implements RestaurantRepository {

	private SessionFactory sessionFactory;

	/**
	 * Creates an new hibernate-based restaurant repository.
	 * @param sessionFactory the Hibernate session factory required to obtain sessions
	 */
	public HibernateRestaurantRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Restaurant findByMerchantNumber(String merchantNumber) {
		// TODO 4: Use named bind parameters to find and return a Restaurant based on its merchant number
		Query query = getCurrentSession().createQuery(
				"from Restaurant where number = ?");
		query.setString(0, merchantNumber);
		return (Restaurant) query.uniqueResult();
	}

	/**
	 * Returns the session associated with the ongoing reward transaction.
	 * @return the transactional session
	 */
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}