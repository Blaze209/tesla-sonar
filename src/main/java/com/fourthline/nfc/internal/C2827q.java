package com.fourthline.nfc.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Arrays;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2827q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f24693b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24694c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f24695d = {-1, -40, -1, -32, 0, Tnaf.POW_2_WIDTH, 74, 70, 73, 70};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f24696a;

    /* JADX INFO: renamed from: com.fourthline.nfc.internal.q$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2827q(byte[] raw) {
        p013kotlin.jvm.internal.s.k(raw, "raw");
        this.f24696a = raw;
    }

    public final byte[] a() {
        return this.f24696a;
    }

    public final Bitmap b() {
        int iA = AbstractC2833x.a(this.f24696a, f24695d);
        byte[] bArr = this.f24696a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, iA, bArr.length - iA);
        p013kotlin.jvm.internal.s.j(bitmapDecodeByteArray, "with(...)");
        return bitmapDecodeByteArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2827q) && p013kotlin.jvm.internal.s.f(this.f24696a, ((C2827q) obj).f24696a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24696a);
    }

    public String toString() {
        return "DG6IDL(raw=" + Arrays.toString(this.f24696a) + ")";
    }
}
