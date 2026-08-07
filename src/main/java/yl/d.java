package yl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import nm.n;
import pk.o;
import tl.f;
import um.e;
import vl.k;

/* JADX INFO: loaded from: classes3.dex */
public class d implements tm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jm.b f125690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f125691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f125692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wk.b f125693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mm.d f125694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n<jk.d, e> f125695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pk.n<Integer> f125696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final pk.n<Integer> f125697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final pk.n<Boolean> f125698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final pk.n<Boolean> f125699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final pk.n<Boolean> f125700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final pk.n<Integer> f125701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final pk.n<Integer> f125702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pk.n<Boolean> f125703n = o.f103136b;

    public d(jm.b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, wk.b bVar2, mm.d dVar, n<jk.d, e> nVar, pk.n<Integer> nVar2, pk.n<Integer> nVar3, pk.n<Boolean> nVar4, pk.n<Boolean> nVar5, pk.n<Boolean> nVar6, pk.n<Integer> nVar7, pk.n<Integer> nVar8) {
        this.f125690a = bVar;
        this.f125691b = scheduledExecutorService;
        this.f125692c = executorService;
        this.f125693d = bVar2;
        this.f125694e = dVar;
        this.f125695f = nVar;
        this.f125696g = nVar2;
        this.f125697h = nVar3;
        this.f125698i = nVar4;
        this.f125699j = nVar5;
        this.f125701l = nVar7;
        this.f125700k = nVar6;
        this.f125702m = nVar8;
    }

    private hm.a c(hm.e eVar) {
        hm.c cVarD = eVar.d();
        return this.f125690a.a(eVar, new Rect(0, 0, cVarD.getWidth(), cVarD.getHeight()));
    }

    private jm.c d(hm.e eVar) {
        return new jm.c(new sl.a(eVar.hashCode(), this.f125698i.get().booleanValue()), this.f125695f);
    }

    private ql.a e(hm.e eVar, Bitmap.Config config, dm.c cVar) {
        tl.a fVar;
        tl.b bVarG;
        hm.a aVarC = c(eVar);
        wl.a aVar = new wl.a(aVarC);
        rl.b bVarF = f(eVar);
        wl.b bVar = new wl.b(bVarF, aVarC, this.f125699j.get().booleanValue());
        int iIntValue = this.f125697h.get().intValue();
        if (iIntValue > 0) {
            fVar = new tl.d(iIntValue);
            bVarG = g(bVar, config);
        } else {
            fVar = null;
            bVarG = null;
        }
        if (this.f125699j.get().booleanValue()) {
            fVar = new f(eVar.e(), aVar, bVar, new k(this.f125694e, this.f125701l.get().intValue(), this.f125702m.get().intValue()), this.f125700k.get().booleanValue());
        }
        return ql.c.s(new rl.a(this.f125694e, bVarF, aVar, bVar, this.f125699j.get().booleanValue(), fVar, bVarG, null), this.f125693d, this.f125691b);
    }

    private rl.b f(hm.e eVar) {
        int iIntValue = this.f125696g.get().intValue();
        if (iIntValue == 1) {
            return new sl.b(d(eVar), true);
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? new sl.d() : new sl.c();
        }
        return new sl.b(d(eVar), false);
    }

    private tl.b g(rl.c cVar, Bitmap.Config config) {
        mm.d dVar = this.f125694e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new tl.c(dVar, cVar, config, this.f125692c);
    }

    @Override // tm.a
    public Drawable a(e eVar) {
        if (!b(eVar)) {
            return null;
        }
        um.c cVar = (um.c) eVar;
        hm.c cVarN0 = cVar.n0();
        ql.a aVarE = e((hm.e) pk.k.g(cVar.r0()), cVarN0 != null ? cVarN0.y() : null, null);
        return this.f125703n.get().booleanValue() ? new xl.f(aVarE) : new xl.b(aVarE);
    }

    @Override // tm.a
    public boolean b(e eVar) {
        return eVar instanceof um.c;
    }
}
