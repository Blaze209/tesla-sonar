package gu;

import android.content.Context;
import android.content.Intent;
import hu.k0;

/* JADX INFO: loaded from: classes5.dex */
final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f69563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f69564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f69565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f69566d;

    m(o oVar, a aVar, Intent intent, Context context) {
        this.f69566d = oVar;
        this.f69563a = aVar;
        this.f69564b = intent;
        this.f69565c = context;
    }

    @Override // gu.e
    public final void zza() {
        o oVar = this.f69566d;
        oVar.f69572g.post(new n(oVar, this.f69563a, 5, 0));
    }

    @Override // gu.e
    public final void zzb(int i11) {
        o oVar = this.f69566d;
        oVar.f69572g.post(new n(oVar, this.f69563a, 6, i11));
    }

    @Override // gu.e
    public final void zzc() {
        if (this.f69564b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((k0) this.f69566d).f73651a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f69564b.putExtra("triggered_from_app_after_verification", true);
            this.f69565c.sendBroadcast(this.f69564b);
        }
    }
}
