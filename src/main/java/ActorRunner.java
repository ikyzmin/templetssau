import actor.Filter;
import actor.Generator;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;

/**
 * Created by Илья on 11.04.2017.
 */
public class ActorRunner {

    private static int COUNT = 100;
    private ActorRef[] filters = new ActorRef[COUNT];
    private static String ACTOR_SYSTEM_NAME = "PrimeNumberSystem";
    private static String GENERATOR = "generator";
    private static String FILTER = "filter%d";

    public void run() {

        ActorSystem actorSystem = ActorSystem.create(ACTOR_SYSTEM_NAME);
        ActorRef generator = actorSystem.actorOf(Generator.props(), GENERATOR);
        for (int i = 0; i < COUNT; i++) {
            filters[i] = actorSystem.actorOf(Filter.props(), String.format(FILTER, i));
            generator.tell(String.format("hello from filter %s", i), filters[i]);
        }
        actorSystem.terminate();
    }
}
