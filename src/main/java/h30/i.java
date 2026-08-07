package h30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lh30/i;", "Lh30/b;", "Lh30/d;", "inMemorySource", "remoteSource", "staticSource", "Lh30/e;", PlaceTypes.STORE, "<init>", "(Lh30/d;Lh30/d;Lh30/d;Lh30/e;)V", "Lh30/f$b;", "cardNumber", "", "Lcom/stripe/android/model/a;", "c", "(Lh30/f$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lh30/d;", "b", DateTokenConverter.CONVERTER_KEY, "Lh30/e;", "Lkotlinx/coroutines/flow/StateFlow;", "", "e", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements h30.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d inMemorySource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d remoteSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d staticSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e store;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.cards.DefaultCardAccountRangeRepository", f = "DefaultCardAccountRangeRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {31, 32, 34, 37}, m = "getAccountRanges", n = {"this", "cardNumber", "this", "cardNumber", "this", "cardNumber"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70614n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70615o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f70616p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f70618r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70616p = obj;
            this.f70618r |= Integer.MIN_VALUE;
            return i.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "loading1", "loading2", "loading3", "a", "(ZZZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<Boolean, Boolean, Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f70619c = new b();

        b() {
            super(3);
        }

        public final Boolean a(boolean z11, boolean z12, boolean z13) {
            return Boolean.valueOf(z11 || z12 || z13);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            return a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
        }
    }

    public i(d inMemorySource, d remoteSource, d staticSource, e store) {
        s.k(inMemorySource, "inMemorySource");
        s.k(remoteSource, "remoteSource");
        s.k(staticSource, "staticSource");
        s.k(store, "store");
        this.inMemorySource = inMemorySource;
        this.remoteSource = remoteSource;
        this.staticSource = staticSource;
        this.store = store;
        this.loading = r90.g.g(inMemorySource.b(), remoteSource.b(), staticSource.b(), b.f70619c);
    }

    @Override // h30.b
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r10 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r10 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r10 == r1) goto L46;
     */
    @Override // h30.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(h30.f.Unvalidated r9, p013kotlin.coroutines.Continuation<? super java.util.List<com.stripe.android.model.AccountRange>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof h30.i.a
            if (r0 == 0) goto L13
            r0 = r10
            h30.i$a r0 = (h30.i.a) r0
            int r1 = r0.f70618r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70618r = r1
            goto L18
        L13:
            h30.i$a r0 = new h30.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f70616p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70618r
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L60
            if (r2 == r6) goto L54
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            jn0.t.b(r10)
            goto Lc4
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f70615o
            h30.f$b r9 = (h30.f.Unvalidated) r9
            java.lang.Object r2 = r0.f70614n
            h30.i r2 = (h30.i) r2
            jn0.t.b(r10)
            goto La2
        L48:
            java.lang.Object r9 = r0.f70615o
            h30.f$b r9 = (h30.f.Unvalidated) r9
            java.lang.Object r2 = r0.f70614n
            h30.i r2 = (h30.i) r2
            jn0.t.b(r10)
            goto L90
        L54:
            java.lang.Object r9 = r0.f70615o
            h30.f$b r9 = (h30.f.Unvalidated) r9
            java.lang.Object r2 = r0.f70614n
            h30.i r2 = (h30.i) r2
            jn0.t.b(r10)
            goto L79
        L60:
            jn0.t.b(r10)
            h30.a r10 = r9.getBin()
            if (r10 == 0) goto Lc7
            h30.e r2 = r8.store
            r0.f70614n = r8
            r0.f70615o = r9
            r0.f70618r = r6
            java.lang.Object r10 = r2.c(r10, r0)
            if (r10 != r1) goto L78
            goto Lc3
        L78:
            r2 = r8
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L93
            h30.d r10 = r2.inMemorySource
            r0.f70614n = r2
            r0.f70615o = r9
            r0.f70618r = r5
            java.lang.Object r10 = r10.c(r9, r0)
            if (r10 != r1) goto L90
            goto Lc3
        L90:
            java.util.List r10 = (java.util.List) r10
            goto La4
        L93:
            h30.d r10 = r2.remoteSource
            r0.f70614n = r2
            r0.f70615o = r9
            r0.f70618r = r4
            java.lang.Object r10 = r10.c(r9, r0)
            if (r10 != r1) goto La2
            goto Lc3
        La2:
            java.util.List r10 = (java.util.List) r10
        La4:
            if (r10 == 0) goto Lb5
            r4 = r10
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto Lb0
            goto Lb1
        Lb0:
            r10 = r7
        Lb1:
            if (r10 != 0) goto Lb4
            goto Lb5
        Lb4:
            return r10
        Lb5:
            h30.d r10 = r2.staticSource
            r0.f70614n = r7
            r0.f70615o = r7
            r0.f70618r = r3
            java.lang.Object r10 = r10.c(r9, r0)
            if (r10 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            java.util.List r10 = (java.util.List) r10
            return r10
        Lc7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.i.c(h30.f$b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
