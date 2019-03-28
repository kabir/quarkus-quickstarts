package org.acme.quickstart;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

/**
 * @author <a href="mailto:kabir.khan@jboss.com">Kabir Khan</a>
 */
@ApplicationScoped
@Alternative
@Priority(100)
public class MockGreetingService extends GreetingService {
    @Override
    public String greeting(String name) {
        return "A Mock";
    }
}
