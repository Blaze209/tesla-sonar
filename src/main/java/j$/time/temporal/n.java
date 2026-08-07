package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82213b;

    public /* synthetic */ n(int i11, int i12) {
        this.f82212a = i12;
        this.f82213b = i11;
    }

    @Override // j$.time.temporal.m
    public final l c(l lVar) {
        switch (this.f82212a) {
            case 0:
                int iE = lVar.e(a.DAY_OF_WEEK);
                int i11 = this.f82213b;
                if (iE == i11) {
                    return lVar;
                }
                int i12 = iE - i11;
                return lVar.g(i12 >= 0 ? 7 - i12 : -i12, ChronoUnit.DAYS);
            default:
                int iE2 = lVar.e(a.DAY_OF_WEEK);
                int i13 = this.f82213b;
                if (iE2 == i13) {
                    return lVar;
                }
                int i14 = i13 - iE2;
                return lVar.a(i14 >= 0 ? 7 - i14 : -i14, ChronoUnit.DAYS);
        }
    }
}
