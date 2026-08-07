package x;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.core.impl.x0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx/b;", "", "<init>", "()V", "Lu/a$a;", "options", "Landroidx/camera/core/impl/x0$c;", "priority", "Ljn0/h0;", "a", "(Lu/a$a;Landroidx/camera/core/impl/x0$c;)V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f122447a = new b();

    private b() {
    }

    public static final void a(u.a.C2464a options, x0.c priority) {
        s.k(options, "options");
        s.k(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
