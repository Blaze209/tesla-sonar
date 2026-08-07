package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3515lf implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QE f33304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4018x8 f33305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4049xx f33306c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lf$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33309c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f33311e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33309c = obj;
            this.f33311e |= Integer.MIN_VALUE;
            Object objA = C3515lf.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3515lf(QE mobileSessionWorker, InterfaceC4018x8 documentFlowConfigWorker, InterfaceC4049xx selfieFlowConfigWorker) {
        p013kotlin.jvm.internal.s.k(mobileSessionWorker, "mobileSessionWorker");
        p013kotlin.jvm.internal.s.k(documentFlowConfigWorker, "documentFlowConfigWorker");
        p013kotlin.jvm.internal.s.k(selfieFlowConfigWorker, "selfieFlowConfigWorker");
        this.f33304a = mobileSessionWorker;
        this.f33305b = documentFlowConfigWorker;
        this.f33306c = selfieFlowConfigWorker;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x016d A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x0037, B:88:0x0217, B:89:0x0222, B:21:0x0055, B:66:0x0153, B:67:0x015f, B:69:0x016d, B:71:0x0173, B:72:0x0186, B:74:0x018c, B:75:0x019a, B:77:0x01a0, B:78:0x01a4, B:80:0x01bc, B:83:0x01e1, B:82:0x01d4, B:84:0x01f7, B:45:0x00c7, B:47:0x00d7, B:49:0x00dd, B:51:0x00e5, B:53:0x00eb, B:55:0x0102, B:57:0x0110, B:58:0x0114, B:61:0x0127, B:60:0x011c, B:62:0x0130), top: B:94:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x0213  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.Gg
    public Object a(Gg.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        Object objA2;
        C3515lf c3515lf;
        PE pe2;
        PE pe3;
        Object value;
        C3515lf c3515lf2;
        SelfieSettings c3877tyE;
        Ux ux2;
        C4006wx c4006wx;
        IdvSettings idv;
        Object objA3;
        PE pe4;
        Object value2;
        C4006wx c4006wx2;
        DocumentSettings c2969UbB;
        DocumentFlowConfig documentFlowConfig;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f33311e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f33311e = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f33309c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f33311e;
        int i13 = 2;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                QE qe2 = this.f33304a;
                QE.a aVar3 = new QE.a(aVar.b(), aVar.a());
                aVar2.f33307a = this;
                aVar2.f33311e = 1;
                objA2 = qe2.a(aVar3, aVar2);
                if (objA2 != coroutine_suspended) {
                    c3515lf = this;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                c3515lf = (C3515lf) aVar2.f33307a;
                jn0.t.b(obj);
                objA2 = ((jn0.s) obj).getValue();
            } else {
                if (i12 == 2) {
                    pe3 = (PE) aVar2.f33308b;
                    c3515lf2 = (C3515lf) aVar2.f33307a;
                    jn0.t.b(obj);
                    value = ((jn0.s) obj).getValue();
                    jn0.t.b(value);
                    c4006wx = ((InterfaceC4049xx.b) value).a();
                    pe2 = pe3;
                    c3515lf = c3515lf2;
                    idv = pe2.e().getWorkflow().getIdv();
                    if (idv != null || (c2969UbB = idv.getDocument()) == null) {
                        InterfaceC4018x8 interfaceC4018x8 = c3515lf.f33305b;
                        InterfaceC4018x8.a aVar4 = new InterfaceC4018x8.a(pe2.c().d());
                        aVar2.f33307a = pe2;
                        aVar2.f33308b = c4006wx;
                        aVar2.f33311e = 3;
                        objA3 = interfaceC4018x8.a(aVar4, aVar2);
                        if (objA3 != coroutine_suspended) {
                            pe4 = pe2;
                            value2 = objA3;
                            c4006wx2 = c4006wx;
                        }
                        return coroutine_suspended;
                    }
                    List listD = c2969UbB.getSupportedDocuments();
                    ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listD, 10));
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(RE.a((SupportedDocumentsResponse) it.next()));
                    }
                    Boolean boolE = c2969UbB.getTiltedStepsEnabled();
                    boolean zBooleanValue = boolE != null ? boolE.booleanValue() : true;
                    DocumentNfcConfig x11 = new DocumentNfcConfig(p013kotlin.jvm.internal.s.f(c2969UbB.getNfc(), "allowed"), "Default");
                    DocumentAnalysisSettings c3758r7B = c2969UbB.getAnalysis();
                    documentFlowConfig = new DocumentFlowConfig(null, null, zBooleanValue, null, null, null, c3758r7B != null ? new DocumentAnalysisConfig(c3758r7B.getEnabled(), c3758r7B.getMinimumAge(), c3758r7B.getImageUploadTimeoutMs(), c3758r7B.getBackendProcessingTimeoutMs()) : new DocumentAnalysisConfig(false, 18, 0L, 0L), x11, arrayList, false, 571, null);
                    return jn0.s.b(new Gg.b(new Fg(pe2, documentFlowConfig, c4006wx)));
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4006wx2 = (C4006wx) aVar2.f33308b;
                pe4 = (PE) aVar2.f33307a;
                jn0.t.b(obj);
                value2 = ((jn0.s) obj).getValue();
            }
            jn0.t.b(value2);
            documentFlowConfig = ((InterfaceC4018x8.b) value2).a();
            pe2 = pe4;
            c4006wx = c4006wx2;
            return jn0.s.b(new Gg.b(new Fg(pe2, documentFlowConfig, c4006wx)));
            if (jn0.s.h(objA2)) {
                try {
                    QE.b bVar = (QE.b) objA2;
                    if (bVar instanceof QE.b.a) {
                        throw ((QE.b.a) bVar).a();
                    }
                    if (!(bVar instanceof QE.b.C0514b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objA = jn0.s.b(((QE.b.C0514b) bVar).a());
                } catch (Throwable th2) {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    objA2 = jn0.t.a(th2);
                    objA = jn0.s.b(objA2);
                }
            } else {
                objA = jn0.s.b(objA2);
            }
            if (jn0.s.h(objA)) {
                pe2 = (PE) objA;
                IdvSettings idv2 = pe2.e().getWorkflow().getIdv();
                if (idv2 == null || (c3877tyE = idv2.getSelfie()) == null) {
                    InterfaceC4049xx interfaceC4049xx = c3515lf.f33306c;
                    InterfaceC4049xx.a aVar5 = new InterfaceC4049xx.a(pe2.c().d());
                    aVar2.f33307a = c3515lf;
                    aVar2.f33308b = pe2;
                    aVar2.f33311e = 2;
                    Object objA4 = interfaceC4049xx.a(aVar5, aVar2);
                    if (objA4 != coroutine_suspended) {
                        C3515lf c3515lf3 = c3515lf;
                        pe3 = pe2;
                        value = objA4;
                        c3515lf2 = c3515lf3;
                        jn0.t.b(value);
                        c4006wx = ((InterfaceC4049xx.b) value).a();
                        pe2 = pe3;
                        c3515lf = c3515lf2;
                        idv = pe2.e().getWorkflow().getIdv();
                        if (idv != null) {
                        }
                        InterfaceC4018x8 interfaceC4018x9 = c3515lf.f33305b;
                        InterfaceC4018x8.a aVar6 = new InterfaceC4018x8.a(pe2.c().d());
                        aVar2.f33307a = pe2;
                        aVar2.f33308b = c4006wx;
                        aVar2.f33311e = 3;
                        objA3 = interfaceC4018x9.a(aVar6, aVar2);
                        if (objA3 != coroutine_suspended) {
                            pe4 = pe2;
                            value2 = objA3;
                            c4006wx2 = c4006wx;
                            jn0.t.b(value2);
                            documentFlowConfig = ((InterfaceC4018x8.b) value2).a();
                            pe2 = pe4;
                            c4006wx = c4006wx2;
                            return jn0.s.b(new Gg.b(new Fg(pe2, documentFlowConfig, c4006wx)));
                        }
                    }
                } else {
                    SelfieVideoSettings c4050xyA = c3877tyE.getVideo();
                    C4007wy c4007wy = new C4007wy(c4050xyA != null ? c4050xyA.getEnabled() : true, (Integer) null, i13, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    LivenessSettings c3306gjC = pe2.e().getWorkflow().getIdv().getLiveness();
                    if (c3306gjC != null) {
                        boolean zA = c3306gjC.getEnabled();
                        RandomnessSettings randomnessSettingsB = c3306gjC.getRandomness();
                        ux2 = new Ux(zA, new Vx(randomnessSettingsB != null ? randomnessSettingsB.getEnabled() : false));
                    } else {
                        ux2 = new Ux(true, new Vx(false));
                    }
                    c4006wx = new C4006wx(c4007wy, ux2, null, 4, null);
                    idv = pe2.e().getWorkflow().getIdv();
                    if (idv != null) {
                    }
                    InterfaceC4018x8 interfaceC4018x10 = c3515lf.f33305b;
                    InterfaceC4018x8.a aVar7 = new InterfaceC4018x8.a(pe2.c().d());
                    aVar2.f33307a = pe2;
                    aVar2.f33308b = c4006wx;
                    aVar2.f33311e = 3;
                    objA3 = interfaceC4018x10.a(aVar7, aVar2);
                    if (objA3 != coroutine_suspended) {
                        pe4 = pe2;
                        value2 = objA3;
                        c4006wx2 = c4006wx;
                        jn0.t.b(value2);
                        documentFlowConfig = ((InterfaceC4018x8.b) value2).a();
                        pe2 = pe4;
                        c4006wx = c4006wx2;
                        return jn0.s.b(new Gg.b(new Fg(pe2, documentFlowConfig, c4006wx)));
                    }
                }
                return coroutine_suspended;
            }
        } catch (Throwable th3) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objA = jn0.t.a(th3);
        }
        return jn0.s.b(objA);
    }
}
