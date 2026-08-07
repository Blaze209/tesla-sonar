package fv;

import com.adyen.checkout.components.core.Address;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f66647d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f66648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f66650c;

    class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f66651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f66652b;

        a(byte[] bArr, int[] iArr) {
            this.f66651a = bArr;
            this.f66652b = iArr;
        }

        @Override // fv.h.d
        public void a(InputStream inputStream, int i11) throws IOException {
            try {
                inputStream.read(this.f66651a, this.f66652b[0], i11);
                int[] iArr = this.f66652b;
                iArr[0] = iArr[0] + i11;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f66654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66655b;

        b(byte[] bArr, int i11) {
            this.f66654a = bArr;
            this.f66655b = i11;
        }
    }

    i(File file, int i11) {
        this.f66648a = file;
        this.f66649b = i11;
    }

    private void f(long j11, String str) {
        if (this.f66650c == null) {
            return;
        }
        if (str == null) {
            str = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        try {
            int i11 = this.f66649b / 4;
            if (str.length() > i11) {
                str = "..." + str.substring(str.length() - i11);
            }
            this.f66650c.t(String.format(Locale.US, "%d %s%n", Long.valueOf(j11), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f66647d));
            while (!this.f66650c.T() && this.f66650c.y0() > this.f66649b) {
                this.f66650c.s0();
            }
        } catch (IOException e11) {
            bv.g.f().e("There was a problem writing to the Crashlytics log.", e11);
        }
    }

    private b g() {
        if (!this.f66648a.exists()) {
            return null;
        }
        h();
        h hVar = this.f66650c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.y0()];
        try {
            this.f66650c.I(new a(bArr, iArr));
        } catch (IOException e11) {
            bv.g.f().e("A problem occurred while reading the Crashlytics log file.", e11);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f66650c == null) {
            try {
                this.f66650c = new h(this.f66648a);
            } catch (IOException e11) {
                bv.g.f().e("Could not open log file: " + this.f66648a, e11);
            }
        }
    }

    @Override // fv.d
    public byte[] a() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i11 = bVarG.f66655b;
        byte[] bArr = new byte[i11];
        System.arraycopy(bVarG.f66654a, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // fv.d
    public void b() {
        d();
        this.f66648a.delete();
    }

    @Override // fv.d
    public void c(long j11, String str) {
        h();
        f(j11, str);
    }

    @Override // fv.d
    public void d() {
        com.google.firebase.crashlytics.internal.common.i.f(this.f66650c, "There was a problem closing the Crashlytics log file.");
        this.f66650c = null;
    }

    @Override // fv.d
    public String e() {
        byte[] bArrA = a();
        if (bArrA != null) {
            return new String(bArrA, f66647d);
        }
        return null;
    }
}
