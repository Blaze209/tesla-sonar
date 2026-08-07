package com.stripe.android.stripe3ds2.transaction;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import u80.ErrorData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0002\r\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/q;", "Lcom/stripe/android/stripe3ds2/transaction/k;", "Lt80/k;", "httpClient", "Lr80/c;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lt80/k;Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "Lu80/a;", "errorData", "Ljn0/h0;", "a", "(Lu80/a;)V", "Lt80/k;", "b", "Lr80/c;", "c", "Lkotlin/coroutines/CoroutineContext;", DateTokenConverter.CONVERTER_KEY, "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f54078d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t80.k httpClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/q$a;", "", "<init>", "()V", "", "CONTENT_TYPE", "Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/q$b;", "Lcom/stripe/android/stripe3ds2/transaction/k$a;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "acsUrl", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/k;", "a", "(Ljava/lang/String;Lr80/c;)Lcom/stripe/android/stripe3ds2/transaction/k;", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext workContext;

        public b(CoroutineContext workContext) {
            s.k(workContext, "workContext");
            this.workContext = workContext;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.k.a
        public k a(String acsUrl, r80.c errorReporter) {
            s.k(acsUrl, "acsUrl");
            s.k(errorReporter, "errorReporter");
            return new q(new r(acsUrl, null, errorReporter, this.workContext, 2, null), errorReporter, Dispatchers.getIO());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor$executeAsync$3$1", f = "StripeErrorRequestExecutor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54083n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f54084o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f54086q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f54086q = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = q.this.new c(this.f54086q, continuation);
            cVar.f54084o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54083n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    q qVar = q.this;
                    String str = this.f54086q;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    t80.k kVar = qVar.httpClient;
                    s.h(str);
                    this.f54083n = 1;
                    obj = kVar.a(str, "application/json; charset=utf-8", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                objB = jn0.s.b((t80.l) obj);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            q qVar2 = q.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                qVar2.errorReporter.Y0(thE);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public q(t80.k httpClient, r80.c errorReporter, CoroutineContext workContext) {
        s.k(httpClient, "httpClient");
        s.k(errorReporter, "errorReporter");
        s.k(workContext, "workContext");
        this.httpClient = httpClient;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.k
    public void a(ErrorData errorData) {
        Object objB;
        s.k(errorData, "errorData");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(errorData.a().toString());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.errorReporter.Y0(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, thE));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new c(str, null), 3, null);
        }
    }
}
