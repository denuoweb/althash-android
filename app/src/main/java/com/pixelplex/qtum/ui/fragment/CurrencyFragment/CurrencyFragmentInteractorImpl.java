package com.pixelplex.qtum.ui.fragment.CurrencyFragment;


import android.content.Context;

import com.pixelplex.qtum.dataprovider.RestAPI.gsonmodels.Contract.Contract;
import com.pixelplex.qtum.dataprovider.RestAPI.gsonmodels.Contract.Token;
import com.pixelplex.qtum.datastorage.TinyDB;

import java.util.List;

class CurrencyFragmentInteractorImpl implements CurrencyFragmentInteractor{

    Context mContext;

    public CurrencyFragmentInteractorImpl(Context context){
        mContext = context;
    }

    @Override
    public List<Token> getTokenList() {
        List<Token> tokenList = (new TinyDB(mContext)).getTokenList();
        return tokenList;
    }

}
