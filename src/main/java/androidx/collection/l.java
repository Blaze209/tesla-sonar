package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001c\u0010\u001c\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u0012\u0004\b\u001b\u0010\u0003R\u001c\u0010 \u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u0012\u0004\b\u001f\u0010\u0003R\u001c\u0010\"\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010\u001e\u0012\u0004\b!\u0010\u0003R\u001c\u0010&\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u0003R\u001c\u0010(\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\f\u0010$\u0012\u0004\b'\u0010\u0003R\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0011\u0082\u0001\u0001,¨\u0006-"}, d2 = {"Landroidx/collection/l;", "", "<init>", "()V", "", "g", "()Z", "", Action.KEY_ATTRIBUTE, "c", "(I)I", "defaultValue", "e", "(II)I", "a", "(I)Z", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "b", "", "[J", "getMetadata$annotations", OrcaKeys.METADATA, "", "[I", "getKeys$annotations", "keys", "getValues$annotations", "values", DateTokenConverter.CONVERTER_KEY, "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "f", "size", "Landroidx/collection/a0;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(int key) {
        return b(key) >= 0;
    }

    public final int b(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int c(int key) {
        int iB = b(key);
        if (iB >= 0) {
            return this.values[iB];
        }
        throw new NoSuchElementException("Cannot find value for key " + key);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final int e(int key, int defaultValue) {
        int iB = b(key);
        return iB >= 0 ? this.values[iB] : defaultValue;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[LOOP:0: B:14:0x0027->B:26:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[SYNTHETIC] */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        if (lVar.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (iArr2[i14] != lVar.c(iArr[i14])) {
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
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int iHashCode = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        int i15 = iArr[i14];
                        iHashCode += Integer.hashCode(iArr2[i14]) ^ Integer.hashCode(i15);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[DONT_INVERT, PHI: r8
      0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[LOOP:0: B:9:0x0023->B:21:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[EDGE_INSN: B:25:0x0075->B:22:0x0075 BREAK  A[LOOP:0: B:9:0x0023->B:21:0x0072], SYNTHETIC] */
    public String toString() {
        if (g()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.CURLY_LEFT);
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr[i15];
                            int i17 = iArr2[i15];
                            sb2.append(i16);
                            sb2.append("=");
                            sb2.append(i17);
                            i12++;
                            if (i12 < this._size) {
                                sb2.append(CoreConstants.COMMA_CHAR);
                                sb2.append(' ');
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "s.append('}').toString()");
        return string;
    }

    private l() {
        this.metadata = u0.f3930a;
        this.keys = r.a();
        this.values = r.a();
    }
}
