package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d5.a f6857l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void x(d5.e eVar, int i11, boolean z11) {
        this.f6856k = i11;
        if (z11) {
            int i12 = this.f6855j;
            if (i12 == 5) {
                this.f6856k = 1;
            } else if (i12 == 6) {
                this.f6856k = 0;
            }
        } else {
            int i13 = this.f6855j;
            if (i13 == 5) {
                this.f6856k = 0;
            } else if (i13 == 6) {
                this.f6856k = 1;
            }
        }
        if (eVar instanceof d5.a) {
            ((d5.a) eVar).F1(this.f6856k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f6857l.z1();
    }

    public int getMargin() {
        return this.f6857l.B1();
    }

    public int getType() {
        return this.f6855j;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f6857l = new d5.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.f7220l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f7209k1) {
                    this.f6857l.E1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f7231m1) {
                    this.f6857l.G1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6954d = this.f6857l;
        w();
    }

    @Override // androidx.constraintlayout.widget.b
    public void p(d.a aVar, d5.j jVar, ConstraintLayout.b bVar, SparseArray<d5.e> sparseArray) {
        super.p(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof d5.a) {
            d5.a aVar2 = (d5.a) jVar;
            x(aVar2, aVar.f6991e.f7023h0, ((d5.f) jVar.M()).V1());
            aVar2.E1(aVar.f6991e.f7039p0);
            aVar2.G1(aVar.f6991e.f7025i0);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void q(d5.e eVar, boolean z11) {
        x(eVar, this.f6855j, z11);
    }

    public void setAllowsGoneWidget(boolean z11) {
        this.f6857l.E1(z11);
    }

    public void setDpMargin(int i11) {
        this.f6857l.G1((int) ((i11 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i11) {
        this.f6857l.G1(i11);
    }

    public void setType(int i11) {
        this.f6855j = i11;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        super.setVisibility(8);
    }
}
