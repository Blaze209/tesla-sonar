package p010i90;

import androidx.compose.ui.d;
import java.util.Set;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "Ljn0/h0;", "a", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k1 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j1 f76661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f76662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f76665h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76666i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76667j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76668k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, j1 j1Var, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13, int i14) {
            super(2);
            this.f76660c = z11;
            this.f76661d = j1Var;
            this.f76662e = dVar;
            this.f76663f = set;
            this.f76664g = identifierSpec;
            this.f76665h = i11;
            this.f76666i = i12;
            this.f76667j = i13;
            this.f76668k = i14;
        }

        public final void a(l lVar, int i11) {
            k1.a(this.f76660c, this.f76661d, this.f76662e, this.f76663f, this.f76664g, this.f76665h, this.f76666i, lVar, k2.a(this.f76667j | 1), this.f76668k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x0163  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    public static final void a(boolean z11, j1 field, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13, int i14) {
        boolean z12;
        int i15;
        d dVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        d dVar3;
        Set<IdentifierSpec> setD;
        int iA;
        int i22;
        d dVar4;
        Set<IdentifierSpec> set2;
        int iH;
        l1 l1VarH;
        i1 i1Var;
        w2 w2VarX;
        int i23;
        s.k(field, "field");
        l lVarV = lVar.v(1052939135);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
            z12 = z11;
        } else if ((i13 & 14) == 0) {
            z12 = z11;
            i15 = (lVarV.p(z12) ? 4 : 2) | i13;
        } else {
            z12 = z11;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 112) == 0) {
            i15 |= lVarV.n(field) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 896) == 0) {
                dVar2 = dVar;
                i15 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                i15 |= 1024;
            }
            if ((i14 & 16) != 0) {
                if ((i13 & 57344) == 0) {
                    if (lVarV.n(identifierSpec)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i15 |= i17;
                }
                if ((i13 & 458752) == 0) {
                    if ((i14 & 32) == 0) {
                        i18 = i11;
                        int i25 = lVarV.r(i18) ? 131072 : 65536;
                        i15 |= i25;
                    } else {
                        i18 = i11;
                    }
                    i15 |= i25;
                } else {
                    i18 = i11;
                }
                if ((i13 & 3670016) == 0) {
                    if ((i14 & 64) == 0) {
                        i19 = i12;
                        if (lVarV.r(i19)) {
                            i23 = PKIFailureInfo.badCertTemplate;
                        }
                        i15 |= i23;
                    } else {
                        i19 = i12;
                    }
                    i23 = PKIFailureInfo.signerNotTrusted;
                    i15 |= i23;
                } else {
                    i19 = i12;
                }
                if (i16 == 8) {
                    i21 = 57344;
                    if ((2995931 & i15) != 599186 && lVarV.b()) {
                        lVarV.j();
                        set2 = set;
                        dVar4 = dVar2;
                        iA = i18;
                        iH = i19;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
                    }
                }
                i21 = 57344;
                lVarV.L();
                if ((i13 & 1) != 0 || lVarV.k()) {
                    if (i24 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        setD = d1.d();
                    } else {
                        setD = set;
                    }
                    if ((i14 & 32) != 0) {
                        iA = androidx.compose.ui.focus.d.INSTANCE.a();
                        i15 &= -458753;
                    } else {
                        iA = i18;
                    }
                    if ((i14 & 64) != 0) {
                        Set<IdentifierSpec> set3 = setD;
                        i22 = i15 & (-3670017);
                        dVar4 = dVar3;
                        set2 = set3;
                        iH = androidx.compose.ui.focus.d.INSTANCE.h();
                    } else {
                        Set<IdentifierSpec> set4 = setD;
                        i22 = i15;
                        dVar4 = dVar3;
                        set2 = set4;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1052939135, i22, -1, "com.stripe.android.uicore.elements.SectionFieldElementUI (SectionFieldElementUI.kt:17)");
                    }
                    if (!set2.contains(field.getIdentifier())) {
                        l1VarH = field.h();
                        if (l1VarH instanceof i1) {
                            i1Var = (i1) l1VarH;
                        } else {
                            i1Var = null;
                        }
                        if (i1Var != null) {
                            i1Var.g(z12, field, dVar4, set2, identifierSpec, iA, iH, lVarV, (i22 & 14) | 4096 | (i22 & 112) | (i22 & 896) | (i22 & i21) | (458752 & i22) | (i22 & 3670016));
                        }
                    }
                    if (o.J()) {
                        o.R();
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
                    }
                }
                lVarV.j();
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                }
                d dVar5 = dVar2;
                i22 = i15;
                dVar4 = dVar5;
                set2 = set;
                iA = i18;
                iH = i19;
                lVarV.C();
                if (o.J()) {
                    o.S(1052939135, i22, -1, "com.stripe.android.uicore.elements.SectionFieldElementUI (SectionFieldElementUI.kt:17)");
                }
                if (!set2.contains(field.getIdentifier())) {
                    l1VarH = field.h();
                    if (l1VarH instanceof i1) {
                        i1Var = (i1) l1VarH;
                    } else {
                        i1Var = null;
                    }
                    if (i1Var != null) {
                        i1Var.g(z12, field, dVar4, set2, identifierSpec, iA, iH, lVarV, (i22 & 14) | 4096 | (i22 & 112) | (i22 & 896) | (i22 & i21) | (458752 & i22) | (i22 & 3670016));
                    }
                }
                if (o.J()) {
                    o.R();
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
                }
            }
            i15 |= 24576;
            if ((i13 & 458752) == 0) {
                if ((i14 & 32) == 0) {
                    i18 = i11;
                    if (lVarV.r(i18)) {
                    }
                    i15 |= i25;
                } else {
                    i18 = i11;
                }
                i15 |= i25;
            } else {
                i18 = i11;
            }
            if ((i13 & 3670016) == 0) {
                if ((i14 & 64) == 0) {
                    i19 = i12;
                    if (lVarV.r(i19)) {
                        i23 = PKIFailureInfo.badCertTemplate;
                    }
                    i15 |= i23;
                } else {
                    i19 = i12;
                }
                i23 = PKIFailureInfo.signerNotTrusted;
                i15 |= i23;
            } else {
                i19 = i12;
            }
            if (i16 == 8) {
                i21 = 57344;
                if ((2995931 & i15) != 599186) {
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
                }
            }
            i21 = 57344;
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i24 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    setD = d1.d();
                } else {
                    setD = set;
                }
                if ((i14 & 32) != 0) {
                    iA = androidx.compose.ui.focus.d.INSTANCE.a();
                    i15 &= -458753;
                } else {
                    iA = i18;
                }
                if ((i14 & 64) != 0) {
                    Set<IdentifierSpec> set5 = setD;
                    i22 = i15 & (-3670017);
                    dVar4 = dVar3;
                    set2 = set5;
                    iH = androidx.compose.ui.focus.d.INSTANCE.h();
                } else {
                    Set<IdentifierSpec> set6 = setD;
                    i22 = i15;
                    dVar4 = dVar3;
                    set2 = set6;
                    iH = i19;
                }
            } else {
                if (i24 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    setD = d1.d();
                } else {
                    setD = set;
                }
                if ((i14 & 32) != 0) {
                    iA = androidx.compose.ui.focus.d.INSTANCE.a();
                    i15 &= -458753;
                } else {
                    iA = i18;
                }
                if ((i14 & 64) != 0) {
                    Set<IdentifierSpec> set7 = setD;
                    i22 = i15 & (-3670017);
                    dVar4 = dVar3;
                    set2 = set7;
                    iH = androidx.compose.ui.focus.d.INSTANCE.h();
                } else {
                    Set<IdentifierSpec> set8 = setD;
                    i22 = i15;
                    dVar4 = dVar3;
                    set2 = set8;
                    iH = i19;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1052939135, i22, -1, "com.stripe.android.uicore.elements.SectionFieldElementUI (SectionFieldElementUI.kt:17)");
            }
            if (!set2.contains(field.getIdentifier())) {
                l1VarH = field.h();
                if (l1VarH instanceof i1) {
                    i1Var = (i1) l1VarH;
                } else {
                    i1Var = null;
                }
                if (i1Var != null) {
                    i1Var.g(z12, field, dVar4, set2, identifierSpec, iA, iH, lVarV, (i22 & 14) | 4096 | (i22 & 112) | (i22 & 896) | (i22 & i21) | (458752 & i22) | (i22 & 3670016));
                }
            }
            if (o.J()) {
                o.R();
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
            }
        }
        i15 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 1024;
        }
        if ((i14 & 16) != 0) {
            if ((i13 & 57344) == 0) {
                if (lVarV.n(identifierSpec)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i15 |= i17;
            }
            if ((i13 & 458752) == 0) {
                if ((i14 & 32) == 0) {
                    i18 = i11;
                    if (lVarV.r(i18)) {
                    }
                    i15 |= i25;
                } else {
                    i18 = i11;
                }
                i15 |= i25;
            } else {
                i18 = i11;
            }
            if ((i13 & 3670016) == 0) {
                if ((i14 & 64) == 0) {
                    i19 = i12;
                    if (lVarV.r(i19)) {
                        i23 = PKIFailureInfo.badCertTemplate;
                    }
                    i15 |= i23;
                } else {
                    i19 = i12;
                }
                i23 = PKIFailureInfo.signerNotTrusted;
                i15 |= i23;
            } else {
                i19 = i12;
            }
            if (i16 == 8) {
                i21 = 57344;
                if ((2995931 & i15) != 599186) {
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
                }
            }
            i21 = 57344;
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i24 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    setD = d1.d();
                } else {
                    setD = set;
                }
                if ((i14 & 32) != 0) {
                    iA = androidx.compose.ui.focus.d.INSTANCE.a();
                    i15 &= -458753;
                } else {
                    iA = i18;
                }
                if ((i14 & 64) != 0) {
                    Set<IdentifierSpec> set9 = setD;
                    i22 = i15 & (-3670017);
                    dVar4 = dVar3;
                    set2 = set9;
                    iH = androidx.compose.ui.focus.d.INSTANCE.h();
                } else {
                    Set<IdentifierSpec> set10 = setD;
                    i22 = i15;
                    dVar4 = dVar3;
                    set2 = set10;
                    iH = i19;
                }
            } else {
                if (i24 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    setD = d1.d();
                } else {
                    setD = set;
                }
                if ((i14 & 32) != 0) {
                    iA = androidx.compose.ui.focus.d.INSTANCE.a();
                    i15 &= -458753;
                } else {
                    iA = i18;
                }
                if ((i14 & 64) != 0) {
                    Set<IdentifierSpec> set11 = setD;
                    i22 = i15 & (-3670017);
                    dVar4 = dVar3;
                    set2 = set11;
                    iH = androidx.compose.ui.focus.d.INSTANCE.h();
                } else {
                    Set<IdentifierSpec> set12 = setD;
                    i22 = i15;
                    dVar4 = dVar3;
                    set2 = set12;
                    iH = i19;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1052939135, i22, -1, "com.stripe.android.uicore.elements.SectionFieldElementUI (SectionFieldElementUI.kt:17)");
            }
            if (!set2.contains(field.getIdentifier())) {
                l1VarH = field.h();
                if (l1VarH instanceof i1) {
                    i1Var = (i1) l1VarH;
                } else {
                    i1Var = null;
                }
                if (i1Var != null) {
                    i1Var.g(z12, field, dVar4, set2, identifierSpec, iA, iH, lVarV, (i22 & 14) | 4096 | (i22 & 112) | (i22 & 896) | (i22 & i21) | (458752 & i22) | (i22 & 3670016));
                }
            }
            if (o.J()) {
                o.R();
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
            }
        }
        i15 |= 24576;
        if ((i13 & 458752) == 0) {
            if ((i14 & 32) == 0) {
                i18 = i11;
                if (lVarV.r(i18)) {
                }
                i15 |= i25;
            } else {
                i18 = i11;
            }
            i15 |= i25;
        } else {
            i18 = i11;
        }
        if ((i13 & 3670016) == 0) {
            if ((i14 & 64) == 0) {
                i19 = i12;
                if (lVarV.r(i19)) {
                    i23 = PKIFailureInfo.badCertTemplate;
                }
                i15 |= i23;
            } else {
                i19 = i12;
            }
            i23 = PKIFailureInfo.signerNotTrusted;
            i15 |= i23;
        } else {
            i19 = i12;
        }
        if (i16 == 8) {
            i21 = 57344;
            if ((2995931 & i15) != 599186) {
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
            }
        }
        i21 = 57344;
        lVarV.L();
        if ((i13 & 1) != 0) {
            if (i24 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i16 != 0) {
                setD = d1.d();
            } else {
                setD = set;
            }
            if ((i14 & 32) != 0) {
                iA = androidx.compose.ui.focus.d.INSTANCE.a();
                i15 &= -458753;
            } else {
                iA = i18;
            }
            if ((i14 & 64) != 0) {
                Set<IdentifierSpec> set13 = setD;
                i22 = i15 & (-3670017);
                dVar4 = dVar3;
                set2 = set13;
                iH = androidx.compose.ui.focus.d.INSTANCE.h();
            } else {
                Set<IdentifierSpec> set14 = setD;
                i22 = i15;
                dVar4 = dVar3;
                set2 = set14;
                iH = i19;
            }
        } else {
            if (i24 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i16 != 0) {
                setD = d1.d();
            } else {
                setD = set;
            }
            if ((i14 & 32) != 0) {
                iA = androidx.compose.ui.focus.d.INSTANCE.a();
                i15 &= -458753;
            } else {
                iA = i18;
            }
            if ((i14 & 64) != 0) {
                Set<IdentifierSpec> set15 = setD;
                i22 = i15 & (-3670017);
                dVar4 = dVar3;
                set2 = set15;
                iH = androidx.compose.ui.focus.d.INSTANCE.h();
            } else {
                Set<IdentifierSpec> set16 = setD;
                i22 = i15;
                dVar4 = dVar3;
                set2 = set16;
                iH = i19;
            }
        }
        lVarV.C();
        if (o.J()) {
            o.S(1052939135, i22, -1, "com.stripe.android.uicore.elements.SectionFieldElementUI (SectionFieldElementUI.kt:17)");
        }
        if (!set2.contains(field.getIdentifier())) {
            l1VarH = field.h();
            if (l1VarH instanceof i1) {
                i1Var = (i1) l1VarH;
            } else {
                i1Var = null;
            }
            if (i1Var != null) {
                i1Var.g(z12, field, dVar4, set2, identifierSpec, iA, iH, lVarV, (i22 & 14) | 4096 | (i22 & 112) | (i22 & 896) | (i22 & i21) | (458752 & i22) | (i22 & 3670016));
            }
        }
        if (o.J()) {
            o.R();
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, field, dVar4, set2, identifierSpec, iA, iH, i13, i14));
        }
    }
}
