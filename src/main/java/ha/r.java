package ha;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f72455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f72457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f72458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VolumeProvider f72459e;

    class a extends VolumeProvider {
        a(int i11, int i12, int i13, String str) {
            super(i11, i12, i13, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i11) {
            r.this.b(i11);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i11) {
            r.this.c(i11);
        }
    }

    class b extends VolumeProvider {
        b(int i11, int i12, int i13) {
            super(i11, i12, i13);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i11) {
            r.this.b(i11);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i11) {
            r.this.c(i11);
        }
    }

    public r(int i11, int i12, int i13, String str) {
        this.f72455a = i11;
        this.f72456b = i12;
        this.f72458d = i13;
        this.f72457c = str;
    }

    public Object a() {
        r rVar;
        if (this.f72459e != null) {
            rVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            rVar = this;
            rVar.f72459e = rVar.new a(this.f72455a, this.f72456b, this.f72458d, this.f72457c);
        } else {
            rVar = this;
            rVar.f72459e = new b(rVar.f72455a, rVar.f72456b, rVar.f72458d);
        }
        return rVar.f72459e;
    }

    public abstract void b(int i11);

    public abstract void c(int i11);

    public final void d(int i11) {
        this.f72458d = i11;
        ((VolumeProvider) a()).setCurrentVolume(i11);
    }
}
