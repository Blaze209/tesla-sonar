package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import jn0.t;
import nz.p;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/m;", "Lcom/stripe/android/stripe3ds2/security/d;", "Lr80/c;", "errorReporter", "<init>", "(Lr80/c;)V", "Ljava/security/interfaces/ECPublicKey;", "acsPublicKey", "Ljava/security/interfaces/ECPrivateKey;", "sdkPrivateKey", "", "agreementInfo", "Ljavax/crypto/SecretKey;", "e1", "(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;", "a", "Lr80/c;", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f53952b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/m$a;", "", "<init>", "()V", "", "HASH_ALGO", "Ljava/lang/String;", "", "KEY_LENGTH", "I", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(r80.c errorReporter) {
        s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.d
    public SecretKey e1(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object objB;
        s.k(acsPublicKey, "acsPublicKey");
        s.k(sdkPrivateKey, "sdkPrivateKey");
        s.k(agreementInfo, "agreementInfo");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new nz.k("SHA-256").j(p.a(acsPublicKey, sdkPrivateKey, null), 256, nz.k.o(null), nz.k.k(null), nz.k.k(yz.c.d(agreementInfo)), nz.k.m(256), nz.k.n()));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.errorReporter.Y0(thE);
        }
        Throwable thE2 = jn0.s.e(objB);
        if (thE2 != null) {
            throw new SDKRuntimeException(thE2);
        }
        s.j(objB, "getOrElse(...)");
        return (SecretKey) objB;
    }
}
