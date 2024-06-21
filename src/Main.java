import java.awt.*;

public class Main {
    //Programa que puxa e exibe a resolução da sua tel
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua máquina é: "+d.width+ "x" +d.height);
    }
}