package w2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import y2.DeltaCounter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u00107\u001a\u0004\b/\u00108\"\u0004\b9\u0010:R*\u0010?\u001a\u0002062\u0006\u0010\u0011\u001a\u0002068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A0@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lw2/f;", "K", "V", "", "Lkotlin/collections/i;", "Lw2/d;", "map", "<init>", "(Lw2/d;)V", "b", "()Lw2/d;", Action.KEY_ATTRIBUTE, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "Ljn0/h0;", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "a", "Lw2/d;", "Ly2/e;", "<set-?>", "Ly2/e;", "h", "()Ly2/e;", "k", "(Ly2/e;)V", "ownership", "Lw2/t;", "c", "Lw2/t;", "e", "()Lw2/t;", "setNode$runtime_release", "(Lw2/t;)V", "node", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "operationResult", "", "I", "()I", IntegerTokenConverter.CONVERTER_KEY, "(I)V", "modCount", "f", "getSize", "l", "size", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class f<K, V> extends p013kotlin.collections.i<K, V> implements Map, xn0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d<K, V> map;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private y2.e ownership = new y2.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t<K, V> node;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V operationResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int size;

    public f(d<K, V> dVar) {
        this.map = dVar;
        this.node = this.map.r();
        this.size = this.map.size();
    }

    /* JADX INFO: renamed from: b */
    public d<K, V> build() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t<K, V> tVarA = t.INSTANCE.a();
        p013kotlin.jvm.internal.s.i(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = tVarA;
        l(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    public final t<K, V> e() {
        return this.node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // p013kotlin.collections.i
    public Set<Map.Entry<K, V>> getEntries() {
        return new h(this);
    }

    @Override // p013kotlin.collections.i
    public Set<K> getKeys() {
        return new j(this);
    }

    @Override // p013kotlin.collections.i
    public int getSize() {
        return this.size;
    }

    @Override // p013kotlin.collections.i
    public Collection<V> getValues() {
        return new l(this);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final y2.e getOwnership() {
        return this.ownership;
    }

    public final void i(int i11) {
        this.modCount = i11;
    }

    public final void j(V v11) {
        this.operationResult = v11;
    }

    protected final void k(y2.e eVar) {
        this.ownership = eVar;
    }

    public void l(int i11) {
        this.size = i11;
        this.modCount++;
    }

    @Override // p013kotlin.collections.i, java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.D(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        d<K, V> dVarB = from instanceof d ? (d) from : null;
        if (dVarB == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVarB = fVar != null ? fVar.build() : null;
        }
        if (dVarB == null) {
            super.putAll(from);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        t<K, V> tVar = this.node;
        t<K, V> tVarR = dVarB.r();
        p013kotlin.jvm.internal.s.i(tVarR, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = tVar.E(tVarR, 0, deltaCounter, this);
        int size2 = (dVarB.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            l(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K key) {
        this.operationResult = null;
        t tVarG = this.node.G(key != null ? key.hashCode() : 0, key, 0, this);
        if (tVarG == null) {
            tVarG = t.INSTANCE.a();
            p013kotlin.jvm.internal.s.i(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = tVarG;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = size();
        t tVarH = this.node.H(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (tVarH == null) {
            tVarH = t.INSTANCE.a();
            p013kotlin.jvm.internal.s.i(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = tVarH;
        return size != size();
    }
}
