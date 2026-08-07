package io.sentry;

import java.net.URI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f80288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80289b;

    public b4(q7 q7Var) {
        io.sentry.util.y.c(q7Var, "options is required");
        this.f80288a = q7Var.retrieveParsedDsn();
        this.f80289b = q7Var.getSentryClientName();
    }

    public a4 a() {
        String str;
        URI uriC = this.f80288a.c();
        String string = uriC.resolve(uriC.getPath() + "/envelope/").toString();
        String strA = this.f80288a.a();
        String strB = this.f80288a.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f80289b);
        sb2.append(",sentry_key=");
        sb2.append(strA);
        if (strB == null || strB.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + strB;
        }
        sb2.append(str);
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", this.f80289b);
        map.put("X-Sentry-Auth", string2);
        return new a4(string, map);
    }
}
