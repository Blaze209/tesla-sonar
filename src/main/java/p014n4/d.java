package p014n4;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ln4/d;", "Ln4/m0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ln4/p;", "font", "Landroid/graphics/Typeface;", DateTokenConverter.CONVERTER_KEY, "(Ln4/p;)Landroid/graphics/Typeface;", "a", "(Ln4/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object cacheKey;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {57, 58}, m = "awaitLoad", n = {"this", "font"}, s = {"L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f92899n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f92900o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f92901p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f92903r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f92901p = obj;
            this.f92903r |= Integer.MIN_VALUE;
            return d.this.a(null, this);
        }
    }

    public d(Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p014n4.m0
    public Object a(p pVar, Continuation<? super Typeface> continuation) {
        a aVar;
        d dVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f92903r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f92903r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objD = aVar.f92901p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f92903r;
        if (i12 == 0) {
            t.b(objD);
            if (pVar instanceof b) {
                b bVar = (b) pVar;
                b.a typefaceLoader = bVar.getTypefaceLoader();
                Context context = this.context;
                aVar.f92903r = 1;
                Object objB = typefaceLoader.b(context, bVar, aVar);
                if (objB != coroutine_suspended) {
                    return objB;
                }
            } else {
                if (!(pVar instanceof ResourceFont)) {
                    throw new IllegalArgumentException("Unknown font type: " + pVar);
                }
                Context context2 = this.context;
                aVar.f92899n = this;
                aVar.f92900o = pVar;
                aVar.f92903r = 2;
                objD = e.d((ResourceFont) pVar, context2, aVar);
                if (objD != coroutine_suspended) {
                    dVar = this;
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            t.b(objD);
            return objD;
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pVar = (p) aVar.f92900o;
        dVar = (d) aVar.f92899n;
        t.b(objD);
        return r0.c((Typeface) objD, ((ResourceFont) pVar).getVariationSettings(), dVar.context);
    }

    @Override // p014n4.m0
    /* JADX INFO: renamed from: c, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // p014n4.m0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface b(p font) {
        Object objB;
        Typeface typefaceC;
        if (font instanceof b) {
            b bVar = (b) font;
            return bVar.getTypefaceLoader().a(this.context, bVar);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        z.Companion companion = z.INSTANCE;
        if (z.e(loadingStrategy, companion.b())) {
            typefaceC = e.c((ResourceFont) font, this.context);
        } else {
            if (!z.e(loadingStrategy, companion.c())) {
                if (z.e(loadingStrategy, companion.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) z.g(font.getLoadingStrategy())));
            }
            try {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(e.c((ResourceFont) font, this.context));
            } catch (Throwable th2) {
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            typefaceC = (Typeface) (s.g(objB) ? null : objB);
        }
        return r0.c(typefaceC, ((ResourceFont) font).getVariationSettings(), this.context);
    }
}
