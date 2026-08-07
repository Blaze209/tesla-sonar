package com.stripe.android.stripe3ds2.security;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.security.interfaces.RSAPublicKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/j;", "", "<init>", "()V", "", StatusResponse.PAYLOAD, "Ljava/security/interfaces/RSAPublicKey;", "publicKey", "keyId", "b", "(Ljava/lang/String;Ljava/security/interfaces/RSAPublicKey;Ljava/lang/String;)Ljava/lang/String;", "Ljz/m;", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljz/m;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j {
    public final jz.m a(String payload, String keyId) {
        s.k(payload, "payload");
        return new jz.m(new jz.l.a(jz.h.f84469f, jz.d.f84444e).m(keyId).d(), new jz.s(payload));
    }

    public final String b(String payload, RSAPublicKey publicKey, String keyId) {
        s.k(payload, "payload");
        s.k(publicKey, "publicKey");
        jz.m mVarA = a(payload, keyId);
        mVarA.g(new kz.e(publicKey));
        String strR = mVarA.r();
        s.j(strR, "serialize(...)");
        return strR;
    }
}
