package androidx.collection;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J \u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001e\u0010\u0006R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/collection/h0;", "K", "Landroidx/collection/n0;", "", "initialCapacity", "<init>", "(I)V", "Ljn0/h0;", "o", "capacity", "n", "m", "()V", Action.KEY_ATTRIBUTE, "l", "(Ljava/lang/Object;)I", "hash1", "k", "(I)I", IntegerTokenConverter.CONVERTER_KEY, "j", "newCapacity", "r", "value", "s", "(Ljava/lang/Object;I)V", "default", "p", "(Ljava/lang/Object;II)I", "index", "q", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0<K> extends n0<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public h0() {
        this(0, 1, null);
    }

    private final void i() {
        if (this._capacity <= 8 || Long.compare(jn0.c0.b(jn0.c0.b(this._size) * 32) ^ Long.MIN_VALUE, jn0.c0.b(jn0.c0.b(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            r(u0.e(this._capacity));
        } else {
            j();
        }
    }

    private final void j() {
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
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
                    Object obj = objArr[i12];
                    int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
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
                            objArr[iK] = objArr[i12];
                            objArr[i12] = null;
                            iArr[iK] = iArr[i12];
                            iArr[i12] = 0;
                            iB = i12;
                        } else {
                            jArr[i18] = (((long) (i15 & 127)) << i19) | (j12 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = u0.b(jArr, i12 + 1, i11);
                            }
                            objArr[iB] = objArr[iK];
                            objArr[iK] = objArr[i12];
                            objArr[i12] = objArr[iB];
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

    private final int l(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
            int i19 = i13;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                if (p013kotlin.jvm.internal.s.f(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.growthLimit == 0 && ((this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    i();
                    iK = k(i12);
                }
                this._size++;
                int i21 = this.growthLimit;
                long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int i22 = iK >> 3;
                long j15 = jArr2[i22];
                int i23 = (iK & 7) << 3;
                this.growthLimit = i21 - (((j15 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this._capacity;
                long j16 = ((~(255 << i23)) & j15) | (j12 << i23);
                jArr2[i22] = j16;
                jArr2[(((iK - 7) & i24) + (i24 & 7)) >> 3] = j16;
                return ~iK;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
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
        this.keys = new Object[iMax];
        this.values = new int[iMax];
    }

    private final void r(int newCapacity) {
        int i11;
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i12 = this._capacity;
        o(newCapacity);
        long[] jArr2 = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        Object[] objArr2 = this.keys;
        int[] iArr2 = this.values;
        int i13 = this._capacity;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = k(i15 >>> 7);
                i11 = i14;
                long j11 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j12 = (j11 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j12;
                jArr2[(((iK - 7) & i13) + (i13 & 7)) >> 3] = j12;
                objArr2[iK] = obj;
                iArr2[iK] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final int p(K key, int value, int i11) {
        int iL = l(key);
        if (iL < 0) {
            iL = ~iL;
        } else {
            i11 = this.values[iL];
        }
        this.keys[iL] = key;
        this.values[iL] = value;
        return i11;
    }

    public final void q(int index) {
        this._size--;
        long[] jArr = this.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int i11 = this._capacity;
        int i12 = index >> 3;
        int i13 = (index & 7) << 3;
        long j11 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j11;
        jArr[(((index - 7) & i11) + (i11 & 7)) >> 3] = j11;
        this.keys[index] = null;
    }

    public final void s(K key, int value) {
        int iL = l(key);
        if (iL < 0) {
            iL = ~iL;
        }
        this.keys[iL] = key;
        this.values[iL] = value;
    }

    public /* synthetic */ h0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    public h0(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            n1.d.a("Capacity must be a positive value.");
        }
        o(u0.g(i11));
    }
}
