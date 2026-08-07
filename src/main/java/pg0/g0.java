package pg0;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 implements GovernmentIdAnalyzeWorker.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f102341a;

    g0(f0 f0Var) {
        this.f102341a = f0Var;
    }

    public static qj0.i<GovernmentIdAnalyzeWorker.a> b(f0 f0Var) {
        return qj0.f.a(new g0(f0Var));
    }

    @Override // pg0.GovernmentIdAnalyzeWorker.a
    public GovernmentIdAnalyzeWorker a(IdConfig.e eVar, String str) {
        return this.f102341a.b(eVar, str);
    }
}
