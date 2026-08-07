package om;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import om.d;

/* JADX INFO: loaded from: classes3.dex */
public class d<T extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98035a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98036b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f98037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f98038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f98039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f98041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap.Config f98042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap.Config f98043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private sm.b f98044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f98045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f98046l;

    public d() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f98042h = config;
        this.f98043i = config;
    }

    public c a() {
        return new c(this);
    }

    public Bitmap.Config b() {
        return this.f98043i;
    }

    public Bitmap.Config c() {
        return this.f98042h;
    }

    public dn.a d() {
        return null;
    }

    public ColorSpace e() {
        return this.f98045k;
    }

    public sm.b f() {
        return this.f98044j;
    }

    public boolean g() {
        return this.f98040f;
    }

    public boolean h() {
        return this.f98037c;
    }

    public boolean i() {
        return this.f98046l;
    }

    public boolean j() {
        return this.f98041g;
    }

    public int k() {
        return this.f98036b;
    }

    public int l() {
        return this.f98035a;
    }

    public boolean m() {
        return this.f98039e;
    }

    public boolean n() {
        return this.f98038d;
    }
}
