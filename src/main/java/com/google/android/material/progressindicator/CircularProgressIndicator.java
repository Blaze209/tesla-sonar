package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class CircularProgressIndicator extends a<e> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f42463p = zs.l.A;

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void r() {
        c cVar = new c((e) this.f42466a);
        setIndeterminateDrawable(j.t(getContext(), (e) this.f42466a, cVar));
        setProgressDrawable(f.v(getContext(), (e) this.f42466a, cVar));
    }

    public int getIndicatorDirection() {
        return ((e) this.f42466a).f42513j;
    }

    public int getIndicatorInset() {
        return ((e) this.f42466a).f42512i;
    }

    public int getIndicatorSize() {
        return ((e) this.f42466a).f42511h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public e i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public void setIndicatorDirection(int i11) {
        ((e) this.f42466a).f42513j = i11;
        invalidate();
    }

    public void setIndicatorInset(int i11) {
        S s11 = this.f42466a;
        if (((e) s11).f42512i != i11) {
            ((e) s11).f42512i = i11;
            invalidate();
        }
    }

    public void setIndicatorSize(int i11) {
        int iMax = Math.max(i11, getTrackThickness() * 2);
        S s11 = this.f42466a;
        if (((e) s11).f42511h != iMax) {
            ((e) s11).f42511h = iMax;
            ((e) s11).e();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i11) {
        super.setTrackThickness(i11);
        ((e) this.f42466a).e();
    }

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128575k);
    }

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, f42463p);
        r();
    }
}
