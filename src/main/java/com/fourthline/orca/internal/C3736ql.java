package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3736ql implements Bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.p f34851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f34852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3901uf f34853c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ql$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34856c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34858e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34856c = obj;
            this.f34858e |= Integer.MIN_VALUE;
            Object objA = C3736ql.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3736ql(wn0.p endpoint, Gl networkService, InterfaceC3901uf fileWriter) {
        p013kotlin.jvm.internal.s.k(endpoint, "endpoint");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(fileWriter, "fileWriter");
        this.f34851a = endpoint;
        this.f34852b = networkService;
        this.f34853c = fileWriter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r1 == r3) goto L27;
     */
    @Override // com.fourthline.orca.internal.Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.Bt.a r17, p013kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3736ql.a(com.fourthline.orca.internal.Bt$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
