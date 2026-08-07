package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class q extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f2791a;

    public q(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        Bitmap bitmapB = this.f2791a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i11, 0), getMeasuredHeight());
        }
    }

    public q(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.K);
    }

    public q(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        w0.a(this, getContext());
        o oVar = new o(this);
        this.f2791a = oVar;
        oVar.c(attributeSet, i11);
    }
}
