package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c0> f12776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<r7.a> f12777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f12779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ia.a f12780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f12781f;

    public a(Context context) {
        this(context, null);
    }

    private static r7.a b(r7.a aVar) {
        r7.a.b bVarP = aVar.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (aVar.f107071f == 0) {
            bVarP.h(1.0f - aVar.f107070e, 0);
        } else {
            bVarP.h((-aVar.f107070e) - 1.0f, 1);
        }
        int i11 = aVar.f107072g;
        if (i11 == 0) {
            bVarP.i(2);
        } else if (i11 == 2) {
            bVarP.i(0);
        }
        return bVarP.a();
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<r7.a> list, ia.a aVar, float f11, int i11, float f12) {
        this.f12777b = list;
        this.f12780e = aVar;
        this.f12779d = f11;
        this.f12778c = i11;
        this.f12781f = f12;
        while (this.f12776a.size() < list.size()) {
            this.f12776a.add(new c0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<r7.a> list = this.f12777b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i11 = paddingBottom - paddingTop;
        float f11 = f0.f(this.f12778c, this.f12779d, height, i11);
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            r7.a aVarB = list.get(i12);
            if (aVarB.f107081p != Integer.MIN_VALUE) {
                aVarB = b(aVarB);
            }
            this.f12776a.get(i12).b(aVarB, this.f12780e, f11, f0.f(aVarB.f107079n, aVarB.f107080o, height, i11), this.f12781f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12776a = new ArrayList();
        this.f12777b = Collections.EMPTY_LIST;
        this.f12778c = 0;
        this.f12779d = 0.0533f;
        this.f12780e = ia.a.f77178g;
        this.f12781f = 0.08f;
    }
}
