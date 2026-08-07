package ii;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lii/t;", "", "T", "Lii/b;", "wrappedAdapter", "<init>", "(Lii/b;)V", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "a", "(Lmi/f;Lii/k;)Ljava/lang/Object;", "Lmi/g;", "writer", "value", "Ljn0/h0;", "b", "(Lmi/g;Lii/k;Ljava/lang/Object;)V", "Lii/b;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class t<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<T> wrappedAdapter;

    public t(b<T> wrappedAdapter) {
        p013kotlin.jvm.internal.s.k(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
        if (wrappedAdapter instanceof t) {
            throw new IllegalStateException("The adapter is already nullable");
        }
    }

    @Override // ii.b
    public T a(mi.f reader, k customScalarAdapters) {
        p013kotlin.jvm.internal.s.k(reader, "reader");
        p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() != mi.f.a.NULL) {
            return this.wrappedAdapter.a(reader, customScalarAdapters);
        }
        reader.F();
        return null;
    }

    @Override // ii.b
    public void b(mi.g writer, k customScalarAdapters, T value) {
        p013kotlin.jvm.internal.s.k(writer, "writer");
        p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
        if (value == null) {
            writer.R();
        } else {
            this.wrappedAdapter.b(writer, customScalarAdapters, value);
        }
    }
}
