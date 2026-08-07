package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class g extends ConstraintLayout {
    private int A;
    private st.g B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Runnable f43052z;

    public g(@NonNull Context context) {
        this(context, null);
    }

    private static boolean C(View view) {
        return "skip".equals(view.getTag());
    }

    private void E() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f43052z);
            handler.post(this.f43052z);
        }
    }

    private void y(List<View> list, androidx.constraintlayout.widget.d dVar, int i11) {
        Iterator<View> it = list.iterator();
        float size = BitmapDescriptorFactory.HUE_RED;
        while (it.hasNext()) {
            dVar.t(it.next().getId(), zs.g.f128688c, i11, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable z() {
        st.g gVar = new st.g();
        this.B = gVar;
        gVar.Z(new st.i(0.5f));
        this.B.b0(ColorStateList.valueOf(-1));
        return this.B;
    }

    int A(int i11) {
        return i11 == 2 ? Math.round(this.A * 0.66f) : this.A;
    }

    public int B() {
        return this.A;
    }

    protected void D() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.o(this);
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != zs.g.f128688c && !C(childAt)) {
                int i12 = (Integer) childAt.getTag(zs.g.f128710n);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!map.containsKey(i12)) {
                    map.put(i12, new ArrayList());
                }
                ((List) map.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            y((List) entry.getValue(), dVar, A(((Integer) entry.getKey()).intValue()));
        }
        dVar.i(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.l());
        }
        E();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        D();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        E();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.B.b0(ColorStateList.valueOf(i11));
    }

    public void setRadius(int i11) {
        this.A = i11;
        D();
    }

    public g(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(context).inflate(zs.i.f128748j, this);
        ViewCompat.t0(this, z());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zs.m.S6, i11, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.T6, 0);
        this.f43052z = new Runnable() { // from class: com.google.android.material.timepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f43051a.D();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
