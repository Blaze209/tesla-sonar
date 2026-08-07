package wk0;

import bl0.HttpMethod;
import bl0.d0;
import bl0.j0;
import bl0.k;
import bl0.k0;
import bl0.l;
import bl0.r;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import dl0.a0;
import il0.TypeInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\tJ-\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%R*\u0010-\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R*\u00105\u001a\u00020.2\u0006\u0010'\u001a\u00020.8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00109\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b#\u00108R(\u0010?\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lwk0/c;", "Lbl0/r;", "<init>", "()V", "Lwk0/d;", "a", "()Lwk0/d;", "builder", "p", "(Lwk0/c;)Lwk0/c;", "o", "", "T", "Lrk0/d;", Action.KEY_ATTRIBUTE, "capability", "Ljn0/h0;", "l", "(Lrk0/d;Ljava/lang/Object;)V", "f", "(Lrk0/d;)Ljava/lang/Object;", "Lbl0/d0;", "Lbl0/d0;", IntegerTokenConverter.CONVERTER_KEY, "()Lbl0/d0;", ImagesContract.URL, "Lbl0/t;", "b", "Lbl0/t;", "h", "()Lbl0/t;", "n", "(Lbl0/t;)V", "method", "Lbl0/l;", "c", "Lbl0/l;", "()Lbl0/l;", "headers", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "body", "Lkotlinx/coroutines/Job;", "e", "Lkotlinx/coroutines/Job;", "g", "()Lkotlinx/coroutines/Job;", "m", "(Lkotlinx/coroutines/Job;)V", "executionContext", "Ldl0/b;", "Ldl0/b;", "()Ldl0/b;", "attributes", "Lil0/a;", "value", "()Lil0/a;", "k", "(Lil0/a;)V", "bodyType", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d0 url = new d0(null, null, 0, null, null, null, null, null, false, 511, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private HttpMethod method = HttpMethod.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l headers = new l(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object body = p028zk0.c.f128424a;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Job executionContext = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dl0.b attributes = dl0.d.a(true);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "", "Lrk0/d;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<Map<rk0.d<?>, Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f121998c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        public final Map<rk0.d<?>, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    public final HttpRequestData a() {
        k0 k0VarB = this.url.b();
        HttpMethod httpMethod = this.method;
        k kVarN = getHeaders().n();
        Object obj = this.body;
        cl0.b bVar = obj instanceof cl0.b ? (cl0.b) obj : null;
        if (bVar != null) {
            return new HttpRequestData(k0VarB, httpMethod, kVarN, bVar, this.executionContext, this.attributes);
        }
        throw new IllegalStateException(("No request transformation found: " + this.body).toString());
    }

    @Override // bl0.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public l getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final dl0.b getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    public final TypeInfo e() {
        return (TypeInfo) this.attributes.a(i.a());
    }

    public final <T> T f(rk0.d<T> key) {
        s.k(key, "key");
        Map map = (Map) this.attributes.a(rk0.e.a());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Job getExecutionContext() {
        return this.executionContext;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final HttpMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d0 getUrl() {
        return this.url;
    }

    public final void j(Object obj) {
        s.k(obj, "<set-?>");
        this.body = obj;
    }

    public final void k(TypeInfo typeInfo) {
        if (typeInfo != null) {
            this.attributes.c(i.a(), typeInfo);
        } else {
            this.attributes.b(i.a());
        }
    }

    public final <T> void l(rk0.d<T> key, T capability) {
        s.k(key, "key");
        s.k(capability, "capability");
        ((Map) this.attributes.g(rk0.e.a(), b.f121998c)).put(key, capability);
    }

    public final void m(Job job) {
        s.k(job, "<set-?>");
        this.executionContext = job;
    }

    public final void n(HttpMethod httpMethod) {
        s.k(httpMethod, "<set-?>");
        this.method = httpMethod;
    }

    public final c o(c builder) {
        s.k(builder, "builder");
        this.method = builder.method;
        this.body = builder.body;
        k(builder.e());
        j0.g(this.url, builder.url);
        d0 d0Var = this.url;
        d0Var.u(d0Var.g());
        a0.c(getHeaders(), builder.getHeaders());
        dl0.e.a(this.attributes, builder.attributes);
        return this;
    }

    public final c p(c builder) {
        s.k(builder, "builder");
        this.executionContext = builder.executionContext;
        return o(builder);
    }
}
