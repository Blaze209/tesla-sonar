package androidx.collection;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u000bR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/collection/d0;", "Landroidx/collection/q;", "", "initialCapacity", "<init>", "(I)V", "Ljn0/h0;", "n", "capacity", "m", "l", "()V", "index", "s", "element", "j", "(I)I", "hash1", "k", "g", IntegerTokenConverter.CONVERTER_KEY, "newCapacity", "t", "", "f", "(I)Z", "q", "o", "elements", "r", "(Landroidx/collection/q;)Z", "p", "(Landroidx/collection/q;)V", "h", "e", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public d0() {
        this(0, 1, null);
    }

    private final void g() {
        if (this._capacity <= 8 || Long.compare(jn0.c0.b(jn0.c0.b(this._size) * 32) ^ Long.MIN_VALUE, jn0.c0.b(jn0.c0.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            t(u0.e(this._capacity));
        } else {
            i();
        }
    }

    private final void i() {
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        int[] iArr = this.elements;
        u0.a(jArr, i11);
        int iB = -1;
        int i12 = 0;
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
                            jArr[i18] = (((long) (i15 & 127)) << i19) | (j12 & (~(255 << i19)));
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            iArr[iK] = iArr[i12];
                            iArr[i12] = 0;
                            iB = i12;
                        } else {
                            jArr[i18] = (((long) (i15 & 127)) << i19) | (j12 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = u0.b(jArr, i12 + 1, i11);
                            }
                            iArr[iB] = iArr[iK];
                            iArr[iK] = iArr[i12];
                            iArr[i12] = iArr[iB];
                            i12--;
                        }
                        jArr[p013kotlin.collections.n.t0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i12++;
            }
        }
        l();
    }

    private final int j(int element) {
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i19 = i22;
            }
            int i23 = i19;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.growthLimit == 0 && ((this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    g();
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
                return iK;
            }
            i16 = i21 + 8;
            i15 = (i15 + i16) & i14;
        }
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

    private final void l() {
        this.growthLimit = u0.c(get_capacity()) - this._size;
    }

    private final void m(int capacity) {
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
        l();
    }

    private final void n(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, u0.f(initialCapacity)) : 0;
        this._capacity = iMax;
        m(iMax);
        this.elements = new int[iMax];
    }

    private final void s(int index) {
        this._size--;
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        int i12 = index >> 3;
        int i13 = (index & 7) << 3;
        long j11 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j11;
        jArr[(((index - 7) & i11) + (i11 & 7)) >> 3] = j11;
    }

    private final void t(int newCapacity) {
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int[] iArr = this.elements;
        int i11 = this._capacity;
        n(newCapacity);
        long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int[] iArr2 = this.elements;
        int i12 = this._capacity;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = k(i15 >>> 7);
                long j11 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j12 = (jArr2[i16] & (~(255 << i17))) | (j11 << i17);
                jArr2[i16] = j12;
                jArr2[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j12;
                iArr2[iK] = i14;
            }
        }
    }

    public final boolean f(int element) {
        int i11 = this._size;
        this.elements[j(element)] = element;
        return this._size != i11;
    }

    public final void h() {
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
        l();
    }

    public final void o(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i15 += 8;
                i14 = (i14 + i15) & i13;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            s(iNumberOfTrailingZeros);
        }
    }

    public final void p(q elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        o(iArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean q(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z11 = iNumberOfTrailingZeros >= 0;
        if (z11) {
            s(iNumberOfTrailingZeros);
        }
        return z11;
    }

    public final boolean r(q elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        int i11 = this._size;
        p(elements);
        return i11 != this._size;
    }

    public /* synthetic */ d0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    public d0(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            n1.d.a("Capacity must be a positive value.");
        }
        n(u0.g(i11));
    }
}
