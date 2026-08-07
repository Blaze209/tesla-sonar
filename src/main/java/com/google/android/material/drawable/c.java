package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    private static class a {
        static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class b {
        static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    public static Drawable b(Drawable drawable, Drawable drawable2, int i11, int i12) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i11 == -1) {
            i11 = i(drawable, drawable2);
        }
        if (i12 == -1) {
            i12 = h(drawable, drawable2);
        }
        if (i11 > drawable.getIntrinsicWidth() || i12 > drawable.getIntrinsicHeight()) {
            float f11 = i11 / i12;
            if (f11 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i12 = (int) (intrinsicWidth / f11);
                i11 = intrinsicWidth;
            } else {
                i12 = drawable.getIntrinsicHeight();
                i11 = (int) (f11 * i12);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i11, i12);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    public static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    private static Drawable e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z11) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z11) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = l5.a.r(drawable).mutate();
        if (mode != null) {
            l5.a.p(drawableMutate, mode);
        }
        return drawableMutate;
    }

    @NonNull
    public static int[] f(@NonNull int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 == 16842912) {
                return iArr;
            }
            if (i12 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i11] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static ColorStateList g(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !com.google.android.material.drawable.a.a(drawable)) {
            return null;
        }
        return com.google.android.material.drawable.b.a(drawable).getColorStateList();
    }

    private static int h(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int i(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    @NonNull
    public static int[] j(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != 16842912) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    @NonNull
    public static AttributeSet k(@NonNull Context context, int i11, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i11);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e11) {
            e = e11;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e12) {
            e = e12;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void l(@NonNull Outline outline, @NonNull Path path) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i11 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    public static PorterDuffColorFilter m(@NonNull Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
