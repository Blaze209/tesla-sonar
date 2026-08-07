package ro;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes4.dex */
class m extends Animation implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f108655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f108656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f108657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f108658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f108659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f108660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f108661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f108662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f108663i;

    public m(View view, int i11, int i12, int i13, int i14) {
        this.f108655a = view;
        b(i11, i12, i13, i14);
    }

    private void b(int i11, int i12, int i13, int i14) {
        this.f108656b = this.f108655a.getX() - this.f108655a.getTranslationX();
        this.f108657c = this.f108655a.getY() - this.f108655a.getTranslationY();
        this.f108660f = this.f108655a.getWidth();
        int height = this.f108655a.getHeight();
        this.f108661g = height;
        this.f108658d = i11 - this.f108656b;
        this.f108659e = i12 - this.f108657c;
        this.f108662h = i13 - this.f108660f;
        this.f108663i = i14 - height;
    }

    @Override // ro.j
    public void a(int i11, int i12, int i13, int i14) {
        b(i11, i12, i13, i14);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f11, Transformation transformation) {
        float f12 = this.f108656b + (this.f108658d * f11);
        float f13 = this.f108657c + (this.f108659e * f11);
        this.f108655a.layout(Math.round(f12), Math.round(f13), Math.round(f12 + this.f108660f + (this.f108662h * f11)), Math.round(f13 + this.f108661g + (this.f108663i * f11)));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
