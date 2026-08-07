package z00;

import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Promise f126436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f126437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f126438c;

    public i(String str) {
        this.f126438c = str;
    }

    private void f(Promise promise, String str) {
        promise.reject("ASYNC_OP_IN_PROGRESS", "Warning: previous promise did not settle and you attempted to overwrite it. You've called \"" + str + "\" while \"" + a() + "\" was already in progress and has not completed yet.");
    }

    private void g() {
        this.f126437b = null;
        this.f126436a = null;
    }

    public String a() {
        return this.f126437b;
    }

    public void b(Exception exc) {
        String message;
        if (exc.getLocalizedMessage() != null) {
            message = exc.getLocalizedMessage();
        } else {
            message = exc.getMessage() != null ? exc.getMessage() : "unknown error";
        }
        d(this.f126437b, message, exc);
    }

    public void c(@NonNull String str, @NonNull String str2) {
        d(str, str2, null);
    }

    public void d(@NonNull String str, @NonNull String str2, Exception exc) {
        Promise promise = this.f126436a;
        if (promise == null) {
            Log.e(this.f126438c, "cannot reject promise because it's null");
        } else {
            g();
            promise.reject(str, str2, exc);
        }
    }

    public void e() {
        c("OPERATION_CANCELED", "user canceled the document picker");
    }

    public void h(Object obj) {
        Promise promise = this.f126436a;
        if (promise == null) {
            Log.e(this.f126438c, "cannot resolve promise because it's null");
        } else {
            g();
            promise.resolve(obj);
        }
    }

    public boolean i(Promise promise, @NonNull String str) {
        if (this.f126436a != null) {
            f(promise, str);
            return false;
        }
        this.f126436a = promise;
        this.f126437b = str;
        return true;
    }
}
