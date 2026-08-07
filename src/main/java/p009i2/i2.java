package p009i2;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R/\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Li2/i2;", "", "<init>", "()V", "Lkotlinx/coroutines/sync/Mutex;", "a", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Li2/e2;", "<set-?>", "b", "Lr2/p1;", "()Li2/e2;", "setCurrentSnackbarData", "(Li2/e2;)V", "currentSnackbarData", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 currentSnackbarData = s3.d(null, null, 2, null);

    public final e2 a() {
        return (e2) this.currentSnackbarData.getValue();
    }
}
