package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.internal.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f42575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42576k;

    public n(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.I);
    }

    @Override // com.google.android.material.progressindicator.b
    void e() {
        super.e();
        if (this.f42576k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f42573h == 0) {
            if (this.f42485b > 0 && this.f42490g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f42486c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public n(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, LinearProgressIndicator.f42464p);
    }

    public n(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayI = a0.i(context, attributeSet, zs.m.N3, zs.c.I, LinearProgressIndicator.f42464p, new int[0]);
        this.f42573h = typedArrayI.getInt(zs.m.O3, 1);
        this.f42574i = typedArrayI.getInt(zs.m.P3, 0);
        this.f42576k = Math.min(typedArrayI.getDimensionPixelSize(zs.m.Q3, 0), this.f42484a);
        typedArrayI.recycle();
        e();
        this.f42575j = this.f42574i == 1;
    }
}
