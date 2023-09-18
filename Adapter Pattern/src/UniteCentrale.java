public class UniteCentrale {
    private Vga vga;

    public  void print(String message){
        System.out.println("**************");
        vga.print(message);
        System.out.println("**************");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
