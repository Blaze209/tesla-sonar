package ec;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicReference;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR\u0013\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lec/c0;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lec/r;", "a", "(Landroid/content/Context;)Lec/r;", "c", "Lkotlinx/atomicfu/AtomicRef;", "reference", "coil_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f62461a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReference f62462b = new AtomicReference(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lec/c0$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lec/r;", "a", "(Landroid/content/Context;)Lec/r;", "coil_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        r a(Context context);
    }

    private c0() {
    }

    public static final r a(Context context) {
        c0 c0Var = f62461a;
        Object obj = c0Var.b().get();
        r rVar = obj instanceof r ? (r) obj : null;
        return rVar == null ? c0Var.c(context) : rVar;
    }

    private final /* synthetic */ AtomicReference b() {
        return f62462b;
    }

    private final r c(Context context) {
        r rVar;
        AtomicReference atomicReferenceB = b();
        r rVarA = null;
        while (true) {
            Object obj = atomicReferenceB.get();
            if (obj instanceof r) {
                rVar = rVarA;
                rVarA = (r) obj;
            } else {
                if (rVarA == null) {
                    a aVar = obj instanceof a ? (a) obj : null;
                    if (aVar == null || (rVarA = aVar.a(context)) == null) {
                        a aVarA = f0.a(context);
                        rVarA = aVarA != null ? aVarA.a(context) : e0.f62465a.a(context);
                    }
                }
                rVar = rVarA;
            }
            if (androidx.camera.view.i.a(atomicReferenceB, obj, rVarA)) {
                p013kotlin.jvm.internal.s.i(rVarA, "null cannot be cast to non-null type coil3.ImageLoader");
                return rVarA;
            }
            rVarA = rVar;
        }
    }
}
