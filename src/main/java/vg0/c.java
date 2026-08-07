package vg0;

import pg0.IdConfig;
import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements GovernmentIdHintWorker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f119326a;

    c(b bVar) {
        this.f119326a = bVar;
    }

    public static i<GovernmentIdHintWorker.b> b(b bVar) {
        return qj0.f.a(new c(bVar));
    }

    @Override // vg0.GovernmentIdHintWorker.b
    public GovernmentIdHintWorker a(IdConfig.e eVar) {
        return this.f119326a.b(eVar);
    }
}
