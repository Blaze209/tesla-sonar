package com.google.android.gms.maps.internal;

import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes5.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {
    void animateTo(@NonNull StreetViewPanoramaCamera streetViewPanoramaCamera, long j11);

    void enablePanning(boolean z11);

    void enableStreetNames(boolean z11);

    void enableUserNavigation(boolean z11);

    void enableZoom(boolean z11);

    @NonNull
    StreetViewPanoramaCamera getPanoramaCamera();

    @NonNull
    StreetViewPanoramaLocation getStreetViewPanoramaLocation();

    boolean isPanningGesturesEnabled();

    boolean isStreetNamesEnabled();

    boolean isUserNavigationEnabled();

    boolean isZoomGesturesEnabled();

    IObjectWrapper orientationToPoint(@NonNull StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    @NonNull
    StreetViewPanoramaOrientation pointToOrientation(@NonNull IObjectWrapper iObjectWrapper);

    void setOnStreetViewPanoramaCameraChangeListener(zzbj zzbjVar);

    void setOnStreetViewPanoramaChangeListener(zzbl zzblVar);

    void setOnStreetViewPanoramaClickListener(zzbn zzbnVar);

    void setOnStreetViewPanoramaLongClickListener(zzbp zzbpVar);

    void setPosition(@NonNull LatLng latLng);

    void setPositionWithID(@NonNull String str);

    void setPositionWithRadius(@NonNull LatLng latLng, int i11);

    void setPositionWithRadiusAndSource(@NonNull LatLng latLng, int i11, StreetViewSource streetViewSource);

    void setPositionWithSource(@NonNull LatLng latLng, StreetViewSource streetViewSource);
}
