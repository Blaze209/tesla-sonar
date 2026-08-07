package zf0;

import android.content.Context;
import android.content.ContextWrapper;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "Landroidx/appcompat/app/c;", "a", "(Landroid/content/Context;)Landroidx/appcompat/app/c;", "b", "camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b0 {
    public static final androidx.appcompat.app.c a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        if (context instanceof androidx.appcompat.app.c) {
            return (androidx.appcompat.app.c) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        p013kotlin.jvm.internal.s.j(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }

    public static final androidx.appcompat.app.c b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        androidx.appcompat.app.c cVarA = a(context);
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
