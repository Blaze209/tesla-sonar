package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4037xl implements Zv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.l f36760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f36761b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36762a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36764c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36762a = obj;
            this.f36764c |= Integer.MIN_VALUE;
            Object objA = C4037xl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C4037xl(wn0.l endpoint, Gl networkService) {
        p013kotlin.jvm.internal.s.k(endpoint, "endpoint");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f36760a = endpoint;
        this.f36761b = networkService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Zv
    public Object a(Zv.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f36764c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f36764c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f36762a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f36764c;
        if (i12 == 0) {
            jn0.t.b(obj);
            Gl gl2 = this.f36761b;
            Cl.c cVar = new Cl.c("qes_upload_selfie", ((C2911Ne) this.f36760a.invoke(aVar.b())).a(), AbstractC3345hf.f(), null, p013kotlin.collections.v.e(a(aVar.a())), 8, null);
            aVar2.f36764c = 1;
            objA = gl2.a(cVar, aVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
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
            return jn0.s.b(Zv.b.C0538b.f30136a);
        }
        if (dl2.c() == 422) {
            return jn0.s.b(Zv.b.a.f30135a);
        }
        if (El.d(dl2)) {
            return jn0.s.b(jn0.t.a(ZD.c.f30009a));
        }
        return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesUploadSelfieWorker." + dl2.c())));
    }

    private final Cl.c.a a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
            Cl.c.a aVar = new Cl.c.a("selfie", new C3842t5(byteArray), AbstractC3345hf.a(AbstractC3345hf.c(), "selfie.jpeg"));
            sn0.b.a(byteArrayOutputStream, null);
            return aVar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }
}
