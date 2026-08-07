package expo.modules.kotlin.modules;

import co0.d;
import co0.h;
import co0.l;
import co0.o;
import do0.c;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u0001\"\u0012\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"convertEnumToString", "", "T", "Lexpo/modules/kotlin/types/Enumerable;", "", "enumValue", "(Ljava/lang/Enum;)Ljava/lang/String;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ModuleUtilsKt {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;)Ljava/lang/String; */
    public static final String convertEnumToString(Enum enumValue) {
        List<l> parameters;
        Object next;
        s.k(enumValue, "enumValue");
        d dVarB = o0.b(enumValue.getClass());
        h hVarF = c.f(dVarB);
        if (hVarF == null || (parameters = hVarF.getParameters()) == null || parameters.size() != 1) {
            return enumValue.name();
        }
        String name = ((l) v.o0(hVarF.getParameters())).getName();
        Iterator it = c.d(dVarB).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((o) next).getName(), name));
        o oVar = (o) next;
        if (oVar != null) {
            if (s.f(oVar.getReturnType().getClassifier(), o0.b(String.class))) {
                return (String) oVar.get(enumValue);
            }
            throw new IllegalArgumentException("The enum parameter has to be a string.");
        }
        throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
    }
}
