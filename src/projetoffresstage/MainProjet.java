package projetoffresstage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author jeremy
 */
public class MainProjet {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<OffreStage>lesOffres = new ArrayList<OffreStage>();
    public static ArrayList<Entreprise>lesEntreprises = new ArrayList<Entreprise>();
    public static Logger logger = Logger.getLogger("Mes premiers loggers");
    //public static Logger autreLogger = Logger.getLogger("Mon deuxieme type de logger");
    public static void main(String[] args) throws IOException {
    
        //Logger logger = Logger.getLogger("test du FileHandler");


    FileHandler fh = new FileHandler("v2.log");
    logger.addHandler(fh);
    //fh.setFormatter(new SimpleFormatter());
    //fh.setLevel(Level.INFO);
    
    //On supprime les handlers par défaut de l'API logging
    //Pour que les messages ne s'affichent pas plusieurs fois
    logger.setUseParentHandlers(false);
    
    logger.log(Level.INFO, "Test du FileHandler");
    
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        
    // on définit le niveau de logging du logger
    //logger.setLevel(Level.FINER);
        
        
        
        //on définit le niveau de logging du handler après avoir créé ce handler
    //ConsoleHandler ch=new ConsoleHandler();
    //logger.addHandler(ch);
    //ch.setLevel(Level.FINER);
    
    
    
    
    
    
    }
    
}
