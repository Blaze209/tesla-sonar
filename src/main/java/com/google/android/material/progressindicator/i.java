package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class i<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected j f42542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List<h.a> f42543b = new ArrayList();

    protected i(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.f42543b.add(new h.a());
        }
    }

    abstract void a();

    protected float b(int i11, int i12, int i13) {
        return (i11 - i12) / i13;
    }

    public abstract void c();

    public abstract void d(@NonNull androidx.vectordrawable.graphics.drawable.b bVar);

    protected void e(@NonNull j jVar) {
        this.f42542a = jVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
