package vg0;

import android.content.Context;
import pg0.IdConfig;
import qj0.i;
import zf0.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<Context> f119324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<e0> f119325b;

    public b(i<Context> iVar, i<e0> iVar2) {
        this.f119324a = iVar;
        this.f119325b = iVar2;
    }

    public static b a(i<Context> iVar, i<e0> iVar2) {
        return new b(iVar, iVar2);
    }

    public static GovernmentIdHintWorker c(Context context, e0 e0Var, IdConfig.e eVar) {
        return new GovernmentIdHintWorker(context, e0Var, eVar);
    }

    public GovernmentIdHintWorker b(IdConfig.e eVar) {
        return c(this.f119324a.get(), this.f119325b.get(), eVar);
    }
}
