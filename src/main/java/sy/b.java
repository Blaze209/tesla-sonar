package sy;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f111922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f111923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f111924c;

    b(f fVar, d dVar, String str) {
        this.f111924c = fVar;
        this.f111922a = dVar;
        this.f111923b = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f111924c.f111926a) {
            this.f111924c.f111929d = this.f111922a;
            this.f111924c.k();
            if (this.f111924c.f111928c != null) {
                try {
                    try {
                        xf0.j.c("HwOpenPayTask", "supportCapacity capacity is " + this.f111923b);
                        boolean zC = this.f111924c.f111928c.C(this.f111923b);
                        xf0.j.c("HwOpenPayTask", "supportCapacity result is " + zC);
                        d dVar = this.f111922a;
                        if (dVar != null) {
                            dVar.a(zC ? 1 : 0, new Bundle());
                        }
                    } catch (Exception unused) {
                        xf0.j.d("HwOpenPayTask", "supportCapacity---RemoteException--");
                        this.f111922a.a(0, new Bundle());
                    }
                    this.f111924c.i();
                } catch (Throwable th2) {
                    this.f111924c.i();
                    throw th2;
                }
            } else {
                xf0.j.c("HwOpenPayTask", "mOpenService is null");
            }
        }
    }
}
