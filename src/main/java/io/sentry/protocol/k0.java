package io.sentry.protocol;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Double f80995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Double f80996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f80997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Double f80998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f80999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f81000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<k0> f81001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f81002l;

    public static final class a implements q1<k0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k0 a(i3 i3Var, ILogger iLogger) {
            k0 k0Var = new k0();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "rendering_system":
                        k0Var.f80991a = i3Var.a1();
                        break;
                    case "identifier":
                        k0Var.f80993c = i3Var.a1();
                        break;
                    case "height":
                        k0Var.f80996f = i3Var.j2();
                        break;
                    case "x":
                        k0Var.f80997g = i3Var.j2();
                        break;
                    case "y":
                        k0Var.f80998h = i3Var.j2();
                        break;
                    case "tag":
                        k0Var.f80994d = i3Var.a1();
                        break;
                    case "type":
                        k0Var.f80992b = i3Var.a1();
                        break;
                    case "alpha":
                        k0Var.f81000j = i3Var.j2();
                        break;
                    case "width":
                        k0Var.f80995e = i3Var.j2();
                        break;
                    case "children":
                        k0Var.f81001k = i3Var.G1(iLogger, this);
                        break;
                    case "visibility":
                        k0Var.f80999i = i3Var.a1();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            i3Var.j();
            k0Var.q(map);
            return k0Var;
        }
    }

    public void l(Double d11) {
        this.f81000j = d11;
    }

    public void m(List<k0> list) {
        this.f81001k = list;
    }

    public void n(Double d11) {
        this.f80996f = d11;
    }

    public void o(String str) {
        this.f80993c = str;
    }

    public void p(String str) {
        this.f80992b = str;
    }

    public void q(Map<String, Object> map) {
        this.f81002l = map;
    }

    public void r(String str) {
        this.f80999i = str;
    }

    public void s(Double d11) {
        this.f80995e = d11;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80991a != null) {
            j3Var.N("rendering_system").w(this.f80991a);
        }
        if (this.f80992b != null) {
            j3Var.N("type").w(this.f80992b);
        }
        if (this.f80993c != null) {
            j3Var.N("identifier").w(this.f80993c);
        }
        if (this.f80994d != null) {
            j3Var.N("tag").w(this.f80994d);
        }
        if (this.f80995e != null) {
            j3Var.N(Snapshot.WIDTH).U(this.f80995e);
        }
        if (this.f80996f != null) {
            j3Var.N(Snapshot.HEIGHT).U(this.f80996f);
        }
        if (this.f80997g != null) {
            j3Var.N("x").U(this.f80997g);
        }
        if (this.f80998h != null) {
            j3Var.N("y").U(this.f80998h);
        }
        if (this.f80999i != null) {
            j3Var.N("visibility").w(this.f80999i);
        }
        if (this.f81000j != null) {
            j3Var.N("alpha").U(this.f81000j);
        }
        List<k0> list = this.f81001k;
        if (list != null && !list.isEmpty()) {
            j3Var.N("children").V(iLogger, this.f81001k);
        }
        Map<String, Object> map = this.f81002l;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81002l.get(str));
            }
        }
        j3Var.j();
    }

    public void t(Double d11) {
        this.f80997g = d11;
    }

    public void u(Double d11) {
        this.f80998h = d11;
    }
}
