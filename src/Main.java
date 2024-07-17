import java.net.URI;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;


public class Main {
    public static void main(String[] args) {
        System.out.println("Просто маленькая презентация,как вас зовут?");
        System.out.print("Меня зовут: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Presentation pres;
        if (!name.isEmpty()) {
            pres = new Presentation(name);
        } else {

            pres = new Presentation();
        }
        try{
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(pres.getUrl()));
            }
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println(pres.getName()+ " "  + pres.getText());
    }
}
