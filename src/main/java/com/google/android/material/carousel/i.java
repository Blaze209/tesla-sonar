package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f41822d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f41823e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41824c = 0;

    @Override // com.google.android.material.carousel.d
    @NonNull
    f g(@NonNull b bVar, @NonNull View view) {
        float fB = bVar.b();
        if (bVar.g()) {
            fB = bVar.d();
        }
        float f11 = fB;
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f12 = ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.g()) {
            f12 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f13 = f12;
        float fD = d() + f13;
        float fMax = Math.max(c() + f13, fD);
        float fMin = Math.min(measuredHeight + f13, f11);
        float fA = o5.a.a((measuredHeight / 3.0f) + f13, fD + f13, fMax + f13);
        float f14 = (fMin + fA) / 2.0f;
        int[] iArrA = f41822d;
        if (f11 < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f41823e;
        if (bVar.f() == 1) {
            iArrA = d.a(iArrA);
            iArrA2 = d.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        int iMax = (int) Math.max(1.0d, Math.floor(((f11 - (e.i(iArr) * f14)) - (e.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i11 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr3[i12] = iCeil - i12;
        }
        a aVarC = a.c(f11, fA, fD, fMax, iArr2, f14, iArr, fMin, iArr3);
        this.f41824c = aVarC.e();
        if (i(aVarC, bVar.a())) {
            aVarC = a.c(f11, fA, fD, fMax, new int[]{aVarC.f41783c}, f14, new int[]{aVarC.f41784d}, fMin, new int[]{aVarC.f41787g});
        }
        return e.d(view.getContext(), f13, f11, aVarC, bVar.f());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(b bVar, int i11) {
        if (i11 >= this.f41824c || bVar.a() < this.f41824c) {
            return i11 >= this.f41824c && bVar.a() < this.f41824c;
        }
        return true;
    }

    boolean i(a aVar, int i11) {
        int iE = aVar.e() - i11;
        boolean z11 = iE > 0 && (aVar.f41783c > 0 || aVar.f41784d > 1);
        while (iE > 0) {
            int i12 = aVar.f41783c;
            if (i12 > 0) {
                aVar.f41783c = i12 - 1;
            } else {
                int i13 = aVar.f41784d;
                if (i13 > 1) {
                    aVar.f41784d = i13 - 1;
                }
            }
            iE--;
        }
        return z11;
    }
}
