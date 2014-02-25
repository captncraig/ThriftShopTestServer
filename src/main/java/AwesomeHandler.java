import foobar.AwesomeService;
import org.apache.thrift.TException;

public class AwesomeHandler implements AwesomeService.Iface {

    @Override
    public void Ping() throws TException {
        System.out.println("ping");
    }

    @Override
    public String ReverseString(String s) throws TException {
        return new StringBuilder(s).reverse().toString();
    }

    @Override
    public int Add(int a, int b) throws TException {
        return a + b;
    }

    @Override
    public String AllPrimitives(boolean b, byte by, short sh, int i, long lon, double dub, String s) throws TException {
        return String.format("You gave: ({%s})({%s})({%s})({%s})({%s})({%s})({%s})",b,by,sh,i,lon,dub,s);
    }
}
