package gu;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public enum i implements f {
    INSTANCE;

    private static final AtomicReference zzb = new AtomicReference(null);

    @Override // gu.f
    public final g zza() {
        return (g) zzb.get();
    }

    public final void zzb(g gVar) {
        zzb.set(gVar);
    }
}
