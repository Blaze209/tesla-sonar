package vo0;

import java.util.Arrays;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lto0/f;", "", "typeParams", "", "a", "(Lto0/f;[Lto0/f;)I", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class n1 {
    public static final int a(to0.f fVar, to0.f[] typeParams) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(typeParams, "typeParams");
        int iHashCode = (fVar.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<to0.f> iterableA = to0.j.a(fVar);
        Iterator<to0.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i11 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i12 = i11 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i11 = i12 + iHashCode3;
        }
        Iterator<to0.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i13 = iHashCode2 * 31;
            to0.n kind = it2.next().getKind();
            iHashCode2 = i13 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i11) * 31) + iHashCode2;
    }
}
