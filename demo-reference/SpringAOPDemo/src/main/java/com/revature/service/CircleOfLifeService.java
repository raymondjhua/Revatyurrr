package com.revature.service;

import org.springframework.stereotype.Component;

import com.revature.model.Animal;

@Component
public class CircleOfLifeService {

	// private static Logger log = Logger.getRootLogger();

	/**
	 * 
	 * @param a1 animal chasing a2
	 * @param a2 animal being pursued
	 * @throws GotEatenException when pursuer is hungry and also faster
	 */
	public void chase(Animal a1, Animal a2) throws GotEatenException {
		// log.info(a1 + " is chasing " + a2);
		// if (a1.getSpeed() > a2.getSpeed()) {
			this.capture(a1, a2);
		// }
	}

	/**
	 * 
	 * @param a1 animal which has captured a2
	 * @param a2 animal which has been captured
	 * @throws GotEatenException if a1 is hungry
	 */
	public void capture(Animal a1, Animal a2) throws GotEatenException {
		// log.warn(a1 + " caught " + a2);
		if (a1.isHungry()) {
			// log.fatal(a1 + " ate " + a2);
			throw new GotEatenException(a1 + " ate " + a2);
		}
	}

}
