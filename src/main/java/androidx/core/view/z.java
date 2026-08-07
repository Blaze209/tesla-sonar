package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7866b;

    public z(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f7865a | this.f7866b;
    }

    public void b(View view, View view2, int i11) {
        c(view, view2, i11, 0);
    }

    public void c(View view, View view2, int i11, int i12) {
        if (i12 == 1) {
            this.f7866b = i11;
        } else {
            this.f7865a = i11;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i11) {
        if (i11 == 1) {
            this.f7866b = 0;
        } else {
            this.f7865a = 0;
        }
    }
}
