package retrofit2;

import android.annotation.TargetApi;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes10.dex */
class v {

    @TargetApi(24)
    @IgnoreJRERequirement
    static final class a extends v {
        a() {
        }

        @Override // retrofit2.v
        Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return n.a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // retrofit2.v
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    static class b extends v {
        b() {
        }

        @Override // retrofit2.v
        String a(Method method, int i11) {
            Parameter parameter = method.getParameters()[i11];
            if (!parameter.isNamePresent()) {
                return super.a(method, i11);
            }
            return "parameter '" + parameter.getName() + CoreConstants.SINGLE_QUOTE_CHAR;
        }

        @Override // retrofit2.v
        Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return n.a(method, cls, obj, objArr);
        }

        @Override // retrofit2.v
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    v() {
    }

    String a(Method method, int i11) {
        return "parameter #" + (i11 + 1);
    }

    Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    boolean c(Method method) {
        return false;
    }
}
