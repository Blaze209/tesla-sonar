package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.common.util.concurrent.s;
import com.google.common.util.concurrent.u;
import com.google.common.util.concurrent.w;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import ou.x;
import ou.y;
import v7.i;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements s7.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x<u> f9147e = y.a(new x() { // from class: v7.e
        @Override // ou.x
        public final Object get() {
            return w.c(Executors.newSingleThreadExecutor());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f9148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.InterfaceC0192a f9149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BitmapFactory.Options f9150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9151d;

    public b(Context context) {
        this((u) s7.a.j(f9147e.get()), new c.a(context));
    }

    public static /* synthetic */ Bitmap d(b bVar, byte[] bArr) {
        bVar.getClass();
        return v7.b.a(bArr, bArr.length, bVar.f9150c, bVar.f9151d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap g(a aVar, Uri uri, BitmapFactory.Options options, int i11) {
        try {
            aVar.j(new j(uri));
            byte[] bArrB = i.b(aVar);
            return v7.b.a(bArrB, bArrB.length, options, i11);
        } finally {
            aVar.close();
        }
    }

    @Override // s7.h
    public s<Bitmap> a(final byte[] bArr) {
        return this.f9148a.submit(new Callable() { // from class: v7.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return androidx.media3.datasource.b.d(this.f118093a, bArr);
            }
        });
    }

    @Override // s7.h
    public s<Bitmap> c(final Uri uri) {
        return this.f9148a.submit(new Callable() { // from class: v7.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                androidx.media3.datasource.b bVar = this.f118091a;
                return androidx.media3.datasource.b.g(bVar.f9149b.a(), uri, bVar.f9150c, bVar.f9151d);
            }
        });
    }

    public b(u uVar, a.InterfaceC0192a interfaceC0192a) {
        this(uVar, interfaceC0192a, null);
    }

    public b(u uVar, a.InterfaceC0192a interfaceC0192a, BitmapFactory.Options options) {
        this(uVar, interfaceC0192a, options, -1);
    }

    public b(u uVar, a.InterfaceC0192a interfaceC0192a, BitmapFactory.Options options, int i11) {
        this.f9148a = uVar;
        this.f9149b = interfaceC0192a;
        this.f9150c = options;
        this.f9151d = i11;
    }
}
