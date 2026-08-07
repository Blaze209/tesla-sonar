package org.bouncycastle.pqc.legacy.crypto.mceliece;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceCCA2Parameters extends McElieceParameters {
    private final String digest;

    public McElieceCCA2Parameters() {
        this(11, 50, "SHA-256");
    }

    public String getDigest() {
        return this.digest;
    }

    public McElieceCCA2Parameters(int i11) {
        this(i11, "SHA-256");
    }

    public McElieceCCA2Parameters(int i11, int i12) {
        this(i11, i12, "SHA-256");
    }

    public McElieceCCA2Parameters(int i11, int i12, int i13) {
        this(i11, i12, i13, "SHA-256");
    }

    public McElieceCCA2Parameters(int i11, int i12, int i13, String str) {
        super(i11, i12, i13);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i11, int i12, String str) {
        super(i11, i12);
        this.digest = str;
    }

    public McElieceCCA2Parameters(int i11, String str) {
        super(i11);
        this.digest = str;
    }

    public McElieceCCA2Parameters(String str) {
        this(11, 50, str);
    }
}
