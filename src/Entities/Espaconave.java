public class Espaconave {

    private String nome;
    private EspacoPorto portoAtual = new EspacoPorto(1, "Terra", 0, 0, 0);

    public Espaconave(String nome, EspacoPorto espacoPortoAtual) {

        this.nome = nome;
        this.portoAtual = espacoPortoAtual;

    }

    public String getNome() {
        return nome;
    }

    public EspacoPorto getPortoAtual() {
        return portoAtual;
    }
}
