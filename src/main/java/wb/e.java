package wb;

import androidx.work.multiprocess.RemoteWorkManagerClient;
import androidx.work.q0;
import com.google.common.util.concurrent.s;

/* JADX INFO: loaded from: classes3.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RemoteWorkManagerClient f121646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0 f121647b;

    public e(RemoteWorkManagerClient remoteWorkManagerClient, q0 q0Var) {
        this.f121646a = remoteWorkManagerClient;
        this.f121647b = q0Var;
    }

    @Override // wb.d
    public s<Void> a() {
        return this.f121646a.n(this.f121647b);
    }
}
