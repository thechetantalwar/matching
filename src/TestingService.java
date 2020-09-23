import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class TestingService {
    @Test
    public void testingProcessMethod(){
        SomeService s = Mockito.mock(SomeService.class);

        Mockito.when(s.doSomething(Matchers.anyInt())).thenReturn(10,20, 0);
        Process p =new Process(s);
        String result = p.processing();
        System.out.println(result);
        Assert.assertEquals(result,"Some Number is 10");
        result = p.processing();
        System.out.println(result);
        Assert.assertEquals(result,"Some Number is 20");
        result = p.processing();
        System.out.println(result);
        Assert.assertEquals(result,"Some Number is 0");
    }
}
