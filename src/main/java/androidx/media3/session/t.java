package androidx.media3.session;

/* JADX INFO: loaded from: classes3.dex */
class t extends k4 implements v.d {
    public static /* synthetic */ void w4(t tVar, String str, int i11, q6 q6Var, q.a aVar) {
        tVar.y4();
        aVar.L(null, str, i11, q6Var);
    }

    public static /* synthetic */ void x4(t tVar, String str, int i11, q6 q6Var, q.a aVar) {
        tVar.y4();
        aVar.X(null, str, i11, q6Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A4(final String str, final int i11, final q6 q6Var) {
        if (isConnected()) {
            y4();
            new s7.n() { // from class: androidx.media3.session.r
                @Override // s7.n
                public final void accept(Object obj) {
                    t.w4(this.f12174a, str, i11, q6Var, (q.a) obj);
                }
            };
            throw null;
        }
    }

    q y4() {
        return null;
    }

    @Override // androidx.media3.session.k4
    /* bridge */ /* synthetic */ v z3() {
        y4();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z4(final String str, final int i11, final q6 q6Var) {
        if (isConnected()) {
            y4();
            new s7.n() { // from class: androidx.media3.session.s
                @Override // s7.n
                public final void accept(Object obj) {
                    t.x4(this.f12222a, str, i11, q6Var, (q.a) obj);
                }
            };
            throw null;
        }
    }
}
