package kx;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f89443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f89444b;

    public b(double d11, double d12) {
        this.f89443a = d11;
        this.f89444b = d12;
    }

    @NonNull
    public String toString() {
        return "Point{x=" + this.f89443a + ", y=" + this.f89444b + CoreConstants.CURLY_RIGHT;
    }
}
