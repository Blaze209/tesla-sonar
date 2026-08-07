package p014n4;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import w4.a;
import w4.d;
import w4.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln4/b1;", "", "<init>", "()V", "Ln4/e0$d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Landroid/graphics/fonts/FontVariationAxis;", DateTokenConverter.CONVERTER_KEY, "(Ln4/e0$d;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "variationSettings", "Landroid/graphics/Typeface;", "a", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/Context;Ln4/e0$d;)Landroid/graphics/Typeface;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "b", "(Ljava/io/File;Landroid/content/Context;Ln4/e0$d;)Landroid/graphics/Typeface;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "c", "(Landroid/os/ParcelFileDescriptor;Landroid/content/Context;Ln4/e0$d;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f92887a = new b1();

    private b1() {
    }

    private final FontVariationAxis[] d(e0.d dVar, Context context) {
        d dVarA;
        if (context != null) {
            dVarA = a.a(context);
        } else {
            if (dVar.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            dVarA = f.a(1.0f, 1.0f);
        }
        List<e0.a> listB = dVar.b();
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i11 = 0; i11 < size; i11++) {
            e0.a aVar = listB.get(i11);
            y0.a();
            arrayList.add(x0.a(aVar.getAxisName(), aVar.c(dVarA)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    public final Typeface a(AssetManager assetManager, String path, Context context, e0.d variationSettings) {
        if (context == null) {
            return null;
        }
        return w0.a(assetManager, path).setFontVariationSettings(d(variationSettings, context)).build();
    }

    public final Typeface b(File file, Context context, e0.d variationSettings) {
        if (context == null) {
            return null;
        }
        return v0.a(file).setFontVariationSettings(d(variationSettings, context)).build();
    }

    public final Typeface c(ParcelFileDescriptor fileDescriptor, Context context, e0.d variationSettings) {
        if (context == null) {
            return null;
        }
        a1.a();
        return z0.a(fileDescriptor.getFileDescriptor()).setFontVariationSettings(d(variationSettings, context)).build();
    }
}
