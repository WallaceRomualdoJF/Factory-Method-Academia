public class ServicoMatriculaFactory {
    public static ServicoMatricula criarServicoMatricula(String area) {
        if (area.equalsIgnoreCase("Musculação")) {
            return new ServicoMatriculaMusculacao();
        } else if (area.equalsIgnoreCase("Artes Marciais")) {
            return new ServicoMatriculaArtesMarciais();
        } else if (area.equalsIgnoreCase("Boxe")) {
            return new ServicoMatriculaBoxe();
        } else {
            throw new IllegalArgumentException("Área de matrícula inválida: " + area);
        }
    }
}

class ServicoMatriculaMusculacao implements ServicoMatricula {
    @Override
    public void matricularAluno(String nome, String area) {
        // Implementação da matrícula na área de Musculação
    }

    @Override
    public void apagarMatricula(String nome, String area) {
        // Implementação da exclusão da matrícula na área de Musculação
    }
}

class ServicoMatriculaArtesMarciais implements ServicoMatricula {
    @Override
    public void matricularAluno(String nome, String area) {
        // Implementação da matrícula na área de Artes Marciais
    }

    @Override
    public void apagarMatricula(String nome, String area) {
        // Implementação da exclusão da matrícula na área de Artes Marciais
    }
}

class ServicoMatriculaBoxe implements ServicoMatricula {
    @Override
    public void matricularAluno(String nome, String area) {
        // Implementação da matrícula na área de Boxe
    }

    @Override
    public void apagarMatricula(String nome, String area) {
        // Implementação da exclusão da matrícula na área de Boxe
    }
}
