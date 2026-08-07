package e50;

import android.webkit.URLUtil;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.LinkLoginPane;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupPane;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.model.ConsumerSessionLookup;
import ezvcard.property.Gender;
import h50.NoticeSheetState;
import j40.FinancialConnectionsEvent;
import java.util.Date;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import n40.b0;
import n40.h0;
import n40.p0;
import n90.FormFieldEntry;
import p010i90.a0;
import p010i90.q0;
import p010i90.r1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import q50.TopAppBarStateUpdate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002PQB[\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010 \u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010\u001aJ\u000f\u0010&\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010\u001aJ\u001b\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0018¢\u0006\u0004\b3\u0010\u001aJ\u0015\u00105\u001a\u0002002\u0006\u00104\u001a\u00020\u001e¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0018¢\u0006\u0004\b7\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, d2 = {"Le50/i;", "Ls50/i;", "Le50/h;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Ln40/h0;", "lookupAccount", "Lz50/p;", "uriUtils", "Lj40/f;", "eventTracker", "Ln40/b0;", "getOrFetchSync", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "Lh50/f;", "presentSheet", "Le50/a;", "linkSignupHandler", "<init>", "(Le50/h;Ln40/p0;Ln40/h0;Lz50/p;Lj40/f;Ln40/b0;Lo50/f;Lo30/d;Lh50/f;Le50/a;)V", "Ljn0/h0;", "H", "()V", "I", "K", "J", "", "validEmail", Gender.NONE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "E", "(Ljava/lang/String;)J", "S", "G", "R", "Li90/h0;", "Lkotlinx/coroutines/flow/StateFlow;", Gender.UNKNOWN, "(Li90/h0;)Lkotlinx/coroutines/flow/StateFlow;", "state", "Lq50/c;", "T", "(Le50/h;)Lq50/c;", "Lkotlinx/coroutines/Job;", "P", "()Lkotlinx/coroutines/Job;", Gender.OTHER, "uri", Gender.MALE, "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Q", "v", "Ln40/h0;", "w", "Lz50/p;", "x", "Lj40/f;", "y", "Ln40/b0;", "z", "Lo50/f;", "A", "Lo30/d;", "B", "Lh50/f;", "C", "Le50/a;", "Lz50/b;", "D", "Lz50/b;", "searchJob", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", Gender.FEMALE, "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i extends s50.i<NetworkingLinkSignupState> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int F = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final h50.f presentSheet;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final e50.a linkSignupHandler;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private z50.b searchJob;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final h0 lookupAccount;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final z50.p uriUtils;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le50/h$b;", "<anonymous>", "()Le50/h$b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super NetworkingLinkSignupState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62001n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ NetworkingLinkSignupState f62002o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ i f62003p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(NetworkingLinkSignupState networkingLinkSignupState, i iVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f62002o = networkingLinkSignupState;
            this.f62003p = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return new a(this.f62002o, this.f62003p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            NetworkingLinkSignupState.Content contentA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f62001n;
            if (i11 == 0) {
                jn0.t.b(obj);
                b0.a aVar = this.f62002o.getIsInstantDebits() ? b0.a.c.f93055a : b0.a.C1985a.f93053a;
                b0 b0Var = this.f62003p.getOrFetchSync;
                this.f62001n = 1;
                objA = b0Var.a(aVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = obj;
            }
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) objA;
            TextUpdate text = synchronizeSessionResponse.getText();
            NetworkingLinkSignupState.Content contentB = null;
            if (text != null) {
                LinkLoginPane linkLoginPane = text.getLinkLoginPane();
                if (linkLoginPane == null || (contentA = e50.j.a(linkLoginPane)) == null) {
                    NetworkingLinkSignupPane networkingLinkSignupPane = text.getNetworkingLinkSignupPane();
                    if (networkingLinkSignupPane != null) {
                        contentB = e50.j.b(networkingLinkSignupPane);
                    }
                } else {
                    contentB = contentA;
                }
            }
            NetworkingLinkSignupState.Content content = contentB;
            this.f62003p.eventTracker.a(new FinancialConnectionsEvent.w(this.f62003p.F()));
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String strC = p022s40.k.c(synchronizeSessionResponse.getManifest());
            r1 r1Var = new r1(new a0(i40.k.f75851a0), false, synchronizeSessionResponse.getManifest().getAccountholderCustomerEmailAddress());
            q0.Companion companion = q0.INSTANCE;
            String accountholderPhoneNumber = synchronizeSessionResponse.getManifest().getAccountholderPhoneNumber();
            if (accountholderPhoneNumber == null) {
                accountholderPhoneNumber = "";
            }
            return new NetworkingLinkSignupState.Payload(strC, r1Var, q0.Companion.b(companion, accountholderPhoneNumber, null, null, false, false, 30, null), this.f62002o.getIsInstantDebits(), content);
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super NetworkingLinkSignupState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le50/h;", "Ls50/a;", "Le50/h$b;", "it", "a", "(Le50/h;Ls50/a;)Le50/h;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<NetworkingLinkSignupState, s50.a<? extends NetworkingLinkSignupState.Payload>, NetworkingLinkSignupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f62004c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState execute, s50.a<NetworkingLinkSignupState.Payload> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return NetworkingLinkSignupState.b(execute, it, null, null, null, null, null, false, 126, null);
        }
    }

    /* JADX INFO: renamed from: e50.i$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Le50/i$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "", "SEARCH_DEBOUNCE_FINISHED_EMAIL_MS", "J", "SEARCH_DEBOUNCE_MS", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: e50.i$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Le50/i;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Le50/i;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<CreationExtras, i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f62005c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f62005c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i invoke(CreationExtras initializer) {
                p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
                return this.f62005c.g().a(new NetworkingLinkSignupState(this.f62005c.a().h().getValue()));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            p013kotlin.jvm.internal.s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(i.class), new a(parentComponent));
            return bVar.b();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/i$d;", "", "Le50/h;", "initialState", "Le50/i;", "a", "(Le50/h;)Le50/i;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        i a(NetworkingLinkSignupState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/u;", "consumerSession", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/model/u;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeLookupAccountResult$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<ConsumerSessionLookup, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62007n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f62008o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ConsumerSessionLookup consumerSessionLookup, Continuation<? super jn0.h0> continuation) {
            return ((f) create(consumerSessionLookup, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            f fVar = i.this.new f(continuation);
            fVar.f62008o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62007n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (((ConsumerSessionLookup) this.f62008o).getExists()) {
                i.this.eventTracker.a(new FinancialConnectionsEvent.u(i.this.F()));
                i.this.G();
            } else {
                i.this.eventTracker.a(new FinancialConnectionsEvent.t(i.this.F()));
            }
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeLookupAccountResult$3", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<Throwable, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62010n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f62011o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            g gVar = i.this.new g(continuation);
            gVar.f62011o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62010n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            j40.h.b(i.this.eventTracker, "Error looking up account", (Throwable) this.f62011o, i.this.logger, i.this.F());
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super jn0.h0> continuation) {
            return ((g) create(th2, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: e50.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le50/h$b;", StatusResponse.PAYLOAD, "Ljn0/h0;", "<anonymous>", "(Le50/h$b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1270i extends SuspendLambda implements wn0.p<NetworkingLinkSignupState.Payload, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62014n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f62015o;

        /* JADX INFO: renamed from: e50.i$i$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f62017n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ i f62018o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ NetworkingLinkSignupState.Payload f62019p;

            /* JADX INFO: renamed from: e50.i$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class C1271a extends p013kotlin.jvm.internal.p implements wn0.p<String, Continuation<? super jn0.h0>, Object>, SuspendFunction {
                C1271a(Object obj) {
                    super(2, obj, i.class, "onEmailEntered", "onEmailEntered(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super jn0.h0> continuation) {
                    return ((i) this.receiver).N(str, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, NetworkingLinkSignupState.Payload payload, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f62018o = iVar;
                this.f62019p = payload;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f62018o, this.f62019p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f62017n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    StateFlow stateFlowU = this.f62018o.U(this.f62019p.getEmailController());
                    C1271a c1271a = new C1271a(this.f62018o);
                    this.f62017n = 1;
                    if (FlowKt.collectLatest(stateFlowU, c1271a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: e50.i$i$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f62020n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ i f62021o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ NetworkingLinkSignupState.Payload f62022p;

            /* JADX INFO: renamed from: e50.i$i$b$a */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$2$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends SuspendLambda implements wn0.p<String, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f62023n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f62024o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ i f62025p;

                /* JADX INFO: renamed from: e50.i$i$b$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le50/h;", "a", "(Le50/h;)Le50/h;"}, k = 3, mv = {1, 9, 0})
                static final class C1272a extends p013kotlin.jvm.internal.u implements wn0.l<NetworkingLinkSignupState, NetworkingLinkSignupState> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f62026c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1272a(String str) {
                        super(1);
                        this.f62026c = str;
                    }

                    @Override // wn0.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState setState) {
                        p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                        return NetworkingLinkSignupState.b(setState, null, null, this.f62026c, null, null, null, false, 123, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(i iVar, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f62025p = iVar;
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super jn0.h0> continuation) {
                    return ((a) create(str, continuation)).invokeSuspend(jn0.h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f62025p, continuation);
                    aVar.f62024o = obj;
                    return aVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f62023n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    this.f62025p.k(new C1272a((String) this.f62024o));
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar, NetworkingLinkSignupState.Payload payload, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f62021o = iVar;
                this.f62022p = payload;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f62021o, this.f62022p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f62020n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    StateFlow stateFlowU = this.f62021o.U(this.f62022p.getPhoneController());
                    a aVar = new a(this.f62021o, null);
                    this.f62020n = 1;
                    if (FlowKt.collectLatest(stateFlowU, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        C1270i(Continuation<? super C1270i> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkingLinkSignupState.Payload payload, Continuation<? super jn0.h0> continuation) {
            return ((C1270i) create(payload, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            C1270i c1270i = i.this.new C1270i(continuation);
            c1270i.f62015o = obj;
            return c1270i;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62014n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) this.f62015o;
            BuildersKt__Builders_commonKt.launch$default(d1.a(i.this), null, null, new a(i.this, payload, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(d1.a(i.this), null, null, new b(i.this, payload, null), 3, null);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$3", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<Throwable, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62027n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f62028o;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            j jVar = i.this.new j(continuation);
            jVar.f62028o = obj;
            return jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62027n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            j40.h.b(i.this.eventTracker, "Error fetching payload", (Throwable) this.f62028o, i.this.logger, i.this.F());
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super jn0.h0> continuation) {
            return ((j) create(th2, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPane", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeSaveAccountResult$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<FinancialConnectionsSessionManifest.Pane, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62031n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f62032o;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FinancialConnectionsSessionManifest.Pane pane, Continuation<? super jn0.h0> continuation) {
            return ((l) create(pane, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            l lVar = i.this.new l(continuation);
            lVar.f62032o = obj;
            return lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62031n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            o50.f.a.a(i.this.navigationManager, o50.b.k(o50.d.a((FinancialConnectionsSessionManifest.Pane) this.f62032o), i.this.F(), null, 2, null), null, false, 6, null);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class m extends p013kotlin.jvm.internal.a implements wn0.p<Throwable, Continuation<? super jn0.h0>, Object>, SuspendFunction {
        m(Object obj) {
            super(2, obj, e50.a.class, "handleSignupFailure", "handleSignupFailure(Ljava/lang/Throwable;)V", 4);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, Continuation<? super jn0.h0> continuation) {
            return i.L((e50.a) this.receiver, th2, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onClickableTextClick$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62034n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f62036p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le50/h;", "a", "(Le50/h;)Le50/h;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<NetworkingLinkSignupState, NetworkingLinkSignupState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f62037c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Date f62038d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Date date) {
                super(1);
                this.f62037c = str;
                this.f62038d = date;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return NetworkingLinkSignupState.b(setState, null, null, null, null, null, new NetworkingLinkSignupState.c.OpenUrl(this.f62037c, this.f62038d.getTime()), false, 95, null);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f62039a;

            static {
                int[] iArr = new int[e50.f.values().length];
                try {
                    iArr[e50.f.LEGAL_DETAILS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f62039a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f62036p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new n(this.f62036p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e50.f next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62034n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            String strB = i.this.uriUtils.b(this.f62036p, "eventName");
            if (strB != null) {
                i iVar = i.this;
                iVar.eventTracker.a(new FinancialConnectionsEvent.h(strB, iVar.F()));
            }
            Date date = new Date();
            if (URLUtil.isNetworkUrl(this.f62036p)) {
                i.this.k(new a(this.f62036p, date));
            } else {
                EnumEntries<e50.f> entries = e50.f.getEntries();
                i iVar2 = i.this;
                String str = this.f62036p;
                Iterator<e50.f> it = entries.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!iVar2.uriUtils.a(next.getValue(), str));
                e50.f fVar = next;
                int i11 = fVar == null ? -1 : b.f62039a[fVar.ordinal()];
                if (i11 == -1) {
                    o30.d.b.a(i.this.logger, "Unrecognized clickable text: " + this.f62036p, null, 2, null);
                } else if (i11 == 1) {
                    i.this.R();
                }
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le50/h;", "a", "(Le50/h;)Le50/h;"}, k = 3, mv = {1, 9, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.l<NetworkingLinkSignupState, NetworkingLinkSignupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f62040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(1);
            this.f62040c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return NetworkingLinkSignupState.b(setState, null, this.f62040c, null, null, null, null, false, 125, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/model/u;", "<anonymous>", "()Lcom/stripe/android/model/u;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onEmailEntered$3", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {196, 197}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.l<Continuation<? super ConsumerSessionLookup>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62041n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f62043p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, Continuation<? super p> continuation) {
            super(1, continuation);
            this.f62043p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return i.this.new p(this.f62043p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f62041n;
            if (i11 == 0) {
                jn0.t.b(obj);
                long jE = i.this.E(this.f62043p);
                this.f62041n = 1;
                if (DelayKt.delay(jE, this) != coroutine_suspended) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            h0 h0Var = i.this.lookupAccount;
            String str = this.f62043p;
            this.f62041n = 2;
            Object objA = h0Var.a(str, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super ConsumerSessionLookup> continuation) {
            return ((p) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le50/h;", "Ls50/a;", "Lcom/stripe/android/model/u;", "it", "a", "(Le50/h;Ls50/a;)Le50/h;"}, k = 3, mv = {1, 9, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.p<NetworkingLinkSignupState, s50.a<? extends ConsumerSessionLookup>, NetworkingLinkSignupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f62044c = new q();

        q() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState execute, s50.a<ConsumerSessionLookup> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (z50.n.b(it)) {
                it = s50.a.d.f110198b;
            }
            return NetworkingLinkSignupState.b(execute, null, null, null, null, it, null, false, 111, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le50/h;", "a", "(Le50/h;)Le50/h;"}, k = 3, mv = {1, 9, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<NetworkingLinkSignupState, NetworkingLinkSignupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f62045c = new r();

        r() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return NetworkingLinkSignupState.b(setState, null, null, null, null, s50.a.d.f110198b, null, false, 111, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le50/h;", "state", "Ljn0/h0;", "a", "(Le50/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.l<NetworkingLinkSignupState, jn0.h0> {
        s() {
            super(1);
        }

        public final void a(NetworkingLinkSignupState state) {
            p013kotlin.jvm.internal.s.k(state, "state");
            i.this.eventTracker.a(new FinancialConnectionsEvent.h("click.save_to_link", i.this.F()));
            ConsumerSessionLookup consumerSessionLookupA = state.c().a();
            if (consumerSessionLookupA == null || !consumerSessionLookupA.getExists()) {
                i.this.S();
            } else {
                i.this.G();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(NetworkingLinkSignupState networkingLinkSignupState) {
            a(networkingLinkSignupState);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onSkipClick$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62047n;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new t(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62047n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            i.this.eventTracker.a(new FinancialConnectionsEvent.h("click.not_now", i.this.F()));
            o50.f.a.a(i.this.navigationManager, o50.b.k(o50.b.y.f96764i, i.this.F(), null, 2, null), null, false, 6, null);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le50/h;", "a", "(Le50/h;)Le50/h;"}, k = 3, mv = {1, 9, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.l<NetworkingLinkSignupState, NetworkingLinkSignupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f62049c = new u();

        u() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return NetworkingLinkSignupState.b(setState, null, null, null, null, null, null, false, 95, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$saveNewAccount$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class v extends SuspendLambda implements wn0.l<Continuation<? super FinancialConnectionsSessionManifest.Pane>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62050n;

        v(Continuation<? super v> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return i.this.new v(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f62050n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            NetworkingLinkSignupState value = i.this.h().getValue();
            e50.a aVar = i.this.linkSignupHandler;
            this.f62050n = 1;
            Object objA = aVar.a(value, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest.Pane> continuation) {
            return ((v) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le50/h;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "it", "a", "(Le50/h;Ls50/a;)Le50/h;"}, k = 3, mv = {1, 9, 0})
    static final class w extends p013kotlin.jvm.internal.u implements wn0.p<NetworkingLinkSignupState, s50.a<? extends FinancialConnectionsSessionManifest.Pane>, NetworkingLinkSignupState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f62052c = new w();

        w() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupState invoke(NetworkingLinkSignupState execute, s50.a<? extends FinancialConnectionsSessionManifest.Pane> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return NetworkingLinkSignupState.b(execute, null, null, null, it, null, null, false, 119, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class x implements Flow<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f62053a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f62054a;

            /* JADX INFO: renamed from: e50.i$x$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C1273a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f62055n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f62056o;

                public C1273a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f62055n = obj;
                    this.f62056o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f62054a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C1273a c1273a;
                if (continuation instanceof C1273a) {
                    c1273a = (C1273a) continuation;
                    int i11 = c1273a.f62056o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1273a.f62056o = i11 - Integer.MIN_VALUE;
                    } else {
                        c1273a = new C1273a(continuation);
                    }
                } else {
                    c1273a = new C1273a(continuation);
                }
                Object obj2 = c1273a.f62055n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c1273a.f62056o;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f62054a;
                    FormFieldEntry formFieldEntry = (FormFieldEntry) obj;
                    if (!formFieldEntry.getIsComplete()) {
                        formFieldEntry = null;
                    }
                    String value = formFieldEntry != null ? formFieldEntry.getValue() : null;
                    c1273a.f62056o = 1;
                    if (flowCollector.emit(value, c1273a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj2);
                }
                return jn0.h0.f84049a;
            }
        }

        public x(Flow flow) {
            this.f62053a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.f62053a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NetworkingLinkSignupState initialState, p0 nativeAuthFlowCoordinator, h0 lookupAccount, z50.p uriUtils, j40.f eventTracker, b0 getOrFetchSync, o50.f navigationManager, o30.d logger, h50.f presentSheet, e50.a linkSignupHandler) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        p013kotlin.jvm.internal.s.k(lookupAccount, "lookupAccount");
        p013kotlin.jvm.internal.s.k(uriUtils, "uriUtils");
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(presentSheet, "presentSheet");
        p013kotlin.jvm.internal.s.k(linkSignupHandler, "linkSignupHandler");
        this.lookupAccount = lookupAccount;
        this.uriUtils = uriUtils;
        this.eventTracker = eventTracker;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.logger = logger;
        this.presentSheet = presentSheet;
        this.linkSignupHandler = linkSignupHandler;
        this.searchJob = new z50.b();
        H();
        s50.i.g(this, new a(initialState, this, null), null, b.f62004c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long E(String validEmail) {
        return p013kotlin.text.t.L(validEmail, ".com", false, 2, null) ? 300L : 1000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FinancialConnectionsSessionManifest.Pane F() {
        return h().getValue().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        this.linkSignupHandler.c();
    }

    private final void H() {
        J();
        K();
        I();
    }

    private final void I() {
        i(new f0() { // from class: e50.i.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingLinkSignupState) obj).c();
            }
        }, new f(null), new g(null));
    }

    private final void J() {
        i(new f0() { // from class: e50.i.h
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingLinkSignupState) obj).e();
            }
        }, new C1270i(null), new j(null));
    }

    private final void K() {
        i(new f0() { // from class: e50.i.k
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((NetworkingLinkSignupState) obj).f();
            }
        }, new l(null), new m(this.linkSignupHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object L(e50.a aVar, Throwable th2, Continuation continuation) {
        aVar.b(th2);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(String str, Continuation<? super jn0.h0> continuation) {
        k(new o(str));
        if (str != null) {
            this.logger.debug("VALID EMAIL ADDRESS " + str + ".");
            this.searchJob.b(s50.i.g(this, new p(str, null), null, q.f62044c, 1, null));
        } else {
            k(r.f62045c);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        NetworkingLinkSignupState.Content content;
        LegalDetailsNotice legalDetailsNotice;
        NetworkingLinkSignupState.Payload payloadA = h().getValue().e().a();
        if (payloadA == null || (content = payloadA.getContent()) == null || (legalDetailsNotice = content.getLegalDetailsNotice()) == null) {
            return;
        }
        this.presentSheet.a(new NoticeSheetState.a.Legal(legalDetailsNotice), F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        s50.i.g(this, new v(null), null, w.f62052c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateFlow<String> U(p010i90.h0 h0Var) {
        return FlowKt.stateIn(new x(h0Var.m()), d1.a(this), SharingStarted.INSTANCE.getLazily(), null);
    }

    public final Job M(String uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new n(uri, null), 3, null);
    }

    public final void O() {
        n(new s());
    }

    public final Job P() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new t(null), 3, null);
    }

    public final void Q() {
        k(u.f62049c);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(NetworkingLinkSignupState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return new TopAppBarStateUpdate(F(), state.getIsInstantDebits(), z50.n.a(state.e()), null, false, 24, null);
    }
}
