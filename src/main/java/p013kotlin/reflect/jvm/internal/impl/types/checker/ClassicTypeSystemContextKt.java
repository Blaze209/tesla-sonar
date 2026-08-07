package p013kotlin.reflect.jvm.internal.impl.types.checker;

import p013kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassicTypeSystemContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final UnwrappedType a(UnwrappedType unwrappedType) {
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(unwrappedType, false, 1, null);
    }
}
