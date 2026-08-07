package u0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.l2;
import c0.h1;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f115237a;

    public m(@NonNull p pVar) {
        this.f115237a = pVar;
    }

    @NonNull
    public l2 a() {
        h1.a aVar = new h1.a();
        b(aVar, this.f115237a);
        return aVar.d();
    }

    void b(@NonNull h1.a aVar, @NonNull p pVar) {
        aVar.m(pVar.i());
        aVar.j(true);
    }
}
