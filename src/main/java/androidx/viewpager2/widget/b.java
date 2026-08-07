package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b extends f.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final List<f.i> f14366a;

    b(int i11) {
        this.f14366a = new ArrayList(i11);
    }

    private void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.f.i
    public void a(int i11) {
        try {
            Iterator<f.i> it = this.f14366a.iterator();
            while (it.hasNext()) {
                it.next().a(i11);
            }
        } catch (ConcurrentModificationException e11) {
            e(e11);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void b(int i11, float f11, int i12) {
        try {
            Iterator<f.i> it = this.f14366a.iterator();
            while (it.hasNext()) {
                it.next().b(i11, f11, i12);
            }
        } catch (ConcurrentModificationException e11) {
            e(e11);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void c(int i11) {
        try {
            Iterator<f.i> it = this.f14366a.iterator();
            while (it.hasNext()) {
                it.next().c(i11);
            }
        } catch (ConcurrentModificationException e11) {
            e(e11);
        }
    }

    void d(f.i iVar) {
        this.f14366a.add(iVar);
    }
}
