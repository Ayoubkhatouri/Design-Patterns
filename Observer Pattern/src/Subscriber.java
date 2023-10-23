public class Subscriber { //c'est l'observateur

    private String name;
    private Channel channel=new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey "+name+" Video Uploaded");
    }

    public void subscribeChannel(Channel channel){
        this.channel=channel;
    }

}
