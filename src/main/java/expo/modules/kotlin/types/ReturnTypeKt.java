package expo.modules.kotlin.types;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b¨\u0006\u0003"}, d2 = {"toReturnType", "Lexpo/modules/kotlin/types/ReturnType;", "T", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ReturnTypeKt {
    public static final /* synthetic */ <T> ReturnType toReturnType() {
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(4, "T");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType != null) {
            return returnType;
        }
        s.q(4, "T");
        ReturnType returnType2 = new ReturnType(o0.b(Object.class));
        Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
        s.q(4, "T");
        types2.put(o0.b(Object.class), returnType2);
        return returnType2;
    }
}
