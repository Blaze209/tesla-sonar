package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4093yy implements InterfaceC3921uz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37149a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yy$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f37152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f37153d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f37155f;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37153d = obj;
            this.f37155f |= Integer.MIN_VALUE;
            return C4093yy.this.a(null, null, this);
        }
    }

    public C4093yy(List handlers) {
        p013kotlin.jvm.internal.s.k(handlers, "handlers");
        this.f37149a = handlers;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0069 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    public java.lang.Object a(com.fourthline.orca.internal.C3640ob r7, com.fourthline.orca.internal.Gz r8, p013kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.fourthline.orca.internal.C4093yy.a
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.orca.internal.yy$a r0 = (com.fourthline.orca.internal.C4093yy.a) r0
            int r1 = r0.f37155f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37155f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.yy$a r0 = new com.fourthline.orca.internal.yy$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f37153d
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37155f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.f37152c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f37151b
            com.fourthline.orca.internal.Gz r8 = (com.fourthline.orca.internal.Gz) r8
            java.lang.Object r2 = r0.f37150a
            com.fourthline.orca.internal.ob r2 = (com.fourthline.orca.internal.C3640ob) r2
            jn0.t.b(r9)
            r5 = r0
            r0 = r8
            r8 = r2
        L37:
            r2 = r5
            goto L6d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            jn0.t.b(r9)
            java.util.List r9 = r6.f37149a
            java.util.Iterator r9 = r9.iterator()
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r5
        L4e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r7.next()
            com.fourthline.orca.internal.uz r2 = (com.fourthline.orca.internal.InterfaceC3921uz) r2
            r0.f37150a = r8
            r0.f37151b = r9
            r0.f37152c = r7
            r0.f37155f = r3
            java.lang.Object r2 = r2.a(r8, r9, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r0
            r0 = r9
            r9 = r2
            goto L37
        L6d:
            com.fourthline.orca.internal.uz$b r4 = com.fourthline.orca.internal.InterfaceC3921uz.b.HandledInternally
            if (r9 != r4) goto L72
            return r4
        L72:
            r9 = r0
            r0 = r2
            goto L4e
        L75:
            com.fourthline.orca.internal.uz$b r7 = com.fourthline.orca.internal.InterfaceC3921uz.b.MoveToTheNextStep
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4093yy.a(com.fourthline.orca.internal.ob, com.fourthline.orca.internal.Gz, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    public void reset() {
        InterfaceC3921uz.a.a(this);
    }
}
