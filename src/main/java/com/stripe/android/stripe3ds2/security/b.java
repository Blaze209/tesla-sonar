package com.stripe.android.stripe3ds2.security;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ1\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/b;", "Lcom/stripe/android/stripe3ds2/security/i;", "Lcom/stripe/android/stripe3ds2/security/j;", "jweRsaEncrypter", "Lcom/stripe/android/stripe3ds2/security/h;", "jweEcEncrypter", "Lr80/c;", "errorReporter", "<init>", "(Lcom/stripe/android/stripe3ds2/security/j;Lcom/stripe/android/stripe3ds2/security/h;Lr80/c;)V", "Lcom/stripe/android/stripe3ds2/security/g;", "ephemeralKeyPairGenerator", "(Lcom/stripe/android/stripe3ds2/security/g;Lr80/c;)V", "", StatusResponse.PAYLOAD, "Ljava/security/PublicKey;", "acsPublicKey", "directoryServerId", "keyId", "a", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/security/j;", "b", "Lcom/stripe/android/stripe3ds2/security/h;", "c", "Lr80/c;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jweRsaEncrypter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h jweEcEncrypter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    private b(j jVar, h hVar, r80.c cVar) {
        this.jweRsaEncrypter = jVar;
        this.jweEcEncrypter = hVar;
        this.errorReporter = cVar;
    }

    @Override // com.stripe.android.stripe3ds2.security.i
    public String a(String payload, PublicKey acsPublicKey, String directoryServerId, String keyId) {
        Object objB;
        s.k(payload, "payload");
        s.k(acsPublicKey, "acsPublicKey");
        s.k(directoryServerId, "directoryServerId");
        if (acsPublicKey instanceof RSAPublicKey) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(this.jweRsaEncrypter.b(payload, (RSAPublicKey) acsPublicKey, keyId));
        } else if (acsPublicKey instanceof ECPublicKey) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(this.jweEcEncrypter.a(payload, (ECPublicKey) acsPublicKey, directoryServerId));
        } else {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(new SDKRuntimeException("Unsupported public key algorithm: " + acsPublicKey.getAlgorithm(), null, 2, null)));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.errorReporter.Y0(thE);
        }
        t.b(objB);
        return (String) objB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g ephemeralKeyPairGenerator, r80.c errorReporter) {
        this(new j(), new h(ephemeralKeyPairGenerator, errorReporter), errorReporter);
        s.k(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        s.k(errorReporter, "errorReporter");
    }
}
