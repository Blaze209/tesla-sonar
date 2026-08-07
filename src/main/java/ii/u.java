package ii;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lii/u;", "T", "Lii/b;", "wrappedAdapter", "", "buffered", "<init>", "(Lii/b;Z)V", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "a", "(Lmi/f;Lii/k;)Ljava/lang/Object;", "Lmi/g;", "writer", "value", "Ljn0/h0;", "b", "(Lmi/g;Lii/k;Ljava/lang/Object;)V", "Lii/b;", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class u<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<T> wrappedAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean buffered;

    public u(b<T> wrappedAdapter, boolean z11) {
        p013kotlin.jvm.internal.s.k(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
        this.buffered = z11;
    }

    @Override // ii.b
    public T a(mi.f reader, k customScalarAdapters) {
        p013kotlin.jvm.internal.s.k(reader, "reader");
        p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
        if (this.buffered) {
            reader = mi.h.INSTANCE.a(reader);
        }
        reader.h();
        T tA = this.wrappedAdapter.a(reader, customScalarAdapters);
        reader.j();
        return tA;
    }

    @Override // ii.b
    public void b(mi.g writer, k customScalarAdapters, T value) {
        p013kotlin.jvm.internal.s.k(writer, "writer");
        p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
        if (!this.buffered || (writer instanceof mi.i)) {
            writer.h();
            this.wrappedAdapter.b(writer, customScalarAdapters, value);
            writer.j();
            return;
        }
        mi.i iVar = new mi.i();
        iVar.h();
        this.wrappedAdapter.b(iVar, customScalarAdapters, value);
        iVar.j();
        Object objO = iVar.o();
        p013kotlin.jvm.internal.s.h(objO);
        mi.b.a(writer, objO);
    }
}
