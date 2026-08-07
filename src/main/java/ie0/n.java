package ie0;

import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007\u001a\u0011\u0010\r\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0003\"\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "", "a", "(Ljava/lang/String;)[B", "", "flag", "b", "([BI)Ljava/lang/String;", "Lokio/k;", "h", "(Lokio/k;)Ljava/lang/String;", "bytesUsed", DateTokenConverter.CONVERTER_KEY, "g", "(Ljava/lang/String;)Lokio/k;", "f", "", "[C", "getHEX_DIGIT_CHARS", "()[C", "HEX_DIGIT_CHARS", "utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f77605a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final byte[] a(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, 0);
        p013kotlin.jvm.internal.s.j(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    public static final String b(byte[] bArr, int i11) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        String strEncodeToString = Base64.encodeToString(bArr, i11);
        p013kotlin.jvm.internal.s.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static /* synthetic */ String c(byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        return b(bArr, i11);
    }

    public static final String d(byte[] bArr, int i11) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        char[] cArr = new char[i11 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            byte b11 = bArr[i13];
            int i14 = i12 + 1;
            char[] cArr2 = f77605a;
            cArr[i12] = cArr2[(b11 >> 4) & 15];
            i12 += 2;
            cArr[i14] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public static /* synthetic */ String e(byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bArr.length;
        }
        return d(bArr, i11);
    }

    public static final byte[] f(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<T> it = p013kotlin.text.t.V1(str, 2, 2, true).iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(Integer.parseInt((String) it.next(), p013kotlin.text.a.a(16)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final okio.k g(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        return okio.k.Companion.i(okio.k.INSTANCE, f(str), 0, 0, 3, null);
    }

    public static final String h(okio.k kVar) {
        p013kotlin.jvm.internal.s.k(kVar, "<this>");
        String strM = kVar.m();
        Locale US = Locale.US;
        p013kotlin.jvm.internal.s.j(US, "US");
        String upperCase = strM.toUpperCase(US);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
