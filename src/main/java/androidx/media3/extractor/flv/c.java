package androidx.media3.extractor.flv;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s7.c0;
import w8.n;

/* JADX INFO: loaded from: classes3.dex */
final class c extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f11438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f11439d;

    public c() {
        super(new n());
        this.f11437b = -9223372036854775807L;
        this.f11438c = new long[0];
        this.f11439d = new long[0];
    }

    private static Boolean g(c0 c0Var) {
        return Boolean.valueOf(c0Var.M() == 1);
    }

    private static Object h(c0 c0Var, int i11) {
        if (i11 == 0) {
            return j(c0Var);
        }
        if (i11 == 1) {
            return g(c0Var);
        }
        if (i11 == 2) {
            return n(c0Var);
        }
        if (i11 == 3) {
            return l(c0Var);
        }
        if (i11 == 8) {
            return k(c0Var);
        }
        if (i11 == 10) {
            return m(c0Var);
        }
        if (i11 != 11) {
            return null;
        }
        return i(c0Var);
    }

    private static Date i(c0 c0Var) {
        Date date = new Date((long) j(c0Var).doubleValue());
        c0Var.c0(2);
        return date;
    }

    private static Double j(c0 c0Var) {
        return Double.valueOf(Double.longBitsToDouble(c0Var.F()));
    }

    private static HashMap<String, Object> k(c0 c0Var) {
        int iQ = c0Var.Q();
        HashMap<String, Object> map = new HashMap<>(iQ);
        for (int i11 = 0; i11 < iQ; i11++) {
            String strN = n(c0Var);
            Object objH = h(c0Var, o(c0Var));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap<String, Object> l(c0 c0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(c0Var);
            int iO = o(c0Var);
            if (iO == 9) {
                return map;
            }
            Object objH = h(c0Var, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList<Object> m(c0 c0Var) {
        int iQ = c0Var.Q();
        ArrayList<Object> arrayList = new ArrayList<>(iQ);
        for (int i11 = 0; i11 < iQ; i11++) {
            Object objH = h(c0Var, o(c0Var));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(c0 c0Var) {
        int iU = c0Var.U();
        int iG = c0Var.g();
        c0Var.c0(iU);
        return new String(c0Var.f(), iG, iU);
    }

    private static int o(c0 c0Var) {
        return c0Var.M();
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(c0 c0Var) {
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(c0 c0Var, long j11) {
        if (o(c0Var) != 2 || !"onMetaData".equals(n(c0Var)) || c0Var.a() == 0 || o(c0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(c0Var);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f11437b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f11438c = new long[size];
                this.f11439d = new long[size];
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj5 = list.get(i11);
                    Object obj6 = list2.get(i11);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f11438c = new long[0];
                        this.f11439d = new long[0];
                        break;
                    }
                    this.f11438c[i11] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f11439d[i11] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f11437b;
    }

    public long[] e() {
        return this.f11439d;
    }

    public long[] f() {
        return this.f11438c;
    }
}
