package p013kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class FqNamesUtilKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean a(String str, String str2) {
        return t.b0(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final <V> V findValueForMostSpecificFqname(FqName fqName, Map<FqName, ? extends V> values) {
        Object next;
        s.k(fqName, "<this>");
        s.k(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : values.entrySet()) {
            FqName key = entry.getKey();
            if (s.f(fqName, key) || isChildOf(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = tail((FqName) ((Map.Entry) next).getKey(), fqName).asString().length();
                do {
                    Object next2 = it.next();
                    int length2 = tail((FqName) ((Map.Entry) next2).getKey(), fqName).asString().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean isChildOf(FqName fqName, FqName packageName) {
        s.k(fqName, "<this>");
        s.k(packageName, "packageName");
        return s.f(parentOrNull(fqName), packageName);
    }

    public static final boolean isSubpackageOf(FqName fqName, FqName packageName) {
        s.k(fqName, "<this>");
        s.k(packageName, "packageName");
        if (s.f(fqName, packageName) || packageName.isRoot()) {
            return true;
        }
        String strAsString = fqName.asString();
        s.j(strAsString, "asString(...)");
        String strAsString2 = packageName.asString();
        s.j(strAsString2, "asString(...)");
        return a(strAsString, strAsString2);
    }

    public static final boolean isValidJavaFqName(String str) {
        if (str == null) {
            return false;
        }
        a aVar = a.BEGINNING;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            int i12 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i12 == 1 || i12 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                aVar = a.MIDDLE;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cCharAt == '.') {
                    aVar = a.AFTER_DOT;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return aVar != a.AFTER_DOT;
    }

    public static final FqName parentOrNull(FqName fqName) {
        s.k(fqName, "<this>");
        if (fqName.isRoot()) {
            return null;
        }
        return fqName.parent();
    }

    public static final FqName tail(FqName fqName, FqName prefix) {
        s.k(fqName, "<this>");
        s.k(prefix, "prefix");
        if (!isSubpackageOf(fqName, prefix) || prefix.isRoot()) {
            return fqName;
        }
        if (s.f(fqName, prefix)) {
            FqName ROOT = FqName.ROOT;
            s.j(ROOT, "ROOT");
            return ROOT;
        }
        String strAsString = fqName.asString();
        s.j(strAsString, "asString(...)");
        String strSubstring = strAsString.substring(prefix.asString().length() + 1);
        s.j(strSubstring, "substring(...)");
        return new FqName(strSubstring);
    }
}
