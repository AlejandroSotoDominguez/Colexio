
package colexio;

public class Estudante extends Persoa {
    private String nomeCole;
    private String nivel;
    
    public Estudante(String nome,String direccion,String nomeCole,String nivel){
        super(nome,direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "nome="+nome+", dirección="+direccion+ ", nomeCole=" + nomeCole + ", nivel=" + nivel;
    }  
    
}
