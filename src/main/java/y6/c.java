package y6;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001c\u001a\u00020\n2\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019\"\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010\u0014R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+¨\u0006-"}, d2 = {"Ly6/c;", "Ly6/f;", "", "Ly6/f$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "Ljn0/h0;", "e", "()V", "f", "T", Action.KEY_ATTRIBUTE, "b", "(Ly6/f$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", IntegerTokenConverter.CONVERTER_KEY, "(Ly6/f$a;Ljava/lang/Object;)V", "j", "", "Ly6/f$b;", "pairs", "g", "([Ly6/f$b;)V", "h", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core_release", "Ly6/b;", "Ly6/b;", "frozen", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<f.a<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b frozen;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Ly6/f$a;", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<Map.Entry<f.a<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f125150c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<f.a<?>, Object> entry) {
            s.k(entry, "entry");
            Object value = entry.getValue();
            return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? n.P0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // y6.f
    public Map<f.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry<f.a<?>, Object>> setEntrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                s.j(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.e(), pair.f());
        }
        return y6.a.b(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y6.f
    public <T> T b(f.a<T> key) {
        s.k(key, "key");
        T t11 = (T) this.preferencesMap.get(key);
        if (!(t11 instanceof byte[])) {
            return t11;
        }
        byte[] bArr = (byte[]) t11;
        T t12 = (T) Arrays.copyOf(bArr, bArr.length);
        s.j(t12, "copyOf(this, size)");
        return t12;
    }

    public final void e() {
        if (this.frozen.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object other) {
        boolean zF;
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        Map<f.a<?>, Object> map = cVar.preferencesMap;
        if (map == this.preferencesMap) {
            return true;
        }
        if (map.size() != this.preferencesMap.size()) {
            return false;
        }
        Map<f.a<?>, Object> map2 = cVar.preferencesMap;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<f.a<?>, Object> entry : map2.entrySet()) {
            Object obj = this.preferencesMap.get(entry.getKey());
            if (obj != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zF = s.f(value, obj);
                } else if ((obj instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj)) {
                    zF = true;
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (!zF) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        this.frozen.b(true);
    }

    public final void g(f.b<?>... pairs) {
        s.k(pairs, "pairs");
        e();
        for (f.b<?> bVar : pairs) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(f.a<T> key) {
        s.k(key, "key");
        e();
        return (T) this.preferencesMap.remove(key);
    }

    public int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final <T> void i(f.a<T> key, T value) {
        s.k(key, "key");
        j(key, value);
    }

    public final void j(f.a<?> key, Object value) {
        s.k(key, "key");
        e();
        if (value == null) {
            h(key);
            return;
        }
        if (value instanceof Set) {
            this.preferencesMap.put(key, y6.a.a((Set) value));
            return;
        }
        if (!(value instanceof byte[])) {
            this.preferencesMap.put(key, value);
            return;
        }
        Map<f.a<?>, Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) value;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        s.j(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return v.y0(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f125150c, 24, null);
    }

    public /* synthetic */ c(Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map, (i11 & 2) != 0 ? true : z11);
    }

    public c(Map<f.a<?>, Object> preferencesMap, boolean z11) {
        s.k(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new b(z11);
    }
}
