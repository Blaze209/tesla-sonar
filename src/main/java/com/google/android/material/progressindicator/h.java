package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.b;

/* JADX INFO: loaded from: classes5.dex */
abstract class h<S extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S f42537a;

    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f42538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f42539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f42540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42541d;

        protected a() {
        }
    }

    public h(S s11) {
        this.f42537a = s11;
    }

    abstract void a(@NonNull Canvas canvas, @NonNull Rect rect, float f11, boolean z11, boolean z12);

    abstract void b(@NonNull Canvas canvas, @NonNull Paint paint, int i11, int i12);

    abstract void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull a aVar, int i11);

    abstract void d(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, int i11, int i12, int i13);

    abstract int e();

    abstract int f();

    void g(@NonNull Canvas canvas, @NonNull Rect rect, float f11, boolean z11, boolean z12) {
        this.f42537a.e();
        a(canvas, rect, f11, z11, z12);
    }
}
