package androidx.collection;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\fR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/collection/e0;", "V", "Landroidx/collection/s;", "", "initialCapacity", "<init>", "(I)V", "Ljn0/h0;", "m", "capacity", "l", "k", "()V", "", Action.KEY_ATTRIBUTE, IntegerTokenConverter.CONVERTER_KEY, "(J)I", "hash1", "j", "(I)I", "f", "h", "newCapacity", "n", "value", "o", "(JLjava/lang/Object;)V", "g", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0<V> extends s<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public e0(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            n1.d.a("Capacity must be a positive value.");
        }
        m(u0.g(i11));
    }

    private final void f() {
        if (this._capacity <= 8 || Long.compare(jn0.c0.b(jn0.c0.b(this._size) * 32) ^ Long.MIN_VALUE, jn0.c0.b(jn0.c0.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            n(u0.e(this._capacity));
        } else {
            h();
        }
    }

    private final void h() {
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        long[] jArr2 = this.keys;
        Object[] objArr = this.values;
        u0.a(jArr, i11);
        int i12 = 0;
        int iB = -1;
        while (i12 != i11) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j11 = (jArr[i13] >> i14) & 255;
            if (j11 == 128) {
                iB = i12;
                i12++;
            } else {
                if (j11 == 254) {
                    int iHashCode = Long.hashCode(jArr2[i12]) * (-862048943);
                    int i15 = iHashCode ^ (iHashCode << 16);
                    int i16 = i15 >>> 7;
                    int iJ = j(i16);
                    int i17 = i16 & i11;
                    if (((iJ - i17) & i11) / 8 == ((i12 - i17) & i11) / 8) {
                        jArr[i13] = (((long) (i15 & 127)) << i14) | ((~(255 << i14)) & jArr[i13]);
                        jArr[p013kotlin.collections.n.t0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iJ >> 3;
                        long j12 = jArr[i18];
                        int i19 = (iJ & 7) << 3;
                        if (((j12 >> i19) & 255) == 128) {
                            jArr[i18] = (j12 & (~(255 << i19))) | (((long) (i15 & 127)) << i19);
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            jArr2[iJ] = jArr2[i12];
                            jArr2[i12] = 0;
                            objArr[iJ] = objArr[i12];
                            objArr[i12] = null;
                            iB = i12;
                        } else {
                            jArr[i18] = (((long) (i15 & 127)) << i19) | (j12 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = u0.b(jArr, i12 + 1, i11);
                            }
                            jArr2[iB] = jArr2[iJ];
                            jArr2[iJ] = jArr2[i12];
                            jArr2[i12] = jArr2[iB];
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i12];
                            objArr[i12] = objArr[iB];
                            i12--;
                        }
                        jArr[p013kotlin.collections.n.t0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i12++;
            }
        }
        k();
    }

    private final int i(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = i13;
            int i19 = i16;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iJ = j(i12);
                if (this.growthLimit == 0 && ((this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i12);
                }
                this._size++;
                int i21 = this.growthLimit;
                long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int i22 = iJ >> 3;
                long j15 = jArr2[i22];
                int i23 = (iJ & 7) << 3;
                this.growthLimit = i21 - (((j15 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this._capacity;
                long j16 = ((~(255 << i23)) & j15) | (j12 << i23);
                jArr2[i22] = j16;
                jArr2[(((iJ - 7) & i24) + (i24 & 7)) >> 3] = j16;
                return iJ;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int j(int hash1) {
        int i11 = this._capacity;
        int i12 = hash1 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j11 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j12) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void k() {
        this.growthLimit = u0.c(get_capacity()) - this._size;
    }

    private final void l(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = u0.f3930a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            p013kotlin.collections.n.C(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String = jArr;
        int i11 = capacity >> 3;
        long j11 = 255 << ((capacity & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j11)) | j11;
        k();
    }

    private final void m(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, u0.f(initialCapacity)) : 0;
        this._capacity = iMax;
        l(iMax);
        this.keys = new long[iMax];
        this.values = new Object[iMax];
    }

    private final void n(int newCapacity) {
        e0<V> e0Var = this;
        long[] jArr = e0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        long[] jArr2 = e0Var.keys;
        Object[] objArr = e0Var.values;
        int i11 = e0Var._capacity;
        m(newCapacity);
        long[] jArr3 = e0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        long[] jArr4 = e0Var.keys;
        Object[] objArr2 = e0Var.values;
        int i12 = e0Var._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j11 = jArr2[i13];
                int iHashCode = Long.hashCode(j11) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iJ = e0Var.j(i14 >>> 7);
                long j12 = i14 & 127;
                int i15 = iJ >> 3;
                int i16 = (iJ & 7) << 3;
                long j13 = (jArr3[i15] & (~(255 << i16))) | (j12 << i16);
                jArr3[i15] = j13;
                jArr3[(((iJ - 7) & i12) + (i12 & 7)) >> 3] = j13;
                jArr4[iJ] = j11;
                objArr2[iJ] = objArr[i13];
            }
            i13++;
            e0Var = this;
            jArr = jArr;
        }
    }

    public final void g() {
        this._size = 0;
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        if (jArr != u0.f3930a) {
            p013kotlin.collections.n.C(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i11 = this._capacity;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        p013kotlin.collections.n.z(this.values, null, 0, this._capacity);
        k();
    }

    public final void o(long key, V value) {
        int i11 = i(key);
        this.keys[i11] = key;
        this.values[i11] = value;
    }
}
