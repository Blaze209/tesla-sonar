package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(ClassId classId) {
        String strAsString = classId.getRelativeClassName().asString();
        s.j(strAsString, "asString(...)");
        String strU = t.U(strAsString, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null);
        if (classId.getPackageFqName().isRoot()) {
            return strU;
        }
        return classId.getPackageFqName() + CoreConstants.DOT + strU;
    }
}
