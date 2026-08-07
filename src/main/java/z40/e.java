package z40;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.ReturningNetworkingUserAccountPicker;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import defpackage.FinancialConnectionsGenericInfoScreen;
import ezvcard.property.Gender;
import h50.NoticeSheetState;
import j40.FinancialConnectionsEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import n40.b0;
import n40.p0;
import n40.t1;
import n40.u;
import n40.x1;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import q50.TopAppBarStateUpdate;
import t50.CachedConsumerSession;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002abBs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010 J.\u0010,\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0*H\u0082@¢\u0006\u0004\b,\u0010-J\"\u00100\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010.H\u0082@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u001e2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u0004\u0018\u000106*\u0002022\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u001e*\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020(¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020D¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u001e¢\u0006\u0004\bI\u0010 J\u0015\u0010J\u001a\u00020\u001e2\u0006\u00103\u001a\u000202¢\u0006\u0004\bJ\u00105J\r\u0010K\u001a\u00020\u001e¢\u0006\u0004\bK\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010`¨\u0006c"}, d2 = {"Lz40/e;", "Ls50/i;", "Lz40/d;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lj40/f;", "eventTracker", "Lt50/f;", "consumerSessionProvider", "Lv50/d;", "handleClickableUrl", "Ln40/u;", "fetchNetworkedAccounts", "Ln40/t1;", "selectNetworkedAccounts", "Ln40/x1;", "updateCachedAccounts", "Ln40/b0;", "getSync", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "Ln40/a;", "acceptConsent", "Lh50/f;", "presentSheet", "<init>", "(Lz40/d;Ln40/p0;Lj40/f;Lt50/f;Lv50/d;Ln40/u;Ln40/t1;Ln40/x1;Ln40/b0;Lo50/f;Lo30/d;Ln40/a;Lh50/f;)V", "Ljn0/h0;", "J", "()V", "Lz40/d$a;", StatusResponse.PAYLOAD, "S", "(Lz40/d$a;)V", "Q", "", "acquireConsentOnPrimaryCtaClick", "", "consumerSessionClientSecret", "", "accountIds", "R", "(ZLjava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPane", "G", "(Lz40/d$a;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/model/c0;", "partnerAccount", "H", "(Lcom/stripe/android/financialconnections/model/c0;)V", "Lh50/b$a;", Gender.FEMALE, "(Lcom/stripe/android/financialconnections/model/c0;Lz40/d$a;)Lh50/b$a;", "P", "(Lh50/b$a;)V", "Lh50/b$a$d$b;", "type", "I", "(Lh50/b$a$d$b;)V", "state", "Lq50/c;", "T", "(Lz40/d;)Lq50/c;", "uri", "Lkotlinx/coroutines/Job;", "L", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", Gender.MALE, "()Lkotlinx/coroutines/Job;", Gender.NONE, "K", Gender.OTHER, "v", "Lj40/f;", "w", "Lt50/f;", "x", "Lv50/d;", "y", "Ln40/u;", "z", "Ln40/t1;", "A", "Ln40/x1;", "B", "Ln40/b0;", "C", "Lo50/f;", "D", "Lo30/d;", "E", "Ln40/a;", "Lh50/f;", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends s50.i<LinkAccountPickerState> {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int H = 8;
    private static final FinancialConnectionsSessionManifest.Pane I = FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final x1 updateCachedAccounts;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final b0 getSync;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final n40.a acceptConsent;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final h50.f presentSheet;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final t50.f consumerSessionProvider;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final v50.d handleClickableUrl;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final u fetchNetworkedAccounts;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final t1 selectNetworkedAccounts;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz40/d$a;", "<anonymous>", "()Lz40/d$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$1", f = "LinkAccountPickerViewModel.kt", i = {1, 1, 1}, l = {84, 87}, m = "invokeSuspend", n = {BaseJavaModule.METHOD_TYPE_SYNC, "manifest", "consumerSession"}, s = {"L$0", "L$1", "L$2"})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super LinkAccountPickerState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f126917n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f126918o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f126919p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f126920q;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return e.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0088  */
        /* JADX WARN: Code duplicated, block: B:26:0x008b  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:56:0x0114  */
        /* JADX WARN: Code duplicated, block: B:64:0x0155  */
        /* JADX WARN: Code duplicated, block: B:66:0x016b  */
        /* JADX WARN: Code duplicated, block: B:68:0x0172  */
        /* JADX WARN: Code duplicated, block: B:71:0x017a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0180  */
        /* JADX WARN: Code duplicated, block: B:77:0x00da A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x009a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0104 A[SYNTHETIC] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objA;
            SynchronizeSessionResponse synchronizeSessionResponse;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            CachedConsumerSession cachedConsumerSession;
            NetworkedAccountsList networkedAccountsList;
            Display display;
            ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker;
            ArrayList arrayList;
            Iterator it;
            Object next;
            LinkedAccount linkedAccount;
            String id2;
            List listQ;
            Map<String, String> mapF;
            String strB;
            TextUpdate text;
            DataAccessNotice dataAccessNotice;
            FinancialConnectionsSessionManifest.Pane nextPaneOnAddAccount;
            DataAccessNotice dataAccessNoticeF;
            AddNewAccount addNewAccountD;
            Boolean acquireConsentOnPrimaryCtaClick;
            boolean zBooleanValue;
            ConsentPane consent;
            PartnerAccount partnerAccountC;
            LinkedAccount linkedAccount2;
            Iterator<T> it2;
            Object next2;
            PartnerAccount partnerAccount;
            LinkedAccount linkedAccount3;
            TextUpdate text2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f126920q;
            DataAccessNotice dataAccessNotice2 = null;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = e.this.getSync;
                this.f126920q = 1;
                objB = b0.b(b0Var, null, this, 1, null);
                if (objB != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                t.b(obj);
                objB = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cachedConsumerSession = (CachedConsumerSession) this.f126919p;
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.f126918o;
                SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) this.f126917n;
                t.b(obj);
                synchronizeSessionResponse = synchronizeSessionResponse2;
                objA = obj;
            }
            networkedAccountsList = (NetworkedAccountsList) objA;
            display = networkedAccountsList.getDisplay();
            if (display != null || (text2 = display.getText()) == null) {
                returningNetworkingUserAccountPicker = null;
            } else {
                returningNetworkingUserAccountPicker = text2.getReturningNetworkingUserAccountPicker();
            }
            if (returningNetworkingUserAccountPicker != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List<NetworkedAccount> listC = returningNetworkingUserAccountPicker.c();
            arrayList = new ArrayList();
            for (NetworkedAccount networkedAccount : listC) {
                it2 = networkedAccountsList.c().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!s.f(((PartnerAccount) next2).getId(), networkedAccount.getId()));
                partnerAccount = (PartnerAccount) next2;
                if (partnerAccount != null) {
                    linkedAccount3 = new LinkedAccount(partnerAccount, networkedAccount);
                } else {
                    linkedAccount3 = null;
                }
                if (linkedAccount3 != null) {
                    arrayList.add(linkedAccount3);
                }
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                linkedAccount2 = (LinkedAccount) next;
                if (!linkedAccount2.d().getAllowSelection() && linkedAccount2.d().getDrawerOnSelection() == null) {
                    break;
                }
            }
            linkedAccount = (LinkedAccount) next;
            if (linkedAccount != null || (partnerAccountC = linkedAccount.c()) == null) {
                id2 = null;
            } else {
                id2 = partnerAccountC.getId();
            }
            listQ = v.q(id2);
            e.this.eventTracker.a(new FinancialConnectionsEvent.w(e.INSTANCE.b()));
            mapF = networkedAccountsList.f();
            strB = returningNetworkingUserAccountPicker.getAboveCta();
            text = synchronizeSessionResponse.getText();
            if (text != null && (consent = text.getConsent()) != null) {
                dataAccessNotice2 = consent.getDataAccessNotice();
            }
            dataAccessNotice = dataAccessNotice2;
            nextPaneOnAddAccount = networkedAccountsList.getNextPaneOnAddAccount();
            dataAccessNoticeF = returningNetworkingUserAccountPicker.getMultipleAccountTypesSelectedDataAccessNotice();
            addNewAccountD = returningNetworkingUserAccountPicker.getAddNewAccount();
            if (addNewAccountD != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String strG = returningNetworkingUserAccountPicker.getTitle();
            String strE = returningNetworkingUserAccountPicker.getDefaultCta();
            String clientSecret = cachedConsumerSession.getClientSecret();
            boolean singleAccount = financialConnectionsSessionManifest.getSingleAccount();
            acquireConsentOnPrimaryCtaClick = networkedAccountsList.getAcquireConsentOnPrimaryCtaClick();
            if (acquireConsentOnPrimaryCtaClick != null) {
                zBooleanValue = acquireConsentOnPrimaryCtaClick.booleanValue();
            } else {
                zBooleanValue = false;
            }
            return new LinkAccountPickerState.Payload(strG, arrayList, listQ, addNewAccountD, clientSecret, strE, nextPaneOnAddAccount, mapF, singleAccount, dataAccessNoticeF, strB, dataAccessNotice, zBooleanValue);
            SynchronizeSessionResponse synchronizeSessionResponse3 = (SynchronizeSessionResponse) objB;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse3.getManifest();
            CachedConsumerSession cachedConsumerSessionA = e.this.consumerSessionProvider.a();
            if (cachedConsumerSessionA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            u uVar = e.this.fetchNetworkedAccounts;
            String clientSecret2 = cachedConsumerSessionA.getClientSecret();
            this.f126917n = synchronizeSessionResponse3;
            this.f126918o = manifest;
            this.f126919p = cachedConsumerSessionA;
            this.f126920q = 2;
            objA = uVar.a(clientSecret2, this);
            if (objA != coroutine_suspended) {
                synchronizeSessionResponse = synchronizeSessionResponse3;
                financialConnectionsSessionManifest = manifest;
                cachedConsumerSession = cachedConsumerSessionA;
                networkedAccountsList = (NetworkedAccountsList) objA;
                display = networkedAccountsList.getDisplay();
                if (display != null) {
                    returningNetworkingUserAccountPicker = null;
                } else {
                    returningNetworkingUserAccountPicker = null;
                }
                if (returningNetworkingUserAccountPicker != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List<NetworkedAccount> listC2 = returningNetworkingUserAccountPicker.c();
                arrayList = new ArrayList();
                while (r8.hasNext()) {
                    it2 = networkedAccountsList.c().iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!s.f(((PartnerAccount) next2).getId(), networkedAccount.getId()));
                    partnerAccount = (PartnerAccount) next2;
                    if (partnerAccount != null) {
                        linkedAccount3 = new LinkedAccount(partnerAccount, networkedAccount);
                    } else {
                        linkedAccount3 = null;
                    }
                    if (linkedAccount3 != null) {
                        arrayList.add(linkedAccount3);
                    }
                }
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    linkedAccount2 = (LinkedAccount) next;
                    if (!linkedAccount2.d().getAllowSelection()) {
                    }
                }
                linkedAccount = (LinkedAccount) next;
                if (linkedAccount != null) {
                    id2 = null;
                } else {
                    id2 = null;
                }
                listQ = v.q(id2);
                e.this.eventTracker.a(new FinancialConnectionsEvent.w(e.INSTANCE.b()));
                mapF = networkedAccountsList.f();
                strB = returningNetworkingUserAccountPicker.getAboveCta();
                text = synchronizeSessionResponse.getText();
                if (text != null) {
                    dataAccessNotice2 = consent.getDataAccessNotice();
                }
                dataAccessNotice = dataAccessNotice2;
                nextPaneOnAddAccount = networkedAccountsList.getNextPaneOnAddAccount();
                dataAccessNoticeF = returningNetworkingUserAccountPicker.getMultipleAccountTypesSelectedDataAccessNotice();
                addNewAccountD = returningNetworkingUserAccountPicker.getAddNewAccount();
                if (addNewAccountD != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String strG2 = returningNetworkingUserAccountPicker.getTitle();
                String strE2 = returningNetworkingUserAccountPicker.getDefaultCta();
                String clientSecret3 = cachedConsumerSession.getClientSecret();
                boolean singleAccount2 = financialConnectionsSessionManifest.getSingleAccount();
                acquireConsentOnPrimaryCtaClick = networkedAccountsList.getAcquireConsentOnPrimaryCtaClick();
                if (acquireConsentOnPrimaryCtaClick != null) {
                    zBooleanValue = acquireConsentOnPrimaryCtaClick.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return new LinkAccountPickerState.Payload(strG2, arrayList, listQ, addNewAccountD, clientSecret3, strE2, nextPaneOnAddAccount, mapF, singleAccount2, dataAccessNoticeF, strB, dataAccessNotice, zBooleanValue);
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super LinkAccountPickerState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz40/d;", "Ls50/a;", "Lz40/d$a;", "it", "a", "(Lz40/d;Ls50/a;)Lz40/d;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<LinkAccountPickerState, s50.a<? extends LinkAccountPickerState.Payload>, LinkAccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f126922c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkAccountPickerState invoke(LinkAccountPickerState execute, s50.a<LinkAccountPickerState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return LinkAccountPickerState.b(execute, it, null, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: z40.e$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz40/e$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: z40.e$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lz40/e;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lz40/e;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<CreationExtras, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f126923c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f126923c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f126923c.j().a(new LinkAccountPickerState(null, null, null, 7, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(e.class), new a(parentComponent));
            return bVar.b();
        }

        public final FinancialConnectionsSessionManifest.Pane b() {
            return e.I;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz40/e$d;", "", "Lz40/d;", "initialState", "Lz40/e;", "a", "(Lz40/d;)Lz40/e;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        e a(LinkAccountPickerState initialState);
    }

    /* JADX INFO: renamed from: z40.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C2751e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126924a;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Pane.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126924a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel", f = "LinkAccountPickerViewModel.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_DARK_APPEARANCE_VALUE}, m = "handleNonSuccessNextPane", n = {"this", "nextPane"}, s = {"L$0", "L$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f126925n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f126926o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f126927p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f126929r;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f126927p = obj;
            this.f126929r |= Integer.MIN_VALUE;
            return e.this.G(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz40/d$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "<anonymous>", "(Lz40/d$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$2", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<LinkAccountPickerState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126931n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126932o;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LinkAccountPickerState.Payload payload, Continuation<? super h0> continuation) {
            return ((h) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = e.this.new h(continuation);
            hVar.f126932o = obj;
            return hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126931n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) this.f126932o;
            if (payload.d().isEmpty()) {
                e.this.S(payload);
            }
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$3", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126934n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126935o;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            i iVar = e.this.new i(continuation);
            iVar.f126935o = obj;
            return iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126934n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Throwable th2 = (Throwable) this.f126935o;
            j40.f fVar = e.this.eventTracker;
            o30.d dVar = e.this.logger;
            Companion companion = e.INSTANCE;
            j40.h.b(fVar, "Error fetching payload", th2, dVar, companion.b());
            o50.f.a.a(e.this.navigationManager, o50.b.k(o50.b.l.f96750i, companion.b(), null, 2, null), null, false, 6, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((i) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$observeAsyncs$5", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126938n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126939o;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            k kVar = e.this.new k(continuation);
            kVar.f126939o = obj;
            return kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126938n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.h.b(e.this.eventTracker, "Error selecting networked account", (Throwable) this.f126939o, e.this.logger, e.INSTANCE.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((k) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz40/d;", "a", "(Lz40/d;)Lz40/d;"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<LinkAccountPickerState, LinkAccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkAccountPickerState.Payload f126941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<String> f126942d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(LinkAccountPickerState.Payload payload, List<String> list) {
            super(1);
            this.f126941c = payload;
            this.f126942d = list;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkAccountPickerState invoke(LinkAccountPickerState setState) {
            s.k(setState, "$this$setState");
            return LinkAccountPickerState.b(setState, new s50.a.Success(LinkAccountPickerState.Payload.b(this.f126941c, null, null, this.f126942d, null, null, null, null, null, false, null, null, null, false, 8187, null)), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1", f = "LinkAccountPickerViewModel.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126943n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f126945p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<String, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f126946c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f126947d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Date f126948e;

            /* JADX INFO: renamed from: z40.e$m$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz40/d;", "a", "(Lz40/d;)Lz40/d;"}, k = 3, mv = {1, 9, 0})
            static final class C2752a extends p013kotlin.jvm.internal.u implements wn0.l<LinkAccountPickerState, LinkAccountPickerState> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f126949c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Date f126950d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2752a(String str, Date date) {
                    super(1);
                    this.f126949c = str;
                    this.f126950d = date;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LinkAccountPickerState invoke(LinkAccountPickerState setState) {
                    s.k(setState, "$this$setState");
                    return LinkAccountPickerState.b(setState, null, null, new LinkAccountPickerState.b.OpenUrl(this.f126949c, this.f126950d.getTime()), 3, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, String str, Date date) {
                super(1);
                this.f126946c = eVar;
                this.f126947d = str;
                this.f126948e = date;
            }

            public final void a(String it) {
                s.k(it, "it");
                this.f126946c.k(new C2752a(this.f126947d, this.f126948e));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                a(str);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv50/d$a;", "it", "Ljn0/h0;", "<anonymous>", "(Lv50/d$a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onClickableTextClick$1$2", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<v50.d.DeeplinkPayload, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f126951n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f126952o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f126952o = eVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v50.d.DeeplinkPayload deeplinkPayload, Continuation<? super h0> continuation) {
                return ((b) create(deeplinkPayload, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f126952o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f126951n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f126952o.Q();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f126945p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new m(this.f126945p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f126943n;
            if (i11 == 0) {
                t.b(obj);
                Date date = new Date();
                v50.d dVar = e.this.handleClickableUrl;
                FinancialConnectionsSessionManifest.Pane paneB = e.INSTANCE.b();
                String str = this.f126945p;
                a aVar = new a(e.this, str, date);
                Map<String, ? extends wn0.p<? super v50.d.DeeplinkPayload, ? super Continuation<? super h0>, ? extends Object>> mapF = v0.f(x.a(z40.b.DATA.getValue(), new b(e.this, null)));
                this.f126943n = 1;
                if (dVar.b(paneB, str, aVar, mapF, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onNewBankAccountClick$1", f = "LinkAccountPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126953n;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new n(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126953n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.f fVar = e.this.eventTracker;
            Companion companion = e.INSTANCE;
            fVar.a(new FinancialConnectionsEvent.h("click.new_account", companion.b()));
            LinkAccountPickerState.Payload payloadA = e.this.h().getValue().e().a();
            if (payloadA == null || (nextPaneOnNewAccount = payloadA.getNextPaneOnNewAccount()) == null) {
                nextPaneOnNewAccount = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
            }
            o50.f.a.a(e.this.navigationManager, o50.b.k(o50.d.a(nextPaneOnNewAccount), companion.b(), null, 2, null), null, false, 6, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel$onSelectAccountsClick$1", f = "LinkAccountPickerViewModel.kt", i = {0, 0, 0, 1}, l = {EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC4419g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m = "invokeSuspend", n = {StatusResponse.PAYLOAD, "accounts", "selectedAccountDrawers", "selectedAccountDrawers"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class o extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f126955n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f126956o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f126957p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f126958q;

        o(Continuation<? super o> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return e.this.new o(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x018d, code lost:
        
            if (r12.R(r2, r3, r1, r11) == r0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x019e, code lost:
        
            if (r1.G(r8, r12, r11) == r0) goto L55;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z40.e.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((o) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz40/d;", "Ls50/a;", "Ljn0/h0;", "it", "a", "(Lz40/d;Ls50/a;)Lz40/d;"}, k = 3, mv = {1, 9, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.p<LinkAccountPickerState, s50.a<? extends h0>, LinkAccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f126960c = new p();

        p() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkAccountPickerState invoke(LinkAccountPickerState execute, s50.a<h0> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return LinkAccountPickerState.b(execute, null, it, null, 5, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz40/d;", "a", "(Lz40/d;)Lz40/d;"}, k = 3, mv = {1, 9, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.l<LinkAccountPickerState, LinkAccountPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f126961c = new q();

        q() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkAccountPickerState invoke(LinkAccountPickerState setState) {
            s.k(setState, "$this$setState");
            return LinkAccountPickerState.b(setState, null, null, null, 3, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel", f = "LinkAccountPickerViewModel.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "selectAccounts", n = {"this"}, s = {"L$0"})
    static final class r extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f126962n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126963o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f126965q;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f126963o = obj;
            this.f126965q |= Integer.MIN_VALUE;
            return e.this.R(false, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LinkAccountPickerState initialState, p0 nativeAuthFlowCoordinator, j40.f eventTracker, t50.f consumerSessionProvider, v50.d handleClickableUrl, u fetchNetworkedAccounts, t1 selectNetworkedAccounts, x1 updateCachedAccounts, b0 getSync, o50.f navigationManager, o30.d logger, n40.a acceptConsent, h50.f presentSheet) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(eventTracker, "eventTracker");
        s.k(consumerSessionProvider, "consumerSessionProvider");
        s.k(handleClickableUrl, "handleClickableUrl");
        s.k(fetchNetworkedAccounts, "fetchNetworkedAccounts");
        s.k(selectNetworkedAccounts, "selectNetworkedAccounts");
        s.k(updateCachedAccounts, "updateCachedAccounts");
        s.k(getSync, "getSync");
        s.k(navigationManager, "navigationManager");
        s.k(logger, "logger");
        s.k(acceptConsent, "acceptConsent");
        s.k(presentSheet, "presentSheet");
        this.eventTracker = eventTracker;
        this.consumerSessionProvider = consumerSessionProvider;
        this.handleClickableUrl = handleClickableUrl;
        this.fetchNetworkedAccounts = fetchNetworkedAccounts;
        this.selectNetworkedAccounts = selectNetworkedAccounts;
        this.updateCachedAccounts = updateCachedAccounts;
        this.getSync = getSync;
        this.navigationManager = navigationManager;
        this.logger = logger;
        this.acceptConsent = acceptConsent;
        this.presentSheet = presentSheet;
        J();
        s50.i.g(this, new a(null), null, b.f126922c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    public final NoticeSheetState.a F(PartnerAccount partnerAccount, LinkAccountPickerState.Payload payload) {
        Object next;
        NoticeSheetState.a.UpdateRequired updateRequired;
        Map<String, String> mapL;
        Image icon;
        NetworkedAccount networkedAccountD;
        Iterator<T> it = payload.d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((LinkedAccount) next).c().getId(), partnerAccount.getId()));
        LinkedAccount linkedAccount = (LinkedAccount) next;
        FinancialConnectionsGenericInfoScreen drawerOnSelection = (linkedAccount == null || (networkedAccountD = linkedAccount.d()) == null) ? null : networkedAccountD.getDrawerOnSelection();
        if (drawerOnSelection == null) {
            updateRequired = null;
        } else {
            FinancialConnectionsInstitution institution = partnerAccount.getInstitution();
            FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreenB = z40.f.b(drawerOnSelection, (institution == null || (icon = institution.getIcon()) == null) ? null : icon.getDefault());
            if (financialConnectionsGenericInfoScreenB == null) {
                updateRequired = null;
            } else {
                FinancialConnectionsSessionManifest.Pane nextPaneOnSelection = partnerAccount.getNextPaneOnSelection();
                int i11 = nextPaneOnSelection == null ? -1 : C2751e.f126924a[nextPaneOnSelection.ordinal()];
                if (i11 == 1) {
                    updateRequired = new NoticeSheetState.a.UpdateRequired(financialConnectionsGenericInfoScreenB, new NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Supportability(partnerAccount.getInstitution()));
                } else if (i11 == 2) {
                    String authorization = partnerAccount.getAuthorization();
                    updateRequired = new NoticeSheetState.a.UpdateRequired(financialConnectionsGenericInfoScreenB, new NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Repair((authorization == null || (mapL = payload.l()) == null) ? null : (String) v0.j(mapL, authorization)));
                } else if (i11 != 3) {
                    updateRequired = null;
                } else {
                    updateRequired = new NoticeSheetState.a.UpdateRequired(financialConnectionsGenericInfoScreenB, new NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Supportability(null));
                }
            }
        }
        if (updateRequired != null) {
            return updateRequired;
        }
        if (drawerOnSelection != null) {
            return new NoticeSheetState.a.Generic(drawerOnSelection);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(LinkAccountPickerState.Payload payload, FinancialConnectionsSessionManifest.Pane pane, Continuation<? super h0> continuation) {
        f fVar;
        e eVar;
        String strK;
        o50.b bVarA;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f126929r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f126929r = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f126927p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f126929r;
        if (i12 == 0) {
            t.b(obj);
            int i13 = pane == null ? -1 : C2751e.f126924a[pane.ordinal()];
            if (i13 == -1) {
                j40.h.b(this.eventTracker, "Selected connect account, but next pane is NULL.", new UnclassifiedError("ConnectUnselectedAccountError", null, 2, null), this.logger, I);
            } else if (i13 == 1) {
                j40.h.b(this.eventTracker, "Connecting a supportability account, but user shouldn't be able to.", new UnclassifiedError("ConnectSupportabilityAccountError", null, 2, null), this.logger, I);
            } else if (i13 == 2) {
                j40.h.b(this.eventTracker, "Connecting a repair account, but user shouldn't be able to.", new UnclassifiedError("ConnectRepairAccountError", null, 2, null), this.logger, I);
            }
            if (payload.getAcquireConsentOnPrimaryCtaClick()) {
                n40.a aVar = this.acceptConsent;
                fVar.f126925n = this;
                fVar.f126926o = pane;
                fVar.f126929r = 1;
                if (aVar.a(fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            eVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pane = (FinancialConnectionsSessionManifest.Pane) fVar.f126926o;
            eVar = (e) fVar.f126925n;
            t.b(obj);
        }
        if (pane == null || (bVarA = o50.d.a(pane)) == null || (strK = o50.b.k(bVarA, I, null, 2, null)) == null) {
            strK = o50.b.k(o50.b.l.f96750i, I, null, 2, null);
        }
        o50.f.a.a(eVar.navigationManager, strK, null, false, 6, null);
        return h0.f84049a;
    }

    private final void H(PartnerAccount partnerAccount) {
        LinkAccountPickerState.Payload payloadA = h().getValue().e().a();
        if (payloadA == null) {
            return;
        }
        this.eventTracker.a(new FinancialConnectionsEvent.a(I, !payloadA.m().contains(partnerAccount.getId()), payloadA.getSingleAccount(), partnerAccount.getId()));
    }

    private final void I(NoticeSheetState.a.UpdateRequired.InterfaceC1471b type) {
        String str;
        if (type instanceof NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Supportability) {
            str = "click.supportability_account";
        } else {
            if (!(type instanceof NoticeSheetState.a.UpdateRequired.InterfaceC1471b.Repair)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "click.repair_accounts";
        }
        this.eventTracker.a(new FinancialConnectionsEvent.h(str, I));
    }

    private final void J() {
        i(new f0() { // from class: z40.e.g
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((LinkAccountPickerState) obj).e();
            }
        }, new h(null), new i(null));
        s50.i.j(this, new f0() { // from class: z40.e.j
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((LinkAccountPickerState) obj).f();
            }
        }, null, new k(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(NoticeSheetState.a aVar) {
        if (aVar instanceof NoticeSheetState.a.UpdateRequired) {
            I(((NoticeSheetState.a.UpdateRequired) aVar).getType());
        }
        this.presentSheet.a(aVar, I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        DataAccessNotice dataAccessNoticeC = h().getValue().c();
        if (dataAccessNoticeC == null) {
            return;
        }
        j40.f fVar = this.eventTracker;
        FinancialConnectionsSessionManifest.Pane pane = I;
        fVar.a(new FinancialConnectionsEvent.j(pane));
        this.presentSheet.a(new NoticeSheetState.a.DataAccess(dataAccessNoticeC), pane);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(boolean z11, String str, Set<String> set, Continuation<? super h0> continuation) {
        r rVar;
        e eVar;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i11 = rVar.f126965q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f126965q = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        Object objA = rVar.f126963o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rVar.f126965q;
        if (i12 == 0) {
            t.b(objA);
            t1 t1Var = this.selectNetworkedAccounts;
            Boolean boolBoxBoolean = Boxing.boxBoolean(z11);
            rVar.f126962n = this;
            rVar.f126965q = 1;
            objA = t1Var.a(str, set, boolBoxBoolean, rVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) rVar.f126962n;
            t.b(objA);
        }
        i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.ACCOUNTS_SELECTED, null, 2, null);
        o50.f fVar = eVar.navigationManager;
        FinancialConnectionsSessionManifest.Pane nextPane = ((ShareNetworkedAccountsResponse) objA).getNextPane();
        if (nextPane == null) {
            nextPane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
        }
        o50.f.a.a(fVar, o50.b.k(o50.d.a(nextPane), I, null, 2, null), null, false, 6, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(LinkAccountPickerState.Payload payload) {
        FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount = payload.getNextPaneOnNewAccount();
        if (nextPaneOnNewAccount == null) {
            nextPaneOnNewAccount = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
        }
        o50.f.a.a(this.navigationManager, o50.b.k(o50.d.a(nextPaneOnNewAccount), I, null, 2, null), new o50.i.Route(true, o50.d.a(FinancialConnectionsSessionManifest.Pane.CONSENT).g()), false, 4, null);
    }

    public final void K(PartnerAccount partnerAccount) {
        List listM0;
        NoticeSheetState.a aVarF;
        s.k(partnerAccount, "partnerAccount");
        H(partnerAccount);
        LinkAccountPickerState.Payload payloadA = h().getValue().e().a();
        if (payloadA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LinkAccountPickerState.Payload payload = payloadA;
        if (!payload.getAcquireConsentOnPrimaryCtaClick() && (aVarF = F(partnerAccount, payload)) != null) {
            P(aVarF);
            return;
        }
        if (payload.getSingleAccount()) {
            listM0 = v.e(partnerAccount.getId());
        } else {
            listM0 = payload.m().contains(partnerAccount.getId()) ? v.M0(payload.m(), partnerAccount.getId()) : v.Q0(payload.m(), partnerAccount.getId());
        }
        k(new l(payload, listM0));
    }

    public final Job L(String uri) {
        s.k(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new m(uri, null), 3, null);
    }

    public final Job M() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new n(null), 3, null);
    }

    public final void N() {
        s50.i.g(this, new o(null), null, p.f126960c, 1, null);
    }

    public final void O() {
        k(q.f126961c);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(LinkAccountPickerState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(I, false, z50.n.a(state.e()), null, false, 24, null);
    }
}
