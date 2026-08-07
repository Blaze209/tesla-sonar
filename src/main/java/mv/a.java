package mv;

/* JADX INFO: loaded from: classes5.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f92513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f92514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f92515c;

    public a(int i11, d... dVarArr) {
        this.f92513a = i11;
        this.f92514b = dVarArr;
        this.f92515c = new b(i11);
    }

    @Override // mv.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f92513a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f92514b) {
            if (stackTraceElementArrA.length <= this.f92513a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f92513a ? this.f92515c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
