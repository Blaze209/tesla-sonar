package vo0;

import java.util.Iterator;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0001\u0001*¨\u0006+"}, d2 = {"Lvo0/u0;", "Key", "Value", "Collection", "", "Builder", "Lvo0/a;", "", "Lro0/d;", "keySerializer", "valueSerializer", "<init>", "(Lro0/d;Lro0/d;)V", "Luo0/c;", "decoder", "builder", "", "startIndex", "size", "Ljn0/h0;", "o", "(Luo0/c;Ljava/util/Map;II)V", "index", "", "checkIndex", "p", "(Luo0/c;ILjava/util/Map;Z)V", "Luo0/f;", "encoder", "value", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "a", "Lro0/d;", "m", "()Lro0/d;", "b", "n", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "Lvo0/m0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ro0.d<Key> keySerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ro0.d<Value> valueSerializer;

    public /* synthetic */ u0(ro0.d dVar, ro0.d dVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, dVar2);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public abstract to0.f getDescriptor();

    public final ro0.d<Key> m() {
        return this.keySerializer;
    }

    public final ro0.d<Value> n() {
        return this.valueSerializer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(uo0.c decoder, Builder builder, int startIndex, int size) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        if (size < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        bo0.h hVarU = bo0.n.u(bo0.n.w(0, size * 2), 2);
        int first = hVarU.getFirst();
        int last = hVarU.getLast();
        int step = hVarU.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            h(decoder, startIndex + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(uo0.c decoder, int index, Builder builder, boolean checkIndex) {
        int iA;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        Object objC = uo0.c.a.c(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex) {
            iA = decoder.A(getDescriptor());
            if (iA != index + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + index + ", returned index for value: " + iA).toString());
            }
        } else {
            iA = index + 1;
        }
        int i11 = iA;
        builder.put(objC, (!builder.containsKey(objC) || (this.valueSerializer.getDescriptor().getKind() instanceof to0.e)) ? uo0.c.a.c(decoder, getDescriptor(), i11, this.valueSerializer, null, 8, null) : decoder.n(getDescriptor(), i11, this.valueSerializer, p013kotlin.collections.v0.j(builder, objC)));
    }

    @Override // ro0.q
    public void serialize(uo0.f encoder, Collection value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        int iE = e(value);
        to0.f descriptor = getDescriptor();
        uo0.d dVarT = encoder.t(descriptor, iE);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itD = d(value);
        int i11 = 0;
        while (itD.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itD.next();
            Key key = next.getKey();
            Value value2 = next.getValue();
            int i12 = i11 + 1;
            dVarT.D(getDescriptor(), i11, m(), key);
            i11 += 2;
            dVarT.D(getDescriptor(), i12, n(), value2);
        }
        dVarT.c(descriptor);
    }

    private u0(ro0.d<Key> dVar, ro0.d<Value> dVar2) {
        super(null);
        this.keySerializer = dVar;
        this.valueSerializer = dVar2;
    }
}
