package pk0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import io.ktor.utils.io.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import wk0.HttpRequestData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00168\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001aR\u001a\u0010.\u001a\u00020+8\u0014X\u0094D¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b \u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lpk0/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lok0/a;", "client", "<init>", "(Lok0/a;)V", "Lwk0/d;", "requestData", "Lwk0/g;", "responseData", "(Lok0/a;Lwk0/d;Lwk0/g;)V", "Lio/ktor/utils/io/g;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lil0/a;", "info", "", "a", "(Lil0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lyk0/c;", "response", "Ljn0/h0;", "j", "(Lyk0/c;)V", "Lok0/a;", "c", "()Lok0/a;", "Lwk0/b;", "<set-?>", "b", "Lwk0/b;", DateTokenConverter.CONVERTER_KEY, "()Lwk0/b;", "h", "(Lwk0/b;)V", "request", "Lyk0/c;", "e", "()Lyk0/c;", IntegerTokenConverter.CONVERTER_KEY, "", "Z", "()Z", "allowDoubleReceive", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ldl0/b;", "getAttributes", "()Ldl0/b;", "attributes", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ok0.a client;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    protected wk0.b request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    protected yk0.c response;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDoubleReceive;
    private volatile /* synthetic */ int received;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl0.a<Object> f103141g = new dl0.a<>("CustomResponse");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f103140f = AtomicIntegerFieldUpdater.newUpdater(a.class, "received");

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {0, 0, 1, 1}, l = {86, 89}, m = "bodyNullable", n = {"this", "info", "this", "info"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f103146n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f103147o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f103148p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f103150r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f103148p = obj;
            this.f103150r |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    public a(ok0.a client) {
        s.k(client, "client");
        this.client = client;
        this.received = 0;
    }

    static /* synthetic */ Object g(a aVar, Continuation<? super g> continuation) {
        return aVar.e().getContent();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r7 == r1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(il0.TypeInfo r6, p013kotlin.coroutines.Continuation<java.lang.Object> r7) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk0.a.a(il0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    protected boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ok0.a getClient() {
        return this.client;
    }

    public final wk0.b d() {
        wk0.b bVar = this.request;
        if (bVar != null) {
            return bVar;
        }
        s.B("request");
        return null;
    }

    public final yk0.c e() {
        yk0.c cVar = this.response;
        if (cVar != null) {
            return cVar;
        }
        s.B("response");
        return null;
    }

    protected Object f(Continuation<? super g> continuation) {
        return g(this, continuation);
    }

    public final dl0.b getAttributes() {
        return d().getAttributes();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return e().getCoroutineContext();
    }

    protected final void h(wk0.b bVar) {
        s.k(bVar, "<set-?>");
        this.request = bVar;
    }

    protected final void i(yk0.c cVar) {
        s.k(cVar, "<set-?>");
        this.response = cVar;
    }

    public final void j(yk0.c response) {
        s.k(response, "response");
        i(response);
    }

    public String toString() {
        return "HttpClientCall[" + d().getUrl() + ", " + e().getStatus() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ok0.a client, HttpRequestData requestData, wk0.g responseData) {
        this(client);
        s.k(client, "client");
        s.k(requestData, "requestData");
        s.k(responseData, "responseData");
        h(new wk0.a(this, requestData));
        i(new yk0.a(this, responseData));
        if (responseData.getBody() instanceof g) {
            return;
        }
        getAttributes().c(f103141g, responseData.getBody());
    }
}
