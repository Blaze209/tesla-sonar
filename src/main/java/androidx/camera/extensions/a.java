package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.n1;
import c0.m;
import c0.n;
import java.util.ArrayList;
import java.util.List;
import u0.j;
import u0.p;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1 f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f3457c;

    a(@NonNull String str, @NonNull p pVar) {
        this.f3456b = n1.a(str);
        this.f3457c = pVar;
    }

    @Override // c0.m
    @NonNull
    public n1 a() {
        return this.f3456b;
    }

    @Override // c0.m
    @NonNull
    public List<n> b(@NonNull List<n> list) {
        ArrayList arrayList = new ArrayList();
        for (n nVar : list) {
            h.b(nVar instanceof i0, "The camera info doesn't contain internal implementation.");
            i0 i0Var = (i0) nVar;
            if (this.f3457c.e(i0Var.d(), j.a(i0Var))) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }
}
