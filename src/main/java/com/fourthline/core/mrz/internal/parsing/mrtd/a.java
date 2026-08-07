package com.fourthline.core.mrz.internal.parsing.mrtd;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bo0.j f24233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f24234i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String mrz) {
        super(mrz, true, null, 4, null);
        p013kotlin.jvm.internal.s.k(mrz, "mrz");
        this.f24233h = bo0.n.w(36, 48);
        this.f24234i = p013kotlin.collections.v.m();
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected List d() {
        return this.f24234i;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.mrtd.c
    protected bo0.j f() {
        return this.f24233h;
    }
}
