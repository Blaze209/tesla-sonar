package p013kotlin.reflect.jvm.internal.impl.types.checker;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes9.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinTypeRefiner f88967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KotlinTypePreparator f88968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OverridingUtil f88969c;

    public NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        s.k(kotlinTypePreparator, "kotlinTypePreparator");
        this.f88967a = kotlinTypeRefiner;
        this.f88968b = kotlinTypePreparator;
        OverridingUtil overridingUtilCreateWithTypeRefiner = OverridingUtil.createWithTypeRefiner(getKotlinTypeRefiner());
        s.j(overridingUtilCreateWithTypeRefiner, "createWithTypeRefiner(...)");
        this.f88969c = overridingUtilCreateWithTypeRefiner;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean equalTypes(KotlinType a11, KotlinType b11) {
        s.k(a11, "a");
        s.k(b11, "b");
        return equalTypes(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(false, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), a11.unwrap(), b11.unwrap());
    }

    public KotlinTypePreparator getKotlinTypePreparator() {
        return this.f88968b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public KotlinTypeRefiner getKotlinTypeRefiner() {
        return this.f88967a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public OverridingUtil getOverridingUtil() {
        return this.f88969c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean isSubtypeOf(KotlinType subtype, KotlinType supertype) {
        s.k(subtype, "subtype");
        s.k(supertype, "supertype");
        return isSubtypeOf(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(true, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), subtype.unwrap(), supertype.unwrap());
    }

    public final boolean equalTypes(TypeCheckerState typeCheckerState, UnwrappedType a11, UnwrappedType b11) {
        s.k(typeCheckerState, "<this>");
        s.k(a11, "a");
        s.k(b11, "b");
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, a11, b11);
    }

    public final boolean isSubtypeOf(TypeCheckerState typeCheckerState, UnwrappedType subType, UnwrappedType superType) {
        s.k(typeCheckerState, "<this>");
        s.k(subType, "subType");
        s.k(superType, "superType");
        return AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, typeCheckerState, subType, superType, false, 8, null);
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i11 & 2) != 0 ? KotlinTypePreparator.Default.INSTANCE : kotlinTypePreparator);
    }
}
