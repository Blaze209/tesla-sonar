package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.internal.identifiers.AppTrackerIdProvider;
import com.fourthline.core.internal.identifiers.UserIdProvider;
import com.fourthline.orca.workflow.WorkflowResults;
import org.json.JSONObject;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Nl implements InterfaceC3551mE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceMetadata f27060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vf f27061c;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27062a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27064c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27062a = obj;
            this.f27064c |= Integer.MIN_VALUE;
            Object objA = Nl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Nl(Context context, DeviceMetadata deviceMetadata, Vf dataWorkManager) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(deviceMetadata, "deviceMetadata");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        this.f27059a = context;
        this.f27060b = deviceMetadata;
        this.f27061c = dataWorkManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3551mE
    public Object a(String str, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f27064c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f27064c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f27062a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f27064c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        Pair pairA = YC.a(this.f27060b, new AppTrackerIdProvider(this.f27059a).getValue(), new UserIdProvider(this.f27059a).getValue());
        if (pairA == null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(new ZD.b("Invalid DeviceMetadata object")));
        }
        WorkflowResults.IDV.DeviceMetadata deviceMetadata = (WorkflowResults.IDV.DeviceMetadata) pairA.a();
        JSONObject jSONObject = (JSONObject) pairA.b();
        EnumC3038aD enumC3038aD = EnumC3038aD.Metadata;
        p013kotlin.jvm.internal.s.h(jSONObject);
        C3304gh c3304gh = new C3304gh(p013kotlin.collections.v.e(enumC3038aD), p013kotlin.collections.v.e(new C3347hh(enumC3038aD, new I6(str, jSONObject), deviceMetadata)));
        Vf vf2 = this.f27061c;
        aVar.f27064c = 1;
        Object objA = vf2.a(c3304gh, aVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
