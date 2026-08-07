package gj;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements a<int[]> {
    @Override // gj.a
    public int b() {
        return 4;
    }

    @Override // gj.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // gj.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i11) {
        return new int[i11];
    }

    @Override // gj.a
    public String getTag() {
        return "IntegerArrayPool";
    }
}
