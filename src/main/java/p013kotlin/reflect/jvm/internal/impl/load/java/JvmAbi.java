package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmAbi {
    public static final JvmAbi INSTANCE = new JvmAbi();
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassId f87110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ClassId f87111b;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId.Companion companion = ClassId.Companion;
        JVM_FIELD_ANNOTATION_CLASS_ID = companion.topLevel(fqName);
        f87110a = companion.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f87111b = ClassId.Companion.fromString$default(companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private JvmAbi() {
    }

    public static final String getterName(String propertyName) {
        s.k(propertyName, "propertyName");
        if (startsWithIsPrefix(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
    }

    public static final boolean isGetterName(String name) {
        s.k(name, "name");
        return t.b0(name, "get", false, 2, null) || t.b0(name, "is", false, 2, null);
    }

    public static final boolean isSetterName(String name) {
        s.k(name, "name");
        return t.b0(name, "set", false, 2, null);
    }

    public static final String setterName(String propertyName) {
        String strCapitalizeAsciiOnly;
        s.k(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (startsWithIsPrefix(propertyName)) {
            strCapitalizeAsciiOnly = propertyName.substring(2);
            s.j(strCapitalizeAsciiOnly, "substring(...)");
        } else {
            strCapitalizeAsciiOnly = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
        }
        sb2.append(strCapitalizeAsciiOnly);
        return sb2.toString();
    }

    public static final boolean startsWithIsPrefix(String name) {
        s.k(name, "name");
        if (!t.b0(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return s.m(97, cCharAt) > 0 || s.m(cCharAt, 122) > 0;
    }

    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return f87111b;
    }
}
