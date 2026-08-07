package nj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f95060a = true;

    public static Drawable a(Context context, int i11, Resources.Theme theme) {
        return c(context, context, i11, theme);
    }

    public static Drawable b(Context context, Context context2, int i11) {
        return c(context, context2, i11, null);
    }

    private static Drawable c(Context context, Context context2, int i11, Resources.Theme theme) {
        try {
            if (f95060a) {
                return e(context2, i11, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e11) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e11;
            }
            return androidx.core.content.b.getDrawable(context2, i11);
        } catch (NoClassDefFoundError unused2) {
            f95060a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i11, theme);
    }

    private static Drawable d(Context context, int i11, Resources.Theme theme) {
        return j5.h.f(context.getResources(), i11, theme);
    }

    private static Drawable e(Context context, int i11, Resources.Theme theme) {
        if (theme != null) {
            n.c cVar = new n.c(context, theme);
            cVar.a(theme.getResources().getConfiguration());
            context = cVar;
        }
        return j.a.b(context, i11);
    }
}
