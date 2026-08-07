package ii;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ii.v.a;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0016Bc\b\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lii/g;", "Lii/v$a;", "D", "", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "Lii/v;", "operation", "data", "", "Lii/o;", "errors", "", "", "extensions", "Lii/r;", "executionContext", "", "isLast", "<init>", "(Ljava/util/UUID;Lii/v;Lii/v$a;Ljava/util/List;Ljava/util/Map;Lii/r;Z)V", "a", "()Z", "Lii/g$a;", "b", "()Lii/g$a;", "Ljava/util/UUID;", "Lii/v;", "c", "Lii/v$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "e", "Ljava/util/Map;", "f", "Lii/r;", "g", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g<D extends v.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final UUID requestUuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final v<D> operation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final D data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<Error> errors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> extensions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final r executionContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isLast;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u001a\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R\u0016\u0010\t\u001a\u0004\u0018\u00018\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010'R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lii/g$a;", "Lii/v$a;", "D", "", "Lii/v;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "data", "<init>", "(Lii/v;Ljava/util/UUID;Lii/v$a;)V", "Lii/r;", "executionContext", "a", "(Lii/r;)Lii/g$a;", "", "Lii/o;", "errors", "c", "(Ljava/util/List;)Lii/g$a;", "", "", "extensions", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Lii/g$a;", "f", "(Ljava/util/UUID;)Lii/g$a;", "", "isLast", "e", "(Z)Lii/g$a;", "Lii/g;", "b", "()Lii/g;", "Lii/v;", "Ljava/util/UUID;", "Lii/v$a;", "Lii/r;", "Ljava/util/List;", "Ljava/util/Map;", "g", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<D extends v.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final v<D> operation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private UUID requestUuid;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final D data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private r executionContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private List<Error> errors;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Map<String, ? extends Object> extensions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean isLast;

        public a(v<D> operation, UUID requestUuid, D d11) {
            p013kotlin.jvm.internal.s.k(operation, "operation");
            p013kotlin.jvm.internal.s.k(requestUuid, "requestUuid");
            this.operation = operation;
            this.requestUuid = requestUuid;
            this.data = d11;
            this.executionContext = r.f78163b;
        }

        public final a<D> a(r executionContext) {
            p013kotlin.jvm.internal.s.k(executionContext, "executionContext");
            this.executionContext = this.executionContext.c(executionContext);
            return this;
        }

        public final g<D> b() {
            v<D> vVar = this.operation;
            UUID uuid = this.requestUuid;
            D d11 = this.data;
            r rVar = this.executionContext;
            Map<String, ? extends Object> mapI = this.extensions;
            if (mapI == null) {
                mapI = v0.i();
            }
            return new g<>(uuid, vVar, d11, this.errors, mapI, rVar, this.isLast, null);
        }

        public final a<D> c(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        public final a<D> d(Map<String, ? extends Object> extensions) {
            this.extensions = extensions;
            return this;
        }

        public final a<D> e(boolean isLast) {
            this.isLast = isLast;
            return this;
        }

        public final a<D> f(UUID requestUuid) {
            p013kotlin.jvm.internal.s.k(requestUuid, "requestUuid");
            this.requestUuid = requestUuid;
            return this;
        }
    }

    public /* synthetic */ g(UUID uuid, v vVar, v.a aVar, List list, Map map, r rVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, vVar, aVar, list, map, rVar, z11);
    }

    public final boolean a() {
        List<Error> list = this.errors;
        return !(list == null || list.isEmpty());
    }

    public final a<D> b() {
        return new a(this.operation, this.requestUuid, this.data).c(this.errors).d(this.extensions).a(this.executionContext).e(this.isLast);
    }

    private g(UUID uuid, v<D> vVar, D d11, List<Error> list, Map<String, ? extends Object> map, r rVar, boolean z11) {
        this.requestUuid = uuid;
        this.operation = vVar;
        this.data = d11;
        this.errors = list;
        this.extensions = map;
        this.executionContext = rVar;
        this.isLast = z11;
    }
}
