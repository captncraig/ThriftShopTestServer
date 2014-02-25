import foobar.AwesomeService;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.server.TServlet;

public class AwesomeServlet extends TServlet {

    public AwesomeServlet(){
        super(new AwesomeService.Processor(new AwesomeHandler()),new TJSONProtocol.Factory());
    }
}
