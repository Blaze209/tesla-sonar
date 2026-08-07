package com.plaid.internal;

import com.plaid.link.SubmissionData;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4417f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z2 f47662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y2 f47663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N5 f47664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4351b1 f47665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4435h6 f47666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G7 f47667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SubmissionData f47668g;

    public C4417f6(Z2 linkStateStore, Y2 linkStateReducer, N5 webViewRegistry, C4351b1 featureManager, C4435h6 preloadPlaidWebViewListener, G7 webviewFallbackBaseUrlOverWriter) {
        p013kotlin.jvm.internal.s.k(linkStateStore, "linkStateStore");
        p013kotlin.jvm.internal.s.k(linkStateReducer, "linkStateReducer");
        p013kotlin.jvm.internal.s.k(webViewRegistry, "webViewRegistry");
        p013kotlin.jvm.internal.s.k(featureManager, "featureManager");
        p013kotlin.jvm.internal.s.k(preloadPlaidWebViewListener, "preloadPlaidWebViewListener");
        p013kotlin.jvm.internal.s.k(webviewFallbackBaseUrlOverWriter, "webviewFallbackBaseUrlOverWriter");
        this.f47662a = linkStateStore;
        this.f47663b = linkStateReducer;
        this.f47664c = webViewRegistry;
        this.f47665d = featureManager;
        this.f47666e = preloadPlaidWebViewListener;
        this.f47667f = webviewFallbackBaseUrlOverWriter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C4347a6 c4347a6;
        C4417f6 c4417f6;
        boolean z11;
        if (continuationImpl instanceof C4347a6) {
            c4347a6 = (C4347a6) continuationImpl;
            int i11 = c4347a6.f46868d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4347a6.f46868d = i11 - Integer.MIN_VALUE;
            } else {
                c4347a6 = new C4347a6(this, continuationImpl);
            }
        } else {
            c4347a6 = new C4347a6(this, continuationImpl);
        }
        Object objA = c4347a6.f46866b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4347a6.f46868d;
        if (i12 == 0) {
            jn0.t.b(objA);
            Z2 z12 = this.f47662a;
            c4347a6.f46865a = this;
            c4347a6.f46868d = 1;
            objA = z12.a(c4347a6);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            c4417f6 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4417f6 = c4347a6.f46865a;
            jn0.t.b(objA);
        }
        N2 n11 = (N2) objA;
        if (n11 instanceof N2.b) {
            return AbstractC4453j6.a.f47777a;
        }
        if (!(n11 instanceof N2.k)) {
            return AbstractC4453j6.d.f47779a;
        }
        N2.k kVar = (N2.k) n11;
        if (!kVar.f46521k) {
            c4417f6.f47665d.getClass();
            EnumC4360c1 enumC4360c1 = EnumC4360c1.BACKEND_DETERMINES;
            if (enumC4360c1.isSet()) {
                c4417f6.f47665d.getClass();
                z11 = enumC4360c1.toBoolean();
            } else {
                z11 = false;
            }
            if (!z11) {
                return AbstractC4453j6.d.f47779a;
            }
        }
        return kVar.f46520j ? new AbstractC4453j6.b(kVar.f46516f) : new AbstractC4453j6.c(kVar.f46516f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.plaid.internal.C4365c6(r2, r8, null), r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p013kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.plaid.internal.C4356b6
            if (r0 == 0) goto L13
            r0 = r8
            com.plaid.internal.b6 r0 = (com.plaid.internal.C4356b6) r0
            int r1 = r0.f46892d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46892d = r1
            goto L18
        L13:
            com.plaid.internal.b6 r0 = new com.plaid.internal.b6
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f46890b
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46892d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            jn0.t.b(r8)
            goto La5
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            com.plaid.internal.f6 r2 = r0.f46889a
            jn0.t.b(r8)
            goto L4a
        L3b:
            jn0.t.b(r8)
            r0.f46889a = r7
            r0.f46892d = r4
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r1) goto L49
            goto La4
        L49:
            r2 = r7
        L4a:
            com.plaid.internal.j6 r8 = (com.plaid.internal.AbstractC4453j6) r8
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
            if (r4 != 0) goto L59
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        L59:
            com.plaid.internal.X5$a r4 = com.plaid.internal.X5.f46812a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Preload Link "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.plaid.internal.X5.a.a(r4, r5)
            com.plaid.internal.j6$a r4 = com.plaid.internal.AbstractC4453j6.a.f47777a
            boolean r4 = p013kotlin.jvm.internal.s.f(r8, r4)
            if (r4 != 0) goto La5
            boolean r4 = r8 instanceof com.plaid.internal.AbstractC4453j6.d
            if (r4 != 0) goto La5
            boolean r4 = r8 instanceof com.plaid.internal.AbstractC4453j6.b
            if (r4 == 0) goto L83
            r2.getClass()
            goto La5
        L83:
            boolean r4 = r8 instanceof com.plaid.internal.AbstractC4453j6.c
            if (r4 == 0) goto La5
            com.plaid.internal.j6$c r8 = (com.plaid.internal.AbstractC4453j6.c) r8
            java.lang.String r8 = r8.a()
            r4 = 0
            r0.f46889a = r4
            r0.f46892d = r3
            r2.getClass()
            kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()
            com.plaid.internal.c6 r5 = new com.plaid.internal.c6
            r5.<init>(r2, r8, r4)
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r3, r5, r0)
            if (r8 != r1) goto La5
        La4:
            return r1
        La5:
            com.plaid.internal.X5$a r8 = com.plaid.internal.X5.f46812a
            java.lang.String r0 = "Preload link complete"
            com.plaid.internal.X5.a.a(r8, r0)
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4417f6.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (r2.a(r10, r0) == r1) goto L39;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00a3, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p013kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4417f6.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
