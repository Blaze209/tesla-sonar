package e4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import k3.i3;
import k3.n0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk3/i3$a;", "Landroid/content/res/Resources;", "res", "", "id", "Lk3/i3;", "b", "(Lk3/i3$a;Landroid/content/res/Resources;I)Lk3/i3;", "a", "(Lk3/i3$a;ILr2/l;I)Lk3/i3;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final i3 a(i3.Companion companion, int i11, l lVar, int i12) {
        if (o.J()) {
            o.S(-304919470, i12, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        Object objI = lVar.I();
        l.Companion companion2 = l.INSTANCE;
        if (objI == companion2.a()) {
            objI = new TypedValue();
            lVar.B(objI);
        }
        TypedValue typedValue = (TypedValue) objI;
        context.getResources().getValue(i11, typedValue, true);
        CharSequence charSequence = typedValue.string;
        s.h(charSequence);
        boolean zN = lVar.n(charSequence.toString());
        Object objI2 = lVar.I();
        if (zN || objI2 == companion2.a()) {
            objI2 = b(companion, context.getResources(), i11);
            lVar.B(objI2);
        }
        i3 i3Var = (i3) objI2;
        if (o.J()) {
            o.R();
        }
        return i3Var;
    }

    public static final i3 b(i3.Companion companion, Resources resources, int i11) {
        Drawable drawable = resources.getDrawable(i11, null);
        s.i(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return n0.c(((BitmapDrawable) drawable).getBitmap());
    }
}
