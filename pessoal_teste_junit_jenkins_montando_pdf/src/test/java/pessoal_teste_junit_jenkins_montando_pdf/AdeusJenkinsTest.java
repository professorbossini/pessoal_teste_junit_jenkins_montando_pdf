package pessoal_teste_junit_jenkins_montando_pdf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdeusJenkinsTest {
	private String resultadoEsperado = "Adeus, Jenkins";
	
	@Test
	public void teste () {
		AdeusJenkins instancia = new AdeusJenkins();
		assertEquals(resultadoEsperado, instancia.adeus());
	}
}
