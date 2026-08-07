package il0;

import co0.d;
import co0.q;
import java.lang.reflect.Type;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\r\u0010\u000e*\n\u0010\u000f\"\u00020\u00002\u00020\u0000¨\u0006\u0010"}, d2 = {"Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "Lco0/d;", "kClass", "Lco0/q;", "kType", "Lil0/a;", "b", "(Ljava/lang/reflect/Type;Lco0/d;Lco0/q;)Lil0/a;", "", "type", "", "a", "(Ljava/lang/Object;Lco0/d;)Z", "Type", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final boolean a(Object obj, d<?> type) {
        s.k(obj, "<this>");
        s.k(type, "type");
        return vn0.a.b(type).isInstance(obj);
    }

    public static final TypeInfo b(Type reifiedType, d<?> kClass, q qVar) {
        s.k(reifiedType, "reifiedType");
        s.k(kClass, "kClass");
        return new TypeInfo(kClass, reifiedType, qVar);
    }
}
