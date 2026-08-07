package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public final class ConstUtil {
    public static final ConstUtil INSTANCE = new ConstUtil();

    private ConstUtil() {
    }

    public static final boolean canBeUsedForConstVal(KotlinType type) {
        s.k(type, "type");
        return ConstUtilKt.canBeUsedForConstVal(type);
    }
}
