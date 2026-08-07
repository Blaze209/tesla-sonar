package c60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.PaymentMethodCreateParams;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import m60.m;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lc60/j;", "Lc60/d;", "Lf60/b$a;", "linkComponentBuilder", "<init>", "(Lf60/b$a;)V", "Lc60/c;", "configuration", "Lf60/b;", "g", "(Lc60/c;)Lf60/b;", "f", "Lkotlinx/coroutines/flow/Flow;", "Lg60/a;", "c", "(Lc60/c;)Lkotlinx/coroutines/flow/Flow;", "Lm60/m;", "userInput", "Ljn0/s;", "", "a", "(Lc60/c;Lm60/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lc60/e;", "b", "(Lc60/c;Lcom/stripe/android/model/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/t;", "e", "(Lc60/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf60/b$a;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "componentFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/StateFlow;", DateTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/StateFlow;", "emailFlow", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements c60.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f60.b.a linkComponentBuilder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<f60.b> componentFlow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> emailFlow;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.RealLinkConfigurationCoordinator", f = "LinkConfigurationCoordinator.kt", i = {}, l = {92}, m = "attachNewCardToAccount-0E7RQCE", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f18832n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18834p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18832n = obj;
            this.f18834p |= Integer.MIN_VALUE;
            Object objB = j.this.b(null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf60/b;", "it", "Lkotlinx/coroutines/flow/StateFlow;", "Lg60/b;", "a", "(Lf60/b;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<f60.b, StateFlow<? extends g60.b>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f18835c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<g60.b> invoke(f60.b bVar) {
            d60.c cVarC;
            StateFlow<g60.b> stateFlowD;
            return (bVar == null || (cVarC = bVar.c()) == null || (stateFlowD = cVarC.d()) == null) ? r90.g.n(null) : stateFlowD;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg60/b;", "it", "", "a", "(Lg60/b;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<g60.b, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f18836c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(g60.b bVar) {
            if (bVar != null) {
                return bVar.getEmail();
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.RealLinkConfigurationCoordinator", f = "LinkConfigurationCoordinator.kt", i = {}, l = {99}, m = "logOut-gIAlu-s", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f18837n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18839p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18837n = obj;
            this.f18839p |= Integer.MIN_VALUE;
            Object objE = j.this.e(null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : s.a(objE);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.RealLinkConfigurationCoordinator", f = "LinkConfigurationCoordinator.kt", i = {}, l = {77}, m = "signInWithUserInput-0E7RQCE", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f18840n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18842p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18840n = obj;
            this.f18842p |= Integer.MIN_VALUE;
            Object objA = j.this.a(null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    public j(f60.b.a linkComponentBuilder) {
        p013kotlin.jvm.internal.s.k(linkComponentBuilder, "linkComponentBuilder");
        this.linkComponentBuilder = linkComponentBuilder;
        MutableStateFlow<f60.b> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.componentFlow = MutableStateFlow;
        this.emailFlow = r90.g.m(r90.g.l(MutableStateFlow, b.f18835c), c.f18836c);
    }

    private final f60.b g(LinkConfiguration configuration) {
        f60.b value = this.componentFlow.getValue();
        if (value != null) {
            if (!p013kotlin.jvm.internal.s.f(value.a(), configuration)) {
                value = null;
            }
            if (value != null) {
                return value;
            }
        }
        f60.b bVarBuild = this.linkComponentBuilder.a(configuration).build();
        this.componentFlow.setValue(bVarBuild);
        return bVarBuild;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c60.d
    public Object a(LinkConfiguration linkConfiguration, m mVar, Continuation<? super s<Boolean>> continuation) {
        e eVar;
        Object objE;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f18842p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f18842p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f18840n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f18842p;
        if (i12 == 0) {
            t.b(obj);
            d60.c cVarC = g(linkConfiguration).c();
            eVar.f18842p = 1;
            objE = cVarC.e(mVar, eVar);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objE = ((s) obj).getValue();
        }
        if (!s.h(objE)) {
            return s.b(objE);
        }
        return s.b(Boxing.boxBoolean(true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c60.d
    public Object b(LinkConfiguration linkConfiguration, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super s<? extends c60.e>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f18834p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f18834p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f18832n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f18834p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        d60.c cVarC = g(linkConfiguration).c();
        aVar.f18834p = 1;
        Object objC = cVarC.c(paymentMethodCreateParams, aVar);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    @Override // c60.d
    public Flow<g60.a> c(LinkConfiguration configuration) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        return g(configuration).c().f();
    }

    @Override // c60.d
    public StateFlow<String> d() {
        return this.emailFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c60.d
    public Object e(LinkConfiguration linkConfiguration, Continuation<? super s<ConsumerSession>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f18839p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f18839p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f18837n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f18839p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        d60.c cVarC = g(linkConfiguration).c();
        dVar.f18839p = 1;
        Object objA = cVarC.a(dVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    @Override // c60.d
    public f60.b f(LinkConfiguration configuration) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        return g(configuration);
    }
}
