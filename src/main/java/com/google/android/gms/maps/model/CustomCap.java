package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomCap extends Cap {

    @NonNull
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(@NonNull BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    @Override // com.google.android.gms.maps.model.Cap
    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.bitmapDescriptor);
        float f11 = this.refWidth;
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 55);
        sb2.append("[CustomCap: bitmapDescriptor=");
        sb2.append(strValueOf);
        sb2.append(" refWidth=");
        sb2.append(f11);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomCap(@NonNull BitmapDescriptor bitmapDescriptor, float f11) {
        BitmapDescriptor bitmapDescriptor2 = (BitmapDescriptor) Preconditions.checkNotNull(bitmapDescriptor, "bitmapDescriptor must not be null");
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        super(bitmapDescriptor2, f11);
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f11;
    }
}
