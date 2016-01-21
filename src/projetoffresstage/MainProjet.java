package projetoffresstage;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static Logger autreLogger = Logger.getLogger("Mon deuxieme type de logger");
    public static void main(String[] args) {
    
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        
    
        // on définit le niveau de logging du logger
    logger.setLevel(Level.FINER);
    
        
        //On supprime les handlers par défaut de l'API logging
        //Pour que les messages ne s'affichent pas plusieurs fois
    logger.setUseParentHandlers(false);
        
        //on définit le niveau de logging du handler après avoir créé ce handler
    ConsoleHandler ch=new ConsoleHandler();
    logger.addHandler(ch);
    ch.setLevel(Level.FINER);
    
    
    }
    
}
