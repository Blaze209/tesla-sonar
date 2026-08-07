package com.google.android.play.core.integrity;

import android.content.Context;
import iu.l0;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements iu.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iu.z f43180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iu.z f43181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iu.z f43182c;

    private s(iu.z zVar, iu.z zVar2, iu.z zVar3, iu.z zVar4) {
        this.f43180a = zVar;
        this.f43181b = zVar2;
        this.f43182c = zVar3;
    }

    public static s b(iu.z zVar, iu.z zVar2, iu.z zVar3, iu.z zVar4) {
        return new s(zVar, zVar2, zVar3, zVar4);
    }

    @Override // iu.b0
    public final /* bridge */ /* synthetic */ Object a() {
        return new q((Context) this.f43180a.a(), (l0) this.f43181b.a(), ((d) this.f43182c).a(), new c0());
    }
}
