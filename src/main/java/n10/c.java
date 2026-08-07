package n10;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import bo0.n;
import com.reactnativekeyboardcontroller.d;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0001*\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\"/\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "", "styleResId", "Ln10/a;", "a", "(Landroid/content/Context;I)Ln10/a;", "color", "shift", "c", "(II)I", "Lcom/facebook/react/uimanager/v0;", "b", "(Lcom/facebook/react/uimanager/v0;)I", "", "", "Lkotlin/Pair;", "Ljava/util/Map;", "getImeColorMap", "()Ljava/util/Map;", "imeColorMap", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Pair<Integer, Integer>> f92652a = v0.m(x.a("com.android.inputmethod.latin", x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48663a), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48663a))), x.a("com.google.android.inputmethod.latin", x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48665c), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48664b))), x.a("com.touchtype.swiftkey", x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48671i), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48670h))), x.a("com.google.android.googlequicksearchbox", x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48667e), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48666d))), x.a("com.google.android.tts", x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48667e), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48666d))), x.a("ru.yandex.androidkeyboard", x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48673k), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48672j))), x.a("com.samsung.android.honeyboard", x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48669g), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48668f))));

    public static final ColorProperties a(Context context, int i11) {
        s.k(context, "<this>");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, d.f48674a);
        s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return new ColorProperties(typedArrayObtainStyledAttributes.getColor(d.f48675b, -16777216), typedArrayObtainStyledAttributes.getInt(d.f48676c, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final int b(com.facebook.react.uimanager.v0 v0Var) {
        s.k(v0Var, "<this>");
        String strA = c10.a.a(v0Var);
        boolean zC = c10.a.c(v0Var);
        g10.a.b(g10.a.f67023a, "Skins", "Current IME: " + strA, null, 4, null);
        Pair<Integer, Integer> pairA = f92652a.get(strA);
        if (pairA == null) {
            pairA = x.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f48665c), Integer.valueOf(com.reactnativekeyboardcontroller.c.f48664b));
        }
        int iIntValue = pairA.a().intValue();
        int iIntValue2 = pairA.b().intValue();
        if (zC && Build.VERSION.SDK_INT > 29) {
            iIntValue = iIntValue2;
        }
        return a(v0Var, iIntValue).a();
    }

    public static final int c(int i11, int i12) {
        return Color.argb(Color.alpha(i11), n.n(Color.red(i11) + i12, 0, 255), n.n(Color.green(i11) + i12, 0, 255), n.n(Color.blue(i11) + i12, 0, 255));
    }
}
