package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
class h extends st.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    b f42880z;

    @TargetApi(18)
    private static class c extends h {
        c(@NonNull b bVar) {
            super(bVar);
        }

        @Override // st.g
        protected void r(@NonNull Canvas canvas) {
            if (this.f42880z.f42881w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f42880z.f42881w);
            } else {
                canvas.clipRect(this.f42880z.f42881w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h r0(@NonNull b bVar) {
        return new c(bVar);
    }

    static h s0(st.k kVar) {
        if (kVar == null) {
            kVar = new st.k();
        }
        return r0(new b(kVar, new RectF()));
    }

    @Override // st.g, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f42880z = new b(this.f42880z);
        return this;
    }

    boolean t0() {
        return !this.f42880z.f42881w.isEmpty();
    }

    void u0() {
        v0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    void v0(float f11, float f12, float f13, float f14) {
        if (f11 == this.f42880z.f42881w.left && f12 == this.f42880z.f42881w.top && f13 == this.f42880z.f42881w.right && f14 == this.f42880z.f42881w.bottom) {
            return;
        }
        this.f42880z.f42881w.set(f11, f12, f13, f14);
        invalidateSelf();
    }

    void w0(@NonNull RectF rectF) {
        v0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private static final class b extends st.g.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NonNull
        private final RectF f42881w;

        @Override // st.g.c, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            h hVarR0 = h.r0(this);
            hVarR0.invalidateSelf();
            return hVarR0;
        }

        private b(@NonNull st.k kVar, @NonNull RectF rectF) {
            super(kVar, null);
            this.f42881w = rectF;
        }

        private b(@NonNull b bVar) {
            super(bVar);
            this.f42881w = bVar.f42881w;
        }
    }

    private h(@NonNull b bVar) {
        super(bVar);
        this.f42880z = bVar;
    }
}
