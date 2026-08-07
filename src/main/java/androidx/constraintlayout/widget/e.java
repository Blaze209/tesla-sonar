package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class e extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f7086a;

    public e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void c() {
        Log.v("Constraints", " ################# init");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f7086a == null) {
            this.f7086a = new d();
        }
        this.f7086a.q(this);
        return this.f7086a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
        super.setVisibility(8);
    }

    public e(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        c();
        super.setVisibility(8);
    }

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f7087x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f7088y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public float f7089z0;

        public a(int i11, int i12) {
            super(i11, i12);
            this.f7087x0 = 1.0f;
            this.f7088y0 = false;
            this.f7089z0 = BitmapDescriptorFactory.HUE_RED;
            this.A0 = BitmapDescriptorFactory.HUE_RED;
            this.B0 = BitmapDescriptorFactory.HUE_RED;
            this.C0 = BitmapDescriptorFactory.HUE_RED;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = BitmapDescriptorFactory.HUE_RED;
            this.G0 = BitmapDescriptorFactory.HUE_RED;
            this.H0 = BitmapDescriptorFactory.HUE_RED;
            this.I0 = BitmapDescriptorFactory.HUE_RED;
            this.J0 = BitmapDescriptorFactory.HUE_RED;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7087x0 = 1.0f;
            this.f7088y0 = false;
            this.f7089z0 = BitmapDescriptorFactory.HUE_RED;
            this.A0 = BitmapDescriptorFactory.HUE_RED;
            this.B0 = BitmapDescriptorFactory.HUE_RED;
            this.C0 = BitmapDescriptorFactory.HUE_RED;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = BitmapDescriptorFactory.HUE_RED;
            this.G0 = BitmapDescriptorFactory.HUE_RED;
            this.H0 = BitmapDescriptorFactory.HUE_RED;
            this.I0 = BitmapDescriptorFactory.HUE_RED;
            this.J0 = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f7322u4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.f7333v4) {
                    this.f7087x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7087x0);
                } else if (index == i.G4) {
                    this.f7089z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7089z0);
                    this.f7088y0 = true;
                } else if (index == i.D4) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == i.E4) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == i.C4) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == i.A4) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == i.B4) {
                    this.E0 = typedArrayObtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == i.f7344w4) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == i.f7355x4) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == i.f7366y4) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == i.f7377z4) {
                    this.I0 = typedArrayObtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == i.F4) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
