package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.vision.QrScanner;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.if, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Cif implements InterfaceC3921uz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MA f32510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3429jf f32511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.l f32512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3463kC f32513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private QrScanner f32514e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.if$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32516b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32518d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32516b = obj;
            this.f32518d |= Integer.MIN_VALUE;
            return Cif.this.a(null, null, this);
        }
    }

    public Cif(MA targetTaxationCountry, InterfaceC3429jf extractTinResultRepository, wn0.l tinPresenceValidator, InterfaceC3463kC tinValidator) {
        p013kotlin.jvm.internal.s.k(targetTaxationCountry, "targetTaxationCountry");
        p013kotlin.jvm.internal.s.k(extractTinResultRepository, "extractTinResultRepository");
        p013kotlin.jvm.internal.s.k(tinPresenceValidator, "tinPresenceValidator");
        p013kotlin.jvm.internal.s.k(tinValidator, "tinValidator");
        this.f32510a = targetTaxationCountry;
        this.f32511b = extractTinResultRepository;
        this.f32512c = tinPresenceValidator;
        this.f32513d = tinValidator;
    }

    private final QrScanner a() {
        QrScanner qrScanner = this.f32514e;
        if (qrScanner != null) {
            return qrScanner;
        }
        QrScanner qrScanner2 = new QrScanner();
        this.f32514e = qrScanner2;
        return qrScanner2;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    public void reset() {
        QrScanner qrScanner = this.f32514e;
        if (qrScanner != null) {
            qrScanner.close();
        }
        this.f32514e = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3921uz
    public Object a(C3640ob c3640ob, Gz gz2, Continuation continuation) {
        a aVar;
        Cif cif;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f32518d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f32518d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objScan = aVar.f32516b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f32518d;
        if (i12 == 0) {
            jn0.t.b(objScan);
            if (((Boolean) this.f32512c.invoke(gz2)).booleanValue()) {
                c3640ob.i().a(c3640ob.k().e(true));
                QrScanner qrScannerA = a();
                Bitmap cropped = gz2.d().getImage().getCropped();
                aVar.f32515a = this;
                aVar.f32518d = 1;
                objScan = qrScannerA.scan(cropped, aVar);
                if (objScan == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cif = this;
            }
            return InterfaceC3921uz.b.MoveToTheNextStep;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cif = (Cif) aVar.f32515a;
        jn0.t.b(objScan);
        String str = (String) objScan;
        if (str != null && cif.f32513d.a(str) == EnumC3420jC.SUCCESS) {
            cif.f32511b.a(str, cif.f32510a);
        }
        return InterfaceC3921uz.b.MoveToTheNextStep;
    }
}
