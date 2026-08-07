package r90;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.p002activity.ComponentActivity;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "Landroidx/activity/ComponentActivity;", "a", "(Landroid/content/Context;)Landroidx/activity/ComponentActivity;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final ComponentActivity a(Context context) {
        s.k(context, "<this>");
        if (context instanceof ComponentActivity) {
            return (ComponentActivity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            s.j(context, "getBaseContext(...)");
        }
        return null;
    }
}
