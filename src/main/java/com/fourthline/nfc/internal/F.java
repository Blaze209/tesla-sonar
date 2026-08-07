package com.fourthline.nfc.internal;

import android.graphics.Bitmap;
import android.util.Base64;
import java.util.Arrays;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24523b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24524c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f24525a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public F(G jpeg2kConverter) {
        p013kotlin.jvm.internal.s.k(jpeg2kConverter, "jpeg2kConverter");
        this.f24525a = jpeg2kConverter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.equals("image/jpeg2000") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r0.equals("image/jp2") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        return b(r4);
     */
    @Override // com.fourthline.nfc.internal.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap a(com.fourthline.nfc.internal.W r4) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "faceImageInfo"
            p013kotlin.jvm.internal.s.k(r4, r0)
            java.lang.String r0 = r4.getMimeType()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = "ROOT"
            p013kotlin.jvm.internal.s.j(r1, r2)
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            p013kotlin.jvm.internal.s.j(r0, r1)
            int r1 = r0.hashCode()
            r2 = -879264520(0xffffffffcb977cf8, float:-1.9855856E7)
            if (r1 == r2) goto L47
            r2 = 1146356876(0x4454048c, float:848.07104)
            if (r1 == r2) goto L36
            r2 = 2008149850(0x77b1ef5a, float:7.2179E33)
            if (r1 == r2) goto L2d
            goto L54
        L2d:
            java.lang.String r1 = "image/jpeg2000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L54
        L36:
            java.lang.String r1 = "image/x-wsq"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L54
        L3f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "image/x-wsq is not supported"
            r4.<init>(r0)
            throw r4
        L47:
            java.lang.String r1 = "image/jp2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
        L4f:
            android.graphics.Bitmap r4 = r3.b(r4)
            return r4
        L54:
            java.io.InputStream r4 = r4.getImageInputStream()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)
            java.lang.String r0 = "decodeStream(...)"
            p013kotlin.jvm.internal.s.j(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.nfc.internal.F.a(com.fourthline.nfc.internal.W):android.graphics.Bitmap");
    }

    private final Bitmap b(W w11) {
        byte[] bArrC = sn0.a.c(w11.getImageInputStream());
        p013kotlin.collections.v.y0(p013kotlin.collections.n.m1(bArrC, 16), " ", null, null, 0, null, new wn0.l() { // from class: com.fourthline.nfc.internal.e1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return F.a(((Byte) obj).byteValue());
            }
        }, 30, null);
        String strEncodeToString = Base64.encodeToString(bArrC, 0);
        p013kotlin.jvm.internal.s.j(strEncodeToString, "encodeToString(...)");
        String strT1 = p013kotlin.text.t.T1(strEncodeToString, 100);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strT1);
        sb2.append("...");
        int length = bArrC.length;
        w11.getMimeType();
        return this.f24525a.a(bArrC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(byte b11) {
        p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(b11 & 255)}, 1));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        return str;
    }
}
