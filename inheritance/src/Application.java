
public class Application {

	public static void main(String[] args) {

		Invoice tv = new Invoice();

		tv.setRateperunit(20000.00);
		tv.setInvoiceno(101);
		tv.setQunatity(50);

		System.out.println(tv.toString());

	}


}
