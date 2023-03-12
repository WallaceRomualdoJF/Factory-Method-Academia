import static org.junit.Assert.*;

import org.junit.Test;

public class ServicoMatriculaFactoryTest {
    @Test
    public void testCriarServicoMatricula() {
        ServicoMatricula servicoMatricula = ServicoMatriculaFactory.criarServicoMatricula("Musculação");
        assertNotNull(servicoMatricula);
        assertTrue(servicoMatricula instanceof ServicoMatriculaMusculacao);

        servicoMatricula = ServicoMatriculaFactory.criarServicoMatricula("Artes Marciais");
        assertNotNull(servicoMatricula);
        assertTrue(servicoMatricula instanceof ServicoMatriculaArtesMarciais);

        servicoMatricula = ServicoMatriculaFactory.criarServicoMatricula("Boxe");
        assertNotNull(servicoMatricula);
        assertTrue(servicoMatricula instanceof ServicoMatriculaBoxe);

        try {
            servicoMatricula = ServicoMatriculaFactory.criarServicoMatricula("Judo");
            fail("Deveria lançar uma exceção ao criar um serviço para uma arte marcial.");
        } catch (IllegalArgumentException e) {
            assertEquals("Área de matrícula inválida: Judo", e.getMessage());
        }
    }
}