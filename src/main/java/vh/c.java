package vh;

import di.g;
import di.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f119331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f119332b = p.j(24);

    public c(boolean z11) {
        this.f119331a = z11;
    }

    public static int a(String str) {
        return Integer.parseInt(str);
    }

    public static String b(int i11) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i11));
    }

    public static byte[] e(String str, String str2) {
        return nh.d.a(str, str2);
    }

    public static byte[] f(String str, byte[] bArr, String str2) {
        return nh.e.b(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[SYNTHETIC] */
    public static byte[] g(byte[]... bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        DataOutputStream dataOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            try {
                                for (byte[] bArr2 : bArr) {
                                    dataOutputStream.write(b(bArr2.length).getBytes());
                                    dataOutputStream.write(bArr2);
                                }
                                dataOutputStream.flush();
                                byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused) {
                                }
                                dataOutputStream.close();
                            } catch (Exception e11) {
                                e = e11;
                                try {
                                    g.d(e);
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    return byteArray;
                                } catch (Throwable th2) {
                                    th = th2;
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    dataOutputStream2 = dataOutputStream;
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    if (dataOutputStream2 != null) {
                                        throw th;
                                    }
                                    try {
                                        dataOutputStream2.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dataOutputStream2 = dataOutputStream;
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                if (dataOutputStream2 != null) {
                                    throw th;
                                }
                                dataOutputStream2.close();
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            dataOutputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            if (dataOutputStream2 != null) {
                                throw th;
                            }
                            dataOutputStream2.close();
                            throw th;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        byteArrayOutputStream = null;
                        dataOutputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        dataOutputStream = null;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        dataOutputStream2 = dataOutputStream;
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        if (dataOutputStream2 != null) {
                            throw th;
                        }
                        dataOutputStream2.close();
                        throw th;
                    }
                    return byteArray;
                }
            } catch (Exception unused5) {
            }
        }
        return null;
    }

    public static byte[] h(String str, byte[] bArr, String str2) {
        return nh.e.d(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public b c(d dVar, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        String str3;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(dVar.a());
            try {
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[a(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                    try {
                        byte[] bArr3 = new byte[5];
                        byteArrayInputStream.read(bArr3);
                        int iA = a(new String(bArr3));
                        if (iA > 0) {
                            byte[] bArrB = new byte[iA];
                            byteArrayInputStream.read(bArrB);
                            if (this.f119331a) {
                                bArrB = f(this.f119332b, bArrB, str);
                            }
                            if (dVar.b()) {
                                bArrB = nh.b.b(bArrB);
                            }
                            str3 = new String(bArrB);
                        } else {
                            str3 = null;
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e11) {
                        e = e11;
                        try {
                            g.d(e);
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            str3 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayInputStream2 = byteArrayInputStream;
                            byteArrayInputStream = byteArrayInputStream2;
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                str2 = null;
            }
        } catch (Exception e13) {
            e = e13;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = byteArrayInputStream2;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            throw th;
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new b(str2, str3);
    }

    public d d(b bVar, boolean z11, String str) {
        if (bVar == null) {
            return null;
        }
        byte[] bytes = bVar.b().getBytes();
        byte[] bytes2 = bVar.a().getBytes();
        if (z11) {
            try {
                bytes2 = nh.b.a(bytes2);
            } catch (Exception unused) {
                z11 = false;
            }
        }
        return new d(z11, this.f119331a ? g(bytes, e(this.f119332b, jh.a.f83725c), h(this.f119332b, bytes2, str)) : g(bytes, bytes2));
    }
}
