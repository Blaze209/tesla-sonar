package com.plaid.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.p002activity.result.contract.ActivityResultContract;
import androidx.p002activity.result.contract.ActivityResultContracts$TakePicture;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4436h7 extends ActivityResultContract<jn0.h0, Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4443i5 f47719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityResultContracts$TakePicture f47720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Uri> f47721c;

    /* JADX INFO: renamed from: com.plaid.internal.h7$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.TakePictureWithAppInternalUri$createInternalUri$file$1", f = "TakePictureWithAppInternalUri.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super File>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47722a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4436h7.this.new a(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return C4436h7.this.new a(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f47722a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            C4443i5 c4443i5 = C4436h7.this.f47719a;
            String strValueOf = String.valueOf(UUID.randomUUID());
            this.f47722a = 1;
            c4443i5.getClass();
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C4398d5(c4443i5, strValueOf, null), this);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        }
    }

    public C4436h7(C4443i5 internalPictureStorage) {
        p013kotlin.jvm.internal.s.k(internalPictureStorage, "internalPictureStorage");
        this.f47719a = internalPictureStorage;
        this.f47720b = new ActivityResultContracts$TakePicture();
        this.f47721c = new AtomicReference<>();
    }

    public final Uri a(Context context) {
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".com.plaid.link.internal.PlaidFileProvider", (File) BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null));
            p013kotlin.jvm.internal.s.h(uriForFile);
            return uriForFile;
        } catch (IOException e11) {
            T6.a.a(e11, "TakePictureWithAppInternalUri - Unable to create file");
            Uri uri = Uri.EMPTY;
            p013kotlin.jvm.internal.s.h(uri);
            return uri;
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, jn0.h0 h0Var) {
        jn0.h0 input = h0Var;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(input, "input");
        Uri uriA = a(context);
        if (androidx.camera.view.i.a(this.f47721c, null, uriA)) {
            p013kotlin.jvm.internal.s.k("TakePictureWithAppInternalUri - Result URI was already set", "message");
            X5.a.b(X5.f46812a, "TakePictureWithAppInternalUri - Result URI was already set");
            J5 j11 = T6.f46721a;
            if (j11 != null) {
                j11.a("TakePictureWithAppInternalUri - Result URI was already set");
            }
        }
        Intent intentCreateIntent = this.f47720b.createIntent(context, uriA);
        intentCreateIntent.addFlags(2);
        return intentCreateIntent;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    public final ActivityResultContract.a<Uri> getSynchronousResult(Context context, jn0.h0 h0Var) {
        jn0.h0 input = h0Var;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(input, "input");
        return null;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    public final Uri parseResult(int i11, Intent intent) {
        if (i11 != -1) {
            Uri EMPTY = Uri.EMPTY;
            p013kotlin.jvm.internal.s.j(EMPTY, "EMPTY");
            return EMPTY;
        }
        Uri andSet = this.f47721c.getAndSet(null);
        if (andSet != null) {
            return andSet;
        }
        p013kotlin.jvm.internal.s.k("TakePictureWithAppInternalUri - Result URI should not be null", "message");
        X5.a.b(X5.f46812a, "TakePictureWithAppInternalUri - Result URI should not be null");
        J5 j11 = T6.f46721a;
        if (j11 != null) {
            j11.a("TakePictureWithAppInternalUri - Result URI should not be null");
        }
        Uri uri = Uri.EMPTY;
        p013kotlin.jvm.internal.s.h(uri);
        return uri;
    }
}
