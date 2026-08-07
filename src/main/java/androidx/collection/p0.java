package androidx.collection;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJY\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 R$\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010\"\u0012\u0004\b#\u0010$R\u001c\u0010(\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000b\u0010&\u0012\u0004\b'\u0010$\u0082\u0001\u0001)¨\u0006*"}, d2 = {"Landroidx/collection/p0;", "E", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "a", "(Ljava/lang/Object;)Z", "b", "(Ljava/lang/Object;)I", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "e", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[Ljava/lang/Object;", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "Landroidx/collection/i0;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class p0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Object[] content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int _size;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "b", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<E, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0<E> f3899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0<E> p0Var) {
            super(1);
            this.f3899c = p0Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e11) {
            return e11 == this.f3899c ? "(this)" : String.valueOf(e11);
        }
    }

    public /* synthetic */ p0(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String f(p0 p0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, wn0.l lVar, int i12, Object obj) {
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
        return p0Var.e(charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public final boolean a(E element) {
        return b(element) >= 0;
    }

    public final int b(E element) {
        int i11 = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i12 = this._size;
            while (i11 < i12) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i13 = this._size;
        while (i11 < i13) {
            if (element.equals(objArr2[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final boolean c() {
        return this._size == 0;
    }

    public final boolean d() {
        return this._size != 0;
    }

    public final String e(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, wn0.l<? super E, ? extends CharSequence> transform) {
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            if (i12 == limit) {
                sb2.append(truncated);
                String string = sb2.toString();
                p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            if (transform == null) {
                sb2.append(obj);
            } else {
                sb2.append(transform.invoke(obj));
            }
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        p013kotlin.jvm.internal.s.j(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public boolean equals(Object other) {
        if (other instanceof p0) {
            p0 p0Var = (p0) other;
            int i11 = p0Var._size;
            int i12 = this._size;
            if (i11 == i12) {
                Object[] objArr = this.content;
                Object[] objArr2 = p0Var.content;
                bo0.j jVarW = bo0.n.w(0, i12);
                int first = jVarW.getFirst();
                int last = jVarW.getLast();
                if (first > last) {
                    return true;
                }
                while (p013kotlin.jvm.internal.s.f(objArr[first], objArr2[first])) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i11 = this._size;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return f(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    private p0(int i11) {
        this.content = i11 == 0 ? q0.f3904a : new Object[i11];
    }
}
