package org.spongycastle.openssl;

import java.io.IOException;
import org.spongycastle.operator.OperatorCreationException;

/* JADX INFO: loaded from: classes10.dex */
public class PEMEncryptedKeyPair {
    private final String dekAlgName;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f99732iv;
    private final byte[] keyBytes;
    private final PEMKeyPairParser parser;

    PEMEncryptedKeyPair(String str, byte[] bArr, byte[] bArr2, PEMKeyPairParser pEMKeyPairParser) {
        this.dekAlgName = str;
        this.f99732iv = bArr;
        this.keyBytes = bArr2;
        this.parser = pEMKeyPairParser;
    }

    public PEMKeyPair decryptKeyPair(PEMDecryptorProvider pEMDecryptorProvider) throws IOException {
        try {
            return this.parser.parse(pEMDecryptorProvider.get(this.dekAlgName).decrypt(this.keyBytes, this.f99732iv));
        } catch (IOException e11) {
            throw e11;
        } catch (OperatorCreationException e12) {
            throw new PEMException("cannot create extraction operator: " + e12.getMessage(), e12);
        } catch (Exception e13) {
            throw new PEMException("exception processing key pair: " + e13.getMessage(), e13);
        }
    }
}
