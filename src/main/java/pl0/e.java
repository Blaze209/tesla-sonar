package pl0;

import kotlinx.coroutines.DisposableHandle;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpl0/e;", "Lkotlinx/coroutines/DisposableHandle;", "<init>", "()V", "Ljn0/h0;", "dispose", "", "toString", "()Ljava/lang/String;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements DisposableHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f103196a = new e();

    private e() {
    }

    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
    }
}
