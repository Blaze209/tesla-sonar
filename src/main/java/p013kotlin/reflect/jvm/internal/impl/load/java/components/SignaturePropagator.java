package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public interface SignaturePropagator {
    public static final SignaturePropagator DO_NOTHING = new a();

    public static class PropagatedSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KotlinType f87185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final KotlinType f87186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ValueParameterDescriptor> f87187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<TypeParameterDescriptor> f87188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<String> f87189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f87190f;

        public PropagatedSignature(KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2, List<String> list3, boolean z11) {
            if (kotlinType == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f87185a = kotlinType;
            this.f87186b = kotlinType2;
            this.f87187c = list;
            this.f87188d = list2;
            this.f87189e = list3;
            this.f87190f = z11;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
            switch (i11) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i11 == 4) {
                objArr[1] = "getReturnType";
            } else if (i11 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i11 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i11 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List<String> getErrors() {
            List<String> list = this.f87189e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public KotlinType getReceiverType() {
            return this.f87186b;
        }

        public KotlinType getReturnType() {
            KotlinType kotlinType = this.f87185a;
            if (kotlinType == null) {
                a(4);
            }
            return kotlinType;
        }

        public List<TypeParameterDescriptor> getTypeParameters() {
            List<TypeParameterDescriptor> list = this.f87188d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List<ValueParameterDescriptor> getValueParameters() {
            List<ValueParameterDescriptor> list = this.f87187c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean hasStableParameterNames() {
            return this.f87190f;
        }
    }

    static class a implements SignaturePropagator {
        a() {
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i11 == 5 || i11 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List<String> list) {
            if (callableMemberDescriptor == null) {
                a(5);
            }
            if (list == null) {
                a(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2) {
            if (javaMethod == null) {
                a(0);
            }
            if (classDescriptor == null) {
                a(1);
            }
            if (kotlinType == null) {
                a(2);
            }
            if (list == null) {
                a(3);
            }
            if (list2 == null) {
                a(4);
            }
            return new PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List<String> list);

    PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2);
}
