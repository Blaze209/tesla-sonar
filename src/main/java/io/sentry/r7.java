package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class r7 extends i5 implements a2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private File f81164p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f81168t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Date f81170v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Map<String, Object> f81174z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.sentry.protocol.x f81167s = new io.sentry.protocol.x();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f81165q = "replay_event";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f81166r = b.SESSION;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<String> f81172x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<String> f81173y = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<String> f81171w = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Date f81169u = l.d();

    public static final class a implements q1<r7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r7 a(i3 i3Var, ILogger iLogger) {
            i5.a aVar = new i5.a();
            r7 r7Var = new r7();
            i3Var.h();
            String strA1 = null;
            b bVar = null;
            Integer numN2 = null;
            Date dateM0 = null;
            HashMap map = null;
            io.sentry.protocol.x xVar = null;
            Date dateM1 = null;
            List<String> list = null;
            List<String> list2 = null;
            List<String> list3 = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "replay_id":
                        xVar = (io.sentry.protocol.x) i3Var.v0(iLogger, new io.sentry.protocol.x.a());
                        break;
                    case "replay_start_timestamp":
                        dateM1 = i3Var.m0(iLogger);
                        break;
                    case "type":
                        strA1 = i3Var.a1();
                        break;
                    case "urls":
                        list = (List) i3Var.z3();
                        break;
                    case "timestamp":
                        dateM0 = i3Var.m0(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) i3Var.z3();
                        break;
                    case "trace_ids":
                        list3 = (List) i3Var.z3();
                        break;
                    case "replay_type":
                        bVar = (b) i3Var.v0(iLogger, new b.a());
                        break;
                    case "segment_id":
                        numN2 = i3Var.N2();
                        break;
                    default:
                        if (!aVar.a(r7Var, strL, i3Var, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            i3Var.a3(iLogger, map, strL);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            i3Var.j();
            if (strA1 != null) {
                r7Var.p0(strA1);
            }
            if (bVar != null) {
                r7Var.l0(bVar);
            }
            if (numN2 != null) {
                r7Var.m0(numN2.intValue());
            }
            if (dateM0 != null) {
                r7Var.n0(dateM0);
            }
            r7Var.j0(xVar);
            r7Var.k0(dateM1);
            r7Var.r0(list);
            r7Var.i0(list2);
            r7Var.o0(list3);
            r7Var.q0(map);
            return r7Var;
        }
    }

    public enum b implements a2 {
        SESSION,
        BUFFER;

        public static final class a implements q1<b> {
            @Override // io.sentry.q1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(i3 i3Var, ILogger iLogger) {
                return b.valueOf(i3Var.O().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.a2
        public void serialize(j3 j3Var, ILogger iLogger) {
            j3Var.w(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r7.class == obj.getClass()) {
            r7 r7Var = (r7) obj;
            if (this.f81168t == r7Var.f81168t && io.sentry.util.y.a(this.f81165q, r7Var.f81165q) && this.f81166r == r7Var.f81166r && io.sentry.util.y.a(this.f81167s, r7Var.f81167s) && io.sentry.util.y.a(this.f81171w, r7Var.f81171w) && io.sentry.util.y.a(this.f81172x, r7Var.f81172x) && io.sentry.util.y.a(this.f81173y, r7Var.f81173y)) {
                return true;
            }
        }
        return false;
    }

    public Date g0() {
        return this.f81169u;
    }

    public File h0() {
        return this.f81164p;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f81165q, this.f81166r, this.f81167s, Integer.valueOf(this.f81168t), this.f81171w, this.f81172x, this.f81173y);
    }

    public void i0(List<String> list) {
        this.f81172x = list;
    }

    public void j0(io.sentry.protocol.x xVar) {
        this.f81167s = xVar;
    }

    public void k0(Date date) {
        this.f81170v = date;
    }

    public void l0(b bVar) {
        this.f81166r = bVar;
    }

    public void m0(int i11) {
        this.f81168t = i11;
    }

    public void n0(Date date) {
        this.f81169u = date;
    }

    public void o0(List<String> list) {
        this.f81173y = list;
    }

    public void p0(String str) {
        this.f81165q = str;
    }

    public void q0(Map<String, Object> map) {
        this.f81174z = map;
    }

    public void r0(List<String> list) {
        this.f81171w = list;
    }

    public void s0(File file) {
        this.f81164p = file;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("type").w(this.f81165q);
        j3Var.N("replay_type").V(iLogger, this.f81166r);
        j3Var.N("segment_id").D(this.f81168t);
        j3Var.N("timestamp").V(iLogger, this.f81169u);
        if (this.f81167s != null) {
            j3Var.N("replay_id").V(iLogger, this.f81167s);
        }
        if (this.f81170v != null) {
            j3Var.N("replay_start_timestamp").V(iLogger, this.f81170v);
        }
        if (this.f81171w != null) {
            j3Var.N("urls").V(iLogger, this.f81171w);
        }
        if (this.f81172x != null) {
            j3Var.N("error_ids").V(iLogger, this.f81172x);
        }
        if (this.f81173y != null) {
            j3Var.N("trace_ids").V(iLogger, this.f81173y);
        }
        new i5.b().a(this, j3Var, iLogger);
        Map<String, Object> map = this.f81174z;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81174z.get(str));
            }
        }
        j3Var.j();
    }
}
