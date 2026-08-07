package androidx.media3.ui;

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

/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<r7.a> f12750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ia.a f12751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f12753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f12758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f12759j;

    interface a {
        void a(List<r7.a> list, ia.a aVar, float f11, int i11, float f12);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private r7.a a(r7.a aVar) {
        r7.a.b bVarA = aVar.a();
        if (!this.f12755f) {
            f0.c(bVarA);
        } else if (!this.f12756g) {
            f0.d(bVarA);
        }
        return bVarA.a();
    }

    private void b(int i11, float f11) {
        this.f12752c = i11;
        this.f12753d = f11;
        c();
    }

    private void c() {
        this.f12758i.a(getCuesWithStylingPreferencesApplied(), this.f12751b, this.f12753d, this.f12752c, this.f12754e);
    }

    private List<r7.a> getCuesWithStylingPreferencesApplied() {
        if (this.f12755f && this.f12756g) {
            return this.f12750a;
        }
        ArrayList arrayList = new ArrayList(this.f12750a.size());
        for (int i11 = 0; i11 < this.f12750a.size(); i11++) {
            arrayList.add(a(this.f12750a.get(i11)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private ia.a getUserCaptionStyle() {
        if (isInEditMode()) {
            return ia.a.f77178g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? ia.a.f77178g : ia.a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t11) {
        removeView(this.f12759j);
        View view = this.f12759j;
        if (view instanceof h0) {
            ((h0) view).g();
        }
        this.f12759j = t11;
        this.f12758i = t11;
        addView(t11);
    }

    public void setApplyEmbeddedFontSizes(boolean z11) {
        this.f12756g = z11;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z11) {
        this.f12755f = z11;
        c();
    }

    public void setBottomPaddingFraction(float f11) {
        this.f12754e = f11;
        c();
    }

    public void setCues(List<r7.a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f12750a = list;
        c();
    }

    public void setFixedTextSize(int i11, float f11) {
        Context context = getContext();
        b(2, TypedValue.applyDimension(i11, f11, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f11) {
        setFractionalTextSize(f11, false);
    }

    public void setStyle(ia.a aVar) {
        this.f12751b = aVar;
        c();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i11) {
        if (this.f12757h == i11) {
            return;
        }
        if (i11 == 1) {
            setView(new androidx.media3.ui.a(getContext()));
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new h0(getContext()));
        }
        this.f12757h = i11;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12750a = Collections.EMPTY_LIST;
        this.f12751b = ia.a.f77178g;
        this.f12752c = 0;
        this.f12753d = 0.0533f;
        this.f12754e = 0.08f;
        this.f12755f = true;
        this.f12756g = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context);
        this.f12758i = aVar;
        this.f12759j = aVar;
        addView(aVar);
        this.f12757h = 1;
    }

    public void setFractionalTextSize(float f11, boolean z11) {
        b(z11 ? 1 : 0, f11);
    }
}
