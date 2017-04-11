package actor;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.pf.ReceiveBuilder;

/**
 * Created by Илья on 11.04.2017.
 */
public class Generator extends AbstractActor {

    private final LoggingAdapter log = Logging.getLogger(context().system(), this);

    public Generator() {
        receive(ReceiveBuilder.
                match(String.class, s -> {
                    log.info("Received String message: {}", s);
                }).
                matchAny(o -> log.info("received unknown message")).build()
        );
    }
}
