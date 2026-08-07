package rm0;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        tm0.a.r(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<nr0.c> atomicReference, nr0.c cVar, Class<?> cls) {
        Objects.requireNonNull(cVar, "next is null");
        if (androidx.camera.view.i.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == qm0.d.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }
}
