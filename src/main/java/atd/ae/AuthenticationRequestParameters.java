package atd.ae;

import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AuthenticationRequestParameters extends atd.ac.getSDKAppID {
    AuthenticationRequestParameters() {
    }

    public abstract boolean getSDKReferenceNumber(byte[] bArr, byte[] bArr2, PublicKey publicKey);
}
