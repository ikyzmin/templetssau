import actor.Generator;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;

/**
 * Created by Илья on 11.04.2017.
 */
public class Main {

    public static String ACTOR_SYSTEM_NAME = "PrimeNumberSystem";
    public static String GENERATOR = "generator";

    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create(ACTOR_SYSTEM_NAME);
        ActorRef generator = actorSystem.actorOf(Generator.props(), GENERATOR);
        generator.tell("Hello", ActorRef.noSender());
        actorSystem.terminate();
    }
}
