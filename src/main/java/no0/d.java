package no0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lno0/d;", "T", "", "<init>", "()V", "Lno0/h;", "b", "()Lno0/h;", "Lno0/o;", "format", "Ljn0/h0;", "a", "(Lno0/o;)V", "", "Lno0/s;", "Ljava/util/List;", "list", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<s<T>> list = new ArrayList();

    public final void a(o<? super T> format) {
        p013kotlin.jvm.internal.s.k(format, "format");
        if (format instanceof s) {
            this.list.add(format);
        } else if (format instanceof ConcatenatedFormatStructure) {
            Iterator<T> it = ((ConcatenatedFormatStructure) format).c().iterator();
            while (it.hasNext()) {
                this.list.add((s) it.next());
            }
        }
    }

    public final ConcatenatedFormatStructure<T> b() {
        return new ConcatenatedFormatStructure<>(this.list);
    }
}
