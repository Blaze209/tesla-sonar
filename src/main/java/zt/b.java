package zt;

import android.content.Context;
import iu.y;

/* JADX INFO: loaded from: classes5.dex */
final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f129127a;

    /* synthetic */ b(d dVar) {
    }

    public final b a(Context context) {
        context.getClass();
        this.f129127a = context;
        return this;
    }

    @Override // zt.e
    public final c b() {
        y.a(this.f129127a, Context.class);
        return new c(this.f129127a);
    }
}
