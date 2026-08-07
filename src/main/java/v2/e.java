package v2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J%\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J)\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010/R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010D¨\u0006E"}, d2 = {"Lv2/e;", "E", "Lu2/e;", "Lv2/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "r", "()I", "filledTail", "newTail", "n", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lv2/e;", "shift", "o", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "k", "([Ljava/lang/Object;ILjava/lang/Object;)Lv2/e;", "index", "Lv2/d;", "elementCarry", "j", "([Ljava/lang/Object;IILjava/lang/Object;Lv2/d;)[Ljava/lang/Object;", "rootSize", "q", "([Ljava/lang/Object;III)Lu2/e;", "m", "([Ljava/lang/Object;II)Lu2/e;", "tailCarry", "l", "([Ljava/lang/Object;IILv2/d;)[Ljava/lang/Object;", "p", "h", "(I)[Ljava/lang/Object;", "e", "s", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)Lu2/e;", "(ILjava/lang/Object;)Lu2/e;", "d2", "(I)Lu2/e;", "Lkotlin/Function1;", "", "predicate", "b0", "(Lwn0/l;)Lu2/e;", "Lv2/f;", IntegerTokenConverter.CONVERTER_KEY, "()Lv2/f;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "b", "[Ljava/lang/Object;", "c", DateTokenConverter.CONVERTER_KEY, "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e<E> extends b<E> implements u2.e<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] root;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] tail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int rootShift;

    public e(Object[] objArr, Object[] objArr2, int i11, int i12) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i11;
        this.rootShift = i12;
        if (!(size() > 32)) {
            a2.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        y2.a.a(size() - l.d(size()) <= n.j(objArr2.length, 32));
    }

    private final Object[] h(int index) {
        if (r() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i11 = this.rootShift; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i11)];
            s.i(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] j(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object[] objArrCopyOf;
        int iA = l.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                s.j(objArrCopyOf, "copyOf(this, newSize)");
            }
            p013kotlin.collections.n.p(root, objArrCopyOf, iA + 1, iA, 31);
            elementCarry.b(root[31]);
            objArrCopyOf[iA] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        s.j(objArrCopyOf2, "copyOf(this, newSize)");
        int i11 = shift - 5;
        Object obj = root[iA];
        s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = j((Object[]) obj, i11, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj2 = root[iA];
            s.i(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = j((Object[]) obj2, i11, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrCopyOf2;
    }

    private final e<E> k(Object[] root, int tailIndex, Object element) {
        int size = size() - r();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            p013kotlin.collections.n.p(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new e<>(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        p013kotlin.collections.n.p(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return n(root, objArrCopyOf, l.c(obj));
    }

    private final Object[] l(Object[] root, int shift, int index, d tailCarry) {
        Object[] objArrL;
        int iA = l.a(index, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrL = null;
        } else {
            Object obj = root[iA];
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrL = l((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (objArrL == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrL;
        return objArrCopyOf;
    }

    private final u2.e<E> m(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                s.j(root, "copyOf(this, newSize)");
            }
            return new j(root);
        }
        d dVar = new d(null);
        Object[] objArrL = l(root, shift, rootSize - 1, dVar);
        s.h(objArrL);
        Object value = dVar.getValue();
        s.i(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (objArrL[1] != null) {
            return new e(objArrL, objArr, rootSize, shift);
        }
        Object obj = objArrL[0];
        s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr, rootSize, shift - 5);
    }

    private final e<E> n(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i11 = this.rootShift;
        if (size <= (1 << i11)) {
            return new e<>(o(root, i11, filledTail), newTail, size() + 1, this.rootShift);
        }
        Object[] objArrC = l.c(root);
        int i12 = this.rootShift + 5;
        return new e<>(o(objArrC, i12, filledTail), newTail, size() + 1, i12);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    private final Object[] o(Object[] root, int shift, Object[] tail) {
        Object[] objArrCopyOf;
        int iA = l.a(size() - 1, shift);
        if (root != null) {
            objArrCopyOf = Arrays.copyOf(root, 32);
            s.j(objArrCopyOf, "copyOf(this, newSize)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (shift == 5) {
            objArrCopyOf[iA] = tail;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = o((Object[]) objArrCopyOf[iA], shift - 5, tail);
        return objArrCopyOf;
    }

    private final Object[] p(Object[] root, int shift, int index, d tailCarry) {
        Object[] objArrCopyOf;
        int iA = l.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                s.j(objArrCopyOf, "copyOf(this, newSize)");
            }
            p013kotlin.collections.n.p(root, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.b(root[iA]);
            return objArrCopyOf;
        }
        int iA2 = root[31] == null ? l.a(r() - 1, shift) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        s.j(objArrCopyOf2, "copyOf(this, newSize)");
        int i11 = shift - 5;
        int i12 = iA + 1;
        if (i12 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = p((Object[]) obj, i11, 0, tailCarry);
                if (iA2 == i12) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        s.i(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = p((Object[]) obj2, i11, index, tailCarry);
        return objArrCopyOf2;
    }

    private final u2.e<E> q(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        y2.a.a(index < size);
        if (size == 1) {
            return m(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        int i11 = size - 1;
        if (index < i11) {
            p013kotlin.collections.n.p(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i11] = null;
        return new e(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    private final int r() {
        return l.d(size());
    }

    private final Object[] s(Object[] root, int shift, int index, Object e11) {
        int iA = l.a(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        if (shift == 0) {
            objArrCopyOf[iA] = e11;
            return objArrCopyOf;
        }
        Object obj = objArrCopyOf[iA];
        s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = s((Object[]) obj, shift - 5, index, e11);
        return objArrCopyOf;
    }

    @Override // java.util.Collection, java.util.List, u2.e
    public u2.e<E> add(E element) {
        int size = size() - r();
        if (size >= 32) {
            return n(this.root, this.tail, l.c(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = element;
        return new e(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    @Override // u2.e
    public u2.e<E> b0(wn0.l<? super E, Boolean> predicate) {
        f<E> fVarBuilder = builder();
        fVarBuilder.G(predicate);
        return fVarBuilder.build();
    }

    @Override // p013kotlin.collections.b
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // u2.e
    public u2.e<E> d2(int index) {
        y2.d.a(index, size());
        int iR = r();
        return index >= iR ? q(this.root, iR, this.rootShift, index - iR) : q(p(this.root, this.rootShift, index, new d(this.tail[0])), iR, this.rootShift, 0);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public E get(int index) {
        y2.d.a(index, size());
        return (E) h(index)[index & 31];
    }

    @Override // u2.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f<E> builder() {
        return new f<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public ListIterator<E> listIterator(int index) {
        y2.d.b(index, size());
        return new g(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public u2.e<E> set(int index, E element) {
        y2.d.a(index, size());
        if (r() > index) {
            return new e(s(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[index & 31] = element;
        return new e(this.root, objArrCopyOf, size(), this.rootShift);
    }

    @Override // java.util.List, u2.e
    public u2.e<E> add(int index, E element) {
        y2.d.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        int iR = r();
        if (index >= iR) {
            return k(this.root, index - iR, element);
        }
        d dVar = new d(null);
        return k(j(this.root, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }
}
