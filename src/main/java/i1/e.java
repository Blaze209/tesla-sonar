package i1;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import c0.y0;
import g1.o1;
import java.util.HashSet;
import java.util.Set;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public class e implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o1 f74050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Range<Integer> f74051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Range<Integer> f74052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<Size> f74053d;

    private e(@NonNull o1 o1Var) {
        HashSet hashSet = new HashSet();
        this.f74053d = hashSet;
        this.f74050a = o1Var;
        int iJ = o1Var.j();
        this.f74051b = Range.create(Integer.valueOf(iJ), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iJ))) * iJ));
        int iH = o1Var.h();
        this.f74052c = Range.create(Integer.valueOf(iH), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iH))) * iH));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.g());
    }

    private void k(@NonNull Size size) {
        this.f74053d.add(size);
    }

    @NonNull
    public static o1 l(@NonNull o1 o1Var, Size size) {
        if (!(o1Var instanceof e)) {
            if (androidx.camera.video.internal.compat.quirk.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                o1Var = new e(o1Var);
            } else if (size != null && !o1Var.b(size.getWidth(), size.getHeight())) {
                y0.l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, o1Var.e(), o1Var.f()));
                o1Var = new e(o1Var);
            }
        }
        if (size != null && (o1Var instanceof e)) {
            ((e) o1Var).k(size);
        }
        return o1Var;
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> a(int i11) {
        h.b(this.f74052c.contains(Integer.valueOf(i11)) && i11 % this.f74050a.h() == 0, "Not supported height: " + i11 + " which is not in " + this.f74052c + " or can not be divided by alignment " + this.f74050a.h());
        return this.f74051b;
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> c() {
        return this.f74050a.c();
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> d(int i11) {
        h.b(this.f74051b.contains(Integer.valueOf(i11)) && i11 % this.f74050a.j() == 0, "Not supported width: " + i11 + " which is not in " + this.f74051b + " or can not be divided by alignment " + this.f74050a.j());
        return this.f74052c;
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> e() {
        return this.f74051b;
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> f() {
        return this.f74052c;
    }

    @Override // g1.o1
    public boolean g() {
        return this.f74050a.g();
    }

    @Override // g1.o1
    public int h() {
        return this.f74050a.h();
    }

    @Override // g1.o1
    public boolean i(int i11, int i12) {
        if (this.f74050a.i(i11, i12)) {
            return true;
        }
        for (Size size : this.f74053d) {
            if (size.getWidth() == i11 && size.getHeight() == i12) {
                return true;
            }
        }
        return this.f74051b.contains(Integer.valueOf(i11)) && this.f74052c.contains(Integer.valueOf(i12)) && i11 % this.f74050a.j() == 0 && i12 % this.f74050a.h() == 0;
    }

    @Override // g1.o1
    public int j() {
        return this.f74050a.j();
    }
}
