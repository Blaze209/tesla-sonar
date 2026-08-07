package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes9.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f88459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f88460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<KotlinType> f88461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SimpleType f88462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f88463e;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private enum a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SimpleType a(Collection<? extends SimpleType> collection, a aVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                SimpleType simpleType = (SimpleType) it.next();
                next = IntegerLiteralTypeConstructor.Companion.d((SimpleType) next, simpleType, aVar);
            }
            return (SimpleType) next;
        }

        private final SimpleType b(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, a aVar) {
            Set setU0;
            int i11 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i11 == 1) {
                setU0 = v.u0(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setU0 = v.s1(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            }
            return KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f88459a, integerLiteralTypeConstructor.f88460b, setU0, null), false);
        }

        private final SimpleType c(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.getPossibleTypes().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }

        private final SimpleType d(SimpleType simpleType, SimpleType simpleType2, a aVar) {
            if (simpleType != null && simpleType2 != null) {
                TypeConstructor constructor = simpleType.getConstructor();
                TypeConstructor constructor2 = simpleType2.getConstructor();
                boolean z11 = constructor instanceof IntegerLiteralTypeConstructor;
                if (z11 && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                    return b((IntegerLiteralTypeConstructor) constructor, (IntegerLiteralTypeConstructor) constructor2, aVar);
                }
                if (z11) {
                    return c((IntegerLiteralTypeConstructor) constructor, simpleType2);
                }
                if (constructor2 instanceof IntegerLiteralTypeConstructor) {
                    return c((IntegerLiteralTypeConstructor) constructor2, simpleType);
                }
            }
            return null;
        }

        public final SimpleType findIntersectionType(Collection<? extends SimpleType> types) {
            s.k(types, "types");
            return a(types, a.INTERSECTION_TYPE);
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j11, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, moduleDescriptor, set);
    }

    private final List<KotlinType> c() {
        return (List) this.f88463e.getValue();
    }

    private final boolean d() {
        Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(this.f88460b);
        if ((allSignedLiteralTypes instanceof Collection) && allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (this.f88461c.contains((KotlinType) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        SimpleType defaultType = integerLiteralTypeConstructor.getBuiltIns().getComparable().getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        List listS = v.s(TypeSubstitutionKt.replace$default(defaultType, v.e(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.f88462d)), null, 2, null));
        if (!integerLiteralTypeConstructor.d()) {
            listS.add(integerLiteralTypeConstructor.getBuiltIns().getNumberType());
        }
        return listS;
    }

    private final String f() {
        return '[' + v.y0(this.f88461c, ",", null, null, 0, null, c.f88472a, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(KotlinType it) {
        s.k(it, "it");
        return it.toString();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        return this.f88460b.getBuiltIns();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo500getDeclarationDescriptor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return v.m();
    }

    public final Set<KotlinType> getPossibleTypes() {
        return this.f88461c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return c();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public String toString() {
        return "IntegerLiteralType" + f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j11, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.f88462d = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);
        this.f88463e = m.b(new b(this));
        this.f88459a = j11;
        this.f88460b = moduleDescriptor;
        this.f88461c = set;
    }
}
