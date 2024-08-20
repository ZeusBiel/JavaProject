package br.com.fiap.bean;

import java.io.File;

public class Diretorio {
    private File dir = new File("");

    public File getDir() {
        return dir;
    }

    public void setDir(File dir) {
        this.dir = dir;
    }

    public static boolean criaDiretorio(){
        try {
            File dir = new File("d:/loja");
            if (!dir.exists()) {
                dir.mkdir();
            }
            dir = new File("d:/loja/site");
            if (!dir.exists()) {
                dir.mkdir();
            }
            dir = new File("d:/loja/site/imagens");
            if (!dir.exists()) {
                dir.mkdir();
            }
            dir = new File("d:/loja/site/sons");
            if (!dir.exists()) {
                dir.mkdir();
            }
            dir = new File("d:/loja/site/videos");
            if (!dir.exists()) {
                dir.mkdir();
            }

            System.out.println("Pastas criadas com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void listaDiretorio(){
        
    }
}

