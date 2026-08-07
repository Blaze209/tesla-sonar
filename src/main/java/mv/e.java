package mv;

import java.util.Stack;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f92520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f92521d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f92518a = str;
        this.f92519b = str2;
        this.f92520c = stackTraceElementArr;
        this.f92521d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
