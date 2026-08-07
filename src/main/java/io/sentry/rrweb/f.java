package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends d implements a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<b> f81265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f81266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f81267g;

    public static final class a implements q1<f> {
        private void c(f fVar, i3 i3Var, ILogger iLogger) {
            d.a aVar = new d.a();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("pointerId")) {
                    fVar.f81264d = i3Var.nextInt();
                } else if (strL.equals("positions")) {
                    fVar.f81265e = i3Var.G1(iLogger, new b.a());
                } else if (!aVar.a(fVar, strL, i3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            fVar.l(map);
            i3Var.j();
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            f fVar = new f();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("data")) {
                    c(fVar, i3Var, iLogger);
                } else if (!aVar.a(fVar, strL, i3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            fVar.o(map);
            i3Var.j();
            return fVar;
        }
    }

    public static final class b implements a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f81268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f81269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f81270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f81271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, Object> f81272e;

        public static final class a implements q1<b> {
            @Override // io.sentry.q1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(i3 i3Var, ILogger iLogger) {
                i3Var.h();
                b bVar = new b();
                HashMap map = null;
                while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strL = i3Var.L();
                    strL.getClass();
                    switch (strL) {
                        case "x":
                            bVar.f81269b = i3Var.nextFloat();
                            break;
                        case "y":
                            bVar.f81270c = i3Var.nextFloat();
                            break;
                        case "id":
                            bVar.f81268a = i3Var.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f81271d = i3Var.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            i3Var.a3(iLogger, map, strL);
                            break;
                    }
                }
                bVar.h(map);
                i3Var.j();
                return bVar;
            }
        }

        public long e() {
            return this.f81271d;
        }

        public void f(int i11) {
            this.f81268a = i11;
        }

        public void g(long j11) {
            this.f81271d = j11;
        }

        public void h(Map<String, Object> map) {
            this.f81272e = map;
        }

        public void i(float f11) {
            this.f81269b = f11;
        }

        public void j(float f11) {
            this.f81270c = f11;
        }

        @Override // io.sentry.a2
        public void serialize(j3 j3Var, ILogger iLogger) {
            j3Var.h();
            j3Var.N("id").D(this.f81268a);
            j3Var.N("x").E(this.f81269b);
            j3Var.N("y").E(this.f81270c);
            j3Var.N("timeOffset").D(this.f81271d);
            Map<String, Object> map = this.f81272e;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f81272e.get(str);
                    j3Var.N(str);
                    j3Var.V(iLogger, obj);
                }
            }
            j3Var.j();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void k(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new d.c().a(this, j3Var, iLogger);
        List<b> list = this.f81265e;
        if (list != null && !list.isEmpty()) {
            j3Var.N("positions").V(iLogger, this.f81265e);
        }
        j3Var.N("pointerId").D(this.f81264d);
        Map<String, Object> map = this.f81267g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81267g.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void l(Map<String, Object> map) {
        this.f81267g = map;
    }

    public void m(int i11) {
        this.f81264d = i11;
    }

    public void n(List<b> list) {
        this.f81265e = list;
    }

    public void o(Map<String, Object> map) {
        this.f81266f = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new io.sentry.rrweb.b.C1706b().a(this, j3Var, iLogger);
        j3Var.N("data");
        k(j3Var, iLogger);
        Map<String, Object> map = this.f81266f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81266f.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }
}
