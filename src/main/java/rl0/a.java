package rl0;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ql0.q;
import ql0.s;
import sq0.r;
import sq0.t;
import sq0.u;
import sq0.v;
import sq0.w;
import sq0.x;

/* JADX INFO: loaded from: classes8.dex */
public class a extends ql0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<p> f108564a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f108565b;

    /* JADX INFO: renamed from: rl0.a$a, reason: collision with other inner class name */
    class C2311a implements ql0.l.c<x> {
        C2311a() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull x xVar) {
            lVar.s(xVar);
            int length = lVar.length();
            lVar.builder().append((char) 160);
            lVar.e(xVar, length);
            lVar.c(xVar);
        }
    }

    class b implements ql0.l.c<sq0.i> {
        b() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.i iVar) {
            lVar.s(iVar);
            int length = lVar.length();
            lVar.i(iVar);
            rl0.b.f108570d.d(lVar.h(), Integer.valueOf(iVar.n()));
            lVar.e(iVar, length);
            lVar.c(iVar);
        }
    }

    class c implements ql0.l.c<u> {
        c() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull u uVar) {
            lVar.builder().append(' ');
        }
    }

    class d implements ql0.l.c<sq0.h> {
        d() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.h hVar) {
            lVar.p();
        }
    }

    class e implements ql0.l.c<t> {
        e() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull t tVar) {
            boolean zY = a.y(tVar);
            if (!zY) {
                lVar.s(tVar);
            }
            int length = lVar.length();
            lVar.i(tVar);
            rl0.b.f108572f.d(lVar.h(), Boolean.valueOf(zY));
            lVar.e(tVar, length);
            if (zY) {
                return;
            }
            lVar.c(tVar);
        }
    }

    class f implements ql0.l.c<sq0.n> {
        f() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.n nVar) {
            int length = lVar.length();
            lVar.i(nVar);
            rl0.b.f108571e.d(lVar.h(), nVar.m());
            lVar.e(nVar, length);
        }
    }

    class g implements ql0.l.c<w> {
        g() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull w wVar) {
            String strM = wVar.m();
            lVar.builder().d(strM);
            if (a.this.f108564a.isEmpty()) {
                return;
            }
            int length = lVar.length() - strM.length();
            Iterator it = a.this.f108564a.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(lVar, strM, length);
            }
        }
    }

    class h implements ql0.l.c<v> {
        h() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull v vVar) {
            int length = lVar.length();
            lVar.i(vVar);
            lVar.e(vVar, length);
        }
    }

    class i implements ql0.l.c<sq0.f> {
        i() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.f fVar) {
            int length = lVar.length();
            lVar.i(fVar);
            lVar.e(fVar, length);
        }
    }

    class j implements ql0.l.c<sq0.b> {
        j() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.b bVar) {
            lVar.s(bVar);
            int length = lVar.length();
            lVar.i(bVar);
            lVar.e(bVar, length);
            lVar.c(bVar);
        }
    }

    class k implements ql0.l.c<sq0.d> {
        k() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.d dVar) {
            int length = lVar.length();
            lVar.builder().append((char) 160).d(dVar.m()).append((char) 160);
            lVar.e(dVar, length);
        }
    }

    class l implements ql0.l.c<sq0.g> {
        l() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.g gVar) {
            a.I(lVar, gVar.q(), gVar.r(), gVar);
        }
    }

    class m implements ql0.l.c<sq0.m> {
        m() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.m mVar) {
            a.I(lVar, null, mVar.n(), mVar);
        }
    }

    class n implements ql0.l.c<sq0.l> {
        n() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.l lVar2) {
            s sVarA = lVar.l().c().a(sq0.l.class);
            if (sVarA == null) {
                lVar.i(lVar2);
                return;
            }
            int length = lVar.length();
            lVar.i(lVar2);
            if (length == lVar.length()) {
                lVar.builder().append((char) 65532);
            }
            ql0.g gVarL = lVar.l();
            boolean z11 = lVar2.f() instanceof sq0.n;
            String strB = gVarL.a().b(lVar2.m());
            q qVarH = lVar.h();
            ul0.c.f116433a.d(qVarH, strB);
            ul0.c.f116434b.d(qVarH, Boolean.valueOf(z11));
            ul0.c.f116435c.d(qVarH, null);
            lVar.b(length, sVarA.a(gVarL, qVarH));
        }
    }

    class o implements ql0.l.c<sq0.q> {
        o() {
        }

        @Override // ql0.l.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull ql0.l lVar, @NonNull sq0.q qVar) {
            int length = lVar.length();
            lVar.i(qVar);
            sq0.a aVarF = qVar.f();
            if (aVarF instanceof sq0.s) {
                sq0.s sVar = (sq0.s) aVarF;
                int iQ = sVar.q();
                rl0.b.f108567a.d(lVar.h(), rl0.b.a.ORDERED);
                rl0.b.f108569c.d(lVar.h(), Integer.valueOf(iQ));
                sVar.s(sVar.q() + 1);
            } else {
                rl0.b.f108567a.d(lVar.h(), rl0.b.a.BULLET);
                rl0.b.f108568b.d(lVar.h(), Integer.valueOf(a.B(qVar)));
            }
            lVar.e(qVar, length);
            if (lVar.m(qVar)) {
                lVar.p();
            }
        }
    }

    public interface p {
        void a(@NonNull ql0.l lVar, @NonNull String str, int i11);
    }

    protected a() {
    }

    private static void A(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.q.class, new o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int B(@NonNull r rVar) {
        int i11 = 0;
        for (r rVarF = rVar.f(); rVarF != null; rVarF = rVarF.f()) {
            if (rVarF instanceof sq0.q) {
                i11++;
            }
        }
        return i11;
    }

    private static void C(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.s.class, new rl0.d());
    }

    private static void D(@NonNull ql0.l.b bVar) {
        bVar.b(t.class, new e());
    }

    private static void E(@NonNull ql0.l.b bVar) {
        bVar.b(u.class, new c());
    }

    private static void F(@NonNull ql0.l.b bVar) {
        bVar.b(v.class, new h());
    }

    private void G(@NonNull ql0.l.b bVar) {
        bVar.b(w.class, new g());
    }

    private static void H(@NonNull ql0.l.b bVar) {
        bVar.b(x.class, new C2311a());
    }

    static void I(@NonNull ql0.l lVar, String str, @NonNull String str2, @NonNull r rVar) {
        lVar.s(rVar);
        int length = lVar.length();
        lVar.builder().append((char) 160).append('\n').append(lVar.l().d().a(str, str2));
        lVar.p();
        lVar.builder().append((char) 160);
        rl0.b.f108573g.d(lVar.h(), str);
        lVar.e(rVar, length);
        lVar.c(rVar);
    }

    private static void o(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.b.class, new j());
    }

    private static void p(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.c.class, new rl0.d());
    }

    private static void q(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.d.class, new k());
    }

    @NonNull
    public static a r() {
        return new a();
    }

    private static void s(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.f.class, new i());
    }

    private static void t(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.g.class, new l());
    }

    private static void u(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.h.class, new d());
    }

    private static void v(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.i.class, new b());
    }

    private static void w(ql0.l.b bVar) {
        bVar.b(sq0.l.class, new n());
    }

    private static void x(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.m.class, new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y(@NonNull t tVar) {
        sq0.a aVarF = tVar.f();
        if (aVarF == null) {
            return false;
        }
        r rVarF = aVarF.f();
        if (rVarF instanceof sq0.p) {
            return ((sq0.p) rVarF).n();
        }
        return false;
    }

    private static void z(@NonNull ql0.l.b bVar) {
        bVar.b(sq0.n.class, new f());
    }

    @Override // ql0.i
    public void b(@NonNull TextView textView) {
        if (this.f108565b || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // ql0.i
    public void d(@NonNull ql0.j.a aVar) {
        sl0.b bVar = new sl0.b();
        aVar.a(v.class, new sl0.h()).a(sq0.f.class, new sl0.d()).a(sq0.b.class, new sl0.a()).a(sq0.d.class, new sl0.c()).a(sq0.g.class, bVar).a(sq0.m.class, bVar).a(sq0.q.class, new sl0.g()).a(sq0.i.class, new sl0.e()).a(sq0.n.class, new sl0.f()).a(x.class, new sl0.i());
    }

    @Override // ql0.i
    public void j(@NonNull ql0.l.b bVar) {
        G(bVar);
        F(bVar);
        s(bVar);
        o(bVar);
        q(bVar);
        t(bVar);
        x(bVar);
        w(bVar);
        p(bVar);
        C(bVar);
        A(bVar);
        H(bVar);
        v(bVar);
        E(bVar);
        u(bVar);
        D(bVar);
        z(bVar);
    }

    @Override // ql0.i
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        tl0.i.a(textView, spanned);
        if (spanned instanceof Spannable) {
            tl0.k.a((Spannable) spanned, textView);
        }
    }
}
