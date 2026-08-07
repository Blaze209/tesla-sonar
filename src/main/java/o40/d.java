package o40;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.AccountPickerPane;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import ezvcard.property.Gender;
import h50.NoticeSheetState;
import j40.FinancialConnectionsEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import n40.CachedPartnerAccount;
import n40.b0;
import n40.n1;
import n40.p0;
import n40.r1;
import n40.u0;
import n40.z;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import q50.TopAppBarStateUpdate;
import t50.CachedConsumerSession;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002RSBk\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\u001eJ3\u0010(\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J-\u0010-\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010\u001eJ\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u001c2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u001c¢\u0006\u0004\b8\u0010\u001eJ\r\u00109\u001a\u00020\u001c¢\u0006\u0004\b9\u0010\u001eJ\r\u0010:\u001a\u00020\u001c¢\u0006\u0004\b:\u0010\u001eJ\r\u0010;\u001a\u00020\u001c¢\u0006\u0004\b;\u0010\u001eJ\u0015\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020#¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u001c¢\u0006\u0004\b@\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010OR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010PR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010Q¨\u0006T"}, d2 = {"Lo40/d;", "Ls50/i;", "Lo40/c;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lj40/f;", "eventTracker", "Lt50/f;", "consumerSessionProvider", "Ln40/n1;", "saveAccountToLink", "Ln40/r1;", "selectAccounts", "Ln40/b0;", "getOrFetchSync", "Lo50/f;", "navigationManager", "Lv50/d;", "handleClickableUrl", "Lo30/d;", "logger", "Ln40/u0;", "pollAuthorizationSessionAccounts", "Lh50/f;", "presentSheet", "<init>", "(Lo40/c;Ln40/p0;Lj40/f;Lt50/f;Ln40/n1;Ln40/r1;Ln40/b0;Lo50/f;Lv50/d;Lo30/d;Ln40/u0;Lh50/f;)V", "Ljn0/h0;", "D", "()V", "C", "K", Gender.FEMALE, "", "", "idsBefore", "idsAfter", "", "isSingleAccount", "E", "(Ljava/util/Set;Ljava/util/Set;Z)V", "selectedIds", "updateLocalCache", "isSkipAccountSelection", "P", "(Ljava/util/Set;ZZ)V", Gender.NONE, "state", "Lq50/c;", "Q", "(Lo40/c;)Lq50/c;", "Lcom/stripe/android/financialconnections/model/c0;", "account", "G", "(Lcom/stripe/android/financialconnections/model/c0;)V", "L", Gender.OTHER, "I", "J", "uri", "Lkotlinx/coroutines/Job;", "H", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", Gender.MALE, "v", "Lj40/f;", "w", "Lt50/f;", "x", "Ln40/n1;", "y", "Ln40/r1;", "z", "Ln40/b0;", "A", "Lo50/f;", "B", "Lv50/d;", "Lo30/d;", "Ln40/u0;", "Lh50/f;", "a", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends s50.i<AccountPickerState> {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int G = 8;
    private static final FinancialConnectionsSessionManifest.Pane H = FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final v50.d handleClickableUrl;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final u0 pollAuthorizationSessionAccounts;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final h50.f presentSheet;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final t50.f consumerSessionProvider;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final n1 saveAccountToLink;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final r1 selectAccounts;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: o40.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo40/d$a;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o40.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lo40/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lo40/d;"}, k = 3, mv = {1, 9, 0})
        static final class C2053a extends p013kotlin.jvm.internal.u implements wn0.l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f96609c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2053a(m40.p pVar) {
                super(1);
                this.f96609c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
                return this.f96609c.f().a(new AccountPickerState(null, null, false, null, null, null, 63, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            p013kotlin.jvm.internal.s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(d.class), new C2053a(parentComponent));
            return bVar.b();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo40/d$b;", "", "Lo40/c;", "initialState", "Lo40/d;", "a", "(Lo40/c;)Lo40/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        d a(AccountPickerState initialState);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo40/c$a;", "<anonymous>", "()Lo40/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1", f = "AccountPickerViewModel.kt", i = {0, 1, 1, 1, 1, 1}, l = {100, 105}, m = "invokeSuspend", n = {"state", BaseJavaModule.METHOD_TYPE_SYNC, "dataAccessNotice", "manifest", "activeAuthSession", "startTime$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "J$0"})
    static final class c extends SuspendLambda implements wn0.l<Continuation<? super AccountPickerState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f96610n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f96611o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f96612p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f96613q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f96614r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f96615s;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(Boolean.valueOf(!((PartnerAccount) t11).b()), Boolean.valueOf(!((PartnerAccount) t12).b()));
            }
        }

        c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new c(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:36:0x010b A[PHI: r1
          0x010b: PHI (r1v25 java.lang.Boolean) = (r1v12 java.lang.Boolean), (r1v13 java.lang.Boolean) binds: [B:35:0x0109, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x011f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0124  */
        /* JADX WARN: Code duplicated, block: B:53:0x0148  */
        /* JADX WARN: Code duplicated, block: B:56:0x0154  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            AccountPickerState value;
            Object objB;
            SynchronizeSessionResponse synchronizeSessionResponse;
            DataAccessNotice dataAccessNotice;
            FinancialConnectionsSessionManifest manifest;
            long jCurrentTimeMillis;
            Object objC;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            ConsentPane consent;
            PartnerAccountsList partnerAccountsList;
            long jLongValue;
            TextUpdate text;
            Boolean skipAccountSelection;
            boolean zBooleanValue;
            AccountPickerState.b bVar;
            boolean z11;
            AccountPickerPane accountPicker;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f96615s;
            String dataAccessNotice2 = null;
            if (i11 == 0) {
                jn0.t.b(obj);
                value = d.this.h().getValue();
                b0 b0Var = d.this.getOrFetchSync;
                this.f96610n = value;
                this.f96615s = 1;
                objB = b0.b(b0Var, null, this, 1, null);
                if (objB != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                value = (AccountPickerState) this.f96610n;
                jn0.t.b(obj);
                objB = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.f96614r;
                financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) this.f96613q;
                manifest = (FinancialConnectionsSessionManifest) this.f96612p;
                dataAccessNotice = (DataAccessNotice) this.f96611o;
                synchronizeSessionResponse = (SynchronizeSessionResponse) this.f96610n;
                jn0.t.b(obj);
                jCurrentTimeMillis = j11;
                objC = obj;
            }
            DataAccessNotice dataAccessNotice3 = dataAccessNotice;
            Pair pairA = x.a((PartnerAccountsList) objC, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
            partnerAccountsList = (PartnerAccountsList) pairA.a();
            jLongValue = ((Number) pairA.b()).longValue();
            if (!partnerAccountsList.b().isEmpty()) {
                d.this.eventTracker.a(new FinancialConnectionsEvent.x(d.H, financialConnectionsAuthorizationSession.getId(), jLongValue));
            }
            List listA1 = v.a1(partnerAccountsList.b(), new a());
            text = synchronizeSessionResponse.getText();
            if (text != null && (accountPicker = text.getAccountPicker()) != null) {
                dataAccessNotice2 = accountPicker.getDataAccessNotice();
            }
            String str = dataAccessNotice2;
            skipAccountSelection = partnerAccountsList.getSkipAccountSelection();
            if (skipAccountSelection != null && (skipAccountSelection = financialConnectionsAuthorizationSession.getSkipAccountSelection()) == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = skipAccountSelection.booleanValue();
            }
            if (manifest.getSingleAccount()) {
                bVar = AccountPickerState.b.Single;
            } else {
                bVar = AccountPickerState.b.Multiple;
            }
            AccountPickerState.b bVar2 = bVar;
            boolean singleAccount = manifest.getSingleAccount();
            if (!manifest.getSingleAccount() && p013kotlin.jvm.internal.s.f(financialConnectionsAuthorizationSession.getInstitutionSkipAccountSelection(), Boxing.boxBoolean(true)) && listA1.size() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            String businessName = manifest.getBusinessName();
            Boolean isStripeDirect = manifest.getIsStripeDirect();
            AccountPickerState.Payload payload = new AccountPickerState.Payload(zBooleanValue, listA1, str, dataAccessNotice3, bVar2, singleAccount, isStripeDirect != null ? isStripeDirect.booleanValue() : false, businessName, z11);
            d.this.eventTracker.a(new FinancialConnectionsEvent.w(d.H));
            return payload;
            synchronizeSessionResponse = (SynchronizeSessionResponse) objB;
            TextUpdate text2 = synchronizeSessionResponse.getText();
            dataAccessNotice = (text2 == null || (consent = text2.getConsent()) == null) ? null : consent.getDataAccessNotice();
            manifest = synchronizeSessionResponse.getManifest();
            FinancialConnectionsAuthorizationSession activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d dVar = d.this;
            jCurrentTimeMillis = System.currentTimeMillis();
            u0 u0Var = dVar.pollAuthorizationSessionAccounts;
            boolean canRetry = value.getCanRetry();
            this.f96610n = synchronizeSessionResponse;
            this.f96611o = dataAccessNotice;
            this.f96612p = manifest;
            this.f96613q = activeAuthSession;
            this.f96614r = jCurrentTimeMillis;
            this.f96615s = 2;
            objC = u0Var.c(canRetry, synchronizeSessionResponse, this);
            if (objC != coroutine_suspended) {
                financialConnectionsAuthorizationSession = activeAuthSession;
                DataAccessNotice dataAccessNotice4 = dataAccessNotice;
                Pair pairA2 = x.a((PartnerAccountsList) objC, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
                partnerAccountsList = (PartnerAccountsList) pairA2.a();
                jLongValue = ((Number) pairA2.b()).longValue();
                if (!partnerAccountsList.b().isEmpty()) {
                    d.this.eventTracker.a(new FinancialConnectionsEvent.x(d.H, financialConnectionsAuthorizationSession.getId(), jLongValue));
                }
                List listA2 = v.a1(partnerAccountsList.b(), new a());
                text = synchronizeSessionResponse.getText();
                if (text != null) {
                    dataAccessNotice2 = accountPicker.getDataAccessNotice();
                }
                String str2 = dataAccessNotice2;
                skipAccountSelection = partnerAccountsList.getSkipAccountSelection();
                if (skipAccountSelection != null) {
                    zBooleanValue = skipAccountSelection.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (manifest.getSingleAccount()) {
                    bVar = AccountPickerState.b.Single;
                } else {
                    bVar = AccountPickerState.b.Multiple;
                }
                AccountPickerState.b bVar3 = bVar;
                boolean singleAccount2 = manifest.getSingleAccount();
                if (!manifest.getSingleAccount()) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                String businessName2 = manifest.getBusinessName();
                Boolean isStripeDirect2 = manifest.getIsStripeDirect();
                AccountPickerState.Payload payload2 = new AccountPickerState.Payload(zBooleanValue, listA2, str2, dataAccessNotice4, bVar3, singleAccount2, isStripeDirect2 != null ? isStripeDirect2.booleanValue() : false, businessName2, z11);
                d.this.eventTracker.a(new FinancialConnectionsEvent.w(d.H));
                return payload2;
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super AccountPickerState.Payload> continuation) {
            return ((c) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: o40.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo40/c;", "Ls50/a;", "Lo40/c$a;", "it", "a", "(Lo40/c;Ls50/a;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
    static final class C2054d extends p013kotlin.jvm.internal.u implements wn0.p<AccountPickerState, s50.a<? extends AccountPickerState.Payload>, AccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2054d f96617c = new C2054d();

        C2054d() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountPickerState invoke(AccountPickerState execute, s50.a<AccountPickerState.Payload> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return AccountPickerState.b(execute, null, it, false, null, null, null, 61, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/model/q;", "<anonymous>", "()Lcom/stripe/android/financialconnections/model/q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadInstitution$1", f = "AccountPickerViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.l<Continuation<? super FinancialConnectionsInstitution>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96618n;

        e(Continuation<? super e> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f96618n;
            if (i11 == 0) {
                jn0.t.b(obj);
                b0 b0Var = d.this.getOrFetchSync;
                this.f96618n = 1;
                obj = b0.b(b0Var, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            FinancialConnectionsInstitution activeInstitution = ((SynchronizeSessionResponse) obj).getManifest().getActiveInstitution();
            if (activeInstitution != null) {
                return activeInstitution;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super FinancialConnectionsInstitution> continuation) {
            return ((e) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo40/c;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/q;", "it", "a", "(Lo40/c;Ls50/a;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.p<AccountPickerState, s50.a<? extends FinancialConnectionsInstitution>, AccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f96620c = new f();

        f() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountPickerState invoke(AccountPickerState execute, s50.a<FinancialConnectionsInstitution> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return AccountPickerState.b(execute, it, null, false, null, null, null, 62, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logAccountSelectionChanges$1", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96621n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Set<String> f96622o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Set<String> f96623p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ d f96624q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f96625r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Set<String> set, Set<String> set2, d dVar, boolean z11, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f96622o = set;
            this.f96623p = set2;
            this.f96624q = dVar;
            this.f96625r = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f96622o, this.f96623p, this.f96624q, this.f96625r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f96621n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            Set setL = d1.l(this.f96622o, this.f96623p);
            Set setL2 = d1.l(this.f96623p, this.f96622o);
            if (setL.size() == 1) {
                this.f96624q.eventTracker.a(new FinancialConnectionsEvent.a(d.H, true, this.f96625r, (String) v.n0(setL)));
            }
            if (setL2.size() == 1) {
                this.f96624q.eventTracker.a(new FinancialConnectionsEvent.a(d.H, false, this.f96625r, (String) v.n0(setL2)));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logErrors$2", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96627n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f96628o;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            i iVar = d.this.new i(continuation);
            iVar.f96628o = obj;
            return iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f96627n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            j40.h.b(d.this.eventTracker, "Error retrieving accounts", (Throwable) this.f96628o, d.this.logger, d.H);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((i) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logErrors$4", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96631n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f96632o;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            k kVar = d.this.new k(continuation);
            kVar.f96632o = obj;
            return kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f96631n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            j40.h.b(d.this.eventTracker, "Error selecting accounts", (Throwable) this.f96632o, d.this.logger, d.H);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((k) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo40/c;", "state", "Ljn0/h0;", "a", "(Lo40/c;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PartnerAccount f96635d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo40/c;", "a", "(Lo40/c;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, AccountPickerState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Set<String> f96636c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Set<String> set) {
                super(1);
                this.f96636c = set;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AccountPickerState invoke(AccountPickerState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return AccountPickerState.b(setState, null, null, false, null, this.f96636c, null, 47, null);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96637a;

            static {
                int[] iArr = new int[AccountPickerState.b.values().length];
                try {
                    iArr[AccountPickerState.b.Single.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountPickerState.b.Multiple.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f96637a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(PartnerAccount partnerAccount) {
            super(1);
            this.f96635d = partnerAccount;
        }

        public final void a(AccountPickerState state) {
            h0 h0Var;
            Set setC;
            p013kotlin.jvm.internal.s.k(state, "state");
            AccountPickerState.Payload payloadA = state.e().a();
            if (payloadA != null) {
                PartnerAccount partnerAccount = this.f96635d;
                d dVar = d.this;
                Set<String> setG = state.g();
                int i11 = b.f96637a[payloadA.getSelectionMode().ordinal()];
                if (i11 == 1) {
                    setC = d1.c(partnerAccount.getId());
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setC = setG.contains(partnerAccount.getId()) ? d1.m(setG, partnerAccount.getId()) : d1.o(setG, partnerAccount.getId());
                }
                dVar.k(new a(setC));
                dVar.E(setG, setC, payloadA.getSingleAccount());
                h0Var = h0.f84049a;
            } else {
                h0Var = null;
            }
            if (h0Var == null) {
                o30.d.b.a(d.this.logger, "account clicked without available payload.", null, 2, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(AccountPickerState accountPickerState) {
            a(accountPickerState);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1", f = "AccountPickerViewModel.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96638n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f96640p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<String, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f96641c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f96642d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Date f96643e;

            /* JADX INFO: renamed from: o40.d$m$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo40/c;", "a", "(Lo40/c;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
            static final class C2055a extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, AccountPickerState> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f96644c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Date f96645d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2055a(String str, Date date) {
                    super(1);
                    this.f96644c = str;
                    this.f96645d = date;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AccountPickerState invoke(AccountPickerState setState) {
                    p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                    return AccountPickerState.b(setState, null, null, false, null, null, new AccountPickerState.AbstractC2052c.OpenUrl(this.f96644c, this.f96645d.getTime()), 31, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, String str, Date date) {
                super(1);
                this.f96641c = dVar;
                this.f96642d = str;
                this.f96643e = date;
            }

            public final void a(String it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                this.f96641c.k(new C2055a(this.f96642d, this.f96643e));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                a(str);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv50/d$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lv50/d$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onClickableTextClick$1$2", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<v50.d.DeeplinkPayload, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f96646n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f96647o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f96647o = dVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v50.d.DeeplinkPayload deeplinkPayload, Continuation<? super h0> continuation) {
                return ((b) create(deeplinkPayload, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f96647o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f96646n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                this.f96647o.N();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f96640p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new m(this.f96640p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f96638n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Date date = new Date();
                v50.d dVar = d.this.handleClickableUrl;
                FinancialConnectionsSessionManifest.Pane pane = d.H;
                String str = this.f96640p;
                a aVar = new a(d.this, str, date);
                Map<String, ? extends wn0.p<? super v50.d.DeeplinkPayload, ? super Continuation<? super h0>, ? extends Object>> mapF = v0.f(x.a(o40.a.DATA.getValue(), new b(d.this, null)));
                this.f96638n = 1;
                if (dVar.b(pane, str, aVar, mapF, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo40/c;", "a", "(Lo40/c;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, AccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f96648c = new n();

        n() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountPickerState invoke(AccountPickerState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return AccountPickerState.b(setState, null, null, false, null, null, null, 59, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo40/c$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "<anonymous>", "(Lo40/c$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onPayloadLoaded$2", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.p<AccountPickerState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f96651o;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo40/c;", "a", "(Lo40/c;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, AccountPickerState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Set<String> f96653c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Set<String> set) {
                super(1);
                this.f96653c = set;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AccountPickerState invoke(AccountPickerState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return AccountPickerState.b(setState, null, null, false, null, this.f96653c, null, 47, null);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo40/c;", "a", "(Lo40/c;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, AccountPickerState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Set<String> f96654c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Set<String> set) {
                super(1);
                this.f96654c = set;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AccountPickerState invoke(AccountPickerState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return AccountPickerState.b(setState, null, null, false, null, this.f96654c, null, 47, null);
            }
        }

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AccountPickerState.Payload payload, Continuation<? super h0> continuation) {
            return ((p) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            p pVar = d.this.new p(continuation);
            pVar.f96651o = obj;
            return pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f96650n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            AccountPickerState.Payload payload = (AccountPickerState.Payload) this.f96651o;
            if (payload.getSkipAccountSelection()) {
                d dVar = d.this;
                List<PartnerAccount> listD = payload.d();
                ArrayList arrayList = new ArrayList(v.y(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PartnerAccount) it.next()).getId());
                }
                dVar.P(v.r1(arrayList), false, true);
            } else if (payload.getUserSelectedSingleAccountInInstitution()) {
                d.this.P(d1.c(((PartnerAccount) v.o0(payload.a())).getId()), true, true);
            } else if (payload.getSelectionMode() == AccountPickerState.b.Single) {
                PartnerAccount partnerAccount = (PartnerAccount) v.q0(payload.d());
                Set setJ = d1.j(partnerAccount != null ? partnerAccount.getId() : null);
                d.this.eventTracker.a(new FinancialConnectionsEvent.b(d.H, setJ, true));
                d.this.k(new a(setJ));
            } else if (payload.getSelectionMode() == AccountPickerState.b.Multiple) {
                List<PartnerAccount> listD2 = payload.d();
                ArrayList arrayList2 = new ArrayList(v.y(listD2, 10));
                Iterator<T> it2 = listD2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PartnerAccount) it2.next()).getId());
                }
                Set setR1 = v.r1(arrayList2);
                d.this.eventTracker.a(new FinancialConnectionsEvent.b(d.H, setR1, false));
                d.this.k(new b(setR1));
            }
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onSubmit$1", f = "AccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96655n;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new q(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f96655n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            d.this.eventTracker.a(new FinancialConnectionsEvent.k(d.H));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo40/c;", "state", "Ljn0/h0;", "a", "(Lo40/c;)V"}, k = 3, mv = {1, 9, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, h0> {
        r() {
            super(1);
        }

        public final void a(AccountPickerState state) {
            h0 h0Var;
            p013kotlin.jvm.internal.s.k(state, "state");
            if (state.e().a() != null) {
                d.this.P(state.g(), true, false);
                h0Var = h0.f84049a;
            } else {
                h0Var = null;
            }
            if (h0Var == null) {
                o30.d.b.a(d.this.logger, "account clicked without available payload.", null, 2, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(AccountPickerState accountPickerState) {
            a(accountPickerState);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo40/c;", "a", "(Lo40/c;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.l<AccountPickerState, AccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f96658c = new s();

        s() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountPickerState invoke(AccountPickerState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return AccountPickerState.b(setState, null, null, false, null, null, null, 31, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/model/d0;", "<anonymous>", "()Lcom/stripe/android/financialconnections/model/d0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$submitAccounts$1", f = "AccountPickerViewModel.kt", i = {1, 2}, l = {EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE}, m = "invokeSuspend", n = {"manifest", "accountsList"}, s = {"L$0", "L$0"})
    static final class t extends SuspendLambda implements wn0.l<Continuation<? super PartnerAccountsList>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f96659n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f96660o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Set<String> f96662q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f96663r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f96664s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Set<String> set, boolean z11, boolean z12, Continuation<? super t> continuation) {
            super(1, continuation);
            this.f96662q = set;
            this.f96663r = z11;
            this.f96664s = z12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new t(this.f96662q, this.f96663r, this.f96664s, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
        /* JADX WARN: Code duplicated, block: B:23:0x008f  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest manifest;
            PartnerAccountsList partnerAccountsList;
            CachedConsumerSession cachedConsumerSessionA;
            String clientSecret;
            n1 n1Var;
            List<CachedPartnerAccount> listA;
            boolean zF;
            PartnerAccountsList partnerAccountsList2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f96660o;
            if (i11 == 0) {
                jn0.t.b(obj);
                d.this.eventTracker.a(new FinancialConnectionsEvent.c(d.H, this.f96662q, this.f96663r));
                b0 b0Var = d.this.getOrFetchSync;
                this.f96660o = 1;
                obj = b0.b(b0Var, null, this, 1, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                jn0.t.b(obj);
            } else {
                if (i11 == 2) {
                    manifest = (FinancialConnectionsSessionManifest) this.f96659n;
                    jn0.t.b(obj);
                    partnerAccountsList = (PartnerAccountsList) obj;
                    cachedConsumerSessionA = d.this.consumerSessionProvider.a();
                    if (cachedConsumerSessionA != null) {
                        clientSecret = cachedConsumerSessionA.getClientSecret();
                    } else {
                        clientSecret = null;
                    }
                    if (p022s40.k.f(manifest) && p022s40.k.d(manifest) && clientSecret != null) {
                        n1Var = d.this.saveAccountToLink;
                        listA = z.a(partnerAccountsList.b());
                        zF = p022s40.k.f(manifest);
                        this.f96659n = partnerAccountsList;
                        this.f96660o = 3;
                        if (n1Var.i(clientSecret, listA, zF, this) != coroutine_suspended) {
                            partnerAccountsList2 = partnerAccountsList;
                        }
                        return coroutine_suspended;
                    }
                    o50.f.a.a(d.this.navigationManager, o50.b.k(o50.d.a(partnerAccountsList.getNextPane()), d.H, null, 2, null), null, false, 6, null);
                    return partnerAccountsList;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                partnerAccountsList2 = (PartnerAccountsList) this.f96659n;
                jn0.t.b(obj);
            }
            partnerAccountsList = partnerAccountsList2;
            o50.f.a.a(d.this.navigationManager, o50.b.k(o50.d.a(partnerAccountsList.getNextPane()), d.H, null, 2, null), null, false, 6, null);
            return partnerAccountsList;
            manifest = ((SynchronizeSessionResponse) obj).getManifest();
            r1 r1Var = d.this.selectAccounts;
            Set<String> set = this.f96662q;
            FinancialConnectionsAuthorizationSession activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String id2 = activeAuthSession.getId();
            boolean z11 = this.f96664s;
            this.f96659n = manifest;
            this.f96660o = 2;
            obj = r1Var.a(set, id2, z11, this);
            if (obj != coroutine_suspended) {
                partnerAccountsList = (PartnerAccountsList) obj;
                cachedConsumerSessionA = d.this.consumerSessionProvider.a();
                if (cachedConsumerSessionA != null) {
                    clientSecret = cachedConsumerSessionA.getClientSecret();
                } else {
                    clientSecret = null;
                }
                if (p022s40.k.f(manifest)) {
                    n1Var = d.this.saveAccountToLink;
                    listA = z.a(partnerAccountsList.b());
                    zF = p022s40.k.f(manifest);
                    this.f96659n = partnerAccountsList;
                    this.f96660o = 3;
                    if (n1Var.i(clientSecret, listA, zF, this) != coroutine_suspended) {
                        partnerAccountsList2 = partnerAccountsList;
                        partnerAccountsList = partnerAccountsList2;
                    }
                }
                o50.f.a.a(d.this.navigationManager, o50.b.k(o50.d.a(partnerAccountsList.getNextPane()), d.H, null, 2, null), null, false, 6, null);
                return partnerAccountsList;
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super PartnerAccountsList> continuation) {
            return ((t) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo40/c;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/d0;", "it", "a", "(Lo40/c;Ls50/a;)Lo40/c;"}, k = 3, mv = {1, 9, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.p<AccountPickerState, s50.a<? extends PartnerAccountsList>, AccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f96665c = new u();

        u() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountPickerState invoke(AccountPickerState execute, s50.a<PartnerAccountsList> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return AccountPickerState.b(execute, null, null, false, it, null, null, 55, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountPickerState initialState, p0 nativeAuthFlowCoordinator, j40.f eventTracker, t50.f consumerSessionProvider, n1 saveAccountToLink, r1 selectAccounts, b0 getOrFetchSync, o50.f navigationManager, v50.d handleClickableUrl, o30.d logger, u0 pollAuthorizationSessionAccounts, h50.f presentSheet) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(consumerSessionProvider, "consumerSessionProvider");
        p013kotlin.jvm.internal.s.k(saveAccountToLink, "saveAccountToLink");
        p013kotlin.jvm.internal.s.k(selectAccounts, "selectAccounts");
        p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        p013kotlin.jvm.internal.s.k(handleClickableUrl, "handleClickableUrl");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(pollAuthorizationSessionAccounts, "pollAuthorizationSessionAccounts");
        p013kotlin.jvm.internal.s.k(presentSheet, "presentSheet");
        this.eventTracker = eventTracker;
        this.consumerSessionProvider = consumerSessionProvider;
        this.saveAccountToLink = saveAccountToLink;
        this.selectAccounts = selectAccounts;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.handleClickableUrl = handleClickableUrl;
        this.logger = logger;
        this.pollAuthorizationSessionAccounts = pollAuthorizationSessionAccounts;
        this.presentSheet = presentSheet;
        F();
        K();
        D();
        C();
    }

    private final void C() {
        s50.i.g(this, new c(null), null, C2054d.f96617c, 1, null);
    }

    private final void D() {
        s50.i.g(this, new e(null), null, f.f96620c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Set<String> idsBefore, Set<String> idsAfter, boolean isSingleAccount) {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new g(idsAfter, idsBefore, this, isSingleAccount, null), 3, null);
    }

    private final void F() {
        s50.i.j(this, new f0() { // from class: o40.d.h
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((AccountPickerState) obj).e();
            }
        }, null, new i(null), 2, null);
        s50.i.j(this, new f0() { // from class: o40.d.j
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((AccountPickerState) obj).f();
            }
        }, null, new k(null), 2, null);
    }

    private final void K() {
        s50.i.j(this, new f0() { // from class: o40.d.o
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((AccountPickerState) obj).e();
            }
        }, new p(null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        DataAccessNotice dataAccessNotice;
        AccountPickerState.Payload payloadA = h().getValue().e().a();
        if (payloadA == null || (dataAccessNotice = payloadA.getDataAccessNotice()) == null) {
            return;
        }
        j40.f fVar = this.eventTracker;
        FinancialConnectionsSessionManifest.Pane pane = H;
        fVar.a(new FinancialConnectionsEvent.j(pane));
        this.presentSheet.a(new NoticeSheetState.a.DataAccess(dataAccessNotice), pane);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Set<String> selectedIds, boolean updateLocalCache, boolean isSkipAccountSelection) {
        s50.i.g(this, new t(selectedIds, isSkipAccountSelection, updateLocalCache, null), null, u.f96665c, 1, null);
    }

    public final void G(PartnerAccount account) {
        p013kotlin.jvm.internal.s.k(account, "account");
        n(new l(account));
    }

    public final Job H(String uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new m(uri, null), 3, null);
    }

    public final void I() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.o.f96753i, H, null, 2, null), null, false, 6, null);
    }

    public final void J() {
        k(n.f96648c);
        C();
    }

    public final void L() {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new q(null), 3, null);
        i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.ACCOUNTS_SELECTED, null, 2, null);
        n(new r());
    }

    public final void M() {
        k(s.f96658c);
    }

    public final void O() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.x.f96763i, H, null, 2, null), null, false, 6, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(AccountPickerState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return new TopAppBarStateUpdate(H, false, z50.n.a(state.e()), null, false, 24, null);
    }
}
