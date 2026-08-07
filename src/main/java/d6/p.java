package d6;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b\u000f\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Ld6/p;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ld6/b0;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Ld6/m;", "Ld6/c0;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Ljn0/h0;", "onGetCredential", "(Landroid/content/Context;Ld6/b0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "", "isAvailableOnDevice", "()Z", "onPrepareCredential", "(Ld6/b0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "Ld6/i0;", "pendingGetCredentialHandle", "(Landroid/content/Context;Ld6/i0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ld6/m;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface p {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, b0 request, CancellationSignal cancellationSignal, Executor executor, m<c0, GetCredentialException> callback);

    default void onGetCredential(Context context, i0 pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, m<c0, GetCredentialException> callback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(callback, "callback");
    }

    default void onPrepareCredential(b0 request, CancellationSignal cancellationSignal, Executor executor, m<Object, GetCredentialException> callback) {
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(callback, "callback");
    }
}
