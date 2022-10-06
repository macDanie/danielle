import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i;
        ListesPays question = new ListesPays();
        System.out.println("/**********Bienvenue dans votre game de decouverte**********/\n");
        System.out.println("veuillez choisir votre niveau de difficultes\n");
        System.out.println("1-pour facile\n 2-pour moyen\n 3-pour difficile\n 4-pour expert");
        Scanner clavier= new Scanner(System.in);
        int choix = clavier.nextInt();
        if(choix==1){
            int j=0;
            for(i=0;i<4;i++){
                System.out.println("quelle est la capitale du/de " +question.liste[i].nom);
                Scanner saisie= new Scanner(System.in);
                String reponse= saisie.nextLine();
                if (reponse.equalsIgnoreCase(question.liste[i].nomCapitale)) {
                    System.out.println("Reponse correct");
                    j=j+1;
                }else{
                    System.out.println("Reponse incorrect");
                }
            }
            System.out.println("c'est terminer votre score est de"+j+"/4");
        } else if (choix==2) {
            int j=0;
            for (i=0;i<8;i++){
                System.out.println("quelle est la capitale du/de " +question.liste[i].nom);
                Scanner saisie= new Scanner(System.in);
                String reponse= saisie.nextLine();
                if (reponse.equalsIgnoreCase(question.liste[i].nomCapitale)) {
                    System.out.println("Reponse correct");
                    j=j+1;
                }else{
                    System.out.println("Reponse incorrect");
                }
            }
            System.out.println("c'est terminer votre score est de"+j+"/8");
        } else if (choix==3) {
            int j=0;
            for (i = 0; i < 13; i++) {
                System.out.println("quelle est la capitale du/de " + question.liste[i].nom);
                Scanner saisie = new Scanner(System.in);
                String reponse = saisie.nextLine();
                if (reponse.equalsIgnoreCase(question.liste[i].nomCapitale)) {
                    System.out.println("Reponse correct");
                    j=j+1;
                } else {
                    System.out.println("Reponse incorrect");
                }
            }
            System.out.println("c'est terminer votre score est de"+j+"/14");
        } else if (choix==4) {
            int j=0;
            for (i=0;i<16;i++){
                System.out.println("quelle est la capitale du/de " +question.liste[i].nom);
                Scanner saisie= new Scanner(System.in);
                String reponse= saisie.nextLine();
                if (reponse.equalsIgnoreCase(question.liste[i].nomCapitale)) {
                    System.out.println("Reponse correct");
                    j=j+1;
                }else{
                    System.out.println("Reponse incorrect");
                }
            }
            System.out.println("c'est terminer votre score est de"+j+"/17");
        }
    }
}