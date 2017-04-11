package actor;

import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * Created by Илья on 11.04.2017.
 */
public class Filter extends UntypedActor {

    public static Props props() {
        return Props.create(Filter.class, Filter::new);
    }

    @Override
    public void onReceive(Object o) throws Throwable {

    }
}
