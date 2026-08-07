package io.sentry;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class e7 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f80528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80529c;

    public static final class a implements q1<e7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            String strA1 = null;
            Object objZ3 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("type")) {
                    strA1 = i3Var.a1();
                } else if (strL.equals("value")) {
                    objZ3 = i3Var.z3();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            i3Var.j();
            if (strA1 != null) {
                e7 e7Var = new e7(strA1, objZ3);
                e7Var.a(map);
                return e7Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.a(b7.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public e7(String str, Object obj) {
        this.f80527a = str;
        if (obj == null || !str.equals(InquiryField.StringField.TYPE)) {
            this.f80528b = obj;
        } else {
            this.f80528b = obj.toString();
        }
    }

    public void a(Map<String, Object> map) {
        this.f80529c = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("type").V(iLogger, this.f80527a);
        j3Var.N("value").V(iLogger, this.f80528b);
        Map<String, Object> map = this.f80529c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80529c.get(str));
            }
        }
        j3Var.j();
    }
}
