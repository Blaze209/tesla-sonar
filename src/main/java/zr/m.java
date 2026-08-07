package zr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.y0;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.math.ec.Tnaf;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f128539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x<String> f128540d;

    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i11) {
            return new m[i11];
        }
    }

    /* synthetic */ m(Parcel parcel, a aVar) {
        this(parcel);
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
    @Override // ur.a.b
    public void O0(y0.b bVar) {
        String str = this.f128527a;
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
            case 2569891:
                if (str.equals("TDAT")) {
                    b11 = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b11 = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b11 = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b11 = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b11 = Tnaf.POW_2_WIDTH;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b11 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b11 = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b11 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b11 = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b11 = 21;
                }
                break;
        }
        try {
            switch (b11) {
                case 0:
                case 10:
                    bVar.N(this.f128540d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.S(this.f128540d.get(0));
                    break;
                case 2:
                case 12:
                    String str2 = this.f128540d.get(0);
                    bVar.f0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).e0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.O(this.f128540d.get(0));
                    break;
                case 4:
                case 18:
                    bVar.M(this.f128540d.get(0));
                    break;
                case 5:
                case 19:
                    bVar.T(this.f128540d.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrP0 = p0.P0(this.f128540d.get(0), "/");
                    bVar.p0(Integer.valueOf(Integer.parseInt(strArrP0[0]))).o0(strArrP0.length > 1 ? Integer.valueOf(Integer.parseInt(strArrP0[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.m0(this.f128540d.get(0));
                    break;
                case 8:
                case 15:
                    bVar.r0(this.f128540d.get(0));
                    break;
                case 9:
                case 21:
                    bVar.g0(Integer.valueOf(Integer.parseInt(this.f128540d.get(0))));
                    break;
                case 13:
                    List<Integer> listA = a(this.f128540d.get(0));
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.e0(listA.get(2));
                            }
                        }
                        bVar.f0(listA.get(1));
                    }
                    bVar.g0(listA.get(0));
                    break;
                case 14:
                    List<Integer> listA2 = a(this.f128540d.get(0));
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.h0(listA2.get(2));
                            }
                        }
                        bVar.i0(listA2.get(1));
                    }
                    bVar.j0(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (p0.c(this.f128527a, mVar.f128527a) && p0.c(this.f128538b, mVar.f128538b) && this.f128540d.equals(mVar.f128540d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f128527a.hashCode()) * 31;
        String str = this.f128538b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f128540d.hashCode();
    }

    @Override // zr.i
    public String toString() {
        return this.f128527a + ": description=" + this.f128538b + ": values=" + this.f128540d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128527a);
        parcel.writeString(this.f128538b);
        parcel.writeStringArray((String[]) this.f128540d.toArray(new String[0]));
    }

    public m(String str, String str2, List<String> list) {
        super(str);
        ts.a.a(!list.isEmpty());
        this.f128538b = str2;
        x<String> xVarN = x.n(list);
        this.f128540d = xVarN;
        this.f128539c = xVarN.get(0);
    }

    private m(Parcel parcel) {
        this((String) ts.a.e(parcel.readString()), parcel.readString(), x.o((String[]) ts.a.e(parcel.createStringArray())));
    }
}
