package com.google.android.gms.maps.internal;

import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes5.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {
    @NonNull
    IObjectWrapper newCameraPosition(@NonNull CameraPosition cameraPosition);

    @NonNull
    IObjectWrapper newLatLng(@NonNull LatLng latLng);

    @NonNull
    IObjectWrapper newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i11);

    @NonNull
    IObjectWrapper newLatLngBoundsWithSize(@NonNull LatLngBounds latLngBounds, int i11, int i12, int i13);

    @NonNull
    IObjectWrapper newLatLngZoom(@NonNull LatLng latLng, float f11);

    @NonNull
    IObjectWrapper scrollBy(float f11, float f12);

    @NonNull
    IObjectWrapper zoomBy(float f11);

    @NonNull
    IObjectWrapper zoomByWithFocus(float f11, int i11, int i12);

    @NonNull
    IObjectWrapper zoomIn();

    @NonNull
    IObjectWrapper zoomOut();

    @NonNull
    IObjectWrapper zoomTo(float f11);
}
