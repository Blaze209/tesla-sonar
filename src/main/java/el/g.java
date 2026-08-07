package el;

import android.content.Context;
import java.util.Set;
import nk.i;
import pk.n;
import pm.t;
import pm.y;

/* JADX INFO: loaded from: classes3.dex */
public class g implements n<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f63047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f63048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<il.d> f63049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<bm.b> f63050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bm.g f63051f;

    public g(Context context, b bVar) {
        this(context, y.l(), bVar);
    }

    @Override // pk.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f get() {
        return new f(this.f63046a, this.f63048c, this.f63047b, this.f63049d, this.f63050e).M(this.f63051f);
    }

    public g(Context context, y yVar, b bVar) {
        this(context, yVar, null, null, bVar);
    }

    public g(Context context, y yVar, Set<il.d> set, Set<bm.b> set2, b bVar) {
        this.f63046a = context;
        t tVarJ = yVar.j();
        this.f63047b = tVarJ;
        if (bVar != null && bVar.d() != null) {
            this.f63048c = bVar.d();
        } else {
            this.f63048c = new h();
        }
        this.f63048c.a(context.getResources(), hl.a.b(), yVar.b(context), yVar.q(), i.h(), tVarJ.q(), bVar != null ? bVar.a() : null, bVar != null ? bVar.b() : null);
        this.f63049d = set;
        this.f63050e = set2;
        this.f63051f = bVar != null ? bVar.c() : null;
    }
}
