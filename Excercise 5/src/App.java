
public class App {
    public static void main(String[] args) {

        PhoneCharger oldCharger = new PhoneCharger();

        TypeCCharger adapter = new PhoneTypeCAdapter(oldCharger);

        Phone phone = new Phone();
        phone.charge(adapter);
    }
}