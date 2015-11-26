import javax.swing.*;
import java.lang.management.ManagementFactory;

/**
 * Created by Kamil on 2015-11-26.
 */
public class SeeMeInJavaVisualVM {

    public static void main(String[] args){
        System.out.println("something");

        String name = ManagementFactory.getRuntimeMXBean().getName();
        JOptionPane.showMessageDialog(null, name + " To finish click OK");
    }
}
