package q40;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import i40.j;
import j40.FinancialConnectionsEvent;
import j40.h;
import java.util.List;
import jn0.h0;
import jn0.t;
import jn0.x;
import n40.CachedPartnerAccount;
import n40.b0;
import n40.p0;
import n40.s0;
import n40.y;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import s50.i;
import t50.z;
import v50.g;
import wn0.l;
import wn0.p;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+BS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lq40/c;", "Ls50/i;", "Lq40/b;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lt50/z;", "successContentRepository", "Ln40/s0;", "pollAttachPaymentAccount", "Lj40/f;", "eventTracker", "Ln40/y;", "getCachedAccounts", "Lo50/f;", "navigationManager", "Ln40/b0;", "getOrFetchSync", "Lo30/d;", "logger", "<init>", "(Lq40/b;Ln40/p0;Lt50/z;Ln40/s0;Lj40/f;Ln40/y;Lo50/f;Ln40/b0;Lo30/d;)V", "Ljn0/h0;", "w", "()V", "state", "Lq50/c;", "z", "(Lq40/b;)Lq50/c;", "x", "y", "v", "Lt50/z;", "Ln40/s0;", "Lj40/f;", "Ln40/y;", "Lo50/f;", "A", "Ln40/b0;", "B", "Lo30/d;", "C", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends i<AttachPaymentState> {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int D = 8;
    private static final FinancialConnectionsSessionManifest.Pane E = FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final z successContentRepository;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final s0 pollAttachPaymentAccount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final y getCachedAccounts;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$1", f = "AttachPaymentViewModel.kt", i = {1, 1, 1, 1, 2, 2, 2, 2}, l = {50, 54, 57}, m = "invokeSuspend", n = {BaseJavaModule.METHOD_TYPE_SYNC, "manifest", "authSession", "activeInstitution", "manifest", "authSession", "accounts", "startTime$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "J$0"})
    static final class a extends SuspendLambda implements l<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f104793n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f104794o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f104795p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f104796q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f104797r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f104798s;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:40:0x013f  */
        /* JADX WARN: Code duplicated, block: B:43:0x015b  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            SynchronizeSessionResponse synchronizeSessionResponse;
            FinancialConnectionsAuthorizationSession activeAuthSession;
            Object objA;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            FinancialConnectionsInstitution financialConnectionsInstitution;
            List list;
            String linkedAccountId;
            long jCurrentTimeMillis;
            s0 s0Var;
            Object objF;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
            List list2;
            FinancialConnectionsSessionManifest.Pane nextPane;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f104798s;
            if (i11 == 0) {
                t.b(obj);
                b0 b0Var = c.this.getOrFetchSync;
                this.f104798s = 1;
                objB = b0.b(b0Var, null, this, 1, null);
                if (objB != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                t.b(obj);
                objB = obj;
            } else {
                if (i11 == 2) {
                    financialConnectionsInstitution = (FinancialConnectionsInstitution) this.f104796q;
                    activeAuthSession = (FinancialConnectionsAuthorizationSession) this.f104795p;
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.f104794o;
                    synchronizeSessionResponse = (SynchronizeSessionResponse) this.f104793n;
                    t.b(obj);
                    objA = obj;
                    list = (List) objA;
                    linkedAccountId = ((CachedPartnerAccount) v.U0(list)).getLinkedAccountId();
                    c cVar = c.this;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    s0Var = cVar.pollAttachPaymentAccount;
                    if (linkedAccountId != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    m50.c.LinkedAccount linkedAccount = new m50.c.LinkedAccount(linkedAccountId);
                    this.f104793n = financialConnectionsSessionManifest;
                    this.f104794o = activeAuthSession;
                    this.f104795p = list;
                    this.f104796q = null;
                    this.f104797r = jCurrentTimeMillis;
                    this.f104798s = 3;
                    objF = s0Var.f(synchronizeSessionResponse, financialConnectionsInstitution, linkedAccount, this);
                    if (objF != coroutine_suspended) {
                        financialConnectionsAuthorizationSession = activeAuthSession;
                        financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
                        list2 = list;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.f104797r;
                list2 = (List) this.f104795p;
                financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) this.f104794o;
                financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) this.f104793n;
                t.b(obj);
                jCurrentTimeMillis = j11;
                objF = obj;
            }
            Pair pairA = x.a((LinkAccountSessionPaymentAccount) objF, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
            LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) pairA.a();
            long jLongValue = ((Number) pairA.b()).longValue();
            if (s.f(financialConnectionsSessionManifest2.getIsNetworkingUserFlow(), Boxing.boxBoolean(r6)) && s.f(financialConnectionsSessionManifest2.getAccountholderIsLinkConsumer(), Boxing.boxBoolean(true)) && linkAccountSessionPaymentAccount.getNetworkingSuccessful() != null) {
                z.f(c.this.successContentRepository, new g.PluralId(j.f75849e, list2.size(), null, 4, null), null, 2, null);
            }
            c.this.eventTracker.a(new FinancialConnectionsEvent.y(c.E, financialConnectionsAuthorizationSession.getId(), jLongValue));
            nextPane = linkAccountSessionPaymentAccount.getNextPane();
            if (nextPane == null) {
                nextPane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
            }
            o50.f.a.a(c.this.navigationManager, o50.b.k(o50.d.a(nextPane), c.E, null, 2, null), null, false, 6, null);
            return linkAccountSessionPaymentAccount;
            synchronizeSessionResponse = (SynchronizeSessionResponse) objB;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
            if (manifest == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            FinancialConnectionsInstitution activeInstitution = manifest.getActiveInstitution();
            if (activeInstitution == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            y yVar = c.this.getCachedAccounts;
            this.f104793n = synchronizeSessionResponse;
            this.f104794o = manifest;
            this.f104795p = activeAuthSession;
            this.f104796q = activeInstitution;
            this.f104798s = 2;
            objA = yVar.a(this);
            if (objA != coroutine_suspended) {
                financialConnectionsSessionManifest = manifest;
                financialConnectionsInstitution = activeInstitution;
                list = (List) objA;
                linkedAccountId = ((CachedPartnerAccount) v.U0(list)).getLinkedAccountId();
                c cVar2 = c.this;
                jCurrentTimeMillis = System.currentTimeMillis();
                s0Var = cVar2.pollAttachPaymentAccount;
                if (linkedAccountId != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                m50.c.LinkedAccount linkedAccount2 = new m50.c.LinkedAccount(linkedAccountId);
                this.f104793n = financialConnectionsSessionManifest;
                this.f104794o = activeAuthSession;
                this.f104795p = list;
                this.f104796q = null;
                this.f104797r = jCurrentTimeMillis;
                this.f104798s = 3;
                objF = s0Var.f(synchronizeSessionResponse, financialConnectionsInstitution, linkedAccount2, this);
                if (objF != coroutine_suspended) {
                    financialConnectionsAuthorizationSession = activeAuthSession;
                    financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
                    list2 = list;
                    Pair pairA2 = x.a((LinkAccountSessionPaymentAccount) objF, Boxing.boxLong(System.currentTimeMillis() - jCurrentTimeMillis));
                    LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount2 = (LinkAccountSessionPaymentAccount) pairA2.a();
                    long jLongValue2 = ((Number) pairA2.b()).longValue();
                    if (s.f(financialConnectionsSessionManifest2.getIsNetworkingUserFlow(), Boxing.boxBoolean(r6))) {
                        z.f(c.this.successContentRepository, new g.PluralId(j.f75849e, list2.size(), null, 4, null), null, 2, null);
                    }
                    c.this.eventTracker.a(new FinancialConnectionsEvent.y(c.E, financialConnectionsAuthorizationSession.getId(), jLongValue2));
                    nextPane = linkAccountSessionPaymentAccount2.getNextPane();
                    if (nextPane == null) {
                        nextPane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
                    }
                    o50.f.a.a(c.this.navigationManager, o50.b.k(o50.d.a(nextPane), c.E, null, 2, null), null, false, 6, null);
                    return linkAccountSessionPaymentAccount2;
                }
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq40/b;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "it", "a", "(Lq40/b;Ls50/a;)Lq40/b;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<AttachPaymentState, s50.a<? extends LinkAccountSessionPaymentAccount>, AttachPaymentState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f104800c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AttachPaymentState invoke(AttachPaymentState execute, s50.a<LinkAccountSessionPaymentAccount> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return execute.a(it);
        }
    }

    /* JADX INFO: renamed from: q40.c$c, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq40/c$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: q40.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lq40/c;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lq40/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<CreationExtras, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f104801c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f104801c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f104801c.c().a(new AttachPaymentState(null, 1, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(c.class), new a(parentComponent));
            return bVar.b();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq40/c$d;", "", "Lq40/b;", "initialState", "Lq40/c;", "a", "(Lq40/b;)Lq40/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        c a(AttachPaymentState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$logErrors$2", f = "AttachPaymentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f104803n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f104804o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = c.this.new f(continuation);
            fVar.f104804o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f104803n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            h.b(c.this.eventTracker, "Error Attaching payment account", (Throwable) this.f104804o, c.this.logger, c.E);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((f) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AttachPaymentState initialState, p0 nativeAuthFlowCoordinator, z successContentRepository, s0 pollAttachPaymentAccount, j40.f eventTracker, y getCachedAccounts, o50.f navigationManager, b0 getOrFetchSync, o30.d logger) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(successContentRepository, "successContentRepository");
        s.k(pollAttachPaymentAccount, "pollAttachPaymentAccount");
        s.k(eventTracker, "eventTracker");
        s.k(getCachedAccounts, "getCachedAccounts");
        s.k(navigationManager, "navigationManager");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(logger, "logger");
        this.successContentRepository = successContentRepository;
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.eventTracker = eventTracker;
        this.getCachedAccounts = getCachedAccounts;
        this.navigationManager = navigationManager;
        this.getOrFetchSync = getOrFetchSync;
        this.logger = logger;
        w();
        i.g(this, new a(null), null, b.f104800c, 1, null);
    }

    private final void w() {
        i.j(this, new f0() { // from class: q40.c.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((AttachPaymentState) obj).b();
            }
        }, null, new f(null), 2, null);
    }

    public final void x() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.o.f96753i, E, null, 2, null), null, false, 6, null);
    }

    public final void y() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.x.f96763i, E, null, 2, null), null, false, 6, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(AttachPaymentState state) {
        s.k(state, "state");
        return new TopAppBarStateUpdate(E, false, n.a(state.b()), null, false, 24, null);
    }
}
