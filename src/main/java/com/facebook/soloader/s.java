package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    protected static class a extends UnsatisfiedLinkError {
        a(String str) {
            super(str);
        }
    }

    public static String[] a(h hVar) {
        return hVar instanceof i ? c((i) hVar) : b(hVar);
    }

    private static String[] b(h hVar) {
        long jD;
        long jG;
        long jG2;
        long j11;
        long jG3;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jG4 = g(hVar, byteBufferAllocate, 0L);
        if (jG4 != 1179403647) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(jG4) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z11 = h(hVar, byteBufferAllocate, 4L) == 1;
        long j12 = 5;
        if (h(hVar, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jG5 = z11 ? g(hVar, byteBufferAllocate, 28L) : d(hVar, byteBufferAllocate, 32L);
        long jF = z11 ? f(hVar, byteBufferAllocate, 44L) : f(hVar, byteBufferAllocate, 56L);
        int iF = f(hVar, byteBufferAllocate, z11 ? 42L : 54L);
        boolean z12 = z11;
        long j13 = 40;
        if (jF == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            long jG6 = z12 ? g(hVar, byteBufferAllocate, 32L) : d(hVar, byteBufferAllocate, 40L);
            jF = z12 ? g(hVar, byteBufferAllocate, jG6 + 28) : g(hVar, byteBufferAllocate, jG6 + 44);
        }
        long j14 = jG5;
        long j15 = 0;
        while (true) {
            if (j15 >= jF) {
                jD = 0;
                break;
            }
            if ((z12 ? g(hVar, byteBufferAllocate, j14) : g(hVar, byteBufferAllocate, j14)) == 2) {
                if (!z12) {
                    jD = d(hVar, byteBufferAllocate, j14 + 8);
                    break;
                }
                jD = g(hVar, byteBufferAllocate, j14 + 4);
                break;
            }
            j14 += (long) iF;
            j15++;
            j13 = j13;
        }
        long j16 = j13;
        if (jD == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j17 = jD;
        long jG7 = 0;
        int i11 = 0;
        while (true) {
            long jG8 = z12 ? g(hVar, byteBufferAllocate, j17) : d(hVar, byteBufferAllocate, j17);
            long j18 = j12;
            if (jG8 == 1) {
                if (i11 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i11++;
            } else if (jG8 == j18) {
                jG7 = z12 ? g(hVar, byteBufferAllocate, j17 + 4) : d(hVar, byteBufferAllocate, j17 + 8);
            }
            j17 += z12 ? 8L : 16L;
            if (jG8 == 0) {
                if (jG7 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= jF) {
                        jG = 0;
                        break;
                    }
                    if (z12) {
                        j11 = jG5;
                        jG3 = g(hVar, byteBufferAllocate, j11);
                    } else {
                        j11 = jG5;
                        jG3 = g(hVar, byteBufferAllocate, j11);
                    }
                    if (jG3 == 1) {
                        long jG9 = z12 ? g(hVar, byteBufferAllocate, j11 + 8) : d(hVar, byteBufferAllocate, j11 + 16);
                        long jG10 = z12 ? g(hVar, byteBufferAllocate, j11 + 20) : d(hVar, byteBufferAllocate, j11 + j16);
                        if (jG9 <= jG7 && jG7 < jG9 + jG10) {
                            jG = (z12 ? g(hVar, byteBufferAllocate, j11 + 4) : d(hVar, byteBufferAllocate, j11 + 8)) + (jG7 - jG9);
                            break;
                        }
                    } else {
                        jF = jF;
                    }
                    jG5 = j11 + ((long) iF);
                    i12++;
                    jF = jF;
                }
                if (jG == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i11];
                int i13 = 0;
                do {
                    jG2 = z12 ? g(hVar, byteBufferAllocate, jD) : d(hVar, byteBufferAllocate, jD);
                    if (jG2 == 1) {
                        strArr[i13] = e(hVar, byteBufferAllocate, (z12 ? g(hVar, byteBufferAllocate, jD + 4) : d(hVar, byteBufferAllocate, jD + 8)) + jG);
                        if (i13 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i13++;
                    }
                    jD += z12 ? 8L : 16L;
                } while (jG2 != 0);
                if (i13 == i11) {
                    return strArr;
                }
                throw new a("malformed DT_NEEDED section");
            }
            j12 = j18;
        }
    }

    private static String[] c(i iVar) throws ClosedByInterruptException {
        int i11 = 0;
        while (true) {
            try {
                return b(iVar);
            } catch (ClosedByInterruptException e11) {
                i11++;
                if (i11 > 4) {
                    throw e11;
                }
                Thread.interrupted();
                p.c("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e11);
                iVar.c();
            }
        }
    }

    private static long d(h hVar, ByteBuffer byteBuffer, long j11) {
        i(hVar, byteBuffer, 8, j11);
        return byteBuffer.getLong();
    }

    private static String e(h hVar, ByteBuffer byteBuffer, long j11) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j12 = 1 + j11;
            short sH = h(hVar, byteBuffer, j11);
            if (sH == 0) {
                return sb2.toString();
            }
            sb2.append((char) sH);
            j11 = j12;
        }
    }

    private static int f(h hVar, ByteBuffer byteBuffer, long j11) {
        i(hVar, byteBuffer, 2, j11);
        return byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    private static long g(h hVar, ByteBuffer byteBuffer, long j11) {
        i(hVar, byteBuffer, 4, j11);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short h(h hVar, ByteBuffer byteBuffer, long j11) {
        i(hVar, byteBuffer, 1, j11);
        return (short) (byteBuffer.get() & 255);
    }

    private static void i(h hVar, ByteBuffer byteBuffer, int i11, long j11) {
        int iH0;
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        while (byteBuffer.remaining() > 0 && (iH0 = hVar.h0(byteBuffer, j11)) != -1) {
            j11 += (long) iH0;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
