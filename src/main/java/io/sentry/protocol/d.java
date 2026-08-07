package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f80899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DebugImage> f80900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80901c;

    public static final class a implements q1<d> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(i3 i3Var, ILogger iLogger) {
            d dVar = new d();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("images")) {
                    dVar.f80900b = i3Var.G1(iLogger, new DebugImage.a());
                } else if (strL.equals("sdk_info")) {
                    dVar.f80899a = (q) i3Var.v0(iLogger, new q.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            i3Var.j();
            dVar.f(map);
            return dVar;
        }
    }

    public static d c(d dVar, q7 q7Var) {
        ArrayList arrayList = new ArrayList();
        if (q7Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(q7Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : q7Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            dVar = new d();
        }
        if (dVar.d() == null) {
            dVar.e(arrayList);
            return dVar;
        }
        dVar.d().addAll(arrayList);
        return dVar;
    }

    public List<DebugImage> d() {
        return this.f80900b;
    }

    public void e(List<DebugImage> list) {
        this.f80900b = list != null ? new ArrayList(list) : null;
    }

    public void f(Map<String, Object> map) {
        this.f80901c = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80899a != null) {
            j3Var.N("sdk_info").V(iLogger, this.f80899a);
        }
        if (this.f80900b != null) {
            j3Var.N("images").V(iLogger, this.f80900b);
        }
        Map<String, Object> map = this.f80901c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80901c.get(str));
            }
        }
        j3Var.j();
    }
}
