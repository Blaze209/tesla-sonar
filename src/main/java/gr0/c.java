package gr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f69423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f69425c;

    public c(ByteBuffer byteBuffer) {
        this.f69425c = byteBuffer;
        this.f69423a = byteBuffer.position();
    }

    public int a(int i11) {
        int iA;
        int i12 = this.f69425c.get(this.f69423a + (this.f69424b / 8));
        if (i12 < 0) {
            i12 += 256;
        }
        int i13 = this.f69424b;
        int i14 = 8 - (i13 % 8);
        if (i11 <= i14) {
            iA = ((i12 << (i13 % 8)) & 255) >> ((i13 % 8) + (i14 - i11));
            this.f69424b = i13 + i11;
        } else {
            int i15 = i11 - i14;
            iA = (a(i14) << i15) + a(i15);
        }
        this.f69425c.position(this.f69423a + ((int) Math.ceil(((double) this.f69424b) / 8.0d)));
        return iA;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public int c() {
        return (this.f69425c.limit() * 8) - this.f69424b;
    }
}
