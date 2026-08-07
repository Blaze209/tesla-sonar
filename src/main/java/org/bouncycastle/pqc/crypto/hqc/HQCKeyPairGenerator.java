package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class HQCKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private int N_BYTE;
    private int delta;
    private HQCKeyGenerationParameters hqcKeyGenerationParameters;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99097k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99098n;
    private SecureRandom random;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99099w;

    /* JADX INFO: renamed from: we, reason: collision with root package name */
    private int f99100we;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private int f99101wr;

    private AsymmetricCipherKeyPair genKeyPair(byte[] bArr) {
        HQCEngine engine = this.hqcKeyGenerationParameters.getParameters().getEngine();
        int i11 = this.N_BYTE;
        byte[] bArr2 = new byte[i11 + 40];
        byte[] bArr3 = new byte[i11 + 80];
        engine.genKeyPair(bArr2, bArr3, bArr);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new HQCPublicKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr2), (AsymmetricKeyParameter) new HQCPrivateKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr3));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[48];
        this.random.nextBytes(bArr);
        return genKeyPair(bArr);
    }

    public AsymmetricCipherKeyPair generateKeyPairWithSeed(byte[] bArr) {
        return genKeyPair(bArr);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.hqcKeyGenerationParameters = (HQCKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f99098n = this.hqcKeyGenerationParameters.getParameters().getN();
        this.f99097k = this.hqcKeyGenerationParameters.getParameters().getK();
        this.delta = this.hqcKeyGenerationParameters.getParameters().getDelta();
        this.f99099w = this.hqcKeyGenerationParameters.getParameters().getW();
        this.f99101wr = this.hqcKeyGenerationParameters.getParameters().getWr();
        this.f99100we = this.hqcKeyGenerationParameters.getParameters().getWe();
        this.N_BYTE = (this.f99098n + 7) / 8;
    }
}
