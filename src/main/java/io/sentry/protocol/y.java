package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f81082c;

    public static final class a implements q1<y> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            String strO = null;
            String strO2 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("name")) {
                    strO = i3Var.O();
                } else if (strL.equals("version")) {
                    strO2 = i3Var.O();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            i3Var.j();
            if (strO == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(b7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strO2 != null) {
                y yVar = new y(strO, strO2);
                yVar.c(map);
                return yVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.a(b7.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public y(String str, String str2) {
        this.f81080a = (String) io.sentry.util.y.c(str, "name is required.");
        this.f81081b = (String) io.sentry.util.y.c(str2, "version is required.");
    }

    public String a() {
        return this.f81080a;
    }

    public String b() {
        return this.f81081b;
    }

    public void c(Map<String, Object> map) {
        this.f81082c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (Objects.equals(this.f81080a, yVar.f81080a) && Objects.equals(this.f81081b, yVar.f81081b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f81080a, this.f81081b);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("name").w(this.f81080a);
        j3Var.N("version").w(this.f81081b);
        Map<String, Object> map = this.f81082c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81082c.get(str));
            }
        }
        j3Var.j();
    }
}
