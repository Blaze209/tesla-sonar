package ga;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.h f67672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1393a f67673b;

    public a(s7.h hVar) {
        this.f67672a = hVar;
    }

    @Override // s7.h
    public com.google.common.util.concurrent.s<Bitmap> a(byte[] bArr) {
        C1393a c1393a = this.f67673b;
        if (c1393a != null && c1393a.c(bArr)) {
            return this.f67673b.a();
        }
        com.google.common.util.concurrent.s<Bitmap> sVarA = this.f67672a.a(bArr);
        this.f67673b = new C1393a(bArr, sVarA);
        return sVarA;
    }

    @Override // s7.h
    public com.google.common.util.concurrent.s<Bitmap> c(Uri uri) {
        C1393a c1393a = this.f67673b;
        if (c1393a != null && c1393a.b(uri)) {
            return this.f67673b.a();
        }
        com.google.common.util.concurrent.s<Bitmap> sVarC = this.f67672a.c(uri);
        this.f67673b = new C1393a(uri, sVarC);
        return sVarC;
    }

    /* JADX INFO: renamed from: ga.a$a, reason: collision with other inner class name */
    private static class C1393a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f67674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f67675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.common.util.concurrent.s<Bitmap> f67676c;

        public C1393a(byte[] bArr, com.google.common.util.concurrent.s<Bitmap> sVar) {
            this.f67674a = bArr;
            this.f67675b = null;
            this.f67676c = sVar;
        }

        public com.google.common.util.concurrent.s<Bitmap> a() {
            return (com.google.common.util.concurrent.s) s7.a.j(this.f67676c);
        }

        public boolean b(Uri uri) {
            Uri uri2 = this.f67675b;
            return uri2 != null && uri2.equals(uri);
        }

        public boolean c(byte[] bArr) {
            byte[] bArr2 = this.f67674a;
            return bArr2 != null && Arrays.equals(bArr2, bArr);
        }

        public C1393a(Uri uri, com.google.common.util.concurrent.s<Bitmap> sVar) {
            this.f67674a = null;
            this.f67675b = uri;
            this.f67676c = sVar;
        }
    }
}
