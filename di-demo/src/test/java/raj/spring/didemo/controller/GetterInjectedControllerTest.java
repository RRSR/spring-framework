package raj.spring.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import raj.spring.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO, getterInjectedController.sayHello());
    }

}
