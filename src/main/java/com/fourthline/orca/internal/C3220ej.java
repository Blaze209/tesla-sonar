package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import ch.qos.logback.core.joran.action.Action;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Map;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3220ej implements WC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f31445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gl f31446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f31447c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ej$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31448a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31450c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31448a = obj;
            this.f31450c |= Integer.MIN_VALUE;
            Object objA = C3220ej.this.a(null, 0L, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3220ej(wn0.a workflowIdProvider, Gl networkService, double d11) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        this.f31445a = workflowIdProvider;
        this.f31446b = networkService;
        this.f31447c = d11;
    }

    @Override // com.fourthline.orca.internal.WC
    public void a(WC.a input) {
        p013kotlin.jvm.internal.s.k(input, "input");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.WC
    public Object a(WC.a aVar, long j11, Continuation continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f31450c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f31450c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f31448a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f31450c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        int i13 = (int) (this.f31447c * ((double) 100));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aVar.b().compress(Bitmap.CompressFormat.JPEG, i13, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
            Cl.c.a aVar3 = new Cl.c.a(Action.FILE_ATTRIBUTE, new C3842t5(byteArray), AbstractC3345hf.a(AbstractC3345hf.c(), aVar.c() + ".jpeg"));
            sn0.b.a(byteArrayOutputStream, null);
            Gl gl2 = this.f31446b;
            Map mapF = AbstractC3345hf.f();
            String str = (String) this.f31445a.invoke();
            Charset charset = p013kotlin.text.d.UTF_8;
            byte[] bytes = str.getBytes(charset);
            p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
            Cl.c.a aVar4 = new Cl.c.a("workflowId", new C3842t5(bytes), null, 4, null);
            byte[] bytes2 = aVar.a().getBytes(charset);
            p013kotlin.jvm.internal.s.j(bytes2, "getBytes(...)");
            Cl.c.a aVar5 = new Cl.c.a("documentId", new C3842t5(bytes2), null, 4, null);
            byte[] bytes3 = aVar.c().getBytes(charset);
            p013kotlin.jvm.internal.s.j(bytes3, "getBytes(...)");
            Cl.c cVar = new Cl.c("workflow_document_analysis", "/v1/onboarding/document-analysis", mapF, null, p013kotlin.collections.v.p(aVar4, aVar5, new Cl.c.a("imageId", new C3842t5(bytes3), null, 4, null), aVar3), 8, null);
            aVar2.f31450c = 1;
            Object objA = gl2.a(cVar, aVar2);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
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
