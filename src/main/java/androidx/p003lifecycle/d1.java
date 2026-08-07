package androidx.p003lifecycle;

import kotlinx.coroutines.CoroutineScope;
import o7.a;
import o7.b;
import o7.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"Lo7/e;", "a", "Lo7/e;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/c1;", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/lifecycle/c1;)Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f8783a = new e();

    public static final CoroutineScope a(c1 c1Var) {
        a aVarB;
        s.k(c1Var, "<this>");
        synchronized (f8783a) {
            aVarB = (a) c1Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVarB == null) {
                aVarB = b.b();
                c1Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVarB);
            }
        }
        return aVarB;
    }
}
