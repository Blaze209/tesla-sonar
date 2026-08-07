package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes5.dex */
public interface IStreetViewPanoramaViewDelegate extends IInterface {
    @NonNull
    IStreetViewPanoramaDelegate getStreetViewPanorama();

    void getStreetViewPanoramaAsync(zzbr zzbrVar);

    @NonNull
    IObjectWrapper getView();

    void onCreate(@NonNull Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(@NonNull Bundle bundle);

    void onStart();

    void onStop();
}
