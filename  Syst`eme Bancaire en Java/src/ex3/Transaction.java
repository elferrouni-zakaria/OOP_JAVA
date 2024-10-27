package ex3;

import java.util.Date;

public class Transaction {
    /***********************************question7******************************/
    private String type;   // "crédit" ou "débit"
    private double montant;
    private Date date;

    public Transaction(String type, double montant) {
        this.type = type;
        this.montant = montant;
        this.date = new Date();  // Date actuelle
    }

    public String getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        String tostring="Transaction{" + "type='" + type + '\'' + ", montant=" + montant + ", date=" + date + '}';
        return tostring;
    }
}
