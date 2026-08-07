package androidx.collection;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000bR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/collection/a0;", "Landroidx/collection/l;", "", "initialCapacity", "<init>", "(I)V", "Ljn0/h0;", "o", "capacity", "n", "m", "()V", Action.KEY_ATTRIBUTE, "l", "(I)I", "hash1", "k", "h", "j", "newCapacity", "p", "value", "q", "(II)V", IntegerTokenConverter.CONVERTER_KEY, "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ a0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    private final void h() {
        if (this._capacity <= 8 || Long.compare(jn0.c0.b(jn0.c0.b(this._size) * 32) ^ Long.MIN_VALUE, jn0.c0.b(jn0.c0.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            p(u0.e(this._capacity));
        } else {
            j();
        }
    }

    private final void j() {
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                    int iHashCode = Integer.hashCode(iArr[i12]) * (-862048943);
                    int i15 = iHashCode ^ (iHashCode << 16);
                    int i16 = i15 >>> 7;
                    int iK = k(i16);
                    int i17 = i16 & i11;
                    if (((iK - i17) & i11) / 8 == ((i12 - i17) & i11) / 8) {
                        jArr[i13] = (((long) (i15 & 127)) << i14) | ((~(255 << i14)) & jArr[i13]);
                        jArr[p013kotlin.collections.n.t0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iK >> 3;
                        long j12 = jArr[i18];
                        int i19 = (iK & 7) << 3;
                        if (((j12 >> i19) & 255) == 128) {
                            jArr[i18] = (j12 & (~(255 << i19))) | (((long) (i15 & 127)) << i19);
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            iArr[iK] = iArr[i12];
                            iArr[i12] = 0;
                            iArr2[iK] = iArr2[i12];
                            iArr2[i12] = 0;
                            iB = i12;
                        } else {
                            jArr[i18] = (((long) (i15 & 127)) << i19) | (j12 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = u0.b(jArr, i12 + 1, i11);
                            }
                            iArr[iB] = iArr[iK];
                            iArr[iK] = iArr[i12];
                            iArr[i12] = iArr[iB];
                            iArr2[iB] = iArr2[iK];
                            iArr2[iK] = iArr2[i12];
                            iArr2[i12] = iArr2[iB];
                            i12--;
                        }
                        jArr[p013kotlin.collections.n.t0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i12++;
            }
        }
        m();
    }

    private final int k(int hash1) {
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

    private final int l(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
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
            int i19 = 1;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = i13;
            int i21 = i16;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                int i22 = i19;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i19 = i22;
            }
            int i23 = i19;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.growthLimit == 0 && ((this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i12);
                }
                this._size++;
                int i24 = this.growthLimit;
                long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int i25 = iK >> 3;
                long j15 = jArr2[i25];
                int i26 = (iK & 7) << 3;
                this.growthLimit = i24 - (((j15 >> i26) & 255) == 128 ? i23 : 0);
                int i27 = this._capacity;
                long j16 = ((~(255 << i26)) & j15) | (j12 << i26);
                jArr2[i25] = j16;
                jArr2[(((iK - 7) & i27) + (i27 & 7)) >> 3] = j16;
                return ~iK;
            }
            i16 = i21 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void m() {
        this.growthLimit = u0.c(get_capacity()) - this._size;
    }

    private final void n(int capacity) {
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
        m();
    }

    private final void o(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, u0.f(initialCapacity)) : 0;
        this._capacity = iMax;
        n(iMax);
        this.keys = new int[iMax];
        this.values = new int[iMax];
    }

    private final void p(int newCapacity) {
        a0 a0Var = this;
        long[] jArr = a0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int[] iArr = a0Var.keys;
        int[] iArr2 = a0Var.values;
        int i11 = a0Var._capacity;
        o(newCapacity);
        long[] jArr2 = a0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int[] iArr3 = a0Var.keys;
        int[] iArr4 = a0Var.values;
        int i12 = a0Var._capacity;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = a0Var.k(i15 >>> 7);
                long j11 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j12 = (jArr2[i16] & (~(255 << i17))) | (j11 << i17);
                jArr2[i16] = j12;
                jArr2[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j12;
                iArr3[iK] = i14;
                iArr4[iK] = iArr2[i13];
            }
            i13++;
            a0Var = this;
            jArr = jArr;
        }
    }

    public final void i() {
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
        m();
    }

    public final void q(int key, int value) {
        int iL = l(key);
        if (iL < 0) {
            iL = ~iL;
        }
        this.keys[iL] = key;
        this.values[iL] = value;
    }

    public a0(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            n1.d.a("Capacity must be a positive value.");
        }
        o(u0.g(i11));
    }
}
