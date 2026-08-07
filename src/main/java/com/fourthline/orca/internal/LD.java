package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class LD implements KD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f26752a;

    public LD(wn0.a resources) {
        p013kotlin.jvm.internal.s.k(resources, "resources");
        this.f26752a = resources;
    }

    @Override // com.fourthline.orca.internal.KD
    public String a(QA resource) {
        p013kotlin.jvm.internal.s.k(resource, "resource");
        return RA.a(resource, this.f26752a);
    }
}
