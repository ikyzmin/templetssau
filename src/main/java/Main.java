import actor.Generator;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;

/**
 * Created by Илья on 11.04.2017.
 */
public class Main {


    public static void main(String[] args) {
        ActorRunner runner = new ActorRunner();
        runner.run();
    }
}
