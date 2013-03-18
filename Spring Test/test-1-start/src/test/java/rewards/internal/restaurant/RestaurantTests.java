package rewards.internal.restaurant;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import common.money.MonetaryAmount;
import common.money.Percentage;

import rewards.Dining;
import rewards.internal.account.Account;

/**
 * Unit tests for exercising the behavior of the Restaurant aggregate entity. A restaurant calculates a benefit to award
 * to an account for dining based on an availability policy and benefit percentage.
 */
public class RestaurantTests {

	private Account account;

	private Dining dining;
	
	private Restaurant restaurant;

	// sets up test fixtures
	@Before
	public void setUp() {
		// TODO 1: setup the main Restaurant object you will test
		restaurant = new Restaurant("123", "Pizza Hut");
		restaurant.setBenefitPercentage(Percentage.valueOf("4%"));
		
		// sets up supporting objects needed to run the test
		account = new Account("123456789", "Keith and Keri Donald");
		account.addBeneficiary("Annabelle");
		// creates a new dining of 100.00 charged to credit card '1234123412341234' by merchant '123457890'
		dining = Dining.createDining("100.00", "1234123412341234", "1234567890");
	}

	@Test
	public void testCalcuateBenefitFor() {
		// TODO 2: Implement the 'normal' calculateBenefitFor() scenario test
		StubBenefitAvailibilityPolicy policy = new StubBenefitAvailibilityPolicy(true);
		restaurant.setBenefitAvailabilityPolicy(policy);
		
		MonetaryAmount reward = restaurant.calculateBenefitFor(account, dining);
		assertEquals(MonetaryAmount.valueOf("4.00"), reward);
	}

	@Test
	public void testNoBenefitAvailable() {
		// TODO 3: Implement the 'exceptional' noBenefitAvailable() scenario test
		StubBenefitAvailibilityPolicy policy = new StubBenefitAvailibilityPolicy(false);
		restaurant.setBenefitAvailabilityPolicy(policy);
		
		MonetaryAmount reward = restaurant.calculateBenefitFor(account, dining);
		assertEquals(MonetaryAmount.zero(), reward);

	}

	/**
	 * A simple "dummy" benefit availability policy containing a single flag used to determine if benefit is available.
	 * Only useful for testing--a real availability policy might consider many factors such as the day of week of the
	 * dining, or the account's reward history for the current month.
	 */
	private static class StubBenefitAvailibilityPolicy implements BenefitAvailabilityPolicy {

		private boolean isBenefitAvailable;

		public StubBenefitAvailibilityPolicy(boolean isBenefitAvailable) {
			this.isBenefitAvailable = isBenefitAvailable;
		}

		public boolean isBenefitAvailableFor(Account account, Dining dining) {
			return isBenefitAvailable;
		}
	}
}