package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010'R\u0016\u0010+\u001a\u00020)8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b \u0010.R\u0016\u00101\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u00100¨\u00062"}, d2 = {"Landroidx/collection/v;", "E", "", "", "initialCapacity", "<init>", "(I)V", "b", "()Landroidx/collection/v;", "", Action.KEY_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "(J)Ljava/lang/Object;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(J)V", "index", "j", "value", "h", "(JLjava/lang/Object;)V", "k", "()I", "", "f", "()Z", "g", "(I)J", "l", "(I)Ljava/lang/Object;", "e", "(J)I", "c", "(J)Z", "a", "()V", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[J", "keys", "", "", "[Ljava/lang/Object;", "values", "I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class v<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ long[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public v() {
        this(0, 1, null);
    }

    public void a() {
        int i11 = this.size;
        Object[] objArr = this.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        p013kotlin.jvm.internal.s.i(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        v<E> vVar = (v) objClone;
        vVar.keys = (long[]) this.keys.clone();
        vVar.values = (Object[]) this.values.clone();
        return vVar;
    }

    public boolean c(long key) {
        return e(key) >= 0;
    }

    public E d(long key) {
        int iB = n1.a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == w.f3942a) {
            return null;
        }
        return (E) this.values[iB];
    }

    public int e(long key) {
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != w.f3942a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        return n1.a.b(this.keys, this.size, key);
    }

    public boolean f() {
        return k() == 0;
    }

    public long g(int index) {
        if (!(index >= 0 && index < this.size)) {
            n1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != w.f3942a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        return this.keys[index];
    }

    public void h(long key, E value) {
        int iB = n1.a.b(this.keys, this.size, key);
        if (iB >= 0) {
            this.values[iB] = value;
            return;
        }
        int i11 = ~iB;
        if (i11 < this.size && this.values[i11] == w.f3942a) {
            this.keys[i11] = key;
            this.values[i11] = value;
            return;
        }
        if (this.garbage) {
            int i12 = this.size;
            long[] jArr = this.keys;
            if (i12 >= jArr.length) {
                Object[] objArr = this.values;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj = objArr[i14];
                    if (obj != w.f3942a) {
                        if (i14 != i13) {
                            jArr[i13] = jArr[i14];
                            objArr[i13] = obj;
                            objArr[i14] = null;
                        }
                        i13++;
                    }
                }
                this.garbage = false;
                this.size = i13;
                i11 = ~n1.a.b(this.keys, i13, key);
            }
        }
        int i15 = this.size;
        if (i15 >= this.keys.length) {
            int iF = n1.a.f(i15 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iF);
            p013kotlin.jvm.internal.s.j(jArrCopyOf, "copyOf(this, newSize)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iF);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i16 = this.size;
        if (i16 - i11 != 0) {
            long[] jArr2 = this.keys;
            int i17 = i11 + 1;
            p013kotlin.collections.n.o(jArr2, jArr2, i17, i11, i16);
            Object[] objArr2 = this.values;
            p013kotlin.collections.n.p(objArr2, objArr2, i17, i11, this.size);
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size++;
    }

    public void i(long key) {
        int iB = n1.a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == w.f3942a) {
            return;
        }
        this.values[iB] = w.f3942a;
        this.garbage = true;
    }

    public void j(int index) {
        if (this.values[index] != w.f3942a) {
            this.values[index] = w.f3942a;
            this.garbage = true;
        }
    }

    public int k() {
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != w.f3942a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        return this.size;
    }

    public E l(int index) {
        if (!(index >= 0 && index < this.size)) {
            n1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != w.f3942a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        return (E) this.values[index];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append(CoreConstants.CURLY_LEFT);
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i12));
            sb2.append('=');
            E eL = l(i12);
            if (eL != sb2) {
                sb2.append(eL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public v(int i11) {
        if (i11 == 0) {
            this.keys = n1.a.f92646b;
            this.values = n1.a.f92647c;
        } else {
            int iF = n1.a.f(i11);
            this.keys = new long[iF];
            this.values = new Object[iF];
        }
    }

    public /* synthetic */ v(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 10 : i11);
    }
}
