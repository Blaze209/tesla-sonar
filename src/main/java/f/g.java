package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.C2796i0;
import androidx.p002activity.e0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.l;
import p020r2.o;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lf/g;", "", "<init>", "()V", "Lr2/g2;", "Landroidx/activity/e0;", "b", "Lr2/g2;", "LocalOnBackPressedDispatcherOwner", "a", "(Lr2/l;I)Landroidx/activity/e0;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f63718a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g2<e0> LocalOnBackPressedDispatcherOwner = w.d(null, a.f63721c, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63720c = 0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/e0;", "b", "()Landroidx/activity/e0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<e0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f63721c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return null;
        }
    }

    private g() {
    }

    public final e0 a(l lVar, int i11) {
        if (o.J()) {
            o.S(-2068013981, i11, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        e0 e0VarA = (e0) lVar.U(LocalOnBackPressedDispatcherOwner);
        if (e0VarA == null) {
            lVar.o(544166745);
            e0VarA = C2796i0.a((View) lVar.U(AndroidCompositionLocals_androidKt.k()));
            lVar.l();
        } else {
            lVar.o(544164296);
            lVar.l();
        }
        if (e0VarA == null) {
            lVar.o(544168748);
            Object baseContext = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof e0) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            e0VarA = (e0) baseContext;
            lVar.l();
        } else {
            lVar.o(544164377);
            lVar.l();
        }
        if (o.J()) {
            o.R();
        }
        return e0VarA;
    }
}
