package com.fourthline.nfc.internal;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.CoreConstants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24526b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24527c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f24528a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f24529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f24531c;

        public b(byte[] bytes, int i11, int i12) {
            p013kotlin.jvm.internal.s.k(bytes, "bytes");
            this.f24529a = bytes;
            this.f24530b = i11;
            this.f24531c = i12;
        }

        public final byte[] a() {
            return this.f24529a;
        }

        public final int b() {
            return this.f24531c;
        }

        public final int c() {
            return this.f24530b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!p013kotlin.jvm.internal.s.f(b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type com.fourthline.nfc.internal.jpeg2000.Jpeg2kConverter.PDFData");
            b bVar = (b) obj;
            return Arrays.equals(this.f24529a, bVar.f24529a) && this.f24530b == bVar.f24530b && this.f24531c == bVar.f24531c;
        }

        public int hashCode() {
            return (((Arrays.hashCode(this.f24529a) * 31) + this.f24530b) * 31) + this.f24531c;
        }

        public String toString() {
            return "PDFData(bytes=" + Arrays.toString(this.f24529a) + ", width=" + this.f24530b + ", height=" + this.f24531c + ")";
        }
    }

    public G(File tmpDir) {
        p013kotlin.jvm.internal.s.k(tmpDir, "tmpDir");
        this.f24528a = tmpDir;
    }

    public final Bitmap a(byte[] j2k) throws IOException {
        p013kotlin.jvm.internal.s.k(j2k, "j2k");
        b bVarB = b(j2k);
        this.f24528a.mkdirs();
        File fileCreateTempFile = File.createTempFile("tmp_conv", ".pdf", this.f24528a);
        p013kotlin.jvm.internal.s.h(fileCreateTempFile);
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        fileOutputStream.write(bVarB.a());
        fileOutputStream.close();
        PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(fileCreateTempFile, 268435456));
        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVarB.c(), bVarB.b(), Bitmap.Config.ARGB_8888);
        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
        pageOpenPage.close();
        pdfRenderer.close();
        fileCreateTempFile.delete();
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final b b(byte[] j2k) throws IOException {
        int iA;
        int iA2;
        p013kotlin.jvm.internal.s.k(j2k, "j2k");
        if (j2k.length < 20) {
            throw new IllegalArgumentException("Not Jpeg2K");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        if ((j2k[0] & 255) == 255 && (j2k[1] & 255) == 79 && (j2k[2] & 255) == 255 && (j2k[3] & 255) == 81) {
            iA = a(j2k, 8);
            iA2 = a(j2k, 12);
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 12, 106, 80, 32, 32, 13, 10, -121, 10});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 20, 102, 116, 121, 112, 106, 112, 50, 32, 0, 0, 0, 0, 106, 112, 50, 32});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 45, 106, 112, 50, 104});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 22, 105, 104, 100, 114});
            a(byteArrayOutputStream, iA2);
            a(byteArrayOutputStream, iA);
            byteArrayOutputStream.write(new byte[]{0, 3, 7, 7, 1, 0});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 15, 99, 111, 108, 114, 1, 0, 0, 0, 0, 0, Tnaf.POW_2_WIDTH});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0, 106, 112, 50, 99});
        } else {
            byte[] bArr = {105, 104, 100, 114};
            int length = j2k.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                if (j2k[i12] == bArr[i13]) {
                    i13++;
                    if (i13 == 4) {
                        i12++;
                        break;
                    }
                } else {
                    i13 = 0;
                }
                i12++;
            }
            if (i13 != 4 || i12 + 8 > j2k.length) {
                throw new IllegalArgumentException("Not J2K");
            }
            iA = a(j2k, i12 + 4);
            iA2 = a(j2k, i12);
        }
        String strK0 = p013kotlin.text.t.K0(String.valueOf(iA), 8, ' ');
        String strK1 = p013kotlin.text.t.K0(String.valueOf(iA2), 9, ' ');
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String strK2 = p013kotlin.text.t.K0(String.valueOf(byteArray.length + j2k.length), 9, ' ');
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        int i14 = -1;
        while (i11 < 753) {
            int i15 = i11 + 1;
            char cCharAt = "%PDF-1.5\n1 0 obj\n<< /Pages 2 0 R /Type /Catalog >>\nendobj\n2 0 obj\n<< /Count 1 /Kids [ 3 0 R ] /Type /Pages >>\nendobj\n3 0 obj\n<< /Contents 4 0 R /MediaBox [ 0.0 0.0 @{width} @{height} ]\n  /Parent 2 0 R /Resources <<\n     /ProcSet [ /PDF /ImageC ]\n     /XObject << /J2K 5 0 R >>\n     >>\n   /Type /Page >>\nendobj\n4 0 obj\n<< /Length 42 >>\nstream\nq\n@{width} 0 0 @{height} 0 0 cm\n/J2K Do\nQ\nendstream\nendobj\n5 0 obj\n<< /Filter /JPXDecode /Subtype /Image /Type /XObject\n/Width @{width} /Height @{height} /Length @{length} >>\nstream\n@{image-bytes}\nendstream\nendobj\n@{xref}\n0 6\n0000000000 65535 f\r\n0000000009 00000 n\r\n0000000058 00000 n\r\n0000000117 00000 n\r\n0000000310 00000 n\r\n0000000401 00000 n\r\ntrailer << /Root 1 0 R /Size 6 >>\nstartxref\n@{xref-offset}\n%%EOF\n".charAt(i11);
            if (cCharAt != '@') {
                byteArrayOutputStream2.write(cCharAt);
                i11 = i15;
            } else {
                int i16 = i11 + 2;
                if ("%PDF-1.5\n1 0 obj\n<< /Pages 2 0 R /Type /Catalog >>\nendobj\n2 0 obj\n<< /Count 1 /Kids [ 3 0 R ] /Type /Pages >>\nendobj\n3 0 obj\n<< /Contents 4 0 R /MediaBox [ 0.0 0.0 @{width} @{height} ]\n  /Parent 2 0 R /Resources <<\n     /ProcSet [ /PDF /ImageC ]\n     /XObject << /J2K 5 0 R >>\n     >>\n   /Type /Page >>\nendobj\n4 0 obj\n<< /Length 42 >>\nstream\nq\n@{width} 0 0 @{height} 0 0 cm\n/J2K Do\nQ\nendstream\nendobj\n5 0 obj\n<< /Filter /JPXDecode /Subtype /Image /Type /XObject\n/Width @{width} /Height @{height} /Length @{length} >>\nstream\n@{image-bytes}\nendstream\nendobj\n@{xref}\n0 6\n0000000000 65535 f\r\n0000000009 00000 n\r\n0000000058 00000 n\r\n0000000117 00000 n\r\n0000000310 00000 n\r\n0000000401 00000 n\r\ntrailer << /Root 1 0 R /Size 6 >>\nstartxref\n@{xref-offset}\n%%EOF\n".charAt(i15) != '{') {
                    throw new IllegalStateException("Invalid template");
                }
                int iU0 = p013kotlin.text.t.u0("%PDF-1.5\n1 0 obj\n<< /Pages 2 0 R /Type /Catalog >>\nendobj\n2 0 obj\n<< /Count 1 /Kids [ 3 0 R ] /Type /Pages >>\nendobj\n3 0 obj\n<< /Contents 4 0 R /MediaBox [ 0.0 0.0 @{width} @{height} ]\n  /Parent 2 0 R /Resources <<\n     /ProcSet [ /PDF /ImageC ]\n     /XObject << /J2K 5 0 R >>\n     >>\n   /Type /Page >>\nendobj\n4 0 obj\n<< /Length 42 >>\nstream\nq\n@{width} 0 0 @{height} 0 0 cm\n/J2K Do\nQ\nendstream\nendobj\n5 0 obj\n<< /Filter /JPXDecode /Subtype /Image /Type /XObject\n/Width @{width} /Height @{height} /Length @{length} >>\nstream\n@{image-bytes}\nendstream\nendobj\n@{xref}\n0 6\n0000000000 65535 f\r\n0000000009 00000 n\r\n0000000058 00000 n\r\n0000000117 00000 n\r\n0000000310 00000 n\r\n0000000401 00000 n\r\ntrailer << /Root 1 0 R /Size 6 >>\nstartxref\n@{xref-offset}\n%%EOF\n", CoreConstants.CURLY_RIGHT, i16, false, 4, null);
                String strSubstring = "%PDF-1.5\n1 0 obj\n<< /Pages 2 0 R /Type /Catalog >>\nendobj\n2 0 obj\n<< /Count 1 /Kids [ 3 0 R ] /Type /Pages >>\nendobj\n3 0 obj\n<< /Contents 4 0 R /MediaBox [ 0.0 0.0 @{width} @{height} ]\n  /Parent 2 0 R /Resources <<\n     /ProcSet [ /PDF /ImageC ]\n     /XObject << /J2K 5 0 R >>\n     >>\n   /Type /Page >>\nendobj\n4 0 obj\n<< /Length 42 >>\nstream\nq\n@{width} 0 0 @{height} 0 0 cm\n/J2K Do\nQ\nendstream\nendobj\n5 0 obj\n<< /Filter /JPXDecode /Subtype /Image /Type /XObject\n/Width @{width} /Height @{height} /Length @{length} >>\nstream\n@{image-bytes}\nendstream\nendobj\n@{xref}\n0 6\n0000000000 65535 f\r\n0000000009 00000 n\r\n0000000058 00000 n\r\n0000000117 00000 n\r\n0000000310 00000 n\r\n0000000401 00000 n\r\ntrailer << /Root 1 0 R /Size 6 >>\nstartxref\n@{xref-offset}\n%%EOF\n".substring(i16, iU0);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                i11 = iU0 + 1;
                switch (strSubstring.hashCode()) {
                    case -2041600635:
                        if (!strSubstring.equals("xref-offset")) {
                            throw new IllegalStateException("unknown name: " + strSubstring);
                        }
                        a(byteArrayOutputStream2, String.valueOf(i14));
                        break;
                        break;
                    case -1221029593:
                        if (!strSubstring.equals(Snapshot.HEIGHT)) {
                            throw new IllegalStateException("unknown name: " + strSubstring);
                        }
                        a(byteArrayOutputStream2, strK1);
                        break;
                        break;
                    case -1106363674:
                        if (!strSubstring.equals("length")) {
                            throw new IllegalStateException("unknown name: " + strSubstring);
                        }
                        a(byteArrayOutputStream2, strK2);
                        break;
                        break;
                    case 3687707:
                        if (!strSubstring.equals("xref")) {
                            throw new IllegalStateException("unknown name: " + strSubstring);
                        }
                        int size = byteArrayOutputStream2.size();
                        a(byteArrayOutputStream2, "xref");
                        i14 = size;
                        break;
                        break;
                    case 113126854:
                        if (!strSubstring.equals(Snapshot.WIDTH)) {
                            throw new IllegalStateException("unknown name: " + strSubstring);
                        }
                        a(byteArrayOutputStream2, strK0);
                        break;
                        break;
                    case 1071041913:
                        if (!strSubstring.equals("image-bytes")) {
                            throw new IllegalStateException("unknown name: " + strSubstring);
                        }
                        byteArrayOutputStream2.write(byteArray);
                        byteArrayOutputStream2.write(j2k);
                        break;
                        break;
                    default:
                        throw new IllegalStateException("unknown name: " + strSubstring);
                }
            }
        }
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        p013kotlin.jvm.internal.s.j(byteArray2, "toByteArray(...)");
        return new b(byteArray2, iA, iA2);
    }

    private final void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArrayOutputStream.write(str.charAt(i11));
        }
    }

    private final void a(ByteArrayOutputStream byteArrayOutputStream, int i11) {
        byteArrayOutputStream.write(i11 >>> 24);
        byteArrayOutputStream.write(i11 >>> 16);
        byteArrayOutputStream.write(i11 >>> 8);
        byteArrayOutputStream.write(i11);
    }

    private final int a(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }
}
