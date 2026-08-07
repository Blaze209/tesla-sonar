package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3951vl implements Tv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.l f36250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f36251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f36252c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36253a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36255c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36253a = obj;
            this.f36255c |= Integer.MIN_VALUE;
            Object objA = C3951vl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3951vl(wn0.l endpoint, Gl networkService, wn0.a metadataProvider) {
        p013kotlin.jvm.internal.s.k(endpoint, "endpoint");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(metadataProvider, "metadataProvider");
        this.f36250a = endpoint;
        this.f36251b = networkService;
        this.f36252c = metadataProvider;
    }

    private final DeviceMetadata a() {
        return (DeviceMetadata) this.f36252c.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Tv
    public Object a(Uv.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f36255c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f36255c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f36253a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f36255c;
        if (i12 == 0) {
            jn0.t.b(obj);
            try {
                DeviceMetadata deviceMetadataA = a();
                JSONObject jSONObjectB = AbstractC3994wl.b(new C3449jz(new C3406iz(deviceMetadataA.getLanguage(), deviceMetadataA.getRegion(), deviceMetadataA.getModel(), aVar.b())));
                p013kotlin.jvm.internal.s.j(jSONObjectB, "access$toJson(...)");
                C3842t5 c3842t5A = AbstractC3885u5.a(jSONObjectB);
                Gl gl2 = this.f36251b;
                Cl.a aVar3 = new Cl.a("qes_start_signature", Cl.b.POST, ((C2911Ne) this.f36250a.invoke(aVar.c())).a(), null, p013kotlin.collections.v.e(jn0.x.a("lang", aVar.a())), c3842t5A, 8, null);
                aVar2.f36255c = 1;
                objA = gl2.a(aVar3, aVar2);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (JSONException unused) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesStartSignatureRequestWorker.cannotEncodeRequest")));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objA);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(AbstractC3039aE.a(thE)));
        }
        Dl dl2 = (Dl) objA;
        if (El.e(dl2)) {
            return jn0.s.b(Tv.a.f27976a);
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesStartSignatureRequestWorker." + dl2.c())));
    }
}
