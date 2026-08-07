package freemarker.core;

import javax.swing.tree.TreeNode;

/* JADX INFO: loaded from: classes8.dex */
public abstract class k extends l implements TreeNode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f66495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k f66496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66497e;

    @Override // freemarker.core.l
    public final String a() {
        return d(true);
    }

    protected abstract String d(boolean z11);

    public final String e() {
        return d(false);
    }

    final k f() {
        return this.f66496d;
    }

    final k g() {
        return this.f66495c;
    }

    boolean h() {
        return true;
    }

    final void i(k kVar) {
        if (kVar != null) {
            kVar.f66495c = this;
            kVar.f66497e = 0;
        }
        this.f66496d = kVar;
    }
}
