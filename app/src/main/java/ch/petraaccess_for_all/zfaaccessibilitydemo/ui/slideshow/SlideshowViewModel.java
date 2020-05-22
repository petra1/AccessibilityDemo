package ch.petraaccess_for_all.zfaaccessibilitydemo.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<> ();
        mText.setValue ("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}