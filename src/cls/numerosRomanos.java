package cls;

/**
 * Created by luisolvera on 22/04/15.
 */
public class numerosRomanos {
    public String obtenDecimalEnRomano ( Integer numeroDecimal)
    {    String cadenaRomana="";
        while (numeroDecimal>0)
        {
            numeroDecimal = numeroDecimal-1;
            cadenaRomana+="I"  ;
        }
        return cadenaRomana;
    }
}
