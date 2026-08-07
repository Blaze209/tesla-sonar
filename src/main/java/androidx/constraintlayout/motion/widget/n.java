package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class n extends androidx.constraintlayout.widget.b implements p.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected View[] f6634m;

    public n(Context context) {
        super(context);
        this.f6631j = false;
        this.f6632k = false;
    }

    public void A(p pVar) {
    }

    public void B(Canvas canvas) {
    }

    public void C(Canvas canvas) {
    }

    public void D(p pVar, HashMap<View, m> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void a(p pVar, int i11, int i12, float f11) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void b(p pVar, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void c(p pVar, int i11, int i12) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void d(p pVar, int i11, boolean z11, float f11) {
    }

    public float getProgress() {
        return this.f6633l;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f7194i8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == androidx.constraintlayout.widget.i.f7216k8) {
                    this.f6631j = typedArrayObtainStyledAttributes.getBoolean(index, this.f6631j);
                } else if (index == androidx.constraintlayout.widget.i.f7205j8) {
                    this.f6632k = typedArrayObtainStyledAttributes.getBoolean(index, this.f6632k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(View view, float f11) {
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return this.f6632k;
    }

    public boolean z() {
        return this.f6631j;
    }

    public void setProgress(float f11) {
        this.f6633l = f11;
        int i11 = 0;
        if (this.f6952b > 0) {
            this.f6634m = n((ConstraintLayout) getParent());
            while (i11 < this.f6952b) {
                setProgress(this.f6634m[i11], f11);
                i11++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i11 < childCount) {
            View childAt = viewGroup.getChildAt(i11);
            if (!(childAt instanceof n)) {
                setProgress(childAt, f11);
            }
            i11++;
        }
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6631j = false;
        this.f6632k = false;
        o(attributeSet);
    }

    public n(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6631j = false;
        this.f6632k = false;
        o(attributeSet);
    }
}
