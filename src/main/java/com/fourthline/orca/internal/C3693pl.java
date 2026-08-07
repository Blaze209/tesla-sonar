package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3693pl implements At {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f34601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3901uf f34602b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34605c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34607e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34605c = obj;
            this.f34607e |= Integer.MIN_VALUE;
            Object objA = C3693pl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3693pl(Gl networkService, InterfaceC3901uf fileWriter) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(fileWriter, "fileWriter");
        this.f34601a = networkService;
        this.f34602b = fileWriter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r1 == r3) goto L27;
     */
    @Override // com.fourthline.orca.internal.At
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.At.a r17, p013kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3693pl.a(com.fourthline.orca.internal.At$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
