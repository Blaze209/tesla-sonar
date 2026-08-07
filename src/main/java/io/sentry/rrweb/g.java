package io.sentry.rrweb;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import io.sentry.util.y;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends b implements a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f81275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f81276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f81277g;

    public static final class a implements q1<g> {
        private void c(g gVar, i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "height":
                        Integer numN2 = i3Var.N2();
                        gVar.f81274d = numN2 != null ? numN2.intValue() : 0;
                        break;
                    case "href":
                        String strA1 = i3Var.a1();
                        if (strA1 == null) {
                            strA1 = "";
                        }
                        gVar.f81273c = strA1;
                        break;
                    case "width":
                        Integer numN3 = i3Var.N2();
                        gVar.f81275e = numN3 != null ? numN3.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            gVar.k(concurrentHashMap);
            i3Var.j();
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            g gVar = new g();
            b.a aVar = new b.a();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("data")) {
                    c(gVar, i3Var, iLogger);
                } else if (!aVar.a(gVar, strL, i3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            gVar.m(map);
            i3Var.j();
            return gVar;
        }
    }

    public g() {
        super(c.Meta);
        this.f81273c = "";
    }

    private void j(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("href").w(this.f81273c);
        j3Var.N(Snapshot.HEIGHT).D(this.f81274d);
        j3Var.N(Snapshot.WIDTH).D(this.f81275e);
        Map<String, Object> map = this.f81276f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81276f.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f81274d == gVar.f81274d && this.f81275e == gVar.f81275e && y.a(this.f81273c, gVar.f81273c);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return y.b(Integer.valueOf(super.hashCode()), this.f81273c, Integer.valueOf(this.f81274d), Integer.valueOf(this.f81275e));
    }

    public void k(Map<String, Object> map) {
        this.f81277g = map;
    }

    public void l(int i11) {
        this.f81274d = i11;
    }

    public void m(Map<String, Object> map) {
        this.f81276f = map;
    }

    public void n(int i11) {
        this.f81275e = i11;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new b.C1706b().a(this, j3Var, iLogger);
        j3Var.N("data");
        j(j3Var, iLogger);
        j3Var.j();
    }
}
