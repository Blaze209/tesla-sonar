package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements iu.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iu.z f43150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iu.z f43151b;

    private h(iu.z zVar, iu.z zVar2) {
        this.f43150a = zVar;
        this.f43151b = zVar2;
    }

    public static h b(iu.z zVar, iu.z zVar2) {
        return new h(zVar, zVar2);
    }

    @Override // iu.b0
    public final /* bridge */ /* synthetic */ Object a() {
        iu.z zVar = this.f43151b;
        return new g((q) this.f43150a.a(), (w) zVar.a());
    }
}
