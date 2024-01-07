package app;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FLogin loginForm = new FLogin();
                loginForm.setVisible(true); // Tampilkan frame terlebih dahulu
                setFormLocation(loginForm);
            }
        });
    }

    // Metode untuk menetapkan lokasi frame di tengah desktop
    private static void setFormLocation(JFrame frame) {
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }
}
