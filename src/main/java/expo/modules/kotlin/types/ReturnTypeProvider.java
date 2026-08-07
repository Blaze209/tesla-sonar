package expo.modules.kotlin.types;

import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0004\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/types/ReturnTypeProvider;", "", "<init>", "()V", "T", "Lexpo/modules/kotlin/types/ReturnType;", "get", "()Lexpo/modules/kotlin/types/ReturnType;", "", "Lco0/d;", "types", "Ljava/util/Map;", "getTypes", "()Ljava/util/Map;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReturnTypeProvider {
    public static final ReturnTypeProvider INSTANCE = new ReturnTypeProvider();
    private static final Map<co0.d<?>, ReturnType> types = new LinkedHashMap();

    private ReturnTypeProvider() {
    }

    public final /* synthetic */ <T> ReturnType get() {
        Map<co0.d<?>, ReturnType> types2 = getTypes();
        s.q(4, "T");
        ReturnType returnType = types2.get(o0.b(Object.class));
        if (returnType != null) {
            return returnType;
        }
        s.q(4, "T");
        ReturnType returnType2 = new ReturnType(o0.b(Object.class));
        Map<co0.d<?>, ReturnType> types3 = INSTANCE.getTypes();
        s.q(4, "T");
        types3.put(o0.b(Object.class), returnType2);
        return returnType2;
    }

    public final Map<co0.d<?>, ReturnType> getTypes() {
        return types;
    }
}
