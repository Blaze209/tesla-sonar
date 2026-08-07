package com.fourthline.orca.internal;

import o4.TransformedText;

/* JADX INFO: renamed from: com.fourthline.orca.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3197e2 implements o4.z0 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.e2$a */
    public static final class a implements o4.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31295b;

        a(String str, String str2) {
            this.f31294a = str;
            this.f31295b = str2;
        }

        @Override // o4.f0
        public int originalToTransformed(int i11) {
            int iMin = Math.min(i11, this.f31294a.length());
            return Math.min(iMin + (iMin / 4), this.f31295b.length());
        }

        @Override // o4.f0
        public int transformedToOriginal(int i11) {
            int iMin = Math.min(i11, this.f31295b.length());
            return Math.min(iMin - (iMin / 5), this.f31294a.length());
        }
    }

    @Override // o4.z0
    public TransformedText filter(i4.d text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        String strV = p013kotlin.text.t.V(text.getText(), " ", "", false, 4, null);
        StringBuilder sb2 = new StringBuilder();
        int length = strV.length();
        int i11 = 0;
        while (i11 < length) {
            sb2.append(strV.charAt(i11));
            int i12 = i11 + 1;
            if (i12 % 4 == 0 && i11 != p013kotlin.text.t.p0(strV)) {
                sb2.append(' ');
            }
            i11 = i12;
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return new TransformedText(new i4.d(string, null, null, 6, null), new a(strV, string));
    }
}
