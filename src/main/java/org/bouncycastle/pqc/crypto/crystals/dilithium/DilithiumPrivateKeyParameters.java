package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DilithiumPrivateKeyParameters extends DilithiumKeyParameters {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final byte[] f99042k;
    final byte[] rho;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    final byte[] f99043s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    final byte[] f99044s2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    final byte[] f99045t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final byte[] f99046t1;

    /* JADX INFO: renamed from: tr, reason: collision with root package name */
    final byte[] f99047tr;

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, DilithiumPublicKeyParameters dilithiumPublicKeyParameters) {
        super(true, dilithiumParameters);
        DilithiumEngine engine = dilithiumParameters.getEngine(null);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.f99042k = Arrays.copyOfRange(bArr, 32, 64);
        this.f99047tr = Arrays.copyOfRange(bArr, 64, 128);
        int dilithiumL = (engine.getDilithiumL() * engine.getDilithiumPolyEtaPackedBytes()) + 128;
        this.f99043s1 = Arrays.copyOfRange(bArr, 128, dilithiumL);
        int dilithiumK = (engine.getDilithiumK() * engine.getDilithiumPolyEtaPackedBytes()) + dilithiumL;
        this.f99044s2 = Arrays.copyOfRange(bArr, dilithiumL, dilithiumK);
        this.f99045t0 = Arrays.copyOfRange(bArr, dilithiumK, (engine.getDilithiumK() * 416) + dilithiumK);
        if (dilithiumPublicKeyParameters != null) {
            this.f99046t1 = dilithiumPublicKeyParameters.getT1();
        } else {
            this.f99046t1 = null;
        }
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.f99042k, this.f99047tr, this.f99043s1, this.f99044s2, this.f99045t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.f99042k);
    }

    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return DilithiumPublicKeyParameters.getEncoded(this.rho, this.f99046t1);
    }

    public DilithiumPublicKeyParameters getPublicKeyParameters() {
        return new DilithiumPublicKeyParameters(getParameters(), this.rho, this.f99046t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f99043s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.f99044s2);
    }

    public byte[] getT0() {
        return Arrays.clone(this.f99045t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f99046t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.f99047tr);
    }

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, dilithiumParameters);
        this.rho = Arrays.clone(bArr);
        this.f99042k = Arrays.clone(bArr2);
        this.f99047tr = Arrays.clone(bArr3);
        this.f99043s1 = Arrays.clone(bArr4);
        this.f99044s2 = Arrays.clone(bArr5);
        this.f99045t0 = Arrays.clone(bArr6);
        this.f99046t1 = Arrays.clone(bArr7);
    }
}
