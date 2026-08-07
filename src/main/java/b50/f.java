package b50;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.ManualEntryMode;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import ezvcard.property.Gender;
import j40.FinancialConnectionsEvent;
import java.io.IOException;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import n40.b0;
import n40.p0;
import n40.s0;
import n40.x1;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import q50.TopAppBarStateUpdate;
import t50.z;
import wn0.p;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002NOBS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010\"J\r\u0010%\u001a\u00020\u0016¢\u0006\u0004\b%\u0010\u0018J\r\u0010&\u001a\u00020\u0016¢\u0006\u0004\b&\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R/\u0010<\u001a\u0004\u0018\u00010\u001f2\b\u00106\u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\"R/\u0010@\u001a\u0004\u0018\u00010\u001f2\b\u00106\u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010\"R/\u0010D\u001a\u0004\u0018\u00010\u001f2\b\u00106\u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bA\u00108\u001a\u0004\bB\u0010:\"\u0004\bC\u0010\"R\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020F0E8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bA\u0010IR\u0011\u0010K\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bG\u0010:R\u0011\u0010L\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b7\u0010:R\u0011\u0010M\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b=\u0010:¨\u0006P"}, d2 = {"Lb50/f;", "Ls50/i;", "Lb50/e;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Ln40/s0;", "pollAttachPaymentAccount", "Lt50/z;", "successContentRepository", "Ln40/x1;", "updateCachedAccounts", "Lj40/f;", "eventTracker", "Ln40/b0;", "getOrFetchSync", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "<init>", "(Lb50/e;Ln40/p0;Ln40/s0;Lt50/z;Ln40/x1;Lj40/f;Ln40/b0;Lo50/f;Lo30/d;)V", "Ljn0/h0;", "K", "()V", "B", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "Lq50/c;", "T", "(Lb50/e;)Lq50/c;", "", "input", Gender.NONE, "(Ljava/lang/String;)V", Gender.MALE, "L", Gender.OTHER, "P", "v", "Ln40/p0;", "w", "Ln40/s0;", "x", "Lt50/z;", "y", "Ln40/x1;", "z", "Lj40/f;", "A", "Ln40/b0;", "Lo50/f;", "C", "Lo30/d;", "<set-?>", "D", "Lr2/p1;", "J", "()Ljava/lang/String;", "S", "_routing", "E", "H", "Q", "_account", Gender.FEMALE, "I", "R", "_accountConfirm", "Lkotlinx/coroutines/flow/StateFlow;", "Lb50/c;", "G", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "form", "routing", "account", "accountConfirm", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f extends s50.i<ManualEntryState> {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int I = 8;
    private static final FinancialConnectionsSessionManifest.Pane J = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final p1 _routing;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final p1 _account;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final p1 _accountConfirm;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final StateFlow<c> form;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0 nativeAuthFlowCoordinator;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final s0 pollAttachPaymentAccount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final z successContentRepository;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final x1 updateCachedAccounts;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb50/e$a;", "<anonymous>", "()Lb50/e$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$1", f = "ManualEntryViewModel.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super ManualEntryState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16640n;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return f.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f16640n;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = f.this.getOrFetchSync;
                this.f16640n = 1;
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
            if (manifest == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            f.this.eventTracker.a(new FinancialConnectionsEvent.w(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY));
            return new ManualEntryState.Payload(manifest.getManualEntryUsesMicrodeposits(), manifest.getManualEntryMode() == ManualEntryMode.CUSTOM, !manifest.getLivemode());
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super ManualEntryState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb50/e;", "Ls50/a;", "Lb50/e$a;", "it", "a", "(Lb50/e;Ls50/a;)Lb50/e;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<ManualEntryState, s50.a<? extends ManualEntryState.Payload>, ManualEntryState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f16642c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ManualEntryState invoke(ManualEntryState execute, s50.a<ManualEntryState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return ManualEntryState.b(execute, it, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: b50.f$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lb50/f$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: b50.f$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lb50/f;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lb50/f;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<CreationExtras, f> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f16643c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f16643c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f16643c.k().a(new ManualEntryState(null, null, 3, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(f.class), new a(parentComponent));
            return bVar.b();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb50/f$d;", "", "Lb50/e;", "initialState", "Lb50/f;", "a", "(Lb50/e;)Lb50/f;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        f a(ManualEntryState initialState);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel", f = "ManualEntryViewModel.kt", i = {}, l = {172}, m = "clearCachedAccounts", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f16644n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f16646p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16644n = obj;
            this.f16646p |= Integer.MIN_VALUE;
            return f.this.B(this);
        }
    }

    /* JADX INFO: renamed from: b50.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class C0326f extends u implements wn0.a<String> {
        C0326f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return f.this.J();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.a<String> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return f.this.H();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.a<String> {
        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return f.this.I();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class i extends p013kotlin.jvm.internal.a implements r<String, String, String, Continuation<? super c>, Object>, SuspendFunction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f16650a = new i();

        i() {
            super(4, c.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 4);
        }

        @Override // wn0.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, String str2, String str3, Continuation<? super c> continuation) {
            return f.C(str, str2, str3, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb50/e$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "<anonymous>", "(Lb50/e$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeAsyncs$2", f = "ManualEntryViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements p<ManualEntryState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16652n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f16653o;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ManualEntryState.Payload payload, Continuation<? super h0> continuation) {
            return ((k) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            k kVar = f.this.new k(continuation);
            kVar.f16653o = obj;
            return kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f16652n;
            if (i11 == 0) {
                t.b(obj);
                if (((ManualEntryState.Payload) this.f16653o).getCustomManualEntry()) {
                    MutableSharedFlow<p0.a> mutableSharedFlowA = f.this.nativeAuthFlowCoordinator.a();
                    p0.a.Complete complete = new p0.a.Complete(p0.a.Complete.EnumC1988a.USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY);
                    this.f16652n = 1;
                    if (mutableSharedFlowA.emit(complete, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$observeAsyncs$4", f = "ManualEntryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16656n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f16657o;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            m mVar = f.this.new m(continuation);
            mVar.f16657o = obj;
            return mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16656n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.h.b(f.this.eventTracker, "Error linking payment account", (Throwable) this.f16657o, f.this.logger, f.J);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((m) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$onSubmit$1", f = "ManualEntryViewModel.kt", i = {1, 2, 2}, l = {144, 145, 153}, m = "invokeSuspend", n = {BaseJavaModule.METHOD_TYPE_SYNC, BaseJavaModule.METHOD_TYPE_SYNC, "it"}, s = {"L$0", "L$0", "L$3"})
    static final class n extends SuspendLambda implements wn0.l<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f16659n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f16660o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f16661p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f16662q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f16663r;

        n(Continuation<? super n> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return f.this.new n(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0087  */
        /* JADX WARN: Code duplicated, block: B:25:0x0093  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SynchronizeSessionResponse synchronizeSessionResponse;
            f fVar;
            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount;
            Object obj2;
            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount2;
            FinancialConnectionsSessionManifest.Pane nextPane;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f16663r;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = f.this.getOrFetchSync;
                this.f16663r = 1;
                obj = b0.b(b0Var, null, this, 1, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                t.b(obj);
            } else {
                if (i11 == 2) {
                    SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) this.f16659n;
                    t.b(obj);
                    synchronizeSessionResponse = synchronizeSessionResponse2;
                    fVar = f.this;
                    linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) obj;
                    this.f16659n = synchronizeSessionResponse;
                    this.f16660o = obj;
                    this.f16661p = fVar;
                    this.f16662q = linkAccountSessionPaymentAccount;
                    this.f16663r = 3;
                    if (fVar.B(this) != coroutine_suspended) {
                        obj2 = obj;
                        linkAccountSessionPaymentAccount2 = linkAccountSessionPaymentAccount;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkAccountSessionPaymentAccount2 = (LinkAccountSessionPaymentAccount) this.f16662q;
                fVar = (f) this.f16661p;
                obj2 = this.f16660o;
                synchronizeSessionResponse = (SynchronizeSessionResponse) this.f16659n;
                t.b(obj);
            }
            if (synchronizeSessionResponse.getManifest().getManualEntryUsesMicrodeposits()) {
                z.f(fVar.successContentRepository, new v50.g.StringId(i40.k.f75861f0, v.e(p013kotlin.text.t.U1(fVar.D(), 4))), null, 2, null);
            }
            nextPane = linkAccountSessionPaymentAccount2.getNextPane();
            if (nextPane == null) {
                nextPane = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS;
            }
            o50.f.a.a(fVar.navigationManager, o50.b.k(o50.d.a(nextPane), f.J, null, 2, null), null, false, 6, null);
            return obj2;
            SynchronizeSessionResponse synchronizeSessionResponse3 = (SynchronizeSessionResponse) obj;
            s0 s0Var = f.this.pollAttachPaymentAccount;
            m50.c.BankAccount bankAccount = new m50.c.BankAccount(f.this.G(), f.this.D());
            this.f16659n = synchronizeSessionResponse3;
            this.f16663r = 2;
            Object objF = s0Var.f(synchronizeSessionResponse3, null, bankAccount, this);
            if (objF != coroutine_suspended) {
                synchronizeSessionResponse = synchronizeSessionResponse3;
                obj = objF;
                fVar = f.this;
                linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) obj;
                this.f16659n = synchronizeSessionResponse;
                this.f16660o = obj;
                this.f16661p = fVar;
                this.f16662q = linkAccountSessionPaymentAccount;
                this.f16663r = 3;
                if (fVar.B(this) != coroutine_suspended) {
                    obj2 = obj;
                    linkAccountSessionPaymentAccount2 = linkAccountSessionPaymentAccount;
                    if (synchronizeSessionResponse.getManifest().getManualEntryUsesMicrodeposits()) {
                        z.f(fVar.successContentRepository, new v50.g.StringId(i40.k.f75861f0, v.e(p013kotlin.text.t.U1(fVar.D(), 4))), null, 2, null);
                    }
                    nextPane = linkAccountSessionPaymentAccount2.getNextPane();
                    if (nextPane == null) {
                        nextPane = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS;
                    }
                    o50.f.a.a(fVar.navigationManager, o50.b.k(o50.d.a(nextPane), f.J, null, 2, null), null, false, 6, null);
                    return obj2;
                }
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
            return ((n) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb50/e;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "it", "a", "(Lb50/e;Ls50/a;)Lb50/e;"}, k = 3, mv = {1, 9, 0})
    static final class o extends u implements p<ManualEntryState, s50.a<? extends LinkAccountSessionPaymentAccount>, ManualEntryState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f16665c = new o();

        o() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ManualEntryState invoke(ManualEntryState execute, s50.a<LinkAccountSessionPaymentAccount> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return ManualEntryState.b(execute, null, it, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ManualEntryState initialState, p0 nativeAuthFlowCoordinator, s0 pollAttachPaymentAccount, z successContentRepository, x1 updateCachedAccounts, j40.f eventTracker, b0 getOrFetchSync, o50.f navigationManager, o30.d logger) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(pollAttachPaymentAccount, "pollAttachPaymentAccount");
        s.k(successContentRepository, "successContentRepository");
        s.k(updateCachedAccounts, "updateCachedAccounts");
        s.k(eventTracker, "eventTracker");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(navigationManager, "navigationManager");
        s.k(logger, "logger");
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.successContentRepository = successContentRepository;
        this.updateCachedAccounts = updateCachedAccounts;
        this.eventTracker = eventTracker;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.logger = logger;
        this._routing = s3.d(null, null, 2, null);
        this._account = s3.d(null, null, 2, null);
        this._accountConfirm = s3.d(null, null, 2, null);
        this.form = FlowKt.stateIn(FlowKt.combine(n3.p(new C0326f()), n3.p(new g()), n3.p(new h()), i.f16650a), d1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, 0L, 2, null), new c(null, null, null));
        K();
        s50.i.g(this, new a(null), null, b.f16642c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(Continuation<? super h0> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f16646p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f16646p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f16644n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f16646p;
        try {
            if (i12 == 0) {
                t.b(obj);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                x1 x1Var = this.updateCachedAccounts;
                List<PartnerAccount> listM = v.m();
                eVar.f16646p = 1;
                if (x1Var.a(listM, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            jn0.s.b(h0.f84049a);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            jn0.s.b(t.a(th2));
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object C(String str, String str2, String str3, Continuation continuation) {
        return new c(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String H() {
        return (String) this._account.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String I() {
        return (String) this._accountConfirm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String J() {
        return (String) this._routing.getValue();
    }

    private final void K() {
        s50.i.j(this, new f0() { // from class: b50.f.j
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((ManualEntryState) obj).d();
            }
        }, new k(null), null, 4, null);
        s50.i.j(this, new f0() { // from class: b50.f.l
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((ManualEntryState) obj).c();
            }
        }, null, new m(null), 2, null);
    }

    private final void Q(String str) {
        this._account.setValue(str);
    }

    private final void R(String str) {
        this._accountConfirm.setValue(str);
    }

    private final void S(String str) {
        this._routing.setValue(str);
    }

    public final String D() {
        String strH = H();
        return strH == null ? "" : strH;
    }

    public final String E() {
        String strI = I();
        return strI == null ? "" : strI;
    }

    public final StateFlow<c> F() {
        return this.form;
    }

    public final String G() {
        String strJ = J();
        return strJ == null ? "" : strJ;
    }

    public final void L(String input) throws IOException {
        s.k(input, "input");
        StringBuilder sb2 = new StringBuilder();
        int length = input.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = input.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        R(string);
    }

    public final void M(String input) throws IOException {
        s.k(input, "input");
        StringBuilder sb2 = new StringBuilder();
        int length = input.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = input.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        Q(string);
    }

    public final void N(String input) throws IOException {
        s.k(input, "input");
        StringBuilder sb2 = new StringBuilder();
        int length = input.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = input.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        S(string);
    }

    public final void O() {
        s50.i.g(this, new n(null), null, o.f16665c, 1, null);
    }

    public final void P() {
        S("110000000");
        Q("000123456789");
        R("000123456789");
        O();
    }

    @Override // s50.i
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(ManualEntryState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(J, true, z50.n.a(state.d()), null, false, 24, null);
    }
}
