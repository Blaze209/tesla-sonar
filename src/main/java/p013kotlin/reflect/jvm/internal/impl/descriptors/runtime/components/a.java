package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.c;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes9.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f87000a = new a();

    private a() {
    }

    private final ClassLiteralValue a(Class<?> cls) {
        int i11 = 0;
        while (cls.isArray()) {
            i11++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            ClassId classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName());
            if (classIdMapJavaToKotlin != null) {
                classId = classIdMapJavaToKotlin;
            }
            return new ClassLiteralValue(classId, i11);
        }
        if (!s.f(cls, Void.TYPE)) {
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            s.j(primitiveType, "getPrimitiveType(...)");
            return i11 > 0 ? new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getArrayTypeFqName()), i11 - 1) : new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getTypeFqName()), i11);
        }
        ClassId.Companion companion = ClassId.Companion;
        FqName safe = StandardNames.FqNames.unit.toSafe();
        s.j(safe, "toSafe(...)");
        return new ClassLiteralValue(companion.topLevel(safe), i11);
    }

    private final void c(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Iterator itA = c.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor<?> constructor = (Constructor) itA.next();
            Name name = SpecialNames.INIT;
            b bVar = b.f87001a;
            s.h(constructor);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(name, bVar.a(constructor));
            if (methodAnnotationVisitorVisitMethod != null) {
                Iterator itA2 = c.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    s.h(annotation);
                    f(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                s.h(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        Iterator itA3 = c.a(parameterAnnotations[i11]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class<?> clsB = vn0.a.b(vn0.a.a(annotation2));
                            ClassId classId = ReflectClassUtilKt.getClassId(clsB);
                            s.h(annotation2);
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i11 + length, classId, new ReflectAnnotationSource(annotation2));
                            if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                                f87000a.h(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsB);
                            }
                        }
                    }
                }
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
        }
    }

    private final void d(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Iterator itA = c.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            Name nameIdentifier = Name.identifier(field.getName());
            s.j(nameIdentifier, "identifier(...)");
            b bVar = b.f87001a;
            s.h(field);
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorVisitField = memberVisitor.visitField(nameIdentifier, bVar.b(field), null);
            if (annotationVisitorVisitField != null) {
                Iterator itA2 = c.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    s.h(annotation);
                    f(annotationVisitorVisitField, annotation);
                }
                annotationVisitorVisitField.visitEnd();
            }
        }
    }

    private final void e(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Iterator itA = c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            Name nameIdentifier = Name.identifier(method.getName());
            s.j(nameIdentifier, "identifier(...)");
            b bVar = b.f87001a;
            s.h(method);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(nameIdentifier, bVar.c(method));
            if (methodAnnotationVisitorVisitMethod != null) {
                Iterator itA2 = c.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    s.h(annotation);
                    f(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                s.j(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    Iterator itA3 = c.a(annotationArr[i11]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class<?> clsB = vn0.a.b(vn0.a.a(annotation2));
                        ClassId classId = ReflectClassUtilKt.getClassId(clsB);
                        s.h(annotation2);
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i11, classId, new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                            f87000a.h(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsB);
                        }
                    }
                }
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
        }
    }

    private final void f(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class<?> clsB = vn0.a.b(vn0.a.a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsB), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorVisitAnnotation != null) {
            f87000a.h(annotationArgumentVisitorVisitAnnotation, annotation, clsB);
        }
    }

    private final void g(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (s.f(enclosingClass, Class.class)) {
            s.i(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            annotationArgumentVisitor.visitClassLiteral(name, a((Class) obj));
            return;
        }
        if (ReflectKotlinClassKt.f86996a.contains(enclosingClass)) {
            annotationArgumentVisitor.visit(name, obj);
            return;
        }
        if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            s.h(enclosingClass);
            ClassId classId = ReflectClassUtilKt.getClassId(enclosingClass);
            s.i(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            Name nameIdentifier = Name.identifier(((Enum) obj).name());
            s.j(nameIdentifier, "identifier(...)");
            annotationArgumentVisitor.visitEnum(name, classId, nameIdentifier);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            s.j(interfaces, "getInterfaces(...)");
            Class<?> cls = (Class) n.e1(interfaces);
            s.h(cls);
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(cls));
            if (annotationArgumentVisitorVisitAnnotation == null) {
                return;
            }
            s.i(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(annotationArgumentVisitorVisitAnnotation, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorVisitArray = annotationArgumentVisitor.visitArray(name);
        if (annotationArrayArgumentVisitorVisitArray == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i11 = 0;
        if (componentType.isEnum()) {
            s.h(componentType);
            ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i11 < length) {
                Object obj2 = objArr[i11];
                s.i(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                Name nameIdentifier2 = Name.identifier(((Enum) obj2).name());
                s.j(nameIdentifier2, "identifier(...)");
                annotationArrayArgumentVisitorVisitArray.visitEnum(classId2, nameIdentifier2);
                i11++;
            }
        } else if (s.f(componentType, Class.class)) {
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i11 < length2) {
                Object obj3 = objArr2[i11];
                s.i(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                annotationArrayArgumentVisitorVisitArray.visitClassLiteral(a((Class) obj3));
                i11++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i11 < length3) {
                Object obj4 = objArr3[i11];
                s.h(componentType);
                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation2 = annotationArrayArgumentVisitorVisitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                if (annotationArgumentVisitorVisitAnnotation2 != null) {
                    s.i(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(annotationArgumentVisitorVisitAnnotation2, (Annotation) obj4, componentType);
                }
                i11++;
            }
        } else {
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i11 < length4) {
                annotationArrayArgumentVisitorVisitArray.visit(objArr4[i11]);
                i11++;
            }
        }
        annotationArrayArgumentVisitorVisitArray.visitEnd();
    }

    private final void h(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        Iterator itA = c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                s.h(objInvoke);
                Name nameIdentifier = Name.identifier(method.getName());
                s.j(nameIdentifier, "identifier(...)");
                g(annotationArgumentVisitor, nameIdentifier, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void b(Class<?> klass, KotlinJvmBinaryClass.AnnotationVisitor visitor) {
        s.k(klass, "klass");
        s.k(visitor, "visitor");
        Iterator itA = c.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            s.h(annotation);
            f(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void i(Class<?> klass, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        s.k(klass, "klass");
        s.k(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
