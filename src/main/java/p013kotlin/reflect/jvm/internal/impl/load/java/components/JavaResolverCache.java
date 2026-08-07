package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public interface JavaResolverCache {
    public static final JavaResolverCache EMPTY = new a();

    static class a implements JavaResolverCache {
        a() {
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i11) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public ClassDescriptor getClassResolvedFromSource(FqName fqName) {
            if (fqName != null) {
                return null;
            }
            a(0);
            return null;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordClass(JavaClass javaClass, ClassDescriptor classDescriptor) {
            if (javaClass == null) {
                a(7);
            }
            if (classDescriptor == null) {
                a(8);
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordConstructor(JavaElement javaElement, ConstructorDescriptor constructorDescriptor) {
            if (javaElement == null) {
                a(3);
            }
            if (constructorDescriptor == null) {
                a(4);
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordField(JavaField javaField, PropertyDescriptor propertyDescriptor) {
            if (javaField == null) {
                a(5);
            }
            if (propertyDescriptor == null) {
                a(6);
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordMethod(JavaMember javaMember, SimpleFunctionDescriptor simpleFunctionDescriptor) {
            if (javaMember == null) {
                a(1);
            }
            if (simpleFunctionDescriptor == null) {
                a(2);
            }
        }
    }

    ClassDescriptor getClassResolvedFromSource(FqName fqName);

    void recordClass(JavaClass javaClass, ClassDescriptor classDescriptor);

    void recordConstructor(JavaElement javaElement, ConstructorDescriptor constructorDescriptor);

    void recordField(JavaField javaField, PropertyDescriptor propertyDescriptor);

    void recordMethod(JavaMember javaMember, SimpleFunctionDescriptor simpleFunctionDescriptor);
}
