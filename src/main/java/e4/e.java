package e4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import java.io.IOException;
import k3.i3;
import org.xmlpull.v1.XmlPullParserException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import p020r2.l;
import p020r2.o;
import p3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/b;", "c", "(ILr2/l;I)Landroidx/compose/ui/graphics/painter/b;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Lp3/d;", "b", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILr2/l;I)Lp3/d;", "", "path", "Lk3/i3;", "a", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Lk3/i3;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    private static final i3 a(CharSequence charSequence, Resources resources, int i11) {
        try {
            return c.b(i3.INSTANCE, resources, i11);
        } catch (Exception e11) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e11);
        }
    }

    private static final p3.d b(Resources.Theme theme, Resources resources, int i11, int i12, l lVar, int i13) throws XmlPullParserException, IOException {
        if (o.J()) {
            o.S(21855625, i13, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        d dVar = (d) lVar.U(AndroidCompositionLocals_androidKt.h());
        d.Key key = new d.Key(theme, i11);
        d.ImageVectorEntry imageVectorEntryB = dVar.b(key);
        if (imageVectorEntryB == null) {
            XmlResourceParser xml = resources.getXml(i11);
            if (!s.f(q3.c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            imageVectorEntryB = j.a(theme, resources, xml, i12);
            dVar.d(key, imageVectorEntryB);
        }
        p3.d imageVector = imageVectorEntryB.getImageVector();
        if (o.J()) {
            o.R();
        }
        return imageVector;
    }

    public static final androidx.compose.ui.graphics.painter.b c(int i11, l lVar, int i12) {
        androidx.compose.ui.graphics.painter.b bVarG;
        if (o.J()) {
            o.S(473971343, i12, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        lVar.U(AndroidCompositionLocals_androidKt.f());
        Resources resources = context.getResources();
        TypedValue typedValueB = ((g) lVar.U(AndroidCompositionLocals_androidKt.i())).b(resources, i11);
        CharSequence charSequence = typedValueB.string;
        boolean z11 = true;
        if (charSequence == null || !t.m0(charSequence, ".xml", false, 2, null)) {
            lVar.o(-802884675);
            Object theme = context.getTheme();
            boolean zN = lVar.n(charSequence);
            if ((((i12 & 14) ^ 6) <= 4 || !lVar.r(i11)) && (i12 & 6) != 4) {
                z11 = false;
            }
            boolean zN2 = lVar.n(theme) | zN | z11;
            Object objI = lVar.I();
            if (zN2 || objI == l.INSTANCE.a()) {
                objI = a(charSequence, resources, i11);
                lVar.B(objI);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((i3) objI, 0L, 0L, 6, null);
            lVar.l();
            bVarG = bitmapPainter;
        } else {
            lVar.o(-803040357);
            bVarG = q.g(b(context.getTheme(), resources, i11, typedValueB.changingConfigurations, lVar, (i12 << 6) & 896), lVar, 0);
            lVar.l();
        }
        if (o.J()) {
            o.R();
        }
        return bVarG;
    }
}
