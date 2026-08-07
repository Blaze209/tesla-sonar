package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;

/* JADX INFO: loaded from: classes.dex */
final class j extends i {

    class a implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f3412a;

        a(n nVar) {
            this.f3412a = nVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            this.f3412a.close();
        }
    }

    j() {
    }

    @Override // androidx.camera.core.i
    n d(@NonNull s1 s1Var) {
        return s1Var.c();
    }

    @Override // androidx.camera.core.i
    void g() {
    }

    @Override // androidx.camera.core.i
    void m(@NonNull n nVar) {
        j0.n.j(e(nVar), new a(nVar), i0.c.b());
    }
}
