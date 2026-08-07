package p020r2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0007\u001a#\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0007\u001a#\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u001b\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001b\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u0004\u001a#\u0010\u001a\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u0004\u001a#\u0010\u001d\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001b\u0010\u001e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u0004\u001a#\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001f\u0010\u001b\u001a\u001b\u0010 \u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b \u0010\u0004\u001a#\u0010\"\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010\u001b\u001aK\u0010)\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*\u001a5\u00100\u001a\u0004\u0018\u00010,*\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00103\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\u0006\u00102\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0004\b3\u00104\u001a3\u00105\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0004\b5\u00104¨\u00066"}, d2 = {"", "", PlaceTypes.ADDRESS, "H", "([II)I", "", Gender.NONE, "([II)Z", "R", "L", "S", "J", "K", "value", "Ljn0/h0;", "Z", "([IIZ)V", "D", "W", "C", "B", "V", "E", "(I)I", Gender.OTHER, "Q", "a0", "([III)V", "T", "b0", "I", "Y", Gender.FEMALE, "anchor", "X", Action.KEY_ATTRIBUTE, "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", Gender.MALE, "([IIIZZZII)V", "Ljava/util/ArrayList;", "Lr2/d;", "Lkotlin/collections/ArrayList;", "index", "effectiveSize", "G", "(Ljava/util/ArrayList;II)Lr2/d;", "location", Gender.UNKNOWN, "(Ljava/util/ArrayList;II)I", "P", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return i12 >= iArr.length ? iArr.length : iArr[i12 + 4] + E(iArr[i12 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(int i11) {
        switch (i11) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d G(ArrayList<d> arrayList, int i11, int i12) {
        int iU = U(arrayList, i11, i12);
        if (iU >= 0) {
            return arrayList.get(iU);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(int[] iArr, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, int i14) {
        int i15 = z11 ? 1073741824 : 0;
        int i16 = z12 ? PKIFailureInfo.duplicateCertReq : 0;
        int i17 = z13 ? 268435456 : 0;
        int i18 = i11 * 5;
        iArr[i18] = i12;
        iArr[i18 + 1] = i15 | i16 | i17;
        iArr[i18 + 2] = i13;
        iArr[i18 + 3] = 0;
        iArr[i18 + 4] = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(int[] iArr, int i11) {
        return iArr[i11 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(ArrayList<d> arrayList, int i11, int i12) {
        int iU = U(arrayList, i11, i12);
        return iU >= 0 ? iU : -(iU + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + E(iArr[i12 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(ArrayList<d> arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int iA = arrayList.get(i14).getLocation();
            if (iA < 0) {
                iA += i12;
            }
            int iM = s.m(iA, i11);
            if (iM < 0) {
                i13 = i14 + 1;
            } else {
                if (iM <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + E(iArr[i12 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        if (z11) {
            iArr[i12] = iArr[i12] | 67108864;
        } else {
            iArr[i12] = iArr[i12] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 4] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(int[] iArr, int i11, int i12) {
        o.Q(i12 >= 0);
        iArr[(i11 * 5) + 3] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        if (z11) {
            iArr[i12] = iArr[i12] | 134217728;
        } else {
            iArr[i12] = iArr[i12] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(int[] iArr, int i11, int i12) {
        o.Q(i12 >= 0 && i12 < 67108863);
        int i13 = (i11 * 5) + 1;
        iArr[i13] = i12 | (iArr[i13] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 2] = i12;
    }
}
