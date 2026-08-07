package com.ijzerenhein.sharedelement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ll.r;
import ll.s;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RectF f45599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Rect f45600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RectF f45601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Matrix f45602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    s f45603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f45604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f45605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f45606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f45607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f45608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f45609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f45610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f45611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f45612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f45613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static Rect f45588p = new Rect();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static RectF f45589q = new RectF();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static int f45590r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static int f45591s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static int f45592t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static int f45593u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static int f45594v = 16;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static int f45595w = 32;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static int f45596x = 64;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static int f45597y = 128;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static int f45598z = 256;
    static int A = 512;
    static int B = (8 + 16) + 992;
    static int C = 1024;

    j() {
        this.f45599a = new RectF();
        this.f45600b = new Rect();
        this.f45601c = new RectF();
        this.f45602d = new Matrix();
        this.f45603e = s.f90213a;
        this.f45604f = 0;
        this.f45605g = 1.0f;
        this.f45606h = BitmapDescriptorFactory.HUE_RED;
        this.f45607i = BitmapDescriptorFactory.HUE_RED;
        this.f45608j = BitmapDescriptorFactory.HUE_RED;
        this.f45609k = BitmapDescriptorFactory.HUE_RED;
        this.f45610l = BitmapDescriptorFactory.HUE_RED;
        this.f45611m = 0;
        this.f45612n = "solid";
        this.f45613o = BitmapDescriptorFactory.HUE_RED;
    }

    static boolean b(s sVar, s sVar2) {
        return sVar == sVar2;
    }

    static Matrix c(View view) {
        Matrix matrix = new Matrix(view.getMatrix());
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        ViewParent parent = view.getParent();
        while ((parent instanceof View) && parent != null) {
            ((View) parent).getMatrix().getValues(fArr2);
            fArr[0] = fArr[0] * fArr2[0];
            fArr[4] = fArr[4] * fArr2[4];
            fArr[1] = fArr[1] + fArr2[1];
            fArr[3] = fArr[3] + fArr2[3];
            fArr[2] = fArr[2] + fArr2[2];
            fArr[5] = fArr[5] + fArr2[5];
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        matrix.setValues(fArr);
        return matrix;
    }

    static float d(View view, j jVar) {
        RectF rectF = new RectF();
        i(view, rectF);
        RectF rectF2 = new RectF();
        if (!rectF2.setIntersect(rectF, jVar.f45601c)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float fWidth = rectF.width() * rectF.height();
        float fWidth2 = rectF2.width() * rectF2.height();
        return (fWidth2 / fWidth) * (fWidth2 / (jVar.f45601c.width() * jVar.f45601c.height()));
    }

    static int e(int i11, int i12, float f11) {
        int iRed = Color.red(i11);
        int iGreen = Color.green(i11);
        int iBlue = Color.blue(i11);
        int iAlpha = Color.alpha(i11);
        return Color.argb((int) (iAlpha + ((Color.alpha(i12) - iAlpha) * f11)), (int) (iRed + ((Color.red(i12) - iRed) * f11)), (int) (iGreen + ((Color.green(i12) - iGreen) * f11)), (int) (iBlue + ((Color.blue(i12) - iBlue) * f11)));
    }

    static RectF f(RectF rectF, RectF rectF2, float f11) {
        float f12 = rectF.left;
        float f13 = f12 + ((rectF2.left - f12) * f11);
        float f14 = rectF.top;
        float f15 = f14 + ((rectF2.top - f14) * f11);
        float f16 = rectF.right;
        float f17 = f16 + ((rectF2.right - f16) * f11);
        float f18 = rectF.bottom;
        return new RectF(f13, f15, f17, f18 + ((rectF2.bottom - f18) * f11));
    }

    static j g(j jVar, RectF rectF, j jVar2, RectF rectF2, float f11) {
        j jVar3 = new j();
        jVar3.f45603e = h(jVar, rectF, jVar2, rectF2, f11);
        float f12 = jVar.f45605g;
        jVar3.f45605g = f12 + ((jVar2.f45605g - f12) * f11);
        jVar3.f45604f = e(jVar.f45604f, jVar2.f45604f, f11);
        float f13 = jVar.f45606h;
        jVar3.f45606h = f13 + ((jVar2.f45606h - f13) * f11);
        float f14 = jVar.f45607i;
        jVar3.f45607i = f14 + ((jVar2.f45607i - f14) * f11);
        float f15 = jVar.f45608j;
        jVar3.f45608j = f15 + ((jVar2.f45608j - f15) * f11);
        float f16 = jVar.f45609k;
        jVar3.f45609k = f16 + ((jVar2.f45609k - f16) * f11);
        float f17 = jVar.f45610l;
        jVar3.f45610l = f17 + ((jVar2.f45610l - f17) * f11);
        jVar3.f45611m = e(jVar.f45611m, jVar2.f45611m, f11);
        jVar3.f45612n = jVar.f45612n;
        float f18 = jVar.f45613o;
        jVar3.f45613o = f18 + ((jVar2.f45613o - f18) * f11);
        return jVar3;
    }

    static s h(j jVar, RectF rectF, j jVar2, RectF rectF2, float f11) {
        s sVar = jVar.f45603e;
        s sVar2 = jVar2.f45603e;
        if (sVar == sVar2) {
            return sVar;
        }
        r rVar = new r(sVar, sVar2, new Rect(0, 0, (int) rectF.width(), (int) rectF.height()), new Rect(0, 0, (int) rectF2.width(), (int) rectF2.height()));
        rVar.b(f11);
        return rVar;
    }

    static void i(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    static RectF k(boolean z11, RectF rectF, j jVar, int[] iArr) {
        if (rectF == null) {
            return f45589q;
        }
        if (!z11 || jVar == null) {
            return rectF;
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-iArr[0], -iArr[1]);
        Matrix matrix = new Matrix();
        jVar.f45602d.invert(matrix);
        matrix.mapRect(rectF2);
        rectF2.offset(iArr[0], iArr[1]);
        return rectF2;
    }

    static RectF l(boolean z11, j jVar, int[] iArr) {
        return jVar == null ? f45589q : k(z11, jVar.f45599a, jVar, iArr);
    }

    int a(j jVar) {
        int i11 = this.f45605g != jVar.f45605g ? f45590r : 0;
        if (this.f45604f != jVar.f45604f) {
            i11 += f45592t;
        }
        if (this.f45611m != jVar.f45611m) {
            i11 += f45593u;
        }
        if (this.f45610l != jVar.f45610l) {
            i11 += f45594v;
        }
        if (!this.f45612n.equals(jVar.f45612n)) {
            i11 += f45595w;
        }
        if (this.f45606h != jVar.f45606h) {
            i11 += f45596x;
        }
        if (this.f45607i != jVar.f45607i) {
            i11 += f45597y;
        }
        if (this.f45608j != jVar.f45608j) {
            i11 += f45598z;
        }
        if (this.f45609k != jVar.f45609k) {
            i11 += A;
        }
        if (this.f45613o != jVar.f45613o) {
            i11 += f45591s;
        }
        return !b(this.f45603e, jVar.f45603e) ? i11 + C : i11;
    }

    boolean j() {
        if (this.f45605g <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return this.f45613o > BitmapDescriptorFactory.HUE_RED || Color.alpha(this.f45604f) > 0 || Color.alpha(this.f45611m) > 0;
    }

    j(ReadableMap readableMap, Context context) {
        this.f45599a = new RectF();
        this.f45600b = new Rect();
        this.f45601c = new RectF();
        this.f45602d = new Matrix();
        this.f45603e = s.f90213a;
        this.f45604f = 0;
        this.f45605g = 1.0f;
        this.f45606h = BitmapDescriptorFactory.HUE_RED;
        this.f45607i = BitmapDescriptorFactory.HUE_RED;
        this.f45608j = BitmapDescriptorFactory.HUE_RED;
        this.f45609k = BitmapDescriptorFactory.HUE_RED;
        this.f45610l = BitmapDescriptorFactory.HUE_RED;
        this.f45611m = 0;
        this.f45612n = "solid";
        this.f45613o = BitmapDescriptorFactory.HUE_RED;
        if (readableMap.hasKey("opacity")) {
            this.f45605g = (float) readableMap.getDouble("opacity");
        }
        if (readableMap.hasKey("backgroundColor")) {
            this.f45604f = readableMap.getInt("backgroundColor");
        }
        if (readableMap.hasKey("borderColor")) {
            this.f45611m = readableMap.getInt("borderColor");
        }
        if (readableMap.hasKey("borderWidth")) {
            this.f45610l = w.h((float) readableMap.getDouble("borderWidth"));
        }
        if (readableMap.hasKey("borderStyle")) {
            this.f45612n = readableMap.getString("borderStyle");
        }
        if (readableMap.hasKey("resizeMode")) {
            this.f45603e = com.facebook.react.views.image.d.c(readableMap.getString("resizeMode"));
        }
        if (readableMap.hasKey("elevation")) {
            this.f45613o = w.h((float) readableMap.getDouble("elevation"));
        }
        boolean zI = com.facebook.react.modules.i18nmanager.a.f().i(context);
        if (readableMap.hasKey(Snapshot.BORDER_RADIUS)) {
            float fH = w.h((float) readableMap.getDouble(Snapshot.BORDER_RADIUS));
            this.f45606h = fH;
            this.f45607i = fH;
            this.f45608j = fH;
            this.f45609k = fH;
        }
        if (readableMap.hasKey("borderTopEndRadius")) {
            float fH2 = w.h((float) readableMap.getDouble("borderTopEndRadius"));
            if (zI) {
                this.f45606h = fH2;
            } else {
                this.f45607i = fH2;
            }
        }
        if (readableMap.hasKey("borderTopStartRadius")) {
            float fH3 = w.h((float) readableMap.getDouble("borderTopStartRadius"));
            if (zI) {
                this.f45607i = fH3;
            } else {
                this.f45606h = fH3;
            }
        }
        if (readableMap.hasKey("borderBottomEndRadius")) {
            float fH4 = w.h((float) readableMap.getDouble("borderBottomEndRadius"));
            if (zI) {
                this.f45608j = fH4;
            } else {
                this.f45609k = fH4;
            }
        }
        if (readableMap.hasKey("borderBottomStartRadius")) {
            float fH5 = w.h((float) readableMap.getDouble("borderBottomStartRadius"));
            if (zI) {
                this.f45609k = fH5;
            } else {
                this.f45608j = fH5;
            }
        }
        if (readableMap.hasKey(Snapshot.BORDER_TOP_LEFT_RADIUS)) {
            this.f45606h = w.h((float) readableMap.getDouble(Snapshot.BORDER_TOP_LEFT_RADIUS));
        }
        if (readableMap.hasKey(Snapshot.BORDER_TOP_RIGHT_RADIUS)) {
            this.f45607i = w.h((float) readableMap.getDouble(Snapshot.BORDER_TOP_RIGHT_RADIUS));
        }
        if (readableMap.hasKey(Snapshot.BORDER_BOTTOM_LEFT_RADIUS)) {
            this.f45608j = w.h((float) readableMap.getDouble(Snapshot.BORDER_BOTTOM_LEFT_RADIUS));
        }
        if (readableMap.hasKey(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)) {
            this.f45609k = w.h((float) readableMap.getDouble(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS));
        }
    }
}
