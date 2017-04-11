package actor;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;

/**
 * Created by Илья on 11.04.2017.
 */
public class Generator extends UntypedActor {

    public static Props props() {
        return Props.create(Generator.class, Generator::new);
    }

    private final LoggingAdapter log = Logging.getLogger(context().system(), this);

    @Override
    public void onReceive(Object o) throws Throwable {
        if (o instanceof String) {
            System.out.println(o);
        }
    }

    public Generator() {

    }
}
