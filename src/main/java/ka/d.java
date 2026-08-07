package ka;

import ezvcard.property.Gender;
import p011ja.d0;
import p011ja.e0;
import p011ja.t;
import p011ja.v;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d0.b("navigation")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lka/d;", "Lja/v;", "Lja/e0;", "navigatorProvider", "<init>", "(Lja/e0;)V", "Lja/t;", "l", "()Lja/t;", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends v {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R8\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR8\u0010\u0015\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR8\u0010\u0019\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR8\u0010\u001d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR8\u0010\"\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Lka/d$a;", "Lja/t;", "Lja/d0;", "navGraphNavigator", "<init>", "(Lja/d0;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Lja/k;", "Landroidx/compose/animation/i;", "r", "Lwn0/l;", "T", "()Lwn0/l;", "setEnterTransition$navigation_compose_release", "(Lwn0/l;)V", "enterTransition", "Landroidx/compose/animation/k;", "s", Gender.UNKNOWN, "setExitTransition$navigation_compose_release", "exitTransition", "t", "V", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", "u", "W", "setPopExitTransition$navigation_compose_release", "popExitTransition", "Lo1/v;", "v", "X", "setSizeTransform$navigation_compose_release", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends t {

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> enterTransition;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> exitTransition;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> popEnterTransition;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> popExitTransition;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, p015o1.v> sizeTransform;

        public a(d0<? extends t> d0Var) {
            super(d0Var);
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> T() {
            return this.enterTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> U() {
            return this.exitTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> V() {
            return this.popEnterTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> W() {
            return this.popExitTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, p015o1.v> X() {
            return this.sizeTransform;
        }
    }

    public d(e0 e0Var) {
        super(e0Var);
    }

    @Override // p011ja.v, p011ja.d0
    /* JADX INFO: renamed from: l */
    public t a() {
        return new a(this);
    }
}
