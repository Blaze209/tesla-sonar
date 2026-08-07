package xc;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import rc.ErrorResult;
import rc.SuccessResult;
import rc.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lxc/c;", "Lxc/d;", "Lxc/e;", "target", "Lrc/j;", "result", "<init>", "(Lxc/e;Lrc/j;)V", "Ljn0/h0;", "a", "()V", "Lxc/e;", "b", "Lrc/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e target;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j result;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxc/c$a;", "Lxc/d$a;", "<init>", "()V", "Lxc/e;", "target", "Lrc/j;", "result", "Lxc/d;", "a", "(Lxc/e;Lrc/j;)Lxc/d;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d.a {
        @Override // xc.d.a
        public d a(e target, j result) {
            return new c(target, result);
        }
    }

    public c(e eVar, j jVar) {
        this.target = eVar;
        this.result = jVar;
    }

    @Override // xc.d
    public void a() {
        j jVar = this.result;
        if (jVar instanceof SuccessResult) {
            this.target.b(((SuccessResult) jVar).getImage());
        } else {
            if (!(jVar instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            this.target.c(((ErrorResult) jVar).getImage());
        }
    }
}
