package rg;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class c implements pg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bi.a f108136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f108137b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f108138c = false;

    @Override // pg.a
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f108137b) {
            bi.a aVar = new bi.a();
            this.f108136a = aVar;
            this.f108138c = aVar.a(context, null) == 1;
            this.f108137b = true;
        }
        tg.a.c("getOAID", "isSupported", Boolean.valueOf(this.f108138c));
        if (this.f108138c && this.f108136a.h()) {
            return this.f108136a.f();
        }
        return null;
    }
}
