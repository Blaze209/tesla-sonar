package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.c7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f80870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f80871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<Integer> f80873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f80876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f80877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f80878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f80879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f80880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f80881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f80882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f80883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f80884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f80885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f80886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f80887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f80888s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f80889t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map<String, Object> f80890u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f80891v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c7 f80892w;

    public static final class a implements q1<b0> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(i3 i3Var, ILogger iLogger) {
            b0 b0Var = new b0();
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                byte b11 = -1;
                switch (strL.hashCode()) {
                    case -1641491184:
                        if (strL.equals("post_context")) {
                            b11 = 0;
                        }
                        break;
                    case -1443345323:
                        if (strL.equals("image_addr")) {
                            b11 = 1;
                        }
                        break;
                    case -1184392185:
                        if (strL.equals("in_app")) {
                            b11 = 2;
                        }
                        break;
                    case -1113875953:
                        if (strL.equals("raw_function")) {
                            b11 = 3;
                        }
                        break;
                    case -1102671691:
                        if (strL.equals("lineno")) {
                            b11 = 4;
                        }
                        break;
                    case -1068784020:
                        if (strL.equals("module")) {
                            b11 = 5;
                        }
                        break;
                    case -1052618729:
                        if (strL.equals("native")) {
                            b11 = 6;
                        }
                        break;
                    case -887523944:
                        if (strL.equals("symbol")) {
                            b11 = 7;
                        }
                        break;
                    case -807062458:
                        if (strL.equals("package")) {
                            b11 = 8;
                        }
                        break;
                    case -734768633:
                        if (strL.equals("filename")) {
                            b11 = 9;
                        }
                        break;
                    case -330260936:
                        if (strL.equals("symbol_addr")) {
                            b11 = 10;
                        }
                        break;
                    case 3327275:
                        if (strL.equals("lock")) {
                            b11 = 11;
                        }
                        break;
                    case 3612204:
                        if (strL.equals("vars")) {
                            b11 = 12;
                        }
                        break;
                    case 94842689:
                        if (strL.equals("colno")) {
                            b11 = 13;
                        }
                        break;
                    case 410194178:
                        if (strL.equals("instruction_addr")) {
                            b11 = 14;
                        }
                        break;
                    case 822688787:
                        if (strL.equals("pre_context")) {
                            b11 = 15;
                        }
                        break;
                    case 868820273:
                        if (strL.equals("addr_mode")) {
                            b11 = Tnaf.POW_2_WIDTH;
                        }
                        break;
                    case 1116694660:
                        if (strL.equals("context_line")) {
                            b11 = 17;
                        }
                        break;
                    case 1380938712:
                        if (strL.equals("function")) {
                            b11 = 18;
                        }
                        break;
                    case 1713445842:
                        if (strL.equals("abs_path")) {
                            b11 = 19;
                        }
                        break;
                    case 1874684019:
                        if (strL.equals("platform")) {
                            b11 = 20;
                        }
                        break;
                }
                switch (b11) {
                    case 0:
                        b0Var.f80871b = (List) i3Var.z3();
                        break;
                    case 1:
                        b0Var.f80885p = i3Var.a1();
                        break;
                    case 2:
                        b0Var.f80881l = i3Var.o0();
                        break;
                    case 3:
                        b0Var.f80891v = i3Var.a1();
                        break;
                    case 4:
                        b0Var.f80877h = i3Var.N2();
                        break;
                    case 5:
                        b0Var.f80876g = i3Var.a1();
                        break;
                    case 6:
                        b0Var.f80883n = i3Var.o0();
                        break;
                    case 7:
                        b0Var.f80889t = i3Var.a1();
                        break;
                    case 8:
                        b0Var.f80882m = i3Var.a1();
                        break;
                    case 9:
                        b0Var.f80874e = i3Var.a1();
                        break;
                    case 10:
                        b0Var.f80886q = i3Var.a1();
                        break;
                    case 11:
                        b0Var.f80892w = (c7) i3Var.v0(iLogger, new c7.a());
                        break;
                    case 12:
                        b0Var.f80872c = (Map) i3Var.z3();
                        break;
                    case 13:
                        b0Var.f80878i = i3Var.N2();
                        break;
                    case 14:
                        b0Var.f80887r = i3Var.a1();
                        break;
                    case 15:
                        b0Var.f80870a = (List) i3Var.z3();
                        break;
                    case 16:
                        b0Var.f80888s = i3Var.a1();
                        break;
                    case 17:
                        b0Var.f80880k = i3Var.a1();
                        break;
                    case 18:
                        b0Var.f80875f = i3Var.a1();
                        break;
                    case 19:
                        b0Var.f80879j = i3Var.a1();
                        break;
                    case 20:
                        b0Var.f80884o = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            b0Var.H(concurrentHashMap);
            i3Var.j();
            return b0Var;
        }
    }

    public void A(String str) {
        this.f80887r = str;
    }

    public void B(Integer num) {
        this.f80877h = num;
    }

    public void C(c7 c7Var) {
        this.f80892w = c7Var;
    }

    public void D(String str) {
        this.f80876g = str;
    }

    public void E(Boolean bool) {
        this.f80883n = bool;
    }

    public void F(String str) {
        this.f80882m = str;
    }

    public void G(String str) {
        this.f80884o = str;
    }

    public void H(Map<String, Object> map) {
        this.f80890u = map;
    }

    public boolean equals(Object obj) {
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.f80870a, b0Var.f80870a) && Objects.equals(this.f80871b, b0Var.f80871b) && Objects.equals(this.f80872c, b0Var.f80872c) && Objects.equals(this.f80873d, b0Var.f80873d) && Objects.equals(this.f80874e, b0Var.f80874e) && Objects.equals(this.f80875f, b0Var.f80875f) && Objects.equals(this.f80876g, b0Var.f80876g) && Objects.equals(this.f80877h, b0Var.f80877h) && Objects.equals(this.f80878i, b0Var.f80878i) && Objects.equals(this.f80879j, b0Var.f80879j) && Objects.equals(this.f80880k, b0Var.f80880k) && Objects.equals(this.f80881l, b0Var.f80881l) && Objects.equals(this.f80882m, b0Var.f80882m) && Objects.equals(this.f80883n, b0Var.f80883n) && Objects.equals(this.f80884o, b0Var.f80884o) && Objects.equals(this.f80885p, b0Var.f80885p) && Objects.equals(this.f80886q, b0Var.f80886q) && Objects.equals(this.f80887r, b0Var.f80887r) && Objects.equals(this.f80888s, b0Var.f80888s) && Objects.equals(this.f80889t, b0Var.f80889t) && Objects.equals(this.f80890u, b0Var.f80890u) && Objects.equals(this.f80891v, b0Var.f80891v) && Objects.equals(this.f80892w, b0Var.f80892w)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f80870a, this.f80871b, this.f80872c, this.f80873d, this.f80874e, this.f80875f, this.f80876g, this.f80877h, this.f80878i, this.f80879j, this.f80880k, this.f80881l, this.f80882m, this.f80883n, this.f80884o, this.f80885p, this.f80886q, this.f80887r, this.f80888s, this.f80889t, this.f80890u, this.f80891v, this.f80892w);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80874e != null) {
            j3Var.N("filename").w(this.f80874e);
        }
        if (this.f80875f != null) {
            j3Var.N("function").w(this.f80875f);
        }
        if (this.f80876g != null) {
            j3Var.N("module").w(this.f80876g);
        }
        if (this.f80877h != null) {
            j3Var.N("lineno").U(this.f80877h);
        }
        if (this.f80878i != null) {
            j3Var.N("colno").U(this.f80878i);
        }
        if (this.f80879j != null) {
            j3Var.N("abs_path").w(this.f80879j);
        }
        if (this.f80880k != null) {
            j3Var.N("context_line").w(this.f80880k);
        }
        if (this.f80881l != null) {
            j3Var.N("in_app").W(this.f80881l);
        }
        if (this.f80882m != null) {
            j3Var.N("package").w(this.f80882m);
        }
        if (this.f80883n != null) {
            j3Var.N("native").W(this.f80883n);
        }
        if (this.f80884o != null) {
            j3Var.N("platform").w(this.f80884o);
        }
        if (this.f80885p != null) {
            j3Var.N("image_addr").w(this.f80885p);
        }
        if (this.f80886q != null) {
            j3Var.N("symbol_addr").w(this.f80886q);
        }
        if (this.f80887r != null) {
            j3Var.N("instruction_addr").w(this.f80887r);
        }
        if (this.f80888s != null) {
            j3Var.N("addr_mode").w(this.f80888s);
        }
        if (this.f80891v != null) {
            j3Var.N("raw_function").w(this.f80891v);
        }
        if (this.f80889t != null) {
            j3Var.N("symbol").w(this.f80889t);
        }
        if (this.f80892w != null) {
            j3Var.N("lock").V(iLogger, this.f80892w);
        }
        List<String> list = this.f80870a;
        if (list != null && !list.isEmpty()) {
            j3Var.N("pre_context").V(iLogger, this.f80870a);
        }
        List<String> list2 = this.f80871b;
        if (list2 != null && !list2.isEmpty()) {
            j3Var.N("post_context").V(iLogger, this.f80871b);
        }
        Map<String, Object> map = this.f80872c;
        if (map != null && !map.isEmpty()) {
            j3Var.N("vars").V(iLogger, this.f80872c);
        }
        Map<String, Object> map2 = this.f80890u;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.f80890u.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public String v() {
        return this.f80876g;
    }

    public void w(String str) {
        this.f80888s = str;
    }

    public void x(String str) {
        this.f80874e = str;
    }

    public void y(String str) {
        this.f80875f = str;
    }

    public void z(Boolean bool) {
        this.f80881l = bool;
    }
}
