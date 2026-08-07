package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import jn0.h0;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class DescriptorResolverUtils {

    static class a extends NonReportingOverrideStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ErrorReporter f87163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f87164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f87165c;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$a$a, reason: collision with other inner class name */
        class C1865a implements l<CallableMemberDescriptor, h0> {
            C1865a() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h0 invoke(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    a(0);
                }
                a.this.f87163a.reportCannotInferVisibility(callableMemberDescriptor);
                return h0.f84049a;
            }
        }

        a(ErrorReporter errorReporter, Set set, boolean z11) {
            this.f87163a = errorReporter;
            this.f87164b = set;
            this.f87165c = z11;
        }

        private static /* synthetic */ void b(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "fromSuper";
            } else if (i11 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i11 == 3) {
                objArr[0] = "member";
            } else if (i11 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "conflict";
            } else if (i11 == 3 || i11 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
        public void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                b(1);
            }
            if (callableMemberDescriptor2 == null) {
                b(2);
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                b(0);
            }
            OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, new C1865a());
            this.f87164b.add(callableMemberDescriptor);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        public void setOverriddenDescriptors(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
            if (callableMemberDescriptor == null) {
                b(3);
            }
            if (collection == null) {
                b(4);
            }
            if (!this.f87165c || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                super.setOverriddenDescriptors(callableMemberDescriptor, collection);
            }
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = i11 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 18 ? 3 : 2];
        switch (i11) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    private static <D extends CallableMemberDescriptor> Collection<D> b(Name name, Collection<D> collection, Collection<D> collection2, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil, boolean z11) {
        if (name == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (classDescriptor == null) {
            a(15);
        }
        if (errorReporter == null) {
            a(16);
        }
        if (overridingUtil == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.generateOverridesInFunctionGroup(name, collection, collection2, classDescriptor, new a(errorReporter, linkedHashSet, z11));
        return linkedHashSet;
    }

    public static ValueParameterDescriptor getAnnotationParameterByName(Name name, ClassDescriptor classDescriptor) {
        if (name == null) {
            a(19);
        }
        if (classDescriptor == null) {
            a(20);
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : constructors.iterator().next().getValueParameters()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForNonStaticMembers(Name name, Collection<D> collection, Collection<D> collection2, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil) {
        if (name == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (classDescriptor == null) {
            a(3);
        }
        if (errorReporter == null) {
            a(4);
        }
        if (overridingUtil == null) {
            a(5);
        }
        return b(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, false);
    }

    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForStaticMembers(Name name, Collection<D> collection, Collection<D> collection2, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil) {
        if (name == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (classDescriptor == null) {
            a(9);
        }
        if (errorReporter == null) {
            a(10);
        }
        if (overridingUtil == null) {
            a(11);
        }
        return b(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, true);
    }
}
