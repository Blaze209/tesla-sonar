package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f81057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f81058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f81059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f81060e;

    public static final class a implements q1<q> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(i3 i3Var, ILogger iLogger) {
            q qVar = new q();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "sdk_name":
                        qVar.f81056a = i3Var.a1();
                        break;
                    case "version_patchlevel":
                        qVar.f81059d = i3Var.N2();
                        break;
                    case "version_major":
                        qVar.f81057b = i3Var.N2();
                        break;
                    case "version_minor":
                        qVar.f81058c = i3Var.N2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            i3Var.j();
            qVar.e(map);
            return qVar;
        }
    }

    public void e(Map<String, Object> map) {
        this.f81060e = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81056a != null) {
            j3Var.N("sdk_name").w(this.f81056a);
        }
        if (this.f81057b != null) {
            j3Var.N("version_major").U(this.f81057b);
        }
        if (this.f81058c != null) {
            j3Var.N("version_minor").U(this.f81058c);
        }
        if (this.f81059d != null) {
            j3Var.N("version_patchlevel").U(this.f81059d);
        }
        Map<String, Object> map = this.f81060e;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81060e.get(str));
            }
        }
        j3Var.j();
    }
}
