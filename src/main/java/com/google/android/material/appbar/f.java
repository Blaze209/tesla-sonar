package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f41488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41493f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41494g = true;

    public f(View view) {
        this.f41488a = view;
    }

    void a() {
        View view = this.f41488a;
        ViewCompat.a0(view, this.f41491d - (view.getTop() - this.f41489b));
        View view2 = this.f41488a;
        ViewCompat.Z(view2, this.f41492e - (view2.getLeft() - this.f41490c));
    }

    public int b() {
        return this.f41491d;
    }

    void c() {
        this.f41489b = this.f41488a.getTop();
        this.f41490c = this.f41488a.getLeft();
    }

    public boolean d(int i11) {
        if (!this.f41494g || this.f41492e == i11) {
            return false;
        }
        this.f41492e = i11;
        a();
        return true;
    }

    public boolean e(int i11) {
        if (!this.f41493f || this.f41491d == i11) {
            return false;
        }
        this.f41491d = i11;
        a();
        return true;
    }
}
