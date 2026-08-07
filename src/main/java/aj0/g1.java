package aj0;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 implements e1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f1373a;

    g1(f1 f1Var) {
        this.f1373a = f1Var;
    }

    public static qj0.i<e1.a> b(f1 f1Var) {
        return qj0.f.a(new g1(f1Var));
    }

    @Override // aj0.e1.a
    public e1 a(String str, String str2, String str3, String str4) {
        return this.f1373a.b(str, str2, str3, str4);
    }
}
