package kf;

import android.content.Context;
import android.view.LayoutInflater;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkf/q;", "", "Lkf/f;", "viewType", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkf/e;", "a", "(Lkf/f;Landroid/content/Context;)Lkf/e;", "Landroid/view/LayoutInflater;", "layoutInflater", "b", "(Lkf/f;Landroid/view/LayoutInflater;)Lkf/e;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface q {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static e a(q qVar, f viewType, LayoutInflater layoutInflater) {
            p013kotlin.jvm.internal.s.k(viewType, "viewType");
            p013kotlin.jvm.internal.s.k(layoutInflater, "layoutInflater");
            Context context = layoutInflater.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            return qVar.a(viewType, context);
        }
    }

    e a(f viewType, Context context);

    e b(f viewType, LayoutInflater layoutInflater);
}
