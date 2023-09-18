public class TV implements Hdmi{ //now this is a problem if we want to pass TV to UniteCentrale its impossible
                                //cause Unite Centrale know only Vga types that is way we create an Adapter
    @Override
    public void view(byte[] data) {
        System.out.println("?????????TV??????");
        String message=new String(data);
        System.out.println(message);
        System.out.println("?????????TV??????");

    }
}
