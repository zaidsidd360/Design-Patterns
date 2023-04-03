package behavioral.observer;

public class GrabStocks {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setAPPLEprice(3434);
		stockGrabber.setGOOGLEprice(4354);
		stockGrabber.setIBMprice(345);

		StockObserver observer2 = new StockObserver(stockGrabber);

		stockGrabber.setAPPLEprice(3434);
		stockGrabber.setGOOGLEprice(4354);
		stockGrabber.setIBMprice(3455);

		stockGrabber.unregister(observer1);

		stockGrabber.setAPPLEprice(3434);
		stockGrabber.setGOOGLEprice(4354);
		stockGrabber.setIBMprice(3455);
	}

}
