package pg0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f102310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<zf0.e0> f102311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<fi0.c> f102312c;

    public f0(qj0.i<Context> iVar, qj0.i<zf0.e0> iVar2, qj0.i<fi0.c> iVar3) {
        this.f102310a = iVar;
        this.f102311b = iVar2;
        this.f102312c = iVar3;
    }

    public static f0 a(qj0.i<Context> iVar, qj0.i<zf0.e0> iVar2, qj0.i<fi0.c> iVar3) {
        return new f0(iVar, iVar2, iVar3);
    }

    public static GovernmentIdAnalyzeWorker c(Context context, zf0.e0 e0Var, fi0.c cVar, IdConfig.e eVar, String str) {
        return new GovernmentIdAnalyzeWorker(context, e0Var, cVar, eVar, str);
    }

    public GovernmentIdAnalyzeWorker b(IdConfig.e eVar, String str) {
        return c(this.f102310a.get(), this.f102311b.get(), this.f102312c.get(), eVar, str);
    }
}
