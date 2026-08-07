package ql0;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<i> f105640b = new ArrayList(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView.BufferType f105641c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f105642d = true;

    f(@NonNull Context context) {
        this.f105639a = context;
    }

    @NonNull
    private static List<i> b(@NonNull List<i> list) {
        return new p(list).b();
    }

    @Override // ql0.e.a
    @NonNull
    public e.a a(@NonNull i iVar) {
        this.f105640b.add(iVar);
        return this;
    }

    @Override // ql0.e.a
    @NonNull
    public e build() {
        if (this.f105640b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<i> listB = b(this.f105640b);
        tq0.d.b bVar = new tq0.d.b();
        rl0.c.a aVarI = rl0.c.i(this.f105639a);
        g.b bVar2 = new g.b();
        n.a aVar = new n.a();
        k.a aVar2 = new k.a();
        for (i iVar : listB) {
            iVar.h(bVar);
            iVar.i(aVarI);
            iVar.e(bVar2);
            iVar.j(aVar);
            iVar.d(aVar2);
        }
        g gVarH = bVar2.h(aVarI.z(), aVar2.build());
        return new h(this.f105641c, null, bVar.f(), m.b(aVar, gVarH), gVarH, Collections.unmodifiableList(listB), this.f105642d);
    }
}
