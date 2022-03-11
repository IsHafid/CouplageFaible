package Dao;
import org.springframework.stereotype.Component;

@Component("dao1")
public class DaoImpl1 implements Dao{
    @Override
    public double getData(){
        System.out.println("Ismail HAFID version capteurs");
        double data=55;
        return data;
    }

}
