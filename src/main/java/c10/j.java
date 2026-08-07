package c10;

import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/core/view/WindowInsetsAnimationCompat;", "", "a", "(Landroidx/core/view/WindowInsetsAnimationCompat;)Z", "isKeyboardAnimation", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {
    public static final boolean a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        s.k(windowInsetsAnimationCompat, "<this>");
        return (windowInsetsAnimationCompat.c() & WindowInsetsCompat.n.c()) != 0;
    }
}
