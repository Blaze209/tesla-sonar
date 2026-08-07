package com.fourthline.core.mrz.internal.parsing.mrtd;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bo0.j f24272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f24273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String mrz, boolean z11) {
        super(mrz, z11, null, 4, null);
        p013kotlin.jvm.internal.s.k(mrz, "mrz");
        this.f24272h = bo0.n.w(5, 14);
        this.f24273i = p013kotlin.collections.v.p(bo0.n.w(15, 15), bo0.n.w(15, 17), bo0.n.w(15, 21));
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected List d() {
        return this.f24273i;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected bo0.j f() {
        return this.f24272h;
    }
}
