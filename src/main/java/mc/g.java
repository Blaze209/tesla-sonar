package mc;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.n;
import java.util.Map;
import p013kotlin.Metadata;
import yc.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0007*\u0001\u001f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lmc/g;", "Lmc/i;", "", "maxSize", "Lmc/j;", "weakMemoryCache", "<init>", "(JLmc/j;)V", "Lmc/d$b;", Action.KEY_ATTRIBUTE, "Lmc/d$c;", "a", "(Lmc/d$b;)Lmc/d$c;", "Lec/n;", "image", "", "", "", "extras", "size", "Ljn0/h0;", "c", "(Lmc/d$b;Lec/n;Ljava/util/Map;J)V", "", "b", "(Lmc/d$b;)Z", "clear", "()V", DateTokenConverter.CONVERTER_KEY, "(J)V", "Lmc/j;", "mc/g$b", "Lmc/g$b;", "cache", "getSize", "()J", "f", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j weakMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b cache;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmc/g$a;", "", "Lec/n;", "image", "", "", "extras", "", "size", "<init>", "(Lec/n;Ljava/util/Map;J)V", "a", "Lec/n;", "b", "()Lec/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> extras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long size;

        public a(n nVar, Map<String, ? extends Object> map, long j11) {
            this.image = nVar;
            this.extras = map;
            this.size = j11;
        }

        public final Map<String, Object> a() {
            return this.extras;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"mc/g$b", "Lyc/u;", "Lmc/d$b;", "Lmc/g$a;", Action.KEY_ATTRIBUTE, "value", "", "m", "(Lmc/d$b;Lmc/g$a;)J", "oldValue", "newValue", "Ljn0/h0;", "l", "(Lmc/d$b;Lmc/g$a;Lmc/g$a;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends u<d.Key, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f91757d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, g gVar) {
            super(j11);
            this.f91757d = gVar;
        }

        @Override // yc.u
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void b(d.Key key, a oldValue, a newValue) {
            this.f91757d.weakMemoryCache.c(key, oldValue.getImage(), oldValue.a(), oldValue.getSize());
        }

        @Override // yc.u
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public long j(d.Key key, a value) {
            return value.getSize();
        }
    }

    public g(long j11, j jVar) {
        this.weakMemoryCache = jVar;
        this.cache = new b(j11, this);
    }

    @Override // mc.i
    public d.Value a(d.Key key) {
        a aVarC = this.cache.c(key);
        if (aVarC != null) {
            return new d.Value(aVarC.getImage(), aVarC.a());
        }
        return null;
    }

    @Override // mc.i
    public boolean b(d.Key key) {
        return this.cache.h(key) != null;
    }

    @Override // mc.i
    public void c(d.Key key, n image, Map<String, ? extends Object> extras, long size) {
        if (size <= f()) {
            this.cache.f(key, new a(image, extras, size));
        } else {
            this.cache.h(key);
            this.weakMemoryCache.c(key, image, extras, size);
        }
    }

    @Override // mc.i
    public void clear() {
        this.cache.a();
    }

    @Override // mc.i
    public void d(long size) {
        this.cache.k(size);
    }

    public long f() {
        return this.cache.getMaxSize();
    }

    @Override // mc.i
    public long getSize() {
        return this.cache.e();
    }
}
