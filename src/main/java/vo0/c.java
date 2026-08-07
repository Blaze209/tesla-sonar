package vo0;

import ch.qos.logback.core.CoreConstants;
import kotlinx.serialization.SerializationException;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "subClassName", "Lco0/d;", "baseClass", "", "b", "(Ljava/lang/String;Lco0/d;)Ljava/lang/Void;", "subClass", "a", "(Lco0/d;Lco0/d;)Ljava/lang/Void;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final Void a(co0.d<?> subClass, co0.d<?> baseClass) {
        p013kotlin.jvm.internal.s.k(subClass, "subClass");
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        String strL = subClass.l();
        if (strL == null) {
            strL = String.valueOf(subClass);
        }
        b(strL, baseClass);
        throw new KotlinNothingValueException();
    }

    public static final Void b(String str, co0.d<?> baseClass) {
        String str2;
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.l() + CoreConstants.SINGLE_QUOTE_CHAR;
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + CoreConstants.DOT;
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.l() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }
}
