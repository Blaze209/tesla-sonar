package com.ReactNativeBlobUtil;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f19703a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19704b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f19708f;

    enum a {
        Upload,
        Download
    }

    f(boolean z11, int i11, int i12, a aVar) {
        this.f19705c = -1;
        this.f19706d = -1;
        this.f19707e = false;
        a aVar2 = a.Upload;
        this.f19707e = z11;
        this.f19706d = i11;
        this.f19708f = aVar;
        this.f19705c = i12;
    }

    public boolean a(float f11) {
        int i11 = this.f19705c;
        boolean z11 = false;
        boolean z12 = i11 <= 0 || f11 <= BitmapDescriptorFactory.HUE_RED || Math.floor((double) (f11 * ((float) i11))) > ((double) this.f19704b);
        if (System.currentTimeMillis() - this.f19703a > this.f19706d && this.f19707e && z12) {
            z11 = true;
        }
        if (z11) {
            this.f19704b++;
            this.f19703a = System.currentTimeMillis();
        }
        return z11;
    }
}
