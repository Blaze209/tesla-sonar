package androidx.collection;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJY\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010\u001f\u0012\u0004\b \u0010\u0004R$\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u0004R\u0016\u0010)\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0011\u0010+\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010,\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b'\u0010\u0019\u0082\u0001\u0001-¨\u0006."}, d2 = {"Landroidx/collection/v0;", "E", "", "<init>", "()V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "e", "element", "a", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "f", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[J", "getMetadata$annotations", OrcaKeys.METADATA, "", "b", "[Ljava/lang/Object;", "getElements$annotations", "elements", "c", "I", "_capacity", "_size", "capacity", "size", "Landroidx/collection/l0;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class v0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Object[] elements;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int _size;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/collection/v0$a;", "", "<init>", "(Landroidx/collection/v0;)V", "", "elements", "", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "", "b", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public class a implements Set<E>, xn0.a {
        public a() {
        }

        public int b() {
            return v0.this._size;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object element) {
            return v0.this.a(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            p013kotlin.jvm.internal.s.k(elements, "elements");
            v0<E> v0Var = v0.this;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!v0Var.a((E) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return v0.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return p013kotlin.jvm.internal.j.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            p013kotlin.jvm.internal.s.k(array, "array");
            return (T[]) p013kotlin.jvm.internal.j.b(this, array);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "b", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<E, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0<E> f3941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v0<E> v0Var) {
            super(1);
            this.f3941c = v0Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e11) {
            return e11 == this.f3941c ? "(this)" : String.valueOf(e11);
        }
    }

    public /* synthetic */ v0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String g(v0 v0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, wn0.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        wn0.l lVar2 = lVar;
        return v0Var.f(charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public final boolean a(E element) {
        int iNumberOfTrailingZeros;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (p013kotlin.jvm.internal.s.f(this.elements[iNumberOfTrailingZeros], element)) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean d() {
        return this._size == 0;
    }

    public final boolean e() {
        return this._size != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0025->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) other;
        if (v0Var.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !v0Var.a(objArr[(i11 << 3) + i13])) {
                            return false;
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

    public final String f(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, wn0.l<? super E, ? extends CharSequence> transform) {
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        Object obj = objArr[(i11 << 3) + i15];
                        if (i12 == limit) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        if (transform == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(transform.invoke(obj));
                        }
                        i12++;
                    }
                    j11 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public int hashCode() {
        Object[] objArr = this.elements;
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
                        Object obj = objArr[(i11 << 3) + i13];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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
        return g(this, null, "[", "]", 0, null, new b(this), 25, null);
    }

    private v0() {
        this.metadata = u0.f3930a;
        this.elements = n1.a.f92647c;
    }
}
