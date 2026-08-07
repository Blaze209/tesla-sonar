package dp;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f60807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f60808c;

    public f(Context context, int i11) {
        this.f60806a = context;
        this.f60808c = i11;
        a aVar = new a(5);
        this.f60807b = aVar;
        aVar.a(context.getApplicationInfo().sourceDir);
    }

    @Override // dp.i
    public h get() {
        return new e(new g(this.f60806a, this.f60807b), new b(this.f60806a, this.f60807b), new l(), new c(this.f60806a), new j(this.f60808c), new d(), new k(), new l());
    }
}
