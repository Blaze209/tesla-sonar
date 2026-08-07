package fu;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f66588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f66589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f66590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f66591d;

    i(o oVar, u uVar, Set set, AtomicBoolean atomicBoolean) {
        this.f66591d = oVar;
        this.f66588a = uVar;
        this.f66589b = set;
        this.f66590c = atomicBoolean;
    }

    @Override // fu.l
    public final void a(ZipFile zipFile, Set set) {
        this.f66591d.f(this.f66588a, set, new h(this));
    }
}
