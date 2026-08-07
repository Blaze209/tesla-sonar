package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a0> f40807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<gs.b> f40808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f40810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private rs.b f40811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f40812f;

    public a(Context context) {
        this(context, null);
    }

    private static gs.b b(gs.b bVar) {
        gs.b.C1421b c1421bP = bVar.b().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (bVar.f69478f == 0) {
            c1421bP.h(1.0f - bVar.f69477e, 0);
        } else {
            c1421bP.h((-bVar.f69477e) - 1.0f, 1);
        }
        int i11 = bVar.f69479g;
        if (i11 == 0) {
            c1421bP.i(2);
        } else if (i11 == 2) {
            c1421bP.i(0);
        }
        return c1421bP.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<gs.b> list, rs.b bVar, float f11, int i11, float f12) {
        this.f40808b = list;
        this.f40811e = bVar;
        this.f40810d = f11;
        this.f40809c = i11;
        this.f40812f = f12;
        while (this.f40807a.size() < list.size()) {
            this.f40807a.add(new a0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<gs.b> list = this.f40808b;
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
        float f11 = d0.f(this.f40809c, this.f40810d, height, i11);
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            gs.b bVarB = list.get(i12);
            if (bVarB.f69488p != Integer.MIN_VALUE) {
                bVarB = b(bVarB);
            }
            this.f40807a.get(i12).b(bVarB, this.f40811e, f11, d0.f(bVarB.f69486n, bVarB.f69487o, height, i11), this.f40812f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40807a = new ArrayList();
        this.f40808b = Collections.EMPTY_LIST;
        this.f40809c = 0;
        this.f40810d = 0.0533f;
        this.f40811e = rs.b.f109074g;
        this.f40812f = 0.08f;
    }
}
