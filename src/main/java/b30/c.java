package b30;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0082\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lb30/c;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lxa/d;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Lxa/d;", "T", "Landroid/content/Context;", "Lco0/d;", "ownerClass", "b", "(Landroid/content/Context;Lco0/d;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "a", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;", "c", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f16002a = new c();

    private c() {
    }

    private final <T> T b(Context context, co0.d<T> dVar) {
        while (!dVar.j(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (T) co0.e.a(dVar, context);
    }

    private final xa.d d(View view) {
        xa.d dVarA = xa.e.a(view);
        if (dVarA != null) {
            return dVarA;
        }
        Context context = view.getContext();
        s.j(context, "view.context");
        return (xa.d) b(context, o0.b(xa.d.class));
    }

    public final LifecycleOwner a(View view) {
        s.k(view, "view");
        LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(view);
        if (lifecycleOwnerA != null) {
            return lifecycleOwnerA;
        }
        Context context = view.getContext();
        s.j(context, "view.context");
        return (LifecycleOwner) b(context, o0.b(LifecycleOwner.class));
    }

    public final xa.d c(View view) {
        s.k(view, "view");
        xa.d dVarD = d(view);
        if (dVarD != null) {
            return dVarD;
        }
        throw new IllegalStateException(s.t("Expected to find a SavedStateRegistryOwner either in a parent view or the Context of ", view).toString());
    }
}
