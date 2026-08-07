package gj;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a<byte[]> {
    @Override // gj.a
    public int b() {
        return 1;
    }

    @Override // gj.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // gj.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i11) {
        return new byte[i11];
    }

    @Override // gj.a
    public String getTag() {
        return "ByteArrayPool";
    }
}
