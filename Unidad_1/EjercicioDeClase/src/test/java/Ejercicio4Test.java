import ies.puerto.Ejercicio4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void constructorTestOk(){
        Assertions.assertNotNull(ejercicio4, "El objeto no puede ser nulo");
    }
}
