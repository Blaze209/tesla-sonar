package ii;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ii.v.a;
import java.util.List;
import java.util.UUID;
import ji.HttpHeader;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0017Bm\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\"\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b+\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b\u001b\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u0017\u0010*¨\u0006,"}, d2 = {"Lii/f;", "Lii/v$a;", "D", "", "Lii/v;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "Lii/r;", "executionContext", "Lji/f;", "httpMethod", "", "Lji/d;", "httpHeaders", "", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "<init>", "(Lii/v;Ljava/util/UUID;Lii/r;Lji/f;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Lii/v;", "f", "()Lii/v;", "b", "Ljava/util/UUID;", "g", "()Ljava/util/UUID;", "c", "Lii/r;", "()Lii/r;", DateTokenConverter.CONVERTER_KEY, "Lji/f;", "e", "()Lji/f;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f<D extends v.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v<D> operation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UUID requestUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r executionContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ji.f httpMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> httpHeaders;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendApqExtensions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Boolean sendDocument;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Boolean enableAutoPersistedQueries;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Boolean canBeBatched;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\u001a\u0010,\u001a\u00060)j\u0002`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010+R*\u0010!\u001a\u00020 2\u0006\u0010-\u001a\u00020 8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\b8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R:\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00168\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR.\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00168\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR.\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00168\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010=\u001a\u0004\bE\u0010?\"\u0004\bF\u0010AR.\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00168\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010=\u001a\u0004\bB\u0010?\"\u0004\bG\u0010A¨\u0006H"}, d2 = {"Lii/f$a;", "Lii/v$a;", "D", "", "Lii/v;", "operation", "<init>", "(Lii/v;)V", "Lji/f;", "httpMethod", "o", "(Lji/f;)Lii/f$a;", "", "Lji/d;", "httpHeaders", "n", "(Ljava/util/List;)Lii/f$a;", "", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lii/f$a;", "", "sendApqExtensions", "p", "(Ljava/lang/Boolean;)Lii/f$a;", "sendDocument", "q", "enableAutoPersistedQueries", "e", "canBeBatched", DateTokenConverter.CONVERTER_KEY, "Lii/r;", "executionContext", "f", "(Lii/r;)Lii/f$a;", "a", "Lii/f;", "c", "()Lii/f;", "Lii/v;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "Ljava/util/UUID;", "requestUuid", "<set-?>", "Lii/r;", IntegerTokenConverter.CONVERTER_KEY, "()Lii/r;", "t", "(Lii/r;)V", "Lji/f;", "k", "()Lji/f;", "v", "(Lji/f;)V", "Ljava/util/List;", "j", "()Ljava/util/List;", "u", "(Ljava/util/List;)V", "Ljava/lang/Boolean;", "l", "()Ljava/lang/Boolean;", "w", "(Ljava/lang/Boolean;)V", "g", "m", "x", "h", "s", "r", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<D extends v.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private v<D> operation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private UUID requestUuid;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private r executionContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private ji.f httpMethod;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private List<HttpHeader> httpHeaders;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Boolean sendApqExtensions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Boolean sendDocument;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Boolean enableAutoPersistedQueries;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Boolean canBeBatched;

        public a(v<D> operation) {
            p013kotlin.jvm.internal.s.k(operation, "operation");
            this.operation = operation;
            UUID uuidRandomUUID = UUID.randomUUID();
            p013kotlin.jvm.internal.s.j(uuidRandomUUID, "randomUUID()");
            this.requestUuid = uuidRandomUUID;
            this.executionContext = r.f78163b;
        }

        public a<D> a(r executionContext) {
            p013kotlin.jvm.internal.s.k(executionContext, "executionContext");
            t(getExecutionContext().c(executionContext));
            return this;
        }

        public a<D> b(String name, String value) {
            p013kotlin.jvm.internal.s.k(name, "name");
            p013kotlin.jvm.internal.s.k(value, "value");
            List<HttpHeader> listJ = j();
            if (listJ == null) {
                listJ = p013kotlin.collections.v.m();
            }
            u(p013kotlin.collections.v.Q0(listJ, new HttpHeader(name, value)));
            return this;
        }

        public final f<D> c() {
            return new f<>(this.operation, this.requestUuid, getExecutionContext(), getHttpMethod(), j(), getSendApqExtensions(), getSendDocument(), getEnableAutoPersistedQueries(), getCanBeBatched(), null);
        }

        public a<D> d(Boolean canBeBatched) {
            r(canBeBatched);
            return this;
        }

        public a<D> e(Boolean enableAutoPersistedQueries) {
            s(enableAutoPersistedQueries);
            return this;
        }

        public final a<D> f(r executionContext) {
            p013kotlin.jvm.internal.s.k(executionContext, "executionContext");
            t(executionContext);
            return this;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public r getExecutionContext() {
            return this.executionContext;
        }

        public List<HttpHeader> j() {
            return this.httpHeaders;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public ji.f getHttpMethod() {
            return this.httpMethod;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public Boolean getSendDocument() {
            return this.sendDocument;
        }

        public a<D> n(List<HttpHeader> httpHeaders) {
            u(httpHeaders);
            return this;
        }

        public a<D> o(ji.f httpMethod) {
            v(httpMethod);
            return this;
        }

        public a<D> p(Boolean sendApqExtensions) {
            w(sendApqExtensions);
            return this;
        }

        public a<D> q(Boolean sendDocument) {
            x(sendDocument);
            return this;
        }

        @jn0.e
        public void r(Boolean bool) {
            this.canBeBatched = bool;
        }

        @jn0.e
        public void s(Boolean bool) {
            this.enableAutoPersistedQueries = bool;
        }

        @jn0.e
        public void t(r rVar) {
            p013kotlin.jvm.internal.s.k(rVar, "<set-?>");
            this.executionContext = rVar;
        }

        @jn0.e
        public void u(List<HttpHeader> list) {
            this.httpHeaders = list;
        }

        @jn0.e
        public void v(ji.f fVar) {
            this.httpMethod = fVar;
        }

        @jn0.e
        public void w(Boolean bool) {
            this.sendApqExtensions = bool;
        }

        @jn0.e
        public void x(Boolean bool) {
            this.sendDocument = bool;
        }
    }

    public /* synthetic */ f(v vVar, UUID uuid, r rVar, ji.f fVar, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, uuid, rVar, fVar, list, bool, bool2, bool3, bool4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public r getExecutionContext() {
        return this.executionContext;
    }

    public List<HttpHeader> d() {
        return this.httpHeaders;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public ji.f getHttpMethod() {
        return this.httpMethod;
    }

    public final v<D> f() {
        return this.operation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final UUID getRequestUuid() {
        return this.requestUuid;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    private f(v<D> vVar, UUID uuid, r rVar, ji.f fVar, List<HttpHeader> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.operation = vVar;
        this.requestUuid = uuid;
        this.executionContext = rVar;
        this.httpMethod = fVar;
        this.httpHeaders = list;
        this.sendApqExtensions = bool;
        this.sendDocument = bool2;
        this.enableAutoPersistedQueries = bool3;
        this.canBeBatched = bool4;
    }
}
