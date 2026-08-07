package wq0;

/* JADX INFO: loaded from: classes10.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f122309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f122310b;

    j() {
    }

    synchronized void a(i iVar) {
        try {
            if (iVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            i iVar2 = this.f122310b;
            if (iVar2 != null) {
                iVar2.f122308c = iVar;
                this.f122310b = iVar;
            } else {
                if (this.f122309a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f122310b = iVar;
                this.f122309a = iVar;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized i b() {
        i iVar;
        iVar = this.f122309a;
        if (iVar != null) {
            i iVar2 = iVar.f122308c;
            this.f122309a = iVar2;
            if (iVar2 == null) {
                this.f122310b = null;
            }
        }
        return iVar;
    }

    synchronized i c(int i11) {
        try {
            if (this.f122309a == null) {
                wait(i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b();
    }
}
