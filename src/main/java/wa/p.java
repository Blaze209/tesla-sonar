package wa;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001a)\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, d2 = {"", "type", "", "a", "(Ljava/lang/String;)I", "Lya/b;", "connection", "tableName", "Lwa/r;", "g", "(Lya/b;Ljava/lang/String;)Lwa/r;", "", "Lwa/r$c;", DateTokenConverter.CONVERTER_KEY, "(Lya/b;Ljava/lang/String;)Ljava/util/Set;", "Lya/d;", "stmt", "", "Lwa/f;", "c", "(Lya/d;)Ljava/util/List;", "", "Lwa/r$a;", "b", "(Lya/b;Ljava/lang/String;)Ljava/util/Map;", "Lwa/r$d;", "f", "name", "", "unique", "e", "(Lya/b;Ljava/lang/String;Z)Lwa/r$d;", "", "[Ljava/lang/String;", "FTS_OPTIONS", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f121610a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d((Integer) ((Map.Entry) t11).getKey(), (Integer) ((Map.Entry) t12).getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d((Integer) ((Map.Entry) t11).getKey(), (Integer) ((Map.Entry) t12).getKey());
        }
    }

    public static final int a(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        if (t.h0(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (t.h0(upperCase, "CHAR", false, 2, null) || t.h0(upperCase, "CLOB", false, 2, null) || t.h0(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (t.h0(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (t.h0(upperCase, "REAL", false, 2, null) || t.h0(upperCase, "FLOA", false, 2, null) || t.h0(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    private static final Map<String, r.a> b(ya.b bVar, String str) throws Exception {
        ya.d dVarL1 = bVar.L1("PRAGMA table_info(`" + str + "`)");
        try {
            if (!dVarL1.I1()) {
                Map<String, r.a> mapI = v0.i();
                un0.a.a(dVarL1, null);
                return mapI;
            }
            int iA = m.a(dVarL1, "name");
            int iA2 = m.a(dVarL1, "type");
            int iA3 = m.a(dVarL1, "notnull");
            int iA4 = m.a(dVarL1, "pk");
            int iA5 = m.a(dVarL1, "dflt_value");
            Map mapC = v0.c();
            do {
                String strQ3 = dVarL1.q3(iA);
                mapC.put(strQ3, new r.a(strQ3, dVarL1.q3(iA2), dVarL1.getLong(iA3) != 0, (int) dVarL1.getLong(iA4), dVarL1.isNull(iA5) ? null : dVarL1.q3(iA5), 2));
            } while (dVarL1.I1());
            Map<String, r.a> mapB = v0.b(mapC);
            un0.a.a(dVarL1, null);
            return mapB;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    private static final List<f> c(ya.d dVar) {
        int iA = m.a(dVar, "id");
        int iA2 = m.a(dVar, "seq");
        int iA3 = m.a(dVar, "from");
        int iA4 = m.a(dVar, "to");
        List listC = v.c();
        while (dVar.I1()) {
            listC.add(new f((int) dVar.getLong(iA), (int) dVar.getLong(iA2), dVar.q3(iA3), dVar.q3(iA4)));
        }
        return v.Y0(v.a(listC));
    }

    private static final Set<r.c> d(ya.b bVar, String str) throws Exception {
        ya.d dVarL1 = bVar.L1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iA = m.a(dVarL1, "id");
            int iA2 = m.a(dVarL1, "seq");
            int iA3 = m.a(dVarL1, "table");
            int iA4 = m.a(dVarL1, "on_delete");
            int iA5 = m.a(dVarL1, "on_update");
            List<f> listC = c(dVarL1);
            dVarL1.reset();
            Set setB = d1.b();
            while (dVarL1.I1()) {
                if (dVarL1.getLong(iA2) == 0) {
                    int i11 = (int) dVarL1.getLong(iA);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<f> arrayList3 = new ArrayList();
                    for (Object obj : listC) {
                        if (((f) obj).getId() == i11) {
                            arrayList3.add(obj);
                        }
                    }
                    for (f fVar : arrayList3) {
                        arrayList.add(fVar.getFrom());
                        arrayList2.add(fVar.getTo());
                    }
                    setB.add(new r.c(dVarL1.q3(iA3), dVarL1.q3(iA4), dVarL1.q3(iA5), arrayList, arrayList2));
                }
            }
            Set<r.c> setA = d1.a(setB);
            un0.a.a(dVarL1, null);
            return setA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    private static final r.d e(ya.b bVar, String str, boolean z11) throws Exception {
        ya.d dVarL1 = bVar.L1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = m.a(dVarL1, "seqno");
            int iA2 = m.a(dVarL1, "cid");
            int iA3 = m.a(dVarL1, "name");
            int iA4 = m.a(dVarL1, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (dVarL1.I1()) {
                    if (((int) dVarL1.getLong(iA2)) >= 0) {
                        int i11 = (int) dVarL1.getLong(iA);
                        String strQ3 = dVarL1.q3(iA3);
                        String str2 = dVarL1.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i11), strQ3);
                        linkedHashMap2.put(Integer.valueOf(i11), str2);
                    }
                }
                List listA1 = v.a1(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(v.y(listA1, 10));
                Iterator it = listA1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM1 = v.m1(arrayList);
                List listA2 = v.a1(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(v.y(listA2, 10));
                Iterator it2 = listA2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                r.d dVar = new r.d(str, z11, listM1, v.m1(arrayList2));
                un0.a.a(dVarL1, null);
                return dVar;
            }
            un0.a.a(dVarL1, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    private static final Set<r.d> f(ya.b bVar, String str) throws Exception {
        ya.d dVarL1 = bVar.L1("PRAGMA index_list(`" + str + "`)");
        try {
            int iA = m.a(dVarL1, "name");
            int iA2 = m.a(dVarL1, "origin");
            int iA3 = m.a(dVarL1, "unique");
            if (iA != -1 && iA2 != -1 && iA3 != -1) {
                Set setB = d1.b();
                while (dVarL1.I1()) {
                    if (p013kotlin.jvm.internal.s.f("c", dVarL1.q3(iA2))) {
                        r.d dVarE = e(bVar, dVarL1.q3(iA), dVarL1.getLong(iA3) == 1);
                        if (dVarE == null) {
                            un0.a.a(dVarL1, null);
                            return null;
                        }
                        setB.add(dVarE);
                    }
                }
                Set<r.d> setA = d1.a(setB);
                un0.a.a(dVarL1, null);
                return setA;
            }
            un0.a.a(dVarL1, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    public static final r g(ya.b connection, String tableName) {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        p013kotlin.jvm.internal.s.k(tableName, "tableName");
        return new r(tableName, b(connection, tableName), d(connection, tableName), f(connection, tableName));
    }
}
