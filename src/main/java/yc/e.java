package yc;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import java.io.IOException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParserException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\t*\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0018\u00010\rR\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u0019\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)D", "", "g", "(Landroid/content/Context;)J", "", "resId", "Landroid/graphics/drawable/Drawable;", "c", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "theme", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "resources", "f", "(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/Lifecycle;", "e", "(Landroid/content/Context;)Landroidx/lifecycle/Lifecycle;", "b", "(Landroid/content/Context;)Landroid/content/Context;", Kind.APPLICATION, "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final double a(Context context) {
        try {
            Object systemService = androidx.core.content.b.getSystemService(context, ActivityManager.class);
            p013kotlin.jvm.internal.s.h(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Context b(Context context) {
        return context.getApplicationContext();
    }

    public static final Drawable c(Context context, int i11) {
        Drawable drawableB = j.a.b(context, i11);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i11).toString());
    }

    public static final Drawable d(Resources resources, int i11, Resources.Theme theme) {
        Drawable drawableF = j5.h.f(resources, i11, theme);
        if (drawableF != null) {
            return drawableF;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i11).toString());
    }

    public static final Lifecycle e(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getLifecycle();
    }

    @SuppressLint({"ResourceType"})
    public static final Drawable f(Context context, Resources resources, int i11) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i11);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return d(resources, i11, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final long g(Context context) {
        int largeMemoryClass;
        try {
            Object systemService = androidx.core.content.b.getSystemService(context, ActivityManager.class);
            p013kotlin.jvm.internal.s.h(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        return ((long) largeMemoryClass) * 1048576;
    }
}
