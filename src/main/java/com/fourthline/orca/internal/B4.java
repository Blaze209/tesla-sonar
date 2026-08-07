package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class B4 implements InterfaceC3414j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f25055a;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f25056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f25057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25058c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25060e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25058c = obj;
            this.f25060e |= Integer.MIN_VALUE;
            return B4.this.a(null, this);
        }
    }

    public B4(List listeners) {
        p013kotlin.jvm.internal.s.k(listeners, "listeners");
        this.f25055a = listeners;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0044
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.fourthline.orca.internal.InterfaceC3414j6
    public java.lang.Object a(com.fourthline.orca.workflow.WorkflowResults.IDV r5, p013kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.B4.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.B4$a r0 = (com.fourthline.orca.internal.B4.a) r0
            int r1 = r0.f25060e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25060e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.B4$a r0 = new com.fourthline.orca.internal.B4$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25058c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f25060e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f25057b
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r2 = r0.f25056a
            com.fourthline.orca.workflow.WorkflowResults$IDV r2 = (com.fourthline.orca.workflow.WorkflowResults.IDV) r2
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L44
            goto L44
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            jn0.t.b(r6)
            java.util.List r6 = r4.f25055a
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
            r5 = r6
        L44:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5d
            java.lang.Object r6 = r5.next()
            com.fourthline.orca.internal.j6 r6 = (com.fourthline.orca.internal.InterfaceC3414j6) r6
            r0.f25056a = r2     // Catch: java.lang.Throwable -> L44
            r0.f25057b = r5     // Catch: java.lang.Throwable -> L44
            r0.f25060e = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L44
            if (r6 != r1) goto L44
            return r1
        L5d:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.B4.a(com.fourthline.orca.workflow.WorkflowResults$IDV, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
