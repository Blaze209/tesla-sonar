package hg;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f72710a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f72711b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f72712c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f72713d = 0;

    public void a(String str) {
        int i11 = this.f72712c;
        if (i11 == 5) {
            this.f72713d++;
            return;
        }
        this.f72710a[i11] = str;
        this.f72711b[i11] = System.nanoTime();
        q5.k.a(str);
        this.f72712c++;
    }

    public float b(String str) {
        int i11 = this.f72713d;
        if (i11 > 0) {
            this.f72713d = i11 - 1;
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i12 = this.f72712c - 1;
        this.f72712c = i12;
        if (i12 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f72710a[i12])) {
            q5.k.b();
            return (System.nanoTime() - this.f72711b[this.f72712c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f72710a[this.f72712c] + ".");
    }
}
