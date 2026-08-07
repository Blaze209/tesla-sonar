package io.sentry.rrweb;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
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
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends b implements a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f81293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f81294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f81295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f81296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f81297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f81298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f81299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f81300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f81301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f81302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f81303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, Object> f81304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, Object> f81305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map<String, Object> f81306r;

    public static final class a implements q1<j> {
        private void c(j jVar, i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals(StatusResponse.PAYLOAD)) {
                    d(jVar, i3Var, iLogger);
                } else if (strL.equals("tag")) {
                    String strA1 = i3Var.a1();
                    if (strA1 == null) {
                        strA1 = "";
                    }
                    jVar.f81291c = strA1;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            jVar.v(concurrentHashMap);
            i3Var.j();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void d(j jVar, i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                byte b11 = -1;
                switch (strL.hashCode()) {
                    case -1992012396:
                        if (strL.equals("duration")) {
                            b11 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strL.equals("segmentId")) {
                            b11 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strL.equals(Snapshot.HEIGHT)) {
                            b11 = 2;
                        }
                        break;
                    case -410956671:
                        if (strL.equals("container")) {
                            b11 = 3;
                        }
                        break;
                    case -296512606:
                        if (strL.equals("frameCount")) {
                            b11 = 4;
                        }
                        break;
                    case 115029:
                        if (strL.equals("top")) {
                            b11 = 5;
                        }
                        break;
                    case 3317767:
                        if (strL.equals("left")) {
                            b11 = 6;
                        }
                        break;
                    case 3530753:
                        if (strL.equals("size")) {
                            b11 = 7;
                        }
                        break;
                    case 113126854:
                        if (strL.equals(Snapshot.WIDTH)) {
                            b11 = 8;
                        }
                        break;
                    case 545057773:
                        if (strL.equals("frameRate")) {
                            b11 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strL.equals("encoding")) {
                            b11 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strL.equals("frameRateType")) {
                            b11 = 11;
                        }
                        break;
                }
                switch (b11) {
                    case 0:
                        jVar.f81294f = i3Var.nextLong();
                        break;
                    case 1:
                        jVar.f81292d = i3Var.nextInt();
                        break;
                    case 2:
                        Integer numN2 = i3Var.N2();
                        jVar.f81297i = numN2 != null ? numN2.intValue() : 0;
                        break;
                    case 3:
                        String strA1 = i3Var.a1();
                        jVar.f81296h = strA1 != null ? strA1 : "";
                        break;
                    case 4:
                        Integer numN3 = i3Var.N2();
                        jVar.f81299k = numN3 != null ? numN3.intValue() : 0;
                        break;
                    case 5:
                        Integer numN4 = i3Var.N2();
                        jVar.f81303o = numN4 != null ? numN4.intValue() : 0;
                        break;
                    case 6:
                        Integer numN5 = i3Var.N2();
                        jVar.f81302n = numN5 != null ? numN5.intValue() : 0;
                        break;
                    case 7:
                        Long lR2 = i3Var.R2();
                        jVar.f81293e = lR2 == null ? 0L : lR2.longValue();
                        break;
                    case 8:
                        Integer numN6 = i3Var.N2();
                        jVar.f81298j = numN6 != null ? numN6.intValue() : 0;
                        break;
                    case 9:
                        Integer numN7 = i3Var.N2();
                        jVar.f81301m = numN7 != null ? numN7.intValue() : 0;
                        break;
                    case 10:
                        String strA2 = i3Var.a1();
                        jVar.f81295g = strA2 != null ? strA2 : "";
                        break;
                    case 11:
                        String strA3 = i3Var.a1();
                        jVar.f81300l = strA3 != null ? strA3 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            jVar.B(concurrentHashMap);
            i3Var.j();
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            j jVar = new j();
            b.a aVar = new b.a();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("data")) {
                    c(jVar, i3Var, iLogger);
                } else if (!aVar.a(jVar, strL, i3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            jVar.F(map);
            i3Var.j();
            return jVar;
        }
    }

    public j() {
        super(c.Custom);
        this.f81295g = "h264";
        this.f81296h = "mp4";
        this.f81300l = "constant";
        this.f81291c = MediaStreamTrack.VIDEO_TRACK_KIND;
    }

    private void t(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("tag").w(this.f81291c);
        j3Var.N(StatusResponse.PAYLOAD);
        u(j3Var, iLogger);
        Map<String, Object> map = this.f81306r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81306r.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    private void u(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("segmentId").D(this.f81292d);
        j3Var.N("size").D(this.f81293e);
        j3Var.N("duration").D(this.f81294f);
        j3Var.N("encoding").w(this.f81295g);
        j3Var.N("container").w(this.f81296h);
        j3Var.N(Snapshot.HEIGHT).D(this.f81297i);
        j3Var.N(Snapshot.WIDTH).D(this.f81298j);
        j3Var.N("frameCount").D(this.f81299k);
        j3Var.N("frameRate").D(this.f81301m);
        j3Var.N("frameRateType").w(this.f81300l);
        j3Var.N("left").D(this.f81302n);
        j3Var.N("top").D(this.f81303o);
        Map<String, Object> map = this.f81305q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81305q.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void A(int i11) {
        this.f81302n = i11;
    }

    public void B(Map<String, Object> map) {
        this.f81305q = map;
    }

    public void C(int i11) {
        this.f81292d = i11;
    }

    public void D(long j11) {
        this.f81293e = j11;
    }

    public void E(int i11) {
        this.f81303o = i11;
    }

    public void F(Map<String, Object> map) {
        this.f81304p = map;
    }

    public void G(int i11) {
        this.f81298j = i11;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f81292d == jVar.f81292d && this.f81293e == jVar.f81293e && this.f81294f == jVar.f81294f && this.f81297i == jVar.f81297i && this.f81298j == jVar.f81298j && this.f81299k == jVar.f81299k && this.f81301m == jVar.f81301m && this.f81302n == jVar.f81302n && this.f81303o == jVar.f81303o && y.a(this.f81291c, jVar.f81291c) && y.a(this.f81295g, jVar.f81295g) && y.a(this.f81296h, jVar.f81296h) && y.a(this.f81300l, jVar.f81300l);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return y.b(Integer.valueOf(super.hashCode()), this.f81291c, Integer.valueOf(this.f81292d), Long.valueOf(this.f81293e), Long.valueOf(this.f81294f), this.f81295g, this.f81296h, Integer.valueOf(this.f81297i), Integer.valueOf(this.f81298j), Integer.valueOf(this.f81299k), this.f81300l, Integer.valueOf(this.f81301m), Integer.valueOf(this.f81302n), Integer.valueOf(this.f81303o));
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new b.C1706b().a(this, j3Var, iLogger);
        j3Var.N("data");
        t(j3Var, iLogger);
        Map<String, Object> map = this.f81304p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81304p.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void v(Map<String, Object> map) {
        this.f81306r = map;
    }

    public void w(long j11) {
        this.f81294f = j11;
    }

    public void x(int i11) {
        this.f81299k = i11;
    }

    public void y(int i11) {
        this.f81301m = i11;
    }

    public void z(int i11) {
        this.f81297i = i11;
    }
}
