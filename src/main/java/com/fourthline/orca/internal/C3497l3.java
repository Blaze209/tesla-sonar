package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3497l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f33210a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l3$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f33211a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f33213c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33211a = obj;
            this.f33213c |= Integer.MIN_VALUE;
            return C3497l3.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l3$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33214a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f33216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f33216c = uri;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3497l3.this.new b(this.f33216c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f33214a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            try {
                if (Build.VERSION.SDK_INT < 28) {
                    return MediaStore.Images.Media.getBitmap(C3497l3.this.f33210a, this.f33216c);
                }
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(C3497l3.this.f33210a, this.f33216c);
                p013kotlin.jvm.internal.s.j(sourceCreateSource, "createSource(...)");
                return ImageDecoder.decodeBitmap(sourceCreateSource);
            } catch (Exception e11) {
                e11.printStackTrace();
                throw e11;
            }
        }
    }

    public C3497l3(ContentResolver contentResolver) {
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        this.f33210a = contentResolver;
    }

    public final Long b(Uri uri) throws FileNotFoundException {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f33210a.openFileDescriptor(uri, "r");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            return null;
        }
        try {
            Long lValueOf = Long.valueOf(parcelFileDescriptorOpenFileDescriptor.getStatSize());
            sn0.b.a(parcelFileDescriptorOpenFileDescriptor, null);
            return lValueOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(parcelFileDescriptorOpenFileDescriptor, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Uri uri, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f33213c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f33213c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f33211a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f33213c;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(uri, null);
            aVar.f33213c = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objWithContext);
        }
        p013kotlin.jvm.internal.s.j(objWithContext, "withContext(...)");
        return objWithContext;
    }

    public final String a(Uri uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        return this.f33210a.getType(uri);
    }
}
