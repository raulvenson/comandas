/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.raul.comandas;

import br.com.raul.view.TelaPrincipal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Sidnei
 */
public class Main {
    

    public static void main(String[] args)  {

//        if (isRunning(Main.class.getName())) {
//            System.out.println("Aplicação está em execução");
//            System.exit(0);
//        }

//        JWindow jwInicializandoSistema = new JWindow();
//        JXBusyLabel jxblInicializandoSistema = new JXBusyLabel();
//
//        jxblInicializandoSistema.setText("Inicializando banco de dados...");
//        jxblInicializandoSistema.setBusy(true);
//        jwInicializandoSistema.add(jxblInicializandoSistema);
//        jwInicializandoSistema.setSize(300, 150);
//        jwInicializandoSistema.setLocationRelativeTo(null);
//        jwInicializandoSistema.setVisible(true);
//        try {
//            Properties props = new Properties();
//            props.put("logoString", "S.G.L.M");
//            GraphiteLookAndFeel.setCurrentTheme(props);
//            try {
//                //             select the Look and Feel
//                UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
//                //AcrylLookAndFeel.setCurrentTheme(props);
////            UIManager.setLookAndFeel(new FlatIntelliJLaf());
//
////UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (UnsupportedLookAndFeelException e) {
//            throw new ErroSistemaException("Não foi possível carregar o LookAndFeel", e);
//        }
//
//        java.awt.EventQueue.invokeLater(() -> {
//            jwInicializandoSistema.setVisible(false);
//        });
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
           
        });
    }

//    public static boolean isRunning(String applicationName) {
//        try {
//            Process process = Runtime.getRuntime().exec("jps -l");
//            InputStream ips = process.getInputStream();
//            BufferedReader bfr = new BufferedReader(new InputStreamReader(ips));
//            String line = null;
//            List<String> javaProcesses = new ArrayList<String>();
//            while ((line = bfr.readLine()) != null) {
//                String[] splited = line.split(" ");
//                javaProcesses.add(splited.length > 1 ? splited[1] : "");
//            }
//            Iterator<String> it = javaProcesses.iterator();
//            Integer count = 0;
//            while (it.hasNext()) {
//                if (it.next().equals(applicationName)) {
//                    count++;
//                }
//            }
//            return count >= 2;
//        } catch (IOException e) {
//            return false;
//        }
//    }

}
