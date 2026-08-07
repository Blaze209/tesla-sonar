package q9;

import com.reactnativecommunity.clipboard.ClipboardModule;
import p7.f0;
import s7.c0;
import w8.b0;

/* JADX INFO: loaded from: classes3.dex */
final class j {
    public static t7.c a(f0 f0Var, String str) {
        for (int i11 = 0; i11 < f0Var.e(); i11++) {
            f0.a aVarD = f0Var.d(i11);
            if (aVarD instanceof t7.c) {
                t7.c cVar = (t7.c) aVarD;
                if (cVar.f112695a.equals(str)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    private static k9.e b(int i11, c0 c0Var) {
        int iV = c0Var.v();
        if (c0Var.v() == 1684108385) {
            c0Var.c0(8);
            String strH = c0Var.H(iV - 16);
            return new k9.e("und", strH, strH);
        }
        s7.t.i("MetadataUtil", "Failed to parse comment attribute: " + t7.e.a(i11));
        return null;
    }

    private static k9.a c(c0 c0Var) {
        String str;
        int iV = c0Var.v();
        if (c0Var.v() != 1684108385) {
            s7.t.i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iP = b.p(c0Var.v());
        if (iP == 13) {
            str = ClipboardModule.MIMETYPE_JPEG;
        } else {
            str = iP == 14 ? ClipboardModule.MIMETYPE_PNG : null;
        }
        if (str == null) {
            s7.t.i("MetadataUtil", "Unrecognized cover art flags: " + iP);
            return null;
        }
        c0Var.c0(4);
        int i11 = iV - 16;
        byte[] bArr = new byte[i11];
        c0Var.q(bArr, 0, i11);
        return new k9.a(str, null, 3, bArr);
    }

    public static f0.a d(c0 c0Var) {
        int iG = c0Var.g() + c0Var.v();
        int iV = c0Var.v();
        int i11 = (iV >> 24) & 255;
        try {
            if (i11 == 169 || i11 == 253) {
                int i12 = 16777215 & iV;
                if (i12 == 6516084) {
                    k9.e eVarB = b(iV, c0Var);
                    c0Var.b0(iG);
                    return eVarB;
                }
                if (i12 == 7233901 || i12 == 7631467) {
                    k9.n nVarK = k(iV, "TIT2", c0Var);
                    c0Var.b0(iG);
                    return nVarK;
                }
                if (i12 == 6516589 || i12 == 7828084) {
                    k9.n nVarK2 = k(iV, "TCOM", c0Var);
                    c0Var.b0(iG);
                    return nVarK2;
                }
                if (i12 == 6578553) {
                    k9.n nVarK3 = k(iV, "TDRC", c0Var);
                    c0Var.b0(iG);
                    return nVarK3;
                }
                if (i12 == 4280916) {
                    k9.n nVarK4 = k(iV, "TPE1", c0Var);
                    c0Var.b0(iG);
                    return nVarK4;
                }
                if (i12 == 7630703) {
                    k9.n nVarK5 = k(iV, "TSSE", c0Var);
                    c0Var.b0(iG);
                    return nVarK5;
                }
                if (i12 == 6384738) {
                    k9.n nVarK6 = k(iV, "TALB", c0Var);
                    c0Var.b0(iG);
                    return nVarK6;
                }
                if (i12 == 7108978) {
                    k9.n nVarK7 = k(iV, "USLT", c0Var);
                    c0Var.b0(iG);
                    return nVarK7;
                }
                if (i12 == 6776174) {
                    k9.n nVarK8 = k(iV, "TCON", c0Var);
                    c0Var.b0(iG);
                    return nVarK8;
                }
                if (i12 == 6779504) {
                    k9.n nVarK9 = k(iV, "TIT1", c0Var);
                    c0Var.b0(iG);
                    return nVarK9;
                }
            } else {
                if (iV == 1735291493) {
                    k9.n nVarJ = j(c0Var);
                    c0Var.b0(iG);
                    return nVarJ;
                }
                if (iV == 1684632427) {
                    k9.n nVarE = e(iV, "TPOS", c0Var);
                    c0Var.b0(iG);
                    return nVarE;
                }
                if (iV == 1953655662) {
                    k9.n nVarE2 = e(iV, "TRCK", c0Var);
                    c0Var.b0(iG);
                    return nVarE2;
                }
                if (iV == 1953329263) {
                    k9.i iVarG = g(iV, "TBPM", c0Var, true, false);
                    c0Var.b0(iG);
                    return iVarG;
                }
                if (iV == 1668311404) {
                    k9.i iVarG2 = g(iV, "TCMP", c0Var, true, true);
                    c0Var.b0(iG);
                    return iVarG2;
                }
                if (iV == 1668249202) {
                    k9.a aVarC = c(c0Var);
                    c0Var.b0(iG);
                    return aVarC;
                }
                if (iV == 1631670868) {
                    k9.n nVarK10 = k(iV, "TPE2", c0Var);
                    c0Var.b0(iG);
                    return nVarK10;
                }
                if (iV == 1936682605) {
                    k9.n nVarK11 = k(iV, "TSOT", c0Var);
                    c0Var.b0(iG);
                    return nVarK11;
                }
                if (iV == 1936679276) {
                    k9.n nVarK12 = k(iV, "TSOA", c0Var);
                    c0Var.b0(iG);
                    return nVarK12;
                }
                if (iV == 1936679282) {
                    k9.n nVarK13 = k(iV, "TSOP", c0Var);
                    c0Var.b0(iG);
                    return nVarK13;
                }
                if (iV == 1936679265) {
                    k9.n nVarK14 = k(iV, "TSO2", c0Var);
                    c0Var.b0(iG);
                    return nVarK14;
                }
                if (iV == 1936679791) {
                    k9.n nVarK15 = k(iV, "TSOC", c0Var);
                    c0Var.b0(iG);
                    return nVarK15;
                }
                if (iV == 1920233063) {
                    k9.i iVarG3 = g(iV, "ITUNESADVISORY", c0Var, false, false);
                    c0Var.b0(iG);
                    return iVarG3;
                }
                if (iV == 1885823344) {
                    k9.i iVarG4 = g(iV, "ITUNESGAPLESS", c0Var, false, true);
                    c0Var.b0(iG);
                    return iVarG4;
                }
                if (iV == 1936683886) {
                    k9.n nVarK16 = k(iV, "TVSHOWSORT", c0Var);
                    c0Var.b0(iG);
                    return nVarK16;
                }
                if (iV == 1953919848) {
                    k9.n nVarK17 = k(iV, "TVSHOW", c0Var);
                    c0Var.b0(iG);
                    return nVarK17;
                }
                if (iV == 757935405) {
                    k9.i iVarH = h(c0Var, iG);
                    c0Var.b0(iG);
                    return iVarH;
                }
            }
            s7.t.b("MetadataUtil", "Skipped unknown metadata entry: " + t7.e.a(iV));
            c0Var.b0(iG);
            return null;
        } catch (Throwable th2) {
            c0Var.b0(iG);
            throw th2;
        }
    }

    private static k9.n e(int i11, String str, c0 c0Var) {
        int iV = c0Var.v();
        if (c0Var.v() == 1684108385 && iV >= 22) {
            c0Var.c0(10);
            int iU = c0Var.U();
            if (iU > 0) {
                String str2 = "" + iU;
                int iU2 = c0Var.U();
                if (iU2 > 0) {
                    str2 = str2 + "/" + iU2;
                }
                return new k9.n(str, null, com.google.common.collect.x.s(str2));
            }
        }
        s7.t.i("MetadataUtil", "Failed to parse index/count attribute: " + t7.e.a(i11));
        return null;
    }

    private static int f(c0 c0Var) {
        int iV = c0Var.v();
        if (c0Var.v() == 1684108385) {
            c0Var.c0(8);
            int i11 = iV - 16;
            if (i11 == 1) {
                return c0Var.M();
            }
            if (i11 == 2) {
                return c0Var.U();
            }
            if (i11 == 3) {
                return c0Var.P();
            }
            if (i11 == 4 && (c0Var.n() & 128) == 0) {
                return c0Var.Q();
            }
        }
        s7.t.i("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static k9.i g(int i11, String str, c0 c0Var, boolean z11, boolean z12) {
        int iF = f(c0Var);
        if (z12) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z11 ? new k9.n(str, null, com.google.common.collect.x.s(Integer.toString(iF))) : new k9.e("und", str, Integer.toString(iF));
        }
        s7.t.i("MetadataUtil", "Failed to parse uint8 attribute: " + t7.e.a(i11));
        return null;
    }

    private static k9.i h(c0 c0Var, int i11) {
        String strH = null;
        String strH2 = null;
        int i12 = -1;
        int i13 = -1;
        while (c0Var.g() < i11) {
            int iG = c0Var.g();
            int iV = c0Var.v();
            int iV2 = c0Var.v();
            c0Var.c0(4);
            if (iV2 == 1835360622) {
                strH = c0Var.H(iV - 12);
            } else if (iV2 == 1851878757) {
                strH2 = c0Var.H(iV - 12);
            } else {
                if (iV2 == 1684108385) {
                    i12 = iG;
                    i13 = iV;
                }
                c0Var.c0(iV - 12);
            }
        }
        if (strH == null || strH2 == null || i12 == -1) {
            return null;
        }
        c0Var.b0(i12);
        c0Var.c0(16);
        return new k9.k(strH, strH2, c0Var.H(i13 - 16));
    }

    public static t7.c i(c0 c0Var, int i11, String str) {
        while (true) {
            int iG = c0Var.g();
            if (iG >= i11) {
                return null;
            }
            int iV = c0Var.v();
            if (c0Var.v() == 1684108385) {
                int iV2 = c0Var.v();
                int iV3 = c0Var.v();
                int i12 = iV - 16;
                byte[] bArr = new byte[i12];
                c0Var.q(bArr, 0, i12);
                return new t7.c(str, bArr, iV3, iV2);
            }
            c0Var.b0(iG + iV);
        }
    }

    private static k9.n j(c0 c0Var) {
        String strA = k9.j.a(f(c0Var) - 1);
        if (strA != null) {
            return new k9.n("TCON", null, com.google.common.collect.x.s(strA));
        }
        s7.t.i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static k9.n k(int i11, String str, c0 c0Var) {
        int iV = c0Var.v();
        if (c0Var.v() == 1684108385) {
            c0Var.c0(8);
            return new k9.n(str, null, com.google.common.collect.x.s(c0Var.H(iV - 16)));
        }
        s7.t.i("MetadataUtil", "Failed to parse text attribute: " + t7.e.a(i11));
        return null;
    }

    public static void l(int i11, b0 b0Var, p7.u.b bVar) {
        if (i11 == 1 && b0Var.a()) {
            bVar.d0(b0Var.f121224a).e0(b0Var.f121225b);
        }
    }

    public static void m(int i11, f0 f0Var, p7.u.b bVar, f0 f0Var2, f0... f0VarArr) {
        if (f0Var2 == null) {
            f0Var2 = new f0(new f0.a[0]);
        }
        if (f0Var != null) {
            for (int i12 = 0; i12 < f0Var.e(); i12++) {
                f0.a aVarD = f0Var.d(i12);
                if (aVarD instanceof t7.c) {
                    t7.c cVar = (t7.c) aVarD;
                    if (!cVar.f112695a.equals("com.android.capture.fps")) {
                        f0Var2 = f0Var2.a(cVar);
                    } else if (i11 == 2) {
                        f0Var2 = f0Var2.a(cVar);
                    }
                }
            }
        }
        for (f0 f0Var3 : f0VarArr) {
            f0Var2 = f0Var2.b(f0Var3);
        }
        if (f0Var2.e() > 0) {
            bVar.r0(f0Var2);
        }
    }
}
