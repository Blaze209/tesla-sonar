package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import java.util.Date;
import java.util.HashMap;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import zf0.ExtractedTexts;
import zf0.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/g;", "Lag0/b;", "<init>", "()V", "Lag0/f;", "b", "()Lag0/f;", "Lzf0/i0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljn0/s;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "a", "(Lzf0/i0;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lag0/f;", "textEntityExtractor", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "previousReadings", "c", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements ag0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ag0.f textEntityExtractor = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, Integer> previousReadings = new HashMap<>();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer", f = "TextExtractionAnalyzer.kt", i = {0}, l = {26}, m = "analyze-0E7RQCE", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57185n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f57186o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f57188q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57186o = obj;
            this.f57188q |= Integer.MIN_VALUE;
            Object objA = g.this.a(null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    private final ag0.f b() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.camera.analyzers.TextEntityExtractor");
            return (ag0.f) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ag0.b
    public Object a(i0 i0Var, Rect rect, Continuation<? super s<? extends a>> continuation) {
        b bVar;
        g gVar;
        s sVar;
        a aVar;
        boolean z11;
        Date expirationDate;
        boolean z12;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        Object value;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f57188q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f57188q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objA = bVar.f57186o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f57188q;
        Date dateOfBirth = null;
        if (i12 == 0) {
            t.b(objA);
            ag0.f fVar = this.textEntityExtractor;
            if (fVar != null) {
                wx.a aVarB = i0Var.b();
                bVar.f57185n = this;
                bVar.f57188q = 1;
                objA = fVar.a(aVarB, bVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = this;
            } else {
                gVar = this;
                sVar = null;
            }
            if (sVar != null) {
                value = sVar.getValue();
                if (s.g(value)) {
                    value = null;
                }
                aVar = (a) value;
            } else {
                aVar = null;
            }
            z11 = aVar instanceof a.f;
            if (z11) {
                a.f fVar2 = (a.f) aVar;
                dateOfBirth = fVar2.getExtractedTexts().getDateOfBirth();
                expirationDate = fVar2.getExtractedTexts().getExpirationDate();
            } else {
                expirationDate = null;
            }
            if (dateOfBirth != null && expirationDate != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dateOfBirth);
                sb2.append(expirationDate);
                String string = sb2.toString();
                HashMap<String, Integer> map = gVar.previousReadings;
                num2 = map.get(string);
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                map.put(string, Boxing.boxInt(iIntValue2 + 1));
            }
            if (dateOfBirth != null || expirationDate == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            HashMap<String, Integer> map2 = gVar.previousReadings;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(dateOfBirth);
            sb3.append(expirationDate);
            num = map2.get(sb3.toString());
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            boolean z13 = iIntValue >= 3;
            if (z12 || !z13) {
                if (z11) {
                    s.Companion companion = s.INSTANCE;
                    return s.b(a.b.f57156a);
                }
                if (sVar != null) {
                    return sVar.getValue();
                }
                s.Companion companion2 = s.INSTANCE;
                return s.b(a.b.f57156a);
            }
            ag0.f fVar3 = gVar.textEntityExtractor;
            if (fVar3 != null) {
                fVar3.close();
            }
            s.Companion companion3 = s.INSTANCE;
            p013kotlin.jvm.internal.s.h(dateOfBirth);
            p013kotlin.jvm.internal.s.h(expirationDate);
            return s.b(new a.f(new ExtractedTexts(dateOfBirth, expirationDate)));
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gVar = (g) bVar.f57185n;
        t.b(objA);
        sVar = (s) objA;
        if (sVar != null) {
            value = sVar.getValue();
            if (s.g(value)) {
                value = null;
            }
            aVar = (a) value;
        } else {
            aVar = null;
        }
        z11 = aVar instanceof a.f;
        if (z11) {
            a.f fVar4 = (a.f) aVar;
            dateOfBirth = fVar4.getExtractedTexts().getDateOfBirth();
            expirationDate = fVar4.getExtractedTexts().getExpirationDate();
        } else {
            expirationDate = null;
        }
        if (dateOfBirth != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(dateOfBirth);
            sb4.append(expirationDate);
            String string2 = sb4.toString();
            HashMap<String, Integer> map3 = gVar.previousReadings;
            num2 = map3.get(string2);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            map3.put(string2, Boxing.boxInt(iIntValue2 + 1));
        }
        if (dateOfBirth != null) {
            z12 = false;
        } else {
            z12 = false;
        }
        HashMap<String, Integer> map4 = gVar.previousReadings;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(dateOfBirth);
        sb5.append(expirationDate);
        num = map4.get(sb5.toString());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (iIntValue >= 3) {
        }
        if (z12) {
        }
        if (z11) {
            s.Companion companion4 = s.INSTANCE;
            return s.b(a.b.f57156a);
        }
        if (sVar != null) {
            return sVar.getValue();
        }
        s.Companion companion5 = s.INSTANCE;
        return s.b(a.b.f57156a);
    }
}
