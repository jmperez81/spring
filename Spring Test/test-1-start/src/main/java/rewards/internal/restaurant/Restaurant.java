package rewards.internal.restaurant;

import rewards.Dining;
import rewards.internal.account.Account;

import common.money.MonetaryAmount;
import common.money.Percentage;
import common.repository.Entity;

/**
 * A restaurant establishment in the network. Like AppleBee's.
 * 
 * Restaurants calculate how much benefit may be awarded to an account for dining based on a availability policy and a
 * benefit percentage.
 */
public class Restaurant extends Entity {

	private String number;

	private String name;

	private Percentage benefitPercentage;

	// TODO 1: add a private BenefitAvailabilityPolicy field that will encapsulate Restaurant benefit availability
	// rules.
	// make the policy configurable by generating a setter method (eclipse shortcut: ALT + SHIFT + S then R).
	private BenefitAvailabilityPolicy benefitAvailabilityPolicy;

	public BenefitAvailabilityPolicy getBenefitAvailabilityPolicy() {
		return benefitAvailabilityPolicy;
	}

	public void setBenefitAvailabilityPolicy(
			BenefitAvailabilityPolicy benefitAvailabilityPolicy) {
		this.benefitAvailabilityPolicy = benefitAvailabilityPolicy;
	}

	@SuppressWarnings("unused")
	private Restaurant() {
	}

	/**
	 * Creates a new restaurant.
	 * @param number the restaurant's merchant number
	 * @param name the name of the restaurant
	 */
	public Restaurant(String number, String name) {
		this.number = number;
		this.name = name;
	}

	/**
	 * Sets the percentage benefit to be awarded for eligible dining transactions.
	 * @param benefitPercentage the benefit percentage
	 */
	public void setBenefitPercentage(Percentage benefitPercentage) {
		this.benefitPercentage = benefitPercentage;
	}

	/**
	 * Returns the name of this restaurant.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the merchant number of this restaurant.
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Returns this restaurant's benefit percentage.
	 */
	public Percentage getBenefitPercentage() {
		return benefitPercentage;
	}

	/**
	 * Calculate the benefit eligible to this account for dining at this restaurant.
	 * @param account the account that dined at this restaurant
	 * @param dining a dining event that occurred
	 * @return the benefit amount eligible for reward
	 */
	public MonetaryAmount calculateBenefitFor(Account account, Dining dining) {
		// TODO 2: first ask the policy if benefit is available; if yes, return the percentage benefit amount; if no,
		// return a zero amount.
		if(benefitAvailabilityPolicy.isBenefitAvailableFor(account, dining)) {
			return dining.getAmount().multiplyBy(benefitPercentage);
		} else {
			return new MonetaryAmount(0);
		}
	}

	public String toString() {
		return "Number = '" + number + "', name = '" + name + "', benefitPercentage = " + benefitPercentage;
	}
}