package com.fourthline.core.mrz.internal.parsing.mrtd;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bo0.j f24276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f24277i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String mrz, boolean z11) {
        super(mrz, z11, null, 4, null);
        p013kotlin.jvm.internal.s.k(mrz, "mrz");
        this.f24276h = bo0.n.w(36, 45);
        this.f24277i = p013kotlin.collections.v.p(bo0.n.w(64, 64), bo0.n.w(64, 66));
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected List d() {
        return this.f24277i;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected bo0.j f() {
        return this.f24276h;
    }
}
