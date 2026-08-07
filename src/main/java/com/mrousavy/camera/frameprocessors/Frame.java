package com.mrousavy.camera.frameprocessors;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.os.Build;
import androidx.camera.core.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dz.o0;
import dz.q0;
import fz.i;
import fz.l;

/* JADX INFO: loaded from: classes6.dex */
public class Frame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f45656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45657b = 0;

    public Frame(n nVar) {
        this.f45656a = nVar;
    }

    private void a() throws o0 {
        if (!e(this.f45656a)) {
            throw new o0();
        }
    }

    private void b() {
        this.f45656a.close();
    }

    private synchronized boolean e(n nVar) {
        if (this.f45657b <= 0) {
            return false;
        }
        try {
            nVar.getFormat();
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @in.a
    private Object getHardwareBufferBoxed() {
        return c();
    }

    public HardwareBuffer c() throws o0, q0 {
        if (Build.VERSION.SDK_INT < 28) {
            throw new q0();
        }
        a();
        return d().getHardwareBuffer();
    }

    public Image d() throws o0 {
        a();
        Image image = this.f45656a.getImage();
        if (image != null) {
            return image;
        }
        throw new o0();
    }

    @in.a
    public synchronized void decrementRefCount() {
        int i11 = this.f45657b - 1;
        this.f45657b = i11;
        if (i11 <= 0) {
            b();
        }
    }

    @in.a
    public int getBytesPerRow() throws o0 {
        a();
        return this.f45656a.N0()[0].m();
    }

    @in.a
    public int getHeight() throws o0 {
        a();
        return this.f45656a.getHeight();
    }

    @in.a
    public boolean getIsMirrored() throws o0 {
        a();
        float[] fArr = new float[9];
        this.f45656a.z().e().getValues(fArr);
        return fArr[0] < BitmapDescriptorFactory.HUE_RED;
    }

    @in.a
    public boolean getIsValid() {
        return e(this.f45656a);
    }

    @in.a
    public i getOrientation() throws o0 {
        a();
        return i.INSTANCE.a(this.f45656a.z().d()).reversed();
    }

    @in.a
    public l getPixelFormat() throws o0 {
        a();
        return l.INSTANCE.a(this.f45656a.getFormat());
    }

    @in.a
    public int getPlanesCount() throws o0 {
        a();
        return this.f45656a.N0().length;
    }

    @in.a
    public long getTimestamp() throws o0 {
        a();
        return this.f45656a.z().a();
    }

    @in.a
    public int getWidth() throws o0 {
        a();
        return this.f45656a.getWidth();
    }

    @in.a
    public synchronized void incrementRefCount() {
        this.f45657b++;
    }
}
