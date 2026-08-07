package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3741qq implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3208eD f34882b;

    public C3741qq(boolean z11, C3208eD skipPersonDetailsUseCase) {
        p013kotlin.jvm.internal.s.k(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        this.f34881a = z11;
        this.f34882b = skipPersonDetailsUseCase;
    }

    private final boolean b() {
        return !this.f34882b.a(false);
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        if (b()) {
            return p013kotlin.collections.v.e(Pp.b.f27377a);
        }
        return p013kotlin.collections.v.r(c() ? Pp.c.f27378a : null, new Pp.a(null, 1, null));
    }

    public boolean c() {
        return this.f34881a;
    }
}
