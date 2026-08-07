package p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import pn0.c;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassMapperLite {
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f88145a = v.y0(v.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f88146b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listP = v.p("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", Gender.FEMALE, "Long", "J", "Double", "D");
        int iC = c.c(0, listP.size() - 1, 2);
        if (iC >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f88145a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listP.get(i11));
                int i12 = i11 + 1;
                linkedHashMap.put(sb2.toString(), listP.get(i12));
                linkedHashMap.put(str + '/' + ((String) listP.get(i11)) + "Array", '[' + ((String) listP.get(i12)));
                if (i11 == iC) {
                    break;
                } else {
                    i11 += 2;
                }
            }
        }
        linkedHashMap.put(f88145a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : v.p("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : v.p("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i13 = 0; i13 < 23; i13++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f88145a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i13);
            a(linkedHashMap, "Function" + i13, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i13, str4 + "/reflect/KFunction");
        }
        for (String str5 : v.p("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f88145a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f88146b = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f88145a + '/' + str, 'L' + str2 + ';');
    }

    public static final String mapClass(String classId) {
        s.k(classId, "classId");
        String str = f88146b.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + t.U(classId, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null) + ';';
    }
}
