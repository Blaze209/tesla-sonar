package y40;

import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.actions.SearchIntents;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import ezvcard.property.Gender;
import j40.FinancialConnectionsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.s;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import n40.b0;
import n40.b1;
import n40.d0;
import n40.p0;
import n40.p1;
import n40.q;
import n40.z1;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002EFBk\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001d\u0010/\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001c¢\u0006\u0004\b1\u0010\u001eJ\r\u00102\u001a\u00020\u001c¢\u0006\u0004\b2\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010>R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010?R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010@R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010B¨\u0006G"}, d2 = {"Ly40/d;", "Ls50/i;", "Ly40/c;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Ln40/b1;", "postAuthorizationSession", "Ln40/b0;", "getOrFetchSync", "Ln40/p1;", "searchInstitutions", "Ln40/q;", "featuredInstitutions", "Lj40/f;", "eventTracker", "Ln40/d0;", "handleError", "Lo50/f;", "navigationManager", "Ln40/z1;", "updateLocalManifest", "Lo30/d;", "logger", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Ln40/b1;Ln40/b0;Ln40/p1;Ln40/q;Lj40/f;Ln40/d0;Lo50/f;Ln40/z1;Lo30/d;Ly40/c;Ln40/p0;)V", "Ljn0/h0;", "z", "()V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authSession", "A", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "state", "Lq50/c;", Gender.FEMALE, "(Ly40/c;)Lq50/c;", "", SearchIntents.EXTRA_QUERY, "D", "(Ljava/lang/String;)V", "Lcom/stripe/android/financialconnections/model/q;", "institution", "", "fromFeatured", "B", "(Lcom/stripe/android/financialconnections/model/q;Z)V", "C", "E", "v", "Lcom/stripe/android/financialconnections/a$b;", "w", "Ln40/b1;", "x", "Ln40/b0;", "y", "Ln40/p1;", "Ln40/q;", "Lj40/f;", "Ln40/d0;", "Lo50/f;", "Ln40/z1;", "Lo30/d;", "Lz50/b;", "Lz50/b;", "searchJob", "G", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends s50.i<InstitutionPickerState> {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int H = 8;
    private static final FinancialConnectionsSessionManifest.Pane I = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final d0 handleError;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final z1 updateLocalManifest;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private z50.b searchJob;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final b1 postAuthorizationSession;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p1 searchInstitutions;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final q featuredInstitutions;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly40/c$a;", "<anonymous>", "()Ly40/c$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$1", f = "InstitutionPickerViewModel.kt", i = {1, 1}, l = {73, 76}, m = "invokeSuspend", n = {"manifest", "startTime$iv"}, s = {"L$0", "J$0"})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super InstitutionPickerState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f124901n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f124902o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f124903p;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008c  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest manifest;
            d dVar;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Throwable th2;
            long j11;
            Object objB;
            d dVar2;
            Throwable thE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f124903p;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    b0 b0Var = d.this.getOrFetchSync;
                    this.f124903p = 1;
                    obj = b0.b(b0Var, null, this, 1, null);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = this.f124902o;
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.f124901n;
                    try {
                        t.b(obj);
                        objB = s.b(x.a((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j11)));
                    } catch (Throwable th3) {
                        th2 = th3;
                        s.Companion companion = s.INSTANCE;
                        objB = s.b(t.a(th2));
                    }
                    dVar2 = d.this;
                    thE = s.e(objB);
                    if (thE != null) {
                        j40.h.b(dVar2.eventTracker, "Error fetching featured institutions", thE, dVar2.logger, d.I);
                    }
                    if (s.e(objB) != null) {
                        objB = x.a(new InstitutionResponse(Boxing.boxBoolean(financialConnectionsSessionManifest.getAllowManualEntry()), v.m()), Boxing.boxLong(0L));
                    }
                    Pair pair = (Pair) objB;
                    return new InstitutionPickerState.Payload((InstitutionResponse) pair.a(), financialConnectionsSessionManifest.getInstitutionSearchDisabled(), ((Number) pair.b()).longValue());
                }
                t.b(obj);
                s.Companion companion2 = s.INSTANCE;
                long jCurrentTimeMillis = System.currentTimeMillis();
                q qVar = dVar.featuredInstitutions;
                String financialConnectionsSessionClientSecret = dVar.configuration.getFinancialConnectionsSessionClientSecret();
                this.f124901n = manifest;
                this.f124902o = jCurrentTimeMillis;
                this.f124903p = 2;
                Object objA = qVar.a(financialConnectionsSessionClientSecret, this);
                if (objA != coroutine_suspended) {
                    financialConnectionsSessionManifest = manifest;
                    obj = objA;
                    j11 = jCurrentTimeMillis;
                    objB = s.b(x.a((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j11)));
                    dVar2 = d.this;
                    thE = s.e(objB);
                    if (thE != null) {
                        j40.h.b(dVar2.eventTracker, "Error fetching featured institutions", thE, dVar2.logger, d.I);
                    }
                    if (s.e(objB) != null) {
                        objB = x.a(new InstitutionResponse(Boxing.boxBoolean(financialConnectionsSessionManifest.getAllowManualEntry()), v.m()), Boxing.boxLong(0L));
                    }
                    Pair pair2 = (Pair) objB;
                    return new InstitutionPickerState.Payload((InstitutionResponse) pair2.a(), financialConnectionsSessionManifest.getInstitutionSearchDisabled(), ((Number) pair2.b()).longValue());
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                financialConnectionsSessionManifest = manifest;
                th2 = th4;
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            manifest = ((SynchronizeSessionResponse) obj).getManifest();
            dVar = d.this;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super InstitutionPickerState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly40/c;", "Ls50/a;", "Ly40/c$a;", "it", "a", "(Ly40/c;Ls50/a;)Ly40/c;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.p<InstitutionPickerState, s50.a<? extends InstitutionPickerState.Payload>, InstitutionPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f124905c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InstitutionPickerState invoke(InstitutionPickerState execute, s50.a<InstitutionPickerState.Payload> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return InstitutionPickerState.b(execute, null, null, it, null, null, null, 59, null);
        }
    }

    /* JADX INFO: renamed from: y40.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly40/d$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;Landroid/os/Bundle;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "SEARCH_DEBOUNCE_MS", "J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: y40.d$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Ly40/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Ly40/d;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<CreationExtras, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f124906c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ m40.p f124907d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bundle bundle, m40.p pVar) {
                super(1);
                this.f124906c = bundle;
                this.f124907d = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(CreationExtras initializer) {
                p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
                return this.f124907d.n().a(new InstitutionPickerState(this.f124906c));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent, Bundle arguments) {
            p013kotlin.jvm.internal.s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(d.class), new a(arguments, parentComponent));
            return bVar.b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: y40.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly40/d$d;", "", "Ly40/c;", "initialState", "Ly40/d;", "a", "(Ly40/c;)Ly40/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC2702d {
        d a(InstitutionPickerState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly40/c$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "<anonymous>", "(Ly40/c$a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$2", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<InstitutionPickerState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124909n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f124910o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InstitutionPickerState.Payload payload, Continuation<? super h0> continuation) {
            return ((f) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = d.this.new f(continuation);
            fVar.f124910o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f124909n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            InstitutionPickerState.Payload payload = (InstitutionPickerState.Payload) this.f124910o;
            d.this.eventTracker.a(new FinancialConnectionsEvent.w(d.I));
            j40.f fVar = d.this.eventTracker;
            FinancialConnectionsSessionManifest.Pane pane = d.I;
            long featuredInstitutionsDuration = payload.getFeaturedInstitutionsDuration();
            List<FinancialConnectionsInstitution> listB = payload.getFeaturedInstitutions().b();
            ArrayList arrayList = new ArrayList(v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((FinancialConnectionsInstitution) it.next()).getId());
            }
            fVar.a(new FinancialConnectionsEvent.r(v.r1(arrayList), featuredInstitutionsDuration, pane));
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$3", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124912n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f124913o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = d.this.new g(continuation);
            gVar.f124913o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f124912n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.handleError.a("Error fetching initial payload", (Throwable) this.f124913o, d.I, true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((g) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$5", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124916n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f124917o;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            i iVar = d.this.new i(continuation);
            iVar.f124917o = obj;
            return iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f124916n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.handleError.a("Error searching institutions", (Throwable) this.f124917o, d.I, false);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((i) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$logErrors$7", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124920n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f124921o;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            k kVar = d.this.new k(continuation);
            kVar.f124921o = obj;
            return kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f124920n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.handleError.a("Error selecting or creating session for institution", (Throwable) this.f124921o, d.I, true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((k) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onInstitutionSelected$1", f = "InstitutionPickerViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f124923n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f124924o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f124925p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f124927r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsInstitution f124928s;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "it", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsInstitution f124929c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FinancialConnectionsInstitution financialConnectionsInstitution) {
                super(1);
                this.f124929c = financialConnectionsInstitution;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinancialConnectionsSessionManifest invoke(FinancialConnectionsSessionManifest it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                return it.b(((-4194305) & 1) != 0 ? it.allowManualEntry : false, ((-4194305) & 2) != 0 ? it.consentRequired : false, ((-4194305) & 4) != 0 ? it.customManualEntryHandling : false, ((-4194305) & 8) != 0 ? it.disableLinkMoreAccounts : false, ((-4194305) & 16) != 0 ? it.id : null, ((-4194305) & 32) != 0 ? it.instantVerificationDisabled : false, ((-4194305) & 64) != 0 ? it.institutionSearchDisabled : false, ((-4194305) & 128) != 0 ? it.livemode : false, ((-4194305) & 256) != 0 ? it.manualEntryUsesMicrodeposits : false, ((-4194305) & 512) != 0 ? it.mobileHandoffEnabled : false, ((-4194305) & 1024) != 0 ? it.nextPane : null, ((-4194305) & 2048) != 0 ? it.manualEntryMode : null, ((-4194305) & 4096) != 0 ? it.permissions : null, ((-4194305) & PKIFailureInfo.certRevoked) != 0 ? it.product : null, ((-4194305) & 16384) != 0 ? it.singleAccount : false, ((-4194305) & 32768) != 0 ? it.useSingleSortSearch : false, ((-4194305) & 65536) != 0 ? it.accountDisconnectionMethod : null, ((-4194305) & 131072) != 0 ? it.accountholderCustomerEmailAddress : null, ((-4194305) & 262144) != 0 ? it.accountholderIsLinkConsumer : null, ((-4194305) & PKIFailureInfo.signerNotTrusted) != 0 ? it.accountholderPhoneNumber : null, ((-4194305) & PKIFailureInfo.badCertTemplate) != 0 ? it.accountholderToken : null, ((-4194305) & PKIFailureInfo.badSenderNonce) != 0 ? it.activeAuthSession : null, ((-4194305) & 4194304) != 0 ? it.activeInstitution : this.f124929c, ((-4194305) & 8388608) != 0 ? it.assignmentEventId : null, ((-4194305) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? it.businessName : null, ((-4194305) & 33554432) != 0 ? it.cancelUrl : null, ((-4194305) & 67108864) != 0 ? it.connectPlatformName : null, ((-4194305) & 134217728) != 0 ? it.connectedAccountName : null, ((-4194305) & 268435456) != 0 ? it.experimentAssignments : null, ((-4194305) & PKIFailureInfo.duplicateCertReq) != 0 ? it.displayText : null, ((-4194305) & 1073741824) != 0 ? it.features : null, ((-4194305) & Integer.MIN_VALUE) != 0 ? it.hostedAuthUrl : null, (4095 & 1) != 0 ? it.initialInstitution : null, (4095 & 2) != 0 ? it.isEndUserFacing : null, (4095 & 4) != 0 ? it.isLinkWithStripe : null, (4095 & 8) != 0 ? it.isNetworkingUserFlow : null, (4095 & 16) != 0 ? it.isStripeDirect : null, (4095 & 32) != 0 ? it.linkAccountSessionCancellationBehavior : null, (4095 & 64) != 0 ? it.modalCustomization : null, (4095 & 128) != 0 ? it.paymentMethodType : null, (4095 & 256) != 0 ? it.stepUpAuthenticationRequired : null, (4095 & 512) != 0 ? it.successUrl : null, (4095 & 1024) != 0 ? it.skipSuccessPane : null, (4095 & 2048) != 0 ? it.theme : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z11, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super l> continuation) {
            super(1, continuation);
            this.f124927r = z11;
            this.f124928s = financialConnectionsInstitution;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return d.this.new l(this.f124927r, this.f124928s, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
        
            if (r13 == r0) goto L16;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.stripe.android.core.exception.StripeException {
            /*
                r12 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f124925p
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                jn0.t.b(r13)
                goto L98
            L14:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1c:
                java.lang.Object r1 = r12.f124924o
                com.stripe.android.financialconnections.model.q r1 = (com.stripe.android.financialconnections.model.FinancialConnectionsInstitution) r1
                java.lang.Object r3 = r12.f124923n
                n40.b1 r3 = (n40.b1) r3
                jn0.t.b(r13)
                goto L89
            L28:
                jn0.t.b(r13)
                y40.d r13 = y40.d.this
                j40.f r13 = y40.d.p(r13)
                j40.e$s r1 = new j40.e$s
                com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest$Pane r5 = y40.d.u()
                boolean r6 = r12.f124927r
                com.stripe.android.financialconnections.model.q r7 = r12.f124928s
                java.lang.String r7 = r7.getId()
                r1.<init>(r5, r6, r7)
                r13.a(r1)
                i40.a r13 = i40.a.f75822a
                j40.i$c r1 = j40.FinancialConnectionsEvent.c.INSTITUTION_SELECTED
                j40.i$b r5 = new j40.i$b
                com.stripe.android.financialconnections.model.q r6 = r12.f124928s
                java.lang.String r6 = r6.getName()
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r13.b(r1, r5)
                y40.d r13 = y40.d.this
                n40.z1 r13 = y40.d.x(r13)
                y40.d$l$a r1 = new y40.d$l$a
                com.stripe.android.financialconnections.model.q r5 = r12.f124928s
                r1.<init>(r5)
                r13.a(r1)
                y40.d r13 = y40.d.this
                n40.b1 r13 = y40.d.v(r13)
                com.stripe.android.financialconnections.model.q r1 = r12.f124928s
                y40.d r5 = y40.d.this
                n40.b0 r5 = y40.d.r(r5)
                r12.f124923n = r13
                r12.f124924o = r1
                r12.f124925p = r3
                java.lang.Object r3 = n40.b0.b(r5, r4, r12, r3, r4)
                if (r3 != r0) goto L86
                goto L97
            L86:
                r11 = r3
                r3 = r13
                r13 = r11
            L89:
                com.stripe.android.financialconnections.model.k0 r13 = (com.stripe.android.financialconnections.model.SynchronizeSessionResponse) r13
                r12.f124923n = r4
                r12.f124924o = r4
                r12.f124925p = r2
                java.lang.Object r13 = r3.a(r1, r13, r12)
                if (r13 != r0) goto L98
            L97:
                return r0
            L98:
                com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession r13 = (com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession) r13
                y40.d r0 = y40.d.this
                y40.d.y(r0, r13)
                jn0.h0 r13 = jn0.h0.f84049a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: y40.d.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((l) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly40/c;", "Ls50/a;", "Ljn0/h0;", BaseJavaModule.METHOD_TYPE_ASYNC, "a", "(Ly40/c;Ls50/a;)Ly40/c;"}, k = 3, mv = {1, 9, 0})
    static final class m extends u implements wn0.p<InstitutionPickerState, s50.a<? extends h0>, InstitutionPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsInstitution f124930c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(FinancialConnectionsInstitution financialConnectionsInstitution) {
            super(2);
            this.f124930c = financialConnectionsInstitution;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InstitutionPickerState invoke(InstitutionPickerState execute, s50.a<h0> async) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(async, "async");
            String id2 = this.f124930c.getId();
            if (!(async instanceof s50.a.Loading)) {
                id2 = null;
            }
            return InstitutionPickerState.b(execute, null, id2, null, null, async, null, 45, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/model/s;", "<anonymous>", "()Lcom/stripe/android/financialconnections/model/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onQueryChanged$1", f = "InstitutionPickerViewModel.kt", i = {1}, l = {164, 166}, m = "invokeSuspend", n = {"startTime$iv"}, s = {"J$0"})
    static final class n extends SuspendLambda implements wn0.l<Continuation<? super InstitutionResponse>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f124931n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f124932o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f124933p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ d f124934q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, d dVar, Continuation<? super n> continuation) {
            super(1, continuation);
            this.f124933p = str;
            this.f124934q = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new n(this.f124933p, this.f124934q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f124932o;
            if (i11 == 0) {
                t.b(obj);
                if (p013kotlin.text.t.y0(this.f124933p)) {
                    return new InstitutionResponse(Boxing.boxBoolean(false), v.m());
                }
                this.f124932o = 1;
                if (DelayKt.delay(300L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.f124931n;
                t.b(obj);
            }
            Pair pairA = x.a((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j11));
            InstitutionResponse institutionResponse = (InstitutionResponse) pairA.a();
            this.f124934q.eventTracker.a(new FinancialConnectionsEvent.b0(d.I, this.f124933p, ((Number) pairA.b()).longValue(), institutionResponse.b().size()));
            i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.SEARCH_INITIATED, null, 2, null);
            return institutionResponse;
            d dVar = this.f124934q;
            String str = this.f124933p;
            long jCurrentTimeMillis = System.currentTimeMillis();
            p1 p1Var = dVar.searchInstitutions;
            String financialConnectionsSessionClientSecret = dVar.configuration.getFinancialConnectionsSessionClientSecret();
            this.f124931n = jCurrentTimeMillis;
            this.f124932o = 2;
            obj = p1Var.a(financialConnectionsSessionClientSecret, str, this);
            if (obj != coroutine_suspended) {
                j11 = jCurrentTimeMillis;
                Pair pairA2 = x.a((InstitutionResponse) obj, Boxing.boxLong(System.currentTimeMillis() - j11));
                InstitutionResponse institutionResponse2 = (InstitutionResponse) pairA2.a();
                this.f124934q.eventTracker.a(new FinancialConnectionsEvent.b0(d.I, this.f124933p, ((Number) pairA2.b()).longValue(), institutionResponse2.b().size()));
                i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.SEARCH_INITIATED, null, 2, null);
                return institutionResponse2;
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super InstitutionResponse> continuation) {
            return ((n) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly40/c;", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/s;", "it", "a", "(Ly40/c;Ls50/a;)Ly40/c;"}, k = 3, mv = {1, 9, 0})
    static final class o extends u implements wn0.p<InstitutionPickerState, s50.a<? extends InstitutionResponse>, InstitutionPickerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f124935c = new o();

        o() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InstitutionPickerState invoke(InstitutionPickerState execute, s50.a<InstitutionResponse> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (z50.n.b(it)) {
                it = new s50.a.Loading<>(null, 1, null);
            }
            return InstitutionPickerState.b(execute, null, null, null, it, null, null, 55, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onScrollChanged$1", f = "InstitutionPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124936n;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new p(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x005e  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set setD;
            List<FinancialConnectionsInstitution> listB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f124936n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            j40.f fVar = d.this.eventTracker;
            FinancialConnectionsSessionManifest.Pane pane = d.I;
            InstitutionResponse institutionResponseA = d.this.h().getValue().g().a();
            if (institutionResponseA == null || (listB = institutionResponseA.b()) == null) {
                setD = d1.d();
            } else {
                List<FinancialConnectionsInstitution> list = listB;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FinancialConnectionsInstitution) it.next()).getId());
                }
                setD = v.r1(arrayList);
                if (setD == null) {
                    setD = d1.d();
                }
            }
            fVar.a(new FinancialConnectionsEvent.a0(setD, pane));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.stripe.android.financialconnections.a.Configuration configuration, b1 postAuthorizationSession, b0 getOrFetchSync, p1 searchInstitutions, q featuredInstitutions, j40.f eventTracker, d0 handleError, o50.f navigationManager, z1 updateLocalManifest, o30.d logger, InstitutionPickerState initialState, p0 nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(postAuthorizationSession, "postAuthorizationSession");
        p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
        p013kotlin.jvm.internal.s.k(searchInstitutions, "searchInstitutions");
        p013kotlin.jvm.internal.s.k(featuredInstitutions, "featuredInstitutions");
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(handleError, "handleError");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        p013kotlin.jvm.internal.s.k(updateLocalManifest, "updateLocalManifest");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.configuration = configuration;
        this.postAuthorizationSession = postAuthorizationSession;
        this.getOrFetchSync = getOrFetchSync;
        this.searchInstitutions = searchInstitutions;
        this.featuredInstitutions = featuredInstitutions;
        this.eventTracker = eventTracker;
        this.handleError = handleError;
        this.navigationManager = navigationManager;
        this.updateLocalManifest = updateLocalManifest;
        this.logger = logger;
        this.searchJob = new z50.b();
        z();
        s50.i.g(this, new a(null), null, b.f124905c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(FinancialConnectionsAuthorizationSession authSession) {
        o50.f.a.a(this.navigationManager, authSession.g() ? o50.b.k(o50.b.w.f96762i, I, null, 2, null) : o50.b.k(o50.b.v.f96761i, I, null, 2, null), null, false, 6, null);
    }

    private final void z() {
        i(new f0() { // from class: y40.d.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((InstitutionPickerState) obj).d();
            }
        }, new f(null), new g(null));
        s50.i.j(this, new f0() { // from class: y40.d.h
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((InstitutionPickerState) obj).g();
            }
        }, null, new i(null), 2, null);
        s50.i.j(this, new f0() { // from class: y40.d.j
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((InstitutionPickerState) obj).c();
            }
        }, null, new k(null), 2, null);
    }

    public final void B(FinancialConnectionsInstitution institution, boolean fromFeatured) {
        p013kotlin.jvm.internal.s.k(institution, "institution");
        s50.i.g(this, new l(fromFeatured, institution, null), null, new m(institution), 1, null);
    }

    public final void C() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.o.f96753i, I, null, 2, null), null, false, 6, null);
    }

    public final void D(String query) {
        p013kotlin.jvm.internal.s.k(query, "query");
        this.searchJob.b(s50.i.g(this, new n(query, this, null), null, o.f124935c, 1, null));
    }

    public final void E() {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new p(null), 3, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(InstitutionPickerState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return new TopAppBarStateUpdate(I, state.getReferrer() != FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, z50.n.a(state.d()), null, false, 8, null);
    }
}
