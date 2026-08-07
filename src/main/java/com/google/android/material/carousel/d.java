package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f41792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f41793b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = iArr[i11] * 2;
        }
        return iArr2;
    }

    static float b(float f11, float f12, float f13) {
        return 1.0f - ((f11 - f13) / (f12 - f13));
    }

    public float c() {
        return this.f41793b;
    }

    public float d() {
        return this.f41792a;
    }

    void e(Context context) {
        float fH = this.f41792a;
        if (fH <= BitmapDescriptorFactory.HUE_RED) {
            fH = e.h(context);
        }
        this.f41792a = fH;
        float fG = this.f41793b;
        if (fG <= BitmapDescriptorFactory.HUE_RED) {
            fG = e.g(context);
        }
        this.f41793b = fG;
    }

    boolean f() {
        return true;
    }

    abstract f g(@NonNull b bVar, @NonNull View view);

    abstract boolean h(b bVar, int i11);
}
