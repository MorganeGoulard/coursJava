public class TableauTailleFixe {
    public static void main(String[] args) {
        float[] notesPhysique={17.5F,18.2F,19,9,12};//Taille 5
        float [] notesMath=new float[5];//{0.0,0.0,0.0,0.0,0.0}

        //accès au tableau -> index commence toujours par 0 et incrémentation tjr pas 1
        //accès au tableau sans boucle
        System.out.println("Accès au tableau sans boucle");
        System.out.println(notesPhysique[0]);
        System.out.println(notesPhysique[1]);
        System.out.println(notesPhysique[2]);
        System.out.println(notesPhysique[2]);
        System.out.println(notesPhysique[4]);

        System.out.println("\nAccès au tableau avec boucle");
        for(int i=0;i<=(notesPhysique.length-1);i++){
            System.out.println(notesPhysique[i]);
        }

        // calcul moyenne des notes
        float sumNotes=0;
        for(int i=0;i<=(notesPhysique.length-1);i++) {
            // i=0, sumNotes=0;notesPhysique[0] = 17,5
            // sumNotes=sumNotes+notesPhysique[0]=0+17.5

            //i=1,notesPhysique[1] = 18.2
            //sumNotes=17.5 + 18.2 = 35.7

            /// [...]

            //
            sumNotes = sumNotes + notesPhysique[i];
        }

        System.out.printf("somme des notes = %f \n",sumNotes);

        float meanNotes=sumNotes/notesPhysique.length;
        System.out.printf("moyenne des notes = %f",meanNotes);

    }
}
