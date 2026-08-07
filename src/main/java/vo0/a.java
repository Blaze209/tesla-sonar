package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00028\u0001H$¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H$¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0002H$¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\n*\u00028\u0002H$¢\u0006\u0004\b\u0014\u0010\u000eJ\u0013\u0010\u0015\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0019*\u00028\u00022\u0006\u0010\u0018\u001a\u00020\nH$¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J1\u0010%\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010$\u001a\u00020#H$¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010'\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH$¢\u0006\u0004\b(\u0010)\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"Lvo0/a;", "Element", "Collection", "Builder", "Lro0/d;", "<init>", "()V", "Luo0/c;", "decoder", "builder", "", "j", "(Luo0/c;Ljava/lang/Object;)I", "e", "(Ljava/lang/Object;)I", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/util/Iterator;", "a", "()Ljava/lang/Object;", "b", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "size", "Ljn0/h0;", "c", "(Ljava/lang/Object;I)V", "Luo0/e;", "previous", "f", "(Luo0/e;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "index", "", "checkIndex", "h", "(Luo0/c;ILjava/lang/Object;Z)V", "startIndex", "g", "(Luo0/c;Ljava/lang/Object;II)V", "Lvo0/p;", "Lvo0/u0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a<Element, Collection, Builder> implements ro0.d<Collection> {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(a aVar, uo0.c cVar, int i11, Object obj, boolean z11, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        aVar.h(cVar, i11, obj, z11);
    }

    private final int j(uo0.c decoder, Builder builder) {
        int iF = decoder.F(getDescriptor());
        c(builder, iF);
        return iF;
    }

    protected abstract Builder a();

    protected abstract int b(Builder builder);

    protected abstract void c(Builder builder, int i11);

    protected abstract Iterator<Element> d(Collection collection);

    @Override // ro0.c
    public Collection deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Collection collection);

    public final Collection f(uo0.e decoder, Collection previous) {
        Builder builderA;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (previous == null || (builderA = k(previous)) == null) {
            builderA = a();
        }
        Builder builder = builderA;
        int iB = b(builder);
        uo0.c cVarB = decoder.b(getDescriptor());
        if (!cVarB.i()) {
            while (true) {
                int iA = cVarB.A(getDescriptor());
                if (iA == -1) {
                    break;
                }
                i(this, cVarB, iB + iA, builder, false, 8, null);
            }
        } else {
            g(cVarB, builder, iB, j(cVarB, builder));
        }
        cVarB.c(getDescriptor());
        return l(builder);
    }

    protected abstract void g(uo0.c decoder, Builder builder, int startIndex, int size);

    protected abstract void h(uo0.c decoder, int index, Builder builder, boolean checkIndex);

    protected abstract Builder k(Collection collection);

    protected abstract Collection l(Builder builder);

    private a() {
    }
}
