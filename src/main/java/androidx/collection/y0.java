package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b!\u0010%R\u0016\u0010)\u001a\u00020'8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u0010/\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010.¨\u00060"}, d2 = {"Landroidx/collection/y0;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Landroidx/collection/y0;", Action.KEY_ATTRIBUTE, "e", "(I)Ljava/lang/Object;", "index", "Ljn0/h0;", "j", "value", "k", "(ILjava/lang/Object;)Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "(ILjava/lang/Object;)V", "l", "()I", "h", "(I)I", "m", "f", "g", "(Ljava/lang/Object;)I", "", DateTokenConverter.CONVERTER_KEY, "(I)Z", "b", "()V", "a", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[I", "keys", "", "", "[Ljava/lang/Object;", "values", "I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class y0<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public y0() {
        this(0, 1, null);
    }

    public void a(int key, E value) {
        int i11 = this.size;
        if (i11 != 0 && key <= this.keys[i11 - 1]) {
            i(key, value);
            return;
        }
        if (this.garbage && i11 >= this.keys.length) {
            z0.d(this);
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int iE = n1.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i12] = key;
        this.values[i12] = value;
        this.size = i12 + 1;
    }

    public void b() {
        int i11 = this.size;
        Object[] objArr = this.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y0<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        p013kotlin.jvm.internal.s.i(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        y0<E> y0Var = (y0) objClone;
        y0Var.keys = (int[]) this.keys.clone();
        y0Var.values = (Object[]) this.values.clone();
        return y0Var;
    }

    public boolean d(int key) {
        return f(key) >= 0;
    }

    public E e(int key) {
        return (E) z0.c(this, key);
    }

    public int f(int key) {
        if (this.garbage) {
            z0.d(this);
        }
        return n1.a.a(this.keys, this.size, key);
    }

    public int g(E value) {
        if (this.garbage) {
            z0.d(this);
        }
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.values[i12] == value) {
                return i12;
            }
        }
        return -1;
    }

    public int h(int index) {
        if (this.garbage) {
            z0.d(this);
        }
        return this.keys[index];
    }

    public void i(int key, E value) {
        int iA = n1.a.a(this.keys, this.size, key);
        if (iA >= 0) {
            this.values[iA] = value;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.size && this.values[i11] == z0.f3952a) {
            this.keys[i11] = key;
            this.values[i11] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            z0.d(this);
            i11 = ~n1.a.a(this.keys, this.size, key);
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int iE = n1.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i13 = this.size;
        if (i13 - i11 != 0) {
            int[] iArr = this.keys;
            int i14 = i11 + 1;
            p013kotlin.collections.n.n(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.values;
            p013kotlin.collections.n.p(objArr, objArr, i14, i11, this.size);
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size++;
    }

    public void j(int index) {
        if (this.values[index] != z0.f3952a) {
            this.values[index] = z0.f3952a;
            this.garbage = true;
        }
    }

    public E k(int key, E value) {
        int iF = f(key);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e11 = (E) objArr[iF];
        objArr[iF] = value;
        return e11;
    }

    public int l() {
        if (this.garbage) {
            z0.d(this);
        }
        return this.size;
    }

    public E m(int index) {
        if (this.garbage) {
            z0.d(this);
        }
        return (E) this.values[index];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append(CoreConstants.CURLY_LEFT);
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i12));
            sb2.append('=');
            E eM = m(i12);
            if (eM != this) {
                sb2.append(eM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "buffer.toString()");
        return string;
    }

    public y0(int i11) {
        if (i11 == 0) {
            this.keys = n1.a.f92645a;
            this.values = n1.a.f92647c;
        } else {
            int iE = n1.a.e(i11);
            this.keys = new int[iE];
            this.values = new Object[iE];
        }
    }

    public /* synthetic */ y0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 10 : i11);
    }
}
