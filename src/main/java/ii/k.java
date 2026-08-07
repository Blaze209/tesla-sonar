package ii;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0002\u001b\u001cB1\b\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lii/k;", "Lii/r$c;", "", "", "Lii/b;", "customScalarAdapters", "Lii/c;", "adapterContext", "", "unsafe", "<init>", "(Ljava/util/Map;Lii/c;Z)V", "Lii/k$a;", "f", "()Lii/k$a;", "c", "Lii/c;", "e", "()Lii/c;", DateTokenConverter.CONVERTER_KEY, "Z", "Ljava/util/Map;", "adaptersMap", "Lii/r$d;", "getKey", "()Lii/r$d;", Action.KEY_ATTRIBUTE, "a", "b", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class k implements r.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f78142g = new a().c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f78143h = new a().d(true).c();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c adapterContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean unsafe;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b<?>> adaptersMap;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lii/k$a;", "", "<init>", "()V", "Lii/k;", "customScalarAdapters", "b", "(Lii/k;)Lii/k$a;", "", "unsafe", DateTokenConverter.CONVERTER_KEY, "(Z)Lii/k$a;", "c", "()Lii/k;", "Lii/c;", "adapterContext", "a", "(Lii/c;)Lii/k$a;", "", "", "Lii/b;", "Ljava/util/Map;", "adaptersMap", "Lii/c;", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, b<?>> adaptersMap = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private c adapterContext = new c.a().a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean unsafe;

        public final a a(c adapterContext) {
            p013kotlin.jvm.internal.s.k(adapterContext, "adapterContext");
            this.adapterContext = adapterContext;
            return this;
        }

        public final a b(k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            this.adaptersMap.putAll(customScalarAdapters.adaptersMap);
            return this;
        }

        public final k c() {
            return new k(this.adaptersMap, this.adapterContext, this.unsafe, null);
        }

        public final a d(boolean unsafe) {
            this.unsafe = unsafe;
            return this;
        }
    }

    /* JADX INFO: renamed from: ii.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lii/k$b;", "Lii/r$d;", "Lii/k;", "<init>", "()V", "Empty", "Lii/k;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion implements r.d<k> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ k(Map map, c cVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, cVar, z11);
    }

    @Override // ii.r.c, ii.r
    public <E extends r.c> E a(r.d<E> dVar) {
        return (E) r.c.a.b(this, dVar);
    }

    @Override // ii.r
    public r b(r.d<?> dVar) {
        return r.c.a.c(this, dVar);
    }

    @Override // ii.r
    public r c(r rVar) {
        return r.c.a.d(this, rVar);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getAdapterContext() {
        return this.adapterContext;
    }

    public final a f() {
        return new a().b(this);
    }

    @Override // ii.r
    public <R> R fold(R r11, wn0.p<? super R, ? super r.c, ? extends R> pVar) {
        return (R) r.c.a.a(this, r11, pVar);
    }

    @Override // ii.r.c
    public r.d<?> getKey() {
        return INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k(Map<String, ? extends b<?>> map, c cVar, boolean z11) {
        this.adapterContext = cVar;
        this.unsafe = z11;
        this.adaptersMap = map;
    }
}
