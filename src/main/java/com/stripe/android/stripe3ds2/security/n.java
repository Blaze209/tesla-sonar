package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/n;", "Lcom/stripe/android/stripe3ds2/security/g;", "Lr80/c;", "errorReporter", "<init>", "(Lr80/c;)V", "Ljava/security/KeyPair;", "generate", "()Ljava/security/KeyPair;", "a", "Lr80/c;", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f53954b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53955c = com.stripe.android.stripe3ds2.security.a.EC.getKey();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/n$a;", "", "<init>", "()V", "", "ALGORITHM", "Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n(r80.c errorReporter) {
        s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.security.g
    public KeyPair generate() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f53955c);
            keyPairGenerator.initialize(new ECGenParameterSpec(qz.a.f106204d.c()));
            objB = jn0.s.b(keyPairGenerator.generateKeyPair());
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
        return (KeyPair) objB;
    }
}
