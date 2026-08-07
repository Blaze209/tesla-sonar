package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TA {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xf.b f27852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f27854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ xf.j f27855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ xf.h f27856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ xf.i f27857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ xf.k f27858h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xf.b bVar, int i11, float f11, xf.j jVar, xf.h hVar, xf.i iVar, xf.k kVar, Continuation continuation) {
            super(2, continuation);
            this.f27852b = bVar;
            this.f27853c = i11;
            this.f27854d = f11;
            this.f27855e = jVar;
            this.f27856f = hVar;
            this.f27857g = iVar;
            this.f27858h = kVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f27852b, this.f27853c, this.f27854d, this.f27855e, this.f27856f, this.f27857g, this.f27858h, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27851a;
            if (i11 == 0) {
                jn0.t.b(obj);
                xf.b bVar = this.f27852b;
                tf.i iVarA = TA.a(this.f27858h);
                int i12 = this.f27853c;
                float f11 = this.f27854d;
                xf.j jVar = this.f27855e;
                float progress = this.f27856f.getProgress();
                xf.i iVar = this.f27857g;
                this.f27851a = 1;
                if (xf.b.a.a(bVar, iVarA, 0, i12, false, f11, jVar, progress, false, iVar, false, false, this, 1674, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, boolean z11, boolean z12, long j11, long j12, long j13, long j14, int i11, float f11, xf.j jVar, Yj yj2, xf.i iVar, wn0.l lVar, z3.k kVar, int i12, int i13, int i14, p020r2.l lVar2, int i15) {
        a(dVar, z11, z12, j11, j12, j13, j14, i11, f11, jVar, yj2, iVar, lVar, kVar, lVar2, p020r2.k2.a(i12 | 1), p020r2.k2.a(i13), i14);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(float f11) {
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0185  */
    /* JADX WARN: Code duplicated, block: B:130:0x018f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:163:0x0213  */
    /* JADX WARN: Code duplicated, block: B:165:0x021d  */
    /* JADX WARN: Code duplicated, block: B:181:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x025c  */
    /* JADX WARN: Code duplicated, block: B:183:0x025f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0263  */
    /* JADX WARN: Code duplicated, block: B:186:0x0266  */
    /* JADX WARN: Code duplicated, block: B:188:0x026a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0270  */
    /* JADX WARN: Code duplicated, block: B:192:0x028a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0290  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:204:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:208:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:213:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:217:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:219:0x0308  */
    /* JADX WARN: Code duplicated, block: B:221:0x0316  */
    /* JADX WARN: Code duplicated, block: B:223:0x031c  */
    /* JADX WARN: Code duplicated, block: B:225:0x032c  */
    /* JADX WARN: Code duplicated, block: B:228:0x033a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0345  */
    /* JADX WARN: Code duplicated, block: B:232:0x035b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0369  */
    /* JADX WARN: Code duplicated, block: B:236:0x0379  */
    /* JADX WARN: Code duplicated, block: B:237:0x0394  */
    /* JADX WARN: Code duplicated, block: B:239:0x039a  */
    /* JADX WARN: Code duplicated, block: B:242:0x05df  */
    /* JADX WARN: Code duplicated, block: B:243:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:247:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:250:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:256:0x0608  */
    /* JADX WARN: Code duplicated, block: B:259:0x0616  */
    /* JADX WARN: Code duplicated, block: B:260:0x0619  */
    /* JADX WARN: Code duplicated, block: B:263:0x0621  */
    /* JADX WARN: Code duplicated, block: B:267:0x0631  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:270:0x0667  */
    /* JADX WARN: Code duplicated, block: B:272:0x0670  */
    /* JADX WARN: Code duplicated, block: B:274:0x0674  */
    /* JADX WARN: Code duplicated, block: B:279:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:281:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:284:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:288:0x0712  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0728  */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128 A[PHI: r27
      0x0128: PHI (r27v33 int) = (r27v4 int), (r27v10 int), (r27v11 int) binds: [B:97:0x0126, B:107:0x0143, B:106:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(androidx.compose.ui.d dVar, boolean z11, boolean z12, long j11, long j12, long j13, long j14, int i11, float f11, xf.j jVar, final Yj lottieSource, xf.i iVar, wn0.l lVar, z3.k kVar, p020r2.l lVar2, final int i12, final int i13, final int i14) {
        int i15;
        int i16;
        boolean z13;
        int i17;
        long jA;
        long jA2;
        long jC;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean zK;
        Yj yj2;
        int i25;
        boolean zK2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        androidx.compose.ui.d dVar2;
        boolean z14;
        long jA3;
        int i36;
        int i37;
        float f12;
        xf.j jVar2;
        xf.i iVar2;
        androidx.compose.ui.d dVar3;
        wn0.l lVar3;
        z3.k kVarE;
        int i38;
        long j15;
        int i39;
        Object objI;
        Object objI2;
        p020r2.l.Companion companion;
        int i41;
        p020r2.p1 p1Var;
        xf.b bVarD;
        xf.m mVarA;
        xf.k kVarR;
        int i42;
        float f13;
        xf.j jVar3;
        xf.i iVar3;
        xf.h hVarC;
        int i43;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objI3;
        final xf.b bVar;
        int i44;
        float f14;
        xf.h hVar;
        xf.i iVar4;
        boolean zN;
        Object objI4;
        p020r2.l lVar4;
        final xf.j jVar4;
        final long j16;
        final boolean z21;
        final long j17;
        final float f15;
        final int i45;
        final wn0.l lVar5;
        final xf.i iVar5;
        final androidx.compose.ui.d dVar4;
        final z3.k kVar2;
        final long j18;
        final boolean z22;
        final long j19;
        p020r2.w2 w2VarX;
        int i46;
        int i47;
        int i48;
        int i49;
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p020r2.l lVarV = lVar2.v(-1707951323);
        int i51 = i14 & 1;
        if (i51 != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i15 = (lVarV.n(dVar) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        int i52 = i14 & 2;
        if (i52 == 0) {
            if ((i12 & 48) == 0) {
                i15 |= lVarV.p(z11) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
                    z13 = z12;
                    if (lVarV.p(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i12 & 3072) != 0) {
                    if ((i14 & 8) == 0 || !lVarV.s(j11)) {
                        i49 = 1024;
                    } else {
                        i49 = 2048;
                    }
                    i15 |= i49;
                }
                if ((i12 & 24576) == 0) {
                    jA = j12;
                    if ((i14 & 16) == 0 || !lVarV.s(jA)) {
                        i48 = PKIFailureInfo.certRevoked;
                    } else {
                        i48 = 16384;
                    }
                    i15 |= i48;
                } else {
                    jA = j12;
                }
                if ((i12 & 196608) == 0) {
                    jA2 = j13;
                    if ((i14 & 32) == 0 || !lVarV.s(jA2)) {
                        i47 = 65536;
                    } else {
                        i47 = 131072;
                    }
                    i15 |= i47;
                } else {
                    jA2 = j13;
                }
                if ((i12 & 1572864) == 0) {
                    jC = j14;
                    if ((i14 & 64) == 0 || !lVarV.s(jC)) {
                        i46 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i46 = PKIFailureInfo.badCertTemplate;
                    }
                    i15 |= i46;
                } else {
                    jC = j14;
                }
                i18 = i14 & 128;
                if (i18 != 0) {
                    i15 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (lVarV.r(i11)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
                i21 = i14 & 256;
                if (i21 != 0) {
                    if ((i12 & 100663296) == 0) {
                        if (lVarV.q(f11)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 512;
                    i24 = 805306368;
                    if (i23 == 0) {
                        i15 |= i24;
                    } else if ((i12 & 805306368) == 0) {
                        if ((i12 & 1073741824) == 0) {
                            zK = lVarV.n(jVar);
                        } else {
                            zK = lVarV.K(jVar);
                        }
                        if (zK) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i15 |= i24;
                    }
                    if ((i14 & 1024) != 0) {
                        i25 = i13 | 6;
                        yj2 = lottieSource;
                    } else if ((i13 & 6) == 0) {
                        if ((i13 & 8) == 0) {
                            yj2 = lottieSource;
                            zK2 = lVarV.n(yj2);
                        } else {
                            yj2 = lottieSource;
                            zK2 = lVarV.K(yj2);
                        }
                        if (zK2) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i25 = i13 | i26;
                    } else {
                        yj2 = lottieSource;
                        i25 = i13;
                    }
                    i27 = i14 & 2048;
                    if (i27 != 0) {
                        i25 |= 48;
                    } else if ((i13 & 48) != 0) {
                        if (lVarV.n(iVar)) {
                            i28 = 32;
                        } else {
                            i28 = 16;
                        }
                        i25 |= i28;
                    }
                    i29 = i25;
                    i31 = i14 & 4096;
                    if (i31 != 0) {
                        i32 = i29 | KyberEngine.KyberPolyBytes;
                    } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                        i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
                    } else {
                        i32 = i29;
                    }
                    i33 = i14 & PKIFailureInfo.certRevoked;
                    if (i33 != 0) {
                        i35 = i32 | 3072;
                    } else {
                        i34 = i32;
                        if ((i13 & 3072) != 0) {
                            i34 |= lVarV.n(kVar) ? 2048 : 1024;
                        }
                        i35 = i34;
                    }
                    if ((i15 & 306783379) != 306783378 && (i35 & 1171) == 1170 && lVarV.b()) {
                        lVarV.j();
                        dVar4 = dVar;
                        z22 = z11;
                        iVar5 = iVar;
                        lVar5 = lVar;
                        kVar2 = kVar;
                        lVar4 = lVarV;
                        z21 = z13;
                        j19 = jA;
                        j18 = jA2;
                        j16 = jC;
                        j17 = j11;
                        i45 = i11;
                        f15 = f11;
                        jVar4 = jVar;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0 || lVarV.k()) {
                            if (i51 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i52 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 8) != 0) {
                                jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                                i15 &= -7169;
                            } else {
                                jA3 = j11;
                            }
                            if ((i14 & 16) != 0) {
                                i36 = 6;
                                jA = C3825sp.f35377a.d(lVarV, 6).a();
                                i15 &= -57345;
                            } else {
                                i36 = 6;
                            }
                            if ((i14 & 32) != 0) {
                                jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                                i15 &= -458753;
                            }
                            if ((i14 & 64) != 0) {
                                jC = C3825sp.f35377a.d(lVarV, 6).c();
                                i15 = (-3670017) & i15;
                            }
                            if (i18 != 0) {
                                i37 = 1;
                            } else {
                                i37 = i11;
                            }
                            if (i21 != 0) {
                                f12 = 1.0f;
                            } else {
                                f12 = f11;
                            }
                            if (i23 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i27 != 0) {
                                iVar2 = xf.i.Immediately;
                            } else {
                                iVar2 = iVar;
                            }
                            dVar3 = dVar2;
                            if (i31 != 0) {
                                lVarV.o(-835229593);
                                objI = lVarV.I();
                                if (objI == p020r2.l.INSTANCE.a()) {
                                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                        @Override // wn0.l
                                        public final Object invoke(Object obj) {
                                            return TA.a(((Float) obj).floatValue());
                                        }
                                    };
                                    lVarV.B(objI);
                                }
                                lVar3 = (wn0.l) objI;
                                lVarV.l();
                            } else {
                                lVar3 = lVar;
                            }
                            if (i33 != 0) {
                                kVarE = z3.k.INSTANCE.e();
                            } else {
                                kVarE = kVar;
                            }
                            i38 = i15;
                            j15 = jA3;
                            i39 = i37;
                        } else {
                            lVarV.j();
                            if ((i14 & 8) != 0) {
                                i15 &= -7169;
                            }
                            if ((i14 & 16) != 0) {
                                i15 &= -57345;
                            }
                            if ((i14 & 32) != 0) {
                                i15 &= -458753;
                            }
                            if ((i14 & 64) != 0) {
                                i15 &= -3670017;
                            }
                            z14 = z11;
                            f12 = f11;
                            jVar2 = jVar;
                            iVar2 = iVar;
                            lVar3 = lVar;
                            kVarE = kVar;
                            i38 = i15;
                            dVar3 = dVar;
                            j15 = j11;
                            i39 = i11;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                        }
                        lVarV.o(-835226457);
                        objI2 = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        i41 = i35;
                        if (objI2 == companion.a()) {
                            objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p020r2.p1) objI2;
                        lVarV.l();
                        bVarD = xf.d.d(lVarV, 0);
                        if (yj2 instanceof Yj.a) {
                            String path = ((Yj.a) yj2).a().getPath();
                            p013kotlin.jvm.internal.s.j(path, "getPath(...)");
                            mVarA = xf.m.c.a(xf.m.c.b(path));
                        } else {
                            if (!(yj2 instanceof Yj.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                        }
                        kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                        boolean z23 = z14;
                        boolean z24 = z13;
                        i42 = i39;
                        f13 = f12;
                        jVar3 = jVar2;
                        iVar3 = iVar2;
                        hVarC = xf.a.c(a(kVarR), z23, z24, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                        i43 = i38;
                        Integer num = tf.d0.f113272a;
                        long j21 = jA;
                        xf.p pVarC = xf.o.c(num, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                        xf.p pVarC2 = xf.o.c(num, Integer.valueOf(k3.r1.k(j21)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                        xf.p pVarC3 = xf.o.c(num, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                        xf.p pVarC4 = xf.o.c(num, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                        C3825sp c3825sp = C3825sp.f35377a;
                        long j22 = jA2;
                        xf.n nVarB = xf.o.b(new xf.p[]{pVarC, pVarC2, pVarC3, pVarC4, xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num, Integer.valueOf(k3.r1.k(c3825sp.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                        tf.i iVarA = a(kVarR);
                        Float fValueOf = Float.valueOf(hVarC.getProgress());
                        lVarV.o(-835066949);
                        boolean zN2 = lVarV.n(bVarD) | lVarV.n(kVarR);
                        if ((i43 & 29360128) == 8388608) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z25 = zN2 | z15;
                        if ((i43 & 234881024) == 67108864) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z26 = z25 | z16;
                        if ((i43 & 1879048192) != 536870912 || ((i43 & 1073741824) != 0 && lVarV.K(jVar3))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zN3 = z26 | z17 | lVarV.n(hVarC);
                        if ((i41 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zN3 | z18;
                        objI3 = lVarV.I();
                        if (!z19 || objI3 == companion.a()) {
                            objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                            bVar = bVarD;
                            i44 = i42;
                            f14 = f13;
                            hVar = hVarC;
                            iVar4 = iVar3;
                            lVarV.B(objI3);
                        } else {
                            hVar = hVarC;
                            bVar = bVarD;
                            f14 = f13;
                            i44 = i42;
                            iVar4 = iVar3;
                        }
                        lVarV.l();
                        Function0.f(iVarA, fValueOf, (wn0.p) objI3, lVarV, 0);
                        if (hVar.g()) {
                            if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED) && !((Boolean) p1Var.getValue()).booleanValue()) {
                                lVar3.invoke(Float.valueOf(hVar.getProgress()));
                                p1Var.setValue(Boolean.TRUE);
                            }
                        }
                        tf.i iVarS = bVar.s();
                        lVarV.o(-835046250);
                        zN = lVarV.n(bVar);
                        objI4 = lVarV.I();
                        if (!zN || objI4 == companion.a()) {
                            objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                                @Override // wn0.a
                                public final Object invoke() {
                                    return Float.valueOf(TA.a(bVar));
                                }
                            };
                            lVarV.B(objI4);
                        }
                        lVarV.l();
                        androidx.compose.ui.d dVar5 = dVar3;
                        lVar4 = lVarV;
                        xf.e.a(iVarS, (wn0.a) objI4, dVar5, false, false, false, false, null, false, nVarB, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        long j23 = jC;
                        jVar4 = jVar3;
                        j16 = j23;
                        z21 = z24;
                        j17 = j15;
                        f15 = f14;
                        i45 = i44;
                        lVar5 = lVar3;
                        iVar5 = iVar4;
                        dVar4 = dVar5;
                        kVar2 = kVarE;
                        j18 = j22;
                        z22 = z23;
                        j19 = j21;
                    }
                    w2VarX = lVar4.x();
                    if (w2VarX != null) {
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 100663296;
                i23 = i14 & 512;
                i24 = 805306368;
                if (i23 == 0) {
                    i15 |= i24;
                } else if ((i12 & 805306368) == 0) {
                    if ((i12 & 1073741824) == 0) {
                        zK = lVarV.n(jVar);
                    } else {
                        zK = lVarV.K(jVar);
                    }
                    if (zK) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i15 |= i24;
                }
                if ((i14 & 1024) != 0) {
                    i25 = i13 | 6;
                    yj2 = lottieSource;
                } else if ((i13 & 6) == 0) {
                    if ((i13 & 8) == 0) {
                        yj2 = lottieSource;
                        zK2 = lVarV.n(yj2);
                    } else {
                        yj2 = lottieSource;
                        zK2 = lVarV.K(yj2);
                    }
                    if (zK2) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i13 | i26;
                } else {
                    yj2 = lottieSource;
                    i25 = i13;
                }
                i27 = i14 & 2048;
                if (i27 != 0) {
                    i25 |= 48;
                } else if ((i13 & 48) != 0) {
                    if (lVarV.n(iVar)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i25 |= i28;
                }
                i29 = i25;
                i31 = i14 & 4096;
                if (i31 != 0) {
                    i32 = i29 | KyberEngine.KyberPolyBytes;
                } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                    i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
                } else {
                    i32 = i29;
                }
                i33 = i14 & PKIFailureInfo.certRevoked;
                if (i33 != 0) {
                    i35 = i32 | 3072;
                } else {
                    i34 = i32;
                    if ((i13 & 3072) != 0) {
                        i34 |= lVarV.n(kVar) ? 2048 : 1024;
                    }
                    i35 = i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    } else {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                    }
                    lVarV.o(-835226457);
                    objI2 = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i41 = i35;
                    if (objI2 == companion.a()) {
                        objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p020r2.p1) objI2;
                    lVarV.l();
                    bVarD = xf.d.d(lVarV, 0);
                    if (yj2 instanceof Yj.a) {
                        String path2 = ((Yj.a) yj2).a().getPath();
                        p013kotlin.jvm.internal.s.j(path2, "getPath(...)");
                        mVarA = xf.m.c.a(xf.m.c.b(path2));
                    } else {
                        if (!(yj2 instanceof Yj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                    }
                    kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                    boolean z27 = z14;
                    boolean z28 = z13;
                    i42 = i39;
                    f13 = f12;
                    jVar3 = jVar2;
                    iVar3 = iVar2;
                    hVarC = xf.a.c(a(kVarR), z27, z28, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                    i43 = i38;
                    Integer num2 = tf.d0.f113272a;
                    long j24 = jA;
                    xf.p pVarC5 = xf.o.c(num2, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                    xf.p pVarC6 = xf.o.c(num2, Integer.valueOf(k3.r1.k(j24)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                    xf.p pVarC7 = xf.o.c(num2, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                    xf.p pVarC8 = xf.o.c(num2, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                    C3825sp c3825sp2 = C3825sp.f35377a;
                    long j25 = jA2;
                    xf.n nVarB2 = xf.o.b(new xf.p[]{pVarC5, pVarC6, pVarC7, pVarC8, xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num2, Integer.valueOf(k3.r1.k(c3825sp2.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                    tf.i iVarA2 = a(kVarR);
                    Float fValueOf2 = Float.valueOf(hVarC.getProgress());
                    lVarV.o(-835066949);
                    boolean zN4 = lVarV.n(bVarD) | lVarV.n(kVarR);
                    if ((i43 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z29 = zN4 | z15;
                    if ((i43 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z210 = z29 | z16;
                    if ((i43 & 1879048192) != 536870912) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    boolean zN5 = z210 | z17 | lVarV.n(hVarC);
                    if ((i41 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zN5 | z18;
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    } else {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    }
                    lVarV.l();
                    Function0.f(iVarA2, fValueOf2, (wn0.p) objI3, lVarV, 0);
                    if (hVar.g()) {
                        if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                            lVar3.invoke(Float.valueOf(hVar.getProgress()));
                            p1Var.setValue(Boolean.TRUE);
                        }
                    }
                    tf.i iVarS2 = bVar.s();
                    lVarV.o(-835046250);
                    zN = lVarV.n(bVar);
                    objI4 = lVarV.I();
                    if (!zN) {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    } else {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVar6 = dVar3;
                    lVar4 = lVarV;
                    xf.e.a(iVarS2, (wn0.a) objI4, dVar6, false, false, false, false, null, false, nVarB2, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    long j26 = jC;
                    jVar4 = jVar3;
                    j16 = j26;
                    z21 = z28;
                    j17 = j15;
                    f15 = f14;
                    i45 = i44;
                    lVar5 = lVar3;
                    iVar5 = iVar4;
                    dVar4 = dVar6;
                    kVar2 = kVarE;
                    j18 = j25;
                    z22 = z27;
                    j19 = j24;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    } else {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                    }
                    lVarV.o(-835226457);
                    objI2 = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i41 = i35;
                    if (objI2 == companion.a()) {
                        objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p020r2.p1) objI2;
                    lVarV.l();
                    bVarD = xf.d.d(lVarV, 0);
                    if (yj2 instanceof Yj.a) {
                        String path3 = ((Yj.a) yj2).a().getPath();
                        p013kotlin.jvm.internal.s.j(path3, "getPath(...)");
                        mVarA = xf.m.c.a(xf.m.c.b(path3));
                    } else {
                        if (!(yj2 instanceof Yj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                    }
                    kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                    boolean z211 = z14;
                    boolean z212 = z13;
                    i42 = i39;
                    f13 = f12;
                    jVar3 = jVar2;
                    iVar3 = iVar2;
                    hVarC = xf.a.c(a(kVarR), z211, z212, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                    i43 = i38;
                    Integer num3 = tf.d0.f113272a;
                    long j27 = jA;
                    xf.p pVarC9 = xf.o.c(num3, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                    xf.p pVarC10 = xf.o.c(num3, Integer.valueOf(k3.r1.k(j27)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                    xf.p pVarC11 = xf.o.c(num3, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                    xf.p pVarC12 = xf.o.c(num3, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                    C3825sp c3825sp3 = C3825sp.f35377a;
                    long j28 = jA2;
                    xf.n nVarB3 = xf.o.b(new xf.p[]{pVarC9, pVarC10, pVarC11, pVarC12, xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num3, Integer.valueOf(k3.r1.k(c3825sp3.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                    tf.i iVarA3 = a(kVarR);
                    Float fValueOf3 = Float.valueOf(hVarC.getProgress());
                    lVarV.o(-835066949);
                    boolean zN6 = lVarV.n(bVarD) | lVarV.n(kVarR);
                    if ((i43 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z213 = zN6 | z15;
                    if ((i43 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z214 = z213 | z16;
                    if ((i43 & 1879048192) != 536870912) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    boolean zN7 = z214 | z17 | lVarV.n(hVarC);
                    if ((i41 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zN7 | z18;
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    } else {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    }
                    lVarV.l();
                    Function0.f(iVarA3, fValueOf3, (wn0.p) objI3, lVarV, 0);
                    if (hVar.g()) {
                        if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                            lVar3.invoke(Float.valueOf(hVar.getProgress()));
                            p1Var.setValue(Boolean.TRUE);
                        }
                    }
                    tf.i iVarS3 = bVar.s();
                    lVarV.o(-835046250);
                    zN = lVarV.n(bVar);
                    objI4 = lVarV.I();
                    if (!zN) {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    } else {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVar7 = dVar3;
                    lVar4 = lVarV;
                    xf.e.a(iVarS3, (wn0.a) objI4, dVar7, false, false, false, false, null, false, nVarB3, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    long j29 = jC;
                    jVar4 = jVar3;
                    j16 = j29;
                    z21 = z212;
                    j17 = j15;
                    f15 = f14;
                    i45 = i44;
                    lVar5 = lVar3;
                    iVar5 = iVar4;
                    dVar4 = dVar7;
                    kVar2 = kVarE;
                    j18 = j28;
                    z22 = z211;
                    j19 = j27;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= KyberEngine.KyberPolyBytes;
            z13 = z12;
            if ((i12 & 3072) != 0) {
                if ((i14 & 8) == 0) {
                    i49 = 1024;
                } else {
                    i49 = 1024;
                }
                i15 |= i49;
            }
            if ((i12 & 24576) == 0) {
                jA = j12;
                if ((i14 & 16) == 0) {
                    i48 = PKIFailureInfo.certRevoked;
                } else {
                    i48 = PKIFailureInfo.certRevoked;
                }
                i15 |= i48;
            } else {
                jA = j12;
            }
            if ((i12 & 196608) == 0) {
                jA2 = j13;
                if ((i14 & 32) == 0) {
                    i47 = 65536;
                } else {
                    i47 = 65536;
                }
                i15 |= i47;
            } else {
                jA2 = j13;
            }
            if ((i12 & 1572864) == 0) {
                jC = j14;
                if ((i14 & 64) == 0) {
                    i46 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i46 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i46;
            } else {
                jC = j14;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (lVarV.r(i11)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            i21 = i14 & 256;
            if (i21 != 0) {
                if ((i12 & 100663296) == 0) {
                    if (lVarV.q(f11)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 512;
                i24 = 805306368;
                if (i23 == 0) {
                    i15 |= i24;
                } else if ((i12 & 805306368) == 0) {
                    if ((i12 & 1073741824) == 0) {
                        zK = lVarV.n(jVar);
                    } else {
                        zK = lVarV.K(jVar);
                    }
                    if (zK) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i15 |= i24;
                }
                if ((i14 & 1024) != 0) {
                    i25 = i13 | 6;
                    yj2 = lottieSource;
                } else if ((i13 & 6) == 0) {
                    if ((i13 & 8) == 0) {
                        yj2 = lottieSource;
                        zK2 = lVarV.n(yj2);
                    } else {
                        yj2 = lottieSource;
                        zK2 = lVarV.K(yj2);
                    }
                    if (zK2) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i13 | i26;
                } else {
                    yj2 = lottieSource;
                    i25 = i13;
                }
                i27 = i14 & 2048;
                if (i27 != 0) {
                    i25 |= 48;
                } else if ((i13 & 48) != 0) {
                    if (lVarV.n(iVar)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i25 |= i28;
                }
                i29 = i25;
                i31 = i14 & 4096;
                if (i31 != 0) {
                    i32 = i29 | KyberEngine.KyberPolyBytes;
                } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                    i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
                } else {
                    i32 = i29;
                }
                i33 = i14 & PKIFailureInfo.certRevoked;
                if (i33 != 0) {
                    i35 = i32 | 3072;
                } else {
                    i34 = i32;
                    if ((i13 & 3072) != 0) {
                        i34 |= lVarV.n(kVar) ? 2048 : 1024;
                    }
                    i35 = i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    } else {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                    }
                    lVarV.o(-835226457);
                    objI2 = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i41 = i35;
                    if (objI2 == companion.a()) {
                        objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p020r2.p1) objI2;
                    lVarV.l();
                    bVarD = xf.d.d(lVarV, 0);
                    if (yj2 instanceof Yj.a) {
                        String path4 = ((Yj.a) yj2).a().getPath();
                        p013kotlin.jvm.internal.s.j(path4, "getPath(...)");
                        mVarA = xf.m.c.a(xf.m.c.b(path4));
                    } else {
                        if (!(yj2 instanceof Yj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                    }
                    kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                    boolean z215 = z14;
                    boolean z216 = z13;
                    i42 = i39;
                    f13 = f12;
                    jVar3 = jVar2;
                    iVar3 = iVar2;
                    hVarC = xf.a.c(a(kVarR), z215, z216, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                    i43 = i38;
                    Integer num4 = tf.d0.f113272a;
                    long j210 = jA;
                    xf.p pVarC13 = xf.o.c(num4, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                    xf.p pVarC14 = xf.o.c(num4, Integer.valueOf(k3.r1.k(j210)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                    xf.p pVarC15 = xf.o.c(num4, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                    xf.p pVarC16 = xf.o.c(num4, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                    C3825sp c3825sp4 = C3825sp.f35377a;
                    long j211 = jA2;
                    xf.n nVarB4 = xf.o.b(new xf.p[]{pVarC13, pVarC14, pVarC15, pVarC16, xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num4, Integer.valueOf(k3.r1.k(c3825sp4.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                    tf.i iVarA4 = a(kVarR);
                    Float fValueOf4 = Float.valueOf(hVarC.getProgress());
                    lVarV.o(-835066949);
                    boolean zN8 = lVarV.n(bVarD) | lVarV.n(kVarR);
                    if ((i43 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z217 = zN8 | z15;
                    if ((i43 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z218 = z217 | z16;
                    if ((i43 & 1879048192) != 536870912) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    boolean zN9 = z218 | z17 | lVarV.n(hVarC);
                    if ((i41 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zN9 | z18;
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    } else {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    }
                    lVarV.l();
                    Function0.f(iVarA4, fValueOf4, (wn0.p) objI3, lVarV, 0);
                    if (hVar.g()) {
                        if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                            lVar3.invoke(Float.valueOf(hVar.getProgress()));
                            p1Var.setValue(Boolean.TRUE);
                        }
                    }
                    tf.i iVarS4 = bVar.s();
                    lVarV.o(-835046250);
                    zN = lVarV.n(bVar);
                    objI4 = lVarV.I();
                    if (!zN) {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    } else {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVar8 = dVar3;
                    lVar4 = lVarV;
                    xf.e.a(iVarS4, (wn0.a) objI4, dVar8, false, false, false, false, null, false, nVarB4, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    long j212 = jC;
                    jVar4 = jVar3;
                    j16 = j212;
                    z21 = z216;
                    j17 = j15;
                    f15 = f14;
                    i45 = i44;
                    lVar5 = lVar3;
                    iVar5 = iVar4;
                    dVar4 = dVar8;
                    kVar2 = kVarE;
                    j18 = j211;
                    z22 = z215;
                    j19 = j210;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    } else {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                    }
                    lVarV.o(-835226457);
                    objI2 = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i41 = i35;
                    if (objI2 == companion.a()) {
                        objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p020r2.p1) objI2;
                    lVarV.l();
                    bVarD = xf.d.d(lVarV, 0);
                    if (yj2 instanceof Yj.a) {
                        String path5 = ((Yj.a) yj2).a().getPath();
                        p013kotlin.jvm.internal.s.j(path5, "getPath(...)");
                        mVarA = xf.m.c.a(xf.m.c.b(path5));
                    } else {
                        if (!(yj2 instanceof Yj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                    }
                    kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                    boolean z219 = z14;
                    boolean z2110 = z13;
                    i42 = i39;
                    f13 = f12;
                    jVar3 = jVar2;
                    iVar3 = iVar2;
                    hVarC = xf.a.c(a(kVarR), z219, z2110, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                    i43 = i38;
                    Integer num5 = tf.d0.f113272a;
                    long j213 = jA;
                    xf.p pVarC17 = xf.o.c(num5, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                    xf.p pVarC18 = xf.o.c(num5, Integer.valueOf(k3.r1.k(j213)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                    xf.p pVarC19 = xf.o.c(num5, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                    xf.p pVarC110 = xf.o.c(num5, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                    C3825sp c3825sp5 = C3825sp.f35377a;
                    long j214 = jA2;
                    xf.n nVarB5 = xf.o.b(new xf.p[]{pVarC17, pVarC18, pVarC19, pVarC110, xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num5, Integer.valueOf(k3.r1.k(c3825sp5.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                    tf.i iVarA5 = a(kVarR);
                    Float fValueOf5 = Float.valueOf(hVarC.getProgress());
                    lVarV.o(-835066949);
                    boolean zN10 = lVarV.n(bVarD) | lVarV.n(kVarR);
                    if ((i43 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z2111 = zN10 | z15;
                    if ((i43 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z2112 = z2111 | z16;
                    if ((i43 & 1879048192) != 536870912) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    boolean zN11 = z2112 | z17 | lVarV.n(hVarC);
                    if ((i41 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zN11 | z18;
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    } else {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    }
                    lVarV.l();
                    Function0.f(iVarA5, fValueOf5, (wn0.p) objI3, lVarV, 0);
                    if (hVar.g()) {
                        if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                            lVar3.invoke(Float.valueOf(hVar.getProgress()));
                            p1Var.setValue(Boolean.TRUE);
                        }
                    }
                    tf.i iVarS5 = bVar.s();
                    lVarV.o(-835046250);
                    zN = lVarV.n(bVar);
                    objI4 = lVarV.I();
                    if (!zN) {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    } else {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVar9 = dVar3;
                    lVar4 = lVarV;
                    xf.e.a(iVarS5, (wn0.a) objI4, dVar9, false, false, false, false, null, false, nVarB5, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    long j215 = jC;
                    jVar4 = jVar3;
                    j16 = j215;
                    z21 = z2110;
                    j17 = j15;
                    f15 = f14;
                    i45 = i44;
                    lVar5 = lVar3;
                    iVar5 = iVar4;
                    dVar4 = dVar9;
                    kVar2 = kVarE;
                    j18 = j214;
                    z22 = z219;
                    j19 = j213;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 100663296;
            i23 = i14 & 512;
            i24 = 805306368;
            if (i23 == 0) {
                i15 |= i24;
            } else if ((i12 & 805306368) == 0) {
                if ((i12 & 1073741824) == 0) {
                    zK = lVarV.n(jVar);
                } else {
                    zK = lVarV.K(jVar);
                }
                if (zK) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i15 |= i24;
            }
            if ((i14 & 1024) != 0) {
                i25 = i13 | 6;
                yj2 = lottieSource;
            } else if ((i13 & 6) == 0) {
                if ((i13 & 8) == 0) {
                    yj2 = lottieSource;
                    zK2 = lVarV.n(yj2);
                } else {
                    yj2 = lottieSource;
                    zK2 = lVarV.K(yj2);
                }
                if (zK2) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i13 | i26;
            } else {
                yj2 = lottieSource;
                i25 = i13;
            }
            i27 = i14 & 2048;
            if (i27 != 0) {
                i25 |= 48;
            } else if ((i13 & 48) != 0) {
                if (lVarV.n(iVar)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i25 |= i28;
            }
            i29 = i25;
            i31 = i14 & 4096;
            if (i31 != 0) {
                i32 = i29 | KyberEngine.KyberPolyBytes;
            } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
            } else {
                i32 = i29;
            }
            i33 = i14 & PKIFailureInfo.certRevoked;
            if (i33 != 0) {
                i35 = i32 | 3072;
            } else {
                i34 = i32;
                if ((i13 & 3072) != 0) {
                    i34 |= lVarV.n(kVar) ? 2048 : 1024;
                }
                i35 = i34;
            }
            if ((i15 & 306783379) != 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                } else {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                }
                lVarV.o(-835226457);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i41 = i35;
                if (objI2 == companion.a()) {
                    objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p020r2.p1) objI2;
                lVarV.l();
                bVarD = xf.d.d(lVarV, 0);
                if (yj2 instanceof Yj.a) {
                    String path6 = ((Yj.a) yj2).a().getPath();
                    p013kotlin.jvm.internal.s.j(path6, "getPath(...)");
                    mVarA = xf.m.c.a(xf.m.c.b(path6));
                } else {
                    if (!(yj2 instanceof Yj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                }
                kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                boolean z2113 = z14;
                boolean z2114 = z13;
                i42 = i39;
                f13 = f12;
                jVar3 = jVar2;
                iVar3 = iVar2;
                hVarC = xf.a.c(a(kVarR), z2113, z2114, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                i43 = i38;
                Integer num6 = tf.d0.f113272a;
                long j216 = jA;
                xf.p pVarC111 = xf.o.c(num6, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                xf.p pVarC112 = xf.o.c(num6, Integer.valueOf(k3.r1.k(j216)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                xf.p pVarC113 = xf.o.c(num6, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                xf.p pVarC114 = xf.o.c(num6, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                C3825sp c3825sp6 = C3825sp.f35377a;
                long j217 = jA2;
                xf.n nVarB6 = xf.o.b(new xf.p[]{pVarC111, pVarC112, pVarC113, pVarC114, xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num6, Integer.valueOf(k3.r1.k(c3825sp6.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                tf.i iVarA6 = a(kVarR);
                Float fValueOf6 = Float.valueOf(hVarC.getProgress());
                lVarV.o(-835066949);
                boolean zN12 = lVarV.n(bVarD) | lVarV.n(kVarR);
                if ((i43 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z2115 = zN12 | z15;
                if ((i43 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2116 = z2115 | z16;
                if ((i43 & 1879048192) != 536870912) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean zN13 = z2116 | z17 | lVarV.n(hVarC);
                if ((i41 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zN13 | z18;
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                } else {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                }
                lVarV.l();
                Function0.f(iVarA6, fValueOf6, (wn0.p) objI3, lVarV, 0);
                if (hVar.g()) {
                    if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                        lVar3.invoke(Float.valueOf(hVar.getProgress()));
                        p1Var.setValue(Boolean.TRUE);
                    }
                }
                tf.i iVarS6 = bVar.s();
                lVarV.o(-835046250);
                zN = lVarV.n(bVar);
                objI4 = lVarV.I();
                if (!zN) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                } else {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                }
                lVarV.l();
                androidx.compose.ui.d dVar10 = dVar3;
                lVar4 = lVarV;
                xf.e.a(iVarS6, (wn0.a) objI4, dVar10, false, false, false, false, null, false, nVarB6, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                long j218 = jC;
                jVar4 = jVar3;
                j16 = j218;
                z21 = z2114;
                j17 = j15;
                f15 = f14;
                i45 = i44;
                lVar5 = lVar3;
                iVar5 = iVar4;
                dVar4 = dVar10;
                kVar2 = kVarE;
                j18 = j217;
                z22 = z2113;
                j19 = j216;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                } else {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                }
                lVarV.o(-835226457);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i41 = i35;
                if (objI2 == companion.a()) {
                    objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p020r2.p1) objI2;
                lVarV.l();
                bVarD = xf.d.d(lVarV, 0);
                if (yj2 instanceof Yj.a) {
                    String path7 = ((Yj.a) yj2).a().getPath();
                    p013kotlin.jvm.internal.s.j(path7, "getPath(...)");
                    mVarA = xf.m.c.a(xf.m.c.b(path7));
                } else {
                    if (!(yj2 instanceof Yj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                }
                kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                boolean z2117 = z14;
                boolean z2118 = z13;
                i42 = i39;
                f13 = f12;
                jVar3 = jVar2;
                iVar3 = iVar2;
                hVarC = xf.a.c(a(kVarR), z2117, z2118, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                i43 = i38;
                Integer num7 = tf.d0.f113272a;
                long j219 = jA;
                xf.p pVarC115 = xf.o.c(num7, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                xf.p pVarC116 = xf.o.c(num7, Integer.valueOf(k3.r1.k(j219)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                xf.p pVarC117 = xf.o.c(num7, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                xf.p pVarC118 = xf.o.c(num7, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                C3825sp c3825sp7 = C3825sp.f35377a;
                long j2110 = jA2;
                xf.n nVarB7 = xf.o.b(new xf.p[]{pVarC115, pVarC116, pVarC117, pVarC118, xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num7, Integer.valueOf(k3.r1.k(c3825sp7.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                tf.i iVarA7 = a(kVarR);
                Float fValueOf7 = Float.valueOf(hVarC.getProgress());
                lVarV.o(-835066949);
                boolean zN14 = lVarV.n(bVarD) | lVarV.n(kVarR);
                if ((i43 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z2119 = zN14 | z15;
                if ((i43 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z21110 = z2119 | z16;
                if ((i43 & 1879048192) != 536870912) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean zN15 = z21110 | z17 | lVarV.n(hVarC);
                if ((i41 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zN15 | z18;
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                } else {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                }
                lVarV.l();
                Function0.f(iVarA7, fValueOf7, (wn0.p) objI3, lVarV, 0);
                if (hVar.g()) {
                    if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                        lVar3.invoke(Float.valueOf(hVar.getProgress()));
                        p1Var.setValue(Boolean.TRUE);
                    }
                }
                tf.i iVarS7 = bVar.s();
                lVarV.o(-835046250);
                zN = lVarV.n(bVar);
                objI4 = lVarV.I();
                if (!zN) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                } else {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                }
                lVarV.l();
                androidx.compose.ui.d dVar11 = dVar3;
                lVar4 = lVarV;
                xf.e.a(iVarS7, (wn0.a) objI4, dVar11, false, false, false, false, null, false, nVarB7, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                long j2111 = jC;
                jVar4 = jVar3;
                j16 = j2111;
                z21 = z2118;
                j17 = j15;
                f15 = f14;
                i45 = i44;
                lVar5 = lVar3;
                iVar5 = iVar4;
                dVar4 = dVar11;
                kVar2 = kVarE;
                j18 = j2110;
                z22 = z2117;
                j19 = j219;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
                z13 = z12;
                if (lVarV.p(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i12 & 3072) != 0) {
                if ((i14 & 8) == 0) {
                    i49 = 1024;
                } else {
                    i49 = 1024;
                }
                i15 |= i49;
            }
            if ((i12 & 24576) == 0) {
                jA = j12;
                if ((i14 & 16) == 0) {
                    i48 = PKIFailureInfo.certRevoked;
                } else {
                    i48 = PKIFailureInfo.certRevoked;
                }
                i15 |= i48;
            } else {
                jA = j12;
            }
            if ((i12 & 196608) == 0) {
                jA2 = j13;
                if ((i14 & 32) == 0) {
                    i47 = 65536;
                } else {
                    i47 = 65536;
                }
                i15 |= i47;
            } else {
                jA2 = j13;
            }
            if ((i12 & 1572864) == 0) {
                jC = j14;
                if ((i14 & 64) == 0) {
                    i46 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i46 = PKIFailureInfo.signerNotTrusted;
                }
                i15 |= i46;
            } else {
                jC = j14;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (lVarV.r(i11)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            i21 = i14 & 256;
            if (i21 != 0) {
                if ((i12 & 100663296) == 0) {
                    if (lVarV.q(f11)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 512;
                i24 = 805306368;
                if (i23 == 0) {
                    i15 |= i24;
                } else if ((i12 & 805306368) == 0) {
                    if ((i12 & 1073741824) == 0) {
                        zK = lVarV.n(jVar);
                    } else {
                        zK = lVarV.K(jVar);
                    }
                    if (zK) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i15 |= i24;
                }
                if ((i14 & 1024) != 0) {
                    i25 = i13 | 6;
                    yj2 = lottieSource;
                } else if ((i13 & 6) == 0) {
                    if ((i13 & 8) == 0) {
                        yj2 = lottieSource;
                        zK2 = lVarV.n(yj2);
                    } else {
                        yj2 = lottieSource;
                        zK2 = lVarV.K(yj2);
                    }
                    if (zK2) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i13 | i26;
                } else {
                    yj2 = lottieSource;
                    i25 = i13;
                }
                i27 = i14 & 2048;
                if (i27 != 0) {
                    i25 |= 48;
                } else if ((i13 & 48) != 0) {
                    if (lVarV.n(iVar)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i25 |= i28;
                }
                i29 = i25;
                i31 = i14 & 4096;
                if (i31 != 0) {
                    i32 = i29 | KyberEngine.KyberPolyBytes;
                } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                    i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
                } else {
                    i32 = i29;
                }
                i33 = i14 & PKIFailureInfo.certRevoked;
                if (i33 != 0) {
                    i35 = i32 | 3072;
                } else {
                    i34 = i32;
                    if ((i13 & 3072) != 0) {
                        i34 |= lVarV.n(kVar) ? 2048 : 1024;
                    }
                    i35 = i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    } else {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                    }
                    lVarV.o(-835226457);
                    objI2 = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i41 = i35;
                    if (objI2 == companion.a()) {
                        objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p020r2.p1) objI2;
                    lVarV.l();
                    bVarD = xf.d.d(lVarV, 0);
                    if (yj2 instanceof Yj.a) {
                        String path8 = ((Yj.a) yj2).a().getPath();
                        p013kotlin.jvm.internal.s.j(path8, "getPath(...)");
                        mVarA = xf.m.c.a(xf.m.c.b(path8));
                    } else {
                        if (!(yj2 instanceof Yj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                    }
                    kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                    boolean z21111 = z14;
                    boolean z21112 = z13;
                    i42 = i39;
                    f13 = f12;
                    jVar3 = jVar2;
                    iVar3 = iVar2;
                    hVarC = xf.a.c(a(kVarR), z21111, z21112, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                    i43 = i38;
                    Integer num8 = tf.d0.f113272a;
                    long j2112 = jA;
                    xf.p pVarC119 = xf.o.c(num8, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                    xf.p pVarC1110 = xf.o.c(num8, Integer.valueOf(k3.r1.k(j2112)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                    xf.p pVarC1111 = xf.o.c(num8, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                    xf.p pVarC1112 = xf.o.c(num8, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                    C3825sp c3825sp8 = C3825sp.f35377a;
                    long j2113 = jA2;
                    xf.n nVarB8 = xf.o.b(new xf.p[]{pVarC119, pVarC1110, pVarC1111, pVarC1112, xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num8, Integer.valueOf(k3.r1.k(c3825sp8.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                    tf.i iVarA8 = a(kVarR);
                    Float fValueOf8 = Float.valueOf(hVarC.getProgress());
                    lVarV.o(-835066949);
                    boolean zN16 = lVarV.n(bVarD) | lVarV.n(kVarR);
                    if ((i43 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z21113 = zN16 | z15;
                    if ((i43 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z21114 = z21113 | z16;
                    if ((i43 & 1879048192) != 536870912) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    boolean zN17 = z21114 | z17 | lVarV.n(hVarC);
                    if ((i41 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zN17 | z18;
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    } else {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    }
                    lVarV.l();
                    Function0.f(iVarA8, fValueOf8, (wn0.p) objI3, lVarV, 0);
                    if (hVar.g()) {
                        if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                            lVar3.invoke(Float.valueOf(hVar.getProgress()));
                            p1Var.setValue(Boolean.TRUE);
                        }
                    }
                    tf.i iVarS8 = bVar.s();
                    lVarV.o(-835046250);
                    zN = lVarV.n(bVar);
                    objI4 = lVarV.I();
                    if (!zN) {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    } else {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVar12 = dVar3;
                    lVar4 = lVarV;
                    xf.e.a(iVarS8, (wn0.a) objI4, dVar12, false, false, false, false, null, false, nVarB8, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    long j2114 = jC;
                    jVar4 = jVar3;
                    j16 = j2114;
                    z21 = z21112;
                    j17 = j15;
                    f15 = f14;
                    i45 = i44;
                    lVar5 = lVar3;
                    iVar5 = iVar4;
                    dVar4 = dVar12;
                    kVar2 = kVarE;
                    j18 = j2113;
                    z22 = z21111;
                    j19 = j2112;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    } else {
                        if (i51 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i52 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 8) != 0) {
                            jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                            i15 &= -7169;
                        } else {
                            jA3 = j11;
                        }
                        if ((i14 & 16) != 0) {
                            i36 = 6;
                            jA = C3825sp.f35377a.d(lVarV, 6).a();
                            i15 &= -57345;
                        } else {
                            i36 = 6;
                        }
                        if ((i14 & 32) != 0) {
                            jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                            i15 &= -458753;
                        }
                        if ((i14 & 64) != 0) {
                            jC = C3825sp.f35377a.d(lVarV, 6).c();
                            i15 = (-3670017) & i15;
                        }
                        if (i18 != 0) {
                            i37 = 1;
                        } else {
                            i37 = i11;
                        }
                        if (i21 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f11;
                        }
                        if (i23 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i27 != 0) {
                            iVar2 = xf.i.Immediately;
                        } else {
                            iVar2 = iVar;
                        }
                        dVar3 = dVar2;
                        if (i31 != 0) {
                            lVarV.o(-835229593);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return TA.a(((Float) obj).floatValue());
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVar3 = (wn0.l) objI;
                            lVarV.l();
                        } else {
                            lVar3 = lVar;
                        }
                        if (i33 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        } else {
                            kVarE = kVar;
                        }
                        i38 = i15;
                        j15 = jA3;
                        i39 = i37;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                    }
                    lVarV.o(-835226457);
                    objI2 = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    i41 = i35;
                    if (objI2 == companion.a()) {
                        objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p020r2.p1) objI2;
                    lVarV.l();
                    bVarD = xf.d.d(lVarV, 0);
                    if (yj2 instanceof Yj.a) {
                        String path9 = ((Yj.a) yj2).a().getPath();
                        p013kotlin.jvm.internal.s.j(path9, "getPath(...)");
                        mVarA = xf.m.c.a(xf.m.c.b(path9));
                    } else {
                        if (!(yj2 instanceof Yj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                    }
                    kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                    boolean z21115 = z14;
                    boolean z21116 = z13;
                    i42 = i39;
                    f13 = f12;
                    jVar3 = jVar2;
                    iVar3 = iVar2;
                    hVarC = xf.a.c(a(kVarR), z21115, z21116, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                    i43 = i38;
                    Integer num9 = tf.d0.f113272a;
                    long j2115 = jA;
                    xf.p pVarC1113 = xf.o.c(num9, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                    xf.p pVarC1114 = xf.o.c(num9, Integer.valueOf(k3.r1.k(j2115)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                    xf.p pVarC1115 = xf.o.c(num9, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                    xf.p pVarC1116 = xf.o.c(num9, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                    C3825sp c3825sp9 = C3825sp.f35377a;
                    long j2116 = jA2;
                    xf.n nVarB9 = xf.o.b(new xf.p[]{pVarC1113, pVarC1114, pVarC1115, pVarC1116, xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num9, Integer.valueOf(k3.r1.k(c3825sp9.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                    tf.i iVarA9 = a(kVarR);
                    Float fValueOf9 = Float.valueOf(hVarC.getProgress());
                    lVarV.o(-835066949);
                    boolean zN18 = lVarV.n(bVarD) | lVarV.n(kVarR);
                    if ((i43 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z21117 = zN18 | z15;
                    if ((i43 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z21118 = z21117 | z16;
                    if ((i43 & 1879048192) != 536870912) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    boolean zN19 = z21118 | z17 | lVarV.n(hVarC);
                    if ((i41 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zN19 | z18;
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    } else {
                        objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                        bVar = bVarD;
                        i44 = i42;
                        f14 = f13;
                        hVar = hVarC;
                        iVar4 = iVar3;
                        lVarV.B(objI3);
                    }
                    lVarV.l();
                    Function0.f(iVarA9, fValueOf9, (wn0.p) objI3, lVarV, 0);
                    if (hVar.g()) {
                        if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                            lVar3.invoke(Float.valueOf(hVar.getProgress()));
                            p1Var.setValue(Boolean.TRUE);
                        }
                    }
                    tf.i iVarS9 = bVar.s();
                    lVarV.o(-835046250);
                    zN = lVarV.n(bVar);
                    objI4 = lVarV.I();
                    if (!zN) {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    } else {
                        objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                            @Override // wn0.a
                            public final Object invoke() {
                                return Float.valueOf(TA.a(bVar));
                            }
                        };
                        lVarV.B(objI4);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVar13 = dVar3;
                    lVar4 = lVarV;
                    xf.e.a(iVarS9, (wn0.a) objI4, dVar13, false, false, false, false, null, false, nVarB9, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    long j2117 = jC;
                    jVar4 = jVar3;
                    j16 = j2117;
                    z21 = z21116;
                    j17 = j15;
                    f15 = f14;
                    i45 = i44;
                    lVar5 = lVar3;
                    iVar5 = iVar4;
                    dVar4 = dVar13;
                    kVar2 = kVarE;
                    j18 = j2116;
                    z22 = z21115;
                    j19 = j2115;
                }
                w2VarX = lVar4.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 100663296;
            i23 = i14 & 512;
            i24 = 805306368;
            if (i23 == 0) {
                i15 |= i24;
            } else if ((i12 & 805306368) == 0) {
                if ((i12 & 1073741824) == 0) {
                    zK = lVarV.n(jVar);
                } else {
                    zK = lVarV.K(jVar);
                }
                if (zK) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i15 |= i24;
            }
            if ((i14 & 1024) != 0) {
                i25 = i13 | 6;
                yj2 = lottieSource;
            } else if ((i13 & 6) == 0) {
                if ((i13 & 8) == 0) {
                    yj2 = lottieSource;
                    zK2 = lVarV.n(yj2);
                } else {
                    yj2 = lottieSource;
                    zK2 = lVarV.K(yj2);
                }
                if (zK2) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i13 | i26;
            } else {
                yj2 = lottieSource;
                i25 = i13;
            }
            i27 = i14 & 2048;
            if (i27 != 0) {
                i25 |= 48;
            } else if ((i13 & 48) != 0) {
                if (lVarV.n(iVar)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i25 |= i28;
            }
            i29 = i25;
            i31 = i14 & 4096;
            if (i31 != 0) {
                i32 = i29 | KyberEngine.KyberPolyBytes;
            } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
            } else {
                i32 = i29;
            }
            i33 = i14 & PKIFailureInfo.certRevoked;
            if (i33 != 0) {
                i35 = i32 | 3072;
            } else {
                i34 = i32;
                if ((i13 & 3072) != 0) {
                    i34 |= lVarV.n(kVar) ? 2048 : 1024;
                }
                i35 = i34;
            }
            if ((i15 & 306783379) != 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                } else {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                }
                lVarV.o(-835226457);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i41 = i35;
                if (objI2 == companion.a()) {
                    objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p020r2.p1) objI2;
                lVarV.l();
                bVarD = xf.d.d(lVarV, 0);
                if (yj2 instanceof Yj.a) {
                    String path10 = ((Yj.a) yj2).a().getPath();
                    p013kotlin.jvm.internal.s.j(path10, "getPath(...)");
                    mVarA = xf.m.c.a(xf.m.c.b(path10));
                } else {
                    if (!(yj2 instanceof Yj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                }
                kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                boolean z21119 = z14;
                boolean z211110 = z13;
                i42 = i39;
                f13 = f12;
                jVar3 = jVar2;
                iVar3 = iVar2;
                hVarC = xf.a.c(a(kVarR), z21119, z211110, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                i43 = i38;
                Integer num10 = tf.d0.f113272a;
                long j2118 = jA;
                xf.p pVarC1117 = xf.o.c(num10, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                xf.p pVarC1118 = xf.o.c(num10, Integer.valueOf(k3.r1.k(j2118)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                xf.p pVarC1119 = xf.o.c(num10, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                xf.p pVarC11110 = xf.o.c(num10, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                C3825sp c3825sp10 = C3825sp.f35377a;
                long j2119 = jA2;
                xf.n nVarB10 = xf.o.b(new xf.p[]{pVarC1117, pVarC1118, pVarC1119, pVarC11110, xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num10, Integer.valueOf(k3.r1.k(c3825sp10.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                tf.i iVarA10 = a(kVarR);
                Float fValueOf10 = Float.valueOf(hVarC.getProgress());
                lVarV.o(-835066949);
                boolean zN110 = lVarV.n(bVarD) | lVarV.n(kVarR);
                if ((i43 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z211111 = zN110 | z15;
                if ((i43 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z211112 = z211111 | z16;
                if ((i43 & 1879048192) != 536870912) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean zN111 = z211112 | z17 | lVarV.n(hVarC);
                if ((i41 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zN111 | z18;
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                } else {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                }
                lVarV.l();
                Function0.f(iVarA10, fValueOf10, (wn0.p) objI3, lVarV, 0);
                if (hVar.g()) {
                    if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                        lVar3.invoke(Float.valueOf(hVar.getProgress()));
                        p1Var.setValue(Boolean.TRUE);
                    }
                }
                tf.i iVarS10 = bVar.s();
                lVarV.o(-835046250);
                zN = lVarV.n(bVar);
                objI4 = lVarV.I();
                if (!zN) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                } else {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                }
                lVarV.l();
                androidx.compose.ui.d dVar14 = dVar3;
                lVar4 = lVarV;
                xf.e.a(iVarS10, (wn0.a) objI4, dVar14, false, false, false, false, null, false, nVarB10, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                long j21110 = jC;
                jVar4 = jVar3;
                j16 = j21110;
                z21 = z211110;
                j17 = j15;
                f15 = f14;
                i45 = i44;
                lVar5 = lVar3;
                iVar5 = iVar4;
                dVar4 = dVar14;
                kVar2 = kVarE;
                j18 = j2119;
                z22 = z21119;
                j19 = j2118;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                } else {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                }
                lVarV.o(-835226457);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i41 = i35;
                if (objI2 == companion.a()) {
                    objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p020r2.p1) objI2;
                lVarV.l();
                bVarD = xf.d.d(lVarV, 0);
                if (yj2 instanceof Yj.a) {
                    String path11 = ((Yj.a) yj2).a().getPath();
                    p013kotlin.jvm.internal.s.j(path11, "getPath(...)");
                    mVarA = xf.m.c.a(xf.m.c.b(path11));
                } else {
                    if (!(yj2 instanceof Yj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                }
                kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                boolean z211113 = z14;
                boolean z211114 = z13;
                i42 = i39;
                f13 = f12;
                jVar3 = jVar2;
                iVar3 = iVar2;
                hVarC = xf.a.c(a(kVarR), z211113, z211114, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                i43 = i38;
                Integer num11 = tf.d0.f113272a;
                long j21111 = jA;
                xf.p pVarC11111 = xf.o.c(num11, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                xf.p pVarC11112 = xf.o.c(num11, Integer.valueOf(k3.r1.k(j21111)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                xf.p pVarC11113 = xf.o.c(num11, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                xf.p pVarC11114 = xf.o.c(num11, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                C3825sp c3825sp11 = C3825sp.f35377a;
                long j21112 = jA2;
                xf.n nVarB11 = xf.o.b(new xf.p[]{pVarC11111, pVarC11112, pVarC11113, pVarC11114, xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num11, Integer.valueOf(k3.r1.k(c3825sp11.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                tf.i iVarA11 = a(kVarR);
                Float fValueOf11 = Float.valueOf(hVarC.getProgress());
                lVarV.o(-835066949);
                boolean zN112 = lVarV.n(bVarD) | lVarV.n(kVarR);
                if ((i43 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z211115 = zN112 | z15;
                if ((i43 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z211116 = z211115 | z16;
                if ((i43 & 1879048192) != 536870912) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean zN113 = z211116 | z17 | lVarV.n(hVarC);
                if ((i41 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zN113 | z18;
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                } else {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                }
                lVarV.l();
                Function0.f(iVarA11, fValueOf11, (wn0.p) objI3, lVarV, 0);
                if (hVar.g()) {
                    if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                        lVar3.invoke(Float.valueOf(hVar.getProgress()));
                        p1Var.setValue(Boolean.TRUE);
                    }
                }
                tf.i iVarS11 = bVar.s();
                lVarV.o(-835046250);
                zN = lVarV.n(bVar);
                objI4 = lVarV.I();
                if (!zN) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                } else {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                }
                lVarV.l();
                androidx.compose.ui.d dVar15 = dVar3;
                lVar4 = lVarV;
                xf.e.a(iVarS11, (wn0.a) objI4, dVar15, false, false, false, false, null, false, nVarB11, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                long j21113 = jC;
                jVar4 = jVar3;
                j16 = j21113;
                z21 = z211114;
                j17 = j15;
                f15 = f14;
                i45 = i44;
                lVar5 = lVar3;
                iVar5 = iVar4;
                dVar4 = dVar15;
                kVar2 = kVarE;
                j18 = j21112;
                z22 = z211113;
                j19 = j21111;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= KyberEngine.KyberPolyBytes;
        z13 = z12;
        if ((i12 & 3072) != 0) {
            if ((i14 & 8) == 0) {
                i49 = 1024;
            } else {
                i49 = 1024;
            }
            i15 |= i49;
        }
        if ((i12 & 24576) == 0) {
            jA = j12;
            if ((i14 & 16) == 0) {
                i48 = PKIFailureInfo.certRevoked;
            } else {
                i48 = PKIFailureInfo.certRevoked;
            }
            i15 |= i48;
        } else {
            jA = j12;
        }
        if ((i12 & 196608) == 0) {
            jA2 = j13;
            if ((i14 & 32) == 0) {
                i47 = 65536;
            } else {
                i47 = 65536;
            }
            i15 |= i47;
        } else {
            jA2 = j13;
        }
        if ((i12 & 1572864) == 0) {
            jC = j14;
            if ((i14 & 64) == 0) {
                i46 = PKIFailureInfo.signerNotTrusted;
            } else {
                i46 = PKIFailureInfo.signerNotTrusted;
            }
            i15 |= i46;
        } else {
            jC = j14;
        }
        i18 = i14 & 128;
        if (i18 != 0) {
            i15 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (lVarV.r(i11)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i15 |= i19;
        }
        i21 = i14 & 256;
        if (i21 != 0) {
            if ((i12 & 100663296) == 0) {
                if (lVarV.q(f11)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i15 |= i22;
            }
            i23 = i14 & 512;
            i24 = 805306368;
            if (i23 == 0) {
                i15 |= i24;
            } else if ((i12 & 805306368) == 0) {
                if ((i12 & 1073741824) == 0) {
                    zK = lVarV.n(jVar);
                } else {
                    zK = lVarV.K(jVar);
                }
                if (zK) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i15 |= i24;
            }
            if ((i14 & 1024) != 0) {
                i25 = i13 | 6;
                yj2 = lottieSource;
            } else if ((i13 & 6) == 0) {
                if ((i13 & 8) == 0) {
                    yj2 = lottieSource;
                    zK2 = lVarV.n(yj2);
                } else {
                    yj2 = lottieSource;
                    zK2 = lVarV.K(yj2);
                }
                if (zK2) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i13 | i26;
            } else {
                yj2 = lottieSource;
                i25 = i13;
            }
            i27 = i14 & 2048;
            if (i27 != 0) {
                i25 |= 48;
            } else if ((i13 & 48) != 0) {
                if (lVarV.n(iVar)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i25 |= i28;
            }
            i29 = i25;
            i31 = i14 & 4096;
            if (i31 != 0) {
                i32 = i29 | KyberEngine.KyberPolyBytes;
            } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
            } else {
                i32 = i29;
            }
            i33 = i14 & PKIFailureInfo.certRevoked;
            if (i33 != 0) {
                i35 = i32 | 3072;
            } else {
                i34 = i32;
                if ((i13 & 3072) != 0) {
                    i34 |= lVarV.n(kVar) ? 2048 : 1024;
                }
                i35 = i34;
            }
            if ((i15 & 306783379) != 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                } else {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                }
                lVarV.o(-835226457);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i41 = i35;
                if (objI2 == companion.a()) {
                    objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p020r2.p1) objI2;
                lVarV.l();
                bVarD = xf.d.d(lVarV, 0);
                if (yj2 instanceof Yj.a) {
                    String path12 = ((Yj.a) yj2).a().getPath();
                    p013kotlin.jvm.internal.s.j(path12, "getPath(...)");
                    mVarA = xf.m.c.a(xf.m.c.b(path12));
                } else {
                    if (!(yj2 instanceof Yj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                }
                kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                boolean z211117 = z14;
                boolean z211118 = z13;
                i42 = i39;
                f13 = f12;
                jVar3 = jVar2;
                iVar3 = iVar2;
                hVarC = xf.a.c(a(kVarR), z211117, z211118, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                i43 = i38;
                Integer num12 = tf.d0.f113272a;
                long j21114 = jA;
                xf.p pVarC11115 = xf.o.c(num12, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                xf.p pVarC11116 = xf.o.c(num12, Integer.valueOf(k3.r1.k(j21114)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                xf.p pVarC11117 = xf.o.c(num12, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                xf.p pVarC11118 = xf.o.c(num12, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                C3825sp c3825sp12 = C3825sp.f35377a;
                long j21115 = jA2;
                xf.n nVarB12 = xf.o.b(new xf.p[]{pVarC11115, pVarC11116, pVarC11117, pVarC11118, xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num12, Integer.valueOf(k3.r1.k(c3825sp12.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                tf.i iVarA12 = a(kVarR);
                Float fValueOf12 = Float.valueOf(hVarC.getProgress());
                lVarV.o(-835066949);
                boolean zN114 = lVarV.n(bVarD) | lVarV.n(kVarR);
                if ((i43 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z211119 = zN114 | z15;
                if ((i43 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2111110 = z211119 | z16;
                if ((i43 & 1879048192) != 536870912) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean zN115 = z2111110 | z17 | lVarV.n(hVarC);
                if ((i41 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zN115 | z18;
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                } else {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                }
                lVarV.l();
                Function0.f(iVarA12, fValueOf12, (wn0.p) objI3, lVarV, 0);
                if (hVar.g()) {
                    if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                        lVar3.invoke(Float.valueOf(hVar.getProgress()));
                        p1Var.setValue(Boolean.TRUE);
                    }
                }
                tf.i iVarS12 = bVar.s();
                lVarV.o(-835046250);
                zN = lVarV.n(bVar);
                objI4 = lVarV.I();
                if (!zN) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                } else {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                }
                lVarV.l();
                androidx.compose.ui.d dVar16 = dVar3;
                lVar4 = lVarV;
                xf.e.a(iVarS12, (wn0.a) objI4, dVar16, false, false, false, false, null, false, nVarB12, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                long j21116 = jC;
                jVar4 = jVar3;
                j16 = j21116;
                z21 = z211118;
                j17 = j15;
                f15 = f14;
                i45 = i44;
                lVar5 = lVar3;
                iVar5 = iVar4;
                dVar4 = dVar16;
                kVar2 = kVarE;
                j18 = j21115;
                z22 = z211117;
                j19 = j21114;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                } else {
                    if (i51 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i52 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 8) != 0) {
                        jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                        i15 &= -7169;
                    } else {
                        jA3 = j11;
                    }
                    if ((i14 & 16) != 0) {
                        i36 = 6;
                        jA = C3825sp.f35377a.d(lVarV, 6).a();
                        i15 &= -57345;
                    } else {
                        i36 = 6;
                    }
                    if ((i14 & 32) != 0) {
                        jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                        i15 &= -458753;
                    }
                    if ((i14 & 64) != 0) {
                        jC = C3825sp.f35377a.d(lVarV, 6).c();
                        i15 = (-3670017) & i15;
                    }
                    if (i18 != 0) {
                        i37 = 1;
                    } else {
                        i37 = i11;
                    }
                    if (i21 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f11;
                    }
                    if (i23 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i27 != 0) {
                        iVar2 = xf.i.Immediately;
                    } else {
                        iVar2 = iVar;
                    }
                    dVar3 = dVar2;
                    if (i31 != 0) {
                        lVarV.o(-835229593);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return TA.a(((Float) obj).floatValue());
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVar3 = (wn0.l) objI;
                        lVarV.l();
                    } else {
                        lVar3 = lVar;
                    }
                    if (i33 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    } else {
                        kVarE = kVar;
                    }
                    i38 = i15;
                    j15 = jA3;
                    i39 = i37;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
                }
                lVarV.o(-835226457);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                i41 = i35;
                if (objI2 == companion.a()) {
                    objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p020r2.p1) objI2;
                lVarV.l();
                bVarD = xf.d.d(lVarV, 0);
                if (yj2 instanceof Yj.a) {
                    String path13 = ((Yj.a) yj2).a().getPath();
                    p013kotlin.jvm.internal.s.j(path13, "getPath(...)");
                    mVarA = xf.m.c.a(xf.m.c.b(path13));
                } else {
                    if (!(yj2 instanceof Yj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
                }
                kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
                boolean z2111111 = z14;
                boolean z2111112 = z13;
                i42 = i39;
                f13 = f12;
                jVar3 = jVar2;
                iVar3 = iVar2;
                hVarC = xf.a.c(a(kVarR), z2111111, z2111112, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
                i43 = i38;
                Integer num13 = tf.d0.f113272a;
                long j21117 = jA;
                xf.p pVarC11119 = xf.o.c(num13, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
                xf.p pVarC111110 = xf.o.c(num13, Integer.valueOf(k3.r1.k(j21117)), new String[]{"**", "secondary", "**"}, lVarV, 6);
                xf.p pVarC111111 = xf.o.c(num13, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
                xf.p pVarC111112 = xf.o.c(num13, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
                C3825sp c3825sp13 = C3825sp.f35377a;
                long j21118 = jA2;
                xf.n nVarB13 = xf.o.b(new xf.p[]{pVarC11119, pVarC111110, pVarC111111, pVarC111112, xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num13, Integer.valueOf(k3.r1.k(c3825sp13.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
                tf.i iVarA13 = a(kVarR);
                Float fValueOf13 = Float.valueOf(hVarC.getProgress());
                lVarV.o(-835066949);
                boolean zN116 = lVarV.n(bVarD) | lVarV.n(kVarR);
                if ((i43 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z2111113 = zN116 | z15;
                if ((i43 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2111114 = z2111113 | z16;
                if ((i43 & 1879048192) != 536870912) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean zN117 = z2111114 | z17 | lVarV.n(hVarC);
                if ((i41 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zN117 | z18;
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                } else {
                    objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                    bVar = bVarD;
                    i44 = i42;
                    f14 = f13;
                    hVar = hVarC;
                    iVar4 = iVar3;
                    lVarV.B(objI3);
                }
                lVarV.l();
                Function0.f(iVarA13, fValueOf13, (wn0.p) objI3, lVarV, 0);
                if (hVar.g()) {
                    if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                        lVar3.invoke(Float.valueOf(hVar.getProgress()));
                        p1Var.setValue(Boolean.TRUE);
                    }
                }
                tf.i iVarS13 = bVar.s();
                lVarV.o(-835046250);
                zN = lVarV.n(bVar);
                objI4 = lVarV.I();
                if (!zN) {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                } else {
                    objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Float.valueOf(TA.a(bVar));
                        }
                    };
                    lVarV.B(objI4);
                }
                lVarV.l();
                androidx.compose.ui.d dVar17 = dVar3;
                lVar4 = lVarV;
                xf.e.a(iVarS13, (wn0.a) objI4, dVar17, false, false, false, false, null, false, nVarB13, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                long j21119 = jC;
                jVar4 = jVar3;
                j16 = j21119;
                z21 = z2111112;
                j17 = j15;
                f15 = f14;
                i45 = i44;
                lVar5 = lVar3;
                iVar5 = iVar4;
                dVar4 = dVar17;
                kVar2 = kVarE;
                j18 = j21118;
                z22 = z2111111;
                j19 = j21117;
            }
            w2VarX = lVar4.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 100663296;
        i23 = i14 & 512;
        i24 = 805306368;
        if (i23 == 0) {
            i15 |= i24;
        } else if ((i12 & 805306368) == 0) {
            if ((i12 & 1073741824) == 0) {
                zK = lVarV.n(jVar);
            } else {
                zK = lVarV.K(jVar);
            }
            if (zK) {
                i24 = PKIFailureInfo.duplicateCertReq;
            } else {
                i24 = 268435456;
            }
            i15 |= i24;
        }
        if ((i14 & 1024) != 0) {
            i25 = i13 | 6;
            yj2 = lottieSource;
        } else if ((i13 & 6) == 0) {
            if ((i13 & 8) == 0) {
                yj2 = lottieSource;
                zK2 = lVarV.n(yj2);
            } else {
                yj2 = lottieSource;
                zK2 = lVarV.K(yj2);
            }
            if (zK2) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i13 | i26;
        } else {
            yj2 = lottieSource;
            i25 = i13;
        }
        i27 = i14 & 2048;
        if (i27 != 0) {
            i25 |= 48;
        } else if ((i13 & 48) != 0) {
            if (lVarV.n(iVar)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i25 |= i28;
        }
        i29 = i25;
        i31 = i14 & 4096;
        if (i31 != 0) {
            i32 = i29 | KyberEngine.KyberPolyBytes;
        } else if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
            i32 = i29 | (lVarV.K(lVar) ? 256 : 128);
        } else {
            i32 = i29;
        }
        i33 = i14 & PKIFailureInfo.certRevoked;
        if (i33 != 0) {
            i35 = i32 | 3072;
        } else {
            i34 = i32;
            if ((i13 & 3072) != 0) {
                i34 |= lVarV.n(kVar) ? 2048 : 1024;
            }
            i35 = i34;
        }
        if ((i15 & 306783379) != 306783378) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i51 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i52 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i14 & 8) != 0) {
                    jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                    i15 &= -7169;
                } else {
                    jA3 = j11;
                }
                if ((i14 & 16) != 0) {
                    i36 = 6;
                    jA = C3825sp.f35377a.d(lVarV, 6).a();
                    i15 &= -57345;
                } else {
                    i36 = 6;
                }
                if ((i14 & 32) != 0) {
                    jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    jC = C3825sp.f35377a.d(lVarV, 6).c();
                    i15 = (-3670017) & i15;
                }
                if (i18 != 0) {
                    i37 = 1;
                } else {
                    i37 = i11;
                }
                if (i21 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f11;
                }
                if (i23 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                if (i27 != 0) {
                    iVar2 = xf.i.Immediately;
                } else {
                    iVar2 = iVar;
                }
                dVar3 = dVar2;
                if (i31 != 0) {
                    lVarV.o(-835229593);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return TA.a(((Float) obj).floatValue());
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVar3 = (wn0.l) objI;
                    lVarV.l();
                } else {
                    lVar3 = lVar;
                }
                if (i33 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                } else {
                    kVarE = kVar;
                }
                i38 = i15;
                j15 = jA3;
                i39 = i37;
            } else {
                if (i51 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i52 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i14 & 8) != 0) {
                    jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                    i15 &= -7169;
                } else {
                    jA3 = j11;
                }
                if ((i14 & 16) != 0) {
                    i36 = 6;
                    jA = C3825sp.f35377a.d(lVarV, 6).a();
                    i15 &= -57345;
                } else {
                    i36 = 6;
                }
                if ((i14 & 32) != 0) {
                    jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    jC = C3825sp.f35377a.d(lVarV, 6).c();
                    i15 = (-3670017) & i15;
                }
                if (i18 != 0) {
                    i37 = 1;
                } else {
                    i37 = i11;
                }
                if (i21 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f11;
                }
                if (i23 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                if (i27 != 0) {
                    iVar2 = xf.i.Immediately;
                } else {
                    iVar2 = iVar;
                }
                dVar3 = dVar2;
                if (i31 != 0) {
                    lVarV.o(-835229593);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return TA.a(((Float) obj).floatValue());
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVar3 = (wn0.l) objI;
                    lVarV.l();
                } else {
                    lVar3 = lVar;
                }
                if (i33 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                } else {
                    kVarE = kVar;
                }
                i38 = i15;
                j15 = jA3;
                i39 = i37;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
            }
            lVarV.o(-835226457);
            objI2 = lVarV.I();
            companion = p020r2.l.INSTANCE;
            i41 = i35;
            if (objI2 == companion.a()) {
                objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                lVarV.B(objI2);
            }
            p1Var = (p020r2.p1) objI2;
            lVarV.l();
            bVarD = xf.d.d(lVarV, 0);
            if (yj2 instanceof Yj.a) {
                String path14 = ((Yj.a) yj2).a().getPath();
                p013kotlin.jvm.internal.s.j(path14, "getPath(...)");
                mVarA = xf.m.c.a(xf.m.c.b(path14));
            } else {
                if (!(yj2 instanceof Yj.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
            }
            kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
            boolean z2111115 = z14;
            boolean z2111116 = z13;
            i42 = i39;
            f13 = f12;
            jVar3 = jVar2;
            iVar3 = iVar2;
            hVarC = xf.a.c(a(kVarR), z2111115, z2111116, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
            i43 = i38;
            Integer num14 = tf.d0.f113272a;
            long j211110 = jA;
            xf.p pVarC111113 = xf.o.c(num14, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
            xf.p pVarC111114 = xf.o.c(num14, Integer.valueOf(k3.r1.k(j211110)), new String[]{"**", "secondary", "**"}, lVarV, 6);
            xf.p pVarC111115 = xf.o.c(num14, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
            xf.p pVarC111116 = xf.o.c(num14, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
            C3825sp c3825sp14 = C3825sp.f35377a;
            long j211111 = jA2;
            xf.n nVarB14 = xf.o.b(new xf.p[]{pVarC111113, pVarC111114, pVarC111115, pVarC111116, xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num14, Integer.valueOf(k3.r1.k(c3825sp14.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
            tf.i iVarA14 = a(kVarR);
            Float fValueOf14 = Float.valueOf(hVarC.getProgress());
            lVarV.o(-835066949);
            boolean zN118 = lVarV.n(bVarD) | lVarV.n(kVarR);
            if ((i43 & 29360128) == 8388608) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z2111117 = zN118 | z15;
            if ((i43 & 234881024) == 67108864) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z2111118 = z2111117 | z16;
            if ((i43 & 1879048192) != 536870912) {
                z17 = true;
            } else {
                z17 = true;
            }
            boolean zN119 = z2111118 | z17 | lVarV.n(hVarC);
            if ((i41 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zN119 | z18;
            objI3 = lVarV.I();
            if (z19) {
                objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                bVar = bVarD;
                i44 = i42;
                f14 = f13;
                hVar = hVarC;
                iVar4 = iVar3;
                lVarV.B(objI3);
            } else {
                objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                bVar = bVarD;
                i44 = i42;
                f14 = f13;
                hVar = hVarC;
                iVar4 = iVar3;
                lVarV.B(objI3);
            }
            lVarV.l();
            Function0.f(iVarA14, fValueOf14, (wn0.p) objI3, lVarV, 0);
            if (hVar.g()) {
                if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                    lVar3.invoke(Float.valueOf(hVar.getProgress()));
                    p1Var.setValue(Boolean.TRUE);
                }
            }
            tf.i iVarS14 = bVar.s();
            lVarV.o(-835046250);
            zN = lVarV.n(bVar);
            objI4 = lVarV.I();
            if (!zN) {
                objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Float.valueOf(TA.a(bVar));
                    }
                };
                lVarV.B(objI4);
            } else {
                objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Float.valueOf(TA.a(bVar));
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            androidx.compose.ui.d dVar18 = dVar3;
            lVar4 = lVarV;
            xf.e.a(iVarS14, (wn0.a) objI4, dVar18, false, false, false, false, null, false, nVarB14, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            long j211112 = jC;
            jVar4 = jVar3;
            j16 = j211112;
            z21 = z2111116;
            j17 = j15;
            f15 = f14;
            i45 = i44;
            lVar5 = lVar3;
            iVar5 = iVar4;
            dVar4 = dVar18;
            kVar2 = kVarE;
            j18 = j211111;
            z22 = z2111115;
            j19 = j211110;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i51 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i52 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i14 & 8) != 0) {
                    jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                    i15 &= -7169;
                } else {
                    jA3 = j11;
                }
                if ((i14 & 16) != 0) {
                    i36 = 6;
                    jA = C3825sp.f35377a.d(lVarV, 6).a();
                    i15 &= -57345;
                } else {
                    i36 = 6;
                }
                if ((i14 & 32) != 0) {
                    jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    jC = C3825sp.f35377a.d(lVarV, 6).c();
                    i15 = (-3670017) & i15;
                }
                if (i18 != 0) {
                    i37 = 1;
                } else {
                    i37 = i11;
                }
                if (i21 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f11;
                }
                if (i23 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                if (i27 != 0) {
                    iVar2 = xf.i.Immediately;
                } else {
                    iVar2 = iVar;
                }
                dVar3 = dVar2;
                if (i31 != 0) {
                    lVarV.o(-835229593);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return TA.a(((Float) obj).floatValue());
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVar3 = (wn0.l) objI;
                    lVarV.l();
                } else {
                    lVar3 = lVar;
                }
                if (i33 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                } else {
                    kVarE = kVar;
                }
                i38 = i15;
                j15 = jA3;
                i39 = i37;
            } else {
                if (i51 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i52 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if ((i14 & 8) != 0) {
                    jA3 = C3825sp.f35377a.b(lVarV, 6).getGraphic().getInfo().getHighlight().a(lVarV, 0);
                    i15 &= -7169;
                } else {
                    jA3 = j11;
                }
                if ((i14 & 16) != 0) {
                    i36 = 6;
                    jA = C3825sp.f35377a.d(lVarV, 6).a();
                    i15 &= -57345;
                } else {
                    i36 = 6;
                }
                if ((i14 & 32) != 0) {
                    jA2 = C3825sp.f35377a.b(lVarV, i36).getGraphic().getInfo().getBackground().a(lVarV, 0);
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    jC = C3825sp.f35377a.d(lVarV, 6).c();
                    i15 = (-3670017) & i15;
                }
                if (i18 != 0) {
                    i37 = 1;
                } else {
                    i37 = i11;
                }
                if (i21 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f11;
                }
                if (i23 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar;
                }
                if (i27 != 0) {
                    iVar2 = xf.i.Immediately;
                } else {
                    iVar2 = iVar;
                }
                dVar3 = dVar2;
                if (i31 != 0) {
                    lVarV.o(-835229593);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.mp0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return TA.a(((Float) obj).floatValue());
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVar3 = (wn0.l) objI;
                    lVarV.l();
                } else {
                    lVar3 = lVar;
                }
                if (i33 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                } else {
                    kVarE = kVar;
                }
                i38 = i15;
                j15 = jA3;
                i39 = i37;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-1707951323, i38, i35, "com.fourthline.orca.core.internal.composable.ThemedLottieAnimation (ThemedLottieAnimation.kt:47)");
            }
            lVarV.o(-835226457);
            objI2 = lVarV.I();
            companion = p020r2.l.INSTANCE;
            i41 = i35;
            if (objI2 == companion.a()) {
                objI2 = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                lVarV.B(objI2);
            }
            p1Var = (p020r2.p1) objI2;
            lVarV.l();
            bVarD = xf.d.d(lVarV, 0);
            if (yj2 instanceof Yj.a) {
                String path15 = ((Yj.a) yj2).a().getPath();
                p013kotlin.jvm.internal.s.j(path15, "getPath(...)");
                mVarA = xf.m.c.a(xf.m.c.b(path15));
            } else {
                if (!(yj2 instanceof Yj.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                mVarA = xf.m.e.a(xf.m.e.b(((Yj.b) yj2).a()));
            }
            kVarR = xf.q.r(mVarA, null, null, null, null, null, lVarV, 0, 62);
            boolean z2111119 = z14;
            boolean z21111110 = z13;
            i42 = i39;
            f13 = f12;
            jVar3 = jVar2;
            iVar3 = iVar2;
            hVarC = xf.a.c(a(kVarR), z2111119, z21111110, false, jVar3, f13, i42, iVar3, false, false, lVarV, (i38 & 1008) | (xf.j.f123419a << 12) | ((i38 >> 15) & 57344) | ((i38 >> 9) & 458752) | ((i38 >> 3) & 3670016) | ((i41 << 18) & 29360128), 776);
            i43 = i38;
            Integer num15 = tf.d0.f113272a;
            long j211113 = jA;
            xf.p pVarC111117 = xf.o.c(num15, Integer.valueOf(k3.r1.k(j15)), new String[]{"**", "primary", "**"}, lVarV, 6);
            xf.p pVarC111118 = xf.o.c(num15, Integer.valueOf(k3.r1.k(j211113)), new String[]{"**", "secondary", "**"}, lVarV, 6);
            xf.p pVarC111119 = xf.o.c(num15, Integer.valueOf(k3.r1.k(jA2)), new String[]{"**", "tertiary", "**"}, lVarV, 6);
            xf.p pVarC1111110 = xf.o.c(num15, Integer.valueOf(k3.r1.k(jC)), new String[]{"**", "quaternary", "**"}, lVarV, 6);
            C3825sp c3825sp15 = C3825sp.f35377a;
            long j211114 = jA2;
            xf.n nVarB15 = xf.o.b(new xf.p[]{pVarC111117, pVarC111118, pVarC111119, pVarC1111110, xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-background", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().c())), new String[]{"**", ".fl-illustration-primary-foreground", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-background", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().a())), new String[]{"**", ".fl-illustration-caution-foreground", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-background", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().e())), new String[]{"**", ".fl-illustration-warning-foreground", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-background", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().b())), new String[]{"**", ".fl-illustration-danger-foreground", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-background", "**"}, lVarV, 6), xf.o.c(num15, Integer.valueOf(k3.r1.k(c3825sp15.d(lVarV, 6).b().d())), new String[]{"**", ".fl-illustration-success-foreground", "**"}, lVarV, 6)}, lVarV, xf.p.f123450d);
            tf.i iVarA15 = a(kVarR);
            Float fValueOf15 = Float.valueOf(hVarC.getProgress());
            lVarV.o(-835066949);
            boolean zN1110 = lVarV.n(bVarD) | lVarV.n(kVarR);
            if ((i43 & 29360128) == 8388608) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z21111111 = zN1110 | z15;
            if ((i43 & 234881024) == 67108864) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z21111112 = z21111111 | z16;
            if ((i43 & 1879048192) != 536870912) {
                z17 = true;
            } else {
                z17 = true;
            }
            boolean zN1111 = z21111112 | z17 | lVarV.n(hVarC);
            if ((i41 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zN1111 | z18;
            objI3 = lVarV.I();
            if (z19) {
                objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                bVar = bVarD;
                i44 = i42;
                f14 = f13;
                hVar = hVarC;
                iVar4 = iVar3;
                lVarV.B(objI3);
            } else {
                objI3 = new a(bVarD, i42, f13, jVar3, hVarC, iVar3, kVarR, null);
                bVar = bVarD;
                i44 = i42;
                f14 = f13;
                hVar = hVarC;
                iVar4 = iVar3;
                lVarV.B(objI3);
            }
            lVarV.l();
            Function0.f(iVarA15, fValueOf15, (wn0.p) objI3, lVarV, 0);
            if (hVar.g()) {
                if (!(hVar.getProgress() == BitmapDescriptorFactory.HUE_RED)) {
                    lVar3.invoke(Float.valueOf(hVar.getProgress()));
                    p1Var.setValue(Boolean.TRUE);
                }
            }
            tf.i iVarS15 = bVar.s();
            lVarV.o(-835046250);
            zN = lVarV.n(bVar);
            objI4 = lVarV.I();
            if (!zN) {
                objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Float.valueOf(TA.a(bVar));
                    }
                };
                lVarV.B(objI4);
            } else {
                objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.np0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Float.valueOf(TA.a(bVar));
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            androidx.compose.ui.d dVar19 = dVar3;
            lVar4 = lVarV;
            xf.e.a(iVarS15, (wn0.a) objI4, dVar19, false, false, false, false, null, false, nVarB15, null, kVarE, false, false, null, null, false, lVar4, ((i43 << 6) & 896) | (xf.n.f123438k << 27), (i41 >> 6) & 112, 128504);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            long j211115 = jC;
            jVar4 = jVar3;
            j16 = j211115;
            z21 = z21111110;
            j17 = j15;
            f15 = f14;
            i45 = i44;
            lVar5 = lVar3;
            iVar5 = iVar4;
            dVar4 = dVar19;
            kVar2 = kVarE;
            j18 = j211114;
            z22 = z2111119;
            j19 = j211113;
        }
        w2VarX = lVar4.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.op0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return TA.a(dVar4, z22, z21, j17, j19, j18, j16, i45, f15, jVar4, lottieSource, iVar5, lVar5, kVar2, i12, i13, i14, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float a(xf.b bVar) {
        return bVar.getProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tf.i a(xf.k kVar) {
        return kVar.getValue();
    }
}
