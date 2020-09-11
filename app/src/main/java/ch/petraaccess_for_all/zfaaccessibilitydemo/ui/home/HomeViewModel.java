package ch.petraaccess_for_all.zfaaccessibilitydemo.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<> ();
        mText.setValue ("Welcome to Accessibility-Demo \n Foundation 'Access for all' " );
    }

    public LiveData<String> getText() {
        return mText;
    }
}