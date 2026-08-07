package si;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloParseException;
import com.plaid.internal.EnumC4419g;
import ii.DeferredFragmentIdentifier;
import ii.k;
import ii.r;
import ii.v;
import ii.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ji.h;
import ji.i;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okio.j;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0003$.2B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u000e*\u00020\r*\b\u0012\u0004\u0012\u00028\u00000\u00152\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J3\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%JA\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0018\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010=\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lsi/g;", "Lri/a;", "Lji/h;", "httpRequestComposer", "Lsi/c;", "engine", "", "Lsi/e;", "interceptors", "", "exposeErrorBody", "<init>", "(Lji/h;Lsi/c;Ljava/util/List;Z)V", "Lii/v$a;", "D", "Lii/v;", "operation", "Lii/k;", "customScalarAdapters", "Lji/i;", "httpResponse", "Lii/g;", "k", "(Lii/v;Lii/k;Lji/i;)Lii/g;", "Lkotlinx/coroutines/flow/Flow;", "j", "(Lii/v;Lii/k;Lji/i;)Lkotlinx/coroutines/flow/Flow;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "", "millisStart", "l", "(Lii/g;Ljava/util/UUID;Lji/i;J)Lii/g;", "Lii/f;", "request", "a", "(Lii/f;)Lkotlinx/coroutines/flow/Flow;", "Lji/g;", "httpRequest", "f", "(Lii/f;Lji/g;Lii/k;)Lkotlinx/coroutines/flow/Flow;", "Ljn0/h0;", "dispose", "()V", "Lji/h;", "b", "Lsi/c;", "g", "()Lsi/c;", "c", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Z", "h", "()Z", "Lsi/g$c;", "e", "Lsi/g$c;", "engineInterceptor", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g implements ri.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h httpRequestComposer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final si.c engine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<si.e> interceptors;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean exposeErrorBody;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c engineInterceptor;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006!"}, d2 = {"Lsi/g$a;", "", "<init>", "()V", "", "serverUrl", "e", "(Ljava/lang/String;)Lsi/g$a;", "", "exposeErrorBody", "b", "(Z)Lsi/g$a;", "Lsi/c;", "httpEngine", "c", "(Lsi/c;)Lsi/g$a;", "", "Lsi/e;", "interceptors", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Lsi/g$a;", "Lsi/g;", "a", "()Lsi/g;", "Lji/h;", "Lji/h;", "httpRequestComposer", "Ljava/lang/String;", "Lsi/c;", "engine", "", "Ljava/util/List;", "Z", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private h httpRequestComposer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String serverUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private si.c engine;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<si.e> interceptors = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean exposeErrorBody;

        public final g a() {
            h bVar = this.httpRequestComposer;
            if (bVar != null && this.serverUrl != null) {
                throw new IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (bVar == null) {
                String str = this.serverUrl;
                bVar = str != null ? new ji.b(str) : null;
                if (bVar == null) {
                    throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
                }
            }
            h hVar = bVar;
            si.c aVar = this.engine;
            if (aVar == null) {
                aVar = new si.a(0L, 1, defaultConstructorMarker);
            }
            return new g(hVar, aVar, this.interceptors, this.exposeErrorBody, null);
        }

        public final a b(boolean exposeErrorBody) {
            this.exposeErrorBody = exposeErrorBody;
            return this;
        }

        public final a c(si.c httpEngine) {
            s.k(httpEngine, "httpEngine");
            this.engine = httpEngine;
            return this;
        }

        public final a d(List<? extends si.e> interceptors) {
            s.k(interceptors, "interceptors");
            this.interceptors.clear();
            this.interceptors.addAll(interceptors);
            return this;
        }

        public final a e(String serverUrl) {
            s.k(serverUrl, "serverUrl");
            this.serverUrl = serverUrl;
            return this;
        }
    }

    /* JADX INFO: renamed from: si.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsi/g$b;", "", "<init>", "()V", "", "throwable", "Lcom/apollographql/apollo3/exception/ApolloException;", "b", "(Ljava/lang/Throwable;)Lcom/apollographql/apollo3/exception/ApolloException;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ApolloException b(Throwable throwable) {
            return throwable instanceof ApolloException ? (ApolloException) throwable : new ApolloParseException("Failed to parse GraphQL http network response", throwable);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsi/g$c;", "Lsi/e;", "<init>", "(Lsi/g;)V", "Lji/g;", "request", "Lsi/f;", "chain", "Lji/i;", "a", "(Lji/g;Lsi/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class c implements si.e {
        public c() {
        }

        @Override // si.e
        public Object a(ji.g gVar, si.f fVar, Continuation<? super i> continuation) {
            return g.this.getEngine().a(gVar, continuation);
        }

        @Override // si.e
        public void dispose() {
            si.e.a.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lii/v$a;", "D", "Lkotlinx/coroutines/flow/FlowCollector;", "Lii/g;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", i = {0, 0}, l = {65, 85, 90}, m = "invokeSuspend", n = {"$this$flow", "millisStart"}, s = {"L$0", "J$0"})
    static final class d<D> extends SuspendLambda implements p<FlowCollector<? super ii.g<D>>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f111190n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f111191o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f111192p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ji.g f111194r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ii.f<D> f111195s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ k f111196t;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements Flow<ii.g<D>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow f111197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f111198b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ii.f f111199c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f111200d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f111201e;

            /* JADX INFO: renamed from: si.g$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C2369a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector f111202a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g f111203b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ii.f f111204c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ i f111205d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ long f111206e;

                /* JADX INFO: renamed from: si.g$d$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2", f = "HttpNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                public static final class C2370a extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f111207n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f111208o;

                    public C2370a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f111207n = obj;
                        this.f111208o |= Integer.MIN_VALUE;
                        return C2369a.this.emit(null, this);
                    }
                }

                public C2369a(FlowCollector flowCollector, g gVar, ii.f fVar, i iVar, long j11) {
                    this.f111202a = flowCollector;
                    this.f111203b = gVar;
                    this.f111204c = fVar;
                    this.f111205d = iVar;
                    this.f111206e = j11;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    C2370a c2370a;
                    if (continuation instanceof C2370a) {
                        c2370a = (C2370a) continuation;
                        int i11 = c2370a.f111208o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c2370a.f111208o = i11 - Integer.MIN_VALUE;
                        } else {
                            c2370a = new C2370a(continuation);
                        }
                    } else {
                        c2370a = new C2370a(continuation);
                    }
                    Object obj2 = c2370a.f111207n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c2370a.f111208o;
                    if (i12 == 0) {
                        t.b(obj2);
                        FlowCollector flowCollector = this.f111202a;
                        ii.g gVarL = this.f111203b.l((ii.g) obj, this.f111204c.getRequestUuid(), this.f111205d, this.f111206e);
                        c2370a.f111208o = 1;
                        if (flowCollector.emit(gVarL, c2370a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj2);
                    }
                    return h0.f84049a;
                }
            }

            public a(Flow flow, g gVar, ii.f fVar, i iVar, long j11) {
                this.f111197a = flow;
                this.f111198b = gVar;
                this.f111199c = fVar;
                this.f111200d = iVar;
                this.f111201e = j11;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f111197a.collect(new C2369a(flowCollector, this.f111198b, this.f111199c, this.f111200d, this.f111201e), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ji.g gVar, ii.f<D> fVar, k kVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f111194r = gVar;
            this.f111195s = fVar;
            this.f111196t = kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = g.this.new d(this.f111194r, this.f111195s, this.f111196t, continuation);
            dVar.f111192p = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r4, r12) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
        
            if (r1.emit(r13, r12) == r0) goto L27;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: si.g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super ii.g<D>> flowCollector, Continuation<? super h0> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e<D> implements Flow<ii.g<D>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f111210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f111211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f111212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0 f111213d;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f111214a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f111215b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f111216c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0 f111217d;

            /* JADX INFO: renamed from: si.g$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", i = {}, l = {EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2371a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f111218n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f111219o;

                public C2371a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f111218n = obj;
                    this.f111219o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, v vVar, k kVar, n0 n0Var) {
                this.f111214a = flowCollector;
                this.f111215b = vVar;
                this.f111216c = kVar;
                this.f111217d = n0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2371a c2371a;
                if (continuation instanceof C2371a) {
                    c2371a = (C2371a) continuation;
                    int i11 = c2371a.f111219o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2371a.f111219o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2371a = new C2371a(continuation);
                    }
                } else {
                    c2371a = new C2371a(continuation);
                }
                Object obj2 = c2371a.f111218n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2371a.f111219o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f111214a;
                    j jVar = (j) obj;
                    n0 n0Var = this.f111217d;
                    if (n0Var.f86529a == null) {
                        n0Var.f86529a = (T) new pi.d();
                    }
                    T t11 = this.f111217d.f86529a;
                    s.h(t11);
                    Map<String, Object> mapG = ((pi.d) t11).g(jVar);
                    T t12 = this.f111217d.f86529a;
                    s.h(t12);
                    Set<DeferredFragmentIdentifier> setC = ((pi.d) t12).c();
                    T t13 = this.f111217d.f86529a;
                    s.h(t13);
                    boolean z11 = !((pi.d) t13).getHasNext();
                    T t14 = this.f111217d.f86529a;
                    s.h(t14);
                    ii.g gVarB = ((pi.d) t14).getIsEmptyPayload() ? null : w.a(this.f111215b, mi.a.b(mapG), ii.a.a(this.f111216c, setC)).b().e(z11).b();
                    if (gVarB != null) {
                        c2371a.f111219o = 1;
                        if (flowCollector.emit(gVarB, c2371a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public e(Flow flow, v vVar, k kVar, n0 n0Var) {
            this.f111210a = flow;
            this.f111211b = vVar;
            this.f111212c = kVar;
            this.f111213d = n0Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f111210a.collect(new a(flowCollector, this.f111211b, this.f111212c, this.f111213d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lii/v$a;", "D", "Lkotlinx/coroutines/flow/FlowCollector;", "Lii/g;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f<D> extends SuspendLambda implements q<FlowCollector<? super ii.g<D>>, Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f111221n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f111222o;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f111221n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            throw g.INSTANCE.b((Throwable) this.f111222o);
        }

        @Override // wn0.q
        public final Object invoke(FlowCollector<? super ii.g<D>> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
            f fVar = new f(continuation);
            fVar.f111222o = th2;
            return fVar.invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ g(h hVar, si.c cVar, List list, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, cVar, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends v.a> Flow<ii.g<D>> j(v<D> operation, k customScalarAdapters, i httpResponse) {
        return FlowKt.m548catch(new e(pi.h.d(httpResponse), operation, customScalarAdapters, new n0()), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends v.a> ii.g<D> k(v<D> operation, k customScalarAdapters, i httpResponse) {
        try {
            j jVarA = httpResponse.a();
            s.h(jVarA);
            return w.a(operation, mi.a.c(jVarA), customScalarAdapters).b().e(true).b();
        } catch (Exception e11) {
            throw INSTANCE.b(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends v.a> ii.g<D> l(ii.g<D> gVar, UUID uuid, i iVar, long j11) {
        return gVar.b().f(uuid).a(new si.d(j11, qi.a.a(), iVar.getStatusCode(), iVar.b())).b();
    }

    @Override // ri.a
    public <D extends v.a> Flow<ii.g<D>> a(ii.f<D> request) {
        s.k(request, "request");
        r.c cVarA = request.getExecutionContext().a(k.INSTANCE);
        s.h(cVarA);
        return f(request, this.httpRequestComposer.a(request), (k) cVarA);
    }

    @Override // ri.a
    public void dispose() {
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((si.e) it.next()).dispose();
        }
        this.engine.dispose();
    }

    public final <D extends v.a> Flow<ii.g<D>> f(ii.f<D> request, ji.g httpRequest, k customScalarAdapters) {
        s.k(request, "request");
        s.k(httpRequest, "httpRequest");
        s.k(customScalarAdapters, "customScalarAdapters");
        return FlowKt.flow(new d(httpRequest, request, customScalarAdapters, null));
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final si.c getEngine() {
        return this.engine;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getExposeErrorBody() {
        return this.exposeErrorBody;
    }

    public final List<si.e> i() {
        return this.interceptors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g(h hVar, si.c cVar, List<? extends si.e> list, boolean z11) {
        this.httpRequestComposer = hVar;
        this.engine = cVar;
        this.interceptors = list;
        this.exposeErrorBody = z11;
        this.engineInterceptor = new c();
    }
}
