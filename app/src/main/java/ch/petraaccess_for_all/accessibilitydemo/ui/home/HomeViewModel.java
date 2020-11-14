package ch.petraaccess_for_all.accessibilitydemo.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<> ();
        mText.setValue ("Welcome to Accessibility-Demo ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}