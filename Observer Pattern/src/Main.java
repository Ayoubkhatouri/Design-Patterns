public class Main {
    public static void main(String[] args) {
        //this is like youtube when new video is upload they notify there subscribers

        Channel channel=new Channel();
        Subscriber s1=new Subscriber("ayoub");
        Subscriber s2=new Subscriber("ayoub2");
        Subscriber s3=new Subscriber("ayoub3");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);

        channel.upload("New Video");
    }
}