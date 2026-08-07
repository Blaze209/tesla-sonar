package atd.ai;

import atd.an.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData extends BuildConfig {
    public getDeviceData(byte[] bArr) {
        super(bArr);
    }

    getDeviceData(String str) {
        super(str, atd.am.ChallengeResultCancelled.JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED);
    }
}
