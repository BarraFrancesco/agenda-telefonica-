
package agenda_telefonica;

/**
 *
 * @author Francy10
 */
public class contatti {
    int val;
    public int num;
    String nome,cognome;
    String email;
    public contatti next;

    public contatti(int num,String nome,String cognome,String email,int val) {
        this.num = num;
        this.nome=nome;
        this.cognome=cognome;
        this.val=val;
        this.email=email;
        this.next = null;
    
};  
   String getNome(){
        return nome;
    }
   
   String getCognome(){
          return cognome;
      }
   int getNum(){
       return num;
   }
   String getEmail(){
       return email; 
   }
   int getVal(){
       return val;
   }

    contatti() {
            }

    
}
