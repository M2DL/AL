package log.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by seb on 03/02/17.
 */
public class LogService {

    File log;
    /**
     * Cr�ation d'un nouveau fichier 
     * @param chemin du fichier
     */
    public LogService(String path) {
        this.log = new File(path);
    }

    /**
     *  Cr�ation d'un nouveau fichier log par d�fauts
     */
    public LogService() {
        this.log = new File("log");
    }
    /**
     * Ecriture 
     * @param ligne
     */
    public void ecrireLog(String logLine) {
        try {
            PrintWriter pw = new PrintWriter(this.log);
            pw.write(logLine);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
