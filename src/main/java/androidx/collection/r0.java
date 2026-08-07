package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b\u001d\u0010\u0004R$\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0019\u0010 \u0012\u0004\b!\u0010\u0004R\u001c\u0010$\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010\u001c\u0012\u0004\b#\u0010\u0004R\u001c\u0010(\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010\u0004R\u001c\u0010*\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\r\u0010&\u0012\u0004\b)\u0010\u0004R\u0011\u0010+\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0011\u0010-\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010\u0013\u0082\u0001\u0001.¨\u0006/"}, d2 = {"Landroidx/collection/r0;", "K", "", "<init>", "()V", "", "g", "()Z", Action.KEY_ATTRIBUTE, "", "c", "(Ljava/lang/Object;)J", "defaultValue", "e", "(Ljava/lang/Object;J)J", "a", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "other", "equals", "", "toString", "()Ljava/lang/String;", "b", "(Ljava/lang/Object;)I", "", "[J", "getMetadata$annotations", OrcaKeys.METADATA, "", "[Ljava/lang/Object;", "getKeys$annotations", "keys", "getValues$annotations", "values", DateTokenConverter.CONVERTER_KEY, "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "f", "size", "Landroidx/collection/j0;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r0<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Object[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ r0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(K key) {
        return b(key) >= 0;
    }

    public final int b(K key) {
        int i11 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 & 127;
        int i14 = this._capacity;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.metadata;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (((long) i13) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (p013kotlin.jvm.internal.s.f(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
    }

    public final long c(K key) {
        int iB = b(key);
        if (iB >= 0) {
            return this.values[iB];
        }
        throw new NoSuchElementException("There is no key " + key + " in the map");
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final long e(K key, long defaultValue) {
        int iB = b(key);
        return iB >= 0 ? this.values[iB] : defaultValue;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[LOOP:0: B:14:0x0027->B:26:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) other;
        if (r0Var.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr2[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (jArr[i14] != r0Var.c(objArr[i14])) {
                                return false;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 != length) {
                            i11++;
                        }
                    }
                } else if (i11 != length) {
                    i11++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean g() {
        return this._size == 0;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int iHashCode = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = objArr[i14];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i14]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return iHashCode;
                }
            }
            if (i11 == length) {
                return iHashCode;
            }
            i11++;
        }
    }

    public String toString() {
        int i11;
        int i12;
        if (g()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.CURLY_LEFT);
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j11 = jArr2[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j11) < 128) {
                            int i17 = (i13 << 3) + i16;
                            Object obj = objArr[i17];
                            i12 = i13;
                            long j12 = jArr[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(j12);
                            i14++;
                            if (i14 < this._size) {
                                sb2.append(CoreConstants.COMMA_CHAR);
                                sb2.append(' ');
                            }
                        } else {
                            i12 = i13;
                        }
                        j11 >>= 8;
                        i16++;
                        i13 = i12;
                    }
                    int i18 = i13;
                    if (i15 != 8) {
                        break;
                    }
                    i11 = i18;
                } else {
                    i11 = i13;
                }
                if (i11 == length) {
                    break;
                }
                i13 = i11 + 1;
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "s.append('}').toString()");
        return string;
    }

    private r0() {
        this.metadata = u0.f3930a;
        this.keys = n1.a.f92647c;
        this.values = u.a();
    }
}
