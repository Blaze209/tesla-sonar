package com.ijzerenhein.sharedelement;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
class o extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f45643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.b f45644b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45645a;

        static {
            int[] iArr = new int[i.values().length];
            f45645a = iArr;
            try {
                iArr[i.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45645a[i.STRETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45645a[i.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45645a[i.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    o(v0 v0Var) {
        super(v0Var);
        this.f45644b = d.b.NONE;
        d dVar = new d(v0Var);
        this.f45643a = dVar;
        setBackground(dVar);
    }

    void a() {
        setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    void b(RectF rectF, RectF rectF2, RectF rectF3, Rect rect, c cVar, j jVar, float f11, i iVar, com.ijzerenhein.sharedelement.a aVar, float f12) {
        d.b bVarF = this.f45643a.f(cVar, jVar, f12);
        boolean z11 = iVar != i.CLIP && (bVarF == d.b.GENERIC || bVarF == d.b.PLAIN);
        if (this.f45644b != bVarF) {
            this.f45644b = bVarF;
            setLayerType(z11 ? 2 : 0, null);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (z11) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            layout(0, 0, iWidth, iHeight);
            setTranslationX(rectF.left - rectF2.left);
            setTranslationY(rectF.top - rectF2.top);
            float f13 = iWidth;
            float fWidth2 = fWidth / f13;
            float f14 = iHeight;
            float fHeight2 = fHeight / f14;
            if (!Float.isInfinite(fWidth2) && !Float.isNaN(fWidth2) && !Float.isInfinite(fHeight2) && !Float.isNaN(fHeight2)) {
                int i11 = a.f45645a[iVar.ordinal()];
                if (i11 == 3 || i11 == 4) {
                    fWidth2 = f13 / rectF3.width();
                    fHeight2 = f14 / rectF3.height();
                }
                setScaleX(fWidth2);
                setScaleY(fHeight2);
            }
            setPivotX(BitmapDescriptorFactory.HUE_RED);
            setPivotY(BitmapDescriptorFactory.HUE_RED);
        } else {
            layout(0, 0, (int) Math.ceil(fWidth), (int) Math.ceil(fHeight));
            setTranslationX(rectF.left - rectF2.left);
            setTranslationY(rectF.top - rectF2.top);
        }
        setAlpha(f11);
        setElevation(jVar.f45613o);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f45644b == d.b.GENERIC;
    }
}
