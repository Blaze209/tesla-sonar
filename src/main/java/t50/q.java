package t50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 K2\u00020\u0001:\u0001:B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J4\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020'0&H\u0096@¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b+\u0010,J(\u0010-\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b-\u0010.J6\u00105\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00102\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0096@¢\u0006\u0004\b5\u00106J \u00107\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b7\u0010\u0014J \u00108\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b8\u0010\u0014J*\u0010:\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b<\u0010,JZ\u0010C\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\u00102\b\u0010>\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00102\b\u0010?\u001a\u0004\u0018\u00010\u00102\b\u0010@\u001a\u0004\u0018\u00010\u00102\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010AH\u0096@¢\u0006\u0004\bC\u0010DJ,\u0010G\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010\u00102\b\u0010F\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\bG\u0010;J\u0018\u0010H\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0004\bH\u0010,J\u0018\u0010I\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0004\bI\u0010,J#\u0010K\u001a\u00020\u00182\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0&H\u0016¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bH\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010`\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b)\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010a¨\u0006c"}, d2 = {"Lt50/q;", "Lt50/p;", "Lr50/a;", "requestExecutor", "Lw30/l$b;", "apiRequestFactory", "Lu50/c;", "provideApiRequestOptions", "Ljava/util/Locale;", "locale", "Lo30/d;", "logger", "Lcom/stripe/android/financialconnections/model/k0;", "initialSync", "<init>", "(Lr50/a;Lw30/l$b;Lu50/c;Ljava/util/Locale;Lo30/d;Lcom/stripe/android/financialconnections/model/k0;)V", "", "applicationId", "clientSecret", "o", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "source", "Lcom/stripe/android/financialconnections/model/q;", "institution", "Ljn0/h0;", "p", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authSession", "q", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "synchronizeSessionResponse", "s", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/k0;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "manifest", "r", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V", "Lkotlin/Function1;", "", "reFetchCondition", "g", "(Ljava/lang/String;Ljava/lang/String;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "clientTimestamp", "sessionId", "", "Lj40/b;", "authSessionEvents", "j", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "c", "publicToken", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", Scopes.EMAIL, PlaceTypes.COUNTRY, "phoneNumber", "consumerSessionClientSecret", "", "selectedAccounts", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disabledReason", "clientSuggestedNextPaneOnDisableNetworking", "b", "e", "k", "block", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/l;)V", "Lr50/a;", "getRequestExecutor", "()Lr50/a;", "Lw30/l$b;", "getApiRequestFactory", "()Lw30/l$b;", "Lu50/c;", "getProvideApiRequestOptions", "()Lu50/c;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "Lo30/d;", "getLogger", "()Lo30/d;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lcom/stripe/android/financialconnections/model/k0;", "cachedSynchronizeSessionResponse", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class q implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r50.a requestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w30.l.b apiRequestFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u50.c provideApiRequestOptions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private SynchronizeSessionResponse cachedSynchronizeSessionResponse;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_DARK_APPEARANCE_VALUE}, m = "cancelAuthorizationSession", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112599n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112600o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112602q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112600o = obj;
            this.f112602q |= Integer.MIN_VALUE;
            return q.this.m(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {356}, m = "completeAuthorizationSession", n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112603n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112604o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112606q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112604o = obj;
            this.f112606q |= Integer.MIN_VALUE;
            return q.this.a(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {433}, m = "disableNetworking", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112607n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112608o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112610q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112608o = obj;
            this.f112610q |= Integer.MIN_VALUE;
            return q.this.b(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0, 0, 0, 0, 0, 1}, l = {564, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "getOrSynchronizeFinancialConnectionsSession", n = {"this", "clientSecret", "applicationId", "reFetchCondition", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112611n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112612o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112613p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f112614q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f112615r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f112616s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f112618u;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112616s = obj;
            this.f112618u |= Integer.MIN_VALUE;
            return q.this.g(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0, 0, 0, 1, 1}, l = {564, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE}, m = "markConsentAcquired", n = {"this", "clientSecret", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112619n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112620o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112621p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f112622q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f112624s;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112622q = obj;
            this.f112624s |= Integer.MIN_VALUE;
            return q.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "postAuthorizationSession", n = {"this", "institution"}, s = {"L$0", "L$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112625n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112626o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f112627p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f112629r;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112627p = obj;
            this.f112629r |= Integer.MIN_VALUE;
            return q.this.f(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {471}, m = "postMarkLinkStepUpVerified", n = {"this"}, s = {"L$0"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112630n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112631o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112633q;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112631o = obj;
            this.f112633q |= Integer.MIN_VALUE;
            return q.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {452}, m = "postMarkLinkVerified", n = {"this"}, s = {"L$0"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112634n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112635o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112637q;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112635o = obj;
            this.f112637q |= Integer.MIN_VALUE;
            return q.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {375}, m = "postMarkLinkingMoreAccounts", n = {"this"}, s = {"L$0"})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112638n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112639o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112641q;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112639o = obj;
            this.f112641q |= Integer.MIN_VALUE;
            return q.this.l(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "postSaveAccountsToLink", n = {"this"}, s = {"L$0"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112642n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112643o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112645q;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112643o = obj;
            this.f112645q |= Integer.MIN_VALUE;
            return q.this.d(null, null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_UPLOAD_VALUE}, m = "retrieveAuthorizationSession", n = {"this"}, s = {"L$0"})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112646n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112647o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112649q;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112647o = obj;
            this.f112649q |= Integer.MIN_VALUE;
            return q.this.c(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "synchronize", n = {"this"}, s = {"L$0"})
    static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f112651o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f112653q;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112651o = obj;
            this.f112653q |= Integer.MIN_VALUE;
            return q.this.o(null, null, this);
        }
    }

    public q(r50.a requestExecutor, w30.l.b apiRequestFactory, u50.c provideApiRequestOptions, Locale locale, o30.d logger, SynchronizeSessionResponse synchronizeSessionResponse) {
        p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
        p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
        p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
        p013kotlin.jvm.internal.s.k(locale, "locale");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        this.requestExecutor = requestExecutor;
        this.apiRequestFactory = apiRequestFactory;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.locale = locale;
        this.logger = logger;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, String str2, Continuation<? super SynchronizeSessionResponse> continuation) {
        m mVar;
        q qVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f112653q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f112653q = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objD = mVar.f112651o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mVar.f112653q;
        if (i12 == 0) {
            jn0.t.b(objD);
            r50.a aVar = this.requestExecutor;
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/financial_connections/sessions/synchronize", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("expand", p013kotlin.collections.v.e("manifest.active_auth_session")), jn0.x.a("emit_events", Boxing.boxBoolean(true)), jn0.x.a("locale", this.locale.toLanguageTag()), jn0.x.a("mobile", v0.m(jn0.x.a("forced_authflow_version", "v3"), jn0.x.a("fullscreen", Boxing.boxBoolean(true)), jn0.x.a("hide_close_button", Boxing.boxBoolean(true)), jn0.x.a("application_id", str))), jn0.x.a("client_secret", str2)), false, 8, null);
            ro0.d<SynchronizeSessionResponse> dVarSerializer = SynchronizeSessionResponse.INSTANCE.serializer();
            mVar.f112650n = this;
            mVar.f112653q = 1;
            objD = aVar.d(lVarD, dVarSerializer, mVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) mVar.f112650n;
            jn0.t.b(objD);
        }
        qVar.s("get/fetch", (SynchronizeSessionResponse) objD);
        return objD;
    }

    private final void p(String source, FinancialConnectionsInstitution institution) {
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifestB;
        this.logger.debug("SYNC_CACHE: updating local active institution from " + source);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse == null || (manifest = synchronizeSessionResponse.getManifest()) == null || (financialConnectionsSessionManifestB = manifest.b(((-4194305) & 1) != 0 ? manifest.allowManualEntry : false, ((-4194305) & 2) != 0 ? manifest.consentRequired : false, ((-4194305) & 4) != 0 ? manifest.customManualEntryHandling : false, ((-4194305) & 8) != 0 ? manifest.disableLinkMoreAccounts : false, ((-4194305) & 16) != 0 ? manifest.id : null, ((-4194305) & 32) != 0 ? manifest.instantVerificationDisabled : false, ((-4194305) & 64) != 0 ? manifest.institutionSearchDisabled : false, ((-4194305) & 128) != 0 ? manifest.livemode : false, ((-4194305) & 256) != 0 ? manifest.manualEntryUsesMicrodeposits : false, ((-4194305) & 512) != 0 ? manifest.mobileHandoffEnabled : false, ((-4194305) & 1024) != 0 ? manifest.nextPane : null, ((-4194305) & 2048) != 0 ? manifest.manualEntryMode : null, ((-4194305) & 4096) != 0 ? manifest.permissions : null, ((-4194305) & PKIFailureInfo.certRevoked) != 0 ? manifest.product : null, ((-4194305) & 16384) != 0 ? manifest.singleAccount : false, ((-4194305) & 32768) != 0 ? manifest.useSingleSortSearch : false, ((-4194305) & 65536) != 0 ? manifest.accountDisconnectionMethod : null, ((-4194305) & 131072) != 0 ? manifest.accountholderCustomerEmailAddress : null, ((-4194305) & 262144) != 0 ? manifest.accountholderIsLinkConsumer : null, ((-4194305) & PKIFailureInfo.signerNotTrusted) != 0 ? manifest.accountholderPhoneNumber : null, ((-4194305) & PKIFailureInfo.badCertTemplate) != 0 ? manifest.accountholderToken : null, ((-4194305) & PKIFailureInfo.badSenderNonce) != 0 ? manifest.activeAuthSession : null, ((-4194305) & 4194304) != 0 ? manifest.activeInstitution : institution, ((-4194305) & 8388608) != 0 ? manifest.assignmentEventId : null, ((-4194305) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? manifest.businessName : null, ((-4194305) & 33554432) != 0 ? manifest.cancelUrl : null, ((-4194305) & 67108864) != 0 ? manifest.connectPlatformName : null, ((-4194305) & 134217728) != 0 ? manifest.connectedAccountName : null, ((-4194305) & 268435456) != 0 ? manifest.experimentAssignments : null, ((-4194305) & PKIFailureInfo.duplicateCertReq) != 0 ? manifest.displayText : null, ((-4194305) & 1073741824) != 0 ? manifest.features : null, ((-4194305) & Integer.MIN_VALUE) != 0 ? manifest.hostedAuthUrl : null, (4095 & 1) != 0 ? manifest.initialInstitution : null, (4095 & 2) != 0 ? manifest.isEndUserFacing : null, (4095 & 4) != 0 ? manifest.isLinkWithStripe : null, (4095 & 8) != 0 ? manifest.isNetworkingUserFlow : null, (4095 & 16) != 0 ? manifest.isStripeDirect : null, (4095 & 32) != 0 ? manifest.linkAccountSessionCancellationBehavior : null, (4095 & 64) != 0 ? manifest.modalCustomization : null, (4095 & 128) != 0 ? manifest.paymentMethodType : null, (4095 & 256) != 0 ? manifest.stepUpAuthenticationRequired : null, (4095 & 512) != 0 ? manifest.successUrl : null, (4095 & 1024) != 0 ? manifest.skipSuccessPane : null, (4095 & 2048) != 0 ? manifest.theme : null)) == null) {
            return;
        }
        r("updating active institution", financialConnectionsSessionManifestB);
    }

    private final void q(String source, FinancialConnectionsAuthorizationSession authSession) {
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifestB;
        this.logger.debug("SYNC_CACHE: updating local active auth session from " + source);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse == null || (manifest = synchronizeSessionResponse.getManifest()) == null || (financialConnectionsSessionManifestB = manifest.b(((-4194305) & 1) != 0 ? manifest.allowManualEntry : false, ((-4194305) & 2) != 0 ? manifest.consentRequired : false, ((-4194305) & 4) != 0 ? manifest.customManualEntryHandling : false, ((-4194305) & 8) != 0 ? manifest.disableLinkMoreAccounts : false, ((-4194305) & 16) != 0 ? manifest.id : null, ((-4194305) & 32) != 0 ? manifest.instantVerificationDisabled : false, ((-4194305) & 64) != 0 ? manifest.institutionSearchDisabled : false, ((-4194305) & 128) != 0 ? manifest.livemode : false, ((-4194305) & 256) != 0 ? manifest.manualEntryUsesMicrodeposits : false, ((-4194305) & 512) != 0 ? manifest.mobileHandoffEnabled : false, ((-4194305) & 1024) != 0 ? manifest.nextPane : null, ((-4194305) & 2048) != 0 ? manifest.manualEntryMode : null, ((-4194305) & 4096) != 0 ? manifest.permissions : null, ((-4194305) & PKIFailureInfo.certRevoked) != 0 ? manifest.product : null, ((-4194305) & 16384) != 0 ? manifest.singleAccount : false, ((-4194305) & 32768) != 0 ? manifest.useSingleSortSearch : false, ((-4194305) & 65536) != 0 ? manifest.accountDisconnectionMethod : null, ((-4194305) & 131072) != 0 ? manifest.accountholderCustomerEmailAddress : null, ((-4194305) & 262144) != 0 ? manifest.accountholderIsLinkConsumer : null, ((-4194305) & PKIFailureInfo.signerNotTrusted) != 0 ? manifest.accountholderPhoneNumber : null, ((-4194305) & PKIFailureInfo.badCertTemplate) != 0 ? manifest.accountholderToken : null, ((-4194305) & PKIFailureInfo.badSenderNonce) != 0 ? manifest.activeAuthSession : authSession, ((-4194305) & 4194304) != 0 ? manifest.activeInstitution : null, ((-4194305) & 8388608) != 0 ? manifest.assignmentEventId : null, ((-4194305) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? manifest.businessName : null, ((-4194305) & 33554432) != 0 ? manifest.cancelUrl : null, ((-4194305) & 67108864) != 0 ? manifest.connectPlatformName : null, ((-4194305) & 134217728) != 0 ? manifest.connectedAccountName : null, ((-4194305) & 268435456) != 0 ? manifest.experimentAssignments : null, ((-4194305) & PKIFailureInfo.duplicateCertReq) != 0 ? manifest.displayText : null, ((-4194305) & 1073741824) != 0 ? manifest.features : null, ((-4194305) & Integer.MIN_VALUE) != 0 ? manifest.hostedAuthUrl : null, (4095 & 1) != 0 ? manifest.initialInstitution : null, (4095 & 2) != 0 ? manifest.isEndUserFacing : null, (4095 & 4) != 0 ? manifest.isLinkWithStripe : null, (4095 & 8) != 0 ? manifest.isNetworkingUserFlow : null, (4095 & 16) != 0 ? manifest.isStripeDirect : null, (4095 & 32) != 0 ? manifest.linkAccountSessionCancellationBehavior : null, (4095 & 64) != 0 ? manifest.modalCustomization : null, (4095 & 128) != 0 ? manifest.paymentMethodType : null, (4095 & 256) != 0 ? manifest.stepUpAuthenticationRequired : null, (4095 & 512) != 0 ? manifest.successUrl : null, (4095 & 1024) != 0 ? manifest.skipSuccessPane : null, (4095 & 2048) != 0 ? manifest.theme : null)) == null) {
            return;
        }
        r("updating active auth session", financialConnectionsSessionManifestB);
    }

    private final void r(String source, FinancialConnectionsSessionManifest manifest) {
        this.logger.debug("SYNC_CACHE: updating local manifest from " + source);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse != null ? SynchronizeSessionResponse.b(synchronizeSessionResponse, manifest, null, null, 6, null) : null;
    }

    private final void s(String source, SynchronizeSessionResponse synchronizeSessionResponse) {
        this.logger.debug("SYNC_CACHE: updating local sync object from " + source);
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object a(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        c cVar;
        q qVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f112606q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f112606q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objD = cVar.f112604o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f112606q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l.b bVar = this.apiRequestFactory;
            w30.l.Options optionsA = this.provideApiRequestOptions.a(true);
            Map mapM = v0.m(jn0.x.a("id", str2), jn0.x.a("client_secret", str), jn0.x.a("public_token", str3));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapM.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            w30.l lVarD = w30.l.b.d(bVar, "https://api.stripe.com/v1/connections/auth_sessions/authorized", optionsA, linkedHashMap, false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsAuthorizationSession> dVarSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            cVar.f112603n = this;
            cVar.f112606q = 1;
            objD = aVar.d(lVarD, dVarSerializer, cVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) cVar.f112603n;
            jn0.t.b(objD);
        }
        qVar.q("completeAuthorizationSession", (FinancialConnectionsAuthorizationSession) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object b(String str, String str2, String str3, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        d dVar;
        q qVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f112610q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f112610q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objD = dVar.f112608o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f112610q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/disable_networking", this.provideApiRequestOptions.a(false), z50.a.a(v0.m(jn0.x.a("client_secret", str), jn0.x.a("expand", p013kotlin.collections.v.e("active_auth_session")), jn0.x.a("client_requested_next_pane_on_disable_networking", str3), jn0.x.a("disabled_reason", str2))), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsSessionManifest> dVarSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            dVar.f112607n = this;
            dVar.f112610q = 1;
            objD = aVar.d(lVarD, dVarSerializer, dVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) dVar.f112607n;
            jn0.t.b(objD);
        }
        qVar.r("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object c(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        l lVar;
        q qVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i11 = lVar.f112649q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f112649q = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objD = lVar.f112647o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = lVar.f112649q;
        if (i12 == 0) {
            jn0.t.b(objD);
            r50.a aVar = this.requestExecutor;
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/retrieve", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("id", str2), jn0.x.a("client_secret", str), jn0.x.a("emit_events", Boxing.boxBoolean(true))), false, 8, null);
            ro0.d<FinancialConnectionsAuthorizationSession> dVarSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            lVar.f112646n = this;
            lVar.f112649q = 1;
            objD = aVar.d(lVarD, dVarSerializer, lVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) lVar.f112646n;
            jn0.t.b(objD);
        }
        qVar.q("retrieveAuthorizationSession", (FinancialConnectionsAuthorizationSession) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // t50.p
    public Object d(String str, String str2, String str3, String str4, String str5, String str6, Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        k kVar;
        Map mapI;
        q qVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f112645q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f112645q = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objD = kVar.f112643o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar.f112645q;
        if (i12 == 0) {
            jn0.t.b(objD);
            if (set != null) {
                Set<String> set2 = set;
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set2, 10));
                int i13 = 0;
                for (Object obj : set2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        p013kotlin.collections.v.x();
                    }
                    arrayList.add(jn0.x.a("selected_accounts[" + i13 + "]", (String) obj));
                    i13 = i14;
                }
                mapI = v0.y(arrayList);
                if (mapI == null) {
                    mapI = v0.i();
                }
            } else {
                mapI = v0.i();
            }
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/save_accounts_to_link", this.provideApiRequestOptions.a(false), v0.r(z50.a.a(v0.m(jn0.x.a("client_secret", str), jn0.x.a("consumer_session_client_secret", str6), jn0.x.a("expand", p013kotlin.collections.v.e("active_auth_session")), jn0.x.a(PlaceTypes.COUNTRY, str3), jn0.x.a("locale", str4), jn0.x.a("email_address", str2), jn0.x.a("phone_number", str5))), mapI), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsSessionManifest> dVarSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            kVar.f112642n = this;
            kVar.f112645q = 1;
            objD = aVar.d(lVarD, dVarSerializer, kVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) kVar.f112642n;
            jn0.t.b(objD);
        }
        qVar.r("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object e(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        i iVar;
        q qVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f112637q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f112637q = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objD = iVar.f112635o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f112637q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/link_verified", this.provideApiRequestOptions.a(false), v0.m(jn0.x.a("client_secret", str), jn0.x.a("expand", p013kotlin.collections.v.e("active_auth_session"))), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsSessionManifest> dVarSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            iVar.f112634n = this;
            iVar.f112637q = 1;
            objD = aVar.d(lVarD, dVarSerializer, iVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) iVar.f112634n;
            jn0.t.b(objD);
        }
        qVar.r("postMarkLinkVerified", (FinancialConnectionsSessionManifest) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object f(String str, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        g gVar;
        q qVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f112629r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f112629r = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objD = gVar.f112627p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f112629r;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("client_secret", str), jn0.x.a("use_mobile_handoff", Boxing.boxBoolean(false)), jn0.x.a("use_abstract_flow", Boxing.boxBoolean(true)), jn0.x.a("return_url", "auth-redirect/" + str2), jn0.x.a("institution", financialConnectionsInstitution.getId())), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsAuthorizationSession> dVarSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            gVar.f112625n = this;
            gVar.f112626o = financialConnectionsInstitution;
            gVar.f112629r = 1;
            objD = aVar.d(lVarD, dVarSerializer, gVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsInstitution = (FinancialConnectionsInstitution) gVar.f112626o;
            qVar = (q) gVar.f112625n;
            jn0.t.b(objD);
        }
        qVar.p("postAuthorizationSession", financialConnectionsInstitution);
        qVar.q("postAuthorizationSession", (FinancialConnectionsAuthorizationSession) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object g(String str, String str2, wn0.l<? super SynchronizeSessionResponse, Boolean> lVar, Continuation<? super SynchronizeSessionResponse> continuation) throws Throwable {
        e eVar;
        Mutex mutex;
        q qVar;
        Mutex mutex2;
        SynchronizeSessionResponse synchronizeSessionResponse;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f112618u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f112618u = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f112616s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f112618u;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                mutex = this.mutex;
                eVar.f112611n = this;
                eVar.f112612o = str;
                eVar.f112613p = str2;
                eVar.f112614q = lVar;
                eVar.f112615r = mutex;
                eVar.f112618u = 1;
                if (mutex.lock(null, eVar) != coroutine_suspended) {
                    qVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) eVar.f112611n;
                try {
                    jn0.t.b(obj);
                    synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                    mutex = mutex2;
                    mutex.unlock(null);
                    return synchronizeSessionResponse;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) eVar.f112615r;
            lVar = (wn0.l) eVar.f112614q;
            str2 = (String) eVar.f112613p;
            String str3 = (String) eVar.f112612o;
            qVar = (q) eVar.f112611n;
            jn0.t.b(obj);
            mutex = mutex3;
            str = str3;
            synchronizeSessionResponse = qVar.cachedSynchronizeSessionResponse;
            if (synchronizeSessionResponse == null || lVar.invoke(synchronizeSessionResponse).booleanValue()) {
                synchronizeSessionResponse = null;
            }
            if (synchronizeSessionResponse == null) {
                eVar.f112611n = mutex;
                eVar.f112612o = null;
                eVar.f112613p = null;
                eVar.f112614q = null;
                eVar.f112615r = null;
                eVar.f112618u = 2;
                Object objO = qVar.o(str2, str, eVar);
                if (objO != coroutine_suspended) {
                    Mutex mutex4 = mutex;
                    obj = objO;
                    mutex2 = mutex4;
                    synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                    mutex = mutex2;
                }
                return coroutine_suspended;
            }
            mutex.unlock(null);
            return synchronizeSessionResponse;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // t50.p
    public Object h(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws Throwable {
        f fVar;
        String str2;
        Mutex mutex;
        q qVar;
        Mutex mutex2;
        q qVar2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f112624s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f112624s = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objD = fVar.f112622q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f112624s;
        try {
            if (i12 == 0) {
                jn0.t.b(objD);
                Mutex mutex3 = this.mutex;
                fVar.f112619n = this;
                str2 = str;
                fVar.f112620o = str2;
                fVar.f112621p = mutex3;
                fVar.f112624s = 1;
                if (mutex3.lock(null, fVar) != coroutine_suspended) {
                    mutex = mutex3;
                    qVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) fVar.f112620o;
                qVar2 = (q) fVar.f112619n;
                try {
                    jn0.t.b(objD);
                    qVar2.r("consent acquired", (FinancialConnectionsSessionManifest) objD);
                    mutex2.unlock(null);
                    return objD;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex4 = (Mutex) fVar.f112621p;
            String str3 = (String) fVar.f112620o;
            qVar = (q) fVar.f112619n;
            jn0.t.b(objD);
            mutex = mutex4;
            str2 = str3;
            w30.l lVarD = w30.l.b.d(qVar.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/consent_acquired", qVar.provideApiRequestOptions.a(false), v0.m(jn0.x.a("expand", p013kotlin.collections.v.e("active_auth_session")), jn0.x.a("client_secret", str2)), false, 8, null);
            r50.a aVar = qVar.requestExecutor;
            ro0.d<FinancialConnectionsSessionManifest> dVarSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            fVar.f112619n = qVar;
            fVar.f112620o = mutex;
            fVar.f112621p = null;
            fVar.f112624s = 2;
            objD = aVar.d(lVarD, dVarSerializer, fVar);
            if (objD != coroutine_suspended) {
                mutex2 = mutex;
                qVar2 = qVar;
                qVar2.r("consent acquired", (FinancialConnectionsSessionManifest) objD);
                mutex2.unlock(null);
                return objD;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // t50.p
    public void i(wn0.l<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block) {
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifestInvoke;
        p013kotlin.jvm.internal.s.k(block, "block");
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse == null || (manifest = synchronizeSessionResponse.getManifest()) == null || (financialConnectionsSessionManifestInvoke = block.invoke(manifest)) == null) {
            return;
        }
        r("updateLocalManifest", financialConnectionsSessionManifestInvoke);
    }

    @Override // t50.p
    public Object j(String str, Date date, String str2, List<? extends j40.b> list, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        w30.l.b bVar = this.apiRequestFactory;
        w30.l.Options optionsA = this.provideApiRequestOptions.a(true);
        Map mapM = v0.m(jn0.x.a("client_secret", str), jn0.x.a("client_timestamp", String.valueOf(date.getTime())), jn0.x.a("id", str2));
        List<? extends j40.b> list2 = list;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            arrayList.add(jn0.x.a("frontend_events[" + i11 + "]", ((j40.b) obj).c()));
            i11 = i12;
        }
        return this.requestExecutor.d(w30.l.b.d(bVar, "https://api.stripe.com/v1/connections/auth_sessions/events", optionsA, v0.q(mapM, arrayList), false, 8, null), FinancialConnectionsAuthorizationSession.INSTANCE.serializer(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object k(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        h hVar;
        q qVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f112633q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f112633q = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objD = hVar.f112631o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f112633q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/link_step_up_authentication_verified", this.provideApiRequestOptions.a(false), v0.m(jn0.x.a("client_secret", str), jn0.x.a("expand", p013kotlin.collections.v.e("active_auth_session"))), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsSessionManifest> dVarSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            hVar.f112630n = this;
            hVar.f112633q = 1;
            objD = aVar.d(lVarD, dVarSerializer, hVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) hVar.f112630n;
            jn0.t.b(objD);
        }
        qVar.r("postMarkLinkStepUpVerified", (FinancialConnectionsSessionManifest) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object l(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        j jVar;
        q qVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f112641q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f112641q = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objD = jVar.f112639o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar.f112641q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/link_more_accounts", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("expand", p013kotlin.collections.v.e("active_auth_session")), jn0.x.a("client_secret", str)), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsSessionManifest> dVarSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            jVar.f112638n = this;
            jVar.f112641q = 1;
            objD = aVar.d(lVarD, dVarSerializer, jVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) jVar.f112638n;
            jn0.t.b(objD);
        }
        qVar.r("postMarkLinkingMoreAccounts", (FinancialConnectionsSessionManifest) objD);
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.p
    public Object m(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        b bVar;
        q qVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f112602q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f112602q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objD = bVar.f112600o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f112602q;
        if (i12 == 0) {
            jn0.t.b(objD);
            w30.l lVarD = w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/cancel", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("id", str2), jn0.x.a("client_secret", str)), false, 8, null);
            r50.a aVar = this.requestExecutor;
            ro0.d<FinancialConnectionsAuthorizationSession> dVarSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            bVar.f112599n = this;
            bVar.f112602q = 1;
            objD = aVar.d(lVarD, dVarSerializer, bVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            qVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) bVar.f112599n;
            jn0.t.b(objD);
        }
        qVar.q("cancelAuthorizationSession", (FinancialConnectionsAuthorizationSession) objD);
        return objD;
    }
}
