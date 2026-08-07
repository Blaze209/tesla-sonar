package com.stripe.android.stripe3ds2.security;

import java.io.Serializable;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/d;", "Ljava/io/Serializable;", "Ljava/security/interfaces/ECPublicKey;", "acsPublicKey", "Ljava/security/interfaces/ECPrivateKey;", "sdkPrivateKey", "", "agreementInfo", "Ljavax/crypto/SecretKey;", "e1", "(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d extends Serializable {
    SecretKey e1(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo);
}
