package sisconlojai;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author DouglasInfo07
 */
public class SisConLojai {

    //Método para fixar icone do sistema no título da janela da aplicação.
    void IconePagina() {
        URL url = this.getClass().getResource("/imagens/logoDIMTech.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    public SisConLojai() {
    }

    public static void main(String[] args) {

        Login login = new Login();
        login.setVisible(true);
        login.setTitle("SisCon LOJAi  -  Tela de Login");

        login.setExtendedState(MAXIMIZED_BOTH);

    }

    public void setIconImage(Image iconeTitulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
