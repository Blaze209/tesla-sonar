package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/f;", "", "Lr80/c;", "errorReporter", "<init>", "(Lr80/c;)V", "", "publicKeyEncoded", "Ljava/security/interfaces/ECPublicKey;", "b", "([B)Ljava/security/interfaces/ECPublicKey;", "privateKeyEncoded", "Ljava/security/interfaces/ECPrivateKey;", "a", "([B)Ljava/security/interfaces/ECPrivateKey;", "Lr80/c;", "Ljava/security/KeyFactory;", "Ljava/security/KeyFactory;", "keyFactory", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final KeyFactory keyFactory;

    public f(r80.c errorReporter) {
        Object objB;
        s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(KeyFactory.getInstance("EC"));
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
        this.keyFactory = (KeyFactory) objB;
    }

    public final ECPrivateKey a(byte[] privateKeyEncoded) {
        Object objB;
        s.k(privateKeyEncoded, "privateKeyEncoded");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            PrivateKey privateKeyGeneratePrivate = this.keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
            s.i(privateKeyGeneratePrivate, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            objB = jn0.s.b((ECPrivateKey) privateKeyGeneratePrivate);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE == null) {
            return (ECPrivateKey) objB;
        }
        throw new SDKRuntimeException(thE);
    }

    public final ECPublicKey b(byte[] publicKeyEncoded) {
        Object objB;
        s.k(publicKeyEncoded, "publicKeyEncoded");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            PublicKey publicKeyGeneratePublic = this.keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
            s.i(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            objB = jn0.s.b((ECPublicKey) publicKeyGeneratePublic);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.errorReporter.Y0(thE);
        }
        Throwable thE2 = jn0.s.e(objB);
        if (thE2 == null) {
            return (ECPublicKey) objB;
        }
        throw new SDKRuntimeException(thE2);
    }
}
