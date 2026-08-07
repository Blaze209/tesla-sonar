package io.sentry;

import java.net.URI;

/* JADX INFO: loaded from: classes9.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f81490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f81491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f81492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f81493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final URI f81494e;

    v(String str) {
        try {
            io.sentry.util.y.c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.f81493d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f81492c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f81491b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f81490a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String str3 = strSubstring;
            this.f81494e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), str3 + "api/" + strSubstring2, null, null);
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    public String a() {
        return this.f81493d;
    }

    public String b() {
        return this.f81492c;
    }

    URI c() {
        return this.f81494e;
    }
}
