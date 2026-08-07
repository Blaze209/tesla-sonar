package hh;

import android.content.Context;
import android.text.TextUtils;
import di.g;
import di.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: hh.a$a, reason: collision with other inner class name */
    public class RunnableC1530a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f72791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ai.a f72792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f72793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f72794d;

        public RunnableC1530a(Context context, ai.a aVar, String str, String str2) {
            this.f72791a = context;
            this.f72792b = aVar;
            this.f72793c = str;
            this.f72794d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.c(this.f72791a, this.f72792b.f1124n.r(this.f72793c), this.f72794d);
            } catch (Throwable th2) {
                g.d(th2);
            }
        }
    }

    public static final class b {
        public static synchronized int a(Context context, String str) {
            g.f("RecordPref", "stat remove " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                C1531a c1531aB = b(context);
                if (c1531aB.f72795a.isEmpty()) {
                    return 0;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, String> entry : c1531aB.f72795a.entrySet()) {
                        if (str.equals(entry.getValue())) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c1531aB.f72795a.remove((String) it.next());
                    }
                    d(context, c1531aB);
                    return arrayList.size();
                } catch (Throwable th2) {
                    g.d(th2);
                    int size = c1531aB.f72795a.size();
                    d(context, new C1531a());
                    return size;
                }
            }
            return 0;
        }

        public static synchronized C1531a b(Context context) {
            try {
                String strA = l.a(null, context, "alipay_cashier_statistic_record", null);
                if (TextUtils.isEmpty(strA)) {
                    return new C1531a();
                }
                return new C1531a(strA);
            } catch (Throwable th2) {
                g.d(th2);
                return new C1531a();
            }
        }

        public static synchronized String c(Context context, String str, String str2) {
            try {
                g.f("RecordPref", "stat append " + str2 + " , " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = UUID.randomUUID().toString();
                    }
                    C1531a c1531aB = b(context);
                    if (c1531aB.f72795a.size() > 20) {
                        c1531aB.f72795a.clear();
                    }
                    c1531aB.f72795a.put(str2, str);
                    d(context, c1531aB);
                    return str2;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public static synchronized void d(Context context, C1531a c1531a) {
            if (c1531a == null) {
                try {
                    c1531a = new C1531a();
                } catch (Throwable th2) {
                    g.d(th2);
                }
            }
            l.c(null, context, "alipay_cashier_statistic_record", c1531a.a());
        }

        public static synchronized String e(Context context) {
            g.f("RecordPref", "stat peek");
            if (context == null) {
                return null;
            }
            C1531a c1531aB = b(context);
            if (c1531aB.f72795a.isEmpty()) {
                return null;
            }
            try {
                return c1531aB.f72795a.entrySet().iterator().next().getValue();
            } catch (Throwable th2) {
                g.d(th2);
                return null;
            }
        }

        /* JADX INFO: renamed from: hh.a$b$a, reason: collision with other inner class name */
        public static final class C1531a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<String, String> f72795a = new LinkedHashMap<>();

            public C1531a() {
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f72795a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th2) {
                    g.d(th2);
                    return new JSONArray().toString();
                }
            }

            public C1531a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
                        this.f72795a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th2) {
                    g.d(th2);
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: hh.a$c$a, reason: collision with other inner class name */
        public class RunnableC1532a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f72796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f72797b;

            public RunnableC1532a(String str, Context context) {
                this.f72796a = str;
                this.f72797b = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.f72796a) || c.d(this.f72797b, this.f72796a)) {
                    for (int i11 = 0; i11 < 4; i11++) {
                        String strE = b.e(this.f72797b);
                        if (TextUtils.isEmpty(strE) || !c.d(this.f72797b, strE)) {
                            return;
                        }
                    }
                }
            }
        }

        public static synchronized void a(Context context, hh.b bVar, String str, String str2) {
            if (context == null || bVar == null || str == null) {
                return;
            }
            b(context, bVar.r(str), str2);
        }

        public static synchronized void b(Context context, String str, String str2) {
            if (context == null) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    b.c(context, str, str2);
                }
                new Thread(new RunnableC1532a(str, context)).start();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public static boolean d(Context context, String str) {
            g.f("mspl", "stat sub " + str);
            try {
                if ((lh.b.E().A() ? new wh.d() : new wh.e()).i(null, context, str) == null) {
                    return false;
                }
                b.a(context, str);
                return true;
            } catch (Throwable th2) {
                g.d(th2);
                return false;
            }
        }
    }

    public static final class d {
        public static synchronized long a(Context context) {
            return e.a(context, "alipay_cashier_ap_seq_v");
        }
    }

    public static final class e {
        public static synchronized long a(Context context, String str) {
            long j11;
            String strA;
            try {
                strA = l.a(null, context, str, null);
            } catch (Throwable unused) {
            }
            j11 = (!TextUtils.isEmpty(strA) ? Long.parseLong(strA) : 0L) + 1;
            try {
                l.c(null, context, str, Long.toString(j11));
            } catch (Throwable unused2) {
            }
            return j11;
        }
    }

    public static final class f {
        public static synchronized long a(Context context) {
            return e.a(context, "alipay_cashier_statistic_v");
        }
    }

    public static void a(ai.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.f1124n.g(str, str2);
    }

    public static void b(ai.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f1124n.h(str, str2, str3);
    }

    public static void c(ai.a aVar, String str, String str2, Throwable th2) {
        if (aVar == null) {
            return;
        }
        aVar.f1124n.i(str, str2, th2);
    }

    public static void d(ai.a aVar, String str, String str2, Throwable th2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f1124n.j(str, str2, th2, str3);
    }

    public static void e(ai.a aVar, String str, Throwable th2) {
        if (aVar == null || th2 == null) {
            return;
        }
        aVar.f1124n.i(str, th2.getClass().getSimpleName(), th2);
    }

    public static synchronized void f(Context context, ai.a aVar, String str, String str2) {
        if (context == null || aVar == null) {
            return;
        }
        g.f("mspl", "StatisticManager stash start");
        if (lh.b.E().D(null)) {
            ph.a.b(new RunnableC1530a(context, aVar, str, str2));
        } else {
            try {
                b.c(context, aVar.f1124n.r(str), str2);
            } catch (Throwable th2) {
                g.d(th2);
            }
        }
        g.f("mspl", "StatisticManager stash finish");
    }

    public static void g(ai.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f1124n.q(str, str2, str3);
    }

    public static synchronized void h(Context context, ai.a aVar, String str, String str2) {
        if (context == null || aVar == null) {
            return;
        }
        c.a(context, aVar.f1124n, str, str2);
    }
}
