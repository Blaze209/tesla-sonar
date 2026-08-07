package q6;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s0;
import androidx.core.view.t0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r\"(\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0010*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "Lq6/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "a", "(Landroid/view/View;Lq6/b;)V", "g", "b", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "c", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "e", "(Landroid/view/View;)Z", "h", "(Landroid/view/View;Z)V", "isPoolingContainer", "f", "isWithinPoolingContainer", "Lq6/c;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Lq6/c;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f104846a = d.f104850b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f104847b = d.f104849a;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(View view, b listener) {
        s.k(view, "<this>");
        s.k(listener, "listener");
        d(view).a(listener);
    }

    public static final void b(View view) {
        s.k(view, "<this>");
        Iterator<View> it = t0.b(view).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        s.k(viewGroup, "<this>");
        Iterator<View> it = s0.a(viewGroup).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    private static final c d(View view) {
        int i11 = f104846a;
        c cVar = (c) view.getTag(i11);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i11, cVar2);
        return cVar2;
    }

    public static final boolean e(View view) {
        s.k(view, "<this>");
        Object tag = view.getTag(f104847b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        s.k(view, "<this>");
        for (Object obj : t0.c(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(View view, b listener) {
        s.k(view, "<this>");
        s.k(listener, "listener");
        d(view).c(listener);
    }

    public static final void h(View view, boolean z11) {
        s.k(view, "<this>");
        view.setTag(f104847b, Boolean.valueOf(z11));
    }
}
