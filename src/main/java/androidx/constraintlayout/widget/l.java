package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d5.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7400k;

    public l(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.f7121c1) {
                    this.f7399j = true;
                } else if (index == i.f7198j1) {
                    this.f7400k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7399j || this.f7400k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i11 = 0; i11 < this.f6952b; i11++) {
                    View viewM = constraintLayout.m(this.f6951a[i11]);
                    if (viewM != null) {
                        if (this.f7399j) {
                            viewM.setVisibility(visibility);
                        }
                        if (this.f7400k && elevation > BitmapDescriptorFactory.HUE_RED) {
                            viewM.setTranslationZ(viewM.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        h();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public l(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    public void x(m mVar, int i11, int i12) {
    }
}
