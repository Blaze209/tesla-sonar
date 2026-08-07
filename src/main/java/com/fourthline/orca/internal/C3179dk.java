package com.fourthline.orca.internal;

import i4.SpanStyle;
import i4.TextStyle;
import java.util.ArrayList;
import java.util.List;
import o4.TransformedText;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C3179dk implements o4.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextStyle f31203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f31204e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dk$a */
    public static final class a implements o4.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31206b;

        a(int i11) {
            this.f31206b = i11;
        }

        @Override // o4.f0
        public int originalToTransformed(int i11) {
            int iAbs = Math.abs(i11);
            if (iAbs == 0) {
                return 0;
            }
            String strSubstring = C3179dk.this.f31200a;
            int length = strSubstring.length();
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (strSubstring.charAt(i13) == '#') {
                    i12++;
                }
                if (i12 >= iAbs) {
                    strSubstring = strSubstring.substring(0, i13);
                    p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                    break;
                }
            }
            return strSubstring.length() + ((p013kotlin.jvm.internal.s.f(strSubstring, "#") || p013kotlin.jvm.internal.s.f(strSubstring, "## / #")) ? 3 : 0) + 1;
        }

        @Override // o4.f0
        public int transformedToOriginal(int i11) {
            String strT1 = p013kotlin.text.t.T1(C3179dk.this.f31200a, Math.abs(i11));
            int i12 = 0;
            for (int i13 = 0; i13 < strT1.length(); i13++) {
                if (strT1.charAt(i13) == '#') {
                    i12++;
                }
            }
            return Math.min(i12, this.f31206b);
        }
    }

    public /* synthetic */ C3179dk(String str, String str2, long j11, TextStyle textStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j11, textStyle);
    }

    @Override // o4.z0
    public TransformedText filter(i4.d text) {
        i4.d dVar;
        p013kotlin.jvm.internal.s.k(text, "text");
        String string = "";
        int i11 = 0;
        for (int i12 = 0; i12 < text.length(); i12++) {
            char cCharAt = text.charAt(i12);
            while (this.f31204e.contains(Integer.valueOf(i11))) {
                char cCharAt2 = this.f31200a.charAt(i11);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) string);
                sb2.append(cCharAt2);
                string = sb2.toString();
                i11++;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) string);
            sb3.append(cCharAt);
            string = sb3.toString();
            i11++;
        }
        String str = this.f31201b;
        if (str != null) {
            String strSubstring = str.substring(string.length());
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            i4.d.a aVar = new i4.d.a(0, 1, null);
            aVar.i(string);
            int iN = aVar.n(new SpanStyle(this.f31202c, 0L, null, this.f31203d.o(), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65526, null));
            try {
                aVar.i(strSubstring);
                jn0.h0 h0Var = jn0.h0.f84049a;
                aVar.k(iN);
                dVar = aVar.o();
            } catch (Throwable th2) {
                aVar.k(iN);
                throw th2;
            }
        } else {
            dVar = new i4.d(string, null, null, 6, null);
        }
        return new TransformedText(dVar, a(text.length()));
    }

    private C3179dk(String mask, String str, long j11, TextStyle placeholderStyle) {
        p013kotlin.jvm.internal.s.k(mask, "mask");
        p013kotlin.jvm.internal.s.k(placeholderStyle, "placeholderStyle");
        this.f31200a = mask;
        this.f31201b = str;
        this.f31202c = j11;
        this.f31203d = placeholderStyle;
        bo0.j jVarO0 = p013kotlin.text.t.o0(mask);
        ArrayList arrayList = new ArrayList();
        for (Integer num : jVarO0) {
            if (this.f31200a.charAt(num.intValue()) != '#') {
                arrayList.add(num);
            }
        }
        this.f31204e = arrayList;
    }

    private final a a(int i11) {
        return new a(i11);
    }

    public /* synthetic */ C3179dk(String str, String str2, long j11, TextStyle textStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? k3.p1.INSTANCE.d() : j11, (i11 & 8) != 0 ? TextStyle.INSTANCE.a() : textStyle, null);
    }
}
