public class Exam02 {
    public static void main(String[] args) {

        String log = "192.168.1.50 - - [31/Mar/2026:10:00:05 +0900] \"POST /login.php HTTP/1.1\" 302 20 \"-\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 17_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.0 Mobile/15E148 Safari/604.1\"";

        int space = log.indexOf(" ", log.indexOf("\""));

                System.out.println(space);
                String res = log.substring(space, log.indexOf(" ", space + 1));

        System.out.println("접속한 페이지 : " + res);
    }

}
