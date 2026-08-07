package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3990wh implements InterfaceC3921uz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3889u9 f36474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WC f36475b;

    public C3990wh(C3889u9 identifierRepository, WC uploadDocumentImageWorker) {
        p013kotlin.jvm.internal.s.k(identifierRepository, "identifierRepository");
        p013kotlin.jvm.internal.s.k(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        this.f36474a = identifierRepository;
        this.f36475b = uploadDocumentImageWorker;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    public Object a(C3640ob c3640ob, Gz gz2, Continuation continuation) {
        this.f36475b.a(new WC.a(this.f36474a.a(gz2.c()), this.f36474a.b(gz2.c()), gz2.d().getImage().getFull(), gz2.d()));
        return InterfaceC3921uz.b.MoveToTheNextStep;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    public void reset() {
        InterfaceC3921uz.a.a(this);
    }
}
