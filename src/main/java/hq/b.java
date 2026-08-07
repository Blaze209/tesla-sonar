package hq;

import ch.qos.logback.core.CoreConstants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<eq.a, Map<Boolean, a>> f73271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<eq.a, Map<Boolean, a>> f73272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<eq.a, Map<Boolean, a>> f73273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<eq.a, Map<Boolean, Map<Boolean, a>>> f73274d;

    static {
        EnumMap enumMap = new EnumMap(eq.a.class);
        f73271a = enumMap;
        eq.a aVar = eq.a.OLD;
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put(bool, new a.C1540a().d().i("\r\n:.;").g());
        Boolean bool2 = Boolean.TRUE;
        map.put(bool2, new a.C1540a().f().i("[]=:.,").h(';').g());
        enumMap.put(aVar, map);
        eq.a aVar2 = eq.a.NEW;
        HashMap map2 = new HashMap();
        map2.put(bool, ((Map) enumMap.get(aVar)).get(bool));
        map2.put(bool2, new a.C1540a().b(65, 90).b(97, 122).b(48, 57).a(CoreConstants.DASH_CHAR).g());
        enumMap.put(aVar2, map2);
        f73272b = enumMap;
        EnumMap enumMap2 = new EnumMap(eq.a.class);
        f73273c = enumMap2;
        HashMap map3 = new HashMap();
        map3.put(bool, new a.C1540a().d().i("\r\n:;=").g());
        map3.put(bool2, ((Map) enumMap.get(aVar)).get(bool2));
        enumMap2.put(aVar, map3);
        HashMap map4 = new HashMap();
        map4.put(bool, ((Map) enumMap2.get(aVar)).get(bool));
        map4.put(bool2, ((Map) enumMap.get(aVar2)).get(bool2));
        enumMap2.put(aVar2, map4);
        EnumMap enumMap3 = new EnumMap(eq.a.class);
        f73274d = enumMap3;
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        map6.put(bool, new a.C1540a().d().i("\r\n:").g());
        map6.put(bool2, new a.C1540a((a) ((Map) enumMap2.get(aVar)).get(bool2)).a(';').g());
        map5.put(bool, map6);
        map5.put(bool2, map5.get(bool));
        enumMap3.put(aVar, map5);
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        map8.put(bool, new a.C1540a().d().i("\r\n\"").g());
        map8.put(bool2, new a.C1540a().f().e().a('\t').h(CoreConstants.DOUBLE_QUOTE_CHAR).g());
        map7.put(bool, map8);
        HashMap map9 = new HashMap();
        map9.put(bool, new a.C1540a().d().g());
        map9.put(bool2, new a.C1540a().f().e().c("\r\n\t").g());
        map7.put(bool2, map9);
        enumMap3.put(aVar2, map7);
    }

    public static a a(eq.a aVar, boolean z11) {
        return f73272b.get(aVar).get(Boolean.valueOf(z11));
    }

    public static a b(eq.a aVar, boolean z11) {
        return f73273c.get(aVar).get(Boolean.valueOf(z11));
    }

    public static a c(eq.a aVar, boolean z11, boolean z12) {
        return f73274d.get(aVar).get(Boolean.valueOf(z11)).get(Boolean.valueOf(z12));
    }

    public static boolean d(String str, eq.a aVar, boolean z11) {
        return b(aVar, z11).c(str);
    }

    public static boolean e(String str, eq.a aVar, boolean z11, boolean z12) {
        return c(aVar, z11, z12).c(str);
    }
}
