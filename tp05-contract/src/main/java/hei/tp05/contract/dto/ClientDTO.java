package hei.tp05.contract.dto;

public class ClientDTO {

    private String nom;

    private String prenom;


    public ClientDTO() {
    }


    public ClientDTO(final String nom, final String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(final String nomValue) {
        nom = nomValue;
    }


    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(final String prenomValue) {
        prenom = prenomValue;
    }


    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("ClientDTO{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
