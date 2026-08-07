package no0;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lno0/f;", "T", "Lno0/h;", "", "Lno0/s;", "formats", "<init>", "(Ljava/util/List;)V", "Loo0/e;", "a", "()Loo0/e;", "Lpo0/p;", "b", "()Lpo0/p;", "Loo0/e;", "cachedFormatter", "c", "Lpo0/p;", "cachedParser", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f<T> extends ConcatenatedFormatStructure<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oo0.e<T> cachedFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final po0.p<T> cachedParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List<? extends s<? super T>> formats) {
        super(formats);
        p013kotlin.jvm.internal.s.k(formats, "formats");
        this.cachedFormatter = super.a();
        this.cachedParser = super.b();
    }

    @Override // no0.ConcatenatedFormatStructure, no0.o
    public oo0.e<T> a() {
        return this.cachedFormatter;
    }

    @Override // no0.ConcatenatedFormatStructure, no0.o
    public po0.p<T> b() {
        return this.cachedParser;
    }
}
