package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements a2 {
    private String A;
    private String B;
    private String C;
    private Float D;
    private Integer E;
    private Double F;
    private String G;
    private String H;
    private Map<String, Object> I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f80919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f80920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f80921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f80922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f80923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f80924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f80925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f80926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Long f80927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f80928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f80929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Long f80930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f80931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Long f80932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f80933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f80934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Float f80935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f80936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Date f80937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TimeZone f80938z;

    public static final class a implements q1<e> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                byte b11 = -1;
                switch (strL.hashCode()) {
                    case -2076227591:
                        if (strL.equals("timezone")) {
                            b11 = 0;
                        }
                        break;
                    case -2012489734:
                        if (strL.equals("boot_time")) {
                            b11 = 1;
                        }
                        break;
                    case -1981332476:
                        if (strL.equals("simulator")) {
                            b11 = 2;
                        }
                        break;
                    case -1969347631:
                        if (strL.equals("manufacturer")) {
                            b11 = 3;
                        }
                        break;
                    case -1608004830:
                        if (strL.equals("processor_count")) {
                            b11 = 4;
                        }
                        break;
                    case -1439500848:
                        if (strL.equals("orientation")) {
                            b11 = 5;
                        }
                        break;
                    case -1410521534:
                        if (strL.equals("battery_temperature")) {
                            b11 = 6;
                        }
                        break;
                    case -1281860764:
                        if (strL.equals("family")) {
                            b11 = 7;
                        }
                        break;
                    case -1097462182:
                        if (strL.equals("locale")) {
                            b11 = 8;
                        }
                        break;
                    case -1012222381:
                        if (strL.equals("online")) {
                            b11 = 9;
                        }
                        break;
                    case -877252910:
                        if (strL.equals("battery_level")) {
                            b11 = 10;
                        }
                        break;
                    case -619038223:
                        if (strL.equals("model_id")) {
                            b11 = 11;
                        }
                        break;
                    case -568274923:
                        if (strL.equals("screen_density")) {
                            b11 = 12;
                        }
                        break;
                    case -417046774:
                        if (strL.equals("screen_dpi")) {
                            b11 = 13;
                        }
                        break;
                    case -136523212:
                        if (strL.equals("free_memory")) {
                            b11 = 14;
                        }
                        break;
                    case 3355:
                        if (strL.equals("id")) {
                            b11 = 15;
                        }
                        break;
                    case 3373707:
                        if (strL.equals("name")) {
                            b11 = Tnaf.POW_2_WIDTH;
                        }
                        break;
                    case 59142220:
                        if (strL.equals("low_memory")) {
                            b11 = 17;
                        }
                        break;
                    case 93076189:
                        if (strL.equals("archs")) {
                            b11 = 18;
                        }
                        break;
                    case 93997959:
                        if (strL.equals("brand")) {
                            b11 = 19;
                        }
                        break;
                    case 104069929:
                        if (strL.equals("model")) {
                            b11 = 20;
                        }
                        break;
                    case 115746789:
                        if (strL.equals("cpu_description")) {
                            b11 = 21;
                        }
                        break;
                    case 244497903:
                        if (strL.equals("processor_frequency")) {
                            b11 = 22;
                        }
                        break;
                    case 731866107:
                        if (strL.equals("connection_type")) {
                            b11 = 23;
                        }
                        break;
                    case 746402966:
                        if (strL.equals("chipset")) {
                            b11 = 24;
                        }
                        break;
                    case 817830969:
                        if (strL.equals("screen_width_pixels")) {
                            b11 = 25;
                        }
                        break;
                    case 823882553:
                        if (strL.equals("external_storage_size")) {
                            b11 = 26;
                        }
                        break;
                    case 897428293:
                        if (strL.equals("storage_size")) {
                            b11 = 27;
                        }
                        break;
                    case 1331465768:
                        if (strL.equals("usable_memory")) {
                            b11 = 28;
                        }
                        break;
                    case 1418777727:
                        if (strL.equals("memory_size")) {
                            b11 = 29;
                        }
                        break;
                    case 1436115569:
                        if (strL.equals("charging")) {
                            b11 = 30;
                        }
                        break;
                    case 1450613660:
                        if (strL.equals("external_free_storage")) {
                            b11 = 31;
                        }
                        break;
                    case 1524159400:
                        if (strL.equals("free_storage")) {
                            b11 = 32;
                        }
                        break;
                    case 1556284978:
                        if (strL.equals("screen_height_pixels")) {
                            b11 = 33;
                        }
                        break;
                }
                switch (b11) {
                    case 0:
                        eVar.f80938z = i3Var.V1(iLogger);
                        break;
                    case 1:
                        if (i3Var.peek() == io.sentry.vendor.gson.stream.b.STRING) {
                            eVar.f80937y = i3Var.m0(iLogger);
                        }
                        break;
                    case 2:
                        eVar.f80924l = i3Var.o0();
                        break;
                    case 3:
                        eVar.f80914b = i3Var.a1();
                        break;
                    case 4:
                        eVar.E = i3Var.N2();
                        break;
                    case 5:
                        eVar.f80923k = (b) i3Var.v0(iLogger, new b.a());
                        break;
                    case 6:
                        eVar.D = i3Var.p1();
                        break;
                    case 7:
                        eVar.f80916d = i3Var.a1();
                        break;
                    case 8:
                        eVar.B = i3Var.a1();
                        break;
                    case 9:
                        eVar.f80922j = i3Var.o0();
                        break;
                    case 10:
                        eVar.f80920h = i3Var.p1();
                        break;
                    case 11:
                        eVar.f80918f = i3Var.a1();
                        break;
                    case 12:
                        eVar.f80935w = i3Var.p1();
                        break;
                    case 13:
                        eVar.f80936x = i3Var.N2();
                        break;
                    case 14:
                        eVar.f80926n = i3Var.R2();
                        break;
                    case 15:
                        eVar.A = i3Var.a1();
                        break;
                    case 16:
                        eVar.f80913a = i3Var.a1();
                        break;
                    case 17:
                        eVar.f80928p = i3Var.o0();
                        break;
                    case 18:
                        List list = (List) i3Var.z3();
                        if (list != null) {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            eVar.f80919g = strArr;
                        }
                        break;
                    case 19:
                        eVar.f80915c = i3Var.a1();
                        break;
                    case 20:
                        eVar.f80917e = i3Var.a1();
                        break;
                    case 21:
                        eVar.G = i3Var.a1();
                        break;
                    case 22:
                        eVar.F = i3Var.j2();
                        break;
                    case 23:
                        eVar.C = i3Var.a1();
                        break;
                    case 24:
                        eVar.H = i3Var.a1();
                        break;
                    case 25:
                        eVar.f80933u = i3Var.N2();
                        break;
                    case 26:
                        eVar.f80931s = i3Var.R2();
                        break;
                    case 27:
                        eVar.f80929q = i3Var.R2();
                        break;
                    case 28:
                        eVar.f80927o = i3Var.R2();
                        break;
                    case 29:
                        eVar.f80925m = i3Var.R2();
                        break;
                    case 30:
                        eVar.f80921i = i3Var.o0();
                        break;
                    case 31:
                        eVar.f80932t = i3Var.R2();
                        break;
                    case 32:
                        eVar.f80930r = i3Var.R2();
                        break;
                    case 33:
                        eVar.f80934v = i3Var.N2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            eVar.q0(concurrentHashMap);
            i3Var.j();
            return eVar;
        }
    }

    public enum b implements a2 {
        PORTRAIT,
        LANDSCAPE;

        public static final class a implements q1<b> {
            @Override // io.sentry.q1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(i3 i3Var, ILogger iLogger) {
                return b.valueOf(i3Var.O().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.a2
        public void serialize(j3 j3Var, ILogger iLogger) {
            j3Var.w(toString().toLowerCase(Locale.ROOT));
        }
    }

    public e() {
    }

    public String I() {
        return this.C;
    }

    public String J() {
        return this.A;
    }

    public String K() {
        return this.B;
    }

    public void L(String[] strArr) {
        this.f80919g = strArr;
    }

    public void M(Float f11) {
        this.f80920h = f11;
    }

    public void N(Float f11) {
        this.D = f11;
    }

    public void O(Date date) {
        this.f80937y = date;
    }

    public void P(String str) {
        this.f80915c = str;
    }

    public void Q(Boolean bool) {
        this.f80921i = bool;
    }

    public void R(String str) {
        this.H = str;
    }

    public void S(String str) {
        this.C = str;
    }

    public void T(Long l11) {
        this.f80932t = l11;
    }

    public void U(Long l11) {
        this.f80931s = l11;
    }

    public void V(String str) {
        this.f80916d = str;
    }

    public void W(Long l11) {
        this.f80926n = l11;
    }

    public void X(Long l11) {
        this.f80930r = l11;
    }

    public void Y(String str) {
        this.A = str;
    }

    public void Z(String str) {
        this.B = str;
    }

    public void a0(Boolean bool) {
        this.f80928p = bool;
    }

    public void b0(String str) {
        this.f80914b = str;
    }

    public void c0(Long l11) {
        this.f80925m = l11;
    }

    public void d0(String str) {
        this.f80917e = str;
    }

    public void e0(String str) {
        this.f80918f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (io.sentry.util.y.a(this.f80913a, eVar.f80913a) && io.sentry.util.y.a(this.f80914b, eVar.f80914b) && io.sentry.util.y.a(this.f80915c, eVar.f80915c) && io.sentry.util.y.a(this.f80916d, eVar.f80916d) && io.sentry.util.y.a(this.f80917e, eVar.f80917e) && io.sentry.util.y.a(this.f80918f, eVar.f80918f) && Arrays.equals(this.f80919g, eVar.f80919g) && io.sentry.util.y.a(this.f80920h, eVar.f80920h) && io.sentry.util.y.a(this.f80921i, eVar.f80921i) && io.sentry.util.y.a(this.f80922j, eVar.f80922j) && this.f80923k == eVar.f80923k && io.sentry.util.y.a(this.f80924l, eVar.f80924l) && io.sentry.util.y.a(this.f80925m, eVar.f80925m) && io.sentry.util.y.a(this.f80926n, eVar.f80926n) && io.sentry.util.y.a(this.f80927o, eVar.f80927o) && io.sentry.util.y.a(this.f80928p, eVar.f80928p) && io.sentry.util.y.a(this.f80929q, eVar.f80929q) && io.sentry.util.y.a(this.f80930r, eVar.f80930r) && io.sentry.util.y.a(this.f80931s, eVar.f80931s) && io.sentry.util.y.a(this.f80932t, eVar.f80932t) && io.sentry.util.y.a(this.f80933u, eVar.f80933u) && io.sentry.util.y.a(this.f80934v, eVar.f80934v) && io.sentry.util.y.a(this.f80935w, eVar.f80935w) && io.sentry.util.y.a(this.f80936x, eVar.f80936x) && io.sentry.util.y.a(this.f80937y, eVar.f80937y) && io.sentry.util.y.a(this.A, eVar.A) && io.sentry.util.y.a(this.B, eVar.B) && io.sentry.util.y.a(this.C, eVar.C) && io.sentry.util.y.a(this.D, eVar.D) && io.sentry.util.y.a(this.E, eVar.E) && io.sentry.util.y.a(this.F, eVar.F) && io.sentry.util.y.a(this.G, eVar.G) && io.sentry.util.y.a(this.H, eVar.H)) {
                return true;
            }
        }
        return false;
    }

    public void f0(Boolean bool) {
        this.f80922j = bool;
    }

    public void g0(b bVar) {
        this.f80923k = bVar;
    }

    public void h0(Integer num) {
        this.E = num;
    }

    public int hashCode() {
        return (io.sentry.util.y.b(this.f80913a, this.f80914b, this.f80915c, this.f80916d, this.f80917e, this.f80918f, this.f80920h, this.f80921i, this.f80922j, this.f80923k, this.f80924l, this.f80925m, this.f80926n, this.f80927o, this.f80928p, this.f80929q, this.f80930r, this.f80931s, this.f80932t, this.f80933u, this.f80934v, this.f80935w, this.f80936x, this.f80937y, this.f80938z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H) * 31) + Arrays.hashCode(this.f80919g);
    }

    public void i0(Double d11) {
        this.F = d11;
    }

    public void j0(Float f11) {
        this.f80935w = f11;
    }

    public void k0(Integer num) {
        this.f80936x = num;
    }

    public void l0(Integer num) {
        this.f80934v = num;
    }

    public void m0(Integer num) {
        this.f80933u = num;
    }

    public void n0(Boolean bool) {
        this.f80924l = bool;
    }

    public void o0(Long l11) {
        this.f80929q = l11;
    }

    public void p0(TimeZone timeZone) {
        this.f80938z = timeZone;
    }

    public void q0(Map<String, Object> map) {
        this.I = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80913a != null) {
            j3Var.N("name").w(this.f80913a);
        }
        if (this.f80914b != null) {
            j3Var.N("manufacturer").w(this.f80914b);
        }
        if (this.f80915c != null) {
            j3Var.N("brand").w(this.f80915c);
        }
        if (this.f80916d != null) {
            j3Var.N("family").w(this.f80916d);
        }
        if (this.f80917e != null) {
            j3Var.N("model").w(this.f80917e);
        }
        if (this.f80918f != null) {
            j3Var.N("model_id").w(this.f80918f);
        }
        if (this.f80919g != null) {
            j3Var.N("archs").V(iLogger, this.f80919g);
        }
        if (this.f80920h != null) {
            j3Var.N("battery_level").U(this.f80920h);
        }
        if (this.f80921i != null) {
            j3Var.N("charging").W(this.f80921i);
        }
        if (this.f80922j != null) {
            j3Var.N("online").W(this.f80922j);
        }
        if (this.f80923k != null) {
            j3Var.N("orientation").V(iLogger, this.f80923k);
        }
        if (this.f80924l != null) {
            j3Var.N("simulator").W(this.f80924l);
        }
        if (this.f80925m != null) {
            j3Var.N("memory_size").U(this.f80925m);
        }
        if (this.f80926n != null) {
            j3Var.N("free_memory").U(this.f80926n);
        }
        if (this.f80927o != null) {
            j3Var.N("usable_memory").U(this.f80927o);
        }
        if (this.f80928p != null) {
            j3Var.N("low_memory").W(this.f80928p);
        }
        if (this.f80929q != null) {
            j3Var.N("storage_size").U(this.f80929q);
        }
        if (this.f80930r != null) {
            j3Var.N("free_storage").U(this.f80930r);
        }
        if (this.f80931s != null) {
            j3Var.N("external_storage_size").U(this.f80931s);
        }
        if (this.f80932t != null) {
            j3Var.N("external_free_storage").U(this.f80932t);
        }
        if (this.f80933u != null) {
            j3Var.N("screen_width_pixels").U(this.f80933u);
        }
        if (this.f80934v != null) {
            j3Var.N("screen_height_pixels").U(this.f80934v);
        }
        if (this.f80935w != null) {
            j3Var.N("screen_density").U(this.f80935w);
        }
        if (this.f80936x != null) {
            j3Var.N("screen_dpi").U(this.f80936x);
        }
        if (this.f80937y != null) {
            j3Var.N("boot_time").V(iLogger, this.f80937y);
        }
        if (this.f80938z != null) {
            j3Var.N("timezone").V(iLogger, this.f80938z);
        }
        if (this.A != null) {
            j3Var.N("id").w(this.A);
        }
        if (this.C != null) {
            j3Var.N("connection_type").w(this.C);
        }
        if (this.D != null) {
            j3Var.N("battery_temperature").U(this.D);
        }
        if (this.B != null) {
            j3Var.N("locale").w(this.B);
        }
        if (this.E != null) {
            j3Var.N("processor_count").U(this.E);
        }
        if (this.F != null) {
            j3Var.N("processor_frequency").U(this.F);
        }
        if (this.G != null) {
            j3Var.N("cpu_description").w(this.G);
        }
        if (this.H != null) {
            j3Var.N("chipset").w(this.H);
        }
        Map<String, Object> map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.I.get(str));
            }
        }
        j3Var.j();
    }

    e(e eVar) {
        this.f80913a = eVar.f80913a;
        this.f80914b = eVar.f80914b;
        this.f80915c = eVar.f80915c;
        this.f80916d = eVar.f80916d;
        this.f80917e = eVar.f80917e;
        this.f80918f = eVar.f80918f;
        this.f80921i = eVar.f80921i;
        this.f80922j = eVar.f80922j;
        this.f80923k = eVar.f80923k;
        this.f80924l = eVar.f80924l;
        this.f80925m = eVar.f80925m;
        this.f80926n = eVar.f80926n;
        this.f80927o = eVar.f80927o;
        this.f80928p = eVar.f80928p;
        this.f80929q = eVar.f80929q;
        this.f80930r = eVar.f80930r;
        this.f80931s = eVar.f80931s;
        this.f80932t = eVar.f80932t;
        this.f80933u = eVar.f80933u;
        this.f80934v = eVar.f80934v;
        this.f80935w = eVar.f80935w;
        this.f80936x = eVar.f80936x;
        this.f80937y = eVar.f80937y;
        this.A = eVar.A;
        this.C = eVar.C;
        this.D = eVar.D;
        this.f80920h = eVar.f80920h;
        String[] strArr = eVar.f80919g;
        this.f80919g = strArr != null ? (String[]) strArr.clone() : null;
        this.B = eVar.B;
        TimeZone timeZone = eVar.f80938z;
        this.f80938z = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.I = io.sentry.util.c.b(eVar.I);
    }
}
