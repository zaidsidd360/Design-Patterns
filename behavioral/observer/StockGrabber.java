package behavioral.observer;

import java.util.*;

public class StockGrabber implements Subject {

	private List<Observer> observers;
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer observerToDelete) {
		int observerToDeleteIndex = observers.indexOf(observerToDelete);
		System.out.println("Observer " + (observerToDeleteIndex + 1) + " deleted.");
		observers.remove(observerToDeleteIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public void setIBMprice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}

	public void setAPPLEprice(double newAPPLEPrice) {
		this.applePrice = newAPPLEPrice;
		notifyObserver();
	}

	public void setGOOGLEprice(double newGOOGLEPrice) {
		this.googlePrice = newGOOGLEPrice;
		notifyObserver();
	}

}
