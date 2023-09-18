public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale=new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Hello");
        uniteCentrale.setVga(new VideoProjector());
        uniteCentrale.print("Hello");
      //  uniteCentrale.setVga(new TV()); //impossible
        //with Adapter pattern
        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Hello ");
    }
}