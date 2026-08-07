package p009i2;

import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;
import w4.h;
import w4.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/d;", "c", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Lr2/g2;", "", "a", "Lr2/g2;", "b", "()Lr2/g2;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "getLocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement$annotations", "LocalMinimumTouchTargetEnforcement", "Lw4/k;", "J", "minimumInteractiveComponentSize", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<Boolean> f74417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<Boolean> f74418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f74419c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f74420c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        g2<Boolean> g2VarF = w.f(a.f74420c);
        f74417a = g2VarF;
        f74418b = g2VarF;
        float f11 = 48;
        f74419c = i.b(h.g(f11), h.g(f11));
    }

    public static final g2<Boolean> b() {
        return f74417a;
    }

    public static final d c(d dVar) {
        return dVar.g(MinimumInteractiveModifier.f5015b);
    }
}
