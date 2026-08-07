package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import ap.p;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.image.d;
import u5.h;

/* JADX INFO: loaded from: classes4.dex */
class b extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f23698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final il.b f23699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pl.b<ml.a> f23700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f23701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f23704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ReadableMap f23706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f23707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f23708l;

    public b(Resources resources, int i11, int i12, int i13, Uri uri, ReadableMap readableMap, il.b bVar, Object obj, String str) {
        this.f23700d = new pl.b<>(ml.b.u(resources).a());
        this.f23699c = bVar;
        this.f23701e = obj;
        this.f23703g = i13;
        this.f23704h = uri == null ? Uri.EMPTY : uri;
        this.f23706j = readableMap;
        this.f23705i = (int) w.h(i12);
        this.f23702f = (int) w.h(i11);
        this.f23707k = str;
    }

    @Override // ap.p
    public Drawable a() {
        return this.f23698b;
    }

    @Override // ap.p
    public int b() {
        return this.f23702f;
    }

    @Override // ap.p
    public void c() {
        this.f23700d.i();
    }

    @Override // ap.p
    public void d() {
        this.f23700d.j();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        if (this.f23698b == null) {
            go.b bVarA = go.b.A(ImageRequestBuilder.x(this.f23704h), this.f23706j);
            ((ml.a) this.f23700d.f()).v(d.c(this.f23707k));
            this.f23699c.z();
            this.f23699c.a(this.f23700d.e());
            Object obj = this.f23701e;
            if (obj != null) {
                this.f23699c.B(obj);
            }
            this.f23699c.D(bVarA);
            this.f23700d.n(this.f23699c.build());
            this.f23699c.z();
            Drawable drawable = (Drawable) h.g(this.f23700d.g());
            this.f23698b = drawable;
            drawable.setBounds(0, 0, this.f23705i, this.f23702f);
            int i16 = this.f23703g;
            if (i16 != 0) {
                this.f23698b.setColorFilter(i16, PorterDuff.Mode.SRC_IN);
            }
            this.f23698b.setCallback(this.f23708l);
        }
        canvas.save();
        canvas.translate(f11, ((i14 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f23698b.getBounds().bottom - this.f23698b.getBounds().top) / 2));
        this.f23698b.draw(canvas);
        canvas.restore();
    }

    @Override // ap.p
    public void e() {
        this.f23700d.i();
    }

    @Override // ap.p
    public void f() {
        this.f23700d.j();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i13 = -this.f23702f;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i13;
            fontMetricsInt.bottom = 0;
        }
        return this.f23705i;
    }

    @Override // ap.p
    public void h(TextView textView) {
        this.f23708l = textView;
    }
}
