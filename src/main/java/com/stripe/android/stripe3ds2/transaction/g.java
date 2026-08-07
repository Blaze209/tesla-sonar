package com.stripe.android.stripe3ds2.transaction;

import javax.crypto.SecretKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/g;", "", "Ljavax/crypto/SecretKey;", "secretKey", "Lcom/stripe/android/stripe3ds2/transaction/f;", "a", "(Ljavax/crypto/SecretKey;)Lcom/stripe/android/stripe3ds2/transaction/f;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/g$a;", "Lcom/stripe/android/stripe3ds2/transaction/g;", "Lcom/stripe/android/stripe3ds2/security/k;", "messageTransformer", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "creqExecutorConfig", "<init>", "(Lcom/stripe/android/stripe3ds2/security/k;Lr80/c;Lcom/stripe/android/stripe3ds2/transaction/c$a;)V", "Ljavax/crypto/SecretKey;", "secretKey", "Lcom/stripe/android/stripe3ds2/transaction/f$a;", "b", "(Ljavax/crypto/SecretKey;)Lcom/stripe/android/stripe3ds2/transaction/f$a;", "a", "Lcom/stripe/android/stripe3ds2/security/k;", "Lr80/c;", "c", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.stripe3ds2.security.k messageTransformer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final r80.c errorReporter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c.Config creqExecutorConfig;

        public a(com.stripe.android.stripe3ds2.security.k messageTransformer, r80.c errorReporter, c.Config creqExecutorConfig) {
            s.k(messageTransformer, "messageTransformer");
            s.k(errorReporter, "errorReporter");
            s.k(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.a a(SecretKey secretKey) {
            s.k(secretKey, "secretKey");
            return new f.a(this.messageTransformer, secretKey, this.errorReporter, this.creqExecutorConfig);
        }
    }

    f a(SecretKey secretKey);
}
