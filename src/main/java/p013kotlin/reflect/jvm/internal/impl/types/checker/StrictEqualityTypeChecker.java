package p013kotlin.reflect.jvm.internal.impl.types.checker;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes9.dex */
public final class StrictEqualityTypeChecker {
    public static final StrictEqualityTypeChecker INSTANCE = new StrictEqualityTypeChecker();

    private StrictEqualityTypeChecker() {
    }

    public final boolean strictEqualTypes(UnwrappedType a11, UnwrappedType b11) {
        s.k(a11, "a");
        s.k(b11, "b");
        return AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(SimpleClassicTypeSystemContext.INSTANCE, a11, b11);
    }
}
