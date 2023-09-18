public class HdmiVgaAdapter  implements Vga{//now we can do UC.setVga(HdmiVgaAdapter)
    private Hdmi hdmi;//or instead of composition we can do it with inhertance (extends TV)  and the super.view(data)
    @Override
    public void print(String message) {
        System.out.println("=======Adapter======");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("=======Adapter======");

    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
