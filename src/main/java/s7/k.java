package s7;

import android.annotation.SuppressLint;
import android.util.Pair;
import ch.qos.logback.core.net.SyslogConstants;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f110430a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f110431b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f110432c = Pattern.compile("^\\D?(\\d+)$");

    private static int A(int i11) {
        int i12 = 17;
        if (i11 != 17) {
            i12 = 20;
            if (i11 != 20) {
                i12 = 23;
                if (i11 != 23) {
                    i12 = 29;
                    if (i11 != 29) {
                        i12 = 39;
                        if (i11 != 39) {
                            i12 = 42;
                            if (i11 != 42) {
                                switch (i11) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i12;
    }

    public static Pair<Integer, Integer> B(byte[] bArr) {
        c0 c0Var = new c0(bArr);
        c0Var.b0(9);
        int iM = c0Var.M();
        c0Var.b0(20);
        return Pair.create(Integer.valueOf(c0Var.Q()), Integer.valueOf(iM));
    }

    public static boolean C(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] D(byte[] bArr) {
        if (!z(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iN = 0;
        do {
            arrayList.add(Integer.valueOf(iN));
            iN = n(bArr, iN + f110430a.length);
        } while (iN != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            int iIntValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i11] = bArr3;
            i11++;
        }
        return bArr2;
    }

    private static int E(int i11) {
        if (i11 == 10) {
            return 1;
        }
        if (i11 == 11) {
            return 2;
        }
        if (i11 == 20) {
            return 4;
        }
        if (i11 == 21) {
            return 8;
        }
        if (i11 == 30) {
            return 16;
        }
        if (i11 == 31) {
            return 32;
        }
        if (i11 == 40) {
            return 64;
        }
        if (i11 == 41) {
            return 128;
        }
        if (i11 == 50) {
            return 256;
        }
        if (i11 == 51) {
            return 512;
        }
        switch (i11) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return PKIFailureInfo.certRevoked;
            default:
                return -1;
        }
    }

    private static int F(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int a(int i11, int i12) {
        if (i11 == 0) {
            if (i12 == 0) {
                return EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            }
            return -1;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return -1;
            }
            if (i12 == 1) {
                return 1026;
            }
            return i12 == 2 ? 1028 : -1;
        }
        if (i12 == 0) {
            return 513;
        }
        if (i12 == 1) {
            return SyslogConstants.SYSLOG_PORT;
        }
        return -1;
    }

    private static int b(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 4;
        }
        if (i11 != 3) {
            return i11 != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int c(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return PKIFailureInfo.certRevoked;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return PKIFailureInfo.signerNotTrusted;
            case 20:
                return PKIFailureInfo.badCertTemplate;
            case 21:
                return PKIFailureInfo.badSenderNonce;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int d(int i11) {
        switch (i11) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i11) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i11) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i11) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return PKIFailureInfo.certRevoked;
                                    default:
                                        switch (i11) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int e(int i11) {
        if (i11 == 66) {
            return 1;
        }
        if (i11 == 77) {
            return 2;
        }
        if (i11 == 88) {
            return 4;
        }
        if (i11 == 100) {
            return 8;
        }
        if (i11 == 110) {
            return 16;
        }
        if (i11 != 122) {
            return i11 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String f(int i11, int i12, int i13) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static List<byte[]> g(boolean z11) {
        return Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
    }

    public static String h(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
        StringBuilder sb2 = new StringBuilder(q0.J("hvc1.%s%d.%X.%c%d", f110431b[i11], Integer.valueOf(i12), Integer.valueOf(i13), Character.valueOf(z11 ? 'H' : 'L'), Integer.valueOf(i14)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static String i(byte[] bArr) {
        c0 c0Var = new c0(bArr);
        c0Var.d0();
        c0Var.c0(4);
        int iM = c0Var.M();
        int iM2 = c0Var.M();
        c0Var.c0(1);
        c0Var.d0();
        c0Var.d0();
        String strJ = c0Var.J(4);
        if (strJ.equals("mp4a")) {
            c0Var.d0();
            c0Var.c0(2);
            b0 b0Var = new b0();
            b0Var.m(c0Var);
            int iH = b0Var.h(5);
            if (iH == 31) {
                iH = b0Var.h(6) + 32;
            }
            strJ = strJ + ".40." + iH;
        }
        return q0.J("iamf.%03X.%03X.%s", Integer.valueOf(iM), Integer.valueOf(iM2), strJ);
    }

    public static byte[] j(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = f110430a;
        byte[] bArr3 = new byte[bArr2.length + i12];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i11, bArr3, bArr2.length, i12);
        return bArr3;
    }

    public static com.google.common.collect.x<byte[]> k(byte b11, byte b12, byte b13, byte b14) {
        return com.google.common.collect.x.s(new byte[]{1, 1, b11, 2, 1, b12, 3, 1, b13, 4, 1, b14});
    }

    private static Integer l(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    private static Integer m(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            case "10":
                return 1024;
            default:
                return null;
        }
    }

    private static int n(byte[] bArr, int i11) {
        int length = bArr.length - f110430a.length;
        while (i11 <= length) {
            if (z(bArr, i11)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        int iA;
        if (strArr.length != 3) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(p7.g0.h(Integer.parseInt(strArr[1], 16))) && (iA = A(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iA), 0);
            }
        } catch (NumberFormatException unused) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr) {
        if (strArr.length != 4) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2]);
            int i13 = Integer.parseInt(strArr[3]);
            int iA = a(i11, i12);
            if (iA == -1) {
                t.i("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i11 + "." + i12);
                return null;
            }
            int iB = b(i13);
            if (iB != -1) {
                return new Pair<>(Integer.valueOf(iA), Integer.valueOf(iB));
            }
            t.i("CodecSpecificDataUtil", "Unknown AC-4 level: " + i13);
            return null;
        } catch (NumberFormatException unused) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> q(String str, String[] strArr, p7.i iVar) {
        int i11;
        if (strArr.length < 4) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i12 = 1;
        try {
            int i13 = Integer.parseInt(strArr[1]);
            int i14 = Integer.parseInt(strArr[2].substring(0, 2));
            int i15 = Integer.parseInt(strArr[3]);
            if (i13 != 0) {
                t.i("CodecSpecificDataUtil", "Unknown AV1 profile: " + i13);
                return null;
            }
            if (i15 != 8 && i15 != 10) {
                t.i("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i15);
                return null;
            }
            if (i15 != 8) {
                i12 = (iVar == null || !(iVar.f101366d != null || (i11 = iVar.f101365c) == 7 || i11 == 6)) ? 2 : 4096;
            }
            int iC = c(i14);
            if (iC != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(iC));
            }
            t.i("CodecSpecificDataUtil", "Unknown AV1 level: " + i14);
            return null;
        } catch (NumberFormatException unused) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> r(String str, String[] strArr) {
        int i11;
        int i12;
        if (strArr.length < 2) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i12 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i11 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    t.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i13 = Integer.parseInt(strArr[1]);
                i11 = Integer.parseInt(strArr[2]);
                i12 = i13;
            }
            int iE = e(i12);
            if (iE == -1) {
                t.i("CodecSpecificDataUtil", "Unknown AVC profile: " + i12);
                return null;
            }
            int iD = d(i11);
            if (iD != -1) {
                return new Pair<>(Integer.valueOf(iE), Integer.valueOf(iD));
            }
            t.i("CodecSpecificDataUtil", "Unknown AVC level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> s(p7.u uVar) {
        String str = uVar.f101540k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(uVar.f101544o)) {
            return t(uVar.f101540k, strArrSplit);
        }
        byte b11 = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 2986313:
                if (!str2.equals("ac-4")) {
                    b11 = -1;
                }
                break;
            case 3004662:
                b11 = !str2.equals("av01") ? (byte) -1 : (byte) 1;
                break;
            case 3006243:
                b11 = !str2.equals("avc1") ? (byte) -1 : (byte) 2;
                break;
            case 3006244:
                b11 = !str2.equals("avc2") ? (byte) -1 : (byte) 3;
                break;
            case 3199032:
                b11 = !str2.equals("hev1") ? (byte) -1 : (byte) 4;
                break;
            case 3214780:
                b11 = !str2.equals("hvc1") ? (byte) -1 : (byte) 5;
                break;
            case 3224753:
                b11 = !str2.equals("iamf") ? (byte) -1 : (byte) 6;
                break;
            case 3356560:
                b11 = !str2.equals("mp4a") ? (byte) -1 : (byte) 7;
                break;
            case 3475740:
                b11 = !str2.equals("s263") ? (byte) -1 : (byte) 8;
                break;
            case 3624515:
                b11 = !str2.equals("vp09") ? (byte) -1 : (byte) 9;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                return p(uVar.f101540k, strArrSplit);
            case 1:
                return q(uVar.f101540k, strArrSplit, uVar.E);
            case 2:
            case 3:
                return r(uVar.f101540k, strArrSplit);
            case 4:
            case 5:
                return v(uVar.f101540k, strArrSplit, uVar.E);
            case 6:
                return w(uVar.f101540k, strArrSplit);
            case 7:
                return o(uVar.f101540k, strArrSplit);
            case 8:
                return u(uVar.f101540k, strArrSplit);
            case 9:
                return x(uVar.f101540k, strArrSplit);
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> t(String str, String[] strArr) {
        if (strArr.length < 3) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f110432c.matcher(strArr[1]);
        if (!matcher.matches()) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numM = m(strGroup);
        if (numM == null) {
            t.i("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numL = l(str2);
        if (numL != null) {
            return new Pair<>(numM, numL);
        }
        t.i("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> u(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair<Integer, Integer> v(String str, String[] strArr, p7.i iVar) {
        if (strArr.length < 4) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i11 = 1;
        Matcher matcher = f110432c.matcher(strArr[1]);
        if (!matcher.matches()) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i11 = 6;
            if ("2".equals(strGroup)) {
                i11 = (iVar == null || iVar.f101365c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                t.i("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numY = y(str2);
        if (numY != null) {
            return new Pair<>(Integer.valueOf(i11), numY);
        }
        t.i("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        int i11 = 4;
        if (strArr.length < 4) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int i12 = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i11 = 1;
                    break;
                case "fLaC":
                    break;
                case "ipcm":
                    i11 = 8;
                    break;
                case "mp4a":
                    i11 = 2;
                    break;
                default:
                    t.i("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair<>(Integer.valueOf(16777216 | i12 | i11), 0);
        } catch (NumberFormatException e11) {
            t.j("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e11);
            return null;
        }
    }

    private static Pair<Integer, Integer> x(String str, String[] strArr) {
        if (strArr.length < 3) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2]);
            int iF = F(i11);
            if (iF == -1) {
                t.i("CodecSpecificDataUtil", "Unknown VP9 profile: " + i11);
                return null;
            }
            int iE = E(i12);
            if (iE != -1) {
                return new Pair<>(Integer.valueOf(iF), Integer.valueOf(iE));
            }
            t.i("CodecSpecificDataUtil", "Unknown VP9 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            t.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer y(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return Integer.valueOf(PKIFailureInfo.certRevoked);
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return Integer.valueOf(PKIFailureInfo.signerNotTrusted);
            case "H180":
                return Integer.valueOf(PKIFailureInfo.badSenderNonce);
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return 262144;
            case "L180":
                return Integer.valueOf(PKIFailureInfo.badCertTemplate);
            case "L183":
                return 4194304;
            case "L186":
                return Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            default:
                return null;
        }
    }

    private static boolean z(byte[] bArr, int i11) {
        if (bArr.length - i11 <= f110430a.length) {
            return false;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr2 = f110430a;
            if (i12 >= bArr2.length) {
                return true;
            }
            if (bArr[i11 + i12] != bArr2[i12]) {
                return false;
            }
            i12++;
        }
    }
}
