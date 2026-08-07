package vo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lto0/f;", "", "", "a", "(Lto0/f;)Ljava/util/Set;", "", "", "b", "(Ljava/util/List;)[Lto0/f;", "Lco0/d;", "", "e", "(Lco0/d;)Ljava/lang/Void;", "c", "(Lco0/d;)Ljava/lang/String;", "className", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "[Lto0/f;", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final to0.f[] f119617a = new to0.f[0];

    public static final Set<String> a(to0.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        if (fVar instanceof l) {
            return ((l) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.getElementsCount());
        int elementsCount = fVar.getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            hashSet.add(fVar.f(i11));
        }
        return hashSet;
    }

    public static final to0.f[] b(List<? extends to0.f> list) {
        to0.f[] fVarArr;
        List<? extends to0.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (to0.f[]) list.toArray(new to0.f[0])) == null) ? f119617a : fVarArr;
    }

    public static final String c(co0.d<?> dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        String strL = dVar.l();
        if (strL == null) {
            strL = "<local class name not available>";
        }
        return d(strL);
    }

    public static final String d(String className) {
        p013kotlin.jvm.internal.s.k(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final Void e(co0.d<?> dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        throw new SerializationException(c(dVar));
    }
}
