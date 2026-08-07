package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowParameters implements CipherParameters {
    private static final int len_pkseed = 32;
    private static final int len_salt = 16;
    private static final int len_skseed = 32;
    public static final RainbowParameters rainbowIIIcircumzenithal;
    public static final RainbowParameters rainbowIIIclassic;
    public static final RainbowParameters rainbowIIIcompressed;
    public static final RainbowParameters rainbowVcircumzenithal;
    public static final RainbowParameters rainbowVclassic;
    public static final RainbowParameters rainbowVcompressed;
    private final Digest hash_algo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f99150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f99151n;
    private final String name;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private final int f99152o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private final int f99153o2;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private final int f99154v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private final int f99155v2;
    private final Version version;

    static {
        Version version = Version.CLASSIC;
        rainbowIIIclassic = new RainbowParameters("rainbow-III-classic", 3, version);
        Version version2 = Version.CIRCUMZENITHAL;
        rainbowIIIcircumzenithal = new RainbowParameters("rainbow-III-circumzenithal", 3, version2);
        Version version3 = Version.COMPRESSED;
        rainbowIIIcompressed = new RainbowParameters("rainbow-III-compressed", 3, version3);
        rainbowVclassic = new RainbowParameters("rainbow-V-classic", 5, version);
        rainbowVcircumzenithal = new RainbowParameters("rainbow-V-circumzenithal", 5, version2);
        rainbowVcompressed = new RainbowParameters("rainbow-V-compressed", 5, version3);
    }

    private RainbowParameters(String str, int i11, Version version) {
        Digest sHA384Digest;
        this.name = str;
        if (i11 == 3) {
            this.f99154v1 = 68;
            this.f99152o1 = 32;
            this.f99153o2 = 48;
            sHA384Digest = new SHA384Digest();
        } else {
            if (i11 != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f99154v1 = 96;
            this.f99152o1 = 36;
            this.f99153o2 = 64;
            sHA384Digest = new SHA512Digest();
        }
        this.hash_algo = sHA384Digest;
        int i12 = this.f99154v1;
        int i13 = this.f99152o1;
        this.f99155v2 = i12 + i13;
        int i14 = this.f99153o2;
        this.f99151n = i12 + i13 + i14;
        this.f99150m = i13 + i14;
        this.version = version;
    }

    Digest getHash_algo() {
        return this.hash_algo;
    }

    int getLen_pkseed() {
        return 32;
    }

    int getLen_salt() {
        return 16;
    }

    int getLen_skseed() {
        return 32;
    }

    int getM() {
        return this.f99150m;
    }

    int getN() {
        return this.f99151n;
    }

    public String getName() {
        return this.name;
    }

    int getO1() {
        return this.f99152o1;
    }

    int getO2() {
        return this.f99153o2;
    }

    int getV1() {
        return this.f99154v1;
    }

    int getV2() {
        return this.f99155v2;
    }

    Version getVersion() {
        return this.version;
    }
}
