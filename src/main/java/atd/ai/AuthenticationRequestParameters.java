package atd.ai;

import atd.an.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters extends BuildConfig {
    public AuthenticationRequestParameters(byte[] bArr) {
        super(bArr);
    }

    AuthenticationRequestParameters(String str) {
        super(str, atd.am.ChallengeResultCancelled.JWE_PAYLOAD_NOT_BASE64URL_ENCODED);
    }
}
