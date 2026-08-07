package x70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import io0.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.g;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\fJ\u001b\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b)\u0010/¨\u00061"}, d2 = {"Lx70/b;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Lx70/c;", "Ljn0/h0;", "poppedScreenHandler", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "target", "n", "(Lx70/c;)V", "j", "()V", "h", "Lkotlin/Function0;", "action", "g", "(Lwn0/a;)V", "m", "o", "", "screens", "l", "(Ljava/util/List;)V", IntegerTokenConverter.CONVERTER_KEY, "k", DateTokenConverter.CONVERTER_KEY, "a", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lwn0/l;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTransitioning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "currentScreen", "", "()Z", "canGoBack", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<x70.c, h0> poppedScreenHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isTransitioning;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<List<x70.c>> backStack;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<x70.c> currentScreen;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lx70/c;", "it", "a", "(Ljava/util/List;)Lx70/c;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<List<? extends x70.c>, x70.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f122937c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x70.c invoke(List<? extends x70.c> it) {
            s.k(it, "it");
            return (x70.c) v.A0(it);
        }
    }

    /* JADX INFO: renamed from: x70.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.navigation.NavigationHandler$navigateWithDelay$1", f = "NavigationHandler.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class C2656b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122938n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f122939o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f122940p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2656b(wn0.a<h0> aVar, b bVar, Continuation<? super C2656b> continuation) {
            super(2, continuation);
            this.f122939o = aVar;
            this.f122940p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C2656b(this.f122939o, this.f122940p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f122938n;
            if (i11 == 0) {
                t.b(obj);
                io0.b.Companion companion = io0.b.INSTANCE;
                long jS = io0.d.s(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, e.MILLISECONDS);
                this.f122938n = 1;
                if (DelayKt.m506delayVtjQ1oo(jS, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.f122939o.invoke();
            this.f122940p.isTransitioning.set(false);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C2656b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<h0> {
        c() {
            super(0);
        }

        public final void b() throws IOException {
            b.this.j();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() throws IOException {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x70.c f122943d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x70.c cVar) {
            super(0);
            this.f122943d = cVar;
        }

        public final void b() {
            b.this.n(this.f122943d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CoroutineScope coroutineScope, l<? super x70.c, h0> poppedScreenHandler) {
        s.k(coroutineScope, "coroutineScope");
        s.k(poppedScreenHandler, "poppedScreenHandler");
        this.coroutineScope = coroutineScope;
        this.poppedScreenHandler = poppedScreenHandler;
        this.isTransitioning = new AtomicBoolean(false);
        MutableStateFlow<List<x70.c>> MutableStateFlow = StateFlowKt.MutableStateFlow(v.e(x70.c.g.f122991a));
        this.backStack = MutableStateFlow;
        this.currentScreen = g.m(MutableStateFlow, a.f122937c);
    }

    private final void g(wn0.a<h0> action) {
        if (this.isTransitioning.getAndSet(true)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C2656b(action, this, null), 3, null);
    }

    private final void h(x70.c cVar) throws IOException {
        if (cVar instanceof Closeable) {
            ((Closeable) cVar).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() throws IOException {
        List<x70.c> value;
        List listP1;
        MutableStateFlow<List<x70.c>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            listP1 = v.p1(value);
            x70.c cVar = (x70.c) v.O(listP1);
            h(cVar);
            this.poppedScreenHandler.invoke(cVar);
        } while (!mutableStateFlow.compareAndSet(value, v.m1(listP1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(x70.c target) {
        List<x70.c> value;
        MutableStateFlow<List<x70.c>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, v.Q0(v.M0(value, x70.c.g.f122991a), target)));
    }

    public final void d() {
        Iterator<T> it = this.backStack.getValue().iterator();
        while (it.hasNext()) {
            h((x70.c) it.next());
        }
    }

    public final boolean e() {
        return this.backStack.getValue().size() > 1;
    }

    public final StateFlow<x70.c> f() {
        return this.currentScreen;
    }

    public final void i() {
        if (this.isTransitioning.get()) {
            return;
        }
        j();
    }

    public final void k() {
        g(new c());
    }

    public final void l(List<? extends x70.c> screens) {
        s.k(screens, "screens");
        if (this.isTransitioning.get()) {
            return;
        }
        List<x70.c> value = this.backStack.getValue();
        this.backStack.setValue(screens);
        for (x70.c cVar : value) {
            if (!screens.contains(cVar)) {
                h(cVar);
            }
        }
    }

    public final void m(x70.c target) {
        s.k(target, "target");
        if (this.isTransitioning.get()) {
            return;
        }
        n(target);
    }

    public final void o(x70.c target) {
        s.k(target, "target");
        g(new d(target));
    }
}
