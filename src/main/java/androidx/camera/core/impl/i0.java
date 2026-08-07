package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface i0 extends c0.n {
    static /* synthetic */ List n(i0 i0Var, List list) {
        String strD = i0Var.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0.n nVar = (c0.n) it.next();
            u5.h.a(nVar instanceof i0);
            if (((i0) nVar).d().equals(strD)) {
                return Collections.singletonList(nVar);
            }
        }
        throw new IllegalStateException("Unable to find camera with id " + strD + " from list of available cameras.");
    }

    @NonNull
    Set<c0.b0> b();

    @Override // c0.n
    @NonNull
    default c0.p c() {
        return new c0.p.a().a(new c0.m() { // from class: androidx.camera.core.impl.h0
            @Override // c0.m
            public final List b(List list) {
                return i0.n(this.f3187b, list);
            }
        }).a(new u1(f())).b();
    }

    @NonNull
    String d();

    void e(@NonNull Executor executor, @NonNull p pVar);

    @NonNull
    default i0 getImplementation() {
        return this;
    }

    void h(@NonNull p pVar);

    @NonNull
    i1 k();

    @NonNull
    List<Size> o(int i11);

    @NonNull
    Object p();

    @NonNull
    r2 r();

    @NonNull
    List<Size> s(int i11);

    boolean t();

    @NonNull
    h3 w();

    Object y(@NonNull String str);

    boolean z();
}
