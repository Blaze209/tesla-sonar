package v1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p013kotlin.Metadata;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lv1/b0;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "Lz3/k0;", "measureScope", "", "Lz3/h0;", "measurables", "", "Lz3/w0;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "Lz3/j0;", "a", "(Lv1/b0;IIIIILz3/k0;Ljava/util/List;[Lz3/w0;II[II)Lz3/j0;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c0 {
    public static final z3.j0 a(b0 b0Var, int i11, int i12, int i13, int i14, int i15, z3.k0 k0Var, List<? extends z3.h0> list, w0[] w0VarArr, int i16, int i17, int[] iArr, int i18) throws Throwable {
        float f11;
        float f12;
        String str;
        String str2;
        long j11;
        String str3;
        String str4;
        String str5;
        long j12;
        Integer num;
        int i19;
        int iN;
        int i21;
        int i22;
        String str6;
        int i23;
        String str7;
        String str8;
        float f13;
        String str9;
        int i24;
        String str10;
        int i25;
        String str11;
        float f14;
        String str12;
        long j13;
        String str13;
        long j14;
        String str14;
        int i26;
        char c11;
        int i27;
        int i28;
        int iMax;
        int i29;
        b0 b0Var2;
        int i31;
        List<? extends z3.h0> list2 = list;
        int i32 = i17;
        long j15 = i15;
        int i33 = i32 - i16;
        int[] iArr2 = new int[i33];
        int i34 = 0;
        int i35 = i16;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i41 = 0;
        float f15 = 0.0f;
        while (true) {
            if (i35 >= i32) {
                break;
            }
            int i42 = i35;
            z3.h0 h0Var = list2.get(i35);
            RowColumnParentData rowColumnParentDataC = a0.c(h0Var);
            float fE = a0.e(rowColumnParentDataC);
            int i43 = (i37 != 0 || a0.f(rowColumnParentDataC)) ? 1 : i34;
            if (fE > BitmapDescriptorFactory.HUE_RED) {
                i36++;
                f15 += fE;
                i33 = i33;
                i31 = i39;
                iArr2 = iArr2;
            } else {
                if (i14 != 2147483647 && rowColumnParentDataC != null) {
                    rowColumnParentDataC.c();
                }
                int i44 = i13 - i39;
                w0 w0VarX0 = w0VarArr[i42];
                if (w0VarX0 == null) {
                    i29 = i44;
                    b0Var2 = b0Var;
                    w0VarX0 = h0Var.x0(b0.b(b0Var2, 0, 0, i13 != Integer.MAX_VALUE ? bo0.n.f(i44, i34) : Integer.MAX_VALUE, i14, false, 16, null));
                } else {
                    i29 = i44;
                    b0Var2 = b0Var;
                }
                int iE = b0Var2.e(w0VarX0);
                int iK = b0Var2.k(w0VarX0);
                iArr2[i42 - i16] = iE;
                int iMin = Math.min(i15, bo0.n.f(i29 - iE, 0));
                i31 = iE + iMin + i39;
                int iMax2 = Math.max(i41, iK);
                w0VarArr[i42] = w0VarX0;
                i41 = iMax2;
                i38 = iMin;
                i36 = i36;
                f15 = f15;
            }
            i35 = i42 + 1;
            iArr2 = iArr2;
            i37 = i43;
            i33 = i33;
            i39 = i31;
            i34 = 0;
        }
        int i45 = i36;
        int i46 = i33;
        int i47 = i39;
        int i48 = i41;
        float f16 = f15;
        int[] iArr3 = iArr2;
        if (i45 == 0) {
            i21 = i47 - i38;
            i19 = i48;
            num = null;
            iN = 0;
        } else {
            int i49 = i13 != Integer.MAX_VALUE ? i13 : i11;
            long j16 = ((long) (i45 - 1)) * j15;
            long jG = bo0.n.g(((long) (i49 - i47)) - j16, 0L);
            float f17 = f16;
            float f18 = jG / f17;
            int i51 = i16;
            long jRound = jG;
            while (true) {
                f11 = f18;
                f12 = f17;
                str = "arrangementSpacingTotal ";
                str2 = "fixedSpace ";
                j11 = jG;
                str3 = "weightChildrenCount ";
                str4 = "remainingToTarget ";
                str5 = "targetSpace ";
                j12 = j16;
                if (i51 >= i32) {
                    break;
                }
                float fE2 = a0.e(a0.c(list2.get(i51)));
                float f19 = f11 * fE2;
                try {
                    jRound -= (long) Math.round(f19);
                    i51++;
                    list2 = list;
                    f18 = f11;
                    f17 = f12;
                    jG = j11;
                    j16 = j12;
                } catch (IllegalArgumentException e11) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i13 + "mainAxisMin " + i11 + "targetSpace " + i49 + "arrangementSpacingPx " + j15 + "weightChildrenCount " + i45 + "fixedSpace " + i47 + "arrangementSpacingTotal " + j12 + str4 + j11 + "totalWeight " + f12 + "weightUnitSpace " + f11 + "itemWeight " + fE2 + "weightedSize " + f19).initCause(e11);
                }
            }
            String str15 = "weightedSize ";
            int i52 = i45;
            String str16 = "weightUnitSpace ";
            String str17 = "mainAxisMin ";
            int i53 = i16;
            int i54 = i48;
            int i55 = 0;
            while (i53 < i32) {
                if (w0VarArr[i53] == null) {
                    String str18 = str3;
                    i23 = i53;
                    z3.h0 h0Var2 = list.get(i53);
                    RowColumnParentData rowColumnParentDataC2 = a0.c(h0Var2);
                    float fE3 = a0.e(rowColumnParentDataC2);
                    int i56 = i55;
                    String str19 = str;
                    if (i14 != Integer.MAX_VALUE && rowColumnParentDataC2 != null) {
                        rowColumnParentDataC2.c();
                    }
                    if (fE3 <= BitmapDescriptorFactory.HUE_RED) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iB = yn0.a.b(jRound);
                    String str20 = str15;
                    jRound -= (long) iB;
                    float f21 = f11 * fE3;
                    int iMax3 = Math.max(0, Math.round(f21) + iB);
                    try {
                        try {
                            if (a0.b(rowColumnParentDataC2)) {
                                c11 = 65535;
                                int i57 = iMax3 != Integer.MAX_VALUE ? iMax3 : 0;
                                str8 = str16;
                                f13 = f11;
                                f14 = f21;
                                j13 = j11;
                                str13 = str4;
                                j14 = j12;
                                str6 = str19;
                                str14 = str20;
                                str12 = str2;
                                i26 = i52;
                                i24 = i47;
                                str10 = str18;
                                str11 = str17;
                                str9 = str5;
                                w0 w0VarX1 = h0Var2.x0(b0Var.a(i57, 0, iMax3, i14, true));
                                int iE2 = b0Var.e(w0VarX1);
                                int iK2 = b0Var.k(w0VarX1);
                                iArr3[i23 - i16] = iE2;
                                int iMax4 = Math.max(i54, iK2);
                                w0VarArr[i23] = w0VarX1;
                                i22 = i56 + iE2;
                                i54 = iMax4;
                                str7 = str12;
                                i25 = i26;
                                j12 = j14;
                                j11 = j13;
                                str15 = str14;
                                str4 = str13;
                            } else {
                                c11 = 65535;
                            }
                            w0 w0VarX2 = h0Var2.x0(b0Var.a(i57, 0, iMax3, i14, true));
                            int iE3 = b0Var.e(w0VarX2);
                            int iK3 = b0Var.k(w0VarX2);
                            iArr3[i23 - i16] = iE3;
                            int iMax5 = Math.max(i54, iK3);
                            w0VarArr[i23] = w0VarX2;
                            i22 = i56 + iE3;
                            i54 = iMax5;
                            str7 = str12;
                            i25 = i26;
                            j12 = j14;
                            j11 = j13;
                            str15 = str14;
                            str4 = str13;
                        } catch (IllegalArgumentException e12) {
                            e = e12;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i13 + str11 + i11 + str9 + i49 + "arrangementSpacingPx " + j15 + str10 + i26 + str12 + i24 + str6 + j14 + str13 + j13 + "totalWeight " + f12 + str8 + f13 + "weight " + fE3 + str14 + f14 + "crossAxisDesiredSize " + ((Object) null) + "remainderUnit " + iB + "childMainAxisSize " + iMax3).initCause(e);
                        }
                        str8 = str16;
                        f13 = f11;
                        f14 = f21;
                        j13 = j11;
                        str13 = str4;
                        j14 = j12;
                        str6 = str19;
                        str14 = str20;
                        str12 = str2;
                        i26 = i52;
                        i24 = i47;
                        str10 = str18;
                        str11 = str17;
                        str9 = str5;
                    } catch (IllegalArgumentException e13) {
                        e = e13;
                        f14 = f21;
                        str12 = str2;
                        str8 = str16;
                        f13 = f11;
                        j13 = j11;
                        str13 = str4;
                        j14 = j12;
                        str6 = str19;
                        str14 = str20;
                        str9 = str5;
                        i26 = i52;
                        i24 = i47;
                        str10 = str18;
                        str11 = str17;
                    }
                } else {
                    i22 = i55;
                    str6 = str;
                    i23 = i53;
                    str7 = str2;
                    str8 = str16;
                    f13 = f11;
                    str9 = str5;
                    i24 = i47;
                    str10 = str3;
                    i25 = i52;
                    str11 = str17;
                }
                i53 = i23 + 1;
                str5 = str9;
                str17 = str11;
                str2 = str7;
                i55 = i22;
                str16 = str8;
                str = str6;
                i32 = i17;
                i52 = i25;
                str3 = str10;
                i47 = i24;
                f11 = f13;
            }
            num = null;
            int i58 = i47;
            i19 = i54;
            iN = bo0.n.n((int) (((long) i55) + j12), 0, i13 - i58);
            i21 = i58;
        }
        if (i37 != 0) {
            i27 = i17;
            iMax = 0;
            int iMax6 = 0;
            for (int i59 = i16; i59 < i27; i59++) {
                w0 w0Var = w0VarArr[i59];
                p013kotlin.jvm.internal.s.h(w0Var);
                androidx.compose.foundation.layout.j jVarA = a0.a(a0.d(w0Var));
                Integer numB = jVarA != null ? jVarA.b(w0Var) : num;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iK4 = b0Var.k(w0Var);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iK4;
                    }
                    iMax6 = Math.max(iMax6, iK4 - iIntValue);
                }
            }
            i28 = iMax6;
        } else {
            i27 = i17;
            i28 = 0;
            iMax = 0;
        }
        int iMax7 = Math.max(bo0.n.f(i21 + iN, 0), i11);
        int iMax8 = Math.max(i19, Math.max(i12, i28 + iMax));
        int[] iArr4 = new int[i46];
        for (int i61 = 0; i61 < i46; i61++) {
            iArr4[i61] = 0;
        }
        b0Var.f(iMax7, iArr3, iArr4, k0Var);
        return b0Var.h(w0VarArr, k0Var, iMax, iArr4, iMax7, iMax8, iArr, i18, i16, i27);
    }
}
