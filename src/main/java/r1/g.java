package r1;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import jn0.h0;
import k3.p1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import p020r2.k2;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.w2;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\u0003JU\u0010\u0015\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lr1/g;", "", "<init>", "()V", "Lr1/b;", "colors", "Ljn0/h0;", "a", "(Lr1/b;Lr2/l;I)V", "b", "Lkotlin/Function0;", "", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/d;", "modifier", "", "enabled", "Lkotlin/Function1;", "Lk3/p1;", "leadingIcon", "onClick", "c", "(Lwn0/p;Landroidx/compose/ui/d;ZLwn0/q;Lwn0/a;)V", "Landroidx/compose/runtime/snapshots/k;", "Landroidx/compose/runtime/snapshots/k;", "composables", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<q<ContextMenuColors, l, Integer, h0>> composables = n3.f();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ContextMenuColors f106374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f106375e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContextMenuColors contextMenuColors, int i11) {
            super(2);
            this.f106374d = contextMenuColors;
            this.f106375e = i11;
        }

        public final void a(l lVar, int i11) {
            g.this.a(this.f106374d, lVar, k2.a(this.f106375e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr1/b;", "colors", "Ljn0/h0;", "a", "(Lr1/b;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements q<ContextMenuColors, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, String> f106376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f106377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f106378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<p1, l, Integer, h0> f106379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f106380g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l, ? super Integer, String> pVar, boolean z11, androidx.compose.ui.d dVar, q<? super p1, ? super l, ? super Integer, h0> qVar, wn0.a<h0> aVar) {
            super(3);
            this.f106376c = pVar;
            this.f106377d = z11;
            this.f106378e = dVar;
            this.f106379f = qVar;
            this.f106380g = aVar;
        }

        public final void a(ContextMenuColors contextMenuColors, l lVar, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= lVar.n(contextMenuColors) ? 4 : 2;
            }
            if ((i11 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(262103052, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
            }
            String strInvoke = this.f106376c.invoke(lVar, 0);
            if (t.y0(strInvoke)) {
                throw new IllegalStateException("Label must not be blank");
            }
            k.b(strInvoke, this.f106377d, contextMenuColors, this.f106378e, this.f106379f, this.f106380g, lVar, (i11 << 6) & 896, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(ContextMenuColors contextMenuColors, l lVar, Integer num) {
            a(contextMenuColors, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(g gVar, p pVar, androidx.compose.ui.d dVar, boolean z11, q qVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = androidx.compose.ui.d.INSTANCE;
        }
        androidx.compose.ui.d dVar2 = dVar;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            qVar = null;
        }
        gVar.c(pVar, dVar2, z12, qVar, aVar);
    }

    public final void a(ContextMenuColors contextMenuColors, l lVar, int i11) {
        l lVarV = lVar.v(1320309496);
        int i12 = (i11 & 6) == 0 ? (lVarV.n(contextMenuColors) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(this) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1320309496, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            SnapshotStateList<q<ContextMenuColors, l, Integer, h0>> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i13 = 0; i13 < size; i13++) {
                snapshotStateList.get(i13).invoke(contextMenuColors, lVarV, Integer.valueOf(i12 & 14));
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(contextMenuColors, i11));
        }
    }

    public final void b() {
        this.composables.clear();
    }

    public final void c(p<? super l, ? super Integer, String> label, androidx.compose.ui.d modifier, boolean enabled, q<? super p1, ? super l, ? super Integer, h0> leadingIcon, wn0.a<h0> onClick) {
        this.composables.add(z2.c.c(262103052, true, new b(label, enabled, modifier, leadingIcon, onClick)));
    }
}
