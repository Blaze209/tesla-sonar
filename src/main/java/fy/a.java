package fy;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import dy.d;
import ey.c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class a implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final a f66714d = new C1357a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f66716b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference f66715a = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f66717c = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    /* JADX INFO: renamed from: fy.a$a, reason: collision with other inner class name */
    public static class C1357a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Executor f66718a;

        @NonNull
        public a a() {
            return new a(this.f66718a, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile");
        }
    }

    public a(Executor executor, @NonNull String str) {
        this.f66716b = executor;
    }

    @Override // dy.d
    public final Executor c() {
        return this.f66716b;
    }

    @Override // dy.d
    @NonNull
    public final String d() {
        return true != f() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // dy.d
    @NonNull
    public final String e() {
        return this.f66717c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return Objects.equal(this.f66716b, ((a) obj).f66716b);
        }
        return false;
    }

    @Override // dy.d
    public final boolean f() {
        return c.a(this.f66715a, "com.google.mlkit.dynamite.text.latin");
    }

    @Override // dy.d
    @NonNull
    public final String g() {
        return "en";
    }

    @Override // dy.d
    public final int h() {
        return 1;
    }

    public int hashCode() {
        return Objects.hashCode(this.f66716b);
    }

    @Override // dy.d
    @NonNull
    public final String i() {
        return "optional-module-text-latin";
    }

    @Override // dy.d
    public final int j() {
        return f() ? 24317 : 24306;
    }

    @Override // dy.d
    @NonNull
    public final String k() {
        return true != f() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }
}
