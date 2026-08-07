package atd.ai;

import atd.an.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID extends BuildConfig {
    public getSDKAppID(byte[] bArr) {
        super(bArr == null ? new byte[0] : bArr);
    }

    getSDKAppID(String str) {
        super(str == null ? "" : str, atd.am.ChallengeResultCancelled.JWE_KEY_NOT_BASE64URL_ENCODED);
    }
}
