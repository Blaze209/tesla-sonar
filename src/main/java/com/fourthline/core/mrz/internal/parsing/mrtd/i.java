package com.fourthline.core.mrz.internal.parsing.mrtd;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bo0.j f24280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f24281i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String mrz, boolean z11) {
        super(mrz, z11, null, 4, null);
        p013kotlin.jvm.internal.s.k(mrz, "mrz");
        this.f24280h = bo0.n.w(44, 53);
        this.f24281i = p013kotlin.collections.v.m();
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected List d() {
        return this.f24281i;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected bo0.j f() {
        return this.f24280h;
    }
}
