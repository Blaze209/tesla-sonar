package fo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Method;
import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        p013kotlin.jvm.internal.s.h(cls);
        return ReflectClassUtilKt.getDesc(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        p013kotlin.jvm.internal.s.j(parameterTypes, "getParameterTypes(...)");
        sb2.append(p013kotlin.collections.n.T0(parameterTypes, "", "(", ")", 0, null, f3.f66126a, 24, null));
        Class<?> returnType = method.getReturnType();
        p013kotlin.jvm.internal.s.j(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(returnType));
        return sb2.toString();
    }
}
