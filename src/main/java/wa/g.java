package wa;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "a", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {
    public static final <T, C> T a(Class<C> klass, String suffix) {
        String name;
        String str;
        p013kotlin.jvm.internal.s.k(klass, "klass");
        p013kotlin.jvm.internal.s.k(suffix, "suffix");
        Package r11 = klass.getPackage();
        if (r11 == null || (name = r11.getName()) == null) {
            name = "";
        }
        String canonicalName = klass.getCanonicalName();
        p013kotlin.jvm.internal.s.h(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            p013kotlin.jvm.internal.s.j(canonicalName, "substring(...)");
        }
        String str2 = t.U(canonicalName, CoreConstants.DOT, '_', false, 4, null) + suffix;
        try {
            if (name.length() == 0) {
                str = str2;
            } else {
                str = name + CoreConstants.DOT + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            p013kotlin.jvm.internal.s.i(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist. Is Room annotation processor correctly configured?", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e13);
        }
    }

    public static /* synthetic */ Object b(Class cls, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "_Impl";
        }
        return a(cls, str);
    }
}
