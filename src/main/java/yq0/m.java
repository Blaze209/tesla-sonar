package yq0;

import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class m extends SecretKeySpec implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f125754a;

    public m(byte[] bArr, String str, byte b11) {
        super(bArr, str);
        this.f125754a = b11;
    }

    public byte a() {
        return this.f125754a;
    }

    @Override // javax.crypto.spec.SecretKeySpec
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && this.f125754a == ((m) obj).f125754a;
    }

    @Override // yq0.g
    public byte[] getKey() {
        return super.getEncoded();
    }

    @Override // javax.crypto.spec.SecretKeySpec
    public int hashCode() {
        return (super.hashCode() * 31) + this.f125754a;
    }
}
