package com.stripe.android.stripe3ds2.security;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.security.PublicKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bà\u0080\u0001\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/i;", "", "", StatusResponse.PAYLOAD, "Ljava/security/PublicKey;", "acsPublicKey", "directoryServerId", "keyId", "a", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface i {
    String a(String payload, PublicKey acsPublicKey, String directoryServerId, String keyId);
}
