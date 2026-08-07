package com.fourthline.orca.internal;

import android.graphics.Canvas;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class Tw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Vw f27977a;

    private Tw(Vw vw2) {
        this.f27977a = vw2;
    }

    public static Tw a(InputStream inputStream) {
        return new Tw(Vw.a(inputStream));
    }

    public float b() {
        return this.f27977a.e();
    }

    public void a(float f11) {
        this.f27977a.b(f11);
    }

    public void a(Canvas canvas) {
        a(canvas, null);
    }

    public void a(Canvas canvas, Pw pw2) {
        this.f27977a.a(canvas, pw2);
    }

    public float a() {
        return this.f27977a.d();
    }
}
