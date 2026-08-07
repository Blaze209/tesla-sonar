package p013kotlin.reflect.jvm.internal.impl.load.java.structure;

import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaLoadingKt {
    private static final boolean a(JavaMethod javaMethod) {
        FqName fqName;
        JavaValueParameter javaValueParameter = (JavaValueParameter) v.W0(javaMethod.getValueParameters());
        JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
        JavaClassifierType javaClassifierType = type instanceof JavaClassifierType ? (JavaClassifierType) type : null;
        if (javaClassifierType == null) {
            return false;
        }
        JavaClassifier classifier = javaClassifierType.getClassifier();
        return (classifier instanceof JavaClass) && (fqName = ((JavaClass) classifier).getFqName()) != null && s.f(fqName.asString(), "java.lang.Object");
    }

    private static final boolean b(JavaMethod javaMethod) {
        String strAsString = javaMethod.getName().asString();
        int iHashCode = strAsString.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strAsString.equals("equals")) {
                    return a(javaMethod);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strAsString.equals("hashCode")) {
                return false;
            }
        } else if (!strAsString.equals("toString")) {
            return false;
        }
        return javaMethod.getValueParameters().isEmpty();
    }

    public static final boolean isObjectMethodInInterface(JavaMember javaMember) {
        s.k(javaMember, "<this>");
        return javaMember.getContainingClass().isInterface() && (javaMember instanceof JavaMethod) && b((JavaMethod) javaMember);
    }
}
