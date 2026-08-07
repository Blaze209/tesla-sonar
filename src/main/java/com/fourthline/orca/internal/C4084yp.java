package com.fourthline.orca.internal;

import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4084yp implements ED {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qf f37071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RC f37072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vf f37073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3645og f37074d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yp$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f37077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f37078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f37080f;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = C4084yp.this.new a(continuation);
            aVar.f37080f = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0087  */
        /* JADX WARN: Code duplicated, block: B:36:0x00db A[PHI: r1 r6 r7 r8 r9 r11
          0x00db: PHI (r1v6 com.fourthline.orca.internal.Of$b) = (r1v5 com.fourthline.orca.internal.Of$b), (r1v13 com.fourthline.orca.internal.Of$b) binds: [B:34:0x00d8, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r6v6 com.fourthline.orca.internal.Of) = (r6v5 com.fourthline.orca.internal.Of), (r6v10 com.fourthline.orca.internal.Of) binds: [B:34:0x00d8, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r7v2 java.util.Iterator) = (r7v1 java.util.Iterator), (r7v7 java.util.Iterator) binds: [B:34:0x00d8, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r8v2 com.fourthline.orca.internal.yp) = (r8v1 com.fourthline.orca.internal.yp), (r8v5 com.fourthline.orca.internal.yp) binds: [B:34:0x00d8, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r9v2 kotlinx.coroutines.flow.FlowCollector) = (r9v1 kotlinx.coroutines.flow.FlowCollector), (r9v5 kotlinx.coroutines.flow.FlowCollector) binds: [B:34:0x00d8, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r11v19 java.lang.Object) = (r11v18 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x00d8, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x00c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:? A[PHI: r7 r8 r9
          PHI (r7v1 java.util.Iterator) = (r7v0 java.util.Iterator), (r7v2 java.util.Iterator), (r7v5 java.util.Iterator) binds: [B:18:0x006a, B:37:0x00f6, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          PHI (r8v1 com.fourthline.orca.internal.yp) = (r8v0 com.fourthline.orca.internal.yp), (r8v2 com.fourthline.orca.internal.yp), (r8v3 com.fourthline.orca.internal.yp) binds: [B:18:0x006a, B:37:0x00f6, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          PHI (r9v1 kotlinx.coroutines.flow.FlowCollector) = 
          (r9v0 kotlinx.coroutines.flow.FlowCollector)
          (r9v2 kotlinx.coroutines.flow.FlowCollector)
          (r9v3 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:18:0x006a, B:37:0x00f6, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f6 -> B:19:0x0081). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4084yp.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yp$b */
    static final class b extends SuspendLambda implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37084c;

        b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f37083b = flowCollector;
            bVar.f37084c = th2;
            return bVar.invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37082a;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f37083b;
                FD.b bVar = new FD.b(new ZD.b("An error occurred when completing a View: " + ((Throwable) this.f37084c).getMessage()));
                this.f37083b = null;
                this.f37082a = 1;
                if (flowCollector.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yp$c */
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37087c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37089e;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37087c = obj;
            this.f37089e |= Integer.MIN_VALUE;
            return C4084yp.this.a((FlowCollector) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yp$d */
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f37092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f37093d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f37095f;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37093d = obj;
            this.f37095f |= Integer.MIN_VALUE;
            return C4084yp.this.a((FlowCollector) null, (C3304gh) null, this);
        }
    }

    public C4084yp(Qf flowActionProvider, RC uploadDataRequestBuilder, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(uploadDataRequestBuilder, "uploadDataRequestBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        this.f37071a = flowActionProvider;
        this.f37072b = uploadDataRequestBuilder;
        this.f37073c = dataWorkManager;
        this.f37074d = whatsNextWorker;
    }

    @Override // com.fourthline.orca.internal.ED
    public Object a(OD od2, Continuation continuation) {
        return FlowKt.m548catch(FlowKt.flow(new a(null)), new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r8.emit(r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x008b, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r8, com.fourthline.orca.internal.C3304gh r9, p013kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.fourthline.orca.internal.C4084yp.d
            if (r0 == 0) goto L13
            r0 = r10
            com.fourthline.orca.internal.yp$d r0 = (com.fourthline.orca.internal.C4084yp.d) r0
            int r1 = r0.f37095f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37095f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.yp$d r0 = new com.fourthline.orca.internal.yp$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f37093d
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37095f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L58
            if (r2 == r5) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            jn0.t.b(r10)
            goto Lba
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f37090a
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            jn0.t.b(r10)
            jn0.s r10 = (jn0.s) r10
            java.lang.Object r9 = r10.getValue()
            goto L82
        L47:
            java.lang.Object r8 = r0.f37092c
            r9 = r8
            com.fourthline.orca.internal.gh r9 = (com.fourthline.orca.internal.C3304gh) r9
            java.lang.Object r8 = r0.f37091b
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            java.lang.Object r2 = r0.f37090a
            com.fourthline.orca.internal.yp r2 = (com.fourthline.orca.internal.C4084yp) r2
            jn0.t.b(r10)
            goto L71
        L58:
            jn0.t.b(r10)
            com.fourthline.orca.internal.FD$c r10 = new com.fourthline.orca.internal.FD$c
            r2 = 0
            r10.<init>(r2, r5, r6)
            r0.f37090a = r7
            r0.f37091b = r8
            r0.f37092c = r9
            r0.f37095f = r5
            java.lang.Object r10 = r8.emit(r10, r0)
            if (r10 != r1) goto L70
            goto Lb9
        L70:
            r2 = r7
        L71:
            com.fourthline.orca.internal.Vf r10 = r2.f37073c
            r0.f37090a = r8
            r0.f37091b = r6
            r0.f37092c = r6
            r0.f37095f = r4
            java.lang.Object r9 = r10.a(r9, r0)
            if (r9 != r1) goto L82
            goto Lb9
        L82:
            java.lang.Throwable r10 = jn0.s.e(r9)
            if (r10 != 0) goto L8b
            jn0.h0 r9 = (jn0.h0) r9
            goto Lba
        L8b:
            com.fourthline.orca.internal.ZD$b r9 = new com.fourthline.orca.internal.ZD$b
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "An upload error occurred: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r10 = "."
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r9.<init>(r10)
            com.fourthline.orca.internal.FD$b r10 = new com.fourthline.orca.internal.FD$b
            r10.<init>(r9)
            r0.f37090a = r6
            r0.f37095f = r3
            java.lang.Object r8 = r8.emit(r10, r0)
            if (r8 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C4084yp.a(kotlinx.coroutines.flow.FlowCollector, com.fourthline.orca.internal.gh, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(FlowCollector flowCollector, Continuation continuation) {
        c cVar;
        Object objA;
        C4084yp c4084yp;
        Object objA2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f37089e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f37089e = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f37087c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f37089e;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC3645og.a aVar = new InterfaceC3645og.a(null, 1, null);
            InterfaceC3645og interfaceC3645og = this.f37074d;
            cVar.f37085a = this;
            cVar.f37086b = flowCollector;
            cVar.f37089e = 1;
            objA = interfaceC3645og.a(aVar, cVar);
            if (objA != coroutine_suspended) {
                c4084yp = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            flowCollector = (FlowCollector) cVar.f37086b;
            c4084yp = (C4084yp) cVar.f37085a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            flowCollector = (FlowCollector) cVar.f37086b;
            c4084yp = (C4084yp) cVar.f37085a;
            jn0.t.b(obj);
        }
        cVar.f37085a = null;
        cVar.f37086b = null;
        cVar.f37089e = 3;
        objA2 = c4084yp.a(flowCollector, cVar);
        if (objA2 != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objA2;
        jn0.t.b(objA);
        InterfaceC3645og.c cVarA = ((InterfaceC3645og.b) objA).a();
        if (!(cVarA instanceof InterfaceC3645og.c.d)) {
            return null;
        }
        InterfaceC3645og.c.d dVar = (InterfaceC3645og.c.d) cVarA;
        C3304gh c3304ghA = c4084yp.f37072b.a(dVar.c());
        if (c3304ghA != null) {
            cVar.f37085a = c4084yp;
            cVar.f37086b = flowCollector;
            cVar.f37089e = 2;
            if (c4084yp.a(flowCollector, c3304ghA, cVar) != coroutine_suspended) {
                cVar.f37085a = null;
                cVar.f37086b = null;
                cVar.f37089e = 3;
                objA2 = c4084yp.a(flowCollector, cVar);
                if (objA2 != coroutine_suspended) {
                    return objA2;
                }
            }
            return coroutine_suspended;
        }
        return dVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List a(List list) {
        final wn0.p pVar = new wn0.p() { // from class: com.fourthline.orca.internal.bj1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C4084yp.a((Of) obj, (Of) obj2));
            }
        };
        return p013kotlin.collections.v.a1(list, new Comparator() { // from class: com.fourthline.orca.internal.cj1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4084yp.a(pVar, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(wn0.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Of of2, Of of3) {
        if (of2 instanceof Of.c) {
            return -1;
        }
        return of3 instanceof Of.c ? 1 : 0;
    }
}
