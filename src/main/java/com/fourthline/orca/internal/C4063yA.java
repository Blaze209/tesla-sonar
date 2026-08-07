package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlinx.coroutines.DelayKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4063yA implements InterfaceC3681pF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f36948a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yA$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36951c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f36953e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36951c = obj;
            this.f36953e |= Integer.MIN_VALUE;
            Object objA = C4063yA.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C4063yA(long j11) {
        this.f36948a = j11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3681pF
    public Object a(InterfaceC3681pF.a aVar, Continuation continuation) {
        a aVar2;
        C4063yA c4063yA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f36953e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f36953e = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f36951c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f36953e;
        if (i12 == 0) {
            jn0.t.b(obj);
            long j11 = this.f36948a;
            aVar2.f36949a = this;
            aVar2.f36950b = aVar;
            aVar2.f36953e = 1;
            if (DelayKt.delay(j11, aVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c4063yA = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (InterfaceC3681pF.a) aVar2.f36950b;
            c4063yA = (C4063yA) aVar2.f36949a;
            jn0.t.b(obj);
        }
        String strB = aVar.b();
        if (p013kotlin.text.t.y0(strB)) {
            strB = "IDVandQESandBAV";
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            String str = "workflow:" + UUID.randomUUID();
            String upperCase = strB.toUpperCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            List listF1 = p013kotlin.text.t.f1(upperCase, new String[]{"AND"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listF1, 10));
            Iterator it = listF1.iterator();
            while (it.hasNext()) {
                arrayList.add(c4063yA.a((String) it.next()));
            }
            return jn0.s.b(new InterfaceC3681pF.b.C0596b(new WorkflowStartSessionResponse(str, strB, arrayList, p013kotlin.collections.v.p(new AccessToken("Onboarding", "onboardingAccessToken:" + UUID.randomUUID()), new AccessToken("Status", "statusAccessToken:" + UUID.randomUUID()))), NetworkEnvironment.Mock.INSTANCE));
        } catch (Exception unused) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(InterfaceC3681pF.b.a.f34473a);
        }
    }

    public /* synthetic */ C4063yA(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1000L : j11);
    }

    private final WorkflowModule a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 65527) {
            if (iHashCode != 72347) {
                if (iHashCode == 80063 && str.equals("QES")) {
                    return new WorkflowModule("QualifiedElectronicSignature");
                }
            } else if (str.equals("IDV")) {
                return new WorkflowModule("IdentityVerification");
            }
        } else if (str.equals("BAV")) {
            return new WorkflowModule("BankAccountVerification");
        }
        throw new IllegalStateException(("Don't support " + str + " module").toString());
    }
}
