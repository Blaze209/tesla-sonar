package com.fourthline.nfc.internal;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f24522a;

    public E0(InputStream inputStream) {
        p013kotlin.jvm.internal.s.k(inputStream, "inputStream");
        Collection<br0.p> collectionH = new cr0.c(inputStream).h();
        p013kotlin.jvm.internal.s.j(collectionH, "getSecurityInfos(...)");
        this.f24522a = p013kotlin.collections.v.m1(collectionH);
    }

    @Override // com.fourthline.nfc.internal.D0
    public List a() {
        return this.f24522a;
    }
}
