package expo.modules.imagepicker;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import com.canhub.cropper.CropImageOptions;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lexpo/modules/imagepicker/ExpoCropImageUtils;", "", "<init>", "()V", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "", "attr", "getThemeColor", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;", "resources", "colorResId", "getColorResource", "(Landroid/content/res/Resources;I)Ljava/lang/Integer;", "", "isNight", "Lcom/canhub/cropper/o;", "options", "applyPaletteToOptions", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;ZLcom/canhub/cropper/o;)I", "Landroid/view/Window;", "window", "toolbarColor", "Ljn0/h0;", "applyWindowTheming", "(Landroid/view/Window;IZ)V", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoCropImageUtils {
    public static final ExpoCropImageUtils INSTANCE = new ExpoCropImageUtils();

    private ExpoCropImageUtils() {
    }

    public final int applyPaletteToOptions(Resources.Theme theme, Resources resources, boolean isNight, CropImageOptions options) {
        int iIntValue;
        s.k(theme, "theme");
        s.k(resources, "resources");
        s.k(options, "options");
        Integer themeColor = getThemeColor(theme, R.attr.expoCropToolbarColor);
        if (themeColor == null) {
            themeColor = getColorResource(resources, R.color.expoCropToolbarColor);
        }
        Integer themeColor2 = getThemeColor(theme, R.attr.expoCropToolbarIconColor);
        if (themeColor2 == null) {
            themeColor2 = getColorResource(resources, R.color.expoCropToolbarIconColor);
        }
        Integer themeColor3 = getThemeColor(theme, R.attr.expoCropToolbarActionTextColor);
        if (themeColor3 == null) {
            themeColor3 = getColorResource(resources, R.color.expoCropToolbarActionTextColor);
        }
        Integer themeColor4 = getThemeColor(theme, R.attr.expoCropBackButtonIconColor);
        if (themeColor4 == null) {
            themeColor4 = getColorResource(resources, R.color.expoCropBackButtonIconColor);
        }
        Integer themeColor5 = getThemeColor(theme, R.attr.expoCropBackgroundColor);
        if (themeColor5 == null) {
            themeColor5 = getColorResource(resources, R.color.expoCropBackgroundColor);
        }
        int i11 = isNight ? -16777216 : -1;
        if (themeColor2 != null) {
            iIntValue = themeColor2.intValue();
        } else {
            iIntValue = isNight ? -1 : -16777216;
        }
        options.activityBackgroundColor = themeColor5 != null ? themeColor5.intValue() : i11;
        if (themeColor == null) {
            themeColor = Integer.valueOf(i11);
        }
        options.toolbarColor = themeColor;
        options.toolbarTitleColor = Integer.valueOf(iIntValue);
        if (themeColor4 == null) {
            themeColor4 = Integer.valueOf(iIntValue);
        }
        options.toolbarBackButtonColor = themeColor4;
        options.activityMenuIconColor = iIntValue;
        if (themeColor3 == null) {
            themeColor3 = Integer.valueOf(isNight ? -1 : -16777216);
        }
        options.activityMenuTextColor = themeColor3;
        return iIntValue;
    }

    public final void applyWindowTheming(Window window, int toolbarColor, boolean isNight) {
        s.k(window, "window");
        window.setStatusBarColor(toolbarColor);
        new WindowInsetsControllerCompat(window, window.getDecorView()).g(!isNight);
    }

    public final Integer getColorResource(Resources resources, int colorResId) {
        Object objB;
        s.k(resources, "resources");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Integer.valueOf(resources.getColor(colorResId, null)));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        return (Integer) (jn0.s.g(objB) ? null : objB);
    }

    public final Integer getThemeColor(Resources.Theme theme, int attr) {
        Object objB;
        s.k(theme, "theme");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            TypedValue typedValue = new TypedValue();
            objB = jn0.s.b(theme.resolveAttribute(attr, typedValue, true) ? Integer.valueOf(typedValue.data) : null);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        return (Integer) (jn0.s.g(objB) ? null : objB);
    }
}
