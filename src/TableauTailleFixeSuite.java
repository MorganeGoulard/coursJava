import java.util.Scanner;

public class TableauTailleFixeSuite {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        System.out.print("Combien de notes voulez vous insérer ? ");
        var notesInsert=input.nextInt();

        float [] notesMaths=new float[notesInsert];

        for(int i=0;i<=notesMaths.length-1;i++){
            System.out.printf("Notes [%d] : ",i);
            notesMaths[i]=input.nextFloat();
        }
        float sumNotes=0;
        for(int i=0;i<=notesMaths.length-1;i++){
            sumNotes=sumNotes+notesMaths[i];
        }

        float mean=sumNotes/notesMaths.length;
        System.out.printf("Somme : %f\nMoyenne : %f",sumNotes,mean);


    }
}
