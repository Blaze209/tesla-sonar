package com.withpersona.sdk2.inquiry.internal;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements a.InterfaceC1175a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bh0.c f57541a;

    b(bh0.c cVar) {
        this.f57541a = cVar;
    }

    public static qj0.i<a.InterfaceC1175a> b(bh0.c cVar) {
        return qj0.f.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.a.InterfaceC1175a
    public a a(String str) {
        return this.f57541a.b(str);
    }
}
