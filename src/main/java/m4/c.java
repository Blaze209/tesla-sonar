package m4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\"\u0010-\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u0007¨\u0006."}, d2 = {"Lm4/c;", "K", "V", "", "", "capacity", "<init>", "(I)V", Action.KEY_ATTRIBUTE, "hash", "c", "(Ljava/lang/Object;I)I", "e", "()I", "", "a", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)I", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "g", "(I)Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "f", "()Z", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "get_size", "set_size", "_size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] keyValues;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _size;

    public c(int i11) {
        if (i11 == 0) {
            this.hashes = a.f91035a;
            this.keyValues = a.f91036b;
        } else {
            this.hashes = new int[i11];
            this.keyValues = new Object[i11 << 1];
        }
        this._size = 0;
    }

    public final boolean a(K key) {
        return d(key) >= 0;
    }

    public final V b(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return (V) this.keyValues[(iD << 1) + 1];
        }
        return null;
    }

    protected final int c(Object key, int hash) {
        int i11 = this._size;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.hashes, i11, hash);
        if (iA < 0 || s.f(key, this.keyValues[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.hashes[i12] == hash) {
            if (s.f(key, this.keyValues[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.hashes[i13] == hash; i13--) {
            if (s.f(key, this.keyValues[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int d(Object key) {
        return key == null ? e() : c(key, key.hashCode());
    }

    protected final int e() {
        int i11 = this._size;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.hashes, i11, 0);
        if (iA < 0 || this.keyValues[iA << 1] == null) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.hashes[i12] == 0) {
            if (this.keyValues[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.hashes[i13] == 0; i13--) {
            if (this.keyValues[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof c) {
                c cVar = (c) other;
                int i11 = this._size;
                if (i11 != cVar._size) {
                    return false;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    K kG = g(i12);
                    V vI = i(i12);
                    Object objB = cVar.b(kG);
                    if (vI == null) {
                        if (objB != null || !cVar.a(kG)) {
                            return false;
                        }
                    } else if (!s.f(vI, objB)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i13 = this._size;
            for (int i14 = 0; i14 < i13; i14++) {
                K kG2 = g(i14);
                V vI2 = i(i14);
                Object obj = ((Map) other).get(kG2);
                if (vI2 == null) {
                    if (obj != null || !((Map) other).containsKey(kG2)) {
                        return false;
                    }
                } else if (!s.f(vI2, obj)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this._size <= 0;
    }

    public final K g(int index) {
        return (K) this.keyValues[index << 1];
    }

    public final V h(K key, V value) {
        int iHashCode;
        int iC;
        int i11 = this._size;
        if (key == null) {
            iC = e();
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
            iC = c(key, iHashCode);
        }
        if (iC >= 0) {
            int i12 = (iC << 1) + 1;
            Object[] objArr = this.keyValues;
            V v11 = (V) objArr[i12];
            objArr[i12] = value;
            return v11;
        }
        int i13 = ~iC;
        int[] iArr = this.hashes;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
            s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i14 << 1);
            s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
            if (i11 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.hashes;
            int i15 = i13 + 1;
            n.n(iArr2, iArr2, i15, i13, i11);
            Object[] objArr2 = this.keyValues;
            n.p(objArr2, objArr2, i15 << 1, i13 << 1, this._size << 1);
        }
        int i16 = this._size;
        if (i11 == i16) {
            int[] iArr3 = this.hashes;
            if (i13 < iArr3.length) {
                iArr3[i13] = iHashCode;
                Object[] objArr3 = this.keyValues;
                int i17 = i13 << 1;
                objArr3[i17] = key;
                objArr3[i17 + 1] = value;
                this._size = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i11 = this._size;
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

    public final V i(int index) {
        return (V) this.keyValues[(index << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this._size * 28);
        sb2.append(CoreConstants.CURLY_LEFT);
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            K kG = g(i12);
            if (kG != this) {
                sb2.append(kG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vI = i(i12);
            if (vI != this) {
                sb2.append(vI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public /* synthetic */ c(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
