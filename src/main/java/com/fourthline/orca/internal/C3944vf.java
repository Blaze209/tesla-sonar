package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.fourthline.core.ContextExtensionsKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3944vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f36104b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vf$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36105a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f36107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f36107c = uri;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3944vf.this.new a(this.f36107c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f36105a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            try {
                InputStream inputStreamOpenInputStream = C3944vf.this.f36104b.openInputStream(this.f36107c);
                if (inputStreamOpenInputStream != null) {
                    C3944vf c3944vf = C3944vf.this;
                    Uri uri = this.f36107c;
                    try {
                        File file = new File(new File(ContextExtensionsKt.getFourthlineDirectory(c3944vf.f36103a)), UUID.randomUUID() + "." + c3944vf.a(uri));
                        sn0.a.b(inputStreamOpenInputStream, new FileOutputStream(file), 0, 2, null);
                        URI uri2 = file.toURI();
                        sn0.b.a(inputStreamOpenInputStream, null);
                        if (uri2 != null) {
                            return uri2;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(inputStreamOpenInputStream, th2);
                            throw th3;
                        }
                    }
                }
                throw new FileNotFoundException();
            } catch (Exception e11) {
                e11.printStackTrace();
                throw e11;
            }
        }
    }

    public C3944vf(Context context, ContentResolver contentResolver) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        this.f36103a = context;
        this.f36104b = contentResolver;
    }

    public final Object a(Uri uri, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(uri, null), continuation);
    }

    public final String a(Uri uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        String type = this.f36104b.getType(uri);
        if (type != null && type.hashCode() == -1248334925 && type.equals("application/pdf")) {
            return "pdf";
        }
        throw new jn0.q("File Writing for other types than PDF is not supported.");
    }
}
