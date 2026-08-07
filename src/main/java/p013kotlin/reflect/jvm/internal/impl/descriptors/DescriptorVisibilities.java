package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import p013kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;

    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;
    public static final DescriptorVisibility INHERITED;
    public static final DescriptorVisibility INTERNAL;
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set<DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;
    public static final DescriptorVisibility LOCAL;
    public static final DescriptorVisibility PRIVATE;
    public static final DescriptorVisibility PRIVATE_TO_THIS;
    public static final DescriptorVisibility PROTECTED;
    public static final DescriptorVisibility PUBLIC;
    public static final DescriptorVisibility UNKNOWN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<DescriptorVisibility, Integer> f86690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ReceiverValue f86691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ModuleVisibilityHelper f86692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Visibility, DescriptorVisibility> f86693d;

    static class a implements ReceiverValue {
        a() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class b implements ReceiverValue {
        b() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class c implements ReceiverValue {
        c() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class d extends DelegatedDescriptorVisibility {
        d(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "what";
            } else if (i11 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean b(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                a(0);
            }
            return DescriptorUtils.getContainingSourceFile(declarationDescriptor) != SourceFile.NO_SOURCE_FILE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            if (declarationDescriptorWithVisibility == 0) {
                a(1);
            }
            if (declarationDescriptor == null) {
                a(2);
            }
            if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility) && b(declarationDescriptor)) {
                return DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ClassifierDescriptorWithTypeParameters containingDeclaration = ((ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                if (z11 && DescriptorUtils.isSealedClass(containingDeclaration) && DescriptorUtils.isTopLevelDeclaration(containingDeclaration) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) && DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor)) {
                    return true;
                }
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).getFqName().equals(((PackageFragmentDescriptor) declarationDescriptor).getFqName()) && DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility);
                }
                declarationDescriptor = declarationDescriptor.getContainingDeclaration();
            }
            return false;
        }
    }

    static class e extends DelegatedDescriptorVisibility {
        e(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            DeclarationDescriptor parentOfType;
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            if (DescriptorVisibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z11)) {
                if (receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue != DescriptorVisibilities.f86691b && (parentOfType = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class)) != null && (receiverValue instanceof ThisClassReceiver)) {
                    return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                }
            }
            return false;
        }
    }

    static class f extends DelegatedDescriptorVisibility {
        f(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "from";
            } else if (i11 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i11 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i11 == 2 || i11 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean b(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, ClassDescriptor classDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                a(2);
            }
            if (classDescriptor == null) {
                a(3);
            }
            if (receiverValue == DescriptorVisibilities.FALSE_IF_PROTECTED) {
                return false;
            }
            if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) || receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f86691b || receiverValue == null) {
                return false;
            }
            KotlinType thisType = receiverValue instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue) receiverValue).getThisType() : receiverValue.getType();
            return DescriptorUtils.isSubtypeOfClass(thisType, classDescriptor) || DynamicTypesKt.isDynamic(thisType);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            ClassDescriptor classDescriptor;
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
            ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, ClassDescriptor.class, false);
            if (classDescriptor3 == null) {
                return false;
            }
            if (classDescriptor2 != null && DescriptorUtils.isCompanionObject(classDescriptor2) && (classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(classDescriptor2, ClassDescriptor.class)) != null && DescriptorUtils.isSubclass(classDescriptor3, classDescriptor)) {
                return true;
            }
            DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
            ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration, ClassDescriptor.class);
            if (classDescriptor4 == null) {
                return false;
            }
            if (DescriptorUtils.isSubclass(classDescriptor3, classDescriptor4) && b(receiverValue, declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration, classDescriptor3)) {
                return true;
            }
            return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.getContainingDeclaration(), z11);
        }
    }

    static class g extends DelegatedDescriptorVisibility {
        g(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            if (DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                return DescriptorVisibilities.f86692c.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            return false;
        }
    }

    static class h extends DelegatedDescriptorVisibility {
        h(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            return true;
        }
    }

    static class i extends DelegatedDescriptorVisibility {
        i(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    static class j extends DelegatedDescriptorVisibility {
        j(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    static class k extends DelegatedDescriptorVisibility {
        k(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            return false;
        }
    }

    static class l extends DelegatedDescriptorVisibility {
        l(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
            if (declarationDescriptorWithVisibility == null) {
                a(0);
            }
            if (declarationDescriptor == null) {
                a(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(Visibilities.Private.INSTANCE);
        PRIVATE = dVar;
        e eVar = new e(Visibilities.PrivateToThis.INSTANCE);
        PRIVATE_TO_THIS = eVar;
        f fVar = new f(Visibilities.Protected.INSTANCE);
        PROTECTED = fVar;
        g gVar = new g(Visibilities.Internal.INSTANCE);
        INTERNAL = gVar;
        h hVar = new h(Visibilities.Public.INSTANCE);
        PUBLIC = hVar;
        i iVar = new i(Visibilities.Local.INSTANCE);
        LOCAL = iVar;
        j jVar = new j(Visibilities.Inherited.INSTANCE);
        INHERITED = jVar;
        k kVar = new k(Visibilities.InvisibleFake.INSTANCE);
        INVISIBLE_FAKE = kVar;
        l lVar = new l(Visibilities.Unknown.INSTANCE);
        UNKNOWN = lVar;
        INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(d1.i(dVar, eVar, gVar, iVar));
        HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        mapNewHashMapWithExpectedSize.put(eVar, 0);
        mapNewHashMapWithExpectedSize.put(dVar, 0);
        mapNewHashMapWithExpectedSize.put(gVar, 1);
        mapNewHashMapWithExpectedSize.put(fVar, 1);
        mapNewHashMapWithExpectedSize.put(hVar, 2);
        f86690a = Collections.unmodifiableMap(mapNewHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = hVar;
        f86691b = new a();
        ALWAYS_SUITABLE_RECEIVER = new b();
        FALSE_IF_PROTECTED = new c();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f86692c = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.INSTANCE;
        f86693d = new HashMap();
        d(dVar);
        d(eVar);
        d(fVar);
        d(gVar);
        d(hVar);
        d(iVar);
        d(jVar);
        d(kVar);
        d(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    private static /* synthetic */ void a(int i11) {
        String str = i11 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 16 ? 3 : 2];
        if (i11 != 1 && i11 != 3 && i11 != 5 && i11 != 7) {
            switch (i11) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i11 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i11) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer compare(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            a(12);
        }
        if (descriptorVisibility2 == null) {
            a(13);
        }
        Integer numCompareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (numCompareTo != null) {
            return numCompareTo;
        }
        Integer numCompareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (numCompareTo2 != null) {
            return Integer.valueOf(-numCompareTo2.intValue());
        }
        return null;
    }

    private static void d(DescriptorVisibility descriptorVisibility) {
        f86693d.put(descriptorVisibility.getDelegate(), descriptorVisibility);
    }

    public static DeclarationDescriptorWithVisibility findInvisibleMember(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityFindInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            a(8);
        }
        if (declarationDescriptor == null) {
            a(9);
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z11)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityFindInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z11)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityFindInvisibleMember;
    }

    public static boolean inSameFile(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(6);
        }
        if (declarationDescriptor2 == null) {
            a(7);
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            a(14);
        }
        return descriptorVisibility == PRIVATE || descriptorVisibility == PRIVATE_TO_THIS;
    }

    public static boolean isVisibleIgnoringReceiver(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z11) {
        if (declarationDescriptorWithVisibility == null) {
            a(2);
        }
        if (declarationDescriptor == null) {
            a(3);
        }
        return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z11) == null;
    }

    public static DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        if (visibility == null) {
            a(15);
        }
        DescriptorVisibility descriptorVisibility = f86693d.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
