
package colexio;

public class Persoa {
    protected String nome;
    protected String direccion;
    
    public Persoa(String nome,String direccion){
        this.nome = nome;
        this.direccion = direccion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", direccion=" + direccion;
    }

}
