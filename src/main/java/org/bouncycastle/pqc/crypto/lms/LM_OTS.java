package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class LM_OTS {
    static final short D_MESG = -32383;
    private static final short D_PBLC = -32640;
    private static final int ITER_J = 22;
    private static final int ITER_K = 20;
    private static final int ITER_PREV = 23;
    static final int MAX_HASH = 32;
    static final int SEED_RANDOMISER_INDEX = -3;

    LM_OTS() {
    }

    public static int cksm(byte[] bArr, int i11, LMOtsParameters lMOtsParameters) {
        int w11 = (1 << lMOtsParameters.getW()) - 1;
        int iCoef = 0;
        for (int i12 = 0; i12 < (i11 * 8) / lMOtsParameters.getW(); i12++) {
            iCoef = (iCoef + w11) - coef(bArr, i12, lMOtsParameters.getW());
        }
        return iCoef << lMOtsParameters.getLs();
    }

    public static int coef(byte[] bArr, int i11, int i12) {
        int i13 = (i11 * i12) / 8;
        return (bArr[i13] >>> (((~i11) & ((8 / i12) - 1)) * i12)) & ((1 << i12) - 1);
    }

    public static LMOtsSignature lm_ots_generate_signature(LMOtsPrivateKey lMOtsPrivateKey, byte[] bArr, byte[] bArr2) {
        LMOtsParameters parameter = lMOtsPrivateKey.getParameter();
        int n11 = parameter.getN();
        int p11 = parameter.getP();
        int w11 = parameter.getW();
        byte[] bArr3 = new byte[p11 * n11];
        Digest digest = DigestUtil.getDigest(parameter);
        SeedDerive derivationFunction = lMOtsPrivateKey.getDerivationFunction();
        int iCksm = cksm(bArr, n11, parameter);
        bArr[n11] = (byte) ((iCksm >>> 8) & 255);
        bArr[n11 + 1] = (byte) iCksm;
        int i11 = n11 + 23;
        byte[] bArrBuild = Composer.compose().bytes(lMOtsPrivateKey.getI()).u32str(lMOtsPrivateKey.getQ()).padUntil(0, i11).build();
        derivationFunction.setJ(0);
        int i12 = 0;
        while (i12 < p11) {
            Pack.shortToBigEndian((short) i12, bArrBuild, 20);
            derivationFunction.deriveSeed(bArrBuild, i12 < p11 + (-1), 23);
            int iCoef = coef(bArr, i12, w11);
            for (int i13 = 0; i13 < iCoef; i13++) {
                bArrBuild[22] = (byte) i13;
                digest.update(bArrBuild, 0, i11);
                digest.doFinal(bArrBuild, 23);
            }
            System.arraycopy(bArrBuild, 23, bArr3, n11 * i12, n11);
            i12++;
        }
        return new LMOtsSignature(parameter, bArr2, bArr3);
    }

    public static boolean lm_ots_validate_signature(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr, boolean z11) throws LMSException {
        if (lMOtsSignature.getType().equals(lMOtsPublicKey.getParameter())) {
            return Arrays.areEqual(lm_ots_validate_signature_calculate(lMOtsPublicKey, lMOtsSignature, bArr), lMOtsPublicKey.getK());
        }
        throw new LMSException("public key and signature ots types do not match");
    }

    public static byte[] lm_ots_validate_signature_calculate(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr) {
        LMSContext lMSContextCreateOtsContext = lMOtsPublicKey.createOtsContext(lMOtsSignature);
        LmsUtils.byteArray(bArr, lMSContextCreateOtsContext);
        return lm_ots_validate_signature_calculate(lMSContextCreateOtsContext);
    }

    public static LMOtsPublicKey lms_ots_generatePublicKey(LMOtsPrivateKey lMOtsPrivateKey) {
        return new LMOtsPublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lms_ots_generatePublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lMOtsPrivateKey.getMasterSecret()));
    }

    public static LMOtsSignature lm_ots_generate_signature(LMSigParameters lMSigParameters, LMOtsPrivateKey lMOtsPrivateKey, byte[][] bArr, byte[] bArr2, boolean z11) {
        byte[] c11;
        byte[] q11 = new byte[34];
        if (z11) {
            int n11 = lMOtsPrivateKey.getParameter().getN();
            c11 = new byte[n11];
            System.arraycopy(bArr2, 0, q11, 0, n11);
        } else {
            LMSContext signatureContext = lMOtsPrivateKey.getSignatureContext(lMSigParameters, bArr);
            LmsUtils.byteArray(bArr2, 0, bArr2.length, signatureContext);
            c11 = signatureContext.getC();
            q11 = signatureContext.getQ();
        }
        return lm_ots_generate_signature(lMOtsPrivateKey, q11, c11);
    }

    public static byte[] lm_ots_validate_signature_calculate(LMSContext lMSContext) {
        LMOtsPublicKey publicKey = lMSContext.getPublicKey();
        LMOtsParameters parameter = publicKey.getParameter();
        Object signature = lMSContext.getSignature();
        LMOtsSignature otsSignature = signature instanceof LMSSignature ? ((LMSSignature) signature).getOtsSignature() : (LMOtsSignature) signature;
        int n11 = parameter.getN();
        int w11 = parameter.getW();
        int p11 = parameter.getP();
        byte[] q11 = lMSContext.getQ();
        int iCksm = cksm(q11, n11, parameter);
        q11[n11] = (byte) ((iCksm >>> 8) & 255);
        q11[n11 + 1] = (byte) iCksm;
        byte[] i11 = publicKey.getI();
        int q12 = publicKey.getQ();
        Digest digest = DigestUtil.getDigest(parameter);
        LmsUtils.byteArray(i11, digest);
        LmsUtils.u32str(q12, digest);
        LmsUtils.u16str(D_PBLC, digest);
        Composer composerU32str = Composer.compose().bytes(i11).u32str(q12);
        int i12 = n11 + 23;
        byte[] bArrBuild = composerU32str.padUntil(0, i12).build();
        int i13 = (1 << w11) - 1;
        byte[] y11 = otsSignature.getY();
        Digest digest2 = DigestUtil.getDigest(parameter);
        for (int i14 = 0; i14 < p11; i14++) {
            Pack.shortToBigEndian((short) i14, bArrBuild, 20);
            System.arraycopy(y11, i14 * n11, bArrBuild, 23, n11);
            for (int iCoef = coef(q11, i14, w11); iCoef < i13; iCoef++) {
                bArrBuild[22] = (byte) iCoef;
                digest2.update(bArrBuild, 0, i12);
                digest2.doFinal(bArrBuild, 23);
            }
            digest.update(bArrBuild, 23, n11);
        }
        byte[] bArr = new byte[n11];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i11, byte[] bArr2) {
        Digest digest = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild = Composer.compose().bytes(bArr).u32str(i11).u16str(-32640).padUntil(0, 22).build();
        digest.update(bArrBuild, 0, bArrBuild.length);
        Digest digest2 = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild2 = Composer.compose().bytes(bArr).u32str(i11).padUntil(0, digest2.getDigestSize() + 23).build();
        SeedDerive seedDerive = new SeedDerive(bArr, bArr2, DigestUtil.getDigest(lMOtsParameters));
        seedDerive.setQ(i11);
        seedDerive.setJ(0);
        int p11 = lMOtsParameters.getP();
        int n11 = lMOtsParameters.getN();
        int w11 = (1 << lMOtsParameters.getW()) - 1;
        int i12 = 0;
        while (i12 < p11) {
            seedDerive.deriveSeed(bArrBuild2, i12 < p11 + (-1), 23);
            Pack.shortToBigEndian((short) i12, bArrBuild2, 20);
            for (int i13 = 0; i13 < w11; i13++) {
                bArrBuild2[22] = (byte) i13;
                digest2.update(bArrBuild2, 0, bArrBuild2.length);
                digest2.doFinal(bArrBuild2, 23);
            }
            digest.update(bArrBuild2, 23, n11);
            i12++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}
