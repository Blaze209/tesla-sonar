package atd.ah;

import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getDeviceData extends ChallengeResult {
    getDeviceData() {
    }

    public abstract byte[] getSDKReferenceNumber(atd.ag.getDeviceData getdevicedata, RSAPublicKey rSAPublicKey);
}
