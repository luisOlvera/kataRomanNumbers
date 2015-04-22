package test;

import cls.numerosRomanos;
import org.junit.Assert;

import static org.junit.Assert.*;

public class numerosRomanosTest {

    numerosRomanos numRomano ;
    @org.junit.Before
    public  void setup (){
        numRomano = new numerosRomanos();
    }

    @org.junit.Test
    public void Decimal_1_result_I() throws Exception {
        assertConversionDeDecimal(1,"I");
    }

    @org.junit.Test
    public void Decimal_2_result_II() throws Exception {
        assertConversionDeDecimal(2,"II");
    }

    public void assertConversionDeDecimal( Integer Deciaml, String numeroRomano){
        Assert.assertEquals(numeroRomano, numRomano.obtenDecimalEnRomano(Deciaml));
    }

}