package expo.modules.imagepicker;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lexpo/modules/imagepicker/ExpoCropImageActivity;", "Lcom/canhub/cropper/CropImageActivity;", "<init>", "()V", "", "isNight", "Lcom/canhub/cropper/o;", "opts", "Ljn0/h0;", "applyPalette", "(ZLcom/canhub/cropper/o;)V", "getCropOptions", "()Lcom/canhub/cropper/o;", "Ljn0/s;", "", "kotlin.jvm.PlatformType", "invokeSetCustomizations-d1pmJ48", "()Ljava/lang/Object;", "invokeSetCustomizations", "Landroid/view/Menu;", "menu", "tintAllMenuItems", "(Landroid/view/Menu;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "onPrepareOptionsMenu", "", "currentIconColor", "I", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoCropImageActivity extends CropImageActivity {
    private int currentIconColor = -16777216;

    private final void applyPalette(boolean isNight, CropImageOptions opts) {
        ExpoCropImageUtils expoCropImageUtils = ExpoCropImageUtils.INSTANCE;
        Resources.Theme theme = getTheme();
        s.j(theme, "getTheme(...)");
        Resources resources = getResources();
        s.j(resources, "getResources(...)");
        this.currentIconColor = expoCropImageUtils.applyPaletteToOptions(theme, resources, isNight, opts);
        int iIntValue = isNight ? -16777216 : -1;
        Integer num = opts.toolbarColor;
        if (num != null) {
            iIntValue = num.intValue();
        }
        Window window = getWindow();
        s.j(window, "getWindow(...)");
        expoCropImageUtils.applyWindowTheming(window, iIntValue, isNight);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.x(BitmapDescriptorFactory.HUE_RED);
        }
    }

    private final CropImageOptions getCropOptions() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Field declaredField = CropImageActivity.class.getDeclaredField("cropImageOptions");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            objB = jn0.s.b(obj instanceof CropImageOptions ? (CropImageOptions) obj : null);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        return (CropImageOptions) (jn0.s.g(objB) ? null : objB);
    }

    /* JADX INFO: renamed from: invokeSetCustomizations-d1pmJ48, reason: not valid java name */
    private final Object m162invokeSetCustomizationsd1pmJ48() {
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Method declaredMethod = CropImageActivity.class.getDeclaredMethod("setCustomizations", null);
            declaredMethod.setAccessible(true);
            return jn0.s.b(declaredMethod.invoke(this, null));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(th2));
        }
    }

    private final void tintAllMenuItems(Menu menu) {
        Drawable icon;
        Drawable drawableMutate;
        int size = menu.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = menu.getItem(i11);
            if (item != null && (icon = item.getIcon()) != null && (drawableMutate = icon.mutate()) != null) {
                drawableMutate.setTint(this.currentIconColor);
            }
        }
    }

    @Override // com.canhub.cropper.CropImageActivity, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        CropImageOptions cropOptions = getCropOptions();
        if (cropOptions != null) {
            applyPalette((getResources().getConfiguration().uiMode & 48) == 32, cropOptions);
            m162invokeSetCustomizationsd1pmJ48();
            invalidateOptionsMenu();
        }
    }

    @Override // com.canhub.cropper.CropImageActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        s.k(menu, "menu");
        boolean zOnCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        tintAllMenuItems(menu);
        return zOnCreateOptionsMenu;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        s.k(menu, "menu");
        boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        tintAllMenuItems(menu);
        return zOnPrepareOptionsMenu;
    }
}
