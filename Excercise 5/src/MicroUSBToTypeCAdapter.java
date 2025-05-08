class PhoneTypeCAdapter implements TypeCCharger {
    private PhoneCharger PhoneCharger;
    private PhoneCharger microUSBCharger;

    public PhoneTypeCAdapter(PhoneCharger microUSBCharger) {
        this.microUSBCharger = microUSBCharger;
    }

    @Override
    public void connectWithTypeC() {
        System.out.println("Adapting Micro USB to Type-C...");
        PhoneCharger.connectWithMicroUSB();
    }
}