
package agenda_telefonica;

/**
 *
 * @author Francy10
 */
public class Agenda_telefonica {

    
    public static void main(String[] args) {
       Rubrica r=new Rubrica();
      
       int c = 0;
       switch(c){
           case 1:
               System.out.printf("Iserisci 1 per vadere i contatti\n");
            r.stampa();   
            break;
           case 2:
               System.out.printf("Inserisci 2 per inserire contatto\n");
               r.inserisci();
               break;
           case 3:
               System.out.printf("Iserisci 3 per rimuovere contatto");
               r.rimuovi();
               break;
           case 4:
               System.out.printf("Iserisci 4 per cercare il contatto");
               
       }
       
    }
    
}
