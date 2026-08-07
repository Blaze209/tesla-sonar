package ld0;

import nc0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lld0/a;", "", "<init>", "()V", "", "value", "Lnc0/e;", "a", "(Ljava/lang/String;)Lnc0/e;", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f89946a = new a();

    private a() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final e a(String value) {
        s.k(value, "value");
        switch (value.hashCode()) {
            case -531492226:
                if (value.equals("OPTIONS")) {
                    return e.OPTIONS;
                }
                return null;
            case 70454:
                if (value.equals("GET")) {
                    return e.GET;
                }
                return null;
            case 79599:
                if (value.equals("PUT")) {
                    return e.PUT;
                }
                return null;
            case 2213344:
                if (value.equals("HEAD")) {
                    return e.HEAD;
                }
                return null;
            case 2461856:
                if (value.equals("POST")) {
                    return e.POST;
                }
                return null;
            case 75900968:
                if (value.equals("PATCH")) {
                    return e.PATCH;
                }
                return null;
            case 80083237:
                if (value.equals("TRACE")) {
                    return e.TRACE;
                }
                return null;
            case 1669334218:
                if (value.equals("CONNECT")) {
                    return e.CONNECT;
                }
                return null;
            case 2012838315:
                if (value.equals("DELETE")) {
                    return e.DELETE;
                }
                return null;
            default:
                return null;
        }
    }
}
