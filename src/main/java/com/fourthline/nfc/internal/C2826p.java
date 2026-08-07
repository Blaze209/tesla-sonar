package com.fourthline.nfc.internal;

import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.nfc.IdlBasicInfo;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2826p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f24675c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24676d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f24677e = {95, 3};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f24678f = {95, 4};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f24679g = {95, 5};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f24680h = {95, 6};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f24681i = {95, 7};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f24682j = {95, 10};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f24683k = {95, 11};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f24684l = {95, 12};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f24685m = {95, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f24686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SimpleDateFormat f24687b;

    /* JADX INFO: renamed from: com.fourthline.nfc.internal.p$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2826p(byte[] raw) {
        p013kotlin.jvm.internal.s.k(raw, "raw");
        this.f24686a = raw;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.f24687b = simpleDateFormat;
    }

    private final Date c(byte[] bArr, byte[] bArr2) {
        try {
            return this.f24687b.parse(ExtensionsKt.toHex(b(bArr, bArr2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    private final String d(byte[] bArr, byte[] bArr2) {
        return new String(b(bArr, bArr2), p013kotlin.text.d.UTF_8);
    }

    public final byte[] a() {
        return this.f24686a;
    }

    public final IdlBasicInfo b() {
        byte[] bArr = this.f24686a;
        return new IdlBasicInfo(d(bArr, f24677e), d(bArr, f24684l), d(bArr, f24685m), c(bArr, f24682j), c(bArr, f24683k), c(bArr, f24680h), d(bArr, f24681i), d(bArr, f24679g), d(bArr, f24678f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2826p) && p013kotlin.jvm.internal.s.f(this.f24686a, ((C2826p) obj).f24686a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24686a);
    }

    public String toString() {
        return "DG1IDL(raw=" + Arrays.toString(this.f24686a) + ")";
    }

    private final int a(byte[] bArr, byte[] bArr2) {
        int iA = AbstractC2833x.a(bArr, bArr2);
        return (iA == -1 || iA == 0) ? iA : iA + 2;
    }

    private final byte[] b(byte[] bArr, byte[] bArr2) {
        int iA = a(bArr, bArr2);
        int i11 = iA + 1;
        return p013kotlin.collections.n.u(bArr, i11, bArr[iA] + i11);
    }
}
