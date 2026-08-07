package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<gs.b> f40797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rs.b f40798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f40800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f40801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f40805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f40806j;

    interface a {
        void a(List<gs.b> list, rs.b bVar, float f11, int i11, float f12);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private gs.b a(gs.b bVar) {
        gs.b.C1421b c1421bB = bVar.b();
        if (!this.f40802f) {
            d0.c(c1421bB);
        } else if (!this.f40803g) {
            d0.d(c1421bB);
        }
        return c1421bB.a();
    }

    private void b(int i11, float f11) {
        this.f40799c = i11;
        this.f40800d = f11;
        c();
    }

    private void c() {
        this.f40805i.a(getCuesWithStylingPreferencesApplied(), this.f40798b, this.f40800d, this.f40799c, this.f40801e);
    }

    private List<gs.b> getCuesWithStylingPreferencesApplied() {
        if (this.f40802f && this.f40803g) {
            return this.f40797a;
        }
        ArrayList arrayList = new ArrayList(this.f40797a.size());
        for (int i11 = 0; i11 < this.f40797a.size(); i11++) {
            arrayList.add(a(this.f40797a.get(i11)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (p0.f115040a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private rs.b getUserCaptionStyle() {
        if (p0.f115040a < 19 || isInEditMode()) {
            return rs.b.f109074g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? rs.b.f109074g : rs.b.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t11) {
        removeView(this.f40806j);
        View view = this.f40806j;
        if (view instanceof f0) {
            ((f0) view).g();
        }
        this.f40806j = t11;
        this.f40805i = t11;
        addView(t11);
    }

    public void setApplyEmbeddedFontSizes(boolean z11) {
        this.f40803g = z11;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z11) {
        this.f40802f = z11;
        c();
    }

    public void setBottomPaddingFraction(float f11) {
        this.f40801e = f11;
        c();
    }

    public void setCues(List<gs.b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f40797a = list;
        c();
    }

    public void setFixedTextSize(int i11, float f11) {
        Context context = getContext();
        b(2, TypedValue.applyDimension(i11, f11, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f11) {
        setFractionalTextSize(f11, false);
    }

    public void setStyle(rs.b bVar) {
        this.f40798b = bVar;
        c();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i11) {
        if (this.f40804h == i11) {
            return;
        }
        if (i11 == 1) {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new f0(getContext()));
        }
        this.f40804h = i11;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40797a = Collections.EMPTY_LIST;
        this.f40798b = rs.b.f109074g;
        this.f40799c = 0;
        this.f40800d = 0.0533f;
        this.f40801e = 0.08f;
        this.f40802f = true;
        this.f40803g = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f40805i = aVar;
        this.f40806j = aVar;
        addView(aVar);
        this.f40804h = 1;
    }

    public void setFractionalTextSize(float f11, boolean z11) {
        b(z11 ? 1 : 0, f11);
    }
}
