package p016o2;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "b", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Lr2/g2;", "", "a", "Lr2/g2;", "getLocalMinimumInteractiveComponentEnforcement", "()Lr2/g2;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "Lw4/h;", "LocalMinimumInteractiveComponentSize", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<Boolean> f96139a = w.f(a.f96141c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<h> f96140b = w.f(b.f96142c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96141c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/h;", "b", "()F"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<h> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f96142c = new b();

        b() {
            super(0);
        }

        public final float b() {
            return h.g(48);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h invoke() {
            return h.d(b());
        }
    }

    public static final g2<h> a() {
        return f96140b;
    }

    public static final d b(d dVar) {
        return dVar.g(MinimumInteractiveModifier.f5129b);
    }
}
