package com.fourthline.vision.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r6 f38009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j3.i f38010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f38011c;

    public U3(r6 visionInfoProvider) {
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        this.f38009a = visionInfoProvider;
        this.f38010b = j3.i.INSTANCE.a();
        this.f38011c = k3.n3.c(null, 1, null);
    }

    private final void calculatePreviewHolderRect(j3.i iVar) {
        j3.i iVarB = j3.j.b(j3.g.INSTANCE.c(), j3.n.a(this.f38009a.getPreviewSize().getHeight(), this.f38009a.getPreviewSize().getWidth()));
        float fMax = Math.max(1.0f / (iVarB.o() / iVar.o()), 1.0f / (iVarB.h() / iVar.h()));
        float[] fArrC = k3.n3.c(null, 1, null);
        k3.n3.o(fArrC, fMax, fMax, BitmapDescriptorFactory.HUE_RED, 4, null);
        this.f38010b = k3.n3.h(fArrC, iVarB);
        if (U3.class.isAnonymousClass()) {
            String name = U3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = U3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        iVar.toString();
        if (U3.class.isAnonymousClass()) {
            String name2 = U3.class.getName();
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            String simpleName2 = U3.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        iVarB.toString();
        if (U3.class.isAnonymousClass()) {
            String name3 = U3.class.getName();
            int length5 = name3.length();
            p013kotlin.jvm.internal.s.h(name3);
            if (length5 > 23) {
                p013kotlin.jvm.internal.s.j(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        } else {
            String simpleName3 = U3.class.getSimpleName();
            int length6 = simpleName3.length();
            p013kotlin.jvm.internal.s.h(simpleName3);
            if (length6 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName3.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(this.f38010b);
        if (U3.class.isAnonymousClass()) {
            String name4 = U3.class.getName();
            int length7 = name4.length();
            p013kotlin.jvm.internal.s.h(name4);
            if (length7 > 23) {
                p013kotlin.jvm.internal.s.j(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        } else {
            String simpleName4 = U3.class.getSimpleName();
            int length8 = simpleName4.length();
            p013kotlin.jvm.internal.s.h(simpleName4);
            if (length8 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName4.substring(0, 23), "substring(...)");
            }
        }
        if (U3.class.isAnonymousClass()) {
            String name5 = U3.class.getName();
            int length9 = name5.length();
            p013kotlin.jvm.internal.s.h(name5);
            if (length9 > 23) {
                p013kotlin.jvm.internal.s.j(name5.substring(name5.length() - 23, name5.length()), "substring(...)");
            }
        } else {
            String simpleName5 = U3.class.getSimpleName();
            int length10 = simpleName5.length();
            p013kotlin.jvm.internal.s.h(simpleName5);
            if (length10 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName5.substring(0, 23), "substring(...)");
            }
        }
        if (U3.class.isAnonymousClass()) {
            String name6 = U3.class.getName();
            int length11 = name6.length();
            p013kotlin.jvm.internal.s.h(name6);
            if (length11 <= 23) {
                return;
            }
            p013kotlin.jvm.internal.s.j(name6.substring(name6.length() - 23, name6.length()), "substring(...)");
            return;
        }
        String simpleName6 = U3.class.getSimpleName();
        int length12 = simpleName6.length();
        p013kotlin.jvm.internal.s.h(simpleName6);
        if (length12 <= 23) {
            return;
        }
        p013kotlin.jvm.internal.s.j(simpleName6.substring(0, 23), "substring(...)");
    }

    private final void calculateRecognitionToScreenCoordsMatrix(j3.i iVar) {
        j3.i iVarB = j3.j.b(j3.g.INSTANCE.c(), j3.n.a(this.f38009a.getImageReaderSize().getHeight(), this.f38009a.getImageReaderSize().getWidth()));
        float fH = iVar.o() / iVar.h() < iVarB.o() / iVarB.h() ? iVar.h() / iVarB.h() : iVar.o() / iVarB.o();
        float fO = (iVar.o() - (iVarB.o() * fH)) * 0.5f;
        float fH2 = (iVar.h() - (iVarB.h() * fH)) * 0.5f;
        float[] fArr = this.f38011c;
        k3.n3.s(fArr, fO, fH2, BitmapDescriptorFactory.HUE_RED, 4, null);
        k3.n3.o(fArr, fH, fH, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (U3.class.isAnonymousClass()) {
            String name = U3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = U3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (U3.class.isAnonymousClass()) {
            String name2 = U3.class.getName();
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            String simpleName2 = U3.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        if (U3.class.isAnonymousClass()) {
            String name3 = U3.class.getName();
            int length5 = name3.length();
            p013kotlin.jvm.internal.s.h(name3);
            if (length5 > 23) {
                p013kotlin.jvm.internal.s.j(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        } else {
            String simpleName3 = U3.class.getSimpleName();
            int length6 = simpleName3.length();
            p013kotlin.jvm.internal.s.h(simpleName3);
            if (length6 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName3.substring(0, 23), "substring(...)");
            }
        }
        k3.n3.q(this.f38011c);
        if (U3.class.isAnonymousClass()) {
            String name4 = U3.class.getName();
            int length7 = name4.length();
            p013kotlin.jvm.internal.s.h(name4);
            if (length7 > 23) {
                p013kotlin.jvm.internal.s.j(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        } else {
            String simpleName4 = U3.class.getSimpleName();
            int length8 = simpleName4.length();
            p013kotlin.jvm.internal.s.h(simpleName4);
            if (length8 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName4.substring(0, 23), "substring(...)");
            }
        }
        if (U3.class.isAnonymousClass()) {
            String name5 = U3.class.getName();
            int length9 = name5.length();
            p013kotlin.jvm.internal.s.h(name5);
            if (length9 <= 23) {
                return;
            }
            p013kotlin.jvm.internal.s.j(name5.substring(name5.length() - 23, name5.length()), "substring(...)");
            return;
        }
        String simpleName5 = U3.class.getSimpleName();
        int length10 = simpleName5.length();
        p013kotlin.jvm.internal.s.h(simpleName5);
        if (length10 <= 23) {
            return;
        }
        p013kotlin.jvm.internal.s.j(simpleName5.substring(0, 23), "substring(...)");
    }

    public final j3.i getPreviewHolderRect() {
        return this.f38010b;
    }

    /* JADX INFO: renamed from: getRecognitionToScreenCoordsMatrix-sQKQjiQ, reason: not valid java name */
    public final float[] m89getRecognitionToScreenCoordsMatrixsQKQjiQ() {
        return this.f38011c;
    }

    public final void setPreviewHolderRect(j3.i iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<set-?>");
        this.f38010b = iVar;
    }

    public final void setupTransformations(j3.i screenRect) {
        p013kotlin.jvm.internal.s.k(screenRect, "screenRect");
        calculatePreviewHolderRect(screenRect);
        calculateRecognitionToScreenCoordsMatrix(screenRect);
    }
}
