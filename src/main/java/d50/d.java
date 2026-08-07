package d50;

import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import j40.FinancialConnectionsEvent;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import n40.b0;
import n40.d0;
import n40.o;
import n40.p0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006("}, d2 = {"Ld50/d;", "Ls50/i;", "Ld50/c;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lj40/f;", "eventTracker", "Ln40/d0;", "handleError", "Ln40/b0;", "getOrFetchSync", "Ln40/o;", "disableNetworking", "Lo50/f;", "navigationManager", "<init>", "(Ld50/c;Ln40/p0;Lj40/f;Ln40/d0;Ln40/b0;Ln40/o;Lo50/f;)V", "Ljn0/h0;", "w", "()V", "z", "Lo50/i;", "v", "()Lo50/i;", "state", "Lq50/c;", "A", "(Ld50/c;)Lq50/c;", "Lkotlinx/coroutines/Job;", "x", "()Lkotlinx/coroutines/Job;", "y", "Lj40/f;", "Ln40/d0;", "Ln40/b0;", "Ln40/o;", "Lo50/f;", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends s50.i<NetworkingLinkLoginWarmupState> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FinancialConnectionsSessionManifest.Pane B = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final d0 handleError;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final o disableNetworking;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld50/c$a;", "<anonymous>", "()Ld50/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$1", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements l<Continuation<? super NetworkingLinkLoginWarmupState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59597n;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f59597n;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = d.this.getOrFetchSync;
                this.f59597n = 1;
                obj = b0.b(b0Var, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) obj).getManifest();
            d.this.eventTracker.a(new FinancialConnectionsEvent.w(d.INSTANCE.b()));
            String strC = p022s40.k.c(manifest);
            String strE = p022s40.k.e(manifest);
            if (strE != null) {
                return new NetworkingLinkLoginWarmupState.Payload(strC, strE);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super NetworkingLinkLoginWarmupState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld50/c;", "Ls50/a;", "Ld50/c$a;", "it", "a", "(Ld50/c;Ls50/a;)Ld50/c;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<NetworkingLinkLoginWarmupState, s50.a<? extends NetworkingLinkLoginWarmupState.Payload>, NetworkingLinkLoginWarmupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f59599c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkLoginWarmupState invoke(NetworkingLinkLoginWarmupState execute, s50.a<NetworkingLinkLoginWarmupState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return NetworkingLinkLoginWarmupState.b(execute, null, null, it, null, false, 27, null);
        }
    }

    /* JADX INFO: renamed from: d50.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ld50/d$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;Landroid/os/Bundle;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: d50.d$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Ld50/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Ld50/d;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f59600c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f59601d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar, Bundle bundle) {
                super(1);
                this.f59600c = pVar;
                this.f59601d = bundle;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f59600c.d().a(new NetworkingLinkLoginWarmupState(this.f59601d, this.f59600c.a().h().getValue()));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent, Bundle arguments) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(d.class), new a(parentComponent, arguments));
            return bVar.b();
        }

        public final FinancialConnectionsSessionManifest.Pane b() {
            return d.B;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d50.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld50/d$d;", "", "Ld50/c;", "initialState", "Ld50/d;", "a", "(Ld50/c;)Ld50/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC1217d {
        d a(NetworkingLinkLoginWarmupState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$2", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59603n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f59604o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = d.this.new f(continuation);
            fVar.f59604o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f59603n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.handleError.a("Error fetching payload", (Throwable) this.f59604o, d.INSTANCE.b(), true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((f) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$logErrors$4", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59607n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f59608o;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = d.this.new h(continuation);
            hVar.f59608o = obj;
            return hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f59607n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.handleError.a("Error disabling networking", (Throwable) this.f59608o, d.INSTANCE.b(), true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((h) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$onContinueClick$1", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59610n;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new i(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f59610n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.f fVar = d.this.eventTracker;
            Companion companion = d.INSTANCE;
            fVar.a(new FinancialConnectionsEvent.h("click.continue", companion.b()));
            o50.f.a.a(d.this.navigationManager, o50.b.k(o50.b.s.f96758i, companion.b(), null, 2, null), null, false, 6, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel$skipNetworking$1", f = "NetworkingLinkLoginWarmupViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements l<Continuation<? super FinancialConnectionsSessionManifest>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59612n;

        j(Continuation<? super j> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f59612n;
            if (i11 == 0) {
                t.b(obj);
                d.this.eventTracker.a(new FinancialConnectionsEvent.h("click.skip_sign_in", d.INSTANCE.b()));
                o oVar = d.this.disableNetworking;
                String nextPaneOnDisableNetworking = d.this.h().getValue().getNextPaneOnDisableNetworking();
                this.f59612n = 1;
                obj = oVar.a(nextPaneOnDisableNetworking, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            d dVar = d.this;
            o50.f.a.a(dVar.navigationManager, o50.b.k(o50.d.a(((FinancialConnectionsSessionManifest) obj).getNextPane()), d.INSTANCE.b(), null, 2, null), dVar.v(), false, 4, null);
            return obj;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((j) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld50/c;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "it", "a", "(Ld50/c;Ls50/a;)Ld50/c;"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements p<NetworkingLinkLoginWarmupState, s50.a<? extends FinancialConnectionsSessionManifest>, NetworkingLinkLoginWarmupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f59614c = new k();

        k() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkLoginWarmupState invoke(NetworkingLinkLoginWarmupState execute, s50.a<FinancialConnectionsSessionManifest> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return NetworkingLinkLoginWarmupState.b(execute, null, null, null, it, false, 23, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NetworkingLinkLoginWarmupState initialState, p0 nativeAuthFlowCoordinator, j40.f eventTracker, d0 handleError, b0 getOrFetchSync, o disableNetworking, o50.f navigationManager) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(eventTracker, "eventTracker");
        s.k(handleError, "handleError");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(disableNetworking, "disableNetworking");
        s.k(navigationManager, "navigationManager");
        this.eventTracker = eventTracker;
        this.handleError = handleError;
        this.getOrFetchSync = getOrFetchSync;
        this.disableNetworking = disableNetworking;
        this.navigationManager = navigationManager;
        w();
        s50.i.g(this, new a(null), null, b.f59599c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o50.i v() {
        FinancialConnectionsSessionManifest.Pane referrer = h().getValue().getReferrer();
        return referrer != null ? new o50.i.Route(true, o50.d.a(referrer).g()) : new o50.i.Current(true);
    }

    private final void w() {
        s50.i.j(this, new f0() { // from class: d50.d.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingLinkLoginWarmupState) obj).e();
            }
        }, null, new f(null), 2, null);
        s50.i.j(this, new f0() { // from class: d50.d.g
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingLinkLoginWarmupState) obj).c();
            }
        }, null, new h(null), 2, null);
    }

    private final void z() {
        s50.i.g(this, new j(null), null, k.f59614c, 1, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(NetworkingLinkLoginWarmupState state) {
        s.k(state, "state");
        return null;
    }

    public final Job x() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new i(null), 3, null);
    }

    public final void y() {
        if (h().getValue().getIsInstantDebits()) {
            this.navigationManager.c();
        } else {
            z();
        }
    }
}
