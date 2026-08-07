package hi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import ii.k;
import ii.r;
import ii.z;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import ji.HttpHeader;
import ji.f;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import oi.d;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import si.e;
import ti.g;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 F2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002.2B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\b\b\u0000\u0010\u001d*\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J;\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*\"\b\b\u0000\u0010\u001d*\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010)\u001a\u00020\u0014H\u0000¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b6\u00101R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bF\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010JR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010JR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010W¨\u0006Y"}, d2 = {"Lhi/b;", "", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lri/a;", "networkTransport", "Lii/k;", "customScalarAdapters", "subscriptionNetworkTransport", "", "Loi/a;", "interceptors", "Lii/r;", "executionContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lji/f;", "httpMethod", "Lji/d;", "httpHeaders", "", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "Lhi/b$a;", "builder", "<init>", "(Lri/a;Lii/k;Lri/a;Ljava/util/List;Lii/r;Lkotlinx/coroutines/CoroutineDispatcher;Lji/f;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhi/b$a;)V", "D", "Lii/z;", SearchIntents.EXTRA_QUERY, "Lhi/a;", "H", "(Lii/z;)Lhi/a;", "Ljn0/h0;", "close", "()V", "Lii/v$a;", "Lii/f;", "apolloRequest", "ignoreApolloClientHttpHeaders", "Lkotlinx/coroutines/flow/Flow;", "Lii/g;", "c", "(Lii/f;Z)Lkotlinx/coroutines/flow/Flow;", "a", "Lri/a;", "getNetworkTransport", "()Lri/a;", "b", "Lii/k;", "getCustomScalarAdapters", "()Lii/k;", "getSubscriptionNetworkTransport", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "e", "Lii/r;", "o", "()Lii/r;", "f", "Lkotlinx/coroutines/CoroutineDispatcher;", "g", "Lji/f;", "t", "()Lji/f;", "h", "p", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "B", "()Ljava/lang/Boolean;", "j", "C", "k", "n", "l", "getCanBeBatched", "m", "Lhi/b$a;", "Lhi/c;", "Lhi/c;", "concurrencyInfo", "Loi/d;", "Loi/d;", "networkInterceptor", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ri.a networkTransport;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k customScalarAdapters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ri.a subscriptionNetworkTransport;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<oi.a> interceptors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r executionContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f httpMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> httpHeaders;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendApqExtensions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendDocument;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Boolean enableAutoPersistedQueries;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Boolean canBeBatched;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a builder;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final c concurrencyInfo;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final d networkInterceptor;

    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b\u001c\u0010-\"\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR:\u0010N\u001a&\b\u0001\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u000209\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0K\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR.\u0010R\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040K\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR.\u0010Z\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010S8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\b$\u0010W\"\u0004\bX\u0010YR:\u0010_\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010\u001f2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010\u001f8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u001a\u001a\u0004\b \u0010\"\"\u0004\b]\u0010^R.\u0010d\u001a\u0004\u0018\u00010A2\b\u0010T\u001a\u0004\u0018\u00010A8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010C\u001a\u0004\b'\u0010a\"\u0004\bb\u0010cR.\u0010g\u001a\u0004\u0018\u00010A2\b\u0010T\u001a\u0004\u0018\u00010A8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010C\u001a\u0004\b+\u0010a\"\u0004\bf\u0010cR.\u0010j\u001a\u0004\u0018\u00010A2\b\u0010T\u001a\u0004\u0018\u00010A8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010C\u001a\u0004\b\u0019\u0010a\"\u0004\bi\u0010cR.\u0010m\u001a\u0004\u0018\u00010A2\b\u0010T\u001a\u0004\u0018\u00010A8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010C\u001a\u0004\b\u0014\u0010a\"\u0004\bl\u0010c¨\u0006n"}, d2 = {"Lhi/b$a;", "", "<init>", "()V", "", "serverUrl", "j", "(Ljava/lang/String;)Lhi/b$a;", "Lsi/e;", "httpInterceptor", "a", "(Lsi/e;)Lhi/b$a;", "Lhi/b;", "b", "()Lhi/b;", "Lri/a;", "Lri/a;", "_networkTransport", "subscriptionNetworkTransport", "Lii/k$a;", "c", "Lii/k$a;", "customScalarAdaptersBuilder", "", "Loi/a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "_interceptors", "e", "Loi/a;", "apqInterceptor", "", "f", "getInterceptors", "()Ljava/util/List;", "interceptors", "g", "httpInterceptors", "Lkotlinx/coroutines/CoroutineDispatcher;", "h", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lii/r;", IntegerTokenConverter.CONVERTER_KEY, "Lii/r;", "()Lii/r;", "setExecutionContext", "(Lii/r;)V", "executionContext", "Ljava/lang/String;", "httpServerUrl", "Lsi/c;", "k", "Lsi/c;", "httpEngine", "l", "webSocketServerUrl", "", "m", "Ljava/lang/Long;", "webSocketIdleTimeoutMillis", "Lti/g$a;", "n", "Lti/g$a;", "wsProtocolFactory", "", "o", "Ljava/lang/Boolean;", "httpExposeErrorBody", "Lti/d;", "p", "Lti/d;", "webSocketEngine", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "q", "Lwn0/q;", "webSocketReopenWhen", "Lkotlin/Function1;", "r", "Lwn0/l;", "webSocketReopenServerUrl", "Lji/f;", "<set-?>", "s", "Lji/f;", "()Lji/f;", "setHttpMethod", "(Lji/f;)V", "httpMethod", "Lji/d;", "t", "setHttpHeaders", "(Ljava/util/List;)V", "httpHeaders", "u", "()Ljava/lang/Boolean;", "setSendApqExtensions", "(Ljava/lang/Boolean;)V", "sendApqExtensions", "v", "setSendDocument", "sendDocument", "w", "setEnableAutoPersistedQueries", "enableAutoPersistedQueries", "x", "setCanBeBatched", "canBeBatched", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private ri.a _networkTransport;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private ri.a subscriptionNetworkTransport;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final k.a customScalarAdaptersBuilder = new k.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<oi.a> _interceptors;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private oi.a apqInterceptor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<oi.a> interceptors;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final List<e> httpInterceptors;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private CoroutineDispatcher dispatcher;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private r executionContext;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private String httpServerUrl;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private si.c httpEngine;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private String webSocketServerUrl;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Long webSocketIdleTimeoutMillis;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private g.a wsProtocolFactory;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Boolean httpExposeErrorBody;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private ti.d webSocketEngine;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private q<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> webSocketReopenWhen;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private l<? super Continuation<? super String>, ? extends Object> webSocketReopenServerUrl;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private f httpMethod;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private List<HttpHeader> httpHeaders;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private Boolean sendApqExtensions;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private Boolean sendDocument;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private Boolean enableAutoPersistedQueries;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private Boolean canBeBatched;

        public a() {
            ArrayList arrayList = new ArrayList();
            this._interceptors = arrayList;
            this.interceptors = arrayList;
            this.httpInterceptors = new ArrayList();
            this.executionContext = r.f78163b;
            pi.f.a();
        }

        public final a a(e httpInterceptor) {
            s.k(httpInterceptor, "httpInterceptor");
            this.httpInterceptors.add(httpInterceptor);
            return this;
        }

        public final b b() {
            ri.a aVarA;
            ri.a aVar;
            if (this._networkTransport != null) {
                if (this.httpServerUrl != null) {
                    throw new IllegalStateException("Apollo: 'httpServerUrl' has no effect if 'networkTransport' is set");
                }
                if (this.httpEngine != null) {
                    throw new IllegalStateException("Apollo: 'httpEngine' has no effect if 'networkTransport' is set");
                }
                if (!this.httpInterceptors.isEmpty()) {
                    throw new IllegalStateException("Apollo: 'addHttpInterceptor' has no effect if 'networkTransport' is set");
                }
                if (this.httpExposeErrorBody != null) {
                    throw new IllegalStateException("Apollo: 'httpExposeErrorBody' has no effect if 'networkTransport' is set");
                }
                aVarA = this._networkTransport;
                s.h(aVarA);
            } else {
                if (this.httpServerUrl == null) {
                    throw new IllegalStateException("Apollo: 'serverUrl' is required");
                }
                si.g.a aVar2 = new si.g.a();
                String str = this.httpServerUrl;
                s.h(str);
                si.g.a aVarE = aVar2.e(str);
                si.c cVar = this.httpEngine;
                if (cVar != null) {
                    s.h(cVar);
                    aVarE.c(cVar);
                }
                Boolean bool = this.httpExposeErrorBody;
                if (bool != null) {
                    s.h(bool);
                    aVarE.b(bool.booleanValue());
                }
                aVarA = aVarE.d(this.httpInterceptors).a();
            }
            ri.a aVar3 = aVarA;
            ri.a aVarA2 = this.subscriptionNetworkTransport;
            if (aVarA2 == null) {
                String str2 = this.webSocketServerUrl;
                if (str2 == null) {
                    str2 = this.httpServerUrl;
                }
                if (str2 == null) {
                    aVar = aVar3;
                } else {
                    ti.e.b bVarE = new ti.e.b().e(str2);
                    ti.d dVar = this.webSocketEngine;
                    if (dVar != null) {
                        s.h(dVar);
                        bVarE.g(dVar);
                    }
                    Long l11 = this.webSocketIdleTimeoutMillis;
                    if (l11 != null) {
                        s.h(l11);
                        bVarE.b(l11.longValue());
                    }
                    g.a aVar4 = this.wsProtocolFactory;
                    if (aVar4 != null) {
                        s.h(aVar4);
                        bVarE.c(aVar4);
                    }
                    q<? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> qVar = this.webSocketReopenWhen;
                    if (qVar != null) {
                        bVarE.d(qVar);
                    }
                    l<? super Continuation<? super String>, ? extends Object> lVar = this.webSocketReopenServerUrl;
                    if (lVar != null) {
                        bVarE.f(lVar);
                    }
                    aVarA2 = bVarE.a();
                }
                return new b(aVar3, this.customScalarAdaptersBuilder.c(), aVar, v.P0(this._interceptors, v.q(this.apqInterceptor)), getExecutionContext(), this.dispatcher, getHttpMethod(), f(), getSendApqExtensions(), getSendDocument(), getEnableAutoPersistedQueries(), getCanBeBatched(), this, null);
            }
            if (this.webSocketServerUrl != null) {
                throw new IllegalStateException("Apollo: 'webSocketServerUrl' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (this.webSocketEngine != null) {
                throw new IllegalStateException("Apollo: 'webSocketEngine' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (this.webSocketIdleTimeoutMillis != null) {
                throw new IllegalStateException("Apollo: 'webSocketIdleTimeoutMillis' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (this.wsProtocolFactory != null) {
                throw new IllegalStateException("Apollo: 'wsProtocolFactory' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (this.webSocketReopenWhen != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenWhen' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (this.webSocketReopenServerUrl != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenServerUrl' has no effect if 'subscriptionNetworkTransport' is set");
            }
            s.h(aVarA2);
            aVar = aVarA2;
            return new b(aVar3, this.customScalarAdaptersBuilder.c(), aVar, v.P0(this._interceptors, v.q(this.apqInterceptor)), getExecutionContext(), this.dispatcher, getHttpMethod(), f(), getSendApqExtensions(), getSendDocument(), getEnableAutoPersistedQueries(), getCanBeBatched(), this, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public r getExecutionContext() {
            return this.executionContext;
        }

        public List<HttpHeader> f() {
            return this.httpHeaders;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public f getHttpMethod() {
            return this.httpMethod;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public Boolean getSendDocument() {
            return this.sendDocument;
        }

        public final a j(String serverUrl) {
            s.k(serverUrl, "serverUrl");
            this.httpServerUrl = serverUrl;
            return this;
        }
    }

    public /* synthetic */ b(ri.a aVar, k kVar, ri.a aVar2, List list, r rVar, CoroutineDispatcher coroutineDispatcher, f fVar, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, a aVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, kVar, aVar2, list, rVar, coroutineDispatcher, fVar, list2, bool, bool2, bool3, bool4, aVar3);
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    public final <D> hi.a<D> H(z<D> query) {
        s.k(query, "query");
        return new hi.a<>(this, query);
    }

    public final <D extends ii.v.a> Flow<ii.g<D>> c(ii.f<D> apolloRequest, boolean ignoreApolloClientHttpHeaders) {
        List<HttpHeader> listP0;
        s.k(apolloRequest, "apolloRequest");
        ii.f.a<D> aVarE = new ii.f.a(apolloRequest.f()).a(this.concurrencyInfo).a(this.customScalarAdapters).a(this.concurrencyInfo.c(this.customScalarAdapters).c(getExecutionContext()).c(apolloRequest.getExecutionContext())).a(apolloRequest.getExecutionContext()).o(getHttpMethod()).p(getSendApqExtensions()).q(getSendDocument()).e(getEnableAutoPersistedQueries());
        if (apolloRequest.d() == null) {
            listP0 = p();
        } else if (ignoreApolloClientHttpHeaders) {
            listP0 = apolloRequest.d();
        } else {
            List<HttpHeader> listP = p();
            if (listP == null) {
                listP = v.m();
            }
            List<HttpHeader> listD = apolloRequest.d();
            s.h(listD);
            listP0 = v.P0(listP, listD);
        }
        ii.f.a<D> aVarN = aVarE.n(listP0);
        if (apolloRequest.getHttpMethod() != null) {
            aVarN.o(apolloRequest.getHttpMethod());
        }
        if (apolloRequest.getSendApqExtensions() != null) {
            aVarN.p(apolloRequest.getSendApqExtensions());
        }
        if (apolloRequest.getSendDocument() != null) {
            aVarN.q(apolloRequest.getSendDocument());
        }
        if (apolloRequest.getEnableAutoPersistedQueries() != null) {
            aVarN.e(apolloRequest.getEnableAutoPersistedQueries());
        }
        if (apolloRequest.getCanBeBatched() != null) {
            aVarN.b("X-APOLLO-CAN-BE-BATCHED", String.valueOf(apolloRequest.getCanBeBatched()));
        }
        return new oi.c(v.Q0(this.interceptors, this.networkInterceptor), 0).a(aVarN.c());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CoroutineScopeKt.cancel$default(this.concurrencyInfo.getCoroutineScope(), null, 1, null);
        this.networkTransport.dispose();
        this.subscriptionNetworkTransport.dispose();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public r getExecutionContext() {
        return this.executionContext;
    }

    public List<HttpHeader> p() {
        return this.httpHeaders;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public f getHttpMethod() {
        return this.httpMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(ri.a aVar, k kVar, ri.a aVar2, List<? extends oi.a> list, r rVar, CoroutineDispatcher coroutineDispatcher, f fVar, List<HttpHeader> list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, a aVar3) {
        this.networkTransport = aVar;
        this.customScalarAdapters = kVar;
        this.subscriptionNetworkTransport = aVar2;
        this.interceptors = list;
        this.executionContext = rVar;
        this.dispatcher = coroutineDispatcher;
        this.httpMethod = fVar;
        this.httpHeaders = list2;
        this.sendApqExtensions = bool;
        this.sendDocument = bool2;
        this.enableAutoPersistedQueries = bool3;
        this.canBeBatched = bool4;
        this.builder = aVar3;
        coroutineDispatcher = coroutineDispatcher == null ? pi.f.b() : coroutineDispatcher;
        c cVar = new c(coroutineDispatcher, CoroutineScopeKt.CoroutineScope(coroutineDispatcher));
        this.concurrencyInfo = cVar;
        this.networkInterceptor = new d(aVar, aVar2, cVar.getDispatcher());
    }
}
