package b3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p020r2.f4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lb3/j;", "", "T", "<init>", "()V", "value", "", "hash", "b", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "c", "(ILjava/lang/Object;I)I", "", "a", "(Ljava/lang/Object;)Z", "I", "e", "()I", "g", "(I)V", "size", "", "[I", DateTokenConverter.CONVERTER_KEY, "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "Lr2/f4;", "[Lr2/f4;", "f", "()[Lr2/f4;", "setValues$runtime_release", "([Lr2/f4;)V", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] hashes = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private f4<T>[] values = new f4[16];

    private final int b(T value, int hash) {
        int i11 = this.size - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.hashes[i13];
            if (i14 < hash) {
                i12 = i13 + 1;
            } else {
                if (i14 <= hash) {
                    f4<T> f4Var = this.values[i13];
                    return value == (f4Var != null ? f4Var.get() : null) ? i13 : c(i13, value, hash);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private final int c(int midIndex, T value, int valueHash) {
        int i11 = midIndex - 1;
        while (true) {
            if (-1 >= i11 || this.hashes[i11] != valueHash) {
                break;
            }
            f4<T> f4Var = this.values[i11];
            if ((f4Var != null ? f4Var.get() : null) == value) {
                return i11;
            }
            i11--;
        }
        int i12 = midIndex + 1;
        int i13 = this.size;
        while (i12 < i13) {
            if (this.hashes[i12] != valueHash) {
                return -(i12 + 1);
            }
            f4<T> f4Var2 = this.values[i12];
            if ((f4Var2 != null ? f4Var2.get() : null) == value) {
                return i12;
            }
            i12++;
        }
        i12 = this.size;
        return -(i12 + 1);
    }

    public final boolean a(T value) {
        int iB;
        int i11 = this.size;
        int iC = p020r2.c.c(value);
        if (i11 > 0) {
            iB = b(value, iC);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i12 = -(iB + 1);
        f4<T>[] f4VarArr = this.values;
        int length = f4VarArr.length;
        if (i11 == length) {
            int i13 = length * 2;
            f4<T>[] f4VarArr2 = new f4[i13];
            int[] iArr = new int[i13];
            int i14 = i12 + 1;
            n.p(f4VarArr, f4VarArr2, i14, i12, i11);
            n.t(this.values, f4VarArr2, 0, 0, i12, 6, null);
            n.n(this.hashes, iArr, i14, i12, i11);
            n.s(this.hashes, iArr, 0, 0, i12, 6, null);
            this.values = f4VarArr2;
            this.hashes = iArr;
        } else {
            int i15 = i12 + 1;
            n.p(f4VarArr, f4VarArr, i15, i12, i11);
            int[] iArr2 = this.hashes;
            n.n(iArr2, iArr2, i15, i12, i11);
        }
        this.values[i12] = new f4<>(value);
        this.hashes[i12] = iC;
        this.size++;
        return true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final f4<T>[] f() {
        return this.values;
    }

    public final void g(int i11) {
        this.size = i11;
    }
}
