package atd.ai;

import atd.an.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult extends BuildConfig {
    public ChallengeResult(byte[] bArr) {
        super(bArr);
    }

    ChallengeResult(String str) {
        super(str, atd.am.ChallengeResultCancelled.JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED);
    }
}
