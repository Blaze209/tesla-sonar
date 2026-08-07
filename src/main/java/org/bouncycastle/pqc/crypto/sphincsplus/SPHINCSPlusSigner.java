package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class SPHINCSPlusSigner implements MessageSigner {
    private SPHINCSPlusPrivateKeyParameters privKey;
    private SPHINCSPlusPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        SPHINCSPlusEngine engine = this.privKey.getParameters().getEngine();
        engine.init(this.privKey.f99190pk.seed);
        int i11 = engine.N;
        byte[] bArr2 = new byte[i11];
        SecureRandom secureRandom = this.random;
        int i12 = 0;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy(this.privKey.f99190pk.seed, 0, bArr2, 0, i11);
        }
        Fors fors = new Fors(engine);
        byte[] bArrPRF_msg = engine.PRF_msg(this.privKey.f99191sk.prf, bArr2, bArr);
        PK pk2 = this.privKey.f99190pk;
        IndexedDigest indexedDigestH_msg = engine.H_msg(bArrPRF_msg, pk2.seed, pk2.root, bArr);
        byte[] bArr3 = indexedDigestH_msg.digest;
        long j11 = indexedDigestH_msg.idx_tree;
        int i13 = indexedDigestH_msg.idx_leaf;
        ADRS adrs = new ADRS();
        adrs.setType(3);
        adrs.setTreeAddress(j11);
        adrs.setKeyPairAddress(i13);
        SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters = this.privKey;
        SIG_FORS[] sig_forsArrSign = fors.sign(bArr3, sPHINCSPlusPrivateKeyParameters.f99191sk.seed, sPHINCSPlusPrivateKeyParameters.f99190pk.seed, adrs);
        ADRS adrs2 = new ADRS();
        adrs2.setType(3);
        adrs2.setTreeAddress(j11);
        adrs2.setKeyPairAddress(i13);
        byte[] bArrPkFromSig = fors.pkFromSig(sig_forsArrSign, bArr3, this.privKey.f99190pk.seed, adrs2);
        new ADRS().setType(2);
        byte[] bArrSign = new HT(engine, this.privKey.getSeed(), this.privKey.getPublicSeed()).sign(bArrPkFromSig, j11, i13);
        int length = sig_forsArrSign.length;
        byte[][] bArr4 = new byte[length + 2][];
        bArr4[0] = bArrPRF_msg;
        while (i12 != sig_forsArrSign.length) {
            int i14 = i12 + 1;
            SIG_FORS sig_fors = sig_forsArrSign[i12];
            bArr4[i14] = Arrays.concatenate(sig_fors.f99169sk, Arrays.concatenate(sig_fors.authPath));
            i12 = i14;
        }
        bArr4[length + 1] = bArrSign;
        return Arrays.concatenate(bArr4);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!z11) {
            this.pubKey = (SPHINCSPlusPublicKeyParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.privKey = (SPHINCSPlusPrivateKeyParameters) cipherParameters;
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (SPHINCSPlusPrivateKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        SPHINCSPlusEngine engine = this.pubKey.getParameters().getEngine();
        engine.init(this.pubKey.getSeed());
        ADRS adrs = new ADRS();
        SIG sig = new SIG(engine.N, engine.K, engine.A, engine.D, engine.H_PRIME, engine.WOTS_LEN, bArr2);
        byte[] r11 = sig.getR();
        SIG_FORS[] sig_fors = sig.getSIG_FORS();
        SIG_XMSS[] sig_ht = sig.getSIG_HT();
        IndexedDigest indexedDigestH_msg = engine.H_msg(r11, this.pubKey.getSeed(), this.pubKey.getRoot(), bArr);
        byte[] bArr3 = indexedDigestH_msg.digest;
        long j11 = indexedDigestH_msg.idx_tree;
        int i11 = indexedDigestH_msg.idx_leaf;
        adrs.setType(3);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j11);
        adrs.setKeyPairAddress(i11);
        byte[] bArrPkFromSig = new Fors(engine).pkFromSig(sig_fors, bArr3, this.pubKey.getSeed(), adrs);
        adrs.setType(2);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j11);
        adrs.setKeyPairAddress(i11);
        return new HT(engine, null, this.pubKey.getSeed()).verify(bArrPkFromSig, sig_ht, this.pubKey.getSeed(), j11, i11, this.pubKey.getRoot());
    }
}
