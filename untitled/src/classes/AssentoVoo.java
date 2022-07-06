package classes;

public class AssentoVoo extends Assento{
    private String codigo;
    private ClasseAssentoVoo classe;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ClasseAssentoVoo getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}