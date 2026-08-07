package p40;

import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import h50.NoticeSheetState;
import j40.h;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m40.p;
import n40.p0;
import n40.z1;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import s50.i;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0014J\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010#\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lp40/c;", "Ls50/i;", "Lp40/b;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lt50/a;", "updateRequiredContentRepository", "Lo50/f;", "navigationManager", "Lj40/f;", "eventTracker", "Ln40/z1;", "updateLocalManifest", "Lo30/d;", "logger", "<init>", "(Lp40/b;Ln40/p0;Lt50/a;Lo50/f;Lj40/f;Ln40/z1;Lo30/d;)V", "Ljn0/h0;", "u", "()V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "referrer", "t", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "Lcom/stripe/android/financialconnections/model/q;", "institution", "v", "(Lcom/stripe/android/financialconnections/model/q;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "state", "Lq50/c;", "w", "(Lp40/b;)Lq50/c;", "s", "r", "onCleared", "Lt50/a;", "Lo50/f;", "x", "Lj40/f;", "y", "Ln40/z1;", "z", "Lo30/d;", "A", "a", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends i<AccountUpdateRequiredState> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int B = 8;
    private static final FinancialConnectionsSessionManifest.Pane C = FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final t50.a updateRequiredContentRepository;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final z1 updateLocalManifest;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: p40.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lp40/c$a;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;Landroid/os/Bundle;)Landroidx/lifecycle/ViewModelProvider$Factory;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: p40.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lp40/c;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lp40/c;"}, k = 3, mv = {1, 9, 0})
        static final class C2140a extends u implements l<CreationExtras, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f101085c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f101086d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2140a(p pVar, Bundle bundle) {
                super(1);
                this.f101085c = pVar;
                this.f101086d = bundle;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f101085c.r().a(new AccountUpdateRequiredState(this.f101086d));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(p parentComponent, Bundle arguments) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(c.class), new C2140a(parentComponent, arguments));
            return bVar.b();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp40/c$b;", "", "Lp40/b;", "initialState", "Lp40/c;", "a", "(Lp40/b;)Lp40/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        c a(AccountUpdateRequiredState initialState);
    }

    /* JADX INFO: renamed from: p40.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$handleContinue$1", f = "AccountUpdateRequiredViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2141c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f101087n;

        C2141c(Continuation<? super C2141c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new C2141c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f101087n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AccountUpdateRequiredState value = c.this.h().getValue();
            FinancialConnectionsSessionManifest.Pane referrer = value.getReferrer();
            NoticeSheetState.a.UpdateRequired updateRequiredA = value.c().a();
            NoticeSheetState.a.UpdateRequired.InterfaceC1471b type = updateRequiredA != null ? updateRequiredA.getType() : null;
            if (type == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (type instanceof NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Repair) {
                c.this.t(referrer);
            } else if (type instanceof NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Supportability) {
                c.this.v(((NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Supportability) type).getInstitution(), referrer);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C2141c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh50/b$a$d;", "<anonymous>", "()Lh50/b$a$d;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$loadContent$1", f = "AccountUpdateRequiredViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements l<Continuation<? super NoticeSheetState.a.UpdateRequired>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f101089n;

        d(Continuation<? super d> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f101089n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            t50.a.State stateB = c.this.updateRequiredContentRepository.b();
            NoticeSheetState.a.UpdateRequired payload = stateB != null ? stateB.getPayload() : null;
            if (payload != null) {
                return payload;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super NoticeSheetState.a.UpdateRequired> continuation) {
            return ((d) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp40/b;", "Ls50/a;", "Lh50/b$a$d;", "it", "a", "(Lp40/b;Ls50/a;)Lp40/b;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.p<AccountUpdateRequiredState, s50.a<? extends NoticeSheetState.a.UpdateRequired>, AccountUpdateRequiredState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f101091c = new e();

        e() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountUpdateRequiredState invoke(AccountUpdateRequiredState execute, s50.a<NoticeSheetState.a.UpdateRequired> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return AccountUpdateRequiredState.b(execute, null, it, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "it", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements l<FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsInstitution f101092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(FinancialConnectionsInstitution financialConnectionsInstitution) {
            super(1);
            this.f101092c = financialConnectionsInstitution;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSessionManifest invoke(FinancialConnectionsSessionManifest it) {
            s.k(it, "it");
            return it.b(((-4194305) & 1) != 0 ? it.allowManualEntry : false, ((-4194305) & 2) != 0 ? it.consentRequired : false, ((-4194305) & 4) != 0 ? it.customManualEntryHandling : false, ((-4194305) & 8) != 0 ? it.disableLinkMoreAccounts : false, ((-4194305) & 16) != 0 ? it.id : null, ((-4194305) & 32) != 0 ? it.instantVerificationDisabled : false, ((-4194305) & 64) != 0 ? it.institutionSearchDisabled : false, ((-4194305) & 128) != 0 ? it.livemode : false, ((-4194305) & 256) != 0 ? it.manualEntryUsesMicrodeposits : false, ((-4194305) & 512) != 0 ? it.mobileHandoffEnabled : false, ((-4194305) & 1024) != 0 ? it.nextPane : null, ((-4194305) & 2048) != 0 ? it.manualEntryMode : null, ((-4194305) & 4096) != 0 ? it.permissions : null, ((-4194305) & PKIFailureInfo.certRevoked) != 0 ? it.product : null, ((-4194305) & 16384) != 0 ? it.singleAccount : false, ((-4194305) & 32768) != 0 ? it.useSingleSortSearch : false, ((-4194305) & 65536) != 0 ? it.accountDisconnectionMethod : null, ((-4194305) & 131072) != 0 ? it.accountholderCustomerEmailAddress : null, ((-4194305) & 262144) != 0 ? it.accountholderIsLinkConsumer : null, ((-4194305) & PKIFailureInfo.signerNotTrusted) != 0 ? it.accountholderPhoneNumber : null, ((-4194305) & PKIFailureInfo.badCertTemplate) != 0 ? it.accountholderToken : null, ((-4194305) & PKIFailureInfo.badSenderNonce) != 0 ? it.activeAuthSession : null, ((-4194305) & 4194304) != 0 ? it.activeInstitution : this.f101092c, ((-4194305) & 8388608) != 0 ? it.assignmentEventId : null, ((-4194305) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? it.businessName : null, ((-4194305) & 33554432) != 0 ? it.cancelUrl : null, ((-4194305) & 67108864) != 0 ? it.connectPlatformName : null, ((-4194305) & 134217728) != 0 ? it.connectedAccountName : null, ((-4194305) & 268435456) != 0 ? it.experimentAssignments : null, ((-4194305) & PKIFailureInfo.duplicateCertReq) != 0 ? it.displayText : null, ((-4194305) & 1073741824) != 0 ? it.features : null, ((-4194305) & Integer.MIN_VALUE) != 0 ? it.hostedAuthUrl : null, (4095 & 1) != 0 ? it.initialInstitution : null, (4095 & 2) != 0 ? it.isEndUserFacing : null, (4095 & 4) != 0 ? it.isLinkWithStripe : null, (4095 & 8) != 0 ? it.isNetworkingUserFlow : null, (4095 & 16) != 0 ? it.isStripeDirect : null, (4095 & 32) != 0 ? it.linkAccountSessionCancellationBehavior : null, (4095 & 64) != 0 ? it.modalCustomization : null, (4095 & 128) != 0 ? it.paymentMethodType : null, (4095 & 256) != 0 ? it.stepUpAuthenticationRequired : null, (4095 & 512) != 0 ? it.successUrl : null, (4095 & 1024) != 0 ? it.skipSuccessPane : null, (4095 & 2048) != 0 ? it.theme : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountUpdateRequiredState initialState, p0 nativeAuthFlowCoordinator, t50.a updateRequiredContentRepository, o50.f navigationManager, j40.f eventTracker, z1 updateLocalManifest, o30.d logger) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(updateRequiredContentRepository, "updateRequiredContentRepository");
        s.k(navigationManager, "navigationManager");
        s.k(eventTracker, "eventTracker");
        s.k(updateLocalManifest, "updateLocalManifest");
        s.k(logger, "logger");
        this.updateRequiredContentRepository = updateRequiredContentRepository;
        this.navigationManager = navigationManager;
        this.eventTracker = eventTracker;
        this.updateLocalManifest = updateLocalManifest;
        this.logger = logger;
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(FinancialConnectionsSessionManifest.Pane referrer) {
        h.b(this.eventTracker, "Updating a repair account, but repairs are not supported in Mobile.", new UnclassifiedError("UpdateRepairAccountError", null, 2, null), this.logger, C);
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.l.f96750i, referrer, null, 2, null), null, false, 6, null);
    }

    private final void u() {
        i.g(this, new d(null), null, e.f101091c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(FinancialConnectionsInstitution institution, FinancialConnectionsSessionManifest.Pane referrer) {
        if (institution == null) {
            o50.f.a.a(this.navigationManager, o50.b.k(o50.b.l.f96750i, referrer, null, 2, null), null, false, 6, null);
        } else {
            this.updateLocalManifest.a(new f(institution));
            o50.f.a.a(this.navigationManager, o50.b.k(o50.b.v.f96761i, referrer, null, 2, null), null, false, 6, null);
        }
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        this.updateRequiredContentRepository.a();
        super.onCleared();
    }

    public final void r() {
        this.navigationManager.c();
    }

    public final void s() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new C2141c(null), 3, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(AccountUpdateRequiredState state) {
        s.k(state, "state");
        return null;
    }
}
