package com.learn.builder;

public class Plan {
	public String morningPlan;
	public String afternoonPlan;
	public String nightPlan;
	public String sleepPlan;

	/**
	 * @return the morningPlan
	 */
	public String getMorningPlan() {
		return morningPlan;
	}

	/**
	 * @param morningPlan the morningPlan to set
	 */
	public void setMorningPlan(String morningPlan) {
		this.morningPlan = morningPlan;
	}

	/**
	 * @return the afternoonPlan
	 */
	public String getAfternoonPlan() {
		return afternoonPlan;
	}

	/**
	 * @param afternoonPlan the afternoonPlan to set
	 */
	public void setAfternoonPlan(String afternoonPlan) {
		this.afternoonPlan = afternoonPlan;
	}

	/**
	 * @return the nightPlan
	 */
	public String getNightPlan() {
		return nightPlan;
	}

	/**
	 * @param nightPlan the nightPlan to set
	 */
	public void setNightPlan(String nightPlan) {
		this.nightPlan = nightPlan;
	}

	/**
	 * @return the sleepPlan
	 */
	public String getSleepPlan() {
		return sleepPlan;
	}

	/**
	 * @param sleepPlan the sleepPlan to set
	 */
	public void setSleepPlan(String sleepPlan) {
		this.sleepPlan = sleepPlan;
	}

	@Override
	public String toString() {
		return "Plan [morningPlan=" + morningPlan + ", afternoonPlan=" + afternoonPlan + ", nightPlan=" + nightPlan
				+ ", sleepPlan=" + sleepPlan + "]";
	}

}
