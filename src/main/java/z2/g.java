package z2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz2/g;", "", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", Action.KEY_ATTRIBUTE, "a", "(J)I", "b", "(J)Ljava/lang/Object;", "value", "", DateTokenConverter.CONVERTER_KEY, "(JLjava/lang/Object;)Z", "c", "(JLjava/lang/Object;)Lz2/g;", "I", "[J", "[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] values;

    public g(int i11, long[] jArr, Object[] objArr) {
        this.size = i11;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int a(long key) {
        int i11 = this.size - 1;
        if (i11 != -1) {
            int i12 = 0;
            if (i11 != 0) {
                while (i12 <= i11) {
                    int i13 = (i12 + i11) >>> 1;
                    long j11 = this.keys[i13] - key;
                    if (j11 < 0) {
                        i12 = i13 + 1;
                    } else {
                        if (j11 <= 0) {
                            return i13;
                        }
                        i11 = i13 - 1;
                    }
                }
                return -(i12 + 1);
            }
            long j12 = this.keys[0];
            if (j12 == key) {
                return 0;
            }
            if (j12 > key) {
                return -2;
            }
        }
        return -1;
    }

    public final Object b(long key) {
        int iA = a(key);
        if (iA >= 0) {
            return this.values[iA];
        }
        return null;
    }

    public final g c(long key, Object value) {
        int i11 = this.size;
        int i12 = 0;
        int i13 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i13++;
            }
        }
        int i14 = i13 + 1;
        long[] jArr = new long[i14];
        Object[] objArr = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (i12 < i14 && i15 < i11) {
                long j11 = this.keys[i15];
                Object obj2 = this.values[i15];
                if (j11 > key) {
                    jArr[i12] = key;
                    objArr[i12] = value;
                    i12++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i12] = j11;
                    objArr[i12] = obj2;
                    i12++;
                }
                i15++;
            }
            if (i15 == i11) {
                jArr[i13] = key;
                objArr[i13] = value;
            } else {
                while (i12 < i14) {
                    long j12 = this.keys[i15];
                    Object obj3 = this.values[i15];
                    if (obj3 != null) {
                        jArr[i12] = j12;
                        objArr[i12] = obj3;
                        i12++;
                    }
                    i15++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new g(i14, jArr, objArr);
    }

    public final boolean d(long key, Object value) {
        int iA = a(key);
        if (iA < 0) {
            return false;
        }
        this.values[iA] = value;
        return true;
    }
}
