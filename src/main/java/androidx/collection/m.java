package androidx.collection;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bJA\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u001fR\u0011\u0010%\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u0015\u0082\u0001\u0001&¨\u0006'"}, d2 = {"Landroidx/collection/m;", "", "", "initialCapacity", "<init>", "(I)V", "index", "a", "(I)I", "element", "c", "", "separator", "prefix", "postfix", "limit", "truncated", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[I", "getContent$annotations", "()V", "content", "b", "I", "get_size$annotations", "_size", "size", "Landroidx/collection/b0;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int[] content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ m(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public static /* synthetic */ String e(m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return mVar.d(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final int a(int index) {
        if (index >= 0 && index < this._size) {
            return this.content[index];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(index);
        sb2.append(" must be in 0..");
        sb2.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final int c(int element) {
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (element == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final String d(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == limit) {
                sb2.append(truncated);
                String string = sb2.toString();
                p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(i13);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        p013kotlin.jvm.internal.s.j(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public boolean equals(Object other) {
        if (other instanceof m) {
            m mVar = (m) other;
            int i11 = mVar._size;
            int i12 = this._size;
            if (i11 == i12) {
                int[] iArr = this.content;
                int[] iArr2 = mVar.content;
                bo0.j jVarW = bo0.n.w(0, i12);
                int first = jVarW.getFirst();
                int last = jVarW.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
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
        int[] iArr = this.content;
        int i11 = this._size;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += Integer.hashCode(iArr[i12]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return e(this, null, "[", "]", 0, null, 25, null);
    }

    private m(int i11) {
        this.content = i11 == 0 ? r.a() : new int[i11];
    }
}
