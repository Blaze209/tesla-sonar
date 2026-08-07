package vo0;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0001\u0002%&¨\u0006'"}, d2 = {"Lvo0/p;", "Element", "Collection", "Builder", "Lvo0/a;", "Lro0/d;", "elementSerializer", "<init>", "(Lro0/d;)V", "", "index", "element", "Ljn0/h0;", "n", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Luo0/f;", "encoder", "value", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/c;", "decoder", "builder", "startIndex", "size", "g", "(Luo0/c;Ljava/lang/Object;II)V", "", "checkIndex", "h", "(Luo0/c;ILjava/lang/Object;Z)V", "a", "Lro0/d;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "Lvo0/q;", "Lvo0/r1;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class p<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ro0.d<Element> elementSerializer;

    public /* synthetic */ p(ro0.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    @Override // vo0.a
    protected final void g(uo0.c decoder, Builder builder, int startIndex, int size) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i11 = 0; i11 < size; i11++) {
            h(decoder, startIndex + i11, builder, false);
        }
    }

    @Override // ro0.d, ro0.q, ro0.c
    public abstract to0.f getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vo0.a
    protected void h(uo0.c decoder, int index, Builder builder, boolean checkIndex) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        n(builder, index, uo0.c.a.c(decoder, getDescriptor(), index, this.elementSerializer, null, 8, null));
    }

    protected abstract void n(Builder builder, int i11, Element element);

    @Override // ro0.q
    public void serialize(uo0.f encoder, Collection value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        int iE = e(value);
        to0.f descriptor = getDescriptor();
        uo0.d dVarT = encoder.t(descriptor, iE);
        Iterator<Element> itD = d(value);
        for (int i11 = 0; i11 < iE; i11++) {
            dVarT.D(getDescriptor(), i11, this.elementSerializer, itD.next());
        }
        dVarT.c(descriptor);
    }

    private p(ro0.d<Element> dVar) {
        super(null);
        this.elementSerializer = dVar;
    }
}
