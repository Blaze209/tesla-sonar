package sy;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
class a extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ f f111921n;

    a(f fVar) {
        this.f111921n = fVar;
    }

    @Override // sy.h
    public void L2(Bundle bundle) {
        xf0.j.c("HwOpenPayTask", "getUnionOnlinePayStatus---onResult---");
        f.a(this.f111921n);
        if (this.f111921n.f111930e) {
            this.f111921n.i();
        }
    }

    @Override // sy.h
    public void N(String str, String str2) {
        xf0.j.c("HwOpenPayTask", "getUnionOnlinePayStatus---onError--- errorCode is " + str + " and errorMsg is " + str2);
        f.a(this.f111921n);
        if (this.f111921n.f111930e) {
            this.f111921n.i();
        }
    }
}
