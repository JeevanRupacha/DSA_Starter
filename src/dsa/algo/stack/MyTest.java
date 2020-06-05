package dsa.algo.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 public class MyTest {
    Stack stack;

    @Before
    public void setUp() throws Exception{
        stack = new Stack();
     }

    @Test
    public void pop(){
        stack.push("test2");
        stack.push("item2");
        Assert.assertEquals("item2", stack.pop());
        stack.push("item3");
        stack.push("item4");
        stack.push("item5");
        Assert.assertEquals("item5", stack.pop());

        stack.displayStack();
    }

    @Test
    public void push(){
        stack.push("test2");
        stack.push("item2");
        Assert.assertEquals(1, stack.top);
        stack.push("item3");
        stack.push("item4");
        Assert.assertEquals(3, stack.top);

        stack.push("item5");
        Assert.assertEquals(4, stack.top);

    }

}
