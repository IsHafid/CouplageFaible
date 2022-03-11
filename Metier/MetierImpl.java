package Metier;
import Dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("dao2")
    private Dao dao;
    @Override
    public double calcul() {
        double t=dao.getData(); double res=t*66;
        return res;
    }
    /* Setter pour injection des dépendances*/
    public void setDao(Dao dao) { this.dao = dao; }


}
