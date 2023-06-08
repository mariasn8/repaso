package simulacro;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
public class ProblemaCambioTest {
    private List<Integer> sistemaMonedas = new ArrayList<>();

    /* Sistema de monedas ordenado de mayor a menor, en céntimos */
    @Before
    public void setup() {
        this.sistemaMonedas.addAll(Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1));
    }

    @Test
    public void cambioIterativo250Ok() {
        assertEquals(2, ProblemaCambio.cambioIterativo(250, this.sistemaMonedas));
    }

    @Test
    public void cambioIterativo250Fail() {
        assertEquals(1, ProblemaCambio.cambioIterativo(250, this.sistemaMonedas));
    }

    @Test
    public void cambioIterativo109Ok() {
        assertEquals(4, ProblemaCambio.cambioIterativo(109, this.sistemaMonedas));
    }

    @Test
    public void cambioRecursivo250Ok() {
        assertEquals(2, ProblemaCambio.cambioRecursivo(250, this.sistemaMonedas));
    }
}