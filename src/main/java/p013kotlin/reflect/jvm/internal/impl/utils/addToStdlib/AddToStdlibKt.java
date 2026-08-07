package p013kotlin.reflect.jvm.internal.impl.utils.addToStdlib;

import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class AddToStdlibKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<a<?>, Object> f89116a = new ConcurrentHashMap<>();

    public static final Void shouldNotBeCalled(String message) {
        s.k(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void shouldNotBeCalled$default(String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}
