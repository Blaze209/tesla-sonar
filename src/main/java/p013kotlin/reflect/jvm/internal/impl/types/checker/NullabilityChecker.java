package p013kotlin.reflect.jvm.internal.impl.types.checker;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes9.dex */
public final class NullabilityChecker {
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    private NullabilityChecker() {
    }

    public final boolean isSubtypeOfAny(UnwrappedType type) {
        s.k(type, "type");
        return AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(SimpleClassicTypeSystemContext.INSTANCE.newTypeCheckerState(false, true), FlexibleTypesKt.lowerIfFlexible(type), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
