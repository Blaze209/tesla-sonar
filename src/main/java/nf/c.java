package nf;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.core.exception.CheckoutException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001'B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JL\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJX\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#JL\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lnf/c;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpe/d;", "permissionHandler", "Landroid/graphics/Bitmap;", "bitmap", "", "fileName", "fileRelativePath", "Ljn0/s;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Lpe/d;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/ContentValues;", "contentValues", "h", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/content/ContentValues;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Landroid/content/Context;Lpe/d;Landroid/graphics/Bitmap;Landroid/content/ContentValues;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Landroid/graphics/Bitmap;Landroid/content/ContentValues;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/net/URL;", "n", "(Ljava/lang/String;)Ljava/net/URL;", "Landroid/view/View;", "view", "", "backgroundColor", "l", "(Landroid/content/Context;Lpe/d;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageUrl", "j", "(Landroid/content/Context;Lpe/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", i = {}, l = {161}, m = "saveImageApi28AndBelow-yxL6bBk", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f94868n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f94870p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94868n = obj;
            this.f94870p |= Integer.MIN_VALUE;
            Object objF = c.this.f(null, null, null, null, this);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : s.a(objF);
        }
    }

    /* JADX INFO: renamed from: nf.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelow$2", f = "ImageSaver.kt", i = {0}, l = {162, 163}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
    static final class C2016c extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends h0>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f94871n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f94872o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ pe.d f94873p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Context f94874q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f94875r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Bitmap f94876s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ContentValues f94877t;

        /* JADX INFO: renamed from: nf.c$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f94878a;

            static {
                int[] iArr = new int[nf.h.values().length];
                try {
                    iArr[nf.h.PERMISSION_GRANTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nf.h.PERMISSION_REQUEST_NOT_HANDLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f94878a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2016c(pe.d dVar, Context context, c cVar, Bitmap bitmap, ContentValues contentValues, Continuation<? super C2016c> continuation) {
            super(2, continuation);
            this.f94873p = dVar;
            this.f94874q = context;
            this.f94875r = cVar;
            this.f94876s = bitmap;
            this.f94877t = contentValues;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2016c c2016c = new C2016c(this.f94873p, this.f94874q, this.f94875r, this.f94876s, this.f94877t, continuation);
            c2016c.f94872o = obj;
            return c2016c;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends h0>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<h0>>) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
        
            if (r8 == r0) goto L27;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.c.C2016c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<h0>> continuation) {
            return ((C2016c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", i = {}, l = {177}, m = "saveImageApi28AndBelowWhenPermissionGranted-0E7RQCE", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f94879n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f94881p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94879n = obj;
            this.f94881p |= Integer.MIN_VALUE;
            Object objG = c.this.g(null, null, this);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : s.a(objG);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi28AndBelowWhenPermissionGranted$2", f = "ImageSaver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends h0>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f94882n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f94883o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ContentValues f94884p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Bitmap f94885q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ContentValues contentValues, Bitmap bitmap, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f94884p = contentValues;
            this.f94885q = bitmap;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f94884p, this.f94885q, continuation);
            eVar.f94883o = obj;
            return eVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends h0>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<h0>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f94882n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f94883o;
            String asString = this.f94884p.getAsString("_display_name");
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(this.f94884p.getAsString("relative_path"));
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, asString));
                this.f94885q.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                me.a aVar = me.a.DEBUG;
                me.b.Companion companion = me.b.INSTANCE;
                if (companion.a().a(aVar)) {
                    String name = coroutineScope.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name);
                    String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    companion.a().b(aVar, "CO." + name, "Bitmap successfully saved as an image", null);
                }
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(h0.f84049a);
            } catch (FileNotFoundException e11) {
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(new CheckoutException("File not found: ", e11)));
            } catch (SecurityException e12) {
                s.Companion companion4 = s.INSTANCE;
                objB = s.b(t.a(new CheckoutException("Security violation: ", e12)));
            }
            return s.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<h0>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", i = {}, l = {132}, m = "saveImageApi29AndAbove-BWLJW6A", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f94886n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f94888p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94886n = obj;
            this.f94888p |= Integer.MIN_VALUE;
            Object objH = c.this.h(null, null, null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : s.a(objH);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageApi29AndAbove$2", f = "ImageSaver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends h0>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f94889n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f94890o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ContentValues f94891p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Context f94892q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Bitmap f94893r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ContentValues contentValues, Context context, Bitmap bitmap, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f94891p = contentValues;
            this.f94892q = context;
            this.f94893r = bitmap;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f94891p, this.f94892q, this.f94893r, continuation);
            gVar.f94890o = obj;
            return gVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends h0>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<h0>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f94889n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f94890o;
            this.f94891p.put("is_pending", Boxing.boxBoolean(true));
            Uri uriInsert = this.f94892q.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, this.f94891p);
            if (uriInsert == null) {
                s.Companion companion = s.INSTANCE;
                return s.a(s.b(t.a(new CheckoutException("Error when saving Bitmap as an image: URI is null", null, 2, null))));
            }
            try {
                OutputStream outputStreamOpenOutputStream = this.f94892q.getContentResolver().openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream == null) {
                    s.Companion companion2 = s.INSTANCE;
                    return s.a(s.b(t.a(new CheckoutException("Output stream is null", null, 2, null))));
                }
                this.f94891p.put("is_pending", Boxing.boxBoolean(false));
                this.f94892q.getContentResolver().update(uriInsert, this.f94891p, null, null);
                this.f94893r.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
                me.a aVar = me.a.DEBUG;
                me.b.Companion companion3 = me.b.INSTANCE;
                if (companion3.a().a(aVar)) {
                    String name = coroutineScope.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name);
                    String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    companion3.a().b(aVar, "CO." + name, "Bitmap successfully saved as an image", null);
                }
                s.Companion companion4 = s.INSTANCE;
                objB = s.b(h0.f84049a);
                return s.a(objB);
            } catch (FileNotFoundException e11) {
                s.Companion companion5 = s.INSTANCE;
                objB = s.b(t.a(new CheckoutException("File not found: ", e11)));
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<h0>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", i = {0, 1}, l = {119, 121}, m = "saveImageFromBitmap-hUnOzRk", n = {"bitmap", "bitmap"}, s = {"L$0", "L$0"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f94894n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f94895o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f94897q;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94895o = obj;
            this.f94897q |= Integer.MIN_VALUE;
            Object objI = c.this.i(null, null, null, null, null, this);
            return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : s.a(objI);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", i = {}, l = {86}, m = "saveImageFromUrl-hUnOzRk", n = {}, s = {})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f94898n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f94900p;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94898n = obj;
            this.f94900p |= Integer.MIN_VALUE;
            Object objJ = c.this.j(null, null, null, null, null, this);
            return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : s.a(objJ);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver$saveImageFromUrl$2", f = "ImageSaver.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends h0>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f94901n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f94903p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Context f94904q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ pe.d f94905r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f94906s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f94907t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Context context, pe.d dVar, String str2, String str3, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f94903p = str;
            this.f94904q = context;
            this.f94905r = dVar;
            this.f94906s = str2;
            this.f94907t = str3;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new j(this.f94903p, this.f94904q, this.f94905r, this.f94906s, this.f94907t, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends h0>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<h0>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f94901n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    URL urlN = c.this.n(this.f94903p);
                    if (urlN == null) {
                        s.Companion companion = s.INSTANCE;
                        return s.a(s.b(t.a(new CheckoutException("Malformed URL", null, 2, null))));
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(FirebasePerfUrlConnection.openStream(urlN)));
                    c cVar = c.this;
                    Context context = this.f94904q;
                    pe.d dVar = this.f94905r;
                    p013kotlin.jvm.internal.s.h(bitmapDecodeStream);
                    String str = this.f94906s;
                    String str2 = this.f94907t;
                    this.f94901n = 1;
                    objB = cVar.i(context, dVar, bitmapDecodeStream, str, str2, this);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    objB = ((s) obj).getValue();
                }
            } catch (IOException e11) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(new CheckoutException("Malformed URL: " + e11, null, 2, null)));
            }
            return s.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<h0>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.util.ImageSaver", f = "ImageSaver.kt", i = {}, l = {77}, m = "saveImageFromView-bMdYcbs", n = {}, s = {})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f94908n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f94910p;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94908n = obj;
            this.f94910p |= Integer.MIN_VALUE;
            Object objL = c.this.l(null, null, null, null, null, null, this);
            return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : s.a(objL);
        }
    }

    public c(CoroutineDispatcher dispatcher) {
        p013kotlin.jvm.internal.s.k(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @SuppressLint({"MissingPermission"})
    public final Object f(Context context, pe.d dVar, Bitmap bitmap, ContentValues contentValues, Continuation<? super s<h0>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f94870p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f94870p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objWithContext = bVar2.f94868n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar2.f94870p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.dispatcher;
            C2016c c2016c = new C2016c(dVar, context, this, bitmap, contentValues, null);
            bVar2.f94870p = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, c2016c, bVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Bitmap bitmap, ContentValues contentValues, Continuation<? super s<h0>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f94881p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f94881p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithContext = dVar.f94879n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f94881p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.dispatcher;
            e eVar = new e(contentValues, bitmap, null);
            dVar.f94881p = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, eVar, dVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Context context, Bitmap bitmap, ContentValues contentValues, Continuation<? super s<h0>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f94888p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f94888p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objWithContext = fVar.f94886n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f94888p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.dispatcher;
            g gVar = new g(contentValues, context, bitmap, null);
            fVar.f94888p = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, gVar, fVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r9 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.content.Context r9, pe.d r10, android.graphics.Bitmap r11, java.lang.String r12, java.lang.String r13, p013kotlin.coroutines.Continuation<? super jn0.s<jn0.h0>> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof nf.c.h
            if (r0 == 0) goto L14
            r0 = r14
            nf.c$h r0 = (nf.c.h) r0
            int r1 = r0.f94897q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f94897q = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            nf.c$h r0 = new nf.c$h
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.f94895o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r14.f94897q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L2a
            if (r2 != r3) goto L39
        L2a:
            java.lang.Object r9 = r14.f94894n
            r11 = r9
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            jn0.t.b(r0)
            jn0.s r0 = (jn0.s) r0
            java.lang.Object r9 = r0.getValue()
            goto L9d
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L41:
            jn0.t.b(r0)
            long r5 = java.lang.System.currentTimeMillis()
            if (r12 != 0) goto L4e
            java.lang.String r12 = java.lang.String.valueOf(r5)
        L4e:
            if (r13 != 0) goto L52
            java.lang.String r13 = android.os.Environment.DIRECTORY_DOWNLOADS
        L52:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r2 = "mime_type"
            java.lang.String r7 = "image/png"
            r0.put(r2, r7)
            java.lang.String r2 = "date_added"
            java.lang.Long r7 = p013kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r0.put(r2, r7)
            java.lang.String r2 = "datetaken"
            java.lang.Long r5 = p013kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r0.put(r2, r5)
            java.lang.String r2 = "_display_name"
            r0.put(r2, r12)
            java.lang.String r12 = "relative_path"
            r0.put(r12, r13)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 29
            if (r12 < r13) goto L8b
            r14.f94894n = r11
            r14.f94897q = r4
            java.lang.Object r9 = r8.h(r9, r11, r0, r14)
            if (r9 != r1) goto L9d
            goto L9a
        L8b:
            r14.f94894n = r11
            r14.f94897q = r3
            r12 = r11
            r13 = r0
            r11 = r10
            r10 = r9
            r9 = r8
            java.lang.Object r10 = r9.f(r10, r11, r12, r13, r14)
            if (r10 != r1) goto L9b
        L9a:
            return r1
        L9b:
            r9 = r10
            r11 = r12
        L9d:
            r11.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.c.i(android.content.Context, pe.d, android.graphics.Bitmap, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object k(c cVar, Context context, pe.d dVar, String str, String str2, String str3, Continuation continuation, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        return cVar.j(context, dVar, str, str2, str3, continuation);
    }

    public static /* synthetic */ Object m(c cVar, Context context, pe.d dVar, View view, Integer num, String str, String str2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        if ((i11 & 16) != 0) {
            str = null;
        }
        if ((i11 & 32) != 0) {
            str2 = null;
        }
        return cVar.l(context, dVar, view, num, str, str2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e11) {
            me.a aVar = me.a.ERROR;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = str.getClass().getName();
                p013kotlin.jvm.internal.s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                me.b bVarA = companion.a();
                bVarA.b(aVar, "CO." + name, "Failed to convert String to URL: " + e11, null);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object j(Context context, pe.d dVar, String str, String str2, String str3, Continuation<? super s<h0>> continuation) {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f94900p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f94900p = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        i iVar2 = iVar;
        Object objWithContext = iVar2.f94898n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar2.f94900p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.dispatcher;
            j jVar = new j(str, context, dVar, str2, str3, null);
            iVar2.f94900p = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, jVar, iVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(Context context, pe.d dVar, View view, Integer num, String str, String str2, Continuation<? super s<h0>> continuation) {
        k kVar;
        h0 h0Var;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f94910p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f94910p = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f94908n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar2.f94910p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (num != null) {
            canvas.drawColor(num.intValue());
            h0Var = h0.f84049a;
        } else {
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
                h0Var = h0.f84049a;
            } else {
                h0Var = null;
            }
        }
        if (h0Var == null) {
            canvas.drawColor(ht.a.b(context, zs.c.f128599w, androidx.core.content.b.getColor(context, gf.c.f68796a)));
        }
        view.draw(canvas);
        kVar2.f94910p = 1;
        Object objI = i(context, dVar, bitmapCreateBitmap, str, str2, kVar2);
        return objI == coroutine_suspended ? coroutine_suspended : objI;
    }

    public /* synthetic */ c(CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
