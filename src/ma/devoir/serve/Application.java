package ma.devoir.serve;

import ma.devoir.entiter.Produit;
import ma.devoir.entiter.MetierProduit;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        int x = 0;
        long id = 0l;
        String nom = "";
        String marque = "";
        double prix = 0f;
        String description = "";
        int qte = 0;

        MetierProduit a = new MetierProduit();
        Produit p1 = new Produit(1l, "produit1", "marque1", 1000.00f, "disc1", 142);
        a.add(p1);

        do {
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Save un produit par id.");
            System.out.println("6. Quitter ce programme.");

            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();

            switch (x){
                case 1:
                    System.out.println(a.getAll());
                    break;
                case 2:
                    System.out.println("entre l\'id :");
                    Scanner scId = new Scanner(System.in);
                    System.out.println(a.findById(scId.nextLong()).toString());
                    break;
                case 3:
                    Produit produit = new Produit();

                    System.out.println("entre l\'id :");
                    id = sc.nextLong();
                    produit.setId(id);
                    if(a.findById(id) != null){
                        System.out.println("this id is already exists!!");
                        break;
                    }
                    System.out.println("entre le nom de produit :");
                    nom = sc.next();
                    produit.setNom(nom);

                    System.out.println("entre la marque :");
                    marque = sc.next();
                    produit.setMarque(marque);

                    System.out.println("entre le prix :");
                    prix = sc.nextFloat();
                    produit.setPrix(prix);

                    System.out.println("entre la description :");
                    description = sc.next();
                    produit.setDescription(description);

                    System.out.println("entre la qte en stock :");
                    qte = sc.nextInt();
                    produit.setnStock(qte);
                    a.add(produit);

                    for (Produit p : a.getAll()) {
                        System.out.println(p);
                    }
                    System.out.println("le produit a ete insere avec succes");
                    break;
                case 4:
                    System.out.println("entre l\'id :");
                    id = sc.nextLong();
                    a.delete(id);
                    break;
                case 5:

                    a.saveAll();
                    System.out.println("Les produits ont été sauvegardés dans produits.dat");
                    break;
                case 6:
                    System.out.println("bye!");
                    break;
                default:
                    System.out.println("chose another number");
                    break;
            }
        }while (x != 6);
    }
}

