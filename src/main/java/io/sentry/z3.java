package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class z3 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f81628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends io.sentry.rrweb.b> f81629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f81630c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f81632b;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            f81632b = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81632b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81632b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[io.sentry.rrweb.d.b.values().length];
            f81631a = iArr2;
            try {
                iArr2[io.sentry.rrweb.d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81631a[io.sentry.rrweb.d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b implements q1<z3> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z3 a(i3 i3Var, ILogger iLogger) {
            z3 z3Var = new z3();
            i3Var.h();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numN2 = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("segment_id")) {
                    numN2 = i3Var.N2();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            i3Var.j();
            i3Var.P(true);
            List list = (List) i3Var.z3();
            i3Var.P(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        io.sentry.util.w wVar = new io.sentry.util.w(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i11 = a.f81632b[cVar.ordinal()];
                                if (i11 == 1) {
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        io.sentry.rrweb.d.b bVar = io.sentry.rrweb.d.b.values()[num.intValue()];
                                        int i12 = a.f81631a[bVar.ordinal()];
                                        if (i12 == 1) {
                                            arrayList.add(new io.sentry.rrweb.e.a().a(wVar, iLogger));
                                        } else if (i12 != 2) {
                                            iLogger.c(b7.DEBUG, "Unsupported rrweb incremental snapshot type %s", bVar);
                                        } else {
                                            arrayList.add(new io.sentry.rrweb.f.a().a(wVar, iLogger));
                                        }
                                    }
                                } else if (i11 == 2) {
                                    arrayList.add(new io.sentry.rrweb.g.a().a(wVar, iLogger));
                                } else if (i11 != 3) {
                                    iLogger.c(b7.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map4 = (Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(new io.sentry.rrweb.i.a().a(wVar, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(new io.sentry.rrweb.j.a().a(wVar, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(new io.sentry.rrweb.a.C1705a().a(wVar, iLogger));
                                                break;
                                            default:
                                                iLogger.c(b7.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z3Var.c(numN2);
            z3Var.b(arrayList);
            z3Var.d(map);
            return z3Var;
        }
    }

    public List<? extends io.sentry.rrweb.b> a() {
        return this.f81629b;
    }

    public void b(List<? extends io.sentry.rrweb.b> list) {
        this.f81629b = list;
    }

    public void c(Integer num) {
        this.f81628a = num;
    }

    public void d(Map<String, Object> map) {
        this.f81630c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z3.class == obj.getClass()) {
            z3 z3Var = (z3) obj;
            if (io.sentry.util.y.a(this.f81628a, z3Var.f81628a) && io.sentry.util.y.a(this.f81629b, z3Var.f81629b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f81628a, this.f81629b);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81628a != null) {
            j3Var.N("segment_id").U(this.f81628a);
        }
        Map<String, Object> map = this.f81630c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81630c.get(str));
            }
        }
        j3Var.j();
        j3Var.P(true);
        if (this.f81628a != null) {
            j3Var.S("\n");
        }
        List<? extends io.sentry.rrweb.b> list = this.f81629b;
        if (list != null) {
            j3Var.V(iLogger, list);
        }
        j3Var.P(false);
    }
}
