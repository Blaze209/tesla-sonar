package j90;

import p009i2.p1;
import p009i2.q1;
import p009i2.r1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.j;
import p020r2.o;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a6\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002H\u0082@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li2/r1;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "Lj90/g;", "b", "(Li2/r1;Lwn0/l;Lr2/l;II)Lj90/g;", "", "limit", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "c", "(ILwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements l<r1, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f83179c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r1 it) {
            s.k(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt", f = "StripeBottomSheetState.kt", i = {0, 0, 0}, l = {102}, m = "repeatUntilSucceededOrLimit", n = {"block", "limit", "counter"}, s = {"L$0", "I$0", "I$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83180n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f83181o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f83182p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f83183q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f83184r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83183q = obj;
            this.f83184r |= Integer.MIN_VALUE;
            return h.c(0, null, this);
        }
    }

    public static final g b(r1 r1Var, l<? super r1, Boolean> lVar, p020r2.l lVar2, int i11, int i12) {
        lVar2.H(2070707701);
        if ((i12 & 1) != 0) {
            r1Var = r1.Hidden;
        }
        r1 r1Var2 = r1Var;
        if ((i12 & 2) != 0) {
            lVar = a.f83179c;
        }
        l<? super r1, Boolean> lVar3 = lVar;
        if (o.J()) {
            o.S(2070707701, i11, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetState (StripeBottomSheetState.kt:22)");
        }
        q1 q1VarJ = p1.j(r1Var2, j.l(0, 0, null, 7, null), lVar3, true, lVar2, (i11 & 14) | 3120 | ((i11 << 3) & 896), 0);
        j90.b bVarA = c.a(lVar2, 0);
        lVar2.H(-21674716);
        Object objI = lVar2.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            objI = new g(q1VarJ, bVarA);
            lVar2.B(objI);
        }
        g gVar = (g) objI;
        lVar2.T();
        if (o.J()) {
            o.R();
        }
        lVar2.T();
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0054
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final java.lang.Object c(int r5, wn0.l<? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r6, p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            boolean r0 = r7 instanceof j90.h.b
            if (r0 == 0) goto L13
            r0 = r7
            j90.h$b r0 = (j90.h.b) r0
            int r1 = r0.f83184r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83184r = r1
            goto L18
        L13:
            j90.h$b r0 = new j90.h$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f83183q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f83184r
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r5 = r0.f83181o
            int r6 = r0.f83180n
            java.lang.Object r2 = r0.f83182p
            wn0.l r2 = (wn0.l) r2
            jn0.t.b(r7)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L56
        L31:
            r7 = r2
            goto L54
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            jn0.t.b(r7)
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L43:
            if (r5 >= r6) goto L56
            r0.f83182p = r7     // Catch: java.util.concurrent.CancellationException -> L54
            r0.f83180n = r6     // Catch: java.util.concurrent.CancellationException -> L54
            r0.f83181o = r5     // Catch: java.util.concurrent.CancellationException -> L54
            r0.f83184r = r3     // Catch: java.util.concurrent.CancellationException -> L54
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L54
            if (r5 != r1) goto L56
            return r1
        L54:
            int r5 = r5 + r3
            goto L43
        L56:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j90.h.c(int, wn0.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
