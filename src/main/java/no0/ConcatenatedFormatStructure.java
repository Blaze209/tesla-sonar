package no0;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: no0.h, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lno0/h;", "T", "Lno0/o;", "", "Lno0/s;", "formats", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lpo0/p;", "b", "()Lpo0/p;", "Loo0/e;", "a", "()Loo0/e;", "Ljava/util/List;", "c", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ConcatenatedFormatStructure<T> implements o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<s<T>> formats;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcatenatedFormatStructure(List<? extends s<? super T>> formats) {
        p013kotlin.jvm.internal.s.k(formats, "formats");
        this.formats = formats;
    }

    @Override // no0.o
    public oo0.e<T> a() {
        List<s<T>> list = this.formats;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).a());
        }
        return arrayList.size() == 1 ? (oo0.e) p013kotlin.collections.v.U0(arrayList) : new oo0.a(arrayList);
    }

    @Override // no0.o
    public po0.p<T> b() {
        List<s<T>> list = this.formats;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).b());
        }
        return po0.m.b(arrayList);
    }

    public final List<s<T>> c() {
        return this.formats;
    }

    public boolean equals(Object other) {
        return (other instanceof ConcatenatedFormatStructure) && p013kotlin.jvm.internal.s.f(this.formats, ((ConcatenatedFormatStructure) other).formats);
    }

    public int hashCode() {
        return this.formats.hashCode();
    }

    public String toString() {
        return "ConcatenatedFormatStructure(" + p013kotlin.collections.v.y0(this.formats, ", ", null, null, 0, null, null, 62, null) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
