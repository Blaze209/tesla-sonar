package z30;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroid/app/Application;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroid/app/Application;", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final Application a(CreationExtras creationExtras) {
        s.k(creationExtras, "<this>");
        Object objA = creationExtras.a(ViewModelProvider.a.f8735h);
        if (objA != null) {
            return (Application) objA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
