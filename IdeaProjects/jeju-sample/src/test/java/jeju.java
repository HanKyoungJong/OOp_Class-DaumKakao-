import com.sun.corba.se.spi.transport.CorbaAcceptor;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class jeju {
    @Test
    public void testAdd() throws Exception {

        assertThat(5 + 10, is(15));

    }
}
