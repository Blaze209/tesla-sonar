package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
public class LinearProgressIndicator extends a<n> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f42464p = zs.l.E;

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void r() {
        k kVar = new k((n) this.f42466a);
        setIndeterminateDrawable(j.u(getContext(), (n) this.f42466a, kVar));
        setProgressDrawable(f.w(getContext(), (n) this.f42466a, kVar));
    }

    public int getIndeterminateAnimationType() {
        return ((n) this.f42466a).f42573h;
    }

    public int getIndicatorDirection() {
        return ((n) this.f42466a).f42574i;
    }

    public int getTrackStopIndicatorSize() {
        return ((n) this.f42466a).f42576k;
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        S s11 = this.f42466a;
        n nVar = (n) s11;
        boolean z12 = true;
        if (((n) s11).f42574i != 1 && ((ViewCompat.A(this) != 1 || ((n) this.f42466a).f42574i != 2) && (ViewCompat.A(this) != 0 || ((n) this.f42466a).f42574i != 3))) {
            z12 = false;
        }
        nVar.f42575j = z12;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        int paddingLeft = i11 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i12 - (getPaddingTop() + getPaddingBottom());
        j<n> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        f<n> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public n i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i11) {
        if (((n) this.f42466a).f42573h == i11) {
            return;
        }
        if (p() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s11 = this.f42466a;
        ((n) s11).f42573h = i11;
        ((n) s11).e();
        if (i11 == 0) {
            getIndeterminateDrawable().y(new l((n) this.f42466a));
        } else {
            getIndeterminateDrawable().y(new m(getContext(), (n) this.f42466a));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((n) this.f42466a).e();
    }

    public void setIndicatorDirection(int i11) {
        S s11 = this.f42466a;
        ((n) s11).f42574i = i11;
        n nVar = (n) s11;
        boolean z11 = true;
        if (i11 != 1 && ((ViewCompat.A(this) != 1 || ((n) this.f42466a).f42574i != 2) && (ViewCompat.A(this) != 0 || i11 != 3))) {
            z11 = false;
        }
        nVar.f42575j = z11;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setProgressCompat(int i11, boolean z11) {
        S s11 = this.f42466a;
        if (s11 != 0 && ((n) s11).f42573h == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i11, z11);
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i11) {
        super.setTrackCornerRadius(i11);
        ((n) this.f42466a).e();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i11) {
        S s11 = this.f42466a;
        if (((n) s11).f42576k != i11) {
            ((n) s11).f42576k = Math.min(i11, ((n) s11).f42484a);
            ((n) this.f42466a).e();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.I);
    }

    public LinearProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, f42464p);
        r();
    }
}
