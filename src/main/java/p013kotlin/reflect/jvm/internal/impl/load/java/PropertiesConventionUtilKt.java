package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class PropertiesConventionUtilKt {
    private static final Name a(Name name, String str, boolean z11, String str2) {
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        s.j(identifier, "getIdentifier(...)");
        if (!t.b0(identifier, str, false, 2, null) || identifier.length() == str.length()) {
            return null;
        }
        char cCharAt = identifier.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Name.identifier(str2 + t.T0(identifier, str));
        }
        if (!z11) {
            return name;
        }
        String strDecapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(t.T0(identifier, str), true);
        if (Name.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
            return Name.identifier(strDecapitalizeSmartForCompiler);
        }
        return null;
    }

    static /* synthetic */ Name b(Name name, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return a(name, str, z11, str2);
    }

    public static final List<Name> getPropertyNamesCandidatesByAccessorName(Name name) {
        s.k(name, "name");
        String strAsString = name.asString();
        s.j(strAsString, "asString(...)");
        if (JvmAbi.isGetterName(strAsString)) {
            return v.q(propertyNameByGetMethodName(name));
        }
        return JvmAbi.isSetterName(strAsString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    public static final Name propertyNameByGetMethodName(Name methodName) {
        s.k(methodName, "methodName");
        Name nameB = b(methodName, "get", false, null, 12, null);
        return nameB == null ? b(methodName, "is", false, null, 8, null) : nameB;
    }

    public static final Name propertyNameBySetMethodName(Name methodName, boolean z11) {
        s.k(methodName, "methodName");
        return b(methodName, "set", false, z11 ? "is" : null, 4, null);
    }

    public static final List<Name> propertyNamesBySetMethodName(Name methodName) {
        s.k(methodName, "methodName");
        return v.r(propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true));
    }
}
