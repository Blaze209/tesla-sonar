package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.protocol.b0;
import io.sentry.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<io.sentry.protocol.profiling.b> f81044a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<List<Integer>> f81045b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<b0> f81046c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, io.sentry.protocol.profiling.c> f81047d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f81048e;

    public static final class b implements q1<a> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "frames":
                        List listG1 = i3Var.G1(iLogger, new b0.a());
                        if (listG1 == null) {
                            break;
                        } else {
                            aVar.f81046c = listG1;
                            break;
                        }
                        break;
                    case "stacks":
                        List list = (List) i3Var.v0(iLogger, new c());
                        if (list == null) {
                            break;
                        } else {
                            aVar.f81045b = list;
                            break;
                        }
                        break;
                    case "samples":
                        List listG2 = i3Var.G1(iLogger, new io.sentry.protocol.profiling.b.a());
                        if (listG2 == null) {
                            break;
                        } else {
                            aVar.f81044a = listG2;
                            break;
                        }
                        break;
                    case "thread_metadata":
                        Map mapY2 = i3Var.Y2(iLogger, new io.sentry.protocol.profiling.c.a());
                        if (mapY2 == null) {
                            break;
                        } else {
                            aVar.f81047d = mapY2;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            aVar.e(concurrentHashMap);
            i3Var.j();
            return aVar;
        }
    }

    private static final class c implements q1<List<List<Integer>>> {
        private c() {
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<List<Integer>> a(i3 i3Var, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            i3Var.f();
            while (i3Var.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                i3Var.f();
                while (i3Var.hasNext()) {
                    arrayList2.add(Integer.valueOf(i3Var.nextInt()));
                }
                i3Var.e();
                arrayList.add(arrayList2);
            }
            i3Var.e();
            return arrayList;
        }
    }

    public void e(Map<String, Object> map) {
        this.f81048e = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("samples").V(iLogger, this.f81044a);
        j3Var.N("stacks").V(iLogger, this.f81045b);
        j3Var.N("frames").V(iLogger, this.f81046c);
        j3Var.N("thread_metadata").V(iLogger, this.f81047d);
        Map<String, Object> map = this.f81048e;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81048e.get(str));
            }
        }
        j3Var.j();
    }
}
