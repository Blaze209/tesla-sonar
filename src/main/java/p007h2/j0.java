package p007h2;

import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import i4.p0;
import jn0.h0;
import kotlin.i;
import kotlin.k0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import q1.g0;
import q1.q0;
import r1.ContextMenuState;
import r1.g;
import r1.j;
import v3.m;
import w4.k;
import w4.r;
import w4.s;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/d;", "Lh2/h0;", "manager", "c", "(Landroidx/compose/ui/d;Lh2/h0;)Landroidx/compose/ui/d;", "Lr1/i;", "contextMenuState", "Lkotlin/Function1;", "Lr1/g;", "Ljn0/h0;", "a", "(Lh2/h0;Lr1/i;)Lwn0/l;", "Lv3/m;", "", "b", "(Lv3/m;)Z", "isShiftPressed", "Lw4/r;", "magnifierSize", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/g;", "Ljn0/h0;", "a", "(Lr1/g;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<g, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f70313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f70314d;

        /* JADX INFO: renamed from: h2.j0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        public static final class C1455a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f70315c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ h0 f70316d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1455a(ContextMenuState contextMenuState, h0 h0Var) {
                super(0);
                this.f70315c = contextMenuState;
                this.f70316d = h0Var;
            }

            public final void b() {
                this.f70316d.s();
                j.a(this.f70315c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        public static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f70317c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ h0 f70318d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ContextMenuState contextMenuState, h0 h0Var) {
                super(0);
                this.f70317c = contextMenuState;
                this.f70318d = h0Var;
            }

            public final void b() {
                this.f70318d.o(false);
                j.a(this.f70317c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        public static final class c extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f70319c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ h0 f70320d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ContextMenuState contextMenuState, h0 h0Var) {
                super(0);
                this.f70319c = contextMenuState;
                this.f70320d = h0Var;
            }

            public final void b() {
                this.f70320d.T();
                j.a(this.f70319c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        public static final class d extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContextMenuState f70321c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ h0 f70322d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ContextMenuState contextMenuState, h0 h0Var) {
                super(0);
                this.f70321c = contextMenuState;
                this.f70322d = h0Var;
            }

            public final void b() {
                this.f70322d.U();
                j.a(this.f70321c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0 h0Var, ContextMenuState contextMenuState) {
            super(1);
            this.f70313c = h0Var;
            this.f70314d = contextMenuState;
        }

        public final void a(g gVar) {
            x0 clipboardManager;
            boolean z11 = this.f70313c.getVisualTransformation() instanceof o4.h0;
            boolean zH = p0.h(this.f70313c.O().getSelection());
            ContextMenuState contextMenuState = this.f70314d;
            g.d(gVar, new i(k0.Cut), null, (zH || !this.f70313c.D() || z11) ? false : true, null, new C1455a(contextMenuState, this.f70313c), 10, null);
            ContextMenuState contextMenuState2 = this.f70314d;
            g.d(gVar, new i(k0.Copy), null, (zH || z11) ? false : true, null, new b(contextMenuState2, this.f70313c), 10, null);
            ContextMenuState contextMenuState3 = this.f70314d;
            g.d(gVar, new i(k0.Paste), null, this.f70313c.D() && (clipboardManager = this.f70313c.getClipboardManager()) != null && clipboardManager.b(), null, new c(contextMenuState3, this.f70313c), 10, null);
            ContextMenuState contextMenuState4 = this.f70314d;
            g.d(gVar, new i(k0.SelectAll), null, p0.j(this.f70313c.O().getSelection()) != this.f70313c.O().h().length(), null, new d(contextMenuState4, this.f70313c), 10, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(g gVar) {
            a(gVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "c", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements q<d, p020r2.l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f70323c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<j3.g> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0 f70324c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p1<r> f70325d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, p1<r> p1Var) {
                super(0);
                this.f70324c = h0Var;
                this.f70325d = p1Var;
            }

            public final long b() {
                return i0.b(this.f70324c, b.e(this.f70325d));
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ j3.g invoke() {
                return j3.g.d(b());
            }
        }

        /* JADX INFO: renamed from: h2.j0$b$b, reason: from Kotlin metadata */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lj3/g;", "center", "Landroidx/compose/ui/d;", "a", "(Lwn0/a;)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
        static final class Function0 extends u implements l<wn0.a<? extends j3.g>, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w4.d f70326c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p1<r> f70327d;

            /* JADX INFO: renamed from: h2.j0$b$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw4/d;", "Lj3/g;", "a", "(Lw4/d;)J"}, k = 3, mv = {1, 8, 0})
            static final class a extends u implements l<w4.d, j3.g> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.a<j3.g> f70328c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(wn0.a<j3.g> aVar) {
                    super(1);
                    this.f70328c = aVar;
                }

                public final long a(w4.d dVar) {
                    return this.f70328c.invoke().getPackedValue();
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ j3.g invoke(w4.d dVar) {
                    return j3.g.d(a(dVar));
                }
            }

            /* JADX INFO: renamed from: h2.j0$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/k;", "size", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            static final class C1456b extends u implements l<k, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ w4.d f70329c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ p1<r> f70330d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1456b(w4.d dVar, p1<r> p1Var) {
                    super(1);
                    this.f70329c = dVar;
                    this.f70330d = p1Var;
                }

                public final void a(long j11) {
                    p1<r> p1Var = this.f70330d;
                    w4.d dVar = this.f70329c;
                    b.f(p1Var, s.a(dVar.i1(k.h(j11)), dVar.i1(k.g(j11))));
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(k kVar) {
                    a(kVar.getPackedValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Function0(w4.d dVar, p1<r> p1Var) {
                super(1);
                this.f70326c = dVar;
                this.f70327d = p1Var;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(wn0.a<j3.g> aVar) {
                return g0.f(d.INSTANCE, new a(aVar), null, new C1456b(this.f70326c, this.f70327d), BitmapDescriptorFactory.HUE_RED, true, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, q0.INSTANCE.a(), DownloaderService.STATUS_CANCELED, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h0 h0Var) {
            super(3);
            this.f70323c = h0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long e(p1<r> p1Var) {
            return p1Var.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(p1<r> p1Var, long j11) {
            p1Var.setValue(r.b(j11));
        }

        public final d c(d dVar, p020r2.l lVar, int i11) {
            lVar.o(1980580247);
            if (o.J()) {
                o.S(1980580247, i11, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)");
            }
            w4.d dVar2 = (w4.d) lVar.U(z0.g());
            Object objI = lVar.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(r.b(r.INSTANCE.a()), null, 2, null);
                lVar.B(objI);
            }
            p1 p1Var = (p1) objI;
            boolean zK = lVar.K(this.f70323c);
            h0 h0Var = this.f70323c;
            Object objI2 = lVar.I();
            if (zK || objI2 == companion.a()) {
                objI2 = new a(h0Var, p1Var);
                lVar.B(objI2);
            }
            wn0.a aVar = (wn0.a) objI2;
            boolean zN = lVar.n(dVar2);
            Object objI3 = lVar.I();
            if (zN || objI3 == companion.a()) {
                objI3 = new Function0(dVar2, p1Var);
                lVar.B(objI3);
            }
            d dVarD = a0.d(dVar, aVar, (l) objI3);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarD;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, p020r2.l lVar, Integer num) {
            return c(dVar, lVar, num.intValue());
        }
    }

    public static final l<g, h0> a(h0 h0Var, ContextMenuState contextMenuState) {
        return new a(h0Var, contextMenuState);
    }

    public static final boolean b(m mVar) {
        return false;
    }

    public static final d c(d dVar, h0 h0Var) {
        return !g0.d(0, 1, null) ? dVar : c.c(dVar, null, new b(h0Var), 1, null);
    }
}
