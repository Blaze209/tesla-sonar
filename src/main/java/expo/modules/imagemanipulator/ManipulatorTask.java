package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import expo.modules.imagemanipulator.transformers.ImageTransformer;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R*\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/imagemanipulator/ManipulatorTask;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/Bitmap;", "loader", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "Lkotlinx/coroutines/Deferred;", "Lexpo/modules/imagemanipulator/ManipulatorResult;", "launchLoader", "()Lkotlinx/coroutines/Deferred;", "Lexpo/modules/imagemanipulator/transformers/ImageTransformer;", "transformer", "Ljn0/h0;", "addTransformer", "(Lexpo/modules/imagemanipulator/transformers/ImageTransformer;)V", "render", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "()V", "cancel", "Lkotlinx/coroutines/CoroutineScope;", "Lwn0/l;", "task", "Lkotlinx/coroutines/Deferred;", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManipulatorTask {
    private final CoroutineScope coroutineScope;
    private final l<Continuation<? super Bitmap>, Object> loader;
    private Deferred<ManipulatorResult> task;

    /* JADX INFO: renamed from: expo.modules.imagemanipulator.ManipulatorTask$addTransformer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagemanipulator/ManipulatorResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagemanipulator.ManipulatorTask$addTransformer$1", f = "ImageManipulatorContext.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super ManipulatorResult>, Object> {
        final /* synthetic */ Deferred<ManipulatorResult> $oldTask;
        final /* synthetic */ ImageTransformer $transformer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Deferred<ManipulatorResult> deferred, ImageTransformer imageTransformer, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$oldTask = deferred;
            this.$transformer = imageTransformer;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$oldTask, this.$transformer, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                Deferred<ManipulatorResult> deferred = this.$oldTask;
                this.label = 1;
                obj = deferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return ((ManipulatorResult) obj).map(this.$transformer);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ManipulatorResult> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagemanipulator.ManipulatorTask$launchLoader$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagemanipulator/ManipulatorResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagemanipulator.ManipulatorTask$launchLoader$1", f = "ImageManipulatorContext.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class C46251 extends SuspendLambda implements p<CoroutineScope, Continuation<? super ManipulatorResult>, Object> {
        int label;

        C46251(Continuation<? super C46251> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return ManipulatorTask.this.new C46251(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CodedException unexpectedException;
            CodedException codedException;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    l lVar = ManipulatorTask.this.loader;
                    this.label = 1;
                    obj = lVar.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return new ManipulatorResult((Bitmap) obj, null);
            } catch (Throwable th2) {
                if (th2 instanceof CodedException) {
                    codedException = (CodedException) th2;
                } else {
                    if (th2 instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th2;
                        String code = codedException2.getCode();
                        s.j(code, "getCode(...)");
                        unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    codedException = unexpectedException;
                }
                return new ManipulatorResult(null, codedException);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ManipulatorResult> continuation) {
            return ((C46251) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagemanipulator.ManipulatorTask$render$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagemanipulator.ManipulatorTask", f = "ImageManipulatorContext.kt", i = {}, l = {65}, m = "render", n = {}, s = {})
    static final class C46261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C46261(Continuation<? super C46261> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ManipulatorTask.this.render(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ManipulatorTask(CoroutineScope coroutineScope, l<? super Continuation<? super Bitmap>, ? extends Object> loader) {
        s.k(coroutineScope, "coroutineScope");
        s.k(loader, "loader");
        this.coroutineScope = coroutineScope;
        this.loader = loader;
        this.task = launchLoader();
    }

    private final Deferred<ManipulatorResult> launchLoader() {
        return BuildersKt__Builders_commonKt.async$default(this.coroutineScope, null, null, new C46251(null), 3, null);
    }

    public final void addTransformer(ImageTransformer transformer) {
        s.k(transformer, "transformer");
        this.task = BuildersKt__Builders_commonKt.async$default(this.coroutineScope, null, null, new AnonymousClass1(this.task, transformer, null), 3, null);
    }

    public final void cancel() {
        Job.DefaultImpls.cancel$default((Job) this.task, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object render(Continuation<? super Bitmap> continuation) {
        C46261 c46261;
        if (continuation instanceof C46261) {
            c46261 = (C46261) continuation;
            int i11 = c46261.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c46261.label = i11 - Integer.MIN_VALUE;
            } else {
                c46261 = new C46261(continuation);
            }
        } else {
            c46261 = new C46261(continuation);
        }
        Object objAwait = c46261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c46261.label;
        if (i12 == 0) {
            t.b(objAwait);
            Deferred<ManipulatorResult> deferred = this.task;
            c46261.label = 1;
            objAwait = deferred.await(c46261);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objAwait);
        }
        return ((ManipulatorResult) objAwait).get();
    }

    public final void reset() {
        Job.DefaultImpls.cancel$default((Job) this.task, (CancellationException) null, 1, (Object) null);
        this.task = launchLoader();
    }
}
