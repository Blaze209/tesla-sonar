package fu;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f66592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f66593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f66594c;

    j(o oVar, Set set, u uVar) {
        this.f66594c = oVar;
        this.f66592a = set;
        this.f66593b = uVar;
    }

    @Override // fu.l
    public final void a(ZipFile zipFile, Set set) {
        this.f66592a.addAll(o.a(this.f66594c, set, this.f66593b, zipFile));
    }
}
