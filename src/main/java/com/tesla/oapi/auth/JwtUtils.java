package com.tesla.oapi.auth;

import com.tesla.logging.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/oapi/auth/JwtUtils;", "", "<init>", "()V", "", "token", "Lcom/auth0/android/jwt/d;", "createOrNull", "(Ljava/lang/String;)Lcom/auth0/android/jwt/d;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JwtUtils {
    public static final JwtUtils INSTANCE = new JwtUtils();

    private JwtUtils() {
    }

    public final com.auth0.android.jwt.d createOrNull(String token) {
        s.k(token, "token");
        try {
            return new com.auth0.android.jwt.d(token);
        } catch (Exception e11) {
            g.INSTANCE.a("JwtUtils").d("fail to create JWT", e11);
            return null;
        }
    }
}
