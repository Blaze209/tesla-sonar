package k9;

import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.spongycastle.math.ec.Tnaf;
import p7.e0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f85439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x<String> f85440d;

    public n(String str, String str2, List<String> list) {
        super(str);
        s7.a.a(!list.isEmpty());
        this.f85438b = str2;
        x<String> xVarN = x.n(list);
        this.f85440d = xVarN;
        this.f85439c = xVarN.get(0);
    }

    private static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p7.f0.a
    public void I(e0.b bVar) {
        String str = this.f85426a;
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b11 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b11 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b11 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b11 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b11 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b11 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b11 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b11 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b11 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b11 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b11 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b11 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b11 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b11 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b11 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b11 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b11 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b11 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b11 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b11 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b11 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b11 = 22;
                }
                break;
        }
        try {
            switch (b11) {
                case 0:
                case 10:
                    bVar.P(this.f85440d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.U(this.f85440d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = this.f85440d.get(0);
                    bVar.i0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).h0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q(this.f85440d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O(this.f85440d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V(this.f85440d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrE1 = q0.E1(this.f85440d.get(0), "/");
                    bVar.t0(Integer.valueOf(Integer.parseInt(strArrE1[0]))).s0(strArrE1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrE1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.q0(this.f85440d.get(0));
                    break;
                case 8:
                case 16:
                    bVar.v0(this.f85440d.get(0));
                    break;
                case 9:
                case 22:
                    bVar.j0(Integer.valueOf(Integer.parseInt(this.f85440d.get(0))));
                    break;
                case 12:
                    Integer numO = ru.f.o(this.f85440d.get(0));
                    if (numO != null) {
                        String strA = j.a(numO.intValue());
                        if (strA != null) {
                            bVar.c0(strA);
                        }
                    } else {
                        bVar.c0(this.f85440d.get(0));
                    }
                    break;
                case 14:
                    List<Integer> listA = a(this.f85440d.get(0));
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.h0(listA.get(2));
                            }
                        }
                        bVar.i0(listA.get(1));
                    }
                    bVar.j0(listA.get(0));
                    break;
                case 15:
                    List<Integer> listA2 = a(this.f85440d.get(0));
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.k0(listA2.get(2));
                            }
                        }
                        bVar.l0(listA2.get(1));
                    }
                    bVar.m0(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f85426a, nVar.f85426a) && Objects.equals(this.f85438b, nVar.f85438b) && this.f85440d.equals(nVar.f85440d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f85426a.hashCode()) * 31;
        String str = this.f85438b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f85440d.hashCode();
    }

    @Override // k9.i
    public String toString() {
        return this.f85426a + ": description=" + this.f85438b + ": values=" + this.f85440d;
    }
}
