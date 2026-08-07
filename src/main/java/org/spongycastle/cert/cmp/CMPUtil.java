package org.spongycastle.cert.cmp;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.DEROutputStream;

/* JADX INFO: loaded from: classes10.dex */
class CMPUtil {
    CMPUtil() {
    }

    static void derEncodeToStream(ASN1Encodable aSN1Encodable, OutputStream outputStream) {
        DEROutputStream dEROutputStream = new DEROutputStream(outputStream);
        try {
            dEROutputStream.writeObject(aSN1Encodable);
            dEROutputStream.close();
        } catch (IOException e11) {
            throw new CMPRuntimeException("unable to DER encode object: " + e11.getMessage(), e11);
        }
    }
}
