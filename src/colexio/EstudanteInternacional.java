
package colexio;

public class EstudanteInternacional extends Estudante {
    private String pais;
    
    public EstudanteInternacional(String nome,String direccion,String cole,String nivel,String pais){
        super(nome,direccion,cole,nivel);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString()+", pais=" + pais;
    }
    
    
}
