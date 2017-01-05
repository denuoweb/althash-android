package org.qtum.mromanovsky.qtum.ui.fragment.SendFragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.qtum.mromanovsky.qtum.R;
import org.qtum.mromanovsky.qtum.ui.fragment.BaseFragment.BaseFragment;
import org.qtum.mromanovsky.qtum.ui.fragment.BaseFragment.BaseFragmentPresenterImpl;

public class SendFragment extends BaseFragment implements SendFragmentView{

    public static final int  LAYOUT = R.layout.fragment_send;
    public static final String TAG = "SendFragment";

    SendFragmentPresenterImpl mSendFragmentPresenter;

    public static SendFragment newInstance(){
        SendFragment sendFragment = new SendFragment();
        return sendFragment;
    }

    @Override
    protected void createPresenter() {
        mSendFragmentPresenter = new SendFragmentPresenterImpl(this);
    }

    @Override
    protected BaseFragmentPresenterImpl getPresenter() {
        return mSendFragmentPresenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(LAYOUT, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final AppCompatActivity activity = (AppCompatActivity) getActivity();
        final Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (null != toolbar) {
            activity.setSupportActionBar(toolbar);
            ActionBar actionBar = activity.getSupportActionBar();
            actionBar.setTitle(R.string.send);
            //actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
