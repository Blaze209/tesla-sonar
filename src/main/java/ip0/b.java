package ip0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lokio/k;", "Lokio/h;", "buffer", "", "offset", "byteCount", "Ljn0/h0;", "c", "(Lokio/k;Lokio/h;II)V", "", "s", "codePointCount", "b", "([BI)I", "", "a", "[C", DateTokenConverter.CONVERTER_KEY, "()[C", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f81703a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(byte[] bArr, int i11) {
        byte b11;
        int i12;
        int length = bArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            byte b12 = bArr[i13];
            if (b12 >= 0) {
                int i16 = i15 + 1;
                if (i15 == i11) {
                    break;
                }
                if ((b12 != 10 && b12 != 13 && ((b12 >= 0 && b12 < 32) || (127 <= b12 && b12 < 160))) || b12 == 65533) {
                    return -1;
                }
                i14 += b12 < 65536 ? 1 : 2;
                i13++;
                while (true) {
                    i15 = i16;
                    if (i13 >= length || (b11 = bArr[i13]) < 0) {
                        break;
                    }
                    i13++;
                    i16 = i15 + 1;
                    if (i15 == i11) {
                        return i14;
                    }
                    if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                        return -1;
                    }
                    i14 += b11 < 65536 ? 1 : 2;
                }
                h0 h0Var = h0.f84049a;
            } else if ((b12 >> 5) == -2) {
                int i17 = i13 + 1;
                if (length <= i17) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                byte b13 = bArr[i17];
                if ((b13 & 192) != 128) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                int i18 = (b12 << 6) ^ (b13 ^ 3968);
                if (i18 < 128) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                int i19 = i15 + 1;
                if (i15 == i11) {
                    break;
                }
                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                    return -1;
                }
                i14 += i18 < 65536 ? 1 : 2;
                h0 h0Var2 = h0.f84049a;
                i13 += 2;
                i15 = i19;
            } else if ((b12 >> 4) == -2) {
                int i21 = i13 + 2;
                if (length <= i21) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                byte b14 = bArr[i13 + 1];
                if ((b14 & 192) != 128) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                byte b15 = bArr[i21];
                if ((b15 & 192) != 128) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                int i22 = (b12 << 12) ^ ((b15 ^ (-123008)) ^ (b14 << 6));
                if (i22 < 2048) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i22 && i22 < 57344) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                i12 = i15 + 1;
                if (i15 == i11) {
                    break;
                }
                if ((i22 != 10 && i22 != 13 && ((i22 >= 0 && i22 < 32) || (127 <= i22 && i22 < 160))) || i22 == 65533) {
                    return -1;
                }
                i14 += i22 < 65536 ? 1 : 2;
                h0 h0Var3 = h0.f84049a;
                i13 += 3;
                i15 = i12;
            } else {
                if ((b12 >> 3) != -2) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                int i23 = i13 + 3;
                if (length <= i23) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                byte b16 = bArr[i13 + 1];
                if ((b16 & 192) != 128) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                byte b17 = bArr[i13 + 2];
                if ((b17 & 192) != 128) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                byte b18 = bArr[i23];
                if ((b18 & 192) != 128) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                int i24 = (b12 << 18) ^ (((b18 ^ 3678080) ^ (b17 << 6)) ^ (b16 << 12));
                if (i24 > 1114111) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i24 && i24 < 57344) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                if (i24 < 65536) {
                    if (i15 == i11) {
                        break;
                    }
                    return -1;
                }
                i12 = i15 + 1;
                if (i15 == i11) {
                    break;
                }
                if ((i24 != 10 && i24 != 13 && ((i24 >= 0 && i24 < 32) || (127 <= i24 && i24 < 160))) || i24 == 65533) {
                    return -1;
                }
                i14 += i24 < 65536 ? 1 : 2;
                h0 h0Var4 = h0.f84049a;
                i13 += 4;
                i15 = i12;
            }
        }
        return i14;
    }

    public static final void c(okio.k kVar, okio.h buffer, int i11, int i12) {
        s.k(kVar, "<this>");
        s.k(buffer, "buffer");
        buffer.write(kVar.getData(), i11, i12);
    }

    public static final char[] d() {
        return f81703a;
    }
}
