package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f42361n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f42362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f42363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42364c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42366e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42373l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42365d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f42367f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42368g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f42369h = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f42370i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42371j = f42361n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42372k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f42374m = null;

    static class a extends Exception {
    }

    private v(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f42362a = charSequence;
        this.f42363b = textPaint;
        this.f42364c = i11;
        this.f42366e = charSequence.length();
    }

    @NonNull
    public static v b(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i11) {
        return new v(charSequence, textPaint, i11);
    }

    public StaticLayout a() {
        if (this.f42362a == null) {
            this.f42362a = "";
        }
        int iMax = Math.max(0, this.f42364c);
        CharSequence charSequenceEllipsize = this.f42362a;
        if (this.f42368g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f42363b, iMax, this.f42374m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f42366e);
        this.f42366e = iMin;
        if (this.f42373l && this.f42368g == 1) {
            this.f42367f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f42365d, iMin, this.f42363b, iMax);
        builderObtain.setAlignment(this.f42367f);
        builderObtain.setIncludePad(this.f42372k);
        builderObtain.setTextDirection(this.f42373l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f42374m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f42368g);
        float f11 = this.f42369h;
        if (f11 != BitmapDescriptorFactory.HUE_RED || this.f42370i != 1.0f) {
            builderObtain.setLineSpacing(f11, this.f42370i);
        }
        if (this.f42368g > 1) {
            builderObtain.setHyphenationFrequency(this.f42371j);
        }
        return builderObtain.build();
    }

    @NonNull
    public v c(@NonNull Layout.Alignment alignment) {
        this.f42367f = alignment;
        return this;
    }

    @NonNull
    public v d(TextUtils.TruncateAt truncateAt) {
        this.f42374m = truncateAt;
        return this;
    }

    @NonNull
    public v e(int i11) {
        this.f42371j = i11;
        return this;
    }

    @NonNull
    public v f(boolean z11) {
        this.f42372k = z11;
        return this;
    }

    public v g(boolean z11) {
        this.f42373l = z11;
        return this;
    }

    @NonNull
    public v h(float f11, float f12) {
        this.f42369h = f11;
        this.f42370i = f12;
        return this;
    }

    @NonNull
    public v i(int i11) {
        this.f42368g = i11;
        return this;
    }

    @NonNull
    public v j(w wVar) {
        return this;
    }
}
