package n40;

import com.google.android.gms.common.Scopes;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JÒ\u0001\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ln40/j0;", "", "Ln40/h0;", "lookupAccount", "Ln40/v1;", "startVerification", "<init>", "(Ln40/h0;Ln40/v1;)V", "", Scopes.EMAIL, "businessName", "Lcom/stripe/android/model/t1;", "verificationType", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "onConsumerNotFound", "Lkotlin/Function2;", "", "onLookupError", "onStartVerification", "Lcom/stripe/android/model/t;", "onVerificationStarted", "onStartVerificationError", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/t1;Lwn0/l;Lwn0/p;Lwn0/l;Lwn0/p;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln40/h0;", "b", "Ln40/v1;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 lookupAccount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v1 startVerification;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93142a;

        static {
            int[] iArr = new int[com.stripe.android.model.t1.values().length];
            try {
                iArr[com.stripe.android.model.t1.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.model.t1.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93142a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.LookupConsumerAndStartVerification", f = "LookupConsumerAndStartVerification.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6}, l = {31, 34, 38, 42, 47, 48, 50, 52}, m = "invoke", n = {"this", "businessName", "verificationType", "onConsumerNotFound", "onLookupError", "onStartVerification", "onVerificationStarted", "onStartVerificationError", "this", "businessName", "verificationType", "onLookupError", "onVerificationStarted", "onStartVerificationError", "session", "onLookupError", "onVerificationStarted", "onStartVerificationError", "onLookupError", "onVerificationStarted", "onStartVerificationError", "onLookupError", "onStartVerificationError", "onLookupError", "onLookupError"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93143n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93144o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f93146q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f93147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f93148s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f93149t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f93150u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f93151v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f93153x;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93151v = obj;
            this.f93153x |= Integer.MIN_VALUE;
            return j0.this.a(null, null, null, null, null, null, null, null, this);
        }
    }

    public j0(h0 lookupAccount, v1 startVerification) {
        p013kotlin.jvm.internal.s.k(lookupAccount, "lookupAccount");
        p013kotlin.jvm.internal.s.k(startVerification, "startVerification");
        this.lookupAccount = lookupAccount;
        this.startVerification = startVerification;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0212  */
    /* JADX WARN: Code duplicated, block: B:103:0x0230 A[PHI: r4 r5 r6 r8
      0x0230: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v4 java.lang.Object), (r4v47 java.lang.Object) binds: [B:99:0x0210, B:101:0x022c, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r5v5 ??) = (r5v25 ??), (r5v26 ??), (r5v27 ??) binds: [B:99:0x0210, B:101:0x022c, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r6v5 ??) = (r6v18 ??), (r6v19 ??), (r6v20 ??) binds: [B:99:0x0210, B:101:0x022c, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r8v3 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>) = 
      (r8v2 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>)
      (r8v2 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>)
      (r8v35 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>)
     binds: [B:99:0x0210, B:101:0x022c, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:108:0x0250  */
    /* JADX WARN: Code duplicated, block: B:110:0x0254  */
    /* JADX WARN: Code duplicated, block: B:111:0x0257  */
    /* JADX WARN: Code duplicated, block: B:114:0x0271  */
    /* JADX WARN: Code duplicated, block: B:115:0x0273 A[PHI: r4 r10
      0x0273: PHI (r4v9 ??) = (r4v6 ??), (r4v51 ??), (r4v52 ??) binds: [B:110:0x0254, B:109:0x0252, B:70:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r10v2 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>) = 
      (r10v1 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>)
      (r10v3 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>)
      (r10v11 wn0.p<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object>)
     binds: [B:110:0x0254, B:109:0x0252, B:70:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0279  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2 A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #5 {all -> 0x01c6, blocks: (B:77:0x0189, B:80:0x01a2, B:88:0x01cc, B:89:0x01d1, B:90:0x01d2), top: B:132:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc A[Catch: all -> 0x01c6, TRY_ENTER, TryCatch #5 {all -> 0x01c6, blocks: (B:77:0x0189, B:80:0x01a2, B:88:0x01cc, B:89:0x01d1, B:90:0x01d2), top: B:132:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2 A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #5 {all -> 0x01c6, blocks: (B:77:0x0189, B:80:0x01a2, B:88:0x01cc, B:89:0x01d1, B:90:0x01d2), top: B:132:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0291, code lost:
    
        if (r10.invoke(r0, r2) == r3) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [wn0.p] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [wn0.p] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, com.stripe.android.model.t1 r21, wn0.l<? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r22, wn0.p<? super java.lang.Throwable, ? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r23, wn0.l<? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r24, wn0.p<? super com.stripe.android.model.ConsumerSession, ? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r25, wn0.p<? super java.lang.Throwable, ? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r26, p013kotlin.coroutines.Continuation<? super jn0.h0> r27) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n40.j0.a(java.lang.String, java.lang.String, com.stripe.android.model.t1, wn0.l, wn0.p, wn0.l, wn0.p, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
