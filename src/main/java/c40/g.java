package c40;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lc40/g;", "Lc40/m;", "Lc40/e;", "elementsSessionManager", "Lcom/stripe/android/customersheet/d$e;", "customerSessionProvider", "<init>", "(Lc40/e;Lcom/stripe/android/customersheet/d$e;)V", "Lc40/j;", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lc40/e;", "b", "Lcom/stripe/android/customersheet/d$e;", "", "c", "Z", "()Z", "canCreateSetupIntents", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e elementsSessionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.d.e customerSessionProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canCreateSetupIntents;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionIntentDataSource", f = "CustomerSessionIntentDataSource.kt", i = {0}, l = {15, 16}, m = "retrieveSetupIntentClientSecret", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18670n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f18671o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18673q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18671o = obj;
            this.f18673q |= Integer.MIN_VALUE;
            return g.this.f(this);
        }
    }

    public g(e elementsSessionManager, com.stripe.android.customersheet.d.e customerSessionProvider) {
        s.k(elementsSessionManager, "elementsSessionManager");
        s.k(customerSessionProvider, "customerSessionProvider");
        this.elementsSessionManager = elementsSessionManager;
        this.customerSessionProvider = customerSessionProvider;
        this.canCreateSetupIntents = true;
    }

    @Override // c40.m
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getCanCreateSetupIntents() {
        return this.canCreateSetupIntents;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r6 == r1) goto L27;
     */
    @Override // c40.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(p013kotlin.coroutines.Continuation<? super c40.j<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof c40.g.a
            if (r0 == 0) goto L13
            r0 = r6
            c40.g$a r0 = (c40.g.a) r0
            int r1 = r0.f18673q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18673q = r1
            goto L18
        L13:
            c40.g$a r0 = new c40.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18671o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f18673q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
            jn0.s r6 = (jn0.s) r6     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r6 = move-exception
            goto L7f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f18670n
            c40.g r2 = (c40.g) r2
            jn0.t.b(r6)
            jn0.s r6 = (jn0.s) r6
            java.lang.Object r6 = r6.getValue()
            goto L5b
        L4a:
            jn0.t.b(r6)
            c40.e r6 = r5.elementsSessionManager
            r0.f18670n = r5
            r0.f18673q = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L5a
            goto L74
        L5a:
            r2 = r5
        L5b:
            boolean r4 = jn0.s.h(r6)
            if (r4 == 0) goto L85
            c40.a r6 = (c40.CachedCustomerEphemeralKey) r6     // Catch: java.lang.Throwable -> L32
            com.stripe.android.customersheet.d$e r2 = r2.customerSessionProvider     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = r6.getCustomerId()     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r0.f18670n = r4     // Catch: java.lang.Throwable -> L32
            r0.f18673q = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = r2.c(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = jn0.s.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L89
        L7f:
            jn0.s$a r0 = jn0.s.INSTANCE
            java.lang.Object r6 = jn0.t.a(r6)
        L85:
            java.lang.Object r6 = jn0.s.b(r6)
        L89:
            c40.j r6 = c40.k.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.g.f(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
