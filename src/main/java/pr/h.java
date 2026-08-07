package pr;

import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import com.reactnativecommunity.clipboard.ClipboardModule;
import hr.v;
import ts.d0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f103837a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static zr.e a(int i11, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385) {
            d0Var.V(8);
            String strC = d0Var.C(iQ - 16);
            return new zr.e("und", strC, strC);
        }
        u.i("MetadataUtil", "Failed to parse comment attribute: " + a.a(i11));
        return null;
    }

    private static zr.a b(d0 d0Var) {
        String str;
        int iQ = d0Var.q();
        if (d0Var.q() != 1684108385) {
            u.i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(d0Var.q());
        if (iB == 13) {
            str = ClipboardModule.MIMETYPE_JPEG;
        } else {
            str = iB == 14 ? ClipboardModule.MIMETYPE_PNG : null;
        }
        if (str == null) {
            u.i("MetadataUtil", "Unrecognized cover art flags: " + iB);
            return null;
        }
        d0Var.V(4);
        int i11 = iQ - 16;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        return new zr.a(str, null, 3, bArr);
    }

    public static ur.a.b c(d0 d0Var) {
        int iF = d0Var.f() + d0Var.q();
        int iQ = d0Var.q();
        int i11 = (iQ >> 24) & 255;
        try {
            if (i11 == 169 || i11 == 253) {
                int i12 = 16777215 & iQ;
                if (i12 == 6516084) {
                    zr.e eVarA = a(iQ, d0Var);
                    d0Var.U(iF);
                    return eVarA;
                }
                if (i12 == 7233901 || i12 == 7631467) {
                    zr.m mVarH = h(iQ, "TIT2", d0Var);
                    d0Var.U(iF);
                    return mVarH;
                }
                if (i12 == 6516589 || i12 == 7828084) {
                    zr.m mVarH2 = h(iQ, "TCOM", d0Var);
                    d0Var.U(iF);
                    return mVarH2;
                }
                if (i12 == 6578553) {
                    zr.m mVarH3 = h(iQ, "TDRC", d0Var);
                    d0Var.U(iF);
                    return mVarH3;
                }
                if (i12 == 4280916) {
                    zr.m mVarH4 = h(iQ, "TPE1", d0Var);
                    d0Var.U(iF);
                    return mVarH4;
                }
                if (i12 == 7630703) {
                    zr.m mVarH5 = h(iQ, "TSSE", d0Var);
                    d0Var.U(iF);
                    return mVarH5;
                }
                if (i12 == 6384738) {
                    zr.m mVarH6 = h(iQ, "TALB", d0Var);
                    d0Var.U(iF);
                    return mVarH6;
                }
                if (i12 == 7108978) {
                    zr.m mVarH7 = h(iQ, "USLT", d0Var);
                    d0Var.U(iF);
                    return mVarH7;
                }
                if (i12 == 6776174) {
                    zr.m mVarH8 = h(iQ, "TCON", d0Var);
                    d0Var.U(iF);
                    return mVarH8;
                }
                if (i12 == 6779504) {
                    zr.m mVarH9 = h(iQ, "TIT1", d0Var);
                    d0Var.U(iF);
                    return mVarH9;
                }
            } else {
                if (iQ == 1735291493) {
                    zr.m mVarG = g(d0Var);
                    d0Var.U(iF);
                    return mVarG;
                }
                if (iQ == 1684632427) {
                    zr.m mVarD = d(iQ, "TPOS", d0Var);
                    d0Var.U(iF);
                    return mVarD;
                }
                if (iQ == 1953655662) {
                    zr.m mVarD2 = d(iQ, "TRCK", d0Var);
                    d0Var.U(iF);
                    return mVarD2;
                }
                if (iQ == 1953329263) {
                    zr.i iVarI = i(iQ, "TBPM", d0Var, true, false);
                    d0Var.U(iF);
                    return iVarI;
                }
                if (iQ == 1668311404) {
                    zr.i iVarI2 = i(iQ, "TCMP", d0Var, true, true);
                    d0Var.U(iF);
                    return iVarI2;
                }
                if (iQ == 1668249202) {
                    zr.a aVarB = b(d0Var);
                    d0Var.U(iF);
                    return aVarB;
                }
                if (iQ == 1631670868) {
                    zr.m mVarH10 = h(iQ, "TPE2", d0Var);
                    d0Var.U(iF);
                    return mVarH10;
                }
                if (iQ == 1936682605) {
                    zr.m mVarH11 = h(iQ, "TSOT", d0Var);
                    d0Var.U(iF);
                    return mVarH11;
                }
                if (iQ == 1936679276) {
                    zr.m mVarH12 = h(iQ, "TSO2", d0Var);
                    d0Var.U(iF);
                    return mVarH12;
                }
                if (iQ == 1936679282) {
                    zr.m mVarH13 = h(iQ, "TSOA", d0Var);
                    d0Var.U(iF);
                    return mVarH13;
                }
                if (iQ == 1936679265) {
                    zr.m mVarH14 = h(iQ, "TSOP", d0Var);
                    d0Var.U(iF);
                    return mVarH14;
                }
                if (iQ == 1936679791) {
                    zr.m mVarH15 = h(iQ, "TSOC", d0Var);
                    d0Var.U(iF);
                    return mVarH15;
                }
                if (iQ == 1920233063) {
                    zr.i iVarI3 = i(iQ, "ITUNESADVISORY", d0Var, false, false);
                    d0Var.U(iF);
                    return iVarI3;
                }
                if (iQ == 1885823344) {
                    zr.i iVarI4 = i(iQ, "ITUNESGAPLESS", d0Var, false, true);
                    d0Var.U(iF);
                    return iVarI4;
                }
                if (iQ == 1936683886) {
                    zr.m mVarH16 = h(iQ, "TVSHOWSORT", d0Var);
                    d0Var.U(iF);
                    return mVarH16;
                }
                if (iQ == 1953919848) {
                    zr.m mVarH17 = h(iQ, "TVSHOW", d0Var);
                    d0Var.U(iF);
                    return mVarH17;
                }
                if (iQ == 757935405) {
                    zr.i iVarE = e(d0Var, iF);
                    d0Var.U(iF);
                    return iVarE;
                }
            }
            u.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(iQ));
            d0Var.U(iF);
            return null;
        } catch (Throwable th2) {
            d0Var.U(iF);
            throw th2;
        }
    }

    private static zr.m d(int i11, String str, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385 && iQ >= 22) {
            d0Var.V(10);
            int iN = d0Var.N();
            if (iN > 0) {
                String str2 = "" + iN;
                int iN2 = d0Var.N();
                if (iN2 > 0) {
                    str2 = str2 + "/" + iN2;
                }
                return new zr.m(str, null, x.s(str2));
            }
        }
        u.i("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i11));
        return null;
    }

    private static zr.i e(d0 d0Var, int i11) {
        String strC = null;
        String strC2 = null;
        int i12 = -1;
        int i13 = -1;
        while (d0Var.f() < i11) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            d0Var.V(4);
            if (iQ2 == 1835360622) {
                strC = d0Var.C(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strC2 = d0Var.C(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i12 = iF;
                    i13 = iQ;
                }
                d0Var.V(iQ - 12);
            }
        }
        if (strC == null || strC2 == null || i12 == -1) {
            return null;
        }
        d0Var.U(i12);
        d0Var.V(16);
        return new zr.j(strC, strC2, d0Var.C(i13 - 16));
    }

    public static as.a f(d0 d0Var, int i11, String str) {
        while (true) {
            int iF = d0Var.f();
            if (iF >= i11) {
                return null;
            }
            int iQ = d0Var.q();
            if (d0Var.q() == 1684108385) {
                int iQ2 = d0Var.q();
                int iQ3 = d0Var.q();
                int i12 = iQ - 16;
                byte[] bArr = new byte[i12];
                d0Var.l(bArr, 0, i12);
                return new as.a(str, bArr, iQ3, iQ2);
            }
            d0Var.U(iF + iQ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static zr.m g(d0 d0Var) {
        String str;
        int iJ = j(d0Var);
        if (iJ > 0) {
            String[] strArr = f103837a;
            if (iJ <= strArr.length) {
                str = strArr[iJ - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new zr.m("TCON", null, x.s(str));
        }
        u.i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static zr.m h(int i11, String str, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385) {
            d0Var.V(8);
            return new zr.m(str, null, x.s(d0Var.C(iQ - 16)));
        }
        u.i("MetadataUtil", "Failed to parse text attribute: " + a.a(i11));
        return null;
    }

    private static zr.i i(int i11, String str, d0 d0Var, boolean z11, boolean z12) {
        int iJ = j(d0Var);
        if (z12) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z11 ? new zr.m(str, null, x.s(Integer.toString(iJ))) : new zr.e("und", str, Integer.toString(iJ));
        }
        u.i("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i11));
        return null;
    }

    private static int j(d0 d0Var) {
        d0Var.V(4);
        if (d0Var.q() == 1684108385) {
            d0Var.V(8);
            return d0Var.H();
        }
        u.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i11, v vVar, u0.b bVar) {
        if (i11 == 1 && vVar.a()) {
            bVar.P(vVar.f73396a).Q(vVar.f73397b);
        }
    }

    public static void l(int i11, ur.a aVar, ur.a aVar2, u0.b bVar, ur.a... aVarArr) {
        ur.a aVar3 = new ur.a(new ur.a.b[0]);
        if (i11 != 1 || aVar == null) {
            aVar = aVar3;
        }
        if (aVar2 != null) {
            for (int i12 = 0; i12 < aVar2.e(); i12++) {
                ur.a.b bVarD = aVar2.d(i12);
                if (bVarD instanceof as.a) {
                    as.a aVar4 = (as.a) bVarD;
                    if (!aVar4.f14956a.equals("com.android.capture.fps")) {
                        aVar = aVar.a(aVar4);
                    } else if (i11 == 2) {
                        aVar = aVar.a(aVar4);
                    }
                }
            }
        }
        for (ur.a aVar5 : aVarArr) {
            aVar = aVar.b(aVar5);
        }
        if (aVar.e() > 0) {
            bVar.Z(aVar);
        }
    }
}
