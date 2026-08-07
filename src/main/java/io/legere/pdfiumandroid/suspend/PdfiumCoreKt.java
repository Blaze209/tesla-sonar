package io.legere.pdfiumandroid.suspend;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Keep;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.PdfiumSource;
import io.legere.pdfiumandroid.util.Config;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\"\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PdfiumCoreKt;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "config", "Lio/legere/pdfiumandroid/util/Config;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lio/legere/pdfiumandroid/util/Config;)V", "coreInternal", "Lio/legere/pdfiumandroid/PdfiumCore;", "newDocument", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "fd", "Landroid/os/ParcelFileDescriptor;", "(Landroid/os/ParcelFileDescriptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "password", "", "(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "([BLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/legere/pdfiumandroid/PdfiumSource;", "(Lio/legere/pdfiumandroid/PdfiumSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/legere/pdfiumandroid/PdfiumSource;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfiumCoreKt {
    private final PdfiumCore coreInternal;
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$10", f = "PdfiumCoreKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass10 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfDocumentKt>, Object> {
        final /* synthetic */ PdfiumSource $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(PdfiumSource pdfiumSource, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.$data = pdfiumSource;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfiumCoreKt.this.new AnonymousClass10(this.$data, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$data), PdfiumCoreKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfDocumentKt> continuation) {
            return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$12, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$12", f = "PdfiumCoreKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass12 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfDocumentKt>, Object> {
        final /* synthetic */ PdfiumSource $data;
        final /* synthetic */ String $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass12(PdfiumSource pdfiumSource, String str, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.$data = pdfiumSource;
            this.$password = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfiumCoreKt.this.new AnonymousClass12(this.$data, this.$password, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$data, this.$password), PdfiumCoreKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfDocumentKt> continuation) {
            return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$2", f = "PdfiumCoreKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfDocumentKt>, Object> {
        final /* synthetic */ ParcelFileDescriptor $fd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ParcelFileDescriptor parcelFileDescriptor, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$fd = parcelFileDescriptor;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfiumCoreKt.this.new AnonymousClass2(this.$fd, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$fd), PdfiumCoreKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfDocumentKt> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$4", f = "PdfiumCoreKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass4 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfDocumentKt>, Object> {
        final /* synthetic */ ParcelFileDescriptor $fd;
        final /* synthetic */ String $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ParcelFileDescriptor parcelFileDescriptor, String str, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$fd = parcelFileDescriptor;
            this.$password = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfiumCoreKt.this.new AnonymousClass4(this.$fd, this.$password, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$fd, this.$password), PdfiumCoreKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfDocumentKt> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$6", f = "PdfiumCoreKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass6 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfDocumentKt>, Object> {
        final /* synthetic */ byte[] $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(byte[] bArr, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$data = bArr;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfiumCoreKt.this.new AnonymousClass6(this.$data, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$data), PdfiumCoreKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfDocumentKt> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/legere/pdfiumandroid/suspend/PdfDocumentKt;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfiumCoreKt$newDocument$8", f = "PdfiumCoreKt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class AnonymousClass8 extends SuspendLambda implements p<CoroutineScope, Continuation<? super PdfDocumentKt>, Object> {
        final /* synthetic */ byte[] $data;
        final /* synthetic */ String $password;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(byte[] bArr, String str, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.$data = bArr;
            this.$password = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return PdfiumCoreKt.this.new AnonymousClass8(this.$data, this.$password, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return new PdfDocumentKt(PdfiumCoreKt.this.coreInternal.newDocument(this.$data, this.$password), PdfiumCoreKt.this.dispatcher);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PdfDocumentKt> continuation) {
            return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public PdfiumCoreKt(CoroutineDispatcher dispatcher, Config config) {
        s.k(dispatcher, "dispatcher");
        s.k(config, "config");
        this.dispatcher = dispatcher;
        this.coreInternal = new PdfiumCore(null, config, 1, null);
    }

    public final Object newDocument(ParcelFileDescriptor parcelFileDescriptor, Continuation<? super PdfDocumentKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass2(parcelFileDescriptor, null), continuation);
    }

    public final Object newDocument(ParcelFileDescriptor parcelFileDescriptor, String str, Continuation<? super PdfDocumentKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass4(parcelFileDescriptor, str, null), continuation);
    }

    public final Object newDocument(byte[] bArr, Continuation<? super PdfDocumentKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass6(bArr, null), continuation);
    }

    public /* synthetic */ PdfiumCoreKt(CoroutineDispatcher coroutineDispatcher, Config config, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineDispatcher, (i11 & 2) != 0 ? new Config(null, null, 3, null) : config);
    }

    public final Object newDocument(byte[] bArr, String str, Continuation<? super PdfDocumentKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass8(bArr, str, null), continuation);
    }

    public final Object newDocument(PdfiumSource pdfiumSource, Continuation<? super PdfDocumentKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass10(pdfiumSource, null), continuation);
    }

    public final Object newDocument(PdfiumSource pdfiumSource, String str, Continuation<? super PdfDocumentKt> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass12(pdfiumSource, str, null), continuation);
    }
}
