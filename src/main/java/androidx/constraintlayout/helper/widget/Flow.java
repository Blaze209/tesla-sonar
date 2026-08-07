package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.l;
import d5.e;
import d5.g;
import d5.j;
import d5.m;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f6469l;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.b
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f6469l = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.W0) {
                    this.f6469l.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.X0) {
                    this.f6469l.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f7176h1) {
                    this.f6469l.S1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f7187i1) {
                    this.f6469l.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.Y0) {
                    this.f6469l.Q1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.Z0) {
                    this.f6469l.T1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f7097a1) {
                    this.f6469l.R1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f7109b1) {
                    this.f6469l.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.H1) {
                    this.f6469l.N2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f7352x1) {
                    this.f6469l.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.G1) {
                    this.f6469l.M2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f7286r1) {
                    this.f6469l.w2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f7374z1) {
                    this.f6469l.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f7308t1) {
                    this.f6469l.y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.B1) {
                    this.f6469l.G2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f7330v1) {
                    this.f6469l.A2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f7275q1) {
                    this.f6469l.v2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f7363y1) {
                    this.f6469l.D2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f7297s1) {
                    this.f6469l.x2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.A1) {
                    this.f6469l.F2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.E1) {
                    this.f6469l.K2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f7319u1) {
                    this.f6469l.z2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.D1) {
                    this.f6469l.J2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f7341w1) {
                    this.f6469l.B2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.F1) {
                    this.f6469l.L2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.C1) {
                    this.f6469l.H2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6954d = this.f6469l;
        w();
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i11, int i12) {
        x(this.f6469l, i11, i12);
    }

    @Override // androidx.constraintlayout.widget.b
    public void p(d.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray<e> sparseArray) {
        super.p(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            int i11 = bVar.Z;
            if (i11 != -1) {
                gVar.I2(i11);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void q(e eVar, boolean z11) {
        this.f6469l.y1(z11);
    }

    public void setFirstHorizontalBias(float f11) {
        this.f6469l.v2(f11);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i11) {
        this.f6469l.w2(i11);
        requestLayout();
    }

    public void setFirstVerticalBias(float f11) {
        this.f6469l.x2(f11);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i11) {
        this.f6469l.y2(i11);
        requestLayout();
    }

    public void setHorizontalAlign(int i11) {
        this.f6469l.z2(i11);
        requestLayout();
    }

    public void setHorizontalBias(float f11) {
        this.f6469l.A2(f11);
        requestLayout();
    }

    public void setHorizontalGap(int i11) {
        this.f6469l.B2(i11);
        requestLayout();
    }

    public void setHorizontalStyle(int i11) {
        this.f6469l.C2(i11);
        requestLayout();
    }

    public void setLastHorizontalBias(float f11) {
        this.f6469l.D2(f11);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i11) {
        this.f6469l.E2(i11);
        requestLayout();
    }

    public void setLastVerticalBias(float f11) {
        this.f6469l.F2(f11);
        requestLayout();
    }

    public void setLastVerticalStyle(int i11) {
        this.f6469l.G2(i11);
        requestLayout();
    }

    public void setMaxElementsWrap(int i11) {
        this.f6469l.H2(i11);
        requestLayout();
    }

    public void setOrientation(int i11) {
        this.f6469l.I2(i11);
        requestLayout();
    }

    public void setPadding(int i11) {
        this.f6469l.N1(i11);
        requestLayout();
    }

    public void setPaddingBottom(int i11) {
        this.f6469l.O1(i11);
        requestLayout();
    }

    public void setPaddingLeft(int i11) {
        this.f6469l.Q1(i11);
        requestLayout();
    }

    public void setPaddingRight(int i11) {
        this.f6469l.R1(i11);
        requestLayout();
    }

    public void setPaddingTop(int i11) {
        this.f6469l.T1(i11);
        requestLayout();
    }

    public void setVerticalAlign(int i11) {
        this.f6469l.J2(i11);
        requestLayout();
    }

    public void setVerticalBias(float f11) {
        this.f6469l.K2(f11);
        requestLayout();
    }

    public void setVerticalGap(int i11) {
        this.f6469l.L2(i11);
        requestLayout();
    }

    public void setVerticalStyle(int i11) {
        this.f6469l.M2(i11);
        requestLayout();
    }

    public void setWrapMode(int i11) {
        this.f6469l.N2(i11);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.l
    public void x(m mVar, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            mVar.H1(mode, size, mode2, size2);
            setMeasuredDimension(mVar.C1(), mVar.B1());
        }
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
