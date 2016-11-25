package testcases;

import common.HttpRequest;
import org.testng.annotations.Test;

/**
 * Created by lilei on 16/11/24.
 */

public class SendPost {
    HttpRequest httpRequest = new HttpRequest();

    @Test
    public void testCase1() {
        String s = httpRequest.sendPost("http://10.4.254.66:8414/renderer/wl/quote", "from=PEK&filter=kxmb_ac&to=SHA&queryid=4599da6159e59831&date=2016-12-26&type=multiple&action=noaction");
        System.out.println(s);
    }
}
