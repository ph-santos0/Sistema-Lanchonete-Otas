package main;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;
import visao.usuario.TelaLogin;

/**
 *
 * @author wfabi0
 */
public class Main {

    public static void main(String[] args) {
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
