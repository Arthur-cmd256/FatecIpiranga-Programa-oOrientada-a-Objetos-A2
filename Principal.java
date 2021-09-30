public class Principal {
    public static void main(String[] args) {
        Vacina v = new Vacina("Vacina covid-19", 53, "Pfizer");
        ProfissionalDeSaude profissional = new ProfissionalDeSaude("Maria", 27, 11223344);
        Paciente paciente = new Paciente("Joao", 43);
        ProfissionalDeSaude.aplicar(v, paciente);
    }
}
