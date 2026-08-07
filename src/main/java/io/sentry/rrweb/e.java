package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends d implements a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f81256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f81257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f81258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f81259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f81260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f81261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f81262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f81263k;

    public static final class a implements q1<e> {
        private void c(e eVar, i3 i3Var, ILogger iLogger) {
            d.a aVar = new d.a();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "x":
                        eVar.f81258f = i3Var.nextFloat();
                        break;
                    case "y":
                        eVar.f81259g = i3Var.nextFloat();
                        break;
                    case "id":
                        eVar.f81257e = i3Var.nextInt();
                        break;
                    case "type":
                        eVar.f81256d = (b) i3Var.v0(iLogger, new b.a());
                        break;
                    case "pointerType":
                        eVar.f81260h = i3Var.nextInt();
                        break;
                    case "pointerId":
                        eVar.f81261i = i3Var.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, strL, i3Var, iLogger)) {
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
            eVar.p(map);
            i3Var.j();
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            e eVar = new e();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("data")) {
                    c(eVar, i3Var, iLogger);
                } else if (!aVar.a(eVar, strL, i3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            eVar.t(map);
            i3Var.j();
            return eVar;
        }
    }

    public enum b implements a2 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements q1<b> {
            @Override // io.sentry.q1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(i3 i3Var, ILogger iLogger) {
                return b.values()[i3Var.nextInt()];
            }
        }

        @Override // io.sentry.a2
        public void serialize(j3 j3Var, ILogger iLogger) {
            j3Var.D(ordinal());
        }
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f81260h = 2;
    }

    private void o(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new d.c().a(this, j3Var, iLogger);
        j3Var.N("type").V(iLogger, this.f81256d);
        j3Var.N("id").D(this.f81257e);
        j3Var.N("x").E(this.f81258f);
        j3Var.N("y").E(this.f81259g);
        j3Var.N("pointerType").D(this.f81260h);
        j3Var.N("pointerId").D(this.f81261i);
        Map<String, Object> map = this.f81263k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81263k.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void p(Map<String, Object> map) {
        this.f81263k = map;
    }

    public void q(int i11) {
        this.f81257e = i11;
    }

    public void r(b bVar) {
        this.f81256d = bVar;
    }

    public void s(int i11) {
        this.f81261i = i11;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new io.sentry.rrweb.b.C1706b().a(this, j3Var, iLogger);
        j3Var.N("data");
        o(j3Var, iLogger);
        Map<String, Object> map = this.f81262j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81262j.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void t(Map<String, Object> map) {
        this.f81262j = map;
    }

    public void u(float f11) {
        this.f81258f = f11;
    }

    public void v(float f11) {
        this.f81259g = f11;
    }
}
