package lr0;

import org.aspectj.lang.NoAspectBoundException;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static /* synthetic */ Throwable f90695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static /* synthetic */ e f90696b;

    static {
        try {
            a();
        } catch (Throwable th2) {
            f90695a = th2;
        }
    }

    private static /* synthetic */ void a() {
        f90696b = new e();
    }

    public static e b() {
        e eVar = f90696b;
        if (eVar != null) {
            return eVar;
        }
        throw new NoAspectBoundException("org.mp4parser.support.RequiresParseDetailAspect", f90695a);
    }

    public void c(jq0.a aVar) {
        if (aVar.getTarget() instanceof a) {
            if (((a) aVar.getTarget()).h()) {
                return;
            }
            ((a) aVar.getTarget()).j();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
