package hh0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements qj0.e<com.withpersona.sdk2.inquiry.internal.network.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f72809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<s> f72810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<fh0.h> f72811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qj0.i<rh0.c> f72812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qj0.i<hg0.a> f72813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qj0.i<gh0.a> f72814f;

    public c(qj0.i<Context> iVar, qj0.i<s> iVar2, qj0.i<fh0.h> iVar3, qj0.i<rh0.c> iVar4, qj0.i<hg0.a> iVar5, qj0.i<gh0.a> iVar6) {
        this.f72809a = iVar;
        this.f72810b = iVar2;
        this.f72811c = iVar3;
        this.f72812d = iVar4;
        this.f72813e = iVar5;
        this.f72814f = iVar6;
    }

    public static c a(qj0.i<Context> iVar, qj0.i<s> iVar2, qj0.i<fh0.h> iVar3, qj0.i<rh0.c> iVar4, qj0.i<hg0.a> iVar5, qj0.i<gh0.a> iVar6) {
        return new c(iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
    }

    public static com.withpersona.sdk2.inquiry.internal.network.e c(Context context, s sVar, fh0.h hVar, rh0.c cVar, hg0.a aVar, gh0.a aVar2) {
        return new com.withpersona.sdk2.inquiry.internal.network.e(context, sVar, hVar, cVar, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.internal.network.e get() {
        return c(this.f72809a.get(), this.f72810b.get(), this.f72811c.get(), this.f72812d.get(), this.f72813e.get(), this.f72814f.get());
    }
}
