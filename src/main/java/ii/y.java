package ii;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lii/y;", "T", "Lii/b;", "Lii/x$c;", "wrappedAdapter", "<init>", "(Lii/b;)V", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Lii/x$c;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Lii/x$c;)V", "a", "Lii/b;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class y<T> implements b<x.Present<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<T> wrappedAdapter;

    public y(b<T> wrappedAdapter) {
        p013kotlin.jvm.internal.s.k(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
    }

    @Override // ii.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public x.Present<T> a(mi.f reader, k customScalarAdapters) {
        p013kotlin.jvm.internal.s.k(reader, "reader");
        p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
        return new x.Present<>(this.wrappedAdapter.a(reader, customScalarAdapters));
    }

    @Override // ii.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(mi.g writer, k customScalarAdapters, x.Present<T> value) {
        p013kotlin.jvm.internal.s.k(writer, "writer");
        p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.wrappedAdapter.b(writer, customScalarAdapters, value.a());
    }
}
