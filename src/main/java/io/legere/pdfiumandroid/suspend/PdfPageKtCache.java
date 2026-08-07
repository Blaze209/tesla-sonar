package io.legere.pdfiumandroid.suspend;

import java.lang.AutoCloseable;
import jn0.t;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SpillingKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R6\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PdfPageKtCache;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "H", "Lio/legere/pdfiumandroid/suspend/PdfPageSuspendCacheBase;", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "pdfDocument", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/Function3;", "Lio/legere/pdfiumandroid/suspend/PdfPageKt;", "Lio/legere/pdfiumandroid/suspend/PdfTextPageKt;", "Lkotlin/coroutines/Continuation;", "", "pageHolderFactory", "<init>", "(Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;Lkotlinx/coroutines/CoroutineDispatcher;Lwn0/q;)V", "", "pageIndex", "openPageAndText", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Lwn0/q;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfPageKtCache<H extends AutoCloseable> extends PdfPageSuspendCacheBase<H> {
    private final q<PdfPageKt, PdfTextPageKt, Continuation<? super H>, Object> pageHolderFactory;
    private final PdfDocumentKt pdfDocument;

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfPageKtCache$openPageAndText$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageKtCache", f = "PdfPageKtCache.kt", i = {0, 1, 1, 2, 2, 2}, l = {57, 58, 59}, m = "openPageAndText", n = {"pageIndex", "page", "pageIndex", "page", "textPage", "pageIndex"}, s = {"I$0", "L$0", "I$0", "L$0", "L$1", "I$0"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PdfPageKtCache<H> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PdfPageKtCache<H> pdfPageKtCache, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = pdfPageKtCache;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.openPageAndText(0, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdfPageKtCache(PdfDocumentKt pdfDocument, CoroutineDispatcher dispatcher, q<? super PdfPageKt, ? super PdfTextPageKt, ? super Continuation<? super H>, ? extends Object> pageHolderFactory) {
        super(dispatcher, 0L, 2, null);
        s.k(pdfDocument, "pdfDocument");
        s.k(dispatcher, "dispatcher");
        s.k(pageHolderFactory, "pageHolderFactory");
        this.pdfDocument = pdfDocument;
        this.pageHolderFactory = pageHolderFactory;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.legere.pdfiumandroid.suspend.PdfPageSuspendCacheBase
    protected Object openPageAndText(int i11, Continuation<? super H> continuation) {
        AnonymousClass1 anonymousClass1;
        PdfPageKt pdfPageKt;
        Object objInvoke;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i12 = anonymousClass1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i12 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object objOpenPage = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = anonymousClass1.label;
        if (i13 == 0) {
            t.b(objOpenPage);
            PdfDocumentKt pdfDocumentKt = this.pdfDocument;
            anonymousClass1.I$0 = i11;
            anonymousClass1.label = 1;
            objOpenPage = pdfDocumentKt.openPage(i11, anonymousClass1);
            if (objOpenPage != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            i11 = anonymousClass1.I$0;
            t.b(objOpenPage);
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(objOpenPage);
                return objOpenPage;
            }
            i11 = anonymousClass1.I$0;
            pdfPageKt = (PdfPageKt) anonymousClass1.L$0;
            t.b(objOpenPage);
        }
        PdfTextPageKt pdfTextPageKt = (PdfTextPageKt) objOpenPage;
        q<PdfPageKt, PdfTextPageKt, Continuation<? super H>, Object> qVar = this.pageHolderFactory;
        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(pdfPageKt);
        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(pdfTextPageKt);
        anonymousClass1.I$0 = i11;
        anonymousClass1.label = 3;
        objInvoke = qVar.invoke(pdfPageKt, pdfTextPageKt, anonymousClass1);
        if (objInvoke != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objInvoke;
        pdfPageKt = (PdfPageKt) objOpenPage;
        anonymousClass1.L$0 = pdfPageKt;
        anonymousClass1.I$0 = i11;
        anonymousClass1.label = 2;
        objOpenPage = pdfPageKt.openTextPage(anonymousClass1);
        if (objOpenPage != coroutine_suspended) {
            PdfTextPageKt pdfTextPageKt2 = (PdfTextPageKt) objOpenPage;
            q<PdfPageKt, PdfTextPageKt, Continuation<? super H>, Object> qVar2 = this.pageHolderFactory;
            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(pdfPageKt);
            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(pdfTextPageKt2);
            anonymousClass1.I$0 = i11;
            anonymousClass1.label = 3;
            objInvoke = qVar2.invoke(pdfPageKt, pdfTextPageKt2, anonymousClass1);
            if (objInvoke != coroutine_suspended) {
                return objInvoke;
            }
        }
        return coroutine_suspended;
    }

    public /* synthetic */ PdfPageKtCache(PdfDocumentKt pdfDocumentKt, CoroutineDispatcher coroutineDispatcher, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pdfDocumentKt, (i11 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, qVar);
    }
}
