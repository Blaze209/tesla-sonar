package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3558mf implements InterfaceC3788rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3746qv f33564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final At f33565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bt f33566c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mf$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f33569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f33570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f33571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f33572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f33573g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f33574h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f33576j;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33574h = obj;
            this.f33576j |= Integer.MIN_VALUE;
            return C3558mf.this.a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mf$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33579c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f33581e;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33579c = obj;
            this.f33581e |= Integer.MIN_VALUE;
            Object objA = C3558mf.this.a((InterfaceC3788rv.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3558mf(InterfaceC3746qv qesRetrieveSigningDetailsRequestWorker, At qesDownloadLegalDocumentWorker, Bt qesDownloadSignDocumentWorker) {
        p013kotlin.jvm.internal.s.k(qesRetrieveSigningDetailsRequestWorker, "qesRetrieveSigningDetailsRequestWorker");
        p013kotlin.jvm.internal.s.k(qesDownloadLegalDocumentWorker, "qesDownloadLegalDocumentWorker");
        p013kotlin.jvm.internal.s.k(qesDownloadSignDocumentWorker, "qesDownloadSignDocumentWorker");
        this.f33564a = qesRetrieveSigningDetailsRequestWorker;
        this.f33565b = qesDownloadLegalDocumentWorker;
        this.f33566c = qesDownloadSignDocumentWorker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // com.fourthline.orca.internal.InterfaceC3788rv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.InterfaceC3788rv.a r6, p013kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.C3558mf.b
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.mf$b r0 = (com.fourthline.orca.internal.C3558mf.b) r0
            int r1 = r0.f33581e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33581e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.mf$b r0 = new com.fourthline.orca.internal.mf$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f33579c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f33581e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L79
        L2c:
            r6 = move-exception
            goto L80
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f33578b
            com.fourthline.orca.internal.rv$a r6 = (com.fourthline.orca.internal.InterfaceC3788rv.a) r6
            java.lang.Object r2 = r0.f33577a
            com.fourthline.orca.internal.mf r2 = (com.fourthline.orca.internal.C3558mf) r2
            jn0.t.b(r7)
            jn0.s r7 = (jn0.s) r7
            java.lang.Object r7 = r7.getValue()
            goto L5b
        L48:
            jn0.t.b(r7)
            com.fourthline.orca.internal.qv r7 = r5.f33564a
            r0.f33577a = r5
            r0.f33578b = r6
            r0.f33581e = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5a
            goto L78
        L5a:
            r2 = r5
        L5b:
            boolean r4 = jn0.s.h(r7)
            if (r4 == 0) goto L8b
            com.fourthline.orca.internal.qv$a r7 = (com.fourthline.orca.internal.InterfaceC3746qv.a) r7     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = r6.a()     // Catch: java.lang.Throwable -> L2c
            com.fourthline.orca.internal.qv$a$a r7 = r7.a()     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            r0.f33577a = r4     // Catch: java.lang.Throwable -> L2c
            r0.f33578b = r4     // Catch: java.lang.Throwable -> L2c
            r0.f33581e = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r2.a(r6, r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            com.fourthline.orca.internal.rv$b r7 = (com.fourthline.orca.internal.InterfaceC3788rv.b) r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = jn0.s.b(r7)     // Catch: java.lang.Throwable -> L2c
            return r6
        L80:
            jn0.s$a r7 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
            java.lang.Object r6 = jn0.s.b(r6)
            return r6
        L8b:
            java.lang.Object r6 = jn0.s.b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3558mf.a(com.fourthline.orca.internal.rv$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ce -> B:23:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0142 -> B:31:0x0143). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r13, com.fourthline.orca.internal.InterfaceC3746qv.a.C0603a r14, p013kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3558mf.a(java.lang.String, com.fourthline.orca.internal.qv$a$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final InterfaceC3788rv.b.a.C0610a a(InterfaceC3746qv.a.C0603a.b bVar, String str) {
        return new InterfaceC3788rv.b.a.C0610a(bVar.b(), bVar.a(), str, bVar.c(), bVar.d());
    }

    private final InterfaceC3788rv.b.a.C0611b a(InterfaceC3746qv.a.C0603a.d dVar, String str) {
        return new InterfaceC3788rv.b.a.C0611b(dVar.c(), dVar.a(), str);
    }
}
