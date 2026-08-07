package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import java.util.Map;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* JADX INFO: loaded from: classes9.dex */
public class JavaDescriptorVisibilities {
    public static final DescriptorVisibility PACKAGE_VISIBILITY;
    public static final DescriptorVisibility PROTECTED_AND_PACKAGE;
    public static final DescriptorVisibility PROTECTED_STATIC_VISIBILITY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Visibility, DescriptorVisibility> f87086a;

    static class a extends DelegatedDescriptorVisibility {
        a(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "from";
            } else if (i11 == 2) {
                objArr[0] = "fromPackage";
            } else if (i11 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i11 == 2 || i11 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
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
            return JavaDescriptorVisibilities.d(declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    static class b extends DelegatedDescriptorVisibility {
        b(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
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
            return JavaDescriptorVisibilities.e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    static class c extends DelegatedDescriptorVisibility {
        c(Visibility visibility) {
            super(visibility);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
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
            return JavaDescriptorVisibilities.e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
        }
    }

    static {
        a aVar = new a(JavaVisibilities.PackageVisibility.INSTANCE);
        PACKAGE_VISIBILITY = aVar;
        b bVar = new b(JavaVisibilities.ProtectedStaticVisibility.INSTANCE);
        PROTECTED_STATIC_VISIBILITY = bVar;
        c cVar = new c(JavaVisibilities.ProtectedAndPackage.INSTANCE);
        PROTECTED_AND_PACKAGE = cVar;
        f87086a = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i11 == 5 || i11 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i11 == 2 || i11 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i11 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i11 != 5 && i11 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(2);
        }
        if (declarationDescriptor2 == null) {
            a(3);
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor2, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            a(0);
        }
        if (declarationDescriptor == null) {
            a(1);
        }
        if (d(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    private static void f(DescriptorVisibility descriptorVisibility) {
        f87086a.put(descriptorVisibility.getDelegate(), descriptorVisibility);
    }

    public static DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        if (visibility == null) {
            a(4);
        }
        DescriptorVisibility descriptorVisibility = f87086a.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.toDescriptorVisibility(visibility);
        if (descriptorVisibility2 == null) {
            a(5);
        }
        return descriptorVisibility2;
    }
}
