package ch.petraaccess_for_all.zfaaccessibilitydemo.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<> ();
        mText.setValue ("This is gallery fragment " + "Petra" + "\n "
            +    "Zweite Zeile");

    }



    public LiveData<String> getText() {
        return mText;
    }
}