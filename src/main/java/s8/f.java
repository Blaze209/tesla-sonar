package s8;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.d1;
import com.google.common.collect.x;
import com.google.common.collect.y;
import com.google.common.collect.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p7.g0;
import p7.t0;
import p7.u;
import r8.t;
import s7.k0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ou.i f110534f = ou.i.g(",");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f110535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f110536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f110537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f110538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f110539e;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f110540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f110541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f110542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f110543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final x<String> f110544e;

        public static final class a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f110548d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f110545a = -2147483647;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f110546b = -2147483647;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f110547c = -9223372036854775807L;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private x<String> f110549e = x.r();

            public b f() {
                return new b(this);
            }

            public a g(int i11) {
                s7.a.a(i11 >= 0 || i11 == -2147483647);
                this.f110545a = i11;
                return this;
            }

            public a h(List<String> list) {
                this.f110549e = x.n(list);
                return this;
            }

            public a i(long j11) {
                s7.a.a(j11 >= 0 || j11 == -9223372036854775807L);
                this.f110547c = j11;
                return this;
            }

            public a j(String str) {
                this.f110548d = str;
                return this;
            }

            public a k(int i11) {
                s7.a.a(i11 >= 0 || i11 == -2147483647);
                this.f110546b = i11;
                return this;
            }
        }

        public void a(com.google.common.collect.h<String, String> hVar) {
            ArrayList arrayList = new ArrayList();
            if (this.f110540a != -2147483647) {
                arrayList.add("br=" + this.f110540a);
            }
            if (this.f110541b != -2147483647) {
                arrayList.add("tb=" + this.f110541b);
            }
            if (this.f110542c != -9223372036854775807L) {
                arrayList.add("d=" + this.f110542c);
            }
            if (!TextUtils.isEmpty(this.f110543d)) {
                arrayList.add("ot=" + this.f110543d);
            }
            arrayList.addAll(this.f110544e);
            if (arrayList.isEmpty()) {
                return;
            }
            hVar.j("CMCD-Object", arrayList);
        }

        private b(a aVar) {
            this.f110540a = aVar.f110545a;
            this.f110541b = aVar.f110546b;
            this.f110542c = aVar.f110547c;
            this.f110543d = aVar.f110548d;
            this.f110544e = aVar.f110549e;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f110550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f110551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f110552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f110553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f110554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f110555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final x<String> f110556g;

        public static final class a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f110560d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f110561e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f110562f;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f110557a = -9223372036854775807L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f110558b = -2147483647L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f110559c = -9223372036854775807L;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private x<String> f110563g = x.r();

            public c h() {
                return new c(this);
            }

            public a i(long j11) {
                if (j11 == -9223372036854775807L) {
                    this.f110557a = j11;
                    return this;
                }
                if (j11 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f110557a = ((j11 + 50) / 100) * 100;
                return this;
            }

            public a j(List<String> list) {
                this.f110563g = x.n(list);
                return this;
            }

            public a k(long j11) {
                if (j11 == -9223372036854775807L) {
                    this.f110559c = j11;
                    return this;
                }
                if (j11 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f110559c = ((j11 + 50) / 100) * 100;
                return this;
            }

            public a l(long j11) {
                if (j11 == -2147483647L) {
                    this.f110558b = j11;
                    return this;
                }
                if (j11 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f110558b = ((j11 + 50) / 100) * 100;
                return this;
            }

            public a m(String str) {
                this.f110561e = str == null ? null : Uri.encode(str);
                return this;
            }

            public a n(String str) {
                this.f110562f = str;
                return this;
            }

            public a o(boolean z11) {
                this.f110560d = z11;
                return this;
            }
        }

        public void a(com.google.common.collect.h<String, String> hVar) {
            ArrayList arrayList = new ArrayList();
            if (this.f110550a != -9223372036854775807L) {
                arrayList.add("bl=" + this.f110550a);
            }
            if (this.f110551b != -2147483647L) {
                arrayList.add("mtp=" + this.f110551b);
            }
            if (this.f110552c != -9223372036854775807L) {
                arrayList.add("dl=" + this.f110552c);
            }
            if (this.f110553d) {
                arrayList.add("su");
            }
            if (!TextUtils.isEmpty(this.f110554e)) {
                arrayList.add(q0.J("%s=\"%s\"", "nor", this.f110554e));
            }
            if (!TextUtils.isEmpty(this.f110555f)) {
                arrayList.add(q0.J("%s=\"%s\"", "nrr", this.f110555f));
            }
            arrayList.addAll(this.f110556g);
            if (arrayList.isEmpty()) {
                return;
            }
            hVar.j("CMCD-Request", arrayList);
        }

        private c(a aVar) {
            this.f110550a = aVar.f110557a;
            this.f110551b = aVar.f110558b;
            this.f110552c = aVar.f110559c;
            this.f110553d = aVar.f110560d;
            this.f110554e = aVar.f110561e;
            this.f110555f = aVar.f110562f;
            this.f110556g = aVar.f110563g;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f110564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f110565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f110566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f110567d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f110568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final x<String> f110569f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f110570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f110571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f110572c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f110573d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f110574e = -3.4028235E38f;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private x<String> f110575f = x.r();

            public d g() {
                return new d(this);
            }

            public a h(String str) {
                s7.a.a(str == null || str.length() <= 64);
                this.f110570a = str;
                return this;
            }

            public a i(List<String> list) {
                this.f110575f = x.n(list);
                return this;
            }

            public a j(float f11) {
                s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED || f11 == -3.4028235E38f);
                this.f110574e = f11;
                return this;
            }

            public a k(String str) {
                s7.a.a(str == null || str.length() <= 64);
                this.f110571b = str;
                return this;
            }

            public a l(String str) {
                this.f110573d = str;
                return this;
            }

            public a m(String str) {
                this.f110572c = str;
                return this;
            }
        }

        public void a(com.google.common.collect.h<String, String> hVar) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f110564a)) {
                arrayList.add(q0.J("%s=\"%s\"", "cid", this.f110564a));
            }
            if (!TextUtils.isEmpty(this.f110565b)) {
                arrayList.add(q0.J("%s=\"%s\"", "sid", this.f110565b));
            }
            if (!TextUtils.isEmpty(this.f110566c)) {
                arrayList.add("sf=" + this.f110566c);
            }
            if (!TextUtils.isEmpty(this.f110567d)) {
                arrayList.add("st=" + this.f110567d);
            }
            float f11 = this.f110568e;
            if (f11 != -3.4028235E38f && f11 != 1.0f) {
                arrayList.add(q0.J("%s=%.2f", "pr", Float.valueOf(f11)));
            }
            arrayList.addAll(this.f110569f);
            if (arrayList.isEmpty()) {
                return;
            }
            hVar.j("CMCD-Session", arrayList);
        }

        private d(a aVar) {
            this.f110564a = aVar.f110570a;
            this.f110565b = aVar.f110571b;
            this.f110566c = aVar.f110572c;
            this.f110567d = aVar.f110573d;
            this.f110568e = aVar.f110574e;
            this.f110569f = aVar.f110575f;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f110576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f110577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x<String> f110578c;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f110580b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f110579a = -2147483647;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private x<String> f110581c = x.r();

            public e d() {
                return new e(this);
            }

            public a e(boolean z11) {
                this.f110580b = z11;
                return this;
            }

            public a f(List<String> list) {
                this.f110581c = x.n(list);
                return this;
            }

            public a g(int i11) {
                s7.a.a(i11 >= 0 || i11 == -2147483647);
                if (i11 != -2147483647) {
                    i11 = ((i11 + 50) / 100) * 100;
                }
                this.f110579a = i11;
                return this;
            }
        }

        public void a(com.google.common.collect.h<String, String> hVar) {
            ArrayList arrayList = new ArrayList();
            if (this.f110576a != -2147483647) {
                arrayList.add("rtp=" + this.f110576a);
            }
            if (this.f110577b) {
                arrayList.add("bs");
            }
            arrayList.addAll(this.f110578c);
            if (arrayList.isEmpty()) {
                return;
            }
            hVar.j("CMCD-Status", arrayList);
        }

        private e(a aVar) {
            this.f110576a = aVar.f110579a;
            this.f110577b = aVar.f110580b;
            this.f110578c = aVar.f110581c;
        }
    }

    /* JADX INFO: renamed from: s8.f$f, reason: collision with other inner class name */
    public static final class C2354f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Pattern f110582m = Pattern.compile(".*-.*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s8.e f110583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f110584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t f110585c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f110588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f110589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f110590h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f110592j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f110593k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f110594l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f110586d = -9223372036854775807L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f110587e = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f110591i = -9223372036854775807L;

        public C2354f(s8.e eVar, String str) {
            this.f110583a = eVar;
            this.f110584b = str;
        }

        private static String b(u uVar) {
            String strC = g0.c(uVar.f101540k);
            String strN = g0.n(uVar.f101540k);
            if (strC != null && strN != null) {
                return "av";
            }
            int iK = g0.k(uVar.f101544o);
            if (iK == -1) {
                iK = g0.k(uVar.f101543n);
            }
            if (iK == 1) {
                return "a";
            }
            if (iK == 2) {
                return "v";
            }
            return null;
        }

        private static boolean c(String str) {
            return Objects.equals(str, "m");
        }

        private static boolean d(String str) {
            return Objects.equals(str, "a") || Objects.equals(str, "v") || Objects.equals(str, "av");
        }

        private void o(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                s7.a.h(f110582m.matcher(q0.E1(it.next(), "=")[0]).matches());
            }
        }

        public f a() {
            int iN;
            int iC;
            int iN2;
            boolean zC = c(this.f110592j);
            if (!zC) {
                s7.a.k(this.f110585c, "Track selection must be set");
            }
            if (this.f110592j == null) {
                this.f110592j = b(((t) s7.a.f(this.f110585c)).f());
            }
            boolean zD = d(this.f110592j);
            if (zD) {
                s7.a.i(this.f110586d != -9223372036854775807L, "Buffered duration must be set");
                s7.a.i(this.f110591i != -9223372036854775807L, "Chunk duration must be set");
            }
            y<String, String> yVarB = this.f110583a.f110532c.b();
            d1<String> it = yVarB.r().iterator();
            while (it.hasNext()) {
                o(yVarB.get(it.next()));
            }
            long jO = -2147483647L;
            if (zC) {
                iN = -2147483647;
                iC = -2147483647;
                iN2 = -2147483647;
            } else {
                t tVar = (t) s7.a.f(this.f110585c);
                int iMax = tVar.f().f101539j;
                iN = q0.n(iMax, 1000);
                t0 t0VarE = tVar.e();
                for (int i11 = 0; i11 < t0VarE.f101499a; i11++) {
                    iMax = Math.max(iMax, t0VarE.c(i11).f101539j);
                }
                iN2 = q0.n(iMax, 1000);
                jO = tVar.k() != -2147483647L ? q0.o(tVar.k(), 1000L) : -2147483647L;
                iC = this.f110583a.f110532c.c(iN);
            }
            b.a aVar = new b.a();
            if (this.f110583a.a()) {
                aVar.g(iN);
            }
            if (this.f110583a.q()) {
                aVar.k(iN2);
            }
            if (zD && this.f110583a.j()) {
                aVar.i(q0.O1(this.f110591i));
            }
            if (this.f110583a.k()) {
                aVar.j(this.f110592j);
            }
            if (yVarB.m("CMCD-Object")) {
                aVar.h(yVarB.get("CMCD-Object"));
            }
            c.a aVar2 = new c.a();
            if (zD) {
                if (this.f110583a.b()) {
                    aVar2.i(q0.O1(this.f110586d));
                }
                if (this.f110583a.e()) {
                    aVar2.k(q0.O1((long) (this.f110586d / this.f110587e)));
                }
            }
            if (this.f110583a.g()) {
                aVar2.l(jO);
            }
            if (this.f110583a.n()) {
                aVar2.o(this.f110589g || this.f110590h);
            }
            if (this.f110583a.h()) {
                aVar2.m(this.f110593k);
            }
            if (this.f110583a.i()) {
                aVar2.n(this.f110594l);
            }
            if (yVarB.m("CMCD-Request")) {
                aVar2.j(yVarB.get("CMCD-Request"));
            }
            d.a aVar3 = new d.a();
            if (this.f110583a.d()) {
                aVar3.h(this.f110583a.f110531b);
            }
            if (this.f110583a.m()) {
                aVar3.k(this.f110583a.f110530a);
            }
            if (this.f110583a.p()) {
                aVar3.m(this.f110584b);
            }
            if (this.f110588f != null && this.f110583a.o()) {
                aVar3.l(((Boolean) s7.a.f(this.f110588f)).booleanValue() ? "l" : "v");
            }
            if (this.f110583a.l()) {
                aVar3.j(this.f110587e);
            }
            if (yVarB.m("CMCD-Session")) {
                aVar3.i(yVarB.get("CMCD-Session"));
            }
            e.a aVar4 = new e.a();
            if (this.f110583a.f()) {
                aVar4.g(iC);
            }
            if (this.f110583a.c()) {
                aVar4.e(this.f110589g);
            }
            if (yVarB.m("CMCD-Status")) {
                aVar4.f(yVarB.get("CMCD-Status"));
            }
            return new f(aVar.f(), aVar2.h(), aVar3.g(), aVar4.d(), this.f110583a.f110533d);
        }

        public C2354f e(long j11) {
            s7.a.a(j11 >= 0);
            this.f110586d = j11;
            return this;
        }

        public C2354f f(long j11) {
            s7.a.a(j11 >= 0);
            this.f110591i = j11;
            return this;
        }

        public C2354f g(boolean z11) {
            this.f110589g = z11;
            return this;
        }

        public C2354f h(boolean z11) {
            this.f110590h = z11;
            return this;
        }

        public C2354f i(boolean z11) {
            this.f110588f = Boolean.valueOf(z11);
            return this;
        }

        public C2354f j(String str) {
            this.f110593k = str;
            return this;
        }

        public C2354f k(String str) {
            this.f110594l = str;
            return this;
        }

        public C2354f l(String str) {
            this.f110592j = str;
            return this;
        }

        public C2354f m(float f11) {
            s7.a.a(f11 == -3.4028235E38f || f11 > BitmapDescriptorFactory.HUE_RED);
            this.f110587e = f11;
            return this;
        }

        public C2354f n(t tVar) {
            this.f110585c = tVar;
            return this;
        }
    }

    public static Uri b(Uri uri) {
        return uri.getQueryParameter("CMCD") != null ? k0.e(uri, "CMCD") : uri;
    }

    public v7.j a(v7.j jVar) {
        com.google.common.collect.h<String, String> hVarC = com.google.common.collect.h.C();
        this.f110535a.a(hVarC);
        this.f110536b.a(hVarC);
        this.f110537c.a(hVarC);
        this.f110538d.a(hVarC);
        if (this.f110539e != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hVarC.asMap().values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) it.next());
            }
            Collections.sort(arrayList);
            return jVar.a().i(jVar.f118101a.buildUpon().appendQueryParameter("CMCD", f110534f.d(arrayList)).build()).a();
        }
        z.a aVarB = z.b();
        for (String str : hVarC.i()) {
            List list = hVarC.get(str);
            Collections.sort(list);
            aVarB.f(str, f110534f.d(list));
        }
        return jVar.g(aVarB.c());
    }

    private f(b bVar, c cVar, d dVar, e eVar, int i11) {
        this.f110535a = bVar;
        this.f110536b = cVar;
        this.f110537c = dVar;
        this.f110538d = eVar;
        this.f110539e = i11;
    }
}
