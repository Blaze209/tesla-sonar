package com.fourthline.orca.internal;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3521ll implements InterfaceC3645og {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f33341f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f33342g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f33344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Gl f33345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3687pf f33346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.q f33347e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ll$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ll$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33350c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f33352e;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33350c = obj;
            this.f33352e |= Integer.MIN_VALUE;
            Object objA = C3521ll.this.a((InterfaceC3645og.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3521ll(Context context, wn0.a workflowIdProvider, Gl networkService, C3687pf featuresAnalyticsContext, wn0.q flowVariantUseCase) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(featuresAnalyticsContext, "featuresAnalyticsContext");
        p013kotlin.jvm.internal.s.k(flowVariantUseCase, "flowVariantUseCase");
        this.f33343a = context;
        this.f33344b = workflowIdProvider;
        this.f33345c = networkService;
        this.f33346d = featuresAnalyticsContext;
        this.f33347e = flowVariantUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.InterfaceC3645og
    public Object a(InterfaceC3645og.a aVar, Continuation continuation) {
        b bVar;
        InterfaceC3645og.a aVar2;
        Object objA;
        C3521ll c3521ll;
        InterfaceC3645og.WhatsNextResponse whatsNextResponse;
        Rf rfA;
        InterfaceC3645og.WhatsNextResponse whatsNextResponse2;
        C3257fd c3257fd;
        WorkflowConfigurationResponse workflowConfigurationResponseA;
        WorkflowConfigurationTenantSettings tenant;
        EidConfig eId;
        InterfaceC3645og.c dVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f33352e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f33352e = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f33350c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f33352e;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    aVar2 = (InterfaceC3645og.a) bVar.f33349b;
                    c3521ll = (C3521ll) bVar.f33348a;
                    jn0.t.b(obj);
                    objA = ((jn0.s) obj).getValue();
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3257fd = (C3257fd) bVar.f33349b;
                    whatsNextResponse2 = (InterfaceC3645og.WhatsNextResponse) bVar.f33348a;
                    jn0.t.b(obj);
                }
                rfA = c3257fd.getFallbackDocumentConfig();
                whatsNextResponse = whatsNextResponse2;
                dVar = new InterfaceC3645og.c.d(whatsNextResponse.getName(), rfA);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(new InterfaceC3645og.b(dVar));
            }
            jn0.t.b(obj);
            Gl gl2 = this.f33345c;
            Cl.a aVar3 = new Cl.a("workflow_next_flow", Cl.b.GET, "/v1/workflows/" + this.f33344b.invoke() + "/next", AbstractC3345hf.a(), null, null, 48, null);
            bVar.f33348a = this;
            aVar2 = aVar;
            bVar.f33349b = aVar2;
            bVar.f33352e = 1;
            objA = gl2.a(aVar3, bVar);
            if (objA != coroutine_suspended) {
                c3521ll = this;
            }
            return coroutine_suspended;
            Throwable thE = jn0.s.e(objA);
            if (thE != null) {
                return jn0.s.b(jn0.t.a(AbstractC3039aE.a(thE)));
            }
            Dl dl2 = (Dl) objA;
            if (!El.e(dl2)) {
                if (El.d(dl2)) {
                    return jn0.s.b(jn0.t.a(ZD.c.f30009a));
                }
                return jn0.s.b(jn0.t.a(new ZD.b("NetworkWhatsNextWorker." + dl2.c())));
            }
            wo0.b bVarA = Ki.a();
            String strB = El.b(dl2);
            bVarA.getSerializersModule();
            whatsNextResponse = (InterfaceC3645og.WhatsNextResponse) bVarA.d(InterfaceC3645og.WhatsNextResponse.INSTANCE.serializer(), strB);
            c3521ll.f33346d.a(whatsNextResponse.getFeatureVariants());
            String name = whatsNextResponse.getName();
            if (p013kotlin.jvm.internal.s.f(name, "complete_onboarding")) {
                dVar = InterfaceC3645og.c.C0595c.f34276a;
            } else if (p013kotlin.jvm.internal.s.f(name, "outcome")) {
                dVar = InterfaceC3645og.c.b.f34275a;
            } else {
                String name2 = whatsNextResponse.getName();
                rfA = null;
                if (p013kotlin.jvm.internal.s.f(name2, "document")) {
                    JsonObject configuration = whatsNextResponse.getConfiguration();
                    rfA = configuration != null ? c3521ll.a(configuration, whatsNextResponse.getName()) : null;
                    p013kotlin.jvm.internal.s.i(rfA, "null cannot be cast to non-null type com.fourthline.orca.kyc.internal.flow.document.DocumentFlowConfig");
                    DocumentFlowConfig documentFlowConfig = (DocumentFlowConfig) rfA;
                    rfA = (!AbstractC3300gd.a(c3521ll.f33343a) || (workflowConfigurationResponseA = aVar2.a()) == null || (tenant = workflowConfigurationResponseA.getTenant()) == null || (eId = tenant.getEId()) == null || !eId.getEnabled()) ? documentFlowConfig : new C3257fd((String) null, (String) null, false, documentFlowConfig, false, 7, (DefaultConstructorMarker) null);
                } else if (p013kotlin.jvm.internal.s.f(name2, "eid")) {
                    JsonObject configuration2 = whatsNextResponse.getConfiguration();
                    rfA = configuration2 != null ? c3521ll.a(configuration2, whatsNextResponse.getName()) : null;
                    p013kotlin.jvm.internal.s.i(rfA, "null cannot be cast to non-null type com.fourthline.orca.kyc.internal.flow.eid.EidFlowConfig");
                    C3257fd c3257fd2 = (C3257fd) rfA;
                    if (!AbstractC3300gd.a(c3521ll.f33343a)) {
                        wn0.q qVar = c3521ll.f33347e;
                        InterfaceC3559mg.a aVar4 = new InterfaceC3559mg.a((String) c3521ll.f33344b.invoke(), c3257fd2.getDocumentFlowName());
                        WorkflowConfigurationResponse workflowConfigurationResponseA2 = aVar2.a();
                        if (workflowConfigurationResponseA2 != null) {
                            bVar.f33348a = whatsNextResponse;
                            bVar.f33349b = c3257fd2;
                            bVar.f33352e = 2;
                            if (qVar.invoke(aVar4, workflowConfigurationResponseA2, bVar) != coroutine_suspended) {
                                whatsNextResponse2 = whatsNextResponse;
                                c3257fd = c3257fd2;
                                rfA = c3257fd.getFallbackDocumentConfig();
                                whatsNextResponse = whatsNextResponse2;
                            }
                            return coroutine_suspended;
                        }
                        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + workflowConfigurationResponseA2 + " must not be null."))).toString());
                    }
                    rfA = c3257fd2;
                } else {
                    JsonObject configuration3 = whatsNextResponse.getConfiguration();
                    if (configuration3 != null) {
                        rfA = c3521ll.a(configuration3, whatsNextResponse.getName());
                    }
                }
                dVar = new InterfaceC3645og.c.d(whatsNextResponse.getName(), rfA);
            }
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(new InterfaceC3645og.b(dVar));
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(AbstractC3039aE.a(th2)));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Rf a(JsonElement jsonElement, String str) {
        switch (str.hashCode()) {
            case -1748366661:
                if (str.equals("biometrics")) {
                    return (Rf) Ki.a().c(C4006wx.INSTANCE.serializer(), jsonElement);
                }
                break;
            case -1147692044:
                if (str.equals(PlaceTypes.ADDRESS)) {
                    return (Rf) Ki.a().c(M.INSTANCE.serializer(), jsonElement);
                }
                break;
            case -991716523:
                if (str.equals("person")) {
                    return (Rf) Ki.a().c(Qp.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 97303:
                if (str.equals("bav")) {
                    return (Rf) Ki.a().c(C4011x1.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 100416:
                if (str.equals("eid")) {
                    return (Rf) Ki.a().c(C3257fd.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 111170:
                if (str.equals("poa")) {
                    return (Rf) Ki.a().c(C3058ar.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 111839:
                if (str.equals("qes")) {
                    return (Rf) Ki.a().c(Zt.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 114841:
                if (str.equals("tin")) {
                    return (Rf) Ki.a().c(C3848tB.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 66670086:
                if (str.equals("geolocation")) {
                    return (Rf) Ki.a().c(C3605nj.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 861720859:
                if (str.equals("document")) {
                    return (Rf) Ki.a().c(DocumentFlowConfig.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    return (Rf) Ki.a().c(C3200e5.INSTANCE.serializer(), jsonElement);
                }
                break;
        }
        throw new IllegalStateException(("FL developer error. Config for Flow '" + str + "' is missing.").toString());
    }
}
