package f;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.l;
import p020r2.o;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lf/f;", "", "<init>", "()V", "Lr2/g2;", "Lh/d;", "b", "Lr2/g2;", "LocalComposition", "a", "(Lr2/l;I)Lh/d;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f63714a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g2<h.d> LocalComposition = w.d(null, a.f63717c, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63716c = 0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh/d;", "b", "()Lh/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f63717c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h.d invoke() {
            return null;
        }
    }

    private f() {
    }

    public final h.d a(l lVar, int i11) {
        if (o.J()) {
            o.S(1418020823, i11, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        h.d dVar = (h.d) lVar.U(LocalComposition);
        if (dVar == null) {
            lVar.o(1006590171);
            Object baseContext = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof h.d) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            dVar = (h.d) baseContext;
        } else {
            lVar.o(1006589303);
        }
        lVar.l();
        if (o.J()) {
            o.R();
        }
        return dVar;
    }
}
