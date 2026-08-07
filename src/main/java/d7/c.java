package d7;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f59738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f59739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f59742e = d.a();

    protected int a(int i11) {
        return i11 + this.f59739b.getInt(i11);
    }

    protected int b(int i11) {
        if (i11 < this.f59741d) {
            return this.f59739b.getShort(this.f59740c + i11);
        }
        return 0;
    }

    protected void c(int i11, ByteBuffer byteBuffer) {
        this.f59739b = byteBuffer;
        if (byteBuffer == null) {
            this.f59738a = 0;
            this.f59740c = 0;
            this.f59741d = 0;
        } else {
            this.f59738a = i11;
            int i12 = i11 - byteBuffer.getInt(i11);
            this.f59740c = i12;
            this.f59741d = this.f59739b.getShort(i12);
        }
    }

    protected int d(int i11) {
        int i12 = i11 + this.f59738a;
        return i12 + this.f59739b.getInt(i12) + 4;
    }

    protected int e(int i11) {
        int i12 = i11 + this.f59738a;
        return this.f59739b.getInt(i12 + this.f59739b.getInt(i12));
    }
}
