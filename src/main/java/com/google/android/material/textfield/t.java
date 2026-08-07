package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class t {
    static void a(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = l5.a.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                l5.a.o(drawable, colorStateList);
            } else {
                l5.a.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                l5.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static ImageView.ScaleType b(int i11) {
        if (i11 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i11 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i11 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i11 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i11 != 5) {
            return i11 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    private static int[] c(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void d(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = l5.a.r(drawable).mutate();
        l5.a.o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    static void e(@NonNull CheckableImageButton checkableImageButton) {
    }

    private static void f(@NonNull CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zP = ViewCompat.P(checkableImageButton);
        boolean z11 = onLongClickListener != null;
        boolean z12 = zP || z11;
        checkableImageButton.setFocusable(z12);
        checkableImageButton.setClickable(zP);
        checkableImageButton.setPressable(zP);
        checkableImageButton.setLongClickable(z11);
        ViewCompat.z0(checkableImageButton, z12 ? 1 : 2);
    }

    static void g(@NonNull CheckableImageButton checkableImageButton, int i11) {
        checkableImageButton.setMinimumWidth(i11);
        checkableImageButton.setMinimumHeight(i11);
    }

    static void h(@NonNull CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(@NonNull CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(@NonNull CheckableImageButton checkableImageButton, @NonNull ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
