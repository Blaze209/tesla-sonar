package yq0;

import com.plaid.internal.EnumC4419g;
import dr0.y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes10.dex */
public class j implements zo0.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f125740j = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f125741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f125742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f125743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f125744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f125745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<Short, a> f125746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<Short, Byte> f125747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zo0.c f125748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private zo0.c f125749i;

    private static class a extends zo0.g implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private short f125750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ar0.a f125751b;

        public a(short s11, int i11) {
            this.f125750a = s11;
            this.f125751b = new ar0.a(i11);
        }

        @Override // zo0.g
        public short a() {
            return this.f125750a;
        }

        @Override // zo0.g
        public int b() {
            return this.f125751b.d();
        }

        public void c(int i11, byte[] bArr) {
            this.f125751b.a(i11, bArr);
        }

        public byte[] d() {
            return this.f125751b.c();
        }

        public ar0.a.C0260a e(int i11, int i12) {
            return this.f125751b.e(i11, i12);
        }

        public String toString() {
            return Integer.toHexString(this.f125750a);
        }
    }

    public j(e eVar, boolean z11) {
        this(eVar, z11, br0.l.f17976b);
    }

    private synchronized a d() {
        byte[] bArrH;
        try {
            short s11 = this.f125741a;
            if (s11 <= 0) {
                throw new CardServiceException("No file selected");
            }
            a aVar = this.f125746f.get(Short.valueOf(s11));
            if (aVar != null) {
                return aVar;
            }
            try {
                if (this.f125742b) {
                    Byte b11 = this.f125747g.get(Short.valueOf(this.f125741a));
                    if (b11 == null) {
                        throw new NumberFormatException("Unknown FID " + Integer.toHexString(this.f125741a));
                    }
                    bArrH = g((b11.byteValue() & 255) | 128, 0, 8, false);
                    this.f125744d = true;
                } else {
                    if (!this.f125744d) {
                        i(this.f125741a);
                        this.f125744d = true;
                    }
                    bArrH = h(0, 8, false);
                }
                if (bArrH != null && bArrH.length != 0) {
                    int iE = e(this.f125741a, 8, bArrH);
                    if (iE < bArrH.length) {
                        bArrH = Arrays.copyOf(bArrH, iE);
                    }
                    a aVar2 = new a(this.f125741a, iE);
                    aVar2.c(0, bArrH);
                    this.f125746f.put(Short.valueOf(this.f125741a), aVar2);
                    return aVar2;
                }
                f125740j.warning("Something is wrong with prefix, prefix = " + bp0.a.b(bArrH));
                return null;
            } catch (IOException e11) {
                throw new CardServiceException("Error getting file info for " + Integer.toHexString(this.f125741a), e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static int e(short s11, int i11, byte[] bArr) {
        if (bArr.length < i11) {
            return bArr.length;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ap0.b bVar = new ap0.b(byteArrayInputStream);
        try {
            if (bVar.n() == 66) {
                try {
                    return 36;
                } catch (IOException e11) {
                    return 36;
                }
            }
            int length = (bArr.length - byteArrayInputStream.available()) + bVar.c();
            try {
                return length;
            } catch (IOException e12) {
                return length;
            }
        } finally {
            try {
                bVar.close();
            } catch (IOException e13) {
                f125740j.log(Level.FINE, "Error closing stream", (Throwable) e13);
            }
        }
    }

    @Override // zo0.h
    public synchronized byte[] a(int i11, int i12) {
        byte[] bArr;
        byte[] bArrH;
        try {
            try {
                if (this.f125741a <= 0) {
                    throw new CardServiceException("No file selected");
                }
                a aVarD = d();
                if (aVarD == null) {
                    throw new IllegalStateException("Could not get file info");
                }
                int iMin = Math.min(i12, this.f125743c);
                ar0.a.C0260a c0260aE = aVarD.e(i11, iMin);
                if (c0260aE.b() > 0) {
                    boolean z11 = true;
                    if (!this.f125742b || i11 >= 256) {
                        if (!this.f125744d) {
                            i(this.f125741a);
                            this.f125744d = true;
                        }
                        int iC = c0260aE.c();
                        int iB = c0260aE.b();
                        if (i11 <= 32767) {
                            z11 = false;
                        }
                        bArrH = h(iC, iB, z11);
                    } else {
                        Byte b11 = this.f125747g.get(Short.valueOf(this.f125741a));
                        if (b11 == null) {
                            throw new NumberFormatException("Unknown FID " + Integer.toHexString(this.f125741a));
                        }
                        bArrH = g((b11.byteValue() & 255) | 128, c0260aE.c(), c0260aE.b(), false);
                        this.f125744d = true;
                    }
                    if (bArrH == null) {
                        throw new IllegalStateException("Could not read bytes");
                    }
                    if (bArrH.length > 0) {
                        aVarD.c(c0260aE.c(), bArrH);
                    }
                    if (bArrH.length < c0260aE.b()) {
                        iMin = bArrH.length;
                    }
                }
                bArr = new byte[iMin];
                System.arraycopy(aVarD.d(), i11, bArr, 0, iMin);
            } catch (CardServiceException e11) {
                if ((((short) e11.a()) & 26368) == 26368 && this.f125743c > 223) {
                    this.f125748h = this.f125749i;
                    this.f125743c = EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE;
                    return new byte[0];
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Read binary failed on file ");
                sb2.append((Object) (0 == 0 ? Integer.toHexString(this.f125741a) : null));
                throw new CardServiceException(sb2.toString(), e11);
            } catch (Exception e12) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Read binary failed on file ");
                sb3.append((Object) (0 == 0 ? Integer.toHexString(this.f125741a) : null));
                throw new CardServiceException(sb3.toString(), e12);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bArr;
    }

    @Override // zo0.h
    public synchronized void b(short s11) {
        if (this.f125741a == s11) {
            return;
        }
        this.f125741a = s11;
        this.f125744d = false;
    }

    @Override // zo0.h
    public synchronized zo0.g[] c() {
        a aVarD = d();
        if (aVarD == null) {
            return null;
        }
        return new a[]{aVarD};
    }

    public zo0.c f() {
        return this.f125748h;
    }

    public synchronized byte[] g(int i11, int i12, int i13, boolean z11) {
        return this.f125745e.a(this.f125748h, i11, i12, i13, true, z11);
    }

    public synchronized byte[] h(int i11, int i12, boolean z11) {
        try {
            zo0.c cVarH = this.f125748h;
            if (cVarH instanceof y) {
                cVarH = y.h((y) cVarH);
            }
            this.f125749i = cVarH;
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f125745e.a(this.f125748h, -1, i11, i12, false, z11);
    }

    public synchronized void i(short s11) {
        this.f125745e.b(this.f125748h, s11);
    }

    public void j(zo0.c cVar) {
        this.f125749i = this.f125748h;
        this.f125748h = cVar;
    }

    public j(e eVar, boolean z11, Map<Short, Byte> map) {
        this.f125745e = eVar;
        this.f125746f = new HashMap();
        this.f125741a = (short) 0;
        this.f125744d = false;
        this.f125742b = z11;
        this.f125747g = map;
        this.f125743c = 65536;
    }
}
