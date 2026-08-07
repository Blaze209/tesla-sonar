package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.l;
import io.sentry.q1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f80412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<g> f80413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80414c;

    public static final class a implements q1<c> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(i3 i3Var, ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            i3Var.h();
            Date dateM0 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("discarded_events")) {
                    arrayList.addAll(i3Var.G1(iLogger, new g.a()));
                } else if (strL.equals("timestamp")) {
                    dateM0 = i3Var.m0(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            i3Var.j();
            if (dateM0 == null) {
                throw c("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            c cVar = new c(dateM0, arrayList);
            cVar.b(map);
            return cVar;
        }
    }

    public c(Date date, List<g> list) {
        this.f80412a = date;
        this.f80413b = list;
    }

    public List<g> a() {
        return this.f80413b;
    }

    public void b(Map<String, Object> map) {
        this.f80414c = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("timestamp").w(l.h(this.f80412a));
        j3Var.N("discarded_events").V(iLogger, this.f80413b);
        Map<String, Object> map = this.f80414c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80414c.get(str));
            }
        }
        j3Var.j();
    }
}
