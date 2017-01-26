package org.qtum.mromanovsky.qtum.ui.fragment.SendBaseFragment;



import android.support.v4.app.Fragment;

import org.qtum.mromanovsky.qtum.ui.fragment.BaseFragment.BaseFragmentView;


public interface SendBaseFragmentView extends BaseFragmentView{
    void openInnerFragmentForResult(Fragment fragment);
    void openInnerFragment(Fragment fragment);
    void qrCodeRecognitionToolBar();
    void sendToolBar();
}
