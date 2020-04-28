
package agenda_telefonica;

/**
 *
 * @author Francy10
 */
public class Rubrica extends contatti{
    private contatti head;
    private int counter;
  Rubrica(){
      
  }
    
    public Rubrica(String nome,String cognome,int val,String email,int num){
        this.counter=0;
        this.head=null;
    }
    public void stampa()
    {
       contatti current = this.head;

        System.out.printf("[%d] ", this.counter);

        while (current != null) {
            System.out.printf("%d ---> ", current.val);
            current = current.next;
        }
        System.out.printf("NULL\n");
    }

   public void inserisci(int val)
    {
        contatti current = this.head;
        contatti prev = null;

        contatti temp = new contatti();


        while (current != null&& current.val < val) {
            prev = current;
            current = current.next;
        }

        if (prev == null) {
            
            temp.next = this.head;
            this.head = temp;
        } else {
            
            prev.next = temp;
            temp.next = current;
        }

        this.counter++;
    }

    

 public void rimuovi(int val)
    {
        contatti current = this.head;
        contatti prev = null;
        contatti temp = null;

       
        while (current != null && current.val < val) {
            prev = current;
            current = current.next;
        }

        
        if (current == null) {
            System.out.printf("rimuovi(): elemento %d non trovato, non faccio nulla\n", val);
            return;
        }

        System.out.printf("rimuovi(): elemento %d trovato, vediamo cosa fare\n", val);
        this.counter--;

        
        if (prev == null) {
            System.out.printf("L'elemento da eliminare e' in testa, elimina\n");
          
            this.head = this.head.next;  
        }

       
       
    
    }

    void inserisci() {
       
    }

    void rimuovi() {
    }
    
}
