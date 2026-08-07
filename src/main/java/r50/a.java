package r50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import j40.l;
import jn0.h0;
import jn0.t;
import o30.StripeError;
import o30.d;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.d0;
import w30.e0;
import w30.j0;
import w30.k0;
import w30.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&¨\u0006'"}, d2 = {"Lr50/a;", "", "Lw30/j0;", "stripeNetworkClient", "Lj40/l;", "eventEmitter", "Lwo0/b;", "json", "Lo30/d;", "logger", "<init>", "(Lw30/j0;Lj40/l;Lwo0/b;Lo30/d;)V", "Response", "Lw30/k0;", "request", "Lkotlin/Function1;", "", "decodeResponse", "e", "(Lw30/k0;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw30/l0;", "response", "Ljava/lang/Exception;", "Lkotlin/Exception;", "f", "(Lw30/l0;)Ljava/lang/Exception;", "Ljn0/h0;", "c", "(Lw30/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lro0/d;", "responseSerializer", DateTokenConverter.CONVERTER_KEY, "(Lw30/k0;Lro0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lw30/j0;", "b", "Lj40/l;", "Lwo0/b;", "Lo30/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 stripeNetworkClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l eventEmitter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wo0.b json;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d logger;

    /* JADX INFO: renamed from: r50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class C2275a extends u implements wn0.l<String, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2275a f107038c = new C2275a();

        C2275a() {
            super(1);
        }

        public final void a(String it) {
            s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(String str) {
            a(str);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Response] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Response", "", "body", "a", "(Ljava/lang/String;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class b<Response> extends u implements wn0.l<String, Response> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ro0.d<Response> f107040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ro0.d<Response> dVar) {
            super(1);
            this.f107040d = dVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response invoke(String body) {
            s.k(body, "body");
            return (Response) a.this.json.d(this.f107040d, body);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor", f = "FinancialConnectionsRequestExecutor.kt", i = {0, 0, 0}, l = {64}, m = "executeInternal", n = {"this", "request", "decodeResponse"}, s = {"L$0", "L$1", "L$2"})
    static final class c<Response> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f107041n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f107042o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f107043p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f107044q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f107046s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f107044q = obj;
            this.f107046s |= Integer.MIN_VALUE;
            return a.this.e(null, null, this);
        }
    }

    public a(j0 stripeNetworkClient, l eventEmitter, wo0.b json, d logger) {
        s.k(stripeNetworkClient, "stripeNetworkClient");
        s.k(eventEmitter, "eventEmitter");
        s.k(json, "json");
        s.k(logger, "logger");
        this.stripeNetworkClient = stripeNetworkClient;
        this.eventEmitter = eventEmitter;
        this.json = json;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <Response> Object e(k0 k0Var, wn0.l<? super String, ? extends Response> lVar, Continuation<? super Response> continuation) throws Exception {
        c cVar;
        a aVar;
        Object objB;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f107046s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f107046s = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objA = cVar.f107044q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f107046s;
        if (i12 == 0) {
            t.b(objA);
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                this.logger.debug("Executing " + k0Var.getMethod().getCode() + " request to " + k0Var.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
                j0 j0Var = this.stripeNetworkClient;
                cVar.f107041n = this;
                cVar.f107042o = k0Var;
                cVar.f107043p = lVar;
                cVar.f107046s = 1;
                objA = j0Var.a(k0Var, cVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = this;
            } catch (Throwable th2) {
                th = th2;
                aVar = this;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (wn0.l) cVar.f107043p;
            k0Var = (k0) cVar.f107042o;
            aVar = (a) cVar.f107041n;
            try {
                t.b(objA);
            } catch (Throwable th3) {
                th = th3;
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th));
            }
        }
        objB = jn0.s.b((l0) objA);
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            throw new APIConnectionException("Failed to execute " + k0Var, thE);
        }
        l0<String> l0Var = (l0) objB;
        aVar.eventEmitter.a(l0Var);
        if (l0Var.getCode() == 202) {
            throw aVar.f(l0Var);
        }
        if (l0Var.getIsError()) {
            throw aVar.f(l0Var);
        }
        String strA = l0Var.a();
        if (strA != null) {
            return lVar.invoke(strA);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Exception f(l0<String> response) throws InvalidRequestException, PermissionException, RateLimitException, APIException, AuthenticationException {
        d0 requestId = response.getRequestId();
        String value = requestId != null ? requestId.getValue() : null;
        int code = response.getCode();
        StripeError stripeErrorB = new u30.b().a(e0.a(response));
        if (code != 202) {
            if (code == 429) {
                throw new RateLimitException(stripeErrorB, value, null, null, 12, null);
            }
            if (code != 400) {
                if (code == 401) {
                    throw new AuthenticationException(stripeErrorB, value);
                }
                if (code == 403) {
                    throw new PermissionException(stripeErrorB, value);
                }
                if (code != 404) {
                    throw new APIException(stripeErrorB, value, code, null, null, 24, null);
                }
            }
        }
        throw new InvalidRequestException(stripeErrorB, value, code, null, null, 24, null);
    }

    public final Object c(k0 k0Var, Continuation<? super h0> continuation) throws Exception {
        Object objE = e(k0Var, C2275a.f107038c, continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    public final <Response> Object d(k0 k0Var, ro0.d<Response> dVar, Continuation<? super Response> continuation) {
        return e(k0Var, new b(dVar), continuation);
    }
}
