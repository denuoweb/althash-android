package org.qtum.mromanovsky.qtum.utils;


import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private static Transactions sTransactions;

    private List<Transaction> mTransactionList;

    private Transactions(){
        mTransactionList = new ArrayList<>();
    }

    public static Transactions getInstance(){
        if(sTransactions == null){
            sTransactions = new Transactions();
        }
        return sTransactions;
    }

    public List<Transaction> getTransactionList() {
        return mTransactionList;
    }
}
