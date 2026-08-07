package u0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.p1;
import c0.r0;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f115236a;

    public l(@NonNull p pVar) {
        this.f115236a = pVar;
    }

    @NonNull
    public p1 a() {
        r0.b bVar = new r0.b();
        b(bVar, this.f115236a);
        return bVar.d();
    }

    void b(@NonNull r0.b bVar, @NonNull p pVar) {
        bVar.n(pVar.b());
        bVar.k(true);
    }
}
