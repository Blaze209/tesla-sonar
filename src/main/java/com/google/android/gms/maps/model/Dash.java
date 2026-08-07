package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class Dash extends PatternItem {
    public final float length;

    public Dash(float f11) {
        super(0, Float.valueOf(Math.max(f11, BitmapDescriptorFactory.HUE_RED)));
        this.length = Math.max(f11, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    @NonNull
    public String toString() {
        float f11 = this.length;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("[Dash: length=");
        sb2.append(f11);
        sb2.append("]");
        return sb2.toString();
    }
}
