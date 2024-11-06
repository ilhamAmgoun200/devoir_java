package org.example;

public class Transaction {
    public enum Type {
        VIRINT, VIREST, VIRMULTA, VIRCHAC
    }

    private Type type;
    private double montant;
    private String reference;

    // Méthode pour calculer automatiquement le type de transaction
    public static Type calculerType(String banqueClient1, String banqueClient2, String paysClient1, String paysClient2) {
        if (banqueClient1.equals(banqueClient2)) {
            return paysClient1.equals(paysClient2) ? Type.VIRMULTA : Type.VIRINT;
        } else {
            return paysClient1.equals(paysClient2) ? Type.VIREST : Type.VIRCHAC;
        }
    }

    // Constructeur, getters et setters
}
