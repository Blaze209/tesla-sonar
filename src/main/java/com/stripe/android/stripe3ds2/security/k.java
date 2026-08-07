package com.stripe.android.stripe3ds2.security;

import java.io.Serializable;
import javax.crypto.SecretKey;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/k;", "Ljava/io/Serializable;", "Lorg/json/JSONObject;", "challengeRequest", "Ljavax/crypto/SecretKey;", "secretKey", "", "K0", "(Lorg/json/JSONObject;Ljavax/crypto/SecretKey;)Ljava/lang/String;", "message", "s0", "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface k extends Serializable {
    String K0(JSONObject challengeRequest, SecretKey secretKey);

    JSONObject s0(String message, SecretKey secretKey);
}
