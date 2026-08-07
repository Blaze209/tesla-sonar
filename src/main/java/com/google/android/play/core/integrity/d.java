package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements iu.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iu.z f43140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iu.z f43141b;

    private d(iu.z zVar, iu.z zVar2) {
        this.f43140a = zVar;
        this.f43141b = zVar2;
    }

    public static d c(iu.z zVar, iu.z zVar2) {
        return new d(zVar, zVar2);
    }

    @Override // iu.b0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a() {
        return new c(this.f43140a, this.f43141b);
    }
}
