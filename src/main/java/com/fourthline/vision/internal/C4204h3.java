package com.fourthline.vision.internal;

import android.util.Size;
import java.util.Objects;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4204h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f38370a = new a(null);

    /* JADX INFO: renamed from: com.fourthline.vision.internal.h3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final Size adjustSize(float f11, float f12) {
        if (C4204h3.class.isAnonymousClass()) {
            String name = C4204h3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4204h3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (C4204h3.class.isAnonymousClass()) {
            String name2 = C4204h3.class.getName();
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            String simpleName2 = C4204h3.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        float f13 = 16;
        float f14 = f11 - (f11 % f13);
        float f15 = f12 - (f12 % f13);
        if (C4204h3.class.isAnonymousClass()) {
            String name3 = C4204h3.class.getName();
            int length5 = name3.length();
            p013kotlin.jvm.internal.s.h(name3);
            if (length5 > 23) {
                p013kotlin.jvm.internal.s.j(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        } else {
            String simpleName3 = C4204h3.class.getSimpleName();
            int length6 = simpleName3.length();
            p013kotlin.jvm.internal.s.h(simpleName3);
            if (length6 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName3.substring(0, 23), "substring(...)");
            }
        }
        if (C4204h3.class.isAnonymousClass()) {
            String name4 = C4204h3.class.getName();
            int length7 = name4.length();
            p013kotlin.jvm.internal.s.h(name4);
            if (length7 > 23) {
                p013kotlin.jvm.internal.s.j(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        } else {
            String simpleName4 = C4204h3.class.getSimpleName();
            int length8 = simpleName4.length();
            p013kotlin.jvm.internal.s.h(simpleName4);
            if (length8 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName4.substring(0, 23), "substring(...)");
            }
        }
        return new Size((int) f14, (int) f15);
    }

    private final float calculateScaleRatio(Size size, Size size2) {
        float height;
        float fMin = Math.min(size2.getWidth(), 1080.0f);
        float fMin2 = Math.min(size2.getHeight(), 1920.0f);
        if (C4204h3.class.isAnonymousClass()) {
            String name = C4204h3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4204h3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (C4204h3.class.isAnonymousClass()) {
            String name2 = C4204h3.class.getName();
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            String simpleName2 = C4204h3.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        if (size.getWidth() > fMin) {
            height = fMin / size.getWidth();
        } else {
            height = ((float) size.getHeight()) > fMin2 ? fMin2 / size.getHeight() : 1.0f;
        }
        if (C4204h3.class.isAnonymousClass()) {
            String name3 = C4204h3.class.getName();
            int length5 = name3.length();
            p013kotlin.jvm.internal.s.h(name3);
            if (length5 > 23) {
                p013kotlin.jvm.internal.s.j(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        } else {
            String simpleName3 = C4204h3.class.getSimpleName();
            int length6 = simpleName3.length();
            p013kotlin.jvm.internal.s.h(simpleName3);
            if (length6 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName3.substring(0, 23), "substring(...)");
            }
        }
        return height;
    }

    public final Size calculateSize(Size previewSize, Size maxSupportedSize) {
        p013kotlin.jvm.internal.s.k(previewSize, "previewSize");
        p013kotlin.jvm.internal.s.k(maxSupportedSize, "maxSupportedSize");
        float fCalculateScaleRatio = calculateScaleRatio(previewSize, maxSupportedSize);
        Size sizeAdjustSize = adjustSize(previewSize.getWidth() * fCalculateScaleRatio, previewSize.getHeight() * fCalculateScaleRatio);
        if (C4204h3.class.isAnonymousClass()) {
            String name = C4204h3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4204h3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(sizeAdjustSize);
        return sizeAdjustSize;
    }
}
