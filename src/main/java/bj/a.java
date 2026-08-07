package bj;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: bj.a$a, reason: collision with other inner class name */
    public interface InterfaceC0349a {
        @NonNull
        byte[] a(int i11);

        @NonNull
        Bitmap b(int i11, int i12, @NonNull Bitmap.Config config);

        void c(@NonNull Bitmap bitmap);

        @NonNull
        int[] d(int i11);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    int a();

    int b();

    void c(@NonNull Bitmap.Config config);

    void clear();

    void d();

    int e();

    void f();

    int g();

    @NonNull
    ByteBuffer getData();

    Bitmap getNextFrame();
}
