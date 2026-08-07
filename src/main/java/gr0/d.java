package gr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f69426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69427b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f69428c;

    public d(ByteBuffer byteBuffer) {
        this.f69428c = byteBuffer;
        this.f69426a = byteBuffer.position();
    }

    public void a(int i11, int i12) {
        int i13 = this.f69427b;
        int i14 = 8 - (i13 % 8);
        if (i12 <= i14) {
            int i15 = this.f69428c.get(this.f69426a + (i13 / 8));
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i11 << (i14 - i12));
            ByteBuffer byteBuffer = this.f69428c;
            int i17 = this.f69426a + (this.f69427b / 8);
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f69427b += i12;
        } else {
            int i18 = i12 - i14;
            a(i11 >> i18, i14);
            a(i11 & ((1 << i18) - 1), i18);
        }
        ByteBuffer byteBuffer2 = this.f69428c;
        int i19 = this.f69426a;
        int i21 = this.f69427b;
        byteBuffer2.position(i19 + (i21 / 8) + (i21 % 8 <= 0 ? 0 : 1));
    }

    public void b(boolean z11) {
        a(z11 ? 1 : 0, 1);
    }
}
