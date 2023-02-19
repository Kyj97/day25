import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("클라이언트 시작됨");
        try {
            try (Socket clientSocket = new Socket("165.246.115.165", 20000); PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true); BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                System.out.println("서버에 연결됨");
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("메뉴: 1.Create | 2.Update | 3.Delete | 4.Exit");
                    String choice = sc.nextLine();
                    if (choice == "1") {

                    } else if (choice == "2") {

                    } else if (choice == "3") {

                    } else if (choice == "4") {
                        break;
                    } else {
                        System.out.println("올바른 번호를 입력해주세요.");
                    }
                }
            } catch (IOException ex) {
                System.out.println("입출력 예외 발생");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void create() throws IOException {
        //상품 정보 입력
        System.out.println("[상품 생성]");
        Product product = new Product();
        System.out.print("상품 이름: ");
        product.setName(sc.nextLine());
        System.out.print("상품 가격: ");
        product.setPrice(Integer.parseInt(sc.nextLine()));
        System.out.print("상품 재고: ");
        product.setStock(Integer.parseInt(sc.nextLine()));


}