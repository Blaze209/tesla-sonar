package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v7.q;

/* JADX INFO: loaded from: classes3.dex */
class a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f9938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f9939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f9940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f9941d;

    public a(androidx.media3.datasource.a aVar, byte[] bArr, byte[] bArr2) {
        this.f9938a = aVar;
        this.f9939b = bArr;
        this.f9940c = bArr2;
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> b() {
        return this.f9938a.b();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        if (this.f9941d != null) {
            this.f9941d = null;
            this.f9938a.close();
        }
    }

    @Override // androidx.media3.datasource.a
    public final Uri getUri() {
        return this.f9938a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public final long j(v7.j jVar) {
        try {
            Cipher cipherO = o();
            try {
                cipherO.init(2, new SecretKeySpec(this.f9939b, "AES"), new IvParameterSpec(this.f9940c));
                v7.h hVar = new v7.h(this.f9938a, jVar);
                this.f9941d = new CipherInputStream(hVar, cipherO);
                hVar.n();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // androidx.media3.datasource.a
    public final void n(q qVar) {
        s7.a.f(qVar);
        this.f9938a.n(qVar);
    }

    protected Cipher o() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p7.j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        s7.a.f(this.f9941d);
        int i13 = this.f9941d.read(bArr, i11, i12);
        if (i13 < 0) {
            return -1;
        }
        return i13;
    }
}
