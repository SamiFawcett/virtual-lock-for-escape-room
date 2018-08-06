

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class test_lockTest
{
    Lock easy_lock = new Lock("Easy Lock", true, "open", "");
    
    @Test
     public void test_open(){
        assertEquals(easy_lock.locked, true);
        easy_lock.attempt_open();
        assertEquals(easy_lock.locked, false);
    }
    
    @Test
    public void test_last_guess(){
        easy_lock.attempt_open();
        //input 'guessing' as lock answer to test this
        assertEquals(easy_lock.last_guess, "guessing");
    }
   
    
    @Test
    public void test_num_attempts_for_correct(){
        easy_lock.attempt_open();
        //get it correct for 1 attempt
        assertEquals(easy_lock.num_attempts, 1);
    }
    
    @Test
     public void test_num_attempts_for_wrong(){
        easy_lock.attempt_open();
        //attempt 5 times
        assertEquals(easy_lock.num_attempts, 5);
    }

 
}
