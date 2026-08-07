package com.stripe.android.stripe3ds2.security;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/h;", "", "Lcom/stripe/android/stripe3ds2/security/g;", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/security/d;", "dhKeyGenerator", "<init>", "(Lcom/stripe/android/stripe3ds2/security/g;Lcom/stripe/android/stripe3ds2/security/d;)V", "Lr80/c;", "errorReporter", "(Lcom/stripe/android/stripe3ds2/security/g;Lr80/c;)V", "", StatusResponse.PAYLOAD, "Ljava/security/interfaces/ECPublicKey;", "acsPublicKey", "directoryServerId", "a", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/security/g;", "b", "Lcom/stripe/android/stripe3ds2/security/d;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g ephemeralKeyPairGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d dhKeyGenerator;

    private h(g gVar, d dVar) {
        this.ephemeralKeyPairGenerator = gVar;
        this.dhKeyGenerator = dVar;
    }

    public final String a(String payload, ECPublicKey acsPublicKey, String directoryServerId) {
        s.k(payload, "payload");
        s.k(acsPublicKey, "acsPublicKey");
        s.k(directoryServerId, "directoryServerId");
        zz.a.e(payload);
        KeyPair keyPairGenerate = this.ephemeralKeyPairGenerator.generate();
        d dVar = this.dhKeyGenerator;
        PrivateKey privateKey = keyPairGenerate.getPrivate();
        s.i(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        SecretKey secretKeyE1 = dVar.e1(acsPublicKey, (ECPrivateKey) privateKey, directoryServerId);
        qz.a aVar = qz.a.f106204d;
        PublicKey publicKey = keyPairGenerate.getPublic();
        s.i(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        jz.m mVar = new jz.m(new jz.l.a(jz.h.f84475l, jz.d.f84444e).i(qz.b.v(new qz.b.a(aVar, (ECPublicKey) publicKey).a().n())).d(), new jz.s(payload));
        mVar.g(new kz.b(secretKeyE1));
        String strR = mVar.r();
        s.j(strR, "serialize(...)");
        return strR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(g ephemeralKeyPairGenerator, r80.c errorReporter) {
        this(ephemeralKeyPairGenerator, new m(errorReporter));
        s.k(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        s.k(errorReporter, "errorReporter");
    }
}
