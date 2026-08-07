package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import v7.j;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9282a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.InterfaceC0192a f9283b = new a.InterfaceC0192a() { // from class: v7.m
        @Override // androidx.media3.datasource.a.InterfaceC0192a
        public final androidx.media3.datasource.a a() {
            return androidx.media3.datasource.h.o();
        }
    };

    private h() {
    }

    public static /* synthetic */ h o() {
        return new h();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public void n(q qVar) {
    }
}
