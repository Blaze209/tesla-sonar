package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010B¨\u0006C"}, d2 = {"Landroidx/collection/x0;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/collection/x0;)V", "Ljn0/h0;", "clear", "()V", "minimumCapacity", "c", Action.KEY_ATTRIBUTE, "", "containsKey", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)I", "value", "b", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Object;", "m", "l", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "j", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "k", Parser.REPLACE_CONVERTER_WORD, "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;I)I", "h", "", "a", "[I", "hashes", "", "[Ljava/lang/Object;", "array", "I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class x0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    public x0() {
        this(0, 1, null);
    }

    private final int d(K key, int hash) {
        int i11 = this.size;
        if (i11 == 0) {
            return -1;
        }
        int iA = n1.a.a(this.hashes, i11, hash);
        if (iA < 0 || p013kotlin.jvm.internal.s.f(key, this.array[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.hashes[i12] == hash) {
            if (p013kotlin.jvm.internal.s.f(key, this.array[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.hashes[i13] == hash; i13--) {
            if (p013kotlin.jvm.internal.s.f(key, this.array[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int h() {
        int i11 = this.size;
        if (i11 == 0) {
            return -1;
        }
        int iA = n1.a.a(this.hashes, i11, 0);
        if (iA < 0 || this.array[iA << 1] == null) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.hashes[i12] == 0) {
            if (this.array[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.hashes[i13] == 0; i13--) {
            if (this.array[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int b(V value) {
        int i11 = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (p013kotlin.jvm.internal.s.f(value, objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public void c(int minimumCapacity) {
        int i11 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
        }
        if (this.size != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = n1.a.f92645a;
            this.array = n1.a.f92647c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return e(key) >= 0;
    }

    public boolean containsValue(V value) {
        return b(value) >= 0;
    }

    public int e(K key) {
        return key == null ? h() : d(key, key.hashCode());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof x0) {
                if (getSize() != ((x0) other).getSize()) {
                    return false;
                }
                x0 x0Var = (x0) other;
                int i11 = this.size;
                for (int i12 = 0; i12 < i11; i12++) {
                    K kI = i(i12);
                    V vM = m(i12);
                    Object obj = x0Var.get(kI);
                    if (vM == null) {
                        if (obj != null || !x0Var.containsKey(kI)) {
                            return false;
                        }
                    } else if (!p013kotlin.jvm.internal.s.f(vM, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i13 = this.size;
            for (int i14 = 0; i14 < i13; i14++) {
                K kI2 = i(i14);
                V vM2 = m(i14);
                Object obj2 = ((Map) other).get(kI2);
                if (vM2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kI2)) {
                        return false;
                    }
                } else if (!p013kotlin.jvm.internal.s.f(vM2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K key) {
        int iE = e(key);
        if (iE >= 0) {
            return (V) this.array[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object key, V defaultValue) {
        int iE = e(key);
        return iE >= 0 ? (V) this.array[(iE << 1) + 1] : defaultValue;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i11 = this.size;
        int i12 = 1;
        int i13 = 0;
        int iHashCode = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return iHashCode;
    }

    public K i(int index) {
        boolean z11 = false;
        if (index >= 0 && index < this.size) {
            z11 = true;
        }
        if (!z11) {
            n1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (K) this.array[index << 1];
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public void j(x0<? extends K, ? extends V> map) {
        p013kotlin.jvm.internal.s.k(map, "map");
        int i11 = map.size;
        c(this.size + i11);
        if (this.size != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(map.i(i12), map.m(i12));
            }
        } else if (i11 > 0) {
            p013kotlin.collections.n.n(map.hashes, this.hashes, 0, 0, i11);
            p013kotlin.collections.n.p(map.array, this.array, 0, 0, i11 << 1);
            this.size = i11;
        }
    }

    public V k(int index) {
        if (!(index >= 0 && index < this.size)) {
            n1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        Object[] objArr = this.array;
        int i11 = index << 1;
        V v11 = (V) objArr[i11 + 1];
        int i12 = this.size;
        if (i12 <= 1) {
            clear();
            return v11;
        }
        int i13 = i12 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (index < i13) {
                int i14 = index + 1;
                p013kotlin.collections.n.n(iArr, iArr, index, i14, i12);
                Object[] objArr2 = this.array;
                p013kotlin.collections.n.p(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.array;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i16 << 1);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
            if (i12 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (index > 0) {
                p013kotlin.collections.n.n(iArr, this.hashes, 0, 0, index);
                p013kotlin.collections.n.p(objArr, this.array, 0, 0, i11);
            }
            if (index < i13) {
                int i17 = index + 1;
                p013kotlin.collections.n.n(iArr, this.hashes, index, i17, i12);
                p013kotlin.collections.n.p(objArr, this.array, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i13;
        return v11;
    }

    public V l(int index, V value) {
        boolean z11 = false;
        if (index >= 0 && index < this.size) {
            z11 = true;
        }
        if (!z11) {
            n1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        int i11 = (index << 1) + 1;
        Object[] objArr = this.array;
        V v11 = (V) objArr[i11];
        objArr[i11] = value;
        return v11;
    }

    public V m(int index) {
        boolean z11 = false;
        if (index >= 0 && index < this.size) {
            z11 = true;
        }
        if (!z11) {
            n1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (V) this.array[(index << 1) + 1];
    }

    public V put(K key, V value) {
        int i11 = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iD = key != null ? d(key, iHashCode) : h();
        if (iD >= 0) {
            int i12 = (iD << 1) + 1;
            Object[] objArr = this.array;
            V v11 = (V) objArr[i12];
            objArr[i12] = value;
            return v11;
        }
        int i13 = ~iD;
        int[] iArr = this.hashes;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i14 << 1);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
            if (i11 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.hashes;
            int i15 = i13 + 1;
            p013kotlin.collections.n.n(iArr2, iArr2, i15, i13, i11);
            Object[] objArr2 = this.array;
            p013kotlin.collections.n.p(objArr2, objArr2, i15 << 1, i13 << 1, this.size << 1);
        }
        int i16 = this.size;
        if (i11 == i16) {
            int[] iArr3 = this.hashes;
            if (i13 < iArr3.length) {
                iArr3[i13] = iHashCode;
                Object[] objArr3 = this.array;
                int i17 = i13 << 1;
                objArr3[i17] = key;
                objArr3[i17 + 1] = value;
                this.size = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K key, V value) {
        V v11 = get(key);
        return v11 == null ? put(key, value) : v11;
    }

    public V remove(K key) {
        int iE = e(key);
        if (iE >= 0) {
            return k(iE);
        }
        return null;
    }

    public V replace(K key, V value) {
        int iE = e(key);
        if (iE >= 0) {
            return l(iE, value);
        }
        return null;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append(CoreConstants.CURLY_LEFT);
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            K kI = i(i12);
            if (kI != sb2) {
                sb2.append(kI);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vM = m(i12);
            if (vM != sb2) {
                sb2.append(vM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public x0(int i11) {
        this.hashes = i11 == 0 ? n1.a.f92645a : new int[i11];
        this.array = i11 == 0 ? n1.a.f92647c : new Object[i11 << 1];
    }

    public boolean remove(K key, V value) {
        int iE = e(key);
        if (iE < 0 || !p013kotlin.jvm.internal.s.f(value, m(iE))) {
            return false;
        }
        k(iE);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iE = e(key);
        if (iE < 0 || !p013kotlin.jvm.internal.s.f(oldValue, m(iE))) {
            return false;
        }
        l(iE, newValue);
        return true;
    }

    public /* synthetic */ x0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }

    public x0(x0<? extends K, ? extends V> x0Var) {
        this(0, 1, null);
        if (x0Var != null) {
            j(x0Var);
        }
    }
}
