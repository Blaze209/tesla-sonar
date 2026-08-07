package w2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 +*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001,B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lw2/d;", "K", "V", "Lkotlin/collections/f;", "", "Lw2/t;", "node", "", "size", "<init>", "(Lw2/t;I)V", "Lu2/d;", "", "p", "()Lu2/d;", "", "h", "()Ljava/util/Set;", Action.KEY_ATTRIBUTE, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Lw2/d;", "u", "(Ljava/lang/Object;)Lw2/d;", "b", "Lw2/t;", "r", "()Lw2/t;", "c", "I", "j", "()I", "q", "keys", "Lu2/b;", "s", "()Lu2/b;", "values", DateTokenConverter.CONVERTER_KEY, "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class d<K, V> extends p013kotlin.collections.f<K, V> implements Map, xn0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f120475e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f120476f = new d(t.INSTANCE.a(), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t<K, V> node;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: w2.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lw2/d$a;", "", "<init>", "()V", "K", "V", "Lw2/d;", "a", "()Lw2/d;", "", "EMPTY", "Lw2/d;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f120476f;
            p013kotlin.jvm.internal.s.i(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        private Companion() {
        }
    }

    public d(t<K, V> tVar, int i11) {
        this.node = tVar;
        this.size = i11;
    }

    private final u2.d<Map.Entry<K, V>> p() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(K key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // java.util.Map
    public V get(K key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // p013kotlin.collections.f
    public final Set<Map.Entry<K, V>> h() {
        return p();
    }

    @Override // p013kotlin.collections.f
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // p013kotlin.collections.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public u2.d<K> i() {
        return new p(this);
    }

    public final t<K, V> r() {
        return this.node;
    }

    @Override // p013kotlin.collections.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public u2.b<V> k() {
        return new r(this);
    }

    public d<K, V> t(K key, V value) {
        t.b<K, V> bVarP = this.node.P(key != null ? key.hashCode() : 0, key, value, 0);
        return bVarP == null ? this : new d<>(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    public d<K, V> u(K key) {
        t<K, V> tVarQ = this.node.Q(key != null ? key.hashCode() : 0, key, 0);
        if (this.node == tVarQ) {
            return this;
        }
        return tVarQ == null ? INSTANCE.a() : new d<>(tVarQ, size() - 1);
    }
}
