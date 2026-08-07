package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class d extends f.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f14370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f.k f14371b;

    d(LinearLayoutManager linearLayoutManager) {
        this.f14370a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.f.i
    public void a(int i11) {
    }

    @Override // androidx.viewpager2.widget.f.i
    public void b(int i11, float f11, int i12) {
        if (this.f14371b == null) {
            return;
        }
        float f12 = -f11;
        for (int i13 = 0; i13 < this.f14370a.P(); i13++) {
            View viewO = this.f14370a.O(i13);
            if (viewO == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i13), Integer.valueOf(this.f14370a.P())));
            }
            this.f14371b.a(viewO, (this.f14370a.m0(viewO) - i11) + f12);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void c(int i11) {
    }

    f.k d() {
        return this.f14371b;
    }

    void e(f.k kVar) {
        this.f14371b = kVar;
    }
}
